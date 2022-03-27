package com.learning.Servlet_JspTelusko;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*// Since, attribute is object so we can convert easily to integer.
        // We don't have to use Integer.parse() method to convert object to integer
        int k = (int) req.getAttribute("k");
        k = k * k;*/

        /*PrintWriter out = resp.getWriter();
        out.println("Testing request dispatcher, result is:");*/

        /*HttpSession session = req.getSession();
        String projectName = (String) session.getAttribute("projectName");

        session.removeAttribute("k");
        int k;
        PrintWriter out = resp.getWriter();
        if (session.getAttribute("k") != null) {
            k = (int) session.getAttribute("k");
            k = k * k;
            out.println("Testing sendRedirect, result is:" + k + ".\n" + "Project Name is:-" + projectName);
        } else {
            out.println("Attribute \"k\" is removed only project name is available" + ".\n" + "Project Name: " + projectName);
        }*/

        //So when client is sending cookies to Server, its sending lot of cookies,
        // First we have to recieve the cookies
//        int k = 0;
//        Cookie cookies[] = req.getCookies();
//        for( Cookie c : cookies){
//            if( c.getName().equals("k")){
//                k = Integer.parseInt(c.getValue());
//            }
//        }
//        resp.setContentType("text/html");
//        resp.getWriter().println("The sum of two number is integer:" + k);
//
//        //Below line is printing all html element tag as well need to find out how tag won't show on browser page
//        resp.getWriter().println("<html><body><h1> AddServlet created a cokie name \"k\" and we recieved that cookie in SqServlet</h1></body></html>");

        ServletConfig cg = getServletConfig();
        String str = cg.getInitParameter("name");

        resp.getWriter().println(str);
    }
}
