package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aip */
/* compiled from: IMASDK */
public final class aip {

    /* renamed from: a */
    public final int f15004a;

    /* renamed from: b */
    public final C4158lp[] f15005b;

    /* renamed from: c */
    public final aih[] f15006c;

    /* renamed from: d */
    public final Object f15007d;

    public aip(C4158lp[] lpVarArr, aih[] aihArr, Object obj) {
        this.f15005b = lpVarArr;
        this.f15006c = (aih[]) aihArr.clone();
        this.f15007d = obj;
        this.f15004a = lpVarArr.length;
    }

    /* renamed from: a */
    public final boolean mo13781a(int i) {
        return this.f15005b[i] != null;
    }

    /* renamed from: b */
    public final boolean mo13782b(aip aip, int i) {
        if (aip != null && amm.m14233c(this.f15005b[i], aip.f15005b[i]) && amm.m14233c(this.f15006c[i], aip.f15006c[i])) {
            return true;
        }
        return false;
    }
}
