package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kl0 {

    /* renamed from: a */
    private final C6483e f34360a;

    /* renamed from: b */
    private final zzg f34361b;

    /* renamed from: c */
    private final km0 f34362c;

    kl0(C6483e eVar, zzg zzg, km0 km0) {
        this.f34360a = eVar;
        this.f34361b = zzg;
        this.f34362c = km0;
    }

    /* renamed from: a */
    public final void mo33109a() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37139l0)).booleanValue()) {
            this.f34362c.mo18500y();
        }
    }

    /* renamed from: b */
    public final void mo33110b(int i, long j) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37130k0)).booleanValue()) {
            if (j - this.f34361b.zze() < 0) {
                zze.zza("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37139l0)).booleanValue()) {
                this.f34361b.zzG(-1);
                this.f34361b.zzH(j);
            } else {
                this.f34361b.zzG(i);
                this.f34361b.zzH(j);
            }
            mo33109a();
        }
    }
}
