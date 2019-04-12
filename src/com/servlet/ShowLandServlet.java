package com.servlet;

import com.service.AirportService;
import com.service.impl.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowLandServlet",urlPatterns = "/showLand")
public class ShowLandServlet extends HttpServlet {
    private AirportService airportService=new AirportServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        req.setAttribute("landPort", airportService.showLandPort());
        req.getRequestDispatcher("/showAirplane").forward(req, resp);
        return;
    }
}
