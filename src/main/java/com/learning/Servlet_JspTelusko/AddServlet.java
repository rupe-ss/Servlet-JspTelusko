package com.learning.Servlet_JspTelusko;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        String projectName = "Session Topic";
        int k = i + j;

      /*PrintWriter out = resp.getWriter();
      out.println("Result is now:" + k);
      resp.getWriter().println("Result is :" + k);*/

        /*//We have to set attribute, so that we can send some value to another servlet. We can do that by setting attribute.
        req.setAttribute("k", k);
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, resp);*/

        /*//We are managing with URL Redirect
        resp.sendRedirect("sq");
        //We can send data as well
        resp.sendRedirect("sq?k="+9);*/

        /*//Using session to store data so we can use in another Servlet
        HttpSession session = req.getSession();
        session.setAttribute("k", k);
        session.setAttribute("projectName", projectName);
        //When you redirect it will send to different path, here path will be "localhost:8080/sq"
        resp.sendRedirect("sq");*/

        //Using cookies to store data so we can send back to browser and from there it will be send to another Servlet
        //Below k is integer so we are changing integer to string by attaching empty string to it.
        /*Cookie cookie = new Cookie("k", k + "");
        resp.addCookie(cookie);
        resp.sendRedirect("sq");*/

        ServletContext context = getServletContext();
        String cxt = context.getInitParameter("globalVariable");

        ServletConfig config = getServletConfig();
        String cfg = config.getInitParameter("globalVariable");


        resp.getWriter().println("<h1>" +cxt +"</h1>");
        resp.getWriter().println("<h1>" +cfg +"</h1>");
    }

}