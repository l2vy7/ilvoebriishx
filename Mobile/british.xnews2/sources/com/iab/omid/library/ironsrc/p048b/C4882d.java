package com.iab.omid.library.ironsrc.p048b;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.ironsrc.b.d */
public class C4882d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C4882d f21807a = new C4882d();

    /* renamed from: b */
    private Context f21808b;

    private C4882d() {
    }

    /* renamed from: a */
    public static C4882d m22495a() {
        return f21807a;
    }

    /* renamed from: a */
    public void mo20311a(Context context) {
        this.f21808b = context != null ? context.getApplicationContext() : null;
    }

    /* renamed from: b */
    public Context mo20312b() {
        return this.f21808b;
    }
}
