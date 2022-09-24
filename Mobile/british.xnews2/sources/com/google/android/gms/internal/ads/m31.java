package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m31 {

    /* renamed from: a */
    private final nw2 f35380a;

    /* renamed from: b */
    private final nv1 f35381b;

    /* renamed from: c */
    private final ur2 f35382c;

    public m31(nv1 nv1, ur2 ur2, nw2 nw2) {
        this.f35380a = nw2;
        this.f35381b = nv1;
        this.f35382c = ur2;
    }

    /* renamed from: b */
    private static String m34673b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    /* renamed from: a */
    public final void mo33465a(long j, int i) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue()) {
            nw2 nw2 = this.f35380a;
            mw2 b = mw2.m34936b("ad_closed");
            b.mo33607g(this.f35382c.f39937b.f39519b);
            b.mo33603a("show_time", String.valueOf(j));
            b.mo33603a("ad_format", "app_open_ad");
            b.mo33603a("acr", m34673b(i));
            nw2.mo31048a(b);
            return;
        }
        mv1 a = this.f35381b.mo33772a();
        a.mo33599d(this.f35382c.f39937b.f39519b);
        a.mo33597b("action", "ad_closed");
        a.mo33597b("show_time", String.valueOf(j));
        a.mo33597b("ad_format", "app_open_ad");
        a.mo33597b("acr", m34673b(i));
        a.mo33601f();
    }
}
