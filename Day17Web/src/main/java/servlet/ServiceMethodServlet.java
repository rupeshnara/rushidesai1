package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by desair4 on 12/16/2016.
 */
@WebServlet("/serviceTest")
public class ServiceMethodServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        System.out.println("in init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(req.getMethod());

        if (req.getMethod().equals("GET")) {
            System.out.println("This is get method");
        }


        System.out.println("in service method");
        LocalDateTime timePoint = LocalDateTime.now();

        ServletOutputStream out = resp.getOutputStream();
//        PrintWriter pw = resp.getWriter();

        out.print("<html><head><title>My Servlet</title>");
//        pw.print("<html><head><title>My Servlet</title>");
        out.print("</head><body><h1>");
        out.print("Welcome ");
        out.print(timePoint.toString());    //this could be coming from database
        out.print("</h1></body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in do get");
    }
}
