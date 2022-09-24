package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v64 extends gi0 {

    /* renamed from: h */
    private static final Object f40324h = new Object();

    /* renamed from: i */
    private static final C7764ho f40325i;

    /* renamed from: c */
    private final long f40326c;

    /* renamed from: d */
    private final long f40327d;

    /* renamed from: e */
    private final boolean f40328e;

    /* renamed from: f */
    private final C7764ho f40329f;

    /* renamed from: g */
    private final C7831jh f40330g;

    static {
        C7490a4 a4Var = new C7490a4();
        a4Var.mo30301a("SinglePeriodTimeline");
        a4Var.mo30302b(Uri.EMPTY);
        f40325i = a4Var.mo30303c();
    }

    public v64(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C7764ho hoVar, C7831jh jhVar) {
        this.f40326c = j4;
        this.f40327d = j5;
        this.f40328e = z;
        this.f40329f = hoVar;
        this.f40330g = jhVar;
    }

    /* renamed from: a */
    public final int mo32133a(Object obj) {
        return f40324h.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo31950b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo31951c() {
        return 1;
    }

    /* renamed from: d */
    public final gf0 mo31484d(int i, gf0 gf0, boolean z) {
        nu1.m20742a(i, 0, 1);
        gf0.mo32112j((Object) null, z ? f40324h : null, 0, this.f40326c, 0, r51.f38540c, false);
        return gf0;
    }

    /* renamed from: e */
    public final gh0 mo31485e(int i, gh0 gh0, long j) {
        nu1.m20742a(i, 0, 1);
        gh0.mo32125a(gh0.f32305o, this.f40329f, (Object) null, C6540C.TIME_UNSET, C6540C.TIME_UNSET, C6540C.TIME_UNSET, this.f40328e, false, this.f40330g, 0, this.f40327d, 0, 0, 0);
        return gh0;
    }

    /* renamed from: f */
    public final Object mo32135f(int i) {
        nu1.m20742a(i, 0, 1);
        return f40324h;
    }
}
