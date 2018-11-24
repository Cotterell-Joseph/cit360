/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mythr
 */
public class Welcome extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        //setting up the response
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        try {
            //since the req and res are included, we can still use the fields
            String user = req.getParameter("user");
            out.println("<h2>" + user + ", you have successfully authenticated.</h2>");
        } finally {
            out.close();
        }
    }

}
