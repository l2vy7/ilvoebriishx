package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.ironsource.environment.C4979h;
import com.ironsource.mediationsdk.C11412m;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.c */
public final class C11748c {

    /* renamed from: a */
    private C11412m f52472a = new C11412m();

    /* renamed from: a */
    public final void mo45053a() {
        HashMap hashMap = new HashMap();
        hashMap.put("omv", Omid.getVersion());
        hashMap.put("ompv", "7");
        C11412m.m51070a(hashMap);
    }

    /* renamed from: a */
    public final void mo45054a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                C11412m.m51068a("imm", (Object) Boolean.valueOf(C4979h.m22786a(activity)));
            }
        }
    }

    /* renamed from: b */
    public final void mo45055b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (!TextUtils.isEmpty(controllerConfig)) {
            try {
                C11412m.m51068a("cncdn", new JSONObject(controllerConfig).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo45056b(Context context) {
        C11412m.m51068a("gpi", (Object) Boolean.valueOf(C11749d.m51928a(context)));
    }

    /* renamed from: c */
    public final void mo45057c() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            C11412m.m51069a("debug", jSONObject);
        }
    }
}
