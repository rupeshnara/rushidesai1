package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by desair4 on 12/16/2016.
 */
@WebServlet("/jspTest")
public class JspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = getServletConfig().getServletContext();
//        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/html/hello.html");
        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/jsp/dynamicHello.jsp");

        System.out.println(req.getContextPath());
        Enumeration<String> headerEnums = req.getHeaderNames();
        while (headerEnums.hasMoreElements()) {
            String name = headerEnums.nextElement();
            System.out.println(name + ":" + req.getHeader(name));
        }
        rd.forward(req, resp);
    }
}