/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mythr
 */
public class Validator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        //setting up the response
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        try {
            //this pulls in the data passed from the post
            //the getParameter matches the name field in the html input
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
            
            //test the pass field and do something
            if(pass.equals("SecurePassword")) {
                //the evaluation is successful, so we pass to the Welcome servlet
                RequestDispatcher rd = req.getRequestDispatcher("Welcome");
                rd.forward(req, res);
            } else {
                //the evaluation failed, so we return to the index, but include
                //a message to the user that they entered incorrect information
                out.println("<font color='red'><b>" + user+ ", you have entered an incorrect"
                        + " password, please try again.</b></font>");
                RequestDispatcher rd = req.getRequestDispatcher("index.html");
                rd.include(req, res);
            }
            
        } finally {
            out.close();
        }
    }

}