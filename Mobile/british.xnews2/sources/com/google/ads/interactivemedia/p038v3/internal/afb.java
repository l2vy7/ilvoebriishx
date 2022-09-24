package com.google.ads.interactivemedia.p038v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afb */
/* compiled from: IMASDK */
public final class afb extends afa {

    /* renamed from: e */
    final List<aew> f14499e;

    public afb(aew aew, long j, long j2, long j3, long j4, List<afd> list, long j5, List<aew> list2, long j6, long j7) {
        super(aew, j, j2, j3, j4, list, j5, j6, j7);
        this.f14499e = list2;
    }

    /* renamed from: d */
    public final aew mo13593d(aez aez, long j) {
        return this.f14499e.get((int) (j - this.f14493a));
    }

    /* renamed from: g */
    public final boolean mo13596g() {
        return true;
    }

    /* renamed from: h */
    public final int mo13597h(long j) {
        return this.f14499e.size();
    }
}
