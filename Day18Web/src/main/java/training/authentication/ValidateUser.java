package training.authentication;

import training.session.SessionBootstrap;
import training.session.domain.UserSession;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by desair4 on 12/19/2016.
 */
public class ValidateUser {
    public static boolean validateUser(HttpServletRequest req) {
        HttpSession session = req.getSession();

        if (session != null) {
            Object isAuthenticated = session.getAttribute("isAuthenticated");
            if (isAuthenticated != null) {
                return (Boolean) isAuthenticated;
            }
        }
        return false;
    }

    public static boolean validateUserManual(HttpServletRequest req) {
        Cookie[] cookies = req.getCookies();
        //iterate through cookies find if there is a
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            if (cookie.getName().equals("sessionID")) {
                Integer sesionID = Integer.parseInt(cookie.getValue());
                //Check if this session is valid or not.
                UserSession session = SessionBootstrap.SESSION_MAP.get(sesionID);
                if (session != null) {
                    //then user is validated
                    if (cookie.getValue().equals("true")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}