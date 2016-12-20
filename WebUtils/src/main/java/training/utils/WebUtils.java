package training.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by desair4 on 12/20/2016.
 */
public class WebUtils {

    Map<String, List<String>> getParamMap(HttpServletRequest request) {
        Map<String, String[]> pMap = request.getParameterMap();
        Map<String, List<String>> map = new HashMap<>();

        for (String key : pMap.keySet()) {
            String[] vals = pMap.get(key);
            List<String> list = new ArrayList<>();

            for (int i = 0; i < vals.length; i++) {
                list.add(vals[i]);
            }
            map.put(key, list);
        }

        return map;
    }

    Map<String, Cookie> getCookiesMap(HttpServletRequest request) {
        Map<String, Cookie> cookieMap = new HashMap<>();
        Cookie[] cookies = request.getCookies();

        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            cookieMap.put(cookie.getName(), cookie);
        }

        return cookieMap;
    }
}
