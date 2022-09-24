package com.iab.omid.library.adcolony;

import android.content.Context;

public final class Omid {

    /* renamed from: a */
    private static C4827b f21621a = new C4827b();

    private Omid() {
    }

    public static void activate(Context context) {
        f21621a.mo20107a(context.getApplicationContext());
    }

    public static String getVersion() {
        return f21621a.mo20106a();
    }

    public static boolean isActive() {
        return f21621a.mo20109b();
    }
}
