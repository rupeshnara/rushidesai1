package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Enumeration;

/**
 * Created by desair4 on 12/14/2016.
 */
public class HelloWorldServlet extends HttpServlet {

    /*
    * Life cycle of servlet
    *
    * 1. init method
    *
    * 2. service method
    *
    *   OR
    *
    * 3. doGet, doPost etc.. is called depending upon http Method type
    *
    * */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    /*
        * www.localhost:8084/application1/servletUrl?a=b
        *
        * www.localhost:8084 = address of your computer   -> Mandatory
        * /applicationUrl -> optional
        * /servletUrl -> mandatory (kinda optional)
        *
        * */
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

        //we access database, query and get account information, extract needed data for UI, and send that data to UI (Model)
        //Servlet makes backend calls, gathers data and prepares the model for UI
        //Then inside UI we will access model and show it.

        ServletContext sc = getServletConfig().getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/html/hello.html");
//        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/jsp/dynamicHello.jsp");

        LocalDateTime timePoint = LocalDateTime.now();
        req.setAttribute("currentTimestamp", timePoint);
        rd.forward(req, resp);
    }

    /*
    * So with servlet rendering html response the downsides are :
    * 1. No separation of concerns.
    * 2. Also, we are writing html inside java. Terrible for web developers/ UI/UX guys.
    *
    * Solution to this was Jsp
    * 1. Think of them as view component.
    * 2. We are writing java inside html.
    *
    * Jsp life cycle:
    *
    * 1. Jsp are actually processed, compiled to servlets.
    * 2. When request comes, this servlet ouputs html. While doing so, it ignores any html tags.
    * 3. Jsp ; This is known as server side scripting.
     *
     * Difference between how html files are rendered and jsp files are rendered.
     *
     * Html : User asks for a file -> Server locates it, and gives it to user
     * Jsp : Server tells the application which jsp file is needed, application locates it,
     *      application then gives it to Jsp processing engine (Library which processes Jsp), then it spits out html and that html is renderd to user.
    * */

    /*
    * New topic !!
    * State management
    * 1. How to remember user across requests.
    *       a. Http is a stateless protocol.
    *
    * We need some way to have a session with user -> Session will contain all data for that user. We need to track this session somehow.
    *
    * Problem statement :
    * How do we track user and what he puts in his cart?
    *
    * Ideas :
    * 1. Everytime user makes a request -> send all data to server -> server updates some of it and sends all data back to user.
    *       Pros: Nothing to remember on server side.   (REST : Scalability)
    *       Cons : 1. Responsiblity on client to send data.
    *              2. Amount of data transfer over network could be huge. This could be costly for user (say user is using his data plan from mobile), if network on which user is slow, your website will be really slow.
    *
    *
    * 2. When I return the response -> I put something in the response, that then can be echoed back from the browser that will tell server who is the user.
    *      Pros : Server has minimal work. It just needs to keep track of token->User mapping.
    *      Cons : We are dependent on the user to bring the token back.
    *
    *      Most of the data is held by server, transfering only whats needed.
    *
    *
    * */

}
