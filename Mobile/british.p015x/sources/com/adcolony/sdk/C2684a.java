package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.adcolony.sdk.C2978z;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.a */
class C2684a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static Context f10583a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C2794i f10584b;

    /* renamed from: c */
    static boolean f10585c;

    /* renamed from: d */
    static boolean f10586d;

    /* renamed from: com.adcolony.sdk.a$a */
    static class C2685a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f10587a;

        C2685a(Context context) {
            this.f10587a = context;
        }

        public void run() {
            C2684a.f10584b.mo9707a(this.f10587a, (C2714c0) null);
        }
    }

    C2684a() {
    }

    /* renamed from: b */
    static Context m9407b() {
        return f10583a;
    }

    /* renamed from: c */
    static C2794i m9409c() {
        if (!m9411e()) {
            Context b = m9407b();
            if (b == null) {
                return new C2794i();
            }
            f10584b = new C2794i();
            JSONObject c = C2976x.m10328c(b.getFilesDir().getAbsolutePath() + "/adc3/AppInfo");
            JSONArray b2 = C2976x.m10318b(c, "zoneIds");
            f10584b.mo9701a(new AdColonyAppOptions().mo9410a(C2976x.m10337i(c, "appId")).mo9411a(C2976x.m10317a(b2)), false);
        }
        return f10584b;
    }

    /* renamed from: d */
    static boolean m9410d() {
        return f10583a != null;
    }

    /* renamed from: e */
    static boolean m9411e() {
        return f10584b != null;
    }

    /* renamed from: f */
    static boolean m9412f() {
        return f10585c;
    }

    /* renamed from: g */
    static void m9413g() {
        m9409c().mo9729p().mo9653e();
    }

    /* renamed from: a */
    static void m9404a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z) {
        m9403a(context);
        f10586d = true;
        if (f10584b == null) {
            f10584b = new C2794i();
            adColonyAppOptions.mo9414b(context);
            f10584b.mo9701a(adColonyAppOptions, z);
        } else {
            adColonyAppOptions.mo9414b(context);
            f10584b.mo9700a(adColonyAppOptions);
        }
        try {
            C2916s0.f11754b.execute(new C2685a(context));
        } catch (RejectedExecutionException e) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            aVar.mo10088a("ADC.configure queryAdvertisingId failed with error: " + e.toString()).mo10090a(C2978z.f11950j);
        }
        new C2978z.C2979a().mo10088a("Configuring AdColony").mo10090a(C2978z.f11945e);
        f10584b.mo9713c(false);
        f10584b.mo9736w().mo9888d(true);
        f10584b.mo9736w().mo9890e(true);
        f10584b.mo9736w().mo9893g(false);
        f10584b.mo9716d(true);
        f10584b.mo9736w().mo9887c(false);
    }

    /* renamed from: b */
    static void m9408b(String str, C2750e0 e0Var) {
        m9409c().mo9729p().mo9650b(str, e0Var);
    }

    /* renamed from: a */
    static void m9403a(Context context) {
        f10583a = context;
    }

    /* renamed from: a */
    static void m9405a(String str, C2750e0 e0Var) {
        m9409c().mo9729p().mo9646a(str, e0Var);
    }

    /* renamed from: a */
    static C2750e0 m9401a(String str, C2750e0 e0Var, boolean z) {
        m9409c().mo9729p().mo9646a(str, e0Var);
        return e0Var;
    }

    /* renamed from: a */
    static void m9406a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = C2976x.m10319b();
        }
        C2976x.m10313a(jSONObject, "m_type", str);
        m9409c().mo9729p().mo9648a(jSONObject);
    }
}
