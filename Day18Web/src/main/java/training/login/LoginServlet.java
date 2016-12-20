package training.login;


import training.login.authentication.AuthenticateUser;
import training.session.SessionBootstrap;
import training.session.domain.UserSession;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Random;

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
        String pathInfo = req.getPathInfo();

        ServletContext sc = getServletConfig().getServletContext();
        if (pathInfo != null && pathInfo.equals("/loginFailure")) {
            RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/html/login/loginFailure.html");
            rd.forward(req, resp);
        }


        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/html/login/login.html");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet");

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        ServletContext sc = getServletConfig().getServletContext();
        boolean isAuthenticated = AuthenticateUser.authenticateUserWithUserNamePassword(userName, password);
        if (isAuthenticated) {
            //if authentication successful

            //------------Manual way to track session--------------------
            UserSession userObject = new UserSession(userName);     //Step1 : Create session  object that will be specific to this user
            Integer sessionID = generateSessionId();                //Step2 : Generate sessionID that will serve like a token that user needs to bring back to server every-time user makes a call to server
            SessionBootstrap.SESSION_MAP.put(sessionID, userObject); //Step3 : attach the sessionId with userSession object so that next time a request comes with this sessionId we can retrieve the userSession object specific to this user.
            addSessionCookie(resp, sessionID);                      //Step4 : add cookie so that user does not have to worry about bringing the sessionId back every-time he makes the request. Since it is a cookie, browser will make sure to send it everytime a call is made to this server
            //------------End Manual way to track session--------------------

            //------------Better and Automatic way to track session---------------------
            //JEE already does all the we did earlier automatically
            HttpSession session = req.getSession(); //If session already exists then this will return that session else This will do all 4 steps mentioned in manual way (i.e. Create new session Object, create sessionId, create Cookie) and return the session object.
            session.setAttribute("isAuthenticated", true);  //we do this to make sure future requests know that this user is authenticated
            //------------End Automatic way to track session---------------------

            resp.sendRedirect("/account/accountSearch");    //going back to the browser and telling browser to go to "/accountSearch"
        } else {
            //if authentication failure
            RequestDispatcher rd = null;
            rd = sc.getRequestDispatcher("/WEB-INF/views/html/login/loginFailure.html");
            rd.forward(req, resp);
        }
    }

    private void addSessionCookie(HttpServletResponse resp, Integer sessionID) {
        Cookie cookie = new Cookie("sessionID", sessionID.toString());
        resp.addCookie(cookie);
    }

    private Integer generateSessionId() {
        Random random = new Random();
        return random.nextInt();
    }
}