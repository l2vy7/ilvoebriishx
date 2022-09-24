package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.appevents.C3406g;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.appevents.m */
/* compiled from: InternalAppEventsLogger */
public class C3420m {

    /* renamed from: a */
    private C3408h f12879a;

    public C3420m(Context context) {
        this.f12879a = new C3408h(context, (String) null, (AccessToken) null);
    }

    /* renamed from: b */
    static Executor m11430b() {
        return C3408h.m11404d();
    }

    /* renamed from: c */
    public static C3406g.C3407a m11431c() {
        return C3408h.m11406f();
    }

    /* renamed from: d */
    static String m11432d() {
        return C3408h.m11408h();
    }

    /* renamed from: m */
    public static void m11433m(Map<String, String> map) {
        C3425p.m11462j(map);
    }

    /* renamed from: a */
    public void mo11843a() {
        this.f12879a.mo11830c();
    }

    /* renamed from: e */
    public void mo11844e(String str, double d, Bundle bundle) {
        if (C3642m.m12283i()) {
            this.f12879a.mo11831l(str, d, bundle);
        }
    }

    /* renamed from: f */
    public void mo11845f(String str, Bundle bundle) {
        if (C3642m.m12283i()) {
            this.f12879a.mo11832m(str, bundle);
        }
    }

    /* renamed from: g */
    public void mo11846g(String str, String str2) {
        this.f12879a.mo11834o(str, str2);
    }

    /* renamed from: h */
    public void mo11847h(String str) {
        if (C3642m.m12283i()) {
            this.f12879a.mo11835p(str, (Double) null, (Bundle) null);
        }
    }

    /* renamed from: i */
    public void mo11848i(String str, Bundle bundle) {
        if (C3642m.m12283i()) {
            this.f12879a.mo11835p(str, (Double) null, bundle);
        }
    }

    /* renamed from: j */
    public void mo11849j(String str, Double d, Bundle bundle) {
        if (C3642m.m12283i()) {
            this.f12879a.mo11835p(str, d, bundle);
        }
    }

    /* renamed from: k */
    public void mo11850k(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C3642m.m12283i()) {
            this.f12879a.mo11836q(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: l */
    public void mo11851l(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C3642m.m12283i()) {
            this.f12879a.mo11838s(bigDecimal, currency, bundle);
        }
    }

    public C3420m(Context context, String str) {
        this.f12879a = new C3408h(context, str, (AccessToken) null);
    }

    public C3420m(String str, String str2, AccessToken accessToken) {
        this.f12879a = new C3408h(str, str2, accessToken);
    }
}
