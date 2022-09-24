package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aaa */
/* compiled from: IMASDK */
final class aaa implements ach {

    /* renamed from: a */
    public final ach f13908a;

    /* renamed from: b */
    final /* synthetic */ aab f13909b;

    /* renamed from: c */
    private boolean f13910c;

    public aaa(aab aab, ach ach) {
        this.f13909b = aab;
        this.f13908a = ach;
    }

    /* renamed from: a */
    public final void mo13223a() {
        this.f13910c = false;
    }

    /* renamed from: b */
    public final boolean mo13224b() {
        return !this.f13909b.mo13242o() && this.f13908a.mo13224b();
    }

    /* renamed from: c */
    public final void mo13225c() throws IOException {
        this.f13908a.mo13225c();
    }

    /* renamed from: d */
    public final int mo13226d(C4121kf kfVar, C4269ps psVar, int i) {
        int i2;
        if (this.f13909b.mo13242o()) {
            return -3;
        }
        if (this.f13910c) {
            psVar.mo16513f(4);
            return -4;
        }
        int d = this.f13908a.mo13226d(kfVar, psVar, i);
        if (d == -5) {
            C4120ke keVar = kfVar.f17697b;
            aup.m14890u(keVar);
            int i3 = keVar.f17665B;
            if (!(i3 == 0 && keVar.f17666C == 0)) {
                if (this.f13909b.f13912b != Long.MIN_VALUE) {
                    i2 = 0;
                } else {
                    i2 = keVar.f17666C;
                }
                C4119kd a = keVar.mo16126a();
                a.mo16101M(i3);
                a.mo16102N(i2);
                kfVar.f17697b = a.mo16115a();
            }
            return -5;
        }
        aab aab = this.f13909b;
        long j = aab.f13912b;
        if (j == Long.MIN_VALUE || ((d != -4 || psVar.f18399d < j) && (d != -3 || aab.mo13234g() != Long.MIN_VALUE || psVar.f18398c))) {
            return d;
        }
        psVar.mo16508a();
        psVar.mo16513f(4);
        this.f13910c = true;
        return -4;
    }

    /* renamed from: e */
    public final int mo13227e(long j) {
        if (this.f13909b.mo13242o()) {
            return -3;
        }
        return this.f13908a.mo13227e(j);
    }
}
