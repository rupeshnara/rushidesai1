package training.login.authentication;

import training.bootstrap.UserBootstrap;

/**
 * Created by desair4 on 12/18/2016.
 */
public class AuthenticateUser {

    public static boolean authenticateUser(String userName, String password) {
        String password1 = UserBootstrap.USER_ID_PASS_REPO_MAP.get(userName);

        if (password1 == null) return false;

        return password1.equals(password);
    }

}
