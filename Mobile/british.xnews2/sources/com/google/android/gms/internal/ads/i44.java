package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i44 implements r64 {

    /* renamed from: a */
    public final r64 f33089a;

    /* renamed from: b */
    private boolean f33090b;

    /* renamed from: c */
    final /* synthetic */ j44 f33091c;

    public i44(j44 j44, r64 r64) {
        this.f33091c = j44;
        this.f33089a = r64;
    }

    /* renamed from: a */
    public final int mo30314a(long j) {
        if (this.f33091c.mo32850j()) {
            return -3;
        }
        return this.f33089a.mo30314a(j);
    }

    /* renamed from: b */
    public final int mo30315b(mw3 mw3, s51 s51, int i) {
        if (this.f33091c.mo32850j()) {
            return -3;
        }
        if (this.f33090b) {
            s51.mo33437c(4);
            return -4;
        }
        int b = this.f33089a.mo30315b(mw3, s51, i);
        if (b == -5) {
            C8281w wVar = mw3.f35636a;
            Objects.requireNonNull(wVar);
            int i2 = wVar.f40603B;
            int i3 = 0;
            if (i2 == 0) {
                if (wVar.f40604C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.f33091c.f33772f == Long.MIN_VALUE) {
                i3 = wVar.f40604C;
            }
            ge4 b2 = wVar.mo35521b();
            b2.mo32071c(i2);
            b2.mo32073d(i3);
            mw3.f35636a = b2.mo32099y();
            return -5;
        }
        j44 j44 = this.f33091c;
        long j = j44.f33772f;
        if (j == Long.MIN_VALUE || ((b != -4 || s51.f20812e < j) && (b != -3 || j44.zzb() != Long.MIN_VALUE || s51.f20811d))) {
            return b;
        }
        s51.mo18824b();
        s51.mo33437c(4);
        this.f33090b = true;
        return -4;
    }

    /* renamed from: c */
    public final void mo32552c() {
        this.f33090b = false;
    }

    public final void zzd() throws IOException {
        this.f33089a.zzd();
    }

    public final boolean zze() {
        return !this.f33091c.mo32850j() && this.f33089a.zze();
    }
}
