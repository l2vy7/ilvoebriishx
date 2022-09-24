package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.Omid;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4979h;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.e */
public final class C11752e {

    /* renamed from: b */
    private static C11752e f52476b;

    /* renamed from: a */
    private JSONObject f52477a = new JSONObject();

    /* renamed from: com.ironsource.sdk.service.e$a */
    class C11753a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Context f52478b;

        C11753a(Context context) {
            this.f52478b = context;
        }

        public final void run() {
            try {
                C11752e.this.mo45062a(C11747b.m51918a(this.f52478b));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private C11752e() {
    }

    /* renamed from: a */
    public static synchronized C11752e m51930a() {
        C11752e eVar;
        synchronized (C11752e.class) {
            if (f52476b == null) {
                f52476b = new C11752e();
            }
            eVar = f52476b;
        }
        return eVar;
    }

    /* renamed from: b */
    private void m51931b(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo45061a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(C4979h.m22786a(activity)));
            }
            mo45061a("appOrientation", SDKUtils.translateRequestedOrientation(C4979h.m22817n(activity)));
        }
    }

    /* renamed from: c */
    private void m51932c(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String next : map.keySet()) {
            mo45061a(next, SDKUtils.encodeString(map.get(next)));
        }
    }

    /* renamed from: d */
    private static void m51933d() {
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", Omid.getVersion());
        hashMap.put("omidPartnerVersion", "7");
        f52476b.m51932c(hashMap);
    }

    /* renamed from: e */
    private void m51934e(Context context) {
        if (context != null) {
            try {
                new Thread(new C11753a(context)).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private void m51935f(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo45061a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    private static void m51936g() {
        if (IronSourceQaProperties.isInitialized()) {
            f52476b.m51932c(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    /* renamed from: h */
    private void m51937h(Context context) {
        if (context != null) {
            mo45062a(C11747b.m51921c(context));
            mo45062a(C11747b.m51919b(context));
        }
    }

    /* renamed from: a */
    public final String mo45058a(Context context) {
        try {
            return C4952a.C49531.m22729c(mo45063b(context).toString());
        } catch (Exception unused) {
            return C4952a.C49531.m22729c(new JSONObject().toString());
        }
    }

    /* renamed from: a */
    public final void mo45059a(Context context, String str, String str2) {
        m51934e(context);
        if (context instanceof Activity) {
            m51931b((Activity) context);
        }
        m51937h(context);
        mo45060a(str2);
        mo45065b(str);
    }

    /* renamed from: a */
    public final void mo45060a(String str) {
        if (str != null) {
            mo45061a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    /* renamed from: a */
    public final synchronized void mo45061a(String str, Object obj) {
        try {
            this.f52477a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo45062a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo45061a(next, jSONObject.opt(next));
        }
    }

    /* renamed from: b */
    public final JSONObject mo45063b(Context context) {
        mo45064b();
        m51937h(context);
        try {
            return new JSONObject(this.f52477a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public final void mo45064b() {
        m51935f(SDKUtils.getControllerConfig());
        m51932c(SDKUtils.getInitSDKParams());
        m51936g();
        m51933d();
    }

    /* renamed from: b */
    public final void mo45065b(String str) {
        if (str != null) {
            mo45061a("applicationKey", SDKUtils.encodeString(str));
        }
    }
}
