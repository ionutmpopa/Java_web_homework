package ro.sci.servlet;

import model.CalculateAge;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculateAgeServlet extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CalculateAge calculateAge = new CalculateAge();

        long myDate = calculateAge.calculateAge();

        resp.getWriter().println("I am " + myDate + " days old!");

    }
}
