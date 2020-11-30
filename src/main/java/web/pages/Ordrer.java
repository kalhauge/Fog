package web.pages;

import domain.items.Carport;
import domain.items.DBException;
import domain.items.Order;
import domain.items.Shed;
import web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ordrer")
public class Ordrer extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Order> orders = api.findAllOrders();
        List<String>navne=new ArrayList<>();
        List<Integer> carportBredder=new ArrayList<>();
        List<Integer> carportLaengder=new ArrayList<>();
        List<Integer> skurBredder=new ArrayList<>();
        List<Integer> skurLaengder=new ArrayList<>();

        for (Order o:orders) {
            String navn=api.findKunde(o.getKundeId()).getName();navne.add(navn);
            try {
                Carport c=api.findcarport(o.getCarportId());
                carportBredder.add(c.getWidth());
                carportLaengder.add(c.getLenght());
                Shed s=api.findShed(c.getShedId());
                if (s!=null) {
                    skurBredder.add(s.getWidht());
                    skurLaengder.add(s.getLenght());
                }else{
                    skurBredder.add(0);
                    skurLaengder.add(0);
                }



            } catch (DBException e) {
                e.printStackTrace();
            }


        }
        req.setAttribute("carportbredder",carportBredder);
        req.setAttribute("carportlaengder",carportLaengder);
        req.setAttribute("skurbredder",skurBredder);
        req.setAttribute("skurlaengder",skurLaengder);
        req.setAttribute("Orders", orders);
        req.setAttribute("navne",navne);
        try {
            render("Start", "/WEB-INF/webpages/ordrer.jsp", req, resp);
        } catch (ServletException | IOException  e){
            log(e.getMessage());
            resp.sendError(400, e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
