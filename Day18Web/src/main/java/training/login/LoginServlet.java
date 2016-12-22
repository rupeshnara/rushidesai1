package training.login;


import training.login.authentication.AuthenticateUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by desair4 on 12/18/2016.
 */
@WebServlet("/login/*")
public class LoginServlet extends HttpServlet {

    /*
    * 1. The user will be first shown a login page if he is not authenticated
    * 2. When user fills data i.e. user id password, and sends that information we should authenticate and show him 'Account Search' page
    *
    * 1.
    *    Is the http request that is coming in, is authenticated for a specific user or not.
    *
    *    Session Management : 1. Url rewriting
    *                         2. Cookies
    *  Browser will save some information on the user's laptop and if you set a Cookie, then browser will make sure it sends that cookie everytime it makes a call.
    *  If we set a cookie -> In all next subsequent requests browser will send that cookie to server
    *
    *  Browser sends cookies with each request it makes to the server
    *
    *  localHost -> isAuthenticated=true
    *  google   -> DV=23234343434345454
    *
    *
    *
    * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Both of these cookies is being set by localHost:8080 domain

        /*System.out.println("LoginServlet");
        Cookie cookie = new Cookie("isAuthenticated","true");
        resp.addCookie(cookie);

        Cookie cookie1 = new Cookie("testingDomain","localHost");
        cookie.setDomain("google.com");
        resp.addCookie(cookie1);

        Cookie cookie2 = new Cookie("testingDomain1","localHost.subdomain");
        cookie.setDomain("localHost.subdomain");
        resp.addCookie(cookie2);*/
        ServletContext sc = getServletConfig().getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/html/login/login.html");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet");
        String pathInfo = req.getPathInfo();

        if (pathInfo.equals("/login1")) System.out.println("login1");    //will print login1 if url is /login/login1
        if (pathInfo.equals("/login2")) System.out.println("login2");    //will print login1 if url is /login/login1

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        ServletContext sc = getServletConfig().getServletContext();
        RequestDispatcher rd = null;
        boolean isAuthenticated = AuthenticateUser.authenticateUser(userName, password);
        if (isAuthenticated) {
            //if authentication successful
//            rd = sc.getRequestDispatcher("/WEB-INF/views/html/account/AccountSearch.html");   //we are straight going to a specific page
//            rd = sc.getRequestDispatcher("/accountSearch");   //we are straight going to a specific page
            resp.sendRedirect("/accountSearch");    //going back to the browser and telling browser to go to "/accountSearch"
        } else {
            //if authentication failure
            rd = sc.getRequestDispatcher("/WEB-INF/views/html/login/loginFailure.html");
            rd.forward(req, resp);
        }
    }
}