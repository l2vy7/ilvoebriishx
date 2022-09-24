package com.google.ads.interactivemedia.p038v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ba */
/* compiled from: IMASDK */
public final class C3873ba {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static final C3873ba f15940a = new C3873ba();

    /* renamed from: b */
    private Context f15941b;

    private C3873ba() {
    }

    /* renamed from: a */
    public static C3873ba m15330a() {
        return f15940a;
    }

    /* renamed from: b */
    public final Context mo14782b() {
        return this.f15941b;
    }

    /* renamed from: c */
    public final void mo14783c(Context context) {
        this.f15941b = context != null ? context.getApplicationContext() : null;
    }
}
