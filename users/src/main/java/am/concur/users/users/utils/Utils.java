package am.concur.users.users.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Base64;

public class Utils {


    public static String decodeAndExtractSubValueFromToken(String token) throws JSONException {
        String subValue = null;
        if(token != null) {
            String[] parts = token.split("\\.");
            JSONObject payload = new JSONObject(new String(Base64.getUrlDecoder().decode((parts[1]))));
            if (payload != null) {
                subValue = payload.get("sub").toString();
            }
        }
        return subValue;
    }
}
