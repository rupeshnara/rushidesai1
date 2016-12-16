package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by desair4 on 12/14/2016.
 */
public class HelloWorld extends HttpServlet {

    /*
    * How we keep our source code in development is not how we deploy on server
    *
    * Packaging/Artifact
    *
    * Deployment packaging is different -> JEE also dictates how should you package your application.
    * It needs standardise packaging so that each different server knows where to find what.
    *
    * WAR -> Basic unit to deploy web appliction on server. Collection of classes and html, css, js files
    * EAR -> Collcetion of wars
    *
    * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet called....");

        //Day15WebSolution
    }
}
