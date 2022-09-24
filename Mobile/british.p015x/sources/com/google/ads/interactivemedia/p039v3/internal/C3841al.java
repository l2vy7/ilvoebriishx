package com.google.ads.interactivemedia.p039v3.internal;

import android.view.View;

/* renamed from: com.google.ads.interactivemedia.v3.internal.al */
/* compiled from: IMASDK */
public abstract class C3841al {
    /* renamed from: f */
    public static C3841al m13990f(C3842am amVar, C3844an anVar) {
        if (C3839aj.m13821c()) {
            return new C3846ap(amVar, anVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: a */
    public abstract void mo13874a();

    /* renamed from: b */
    public abstract void mo13875b(View view);

    /* renamed from: c */
    public abstract void mo13876c();

    /* renamed from: d */
    public abstract void mo13877d(View view, C3850ar arVar, String str);

    /* renamed from: e */
    public abstract void mo13878e();
}
