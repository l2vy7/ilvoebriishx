package com.google.ads.interactivemedia.p038v3.internal;

import android.os.SystemClock;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amf */
/* compiled from: IMASDK */
public final class amf implements alk {

    /* renamed from: a */
    private final aks f15281a;

    /* renamed from: b */
    private boolean f15282b;

    /* renamed from: c */
    private long f15283c;

    /* renamed from: d */
    private long f15284d;

    /* renamed from: e */
    private C4146ld f15285e = C4146ld.f17825a;

    public amf(aks aks) {
        this.f15281a = aks;
    }

    /* renamed from: a */
    public final void mo13983a() {
        if (!this.f15282b) {
            this.f15284d = SystemClock.elapsedRealtime();
            this.f15282b = true;
        }
    }

    /* renamed from: b */
    public final void mo13984b() {
        if (this.f15282b) {
            mo13985c(mo13912g());
            this.f15282b = false;
        }
    }

    /* renamed from: c */
    public final void mo13985c(long j) {
        this.f15283c = j;
        if (this.f15282b) {
            this.f15284d = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: g */
    public final long mo13912g() {
        long j;
        long j2 = this.f15283c;
        if (!this.f15282b) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15284d;
        C4146ld ldVar = this.f15285e;
        if (ldVar.f17826b == 1.0f) {
            j = C4083iv.m17452b(elapsedRealtime);
        } else {
            j = ldVar.mo16222a(elapsedRealtime);
        }
        return j2 + j;
    }

    /* renamed from: h */
    public final void mo13913h(C4146ld ldVar) {
        if (this.f15282b) {
            mo13985c(mo13912g());
        }
        this.f15285e = ldVar;
    }

    /* renamed from: i */
    public final C4146ld mo13914i() {
        return this.f15285e;
    }
}
