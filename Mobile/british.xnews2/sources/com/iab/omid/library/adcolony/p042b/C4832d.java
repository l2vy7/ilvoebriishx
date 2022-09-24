package com.iab.omid.library.adcolony.p042b;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.adcolony.b.d */
public class C4832d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static C4832d f21693b = new C4832d();

    /* renamed from: a */
    private Context f21694a;

    private C4832d() {
    }

    /* renamed from: a */
    public static C4832d m22274a() {
        return f21693b;
    }

    /* renamed from: a */
    public void mo20125a(Context context) {
        this.f21694a = context != null ? context.getApplicationContext() : null;
    }

    /* renamed from: b */
    public Context mo20126b() {
        return this.f21694a;
    }
}
