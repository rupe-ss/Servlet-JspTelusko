package com.learning.Servlet_JspTelusko;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {

    public void service(ServletRequest req, ServletResponse res) {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

        System.out.println(k);
    }
}