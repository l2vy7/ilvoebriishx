package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c71 implements xa3<o61> {

    /* renamed from: a */
    final /* synthetic */ xa3 f30262a;

    /* renamed from: b */
    final /* synthetic */ d71 f30263b;

    c71(d71 d71, xa3 xa3) {
        this.f30263b = d71;
        this.f30262a = xa3;
    }

    public final void zza(Throwable th) {
        po0.f37726e.execute(new z61(this.f30263b));
        this.f30262a.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        po0.f37726e.execute(new z61(this.f30263b));
        this.f30262a.zzb((o61) obj);
    }
}
