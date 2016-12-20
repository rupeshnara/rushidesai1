package training.session;

import training.session.domain.UserSession;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by desair4 on 12/20/2016.
 */
public class SessionBootstrap {
    public static final Map<Integer, UserSession> SESSION_MAP;

    static {
        SESSION_MAP = new HashMap<>();
    }
}
