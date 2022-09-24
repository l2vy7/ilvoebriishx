package com.google.ads.interactivemedia.p039v3.internal;

import android.util.SparseBooleanArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akz */
/* compiled from: IMASDK */
public final class akz {

    /* renamed from: a */
    private final SparseBooleanArray f15191a;

    /* synthetic */ akz(SparseBooleanArray sparseBooleanArray) {
        this.f15191a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo13870a() {
        return this.f15191a.size();
    }

    /* renamed from: b */
    public final int mo13871b(int i) {
        boolean z = false;
        if (i >= 0 && i < mo13870a()) {
            z = true;
        }
        aup.m14885p(z);
        return this.f15191a.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akz)) {
            return false;
        }
        return this.f15191a.equals(((akz) obj).f15191a);
    }

    public final int hashCode() {
        return this.f15191a.hashCode();
    }
}
