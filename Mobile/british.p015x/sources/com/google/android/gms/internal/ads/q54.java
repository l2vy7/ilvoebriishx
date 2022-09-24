package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class q54 implements r64 {

    /* renamed from: a */
    private final r64 f37877a;

    /* renamed from: b */
    private final long f37878b;

    public q54(r64 r64, long j) {
        this.f37877a = r64;
        this.f37878b = j;
    }

    /* renamed from: a */
    public final int mo30314a(long j) {
        return this.f37877a.mo30314a(j - this.f37878b);
    }

    /* renamed from: b */
    public final int mo30315b(mw3 mw3, s51 s51, int i) {
        int b = this.f37877a.mo30315b(mw3, s51, i);
        if (b != -4) {
            return b;
        }
        s51.f20812e = Math.max(0, s51.f20812e + this.f37878b);
        return -4;
    }

    /* renamed from: c */
    public final r64 mo34235c() {
        return this.f37877a;
    }

    public final void zzd() throws IOException {
        this.f37877a.zzd();
    }

    public final boolean zze() {
        return this.f37877a.zze();
    }
}
