package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r41 implements uu3<p41> {

    /* renamed from: a */
    private final iv3<n61> f38529a;

    /* renamed from: b */
    private final iv3<Context> f38530b;

    /* renamed from: c */
    private final iv3<jr2> f38531c;

    /* renamed from: d */
    private final iv3<View> f38532d;

    /* renamed from: e */
    private final iv3<xt0> f38533e;

    /* renamed from: f */
    private final iv3<m61> f38534f;

    /* renamed from: g */
    private final iv3<tm1> f38535g;

    /* renamed from: h */
    private final iv3<ii1> f38536h;

    /* renamed from: i */
    private final iv3<db2> f38537i;

    /* renamed from: j */
    private final iv3<Executor> f38538j;

    public r41(iv3<n61> iv3, iv3<Context> iv32, iv3<jr2> iv33, iv3<View> iv34, iv3<xt0> iv35, iv3<m61> iv36, iv3<tm1> iv37, iv3<ii1> iv38, iv3<db2> iv39, iv3<Executor> iv310) {
        this.f38529a = iv3;
        this.f38530b = iv32;
        this.f38531c = iv33;
        this.f38532d = iv34;
        this.f38533e = iv35;
        this.f38534f = iv36;
        this.f38535g = iv37;
        this.f38536h = iv38;
        this.f38537i = iv39;
        this.f38538j = iv310;
    }

    /* renamed from: b */
    public static p41 m36918b(n61 n61, Context context, jr2 jr2, View view, xt0 xt0, m61 m61, tm1 tm1, ii1 ii1, ou3<db2> ou3, Executor executor) {
        return new p41(n61, context, jr2, view, xt0, m61, tm1, ii1, ou3, executor);
    }

    /* renamed from: a */
    public final p41 zzb() {
        return new p41(((k81) this.f38529a).zzb(), this.f38530b.zzb(), ((x41) this.f38531c).mo35717a(), ((w41) this.f38532d).mo35551a(), ((i51) this.f38533e).mo32556a(), ((y41) this.f38534f).mo35871a(), ((sk1) this.f38535g).mo34717a(), this.f38536h.zzb(), tu3.m38016a(this.f38537i), this.f38538j.zzb());
    }
}
