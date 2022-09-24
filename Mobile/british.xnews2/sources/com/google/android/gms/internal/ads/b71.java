package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b71 implements xa3<w61> {

    /* renamed from: a */
    final /* synthetic */ xa3 f29918a;

    /* renamed from: b */
    final /* synthetic */ d71 f29919b;

    b71(d71 d71, xa3 xa3) {
        this.f29919b = d71;
        this.f29918a = xa3;
    }

    public final void zza(Throwable th) {
        this.f29918a.zza(th);
        po0.f37726e.execute(new z61(this.f29919b));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        d71.m31262b(this.f29919b, ((w61) obj).f40709a, this.f29918a);
    }
}
