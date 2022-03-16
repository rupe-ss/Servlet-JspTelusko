package com.learning.Servlet_JspTelusko;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Since, attribute is object so we can convert easily to integer.
        // We don't have to use Integer.parse() method to convert object to integer
//        int k = (int) req.getAttribute("k");
//        k = k * k;

//        PrintWriter out = resp.getWriter();
//        out.println("Testing request dispatcher, result is:");

        HttpSession session = req.getSession();
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
        }
    }
}
