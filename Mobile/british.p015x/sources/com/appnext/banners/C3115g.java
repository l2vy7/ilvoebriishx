package com.appnext.banners;

import com.appnext.base.C3117a;
import java.util.Random;
import org.json.JSONArray;

/* renamed from: com.appnext.banners.g */
public final class C3115g {
    /* renamed from: a */
    public static String m10549a(String str) {
        if (str == null) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int nextInt = new Random(System.nanoTime()).nextInt(100);
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                i += jSONArray.getJSONObject(i2).getInt(TtmlNode.TAG_P);
                if (nextInt < i) {
                    return jSONArray.getJSONObject(i2).getString(TtmlNode.ATTR_ID);
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("TemplateRandomizer$getTemplate", th);
        }
        return "";
    }
}
