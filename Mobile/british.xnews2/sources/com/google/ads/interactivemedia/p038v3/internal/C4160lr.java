package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.SimpleExoPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lr */
/* compiled from: IMASDK */
public final class C4160lr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f17857a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public aks f17858b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public aio f17859c;

    /* renamed from: d */
    private abl f17860d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public aiz f17861e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4201ne f17862f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Looper f17863g = amm.m14245o();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4210nn f17864h = C4210nn.f18088a;

    /* renamed from: i */
    private final int f17865i = 1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f17866j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C4159lq f17867k = C4159lq.f17854b;

    /* renamed from: l */
    private final long f17868l;

    /* renamed from: m */
    private final long f17869m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C3993fm f17870n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C4085ix f17871o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C4084iw f17872p = C4130ko.m17745a(0.97f, 1.03f, 1000, 1.0E-7f, C4083iv.m17452b(20), C4083iv.m17452b(500), 0.999f);

    public C4160lr(Context context, C3993fm fmVar) {
        Context context2 = context;
        C4303qz qzVar = new C4303qz();
        aif aif = new aif(ahz.m13753a(context), new aht());
        aan aan = new aan(new ajp(context2), qzVar);
        C4085ix ixVar = new C4085ix();
        ajn d = ajn.m13862d(context);
        aks aks = aks.f15177a;
        C4201ne neVar = new C4201ne(aks);
        this.f17857a = context2;
        this.f17870n = fmVar;
        this.f17859c = aif;
        this.f17860d = aan;
        this.f17871o = ixVar;
        this.f17861e = d;
        this.f17862f = neVar;
        this.f17858b = aks;
        this.f17868l = 500;
        this.f17869m = SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    /* renamed from: m */
    public final void mo16270m(C4201ne neVar) {
        aup.m14887r(true);
        this.f17862f = neVar;
    }

    /* renamed from: n */
    public final void mo16271n(aiz aiz) {
        aup.m14887r(true);
        this.f17861e = aiz;
    }

    /* renamed from: o */
    public final void mo16272o(aks aks) {
        aup.m14887r(true);
        this.f17858b = aks;
    }

    /* renamed from: p */
    public final void mo16273p(C4085ix ixVar) {
        aup.m14887r(true);
        this.f17871o = ixVar;
    }

    /* renamed from: q */
    public final void mo16274q(Looper looper) {
        aup.m14887r(true);
        this.f17863g = looper;
    }

    /* renamed from: r */
    public final void mo16275r(abl abl) {
        aup.m14887r(true);
        this.f17860d = abl;
    }

    /* renamed from: s */
    public final void mo16276s(aio aio) {
        aup.m14887r(true);
        this.f17859c = aio;
    }

    /* renamed from: t */
    public final void mo16277t() {
        aup.m14887r(true);
        this.f17866j = true;
    }
}
