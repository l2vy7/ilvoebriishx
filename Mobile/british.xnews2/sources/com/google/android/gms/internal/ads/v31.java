package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v31 extends o61 {

    /* renamed from: i */
    private final View f40283i;

    /* renamed from: j */
    private final xt0 f40284j;

    /* renamed from: k */
    private final jr2 f40285k;

    /* renamed from: l */
    private final int f40286l;

    /* renamed from: m */
    private final boolean f40287m;

    /* renamed from: n */
    private final boolean f40288n;

    /* renamed from: o */
    private final m31 f40289o;

    /* renamed from: p */
    private C7691fp f40290p;

    v31(n61 n61, View view, xt0 xt0, jr2 jr2, int i, boolean z, boolean z2, m31 m31) {
        super(n61);
        this.f40283i = view;
        this.f40284j = xt0;
        this.f40285k = jr2;
        this.f40286l = i;
        this.f40287m = z;
        this.f40288n = z2;
        this.f40289o = m31;
    }

    /* renamed from: h */
    public final int mo35356h() {
        return this.f40286l;
    }

    /* renamed from: i */
    public final View mo35357i() {
        return this.f40283i;
    }

    /* renamed from: j */
    public final jr2 mo35358j() {
        return fs2.m32244b(this.f36294b.f33493s, this.f40285k);
    }

    /* renamed from: k */
    public final void mo35359k(C8271vo voVar) {
        this.f40284j.mo18798y(voVar);
    }

    /* renamed from: l */
    public final boolean mo35360l() {
        return this.f40287m;
    }

    /* renamed from: m */
    public final boolean mo35361m() {
        return this.f40288n;
    }

    /* renamed from: n */
    public final boolean mo35362n() {
        return this.f40284j.mo18756j();
    }

    /* renamed from: o */
    public final boolean mo35363o() {
        return this.f40284j.mo18793u0() != null && this.f40284j.mo18793u0().zzJ();
    }

    /* renamed from: p */
    public final void mo35364p(long j, int i) {
        this.f40289o.mo33465a(j, i);
    }

    /* renamed from: q */
    public final C7691fp mo35365q() {
        return this.f40290p;
    }

    /* renamed from: r */
    public final void mo35366r(C7691fp fpVar) {
        this.f40290p = fpVar;
    }
}
