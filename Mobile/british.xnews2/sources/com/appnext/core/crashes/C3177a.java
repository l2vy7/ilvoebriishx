package com.appnext.core.crashes;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.core.C3198g;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.appnext.core.crashes.a */
public final class C3177a {

    /* renamed from: aM */
    private Context f12290aM;

    /* renamed from: eB */
    private String f12291eB = null;

    /* renamed from: eC */
    private String f12292eC = null;

    public C3177a(Context context, String str, String str2) {
        this.f12290aM = context;
        this.f12291eB = str;
        this.f12292eC = str2;
    }

    /* renamed from: aE */
    public final void mo10766aE() {
        try {
            if (TextUtils.isEmpty(this.f12291eB)) {
                return;
            }
            if (!TextUtils.isEmpty(this.f12292eC)) {
                JSONObject jSONObject = new JSONObject();
                Context context = this.f12290aM;
                if (context != null) {
                    jSONObject.put("did", C3198g.m10787b(context, false));
                }
                jSONObject.put("api_Call", this.f12291eB);
                jSONObject.put("ex", this.f12292eC);
                jSONObject.put("ver", "2.6.5.473");
                HashMap hashMap = new HashMap();
                hashMap.put("data", jSONObject.toString());
                C3198g.m10778a(this.f12290aM, "https://global.appnext.com/AdminService.asmx/ex?data=", (HashMap<String, String>) hashMap, false, 10000);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
