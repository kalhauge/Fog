package web.pages;

import domain.items.CarportFactory;
import infrastructure.Lists;
import web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/bestilling")
public class Bestilling extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            Lists list = new Lists();
            list.carportMeasure();
            list.tag();
            list.shed();

            req.setAttribute("carportMeasure", list.carportMeasure());
            req.setAttribute("tag", list.tag());
            req.setAttribute("shed", list.shed());

            render("Bestilling", "/WEB-INF/webpages/bestilling.jsp", req, resp);
        } catch (ServletException | IOException e) {
            log(e.getMessage());
            resp.sendError(400, e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CarportFactory factory = api.createCarport();




        int bredde = Integer.parseInt(req.getParameter("bredde"));





    }
}
