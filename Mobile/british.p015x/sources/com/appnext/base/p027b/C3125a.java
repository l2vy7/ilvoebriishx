package com.appnext.base.p027b;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.appnext.base.b.a */
public final class C3125a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: cu */
    private static Context f12202cu;

    public static Context getContext() {
        return f12202cu;
    }

    public static void init(Context context) {
        if (context != null) {
            f12202cu = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("context shouldn't be null");
    }
}
