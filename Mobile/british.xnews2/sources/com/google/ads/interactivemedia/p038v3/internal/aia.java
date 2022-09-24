package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aia */
/* compiled from: IMASDK */
public final class aia extends aim {

    /* renamed from: d */
    private int f14940d;

    /* renamed from: e */
    private int f14941e;

    /* renamed from: f */
    private int f14942f;

    /* renamed from: g */
    private int f14943g;

    /* renamed from: h */
    private boolean f14944h;

    /* renamed from: i */
    private boolean f14945i;

    /* renamed from: j */
    private int f14946j;

    /* renamed from: k */
    private int f14947k;

    /* renamed from: l */
    private boolean f14948l;

    /* renamed from: m */
    private atz<String> f14949m;

    /* renamed from: n */
    private int f14950n;

    /* renamed from: o */
    private int f14951o;

    /* renamed from: p */
    private boolean f14952p;

    /* renamed from: q */
    private atz<String> f14953q;

    /* renamed from: r */
    private boolean f14954r;

    /* renamed from: s */
    private boolean f14955s;

    /* renamed from: t */
    private final SparseArray<Map<acq, aic>> f14956t = new SparseArray<>();

    /* renamed from: u */
    private final SparseBooleanArray f14957u = new SparseBooleanArray();

    @Deprecated
    public aia() {
        m13757c();
    }

    /* renamed from: c */
    private final void m13757c() {
        this.f14940d = Integer.MAX_VALUE;
        this.f14941e = Integer.MAX_VALUE;
        this.f14942f = Integer.MAX_VALUE;
        this.f14943g = Integer.MAX_VALUE;
        this.f14944h = true;
        this.f14945i = true;
        this.f14946j = Integer.MAX_VALUE;
        this.f14947k = Integer.MAX_VALUE;
        this.f14948l = true;
        this.f14949m = atz.m14807i();
        this.f14950n = Integer.MAX_VALUE;
        this.f14951o = Integer.MAX_VALUE;
        this.f14952p = true;
        this.f14953q = atz.m14807i();
        this.f14954r = true;
        this.f14955s = true;
    }

    /* renamed from: a */
    public final ahz mo13760a() {
        return new ahz(this.f14940d, this.f14941e, this.f14942f, this.f14943g, this.f14944h, this.f14945i, this.f14946j, this.f14947k, this.f14948l, this.f14949m, this.f14993a, this.f14950n, this.f14951o, this.f14952p, this.f14953q, this.f14994b, this.f14995c, this.f14954r, this.f14955s, this.f14956t, this.f14957u);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo13761b(Context context) {
        super.mo13761b(context);
    }

    public aia(Context context) {
        mo13761b(context);
        m13757c();
        Point ag = amm.m14217ag(context);
        int i = ag.x;
        int i2 = ag.y;
        this.f14946j = i;
        this.f14947k = i2;
        this.f14948l = true;
    }
}
