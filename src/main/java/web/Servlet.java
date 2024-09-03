/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author SUA
 */
@WebServlet("/Servlet") //Aqui se le asigna con que va a recibir la peticion en este caso con la palabra Servlet
public class Servlet extends HttpServlet { //Se extiende de la clase Servlet

    //Se sobreescirbe el metodo doPost ya que es el que envia el formualrio del index.html
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Leer los paramatreo del formulario html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        System.out.println("usuario = " + password);
        System.out.println("password = " + password);

        //Se responde con la informacion al cliente
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();

    }
}
