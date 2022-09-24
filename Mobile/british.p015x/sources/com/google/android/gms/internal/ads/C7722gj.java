package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7722gj implements C7760hk {

    /* renamed from: b */
    private final C7760hk[] f32345b;

    public C7722gj(C7760hk[] hkVarArr) {
        this.f32345b = hkVarArr;
    }

    /* renamed from: a */
    public final boolean mo32146a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C7760hk hkVar : this.f32345b) {
                if (hkVar.zza() == zza) {
                    z |= hkVar.mo32146a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (C7760hk zza : this.f32345b) {
            long zza2 = zza.zza();
            if (zza2 != Long.MIN_VALUE) {
                j = Math.min(j, zza2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
