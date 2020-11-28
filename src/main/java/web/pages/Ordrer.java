package web.pages;

import web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ordrer")
public class Ordrer extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Orders", api.findAllOrders());

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