package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kc2 implements sc2<zi1> {

    /* renamed from: a */
    final /* synthetic */ lc2 f34240a;

    kc2(lc2 lc2) {
        this.f34240a = lc2;
    }

    public final void zza() {
        synchronized (this.f34240a) {
            this.f34240a.f34991h = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zi1 zi1 = (zi1) obj;
        synchronized (this.f34240a) {
            this.f34240a.f34991h = zi1;
            this.f34240a.f34991h.mo31311b();
        }
    }
}
