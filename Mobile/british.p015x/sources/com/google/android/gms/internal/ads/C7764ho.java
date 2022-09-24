package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ho */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7764ho {

    /* renamed from: h */
    public static final C7764ho f32783h = new C7490a4().mo30303c();

    /* renamed from: i */
    public static final wx3<C7764ho> f32784i = C8354y1.f41632a;

    /* renamed from: a */
    public final String f32785a;

    /* renamed from: b */
    public final C7685fj f32786b;
    @Deprecated

    /* renamed from: c */
    public final C7761hl f32787c;

    /* renamed from: d */
    public final C7831jh f32788d;

    /* renamed from: e */
    public final C7916lt f32789e;

    /* renamed from: f */
    public final C7637e8 f32790f;
    @Deprecated

    /* renamed from: g */
    public final C7713ga f32791g;

    /* synthetic */ C7764ho(String str, C7713ga gaVar, C7761hl hlVar, C7831jh jhVar, C7916lt ltVar, C7726gn gnVar) {
        this.f32785a = str;
        this.f32786b = hlVar;
        this.f32787c = hlVar;
        this.f32788d = jhVar;
        this.f32789e = ltVar;
        this.f32790f = gaVar;
        this.f32791g = gaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7764ho)) {
            return false;
        }
        C7764ho hoVar = (C7764ho) obj;
        return d13.m20317p(this.f32785a, hoVar.f32785a) && this.f32790f.equals(hoVar.f32790f) && d13.m20317p(this.f32786b, hoVar.f32786b) && d13.m20317p(this.f32788d, hoVar.f32788d) && d13.m20317p(this.f32789e, hoVar.f32789e);
    }

    public final int hashCode() {
        int hashCode = this.f32785a.hashCode() * 31;
        C7685fj fjVar = this.f32786b;
        return ((((((hashCode + (fjVar != null ? fjVar.hashCode() : 0)) * 31) + this.f32788d.hashCode()) * 31) + this.f32790f.hashCode()) * 31) + this.f32789e.hashCode();
    }
}
