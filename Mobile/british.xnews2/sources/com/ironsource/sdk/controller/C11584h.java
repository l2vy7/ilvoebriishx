package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C11618w;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.h */
final class C11584h {

    /* renamed from: c */
    private static final String f52031c = "com.ironsource.sdk.controller.h";

    /* renamed from: a */
    private final C11556d f52032a;

    /* renamed from: b */
    private final C11614t f52033b;

    C11584h(C11556d dVar, C11614t tVar) {
        this.f52032a = dVar;
        this.f52033b = tVar;
    }

    /* renamed from: a */
    private static String m51500a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f52031c;
            Logger.m51953i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f52033b.mo44777b(str, str2, str3)) {
                this.f52032a.mo44692a(str, str2);
                return;
            }
            C11556d dVar = this.f52032a;
            String a = m51500a(str, str2, str3);
            C11618w.C11622d dVar2 = dVar.f51939a;
            if (dVar2 != null) {
                C11618w.this.mo44787b(C11618w.m51644x("unauthorizedMessage", a, (String) null, (String) null));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str5 = f52031c;
            Logger.m51953i(str5, "messageHandler failed with exception " + e.getMessage());
        }
    }
}
