package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e22 implements uu3<d22> {

    /* renamed from: a */
    private final iv3<Context> f31171a;

    /* renamed from: b */
    private final iv3<Executor> f31172b;

    /* renamed from: c */
    private final iv3<gj0> f31173c;

    /* renamed from: d */
    private final iv3<b11> f31174d;

    /* renamed from: e */
    private final iv3<fj0> f31175e;

    /* renamed from: f */
    private final iv3<ArrayDeque<a22>> f31176f;

    /* renamed from: g */
    private final iv3<i22> f31177g;

    public e22(iv3<Context> iv3, iv3<Executor> iv32, iv3<gj0> iv33, iv3<b11> iv34, iv3<fj0> iv35, iv3<ArrayDeque<a22>> iv36, iv3<i22> iv37) {
        this.f31171a = iv3;
        this.f31172b = iv32;
        this.f31173c = iv33;
        this.f31174d = iv34;
        this.f31175e = iv35;
        this.f31176f = iv36;
        this.f31177g = iv37;
    }

    public final /* synthetic */ Object zzb() {
        return new d22(((zv0) this.f31171a).mo36135a(), this.f31172b.zzb(), new gj0(), ((gw0) this.f31174d).zzb(), ((sw0) this.f31175e).zzb(), this.f31176f.zzb(), new i22(), (i22) null);
    }
}
