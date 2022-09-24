package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gn2 implements sc2<f41> {

    /* renamed from: a */
    final /* synthetic */ hn2 f32373a;

    gn2(hn2 hn2) {
        this.f32373a = hn2;
    }

    public final void zza() {
        synchronized (this.f32373a) {
            this.f32373a.f32782j = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        f41 f41 = (f41) obj;
        synchronized (this.f32373a) {
            f41 f412 = this.f32373a.f32782j;
            if (f412 != null) {
                f412.mo31310a();
            }
            hn2 hn2 = this.f32373a;
            hn2.f32782j = f41;
            f41.mo31742i(hn2);
            zm2 n6 = this.f32373a.f32779g;
            hn2 hn22 = this.f32373a;
            n6.mo36077l(new g41(f41, hn22, hn22.f32779g));
            f41.mo31311b();
        }
    }
}
