package com.servlet;

import com.service.AirportService;
import com.service.impl.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowTakeServlet",urlPatterns = "/showtake")
public class ShowTakeServlet extends HttpServlet {
    private AirportService airportService=new AirportServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        req.setAttribute("takePort",airportService.showTakePort());
        req.getRequestDispatcher("/showLand").forward(req,resp);
        return;

    }

}
