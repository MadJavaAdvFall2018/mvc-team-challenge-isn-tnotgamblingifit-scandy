package java112.project3;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author Michael, Dan, and Elspeth
 */
@WebServlet(
    name = "leftCenterRight",
    urlPatterns = { "/lcr" }
)
public class LeftCenterRightServlet extends HttpServlet {
    // instance variables
    DiceEngine engine = new DiceEngine();

    /**
     * Handles HTTP GET Requests
     *
     * @param request HttpServletRequest object
     * @param response HttpServletResponse object
     * @exception ServletException if a Servlet failure occurs
     * @exception IOException if an IO failure occurs
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

            request.setAttribute("engine", engine);

            String url = "/mainPage.jsp";

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
    }
    /**
     * Handles HTTP GET Requests
     *
     * @param request HttpServletRequest object
     * @param response HttpServletResponse object
     * @exception ServletException if a Servlet failure occurs
     * @exception IOException if an IO failure occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

            engine.run();

            request.setAttribute("engine", engine);

            String url = "/mainPage.jsp";

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

}
