package training.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by desair4 on 12/18/2016.
 */
@WebServlet("/testCookie")
public class CookieTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            System.out.println(cookie.getName() + "=" + cookie.getValue());
        }


    }
}