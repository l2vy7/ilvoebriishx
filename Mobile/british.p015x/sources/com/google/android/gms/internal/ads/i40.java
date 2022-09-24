package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i40 {

    /* renamed from: a */
    private final e94 f33085a = new e94();

    /* renamed from: a */
    public final i40 mo32546a(int i) {
        this.f33085a.mo31506a(i);
        return this;
    }

    /* renamed from: b */
    public final i40 mo32547b(k60 k60) {
        e94 e94 = this.f33085a;
        fb4 a = k60.f34170a;
        for (int i = 0; i < a.mo31798b(); i++) {
            e94.mo31506a(a.mo31797a(i));
        }
        return this;
    }

    /* renamed from: c */
    public final i40 mo32548c(int... iArr) {
        e94 e94 = this.f33085a;
        for (int a : iArr) {
            e94.mo31506a(a);
        }
        return this;
    }

    /* renamed from: d */
    public final i40 mo32549d(int i, boolean z) {
        e94 e94 = this.f33085a;
        if (z) {
            e94.mo31506a(i);
        }
        return this;
    }

    /* renamed from: e */
    public final k60 mo32550e() {
        return new k60(this.f33085a.mo31507b(), (j50) null);
    }
}
