package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ux1 implements uu3<tx1> {

    /* renamed from: a */
    private final iv3<Executor> f40120a;

    /* renamed from: b */
    private final iv3<Context> f40121b;

    /* renamed from: c */
    private final iv3<WeakReference<Context>> f40122c;

    /* renamed from: d */
    private final iv3<Executor> f40123d;

    /* renamed from: e */
    private final iv3<it1> f40124e;

    /* renamed from: f */
    private final iv3<ScheduledExecutorService> f40125f;

    /* renamed from: g */
    private final iv3<xv1> f40126g;

    /* renamed from: h */
    private final iv3<zzcjf> f40127h;

    /* renamed from: i */
    private final iv3<kh1> f40128i;

    public ux1(iv3<Executor> iv3, iv3<Context> iv32, iv3<WeakReference<Context>> iv33, iv3<Executor> iv34, iv3<it1> iv35, iv3<ScheduledExecutorService> iv36, iv3<xv1> iv37, iv3<zzcjf> iv38, iv3<kh1> iv39) {
        this.f40120a = iv3;
        this.f40121b = iv32;
        this.f40122c = iv33;
        this.f40123d = iv34;
        this.f40124e = iv35;
        this.f40125f = iv36;
        this.f40126g = iv37;
        this.f40127h = iv38;
        this.f40128i = iv39;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((zv0) this.f40121b).mo36135a();
        WeakReference<Context> a2 = ((aw0) this.f40122c).mo30515a();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new tx1(this.f40120a.zzb(), a, a2, nb3, this.f40124e.zzb(), this.f40125f.zzb(), this.f40126g.zzb(), ((kw0) this.f40127h).mo33191a(), ((lh1) this.f40128i).zzb());
    }
}
