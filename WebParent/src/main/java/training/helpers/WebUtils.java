package training.helpers;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by desair4 on 12/17/2016.
 */
public class WebUtils {

    static Map<String, List<String>> getHeaders(HttpServletRequest request) {
        Enumeration headerNames = request.getHeaderNames();
        Map<String, List<String>> params = new HashMap<>();

        convertToMap(request, headerNames, params);

        return params;
    }


    static Map<String, List<String>> getParamsMap(HttpServletRequest request) {
        Enumeration paramsNames = request.getParameterNames();
        Map<String, List<String>> params = new HashMap<>();

        convertToMap(request, paramsNames, params);

        return params;
    }

    private static void convertToMap(HttpServletRequest request, Enumeration headerNames, Map<String, List<String>> params) {
        while (headerNames.hasMoreElements()) {
            String paramName = (String) headerNames.nextElement();
            String[] paramValuesTemp = request.getParameterValues(paramName);
            List<String> paramValues = new ArrayList<>(Arrays.asList(paramValuesTemp));
            params.put(paramName, paramValues);
        }
    }
}
