package com.mycompany.trabajoweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alejo01
 */
public class ContadorVisita extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession();
        
        if(sesion.isNew()){
            sesion.setAttribute("contador", 0);
        }
        
        int contador = (int) sesion.getAttribute("contador");
        contador++;
        
      
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Contador de visitas</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Numero de visitas a la pagina = "+contador+"</h1>");
        out.println("</body>");
        out.println("</html>");
        
        sesion.setAttribute("contador",contador);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
