/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 578291
 */
public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        String message;
        try
            {
            if(!age.equals(""))
            {
                int actualAge = Integer.parseInt(age);
                actualAge++;
                message = ("Your age on your next birthday is " + actualAge);

            }
            else
            {
                message = "You must enter your birthday!";
            }

            request.setAttribute("yourage", message);
        }
        catch(Exception e)
        {
            message = "You must enter a number";
            request.setAttribute("yourage", message);
            request.setAttribute("incorrect", age);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }


}
