package com.iab.omid.library.ironsrc;

import android.content.Context;

public final class Omid {
    private static C4877b INSTANCE = new C4877b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo20293a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo20292a();
    }

    public static boolean isActive() {
        return INSTANCE.mo20295b();
    }
}
