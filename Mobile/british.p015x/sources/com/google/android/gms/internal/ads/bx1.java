package com.google.android.gms.internal.ads;

import android.content.Context;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bx1 implements nw1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f30148a;

    /* renamed from: b */
    private final lc2 f30149b;

    bx1(long j, Context context, uw1 uw1, uv0 uv0, String str) {
        this.f30148a = j;
        lp2 A = uv0.mo35279A();
        A.mo33373b(context);
        A.mo33374c(new zzbfi());
        A.mo33372a(str);
        lc2 zza = A.zzd().zza();
        this.f30149b = zza;
        zza.zzD(new ax1(this, uw1));
    }

    /* renamed from: a */
    public final void mo30811a(zzbfd zzbfd) {
        this.f30149b.zzaa(zzbfd);
    }

    public final void zza() {
        this.f30149b.zzx();
    }

    public final void zzc() {
        this.f30149b.zzW(C10489b.m48195m6(null));
    }
}
