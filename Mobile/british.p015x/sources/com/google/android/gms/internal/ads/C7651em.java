package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.em */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7651em implements C8338xl {

    /* renamed from: a */
    private boolean f31404a;

    /* renamed from: b */
    private long f31405b;

    /* renamed from: c */
    private long f31406c;

    /* renamed from: d */
    private C8188te f31407d = C8188te.f39400d;

    /* renamed from: a */
    public final C8188te mo30903a(C8188te teVar) {
        if (this.f31404a) {
            mo31599b(zzI());
        }
        this.f31407d = teVar;
        return teVar;
    }

    /* renamed from: b */
    public final void mo31599b(long j) {
        this.f31405b = j;
        if (this.f31404a) {
            this.f31406c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public final void mo31600c() {
        if (!this.f31404a) {
            this.f31406c = SystemClock.elapsedRealtime();
            this.f31404a = true;
        }
    }

    /* renamed from: d */
    public final void mo31601d() {
        if (this.f31404a) {
            mo31599b(zzI());
            this.f31404a = false;
        }
    }

    /* renamed from: e */
    public final void mo31602e(C8338xl xlVar) {
        mo31599b(xlVar.zzI());
        this.f31407d = xlVar.zzJ();
    }

    public final long zzI() {
        long j;
        long j2 = this.f31405b;
        if (!this.f31404a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f31406c;
        C8188te teVar = this.f31407d;
        if (teVar.f39401a == 1.0f) {
            j = C7500ae.m30300a(elapsedRealtime);
        } else {
            j = teVar.mo34941a(elapsedRealtime);
        }
        return j2 + j;
    }

    public final C8188te zzJ() {
        throw null;
    }
}
