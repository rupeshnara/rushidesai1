package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by desair4 on 12/14/2016.
 */
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration params = req.getParameterNames();
        String paramName = null;
        String[] paramValues = null;

        while (params.hasMoreElements()) {
            paramName = (String) params.nextElement();
            paramValues = req.getParameterValues(paramName);
            System.out.print("\nParameter name is " + paramName);
            for (int i = 0; i < paramValues.length; i++) {
                System.out.println(", value " + i + " is " + paramValues[i].toString());
            }
        }

     /*   ServletOutputStream out = resp.getOutputStream();
        out.print("<html><head><title>My Servlet</title>");
        out.print("</head><body><h1>");
        out.print("Welcome");
        out.print("</h1></body></html>");*/

        ServletContext sc = getServletConfig().getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/views/html/hello.html");
        rd.forward(req, resp);
    }


}
