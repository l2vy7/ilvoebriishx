package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rx3 implements ow3 {

    /* renamed from: b */
    private final ov1 f38801b;

    /* renamed from: c */
    private boolean f38802c;

    /* renamed from: d */
    private long f38803d;

    /* renamed from: e */
    private long f38804e;

    /* renamed from: f */
    private h20 f38805f = h20.f32588d;

    public rx3(ov1 ov1) {
        this.f38801b = ov1;
    }

    /* renamed from: a */
    public final void mo34635a(long j) {
        this.f38803d = j;
        if (this.f38802c) {
            this.f38804e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo34636b() {
        if (!this.f38802c) {
            this.f38804e = SystemClock.elapsedRealtime();
            this.f38802c = true;
        }
    }

    /* renamed from: c */
    public final void mo34637c() {
        if (this.f38802c) {
            mo34635a(zza());
            this.f38802c = false;
        }
    }

    /* renamed from: r */
    public final void mo34017r(h20 h20) {
        if (this.f38802c) {
            mo34635a(zza());
        }
        this.f38805f = h20;
    }

    public final long zza() {
        long j;
        long j2 = this.f38803d;
        if (!this.f38802c) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f38804e;
        h20 h20 = this.f38805f;
        if (h20.f32590a == 1.0f) {
            j = xy3.m39691c(elapsedRealtime);
        } else {
            j = h20.mo32320a(elapsedRealtime);
        }
        return j2 + j;
    }

    public final h20 zzc() {
        return this.f38805f;
    }
}
