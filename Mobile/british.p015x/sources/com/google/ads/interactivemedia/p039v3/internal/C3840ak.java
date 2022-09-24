package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ak */
/* compiled from: IMASDK */
public final class C3840ak {

    /* renamed from: a */
    private boolean f15129a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo13832a() {
        return this.f15129a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13833b(Context context) {
        C4038hd.m17319e(context, "Application Context cannot be null");
        if (!this.f15129a) {
            this.f15129a = true;
            C3876bd.m15693a().mo14935b(context);
            C3870ay.m15173a().mo14768b(context);
            C3887bo.m16850a(context);
            C3873ba.m15330a().mo14783c(context);
        }
    }
}
