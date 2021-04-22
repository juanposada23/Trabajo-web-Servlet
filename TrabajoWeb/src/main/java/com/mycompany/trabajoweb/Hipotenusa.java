package com.mycompany.trabajoweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hipotenusa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
          
        response.setContentType("text/html;charset=UTF-8");
        
        float a = Float.parseFloat(request.getParameter("c1"));
        float b = Float.parseFloat(request.getParameter("c2"));
        
        double h = Math.sqrt(((Math.pow(a, 2))+(Math.pow(b,2))));
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Hipotenusa</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hipotenusa</h1>");
        out.println("<p> la longitud de la hipotenusa es = "+ h+"</p>");
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
