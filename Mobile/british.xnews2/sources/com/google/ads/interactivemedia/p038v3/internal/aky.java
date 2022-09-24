package com.google.ads.interactivemedia.p038v3.internal;

import android.util.SparseBooleanArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aky */
/* compiled from: IMASDK */
public final class aky {

    /* renamed from: a */
    private final SparseBooleanArray f15189a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f15190b;

    /* renamed from: a */
    public final akz mo13868a() {
        aup.m14887r(!this.f15190b);
        this.f15190b = true;
        return new akz(this.f15189a);
    }

    /* renamed from: b */
    public final void mo13869b(int i) {
        aup.m14887r(!this.f15190b);
        this.f15189a.append(i, true);
    }
}
