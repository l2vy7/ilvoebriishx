package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jr0 {

    /* renamed from: a */
    private final C7724gl f34008a = new C7724gl(true, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);

    /* renamed from: b */
    private long f34009b = 15000000;

    /* renamed from: c */
    private long f34010c = 30000000;

    /* renamed from: d */
    private long f34011d = 2500000;

    /* renamed from: e */
    private long f34012e = 5000000;

    /* renamed from: f */
    private int f34013f;

    /* renamed from: g */
    private boolean f34014g;

    jr0() {
    }

    /* renamed from: a */
    public final void mo32957a() {
        mo32961e(false);
    }

    /* renamed from: b */
    public final void mo32958b() {
        mo32961e(true);
    }

    /* renamed from: c */
    public final void mo32959c() {
        mo32961e(true);
    }

    /* renamed from: d */
    public final void mo32960d(C8224ue[] ueVarArr, C7870kk kkVar, C8301wk wkVar) {
        this.f34013f = 0;
        for (int i = 0; i < 2; i++) {
            if (wkVar.mo35640a(i) != null) {
                this.f34013f += C7836jm.m33644f(ueVarArr[i].zzc());
            }
        }
        this.f34008a.mo32165f(this.f34013f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo32961e(boolean z) {
        this.f34013f = 0;
        this.f34014g = false;
        if (z) {
            this.f34008a.mo32164e();
        }
    }

    /* renamed from: f */
    public final synchronized void mo32962f(int i) {
        this.f34011d = ((long) i) * 1000;
    }

    /* renamed from: g */
    public final synchronized void mo32963g(int i) {
        this.f34012e = ((long) i) * 1000;
    }

    /* renamed from: h */
    public final synchronized void mo32964h(int i) {
        this.f34010c = ((long) i) * 1000;
    }

    /* renamed from: i */
    public final synchronized void mo32965i(int i) {
        this.f34009b = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized boolean mo32966j(long j) {
        boolean z;
        z = true;
        char c = j > this.f34010c ? 0 : j < this.f34009b ? (char) 2 : 1;
        int a = this.f34008a.mo32160a();
        int i = this.f34013f;
        if (c != 2) {
            if (c != 1 || !this.f34014g || a >= i) {
                z = false;
            }
        }
        this.f34014g = z;
        return z;
    }

    /* renamed from: k */
    public final synchronized boolean mo32967k(long j, boolean z) {
        long j2;
        j2 = z ? this.f34012e : this.f34011d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: l */
    public final C7724gl mo32968l() {
        return this.f34008a;
    }
}
