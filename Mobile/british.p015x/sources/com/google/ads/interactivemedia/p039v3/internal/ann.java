package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ann */
/* compiled from: IMASDK */
public final class ann {

    /* renamed from: a */
    private final Handler f15451a;

    /* renamed from: b */
    private final ano f15452b;

    public ann(Handler handler, ano ano) {
        this.f15451a = ano == null ? null : handler;
        this.f15452b = ano;
    }

    /* renamed from: a */
    public final void mo14097a(C4266pp ppVar) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new anl(this, ppVar, (byte[]) null));
        }
    }

    /* renamed from: b */
    public final void mo14098b(String str, long j, long j2) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new anf(this, str, j, j2));
        }
    }

    /* renamed from: c */
    public final void mo14099c(C4120ke keVar, C4270pt ptVar) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new ang(this, keVar, ptVar));
        }
    }

    /* renamed from: d */
    public final void mo14100d(int i, long j) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new anh(this, i, j));
        }
    }

    /* renamed from: e */
    public final void mo14101e(long j, int i) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new anh(this, j, i));
        }
    }

    /* renamed from: f */
    public final void mo14102f(int i, int i2, int i3, float f) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new ani(this, i, i2, i3, f));
        }
    }

    /* renamed from: g */
    public final void mo14103g(Surface surface) {
        if (this.f15451a != null) {
            this.f15451a.post(new anj(this, surface, SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: h */
    public final void mo14104h(String str) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new ank(this, str));
        }
    }

    /* renamed from: i */
    public final void mo14105i(C4266pp ppVar) {
        ppVar.mo16519a();
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new anl(this, ppVar));
        }
    }

    /* renamed from: j */
    public final void mo14106j(Exception exc) {
        Handler handler = this.f15451a;
        if (handler != null) {
            handler.post(new anm(this, exc));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo14107k(Exception exc) {
        ano ano = this.f15452b;
        int i = amm.f15298a;
        ano.mo14120D(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo14108l(C4266pp ppVar) {
        ppVar.mo16519a();
        ano ano = this.f15452b;
        int i = amm.f15298a;
        ano.mo14118B(ppVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo14109m(String str) {
        ano ano = this.f15452b;
        int i = amm.f15298a;
        ano.mo14117A(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo14110n(Surface surface, long j) {
        int i = amm.f15298a;
        this.f15452b.mo14126z(surface, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo14111o(int i, int i2, int i3, float f) {
        ano ano = this.f15452b;
        int i4 = amm.f15298a;
        ano.mo14125y(i, i2, i3, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo14112p(long j, int i) {
        ano ano = this.f15452b;
        int i2 = amm.f15298a;
        ano.mo14119C(j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo14113q(int i, long j) {
        ano ano = this.f15452b;
        int i2 = amm.f15298a;
        ano.mo14124f(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo14114r(C4120ke keVar, C4270pt ptVar) {
        int i = amm.f15298a;
        this.f15452b.mo14123e(keVar, ptVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo14115s(String str, long j, long j2) {
        ano ano = this.f15452b;
        int i = amm.f15298a;
        ano.mo14122d(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo14116t(C4266pp ppVar) {
        ano ano = this.f15452b;
        int i = amm.f15298a;
        ano.mo14121c(ppVar);
    }
}
