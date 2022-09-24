package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dr2 implements sc2<yr1> {

    /* renamed from: a */
    final /* synthetic */ fr2 f30987a;

    dr2(fr2 fr2) {
        this.f30987a = fr2;
    }

    public final void zza() {
        synchronized (this.f30987a) {
            this.f30987a.f31860e = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        yr1 yr1 = (yr1) obj;
        synchronized (this.f30987a) {
            this.f30987a.f31860e = yr1;
            this.f30987a.f31860e.mo31311b();
        }
    }
}
