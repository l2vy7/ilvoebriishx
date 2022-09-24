package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uy2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static final uy2 f40129b = new uy2();

    /* renamed from: a */
    private Context f40130a;

    private uy2() {
    }

    /* renamed from: b */
    public static uy2 m38542b() {
        return f40129b;
    }

    /* renamed from: a */
    public final Context mo35336a() {
        return this.f40130a;
    }

    /* renamed from: c */
    public final void mo35337c(Context context) {
        this.f40130a = context != null ? context.getApplicationContext() : null;
    }
}
