package training.account;

import bank.BaseAccount;
import training.authentication.ValidateUser;
import training.services.AccountService;

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
@WebServlet("/account/*")
public class AccountSearchServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("AccountSearch");
        ServletContext sc = getServletConfig().getServletContext();
        boolean isAuth = ValidateUser.validateUser(req);
        if (!isAuth) {
            resp.sendRedirect("/login/loginFailure");   //GET
            return;
        }

        RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/html/account/AccountSearch.html");   //we are straight going to a specific page
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("AccountSearch");
        ServletContext sc = getServletConfig().getServletContext();
        boolean isAuth = ValidateUser.validateUser(req);
        if (!isAuth) {
            resp.sendRedirect("/WEB-INF/views/html/login/loginFailure.html");
            return;
        }

        String pathInfo = req.getPathInfo();
        if (pathInfo.equals("/getAccountDetails")) {
            //search the account and get details and send details back
            Object accountNumber1 = req.getParameter("accountNumber");
            Integer accountNumber = Integer.parseInt((String) accountNumber1);
            BaseAccount account = AccountService.searchAccount(accountNumber);

            req.setAttribute("accountResult", account);

            RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/views/jsp/account/accountDisplay.jsp");   //we are straight going to a specific page
            rd.forward(req, resp);

        }
        System.out.println(pathInfo);
    }
}
