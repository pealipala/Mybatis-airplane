package com.servlet;

import com.service.AirplaneService;
import com.service.impl.AirplaneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAirplaneServlet",urlPatterns = "/showAirplane")
public class ShowAirplaneServlet extends HttpServlet {
    private AirplaneService airplaneService=new AirplaneServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        int takeid=0;
        String takeIdStr=req.getParameter("takeid");
        if (takeIdStr!=null&&!takeIdStr.equals("")){
            takeid= Integer.parseInt(takeIdStr);
        }
        int landid=0;
        String landIdStr=req.getParameter("landid");
        if(landIdStr!=null&&!landIdStr.equals("")){
            landid= Integer.parseInt(landIdStr);
        }
        req.setAttribute("showAirplane",airplaneService.show(takeid,landid));
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

}
