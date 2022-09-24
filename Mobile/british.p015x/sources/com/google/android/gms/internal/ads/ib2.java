package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ib2 implements sc2<m41> {

    /* renamed from: a */
    final /* synthetic */ jb2 f33190a;

    ib2(jb2 jb2) {
        this.f33190a = jb2;
    }

    public final void zza() {
        synchronized (this.f33190a) {
            this.f33190a.f33839h = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        m41 m41 = (m41) obj;
        synchronized (this.f33190a) {
            if (this.f33190a.f33839h != null) {
                this.f33190a.f33839h.mo31310a();
            }
            this.f33190a.f33839h = m41;
            this.f33190a.f33839h.mo31311b();
        }
    }
}
