package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bc0 {

    /* renamed from: a */
    private final db0 f29964a;

    /* renamed from: b */
    private mb3<eb0> f29965b;

    bc0(db0 db0) {
        this.f29964a = db0;
    }

    /* renamed from: d */
    private final void m30660d() {
        if (this.f29965b == null) {
            uo0 uo0 = new uo0();
            this.f29965b = uo0;
            this.f29964a.mo18234b((C7497ab) null).mo30763e(new yb0(uo0), new xb0(uo0));
        }
    }

    /* renamed from: a */
    public final <I, O> ec0<I, O> mo30653a(String str, lb0<I> lb0, jb0<O> jb0) {
        m30660d();
        return new ec0<>(this.f29965b, "google.afma.activeView.handleUpdate", lb0, jb0);
    }

    /* renamed from: b */
    public final void mo30654b(String str, e70<? super eb0> e70) {
        m30660d();
        this.f29965b = bb3.m30654n(this.f29965b, new ac0(str, e70), po0.f37727f);
    }

    /* renamed from: c */
    public final void mo30655c(String str, e70<? super eb0> e70) {
        this.f29965b = bb3.m30653m(this.f29965b, new zb0(str, e70), po0.f37727f);
    }
}
