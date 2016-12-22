package servlet;

import child.SavingsAccount;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by desair4 on 12/14/2016.
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    //    static final List<SavingsAccount> list = new ArrayList<>();
    private static final Map<Integer, SavingsAccount> SAVINGS_ACCOUNT_MAP = new HashMap<>();

    //static initializer
    static {
        SAVINGS_ACCOUNT_MAP.put(12345, new SavingsAccount(122, 12345));
        SAVINGS_ACCOUNT_MAP.put(12346, new SavingsAccount(123, 12346));
        SAVINGS_ACCOUNT_MAP.put(12347, new SavingsAccount(124, 12347));
        SAVINGS_ACCOUNT_MAP.put(12348, new SavingsAccount(125, 12348));
        SAVINGS_ACCOUNT_MAP.put(12349, new SavingsAccount(126, 12349));
    }

    /*
    * 1. Any problem in IT can be solved by introducing one more layer !!
    * 2. Make it work, make it better
    * */

    /*
    * Scripting Element	    Example
    * Comment	            <%-- comment --%>
    * Directive	            <%@ directive %>
    * Declaration	        <%! declarations %>
    * Scriptlet	            <% scriplets %>     //used to write any java code
    * Expression	        <%= expression %>   //one line expression
    *
    * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        * If I want to retrieve data for specific account and return details of that
        * 1. From browser i need to pass some information (in this case AccountNumber)
        * 2. I need retrieve accountNumber here
        * 3. Use that accountNumber to fetch data from database //Will not look at this step today
        * 4. Send the information (data/model) to JSP
        * 5. JSP should be able to retrieve the model and show it.
        *
        * */
        String accountNumber = req.getParameter("accountNumber");
        System.out.println(accountNumber);

        //create a class with a function to accept this accountNumber and make db call and get data

        //iterate though the list and for each account check if the accountNumber passed is equal to currentAccountNumber
        SavingsAccount savingsAccount = SAVINGS_ACCOUNT_MAP.get(Integer.parseInt(accountNumber));
        /*for (SavingsAccount savingsAccountTemp : SAVINGS_ACCOUNT_MAP){
            if(savingsAccountTemp.getAccountNumber() == Integer.parseInt(accountNumber)){
                savingsAccount = savingsAccountTemp;
                break;
            }
        }*/

        req.setAttribute("account", savingsAccount);
//        SavingsAccount savingsAccount = list.get(1);

        LocalDateTime timePoint = LocalDateTime.now();
        req.setAttribute("currentTimestamp", timePoint);

        req.setAttribute("savingsAccountList", SAVINGS_ACCOUNT_MAP);

        req.setAttribute("isHello", true);

        ServletContext sc = getServletConfig().getServletContext();
//        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/html/hello.html");
        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/jsp/dynamicHello.jsp");
        rd.forward(req, resp);
    }
}


/*
*
* sourceCode  -> compiled and ackaged into war -> deployed on server
* classPath 	->  compile 					 -> the classPath here could be different than what it was at sourceCode
*
*
* Changes to maven is known by IDE
* changes to ide are not known by maven
*
* */
