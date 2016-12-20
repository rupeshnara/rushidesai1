package training.bootstrap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by desair4 on 12/18/2016.
 */
public class UserBootstrap {
    public static final Map<String, String> USER_ID_PASS_REPO_MAP = new HashMap<>();

    static {
        USER_ID_PASS_REPO_MAP.put("rk", "1234");
        USER_ID_PASS_REPO_MAP.put("hk", "1235");
        USER_ID_PASS_REPO_MAP.put("bhumika", "1236");
    }
}