
package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
                
            
            //CREAMO LOS JAVABEANS
            Rectangulo rec = new Rectangulo(3,6);
            
            //Agregamos el javabean a algun alcance
            request.setAttribute("mensaje","saludos desde el servlet");
            
            HttpSession session = request.getSession();
            session.setAttribute("rectangulo", rec);
            
            //redireccionar a la vista seleccionada
            RequestDispatcher rd = request.getRequestDispatcher("vista/deplegarVariables.jsp");
            rd.forward(request, response);
        }
}
