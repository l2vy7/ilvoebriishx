package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.C4979h;

/* renamed from: com.ironsource.sdk.utils.a */
public final class C11755a {

    /* renamed from: g */
    private static C11755a f52493g;

    /* renamed from: a */
    public String f52494a = C4979h.m22804h();

    /* renamed from: b */
    public String f52495b = C4979h.m22803g();

    /* renamed from: c */
    public String f52496c = C4979h.m22806i();

    /* renamed from: d */
    public String f52497d = C4979h.m22798e();

    /* renamed from: e */
    public int f52498e = C4979h.m22800f();

    /* renamed from: f */
    public String f52499f;

    private C11755a(Context context) {
        this.f52499f = C4979h.m22808j(context);
    }

    /* renamed from: a */
    public static C11755a m51959a(Context context) {
        if (f52493g == null) {
            f52493g = new C11755a(context);
        }
        return f52493g;
    }

    /* renamed from: a */
    public static String m51960a() {
        return "5.108";
    }

    /* renamed from: b */
    public static float m51961b(Context context) {
        return C4979h.m22814m(context);
    }

    /* renamed from: b */
    public static void m51962b() {
        f52493g = null;
    }
}
