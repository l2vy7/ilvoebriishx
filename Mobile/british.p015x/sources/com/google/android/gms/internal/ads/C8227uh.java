package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8227uh implements C8156sh {

    /* renamed from: a */
    private final int f39866a;

    /* renamed from: b */
    private final int f39867b;

    /* renamed from: c */
    private final C7544bm f39868c;

    public C8227uh(C8050ph phVar) {
        C7544bm bmVar = phVar.f37635P0;
        this.f39868c = bmVar;
        bmVar.mo30725v(12);
        this.f39866a = bmVar.mo30712i();
        this.f39867b = bmVar.mo30712i();
    }

    public final int zza() {
        return this.f39867b;
    }

    public final int zzb() {
        int i = this.f39866a;
        return i == 0 ? this.f39868c.mo30712i() : i;
    }

    public final boolean zzc() {
        return this.f39866a != 0;
    }
}
