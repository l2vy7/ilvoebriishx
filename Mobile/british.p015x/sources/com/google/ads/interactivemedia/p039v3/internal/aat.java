package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aat */
/* compiled from: IMASDK */
public final class aat implements aaz, aay {

    /* renamed from: a */
    public final abb f13966a;

    /* renamed from: b */
    private final long f13967b;

    /* renamed from: c */
    private abd f13968c;

    /* renamed from: d */
    private aaz f13969d;

    /* renamed from: e */
    private aay f13970e;

    /* renamed from: f */
    private long f13971f = C6540C.TIME_UNSET;

    /* renamed from: g */
    private final ajl f13972g;

    public aat(abb abb, ajl ajl, long j) {
        this.f13966a = abb;
        this.f13972g = ajl;
        this.f13967b = j;
    }

    /* renamed from: v */
    private final long m12805v(long j) {
        long j2 = this.f13971f;
        return j2 != C6540C.TIME_UNSET ? j2 : j;
    }

    /* renamed from: a */
    public final void mo13228a(aay aay, long j) {
        this.f13970e = aay;
        aaz aaz = this.f13969d;
        if (aaz != null) {
            aaz.mo13228a(this, m12805v(this.f13967b));
        }
    }

    /* renamed from: b */
    public final void mo13229b() throws IOException {
        try {
            aaz aaz = this.f13969d;
            if (aaz != null) {
                aaz.mo13229b();
                return;
            }
            abd abd = this.f13968c;
            if (abd != null) {
                abd.mo13257u();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        aaz.mo13230bd(j);
    }

    /* renamed from: c */
    public final acq mo13231c() {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        return aaz.mo13231c();
    }

    /* renamed from: d */
    public final long mo13232d(aih[] aihArr, boolean[] zArr, ach[] achArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f13971f;
        if (j3 == C6540C.TIME_UNSET || j != this.f13967b) {
            j2 = j;
        } else {
            this.f13971f = C6540C.TIME_UNSET;
            j2 = j3;
        }
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        return aaz.mo13232d(aihArr, zArr, achArr, zArr2, j2);
    }

    /* renamed from: f */
    public final long mo13233f() {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        return aaz.mo13233f();
    }

    /* renamed from: g */
    public final long mo13234g() {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        return aaz.mo13234g();
    }

    /* renamed from: h */
    public final long mo13235h(long j) {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        return aaz.mo13235h(j);
    }

    /* renamed from: i */
    public final long mo13236i(long j, C4159lq lqVar) {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        return aaz.mo13236i(j, lqVar);
    }

    /* renamed from: j */
    public final void mo13237j(aaz aaz) {
        aay aay = this.f13970e;
        int i = amm.f15298a;
        aay.mo13237j(this);
    }

    /* renamed from: k */
    public final long mo13238k() {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        return aaz.mo13238k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo13239l(acj acj) {
        aaz aaz = (aaz) acj;
        aay aay = this.f13970e;
        int i = amm.f15298a;
        aay.mo13239l(this);
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        aaz aaz = this.f13969d;
        return aaz != null && aaz.mo13240m(j);
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        aaz aaz = this.f13969d;
        return aaz != null && aaz.mo13241n();
    }

    /* renamed from: o */
    public final long mo13300o() {
        return this.f13967b;
    }

    /* renamed from: p */
    public final void mo13243p(long j) {
        aaz aaz = this.f13969d;
        int i = amm.f15298a;
        aaz.mo13243p(j);
    }

    /* renamed from: q */
    public final void mo13301q(long j) {
        this.f13971f = j;
    }

    /* renamed from: r */
    public final long mo13302r() {
        return this.f13971f;
    }

    /* renamed from: s */
    public final void mo13303s(abd abd) {
        aup.m14887r(this.f13968c == null);
        this.f13968c = abd;
    }

    /* renamed from: t */
    public final void mo13304t(abb abb) {
        long v = m12805v(this.f13967b);
        abd abd = this.f13968c;
        aup.m14890u(abd);
        aaz W = abd.mo13275W(abb, this.f13972g, v);
        this.f13969d = W;
        if (this.f13970e != null) {
            W.mo13228a(this, v);
        }
    }

    /* renamed from: u */
    public final void mo13305u() {
        if (this.f13969d != null) {
            abd abd = this.f13968c;
            aup.m14890u(abd);
            abd.mo13274V(this.f13969d);
        }
    }
}
