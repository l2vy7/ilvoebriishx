package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o82<AdT> implements uu3<n82<AdT>> {

    /* renamed from: a */
    private final iv3<dw2> f36323a;

    /* renamed from: b */
    private final iv3<i82> f36324b;

    /* renamed from: c */
    private final iv3<oa1> f36325c;

    /* renamed from: d */
    private final iv3<px2> f36326d;

    /* renamed from: e */
    private final iv3<sx2> f36327e;

    /* renamed from: f */
    private final iv3<r61<AdT>> f36328f;

    /* renamed from: g */
    private final iv3<Executor> f36329g;

    /* renamed from: h */
    private final iv3<ScheduledExecutorService> f36330h;

    /* renamed from: i */
    private final iv3<w42> f36331i;

    public o82(iv3<dw2> iv3, iv3<i82> iv32, iv3<oa1> iv33, iv3<px2> iv34, iv3<sx2> iv35, iv3<r61<AdT>> iv36, iv3<Executor> iv37, iv3<ScheduledExecutorService> iv38, iv3<w42> iv39) {
        this.f36323a = iv3;
        this.f36324b = iv32;
        this.f36325c = iv33;
        this.f36326d = iv34;
        this.f36327e = iv35;
        this.f36328f = iv36;
        this.f36329g = iv37;
        this.f36330h = iv38;
        this.f36331i = iv39;
    }

    /* renamed from: a */
    public final n82<AdT> zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new n82(this.f36323a.zzb(), this.f36324b.zzb(), this.f36325c.zzb(), this.f36326d.zzb(), this.f36327e.zzb(), this.f36328f.zzb(), nb3, this.f36330h.zzb(), this.f36331i.zzb());
    }
}
