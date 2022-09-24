package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j21 implements uu3<i21> {

    /* renamed from: a */
    private final iv3<Context> f33717a;

    /* renamed from: b */
    private final iv3<Executor> f33718b;

    /* renamed from: c */
    private final iv3<Executor> f33719c;

    /* renamed from: d */
    private final iv3<ScheduledExecutorService> f33720d;

    /* renamed from: e */
    private final iv3<ur2> f33721e;

    /* renamed from: f */
    private final iv3<ir2> f33722f;

    /* renamed from: g */
    private final iv3<px2> f33723g;

    /* renamed from: h */
    private final iv3<ks2> f33724h;

    /* renamed from: i */
    private final iv3<View> f33725i;

    /* renamed from: j */
    private final iv3<C7497ab> f33726j;

    /* renamed from: k */
    private final iv3<p10> f33727k;

    /* renamed from: l */
    private final iv3<r10> f33728l;

    public j21(iv3<Context> iv3, iv3<Executor> iv32, iv3<Executor> iv33, iv3<ScheduledExecutorService> iv34, iv3<ur2> iv35, iv3<ir2> iv36, iv3<px2> iv37, iv3<ks2> iv38, iv3<View> iv39, iv3<C7497ab> iv310, iv3<p10> iv311, iv3<r10> iv312) {
        this.f33717a = iv3;
        this.f33718b = iv32;
        this.f33719c = iv33;
        this.f33720d = iv34;
        this.f33721e = iv35;
        this.f33722f = iv36;
        this.f33723g = iv37;
        this.f33724h = iv38;
        this.f33725i = iv39;
        this.f33726j = iv310;
        this.f33727k = iv311;
        this.f33728l = iv312;
    }

    public final /* synthetic */ Object zzb() {
        Context a = ((et2) this.f33717a).mo31664a();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new i21(a, nb3, this.f33719c.zzb(), this.f33720d.zzb(), ((i71) this.f33721e).mo32566a(), ((f71) this.f33722f).mo31778a(), this.f33723g.zzb(), this.f33724h.zzb(), this.f33725i.zzb(), this.f33726j.zzb(), this.f33727k.zzb(), new r10(), (byte[]) null);
    }
}
