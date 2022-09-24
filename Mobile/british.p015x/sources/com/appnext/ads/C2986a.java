package com.appnext.ads;

import android.text.TextUtils;
import com.appnext.base.C3117a;
import java.util.Random;
import org.json.JSONArray;

/* renamed from: com.appnext.ads.a */
public final class C2986a {
    /* renamed from: a */
    public static String m10350a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONArray jSONArray = new JSONArray(str);
            int nextInt = new Random(System.nanoTime()).nextInt(100);
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                i += jSONArray.getJSONObject(i2).getInt(TtmlNode.TAG_P);
                if (nextInt < i) {
                    return jSONArray.getJSONObject(i2).getString(TtmlNode.ATTR_ID);
                }
            }
            return "";
        } catch (Throwable th) {
            C3117a.m10553a("TemplateRandomizer$getTemplate", th);
            return "";
        }
    }
}
