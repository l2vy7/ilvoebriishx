package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amu */
/* compiled from: IMASDK */
final class amu {

    /* renamed from: a */
    private amt f15341a = new amt();

    /* renamed from: b */
    private amt f15342b = new amt();

    /* renamed from: c */
    private boolean f15343c;

    /* renamed from: d */
    private long f15344d = C6540C.TIME_UNSET;

    /* renamed from: e */
    private int f15345e;

    /* renamed from: a */
    public final void mo14018a() {
        this.f15341a.mo14012a();
        this.f15342b.mo14012a();
        this.f15343c = false;
        this.f15344d = C6540C.TIME_UNSET;
        this.f15345e = 0;
    }

    /* renamed from: b */
    public final void mo14019b(long j) {
        this.f15341a.mo14017f(j);
        int i = 0;
        if (this.f15341a.mo14013b()) {
            this.f15343c = false;
        } else if (this.f15344d != C6540C.TIME_UNSET) {
            if (!this.f15343c || this.f15342b.mo14014c()) {
                this.f15342b.mo14012a();
                this.f15342b.mo14017f(this.f15344d);
            }
            this.f15343c = true;
            this.f15342b.mo14017f(j);
        }
        if (this.f15343c && this.f15342b.mo14013b()) {
            amt amt = this.f15341a;
            this.f15341a = this.f15342b;
            this.f15342b = amt;
            this.f15343c = false;
        }
        this.f15344d = j;
        if (!this.f15341a.mo14013b()) {
            i = this.f15345e + 1;
        }
        this.f15345e = i;
    }

    /* renamed from: c */
    public final boolean mo14020c() {
        return this.f15341a.mo14013b();
    }

    /* renamed from: d */
    public final int mo14021d() {
        return this.f15345e;
    }

    /* renamed from: e */
    public final long mo14022e() {
        return mo14020c() ? this.f15341a.mo14015d() : C6540C.TIME_UNSET;
    }

    /* renamed from: f */
    public final long mo14023f() {
        return mo14020c() ? this.f15341a.mo14016e() : C6540C.TIME_UNSET;
    }

    /* renamed from: g */
    public final float mo14024g() {
        if (!mo14020c()) {
            return -1.0f;
        }
        double e = (double) this.f15341a.mo14016e();
        Double.isNaN(e);
        return (float) (1.0E9d / e);
    }
}
