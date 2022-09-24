package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qt1 {
    /* renamed from: a */
    public static String m36735a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str2)) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (m36736b(optJSONArray2, str) && !m36736b(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    /* renamed from: b */
    private static boolean m36736b(JSONArray jSONArray, String str) {
        Pattern pattern;
        if (!(jSONArray == null || str == null)) {
            int i = 0;
            while (i < jSONArray.length()) {
                String optString = jSONArray.optString(i);
                try {
                    if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37191q7)).booleanValue()) {
                        pattern = Pattern.compile(optString, 2);
                    } else {
                        pattern = Pattern.compile(optString);
                    }
                    if (pattern.matcher(str).lookingAt()) {
                        return true;
                    }
                    i++;
                } catch (PatternSyntaxException e) {
                    zzt.zzo().mo18592s(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
