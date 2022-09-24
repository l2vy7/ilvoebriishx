package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ne */
/* compiled from: IMASDK */
public final class C4201ne implements C4149lg, C4226oc, ano, abk, aiy, C4282qe {

    /* renamed from: a */
    private final aks f18047a;

    /* renamed from: b */
    private final C4168lz f18048b;

    /* renamed from: c */
    private final C4170ma f18049c = new C4170ma();

    /* renamed from: d */
    private final C4200nd f18050d;

    /* renamed from: e */
    private final SparseArray<C4202nf> f18051e;

    /* renamed from: f */
    private alh<C4203ng> f18052f;

    /* renamed from: g */
    private C4150lh f18053g;

    /* renamed from: h */
    private boolean f18054h;

    public C4201ne(aks aks) {
        this.f18047a = aks;
        this.f18052f = new alh<>(amm.m14245o(), aks, C4174me.f17951a);
        C4168lz lzVar = new C4168lz();
        this.f18048b = lzVar;
        this.f18050d = new C4200nd(lzVar);
        this.f18051e = new SparseArray<>();
    }

    /* renamed from: aa */
    private final C4202nf m18144aa(abb abb) {
        C4171mb mbVar;
        aup.m14890u(this.f18053g);
        if (abb == null) {
            mbVar = null;
        } else {
            mbVar = this.f18050d.mo16348e(abb);
        }
        if (abb != null && mbVar != null) {
            return mo16361Y(mbVar, mbVar.mo15925g(abb.f13998a, this.f18048b).f17914c, abb);
        }
        int n = this.f18053g.mo16010n();
        C4171mb v = this.f18053g.mo16018v();
        if (n >= v.mo13271t()) {
            v = C4171mb.f17942a;
        }
        return mo16361Y(v, n, (abb) null);
    }

    /* renamed from: ab */
    private final C4202nf m18145ab() {
        return m18144aa(this.f18050d.mo16345b());
    }

    /* renamed from: ac */
    private final C4202nf m18146ac() {
        return m18144aa(this.f18050d.mo16346c());
    }

    /* renamed from: ad */
    private final C4202nf m18147ad(int i, abb abb) {
        aup.m14890u(this.f18053g);
        if (abb == null) {
            C4171mb v = this.f18053g.mo16018v();
            if (i >= v.mo13271t()) {
                v = C4171mb.f17942a;
            }
            return mo16361Y(v, i, (abb) null);
        } else if (this.f18050d.mo16348e(abb) != null) {
            return m18144aa(abb);
        } else {
            return mo16361Y(C4171mb.f17942a, i, abb);
        }
    }

    /* renamed from: A */
    public final void mo14117A(String str) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1024, new C4178mi(ac, str));
    }

    /* renamed from: B */
    public final void mo14118B(C4266pp ppVar) {
        C4202nf ab = m18145ab();
        mo16359W(ab, 1025, new C4176mg(ab, ppVar, (char[]) null));
    }

    /* renamed from: C */
    public final void mo14119C(long j, int i) {
        C4202nf ab = m18145ab();
        mo16359W(ab, 1026, new C4181ml(ab, j, i));
    }

    /* renamed from: D */
    public final void mo14120D(Exception exc) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1038, new C4175mf(ac, exc, (char[]) null));
    }

    /* renamed from: E */
    public final void mo16278E(C4266pp ppVar) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1008, new C4176mg(ac, ppVar, (short[]) null));
    }

    /* renamed from: F */
    public final void mo16279F(String str, long j, long j2) {
        C4202nf ac = m18146ac();
        mo16359W(ac, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new C4195mz(ac, str, j2, j));
    }

    /* renamed from: G */
    public final void mo16280G(C4120ke keVar, C4270pt ptVar) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1010, new C4197na(ac, keVar, ptVar));
    }

    /* renamed from: H */
    public final void mo16281H(long j) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1011, new C4198nb(ac, j));
    }

    /* renamed from: I */
    public final void mo16282I(int i, long j, long j2) {
        C4202nf ac = m18146ac();
        mo16359W(ac, AnalyticsListener.EVENT_AUDIO_UNDERRUN, new C4199nc(ac, i, j, j2));
    }

    /* renamed from: J */
    public final void mo16283J(String str) {
        C4202nf ac = m18146ac();
        mo16359W(ac, AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new C4178mi(ac, str, (byte[]) null));
    }

    /* renamed from: K */
    public final void mo16284K(C4266pp ppVar) {
        C4202nf ab = m18145ab();
        mo16359W(ab, AnalyticsListener.EVENT_AUDIO_DISABLED, new C4176mg(ab, ppVar, (byte[]) null));
    }

    /* renamed from: L */
    public final void mo16285L(boolean z) {
        C4202nf ac = m18146ac();
        mo16359W(ac, AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED, new C4189mt(ac, z, (byte[]) null));
    }

    /* renamed from: M */
    public final void mo16286M(Exception exc) {
        C4202nf ac = m18146ac();
        mo16359W(ac, AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new C4175mf(ac, exc, (byte[]) null));
    }

    /* renamed from: N */
    public final void mo16287N(Exception exc) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1037, new C4175mf(ac, exc));
    }

    /* renamed from: O */
    public final void mo16352O(C4203ng ngVar) {
        aup.m14890u(ngVar);
        this.f18052f.mo13901b(ngVar);
    }

    /* renamed from: P */
    public final void mo16353P(C4203ng ngVar) {
        this.f18052f.mo13902c(ngVar);
    }

    /* renamed from: Q */
    public final void mo16354Q(C4150lh lhVar, Looper looper) {
        boolean z = true;
        if (this.f18053g != null && !this.f18050d.f18042b.isEmpty()) {
            z = false;
        }
        aup.m14887r(z);
        this.f18053g = lhVar;
        this.f18052f = this.f18052f.mo13900a(looper, new C4177mh(this, lhVar));
    }

    /* renamed from: R */
    public final void mo16355R() {
        C4202nf X = mo16360X();
        this.f18051e.put(1036, X);
        this.f18052f.mo13908i(new C4190mu(X, (byte[]) null));
    }

    /* renamed from: S */
    public final void mo16356S(List<abb> list, abb abb) {
        C4200nd ndVar = this.f18050d;
        C4150lh lhVar = this.f18053g;
        aup.m14890u(lhVar);
        ndVar.mo16351h(list, abb, lhVar);
    }

    /* renamed from: T */
    public final void mo16357T() {
        if (!this.f18054h) {
            C4202nf X = mo16360X();
            this.f18054h = true;
            mo16359W(X, -1, new C4190mu(X));
        }
    }

    /* renamed from: U */
    public final void mo16358U(int i, int i2) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1029, new C4182mm(ac, i, i2));
    }

    /* renamed from: V */
    public final void mo13792V(int i, long j, long j2) {
        C4202nf aa = m18144aa(this.f18050d.mo16347d());
        mo16359W(aa, 1006, new C4199nc(aa, i, j, j2, (byte[]) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo16359W(C4202nf nfVar, int i, ale<C4203ng> ale) {
        this.f18051e.put(i, nfVar);
        this.f18052f.mo13905f(i, ale);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final C4202nf mo16360X() {
        return m18144aa(this.f18050d.mo16344a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final C4202nf mo16361Y(C4171mb mbVar, int i, abb abb) {
        C4171mb mbVar2 = mbVar;
        int i2 = i;
        boolean z = true;
        abb abb2 = true == mbVar.mo16333v() ? null : abb;
        long a = this.f18047a.mo13857a();
        if (!mbVar2.equals(this.f18053g.mo16018v()) || i2 != this.f18053g.mo16010n()) {
            z = false;
        }
        long j = 0;
        if (abb2 == null || !abb2.mo13312b()) {
            if (z) {
                j = this.f18053g.mo16017u();
            } else if (!mbVar.mo16333v()) {
                j = mbVar2.mo16334w(i2, this.f18049c).mo16325a();
            }
        } else if (z && this.f18053g.mo16015s() == abb2.f13999b && this.f18053g.mo16016t() == abb2.f14000c) {
            j = this.f18053g.mo16012p();
        }
        return new C4202nf(a, mbVar, i, abb2, j, this.f18053g.mo16018v(), this.f18053g.mo16010n(), this.f18050d.mo16344a(), this.f18053g.mo16012p(), this.f18053g.mo16013q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final /* synthetic */ void mo16362Z(C4150lh lhVar, C4203ng ngVar, akz akz) {
        new C4257pg(akz, this.f18051e);
        ngVar.mo15842z();
    }

    /* renamed from: a */
    public final void mo13245a(int i, abb abb, aas aas, aax aax) {
        C4202nf ad = m18147ad(i, abb);
        mo16359W(ad, 1000, new C4183mn(ad, aas, aax, (byte[]) null));
    }

    /* renamed from: ae */
    public final void mo13246ae(int i, abb abb, aas aas, aax aax) {
        C4202nf ad = m18147ad(i, abb);
        mo16359W(ad, 1002, new C4183mn(ad, aas, aax, (char[]) null));
    }

    /* renamed from: af */
    public final void mo13247af(int i, abb abb, aas aas, aax aax, IOException iOException, boolean z) {
        C4202nf ad = m18147ad(i, abb);
        mo16359W(ad, 1003, new C4184mo(ad, aas, aax, iOException, z));
    }

    /* renamed from: ag */
    public final void mo13248ag(int i, abb abb, aax aax) {
        C4202nf ad = m18147ad(i, abb);
        mo16359W(ad, 1005, new C4185mp(ad, aax, (byte[]) null));
    }

    /* renamed from: ah */
    public final void mo13249ah(int i, abb abb, aax aax) {
        C4202nf ad = m18147ad(i, abb);
        mo16359W(ad, 1004, new C4185mp(ad, aax));
    }

    /* renamed from: b */
    public final void mo13250b(int i, abb abb, aas aas, aax aax) {
        C4202nf ad = m18147ad(i, abb);
        mo16359W(ad, 1001, new C4183mn(ad, aas, aax));
    }

    /* renamed from: c */
    public final void mo14121c(C4266pp ppVar) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1020, new C4176mg(ac, ppVar));
    }

    /* renamed from: d */
    public final void mo14122d(String str, long j, long j2) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1021, new C4195mz(ac, str, j2, j, (byte[]) null));
    }

    /* renamed from: e */
    public final void mo14123e(C4120ke keVar, C4270pt ptVar) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1022, new C4197na(ac, keVar, ptVar, (byte[]) null));
    }

    /* renamed from: f */
    public final void mo14124f(int i, long j) {
        C4202nf ab = m18145ab();
        mo16359W(ab, 1023, new C4181ml(ab, i, j));
    }

    /* renamed from: g */
    public final void mo16232g(C4129kn knVar, int i) {
        C4202nf X = mo16360X();
        mo16359W(X, 1, new C4186mq(X, knVar, i));
    }

    /* renamed from: h */
    public final void mo16233h(acq acq, ail ail) {
        C4202nf X = mo16360X();
        mo16359W(X, 2, new C4187mr(X, acq, ail));
    }

    /* renamed from: i */
    public final void mo16234i(List<C4507yn> list) {
        C4202nf X = mo16360X();
        mo16359W(X, 3, new C4188ms(X, list));
    }

    /* renamed from: j */
    public final void mo16235j(boolean z) {
        C4202nf X = mo16360X();
        mo16359W(X, 4, new C4189mt(X, z));
    }

    /* renamed from: k */
    public final void mo16236k(boolean z, int i) {
        C4202nf X = mo16360X();
        mo16359W(X, -1, new C4192mw(X, z, i, (byte[]) null));
    }

    /* renamed from: l */
    public final void mo16237l(int i) {
        C4202nf X = mo16360X();
        mo16359W(X, 5, new C4191mv(X, i));
    }

    /* renamed from: m */
    public final void mo16238m(boolean z, int i) {
        C4202nf X = mo16360X();
        mo16359W(X, 6, new C4192mw(X, z, i));
    }

    /* renamed from: n */
    public final void mo16239n(int i) {
        C4202nf X = mo16360X();
        mo16359W(X, 7, new C4191mv(X, i, (char[]) null));
    }

    /* renamed from: o */
    public final void mo16240o(boolean z) {
        C4202nf X = mo16360X();
        mo16359W(X, 8, new C4189mt(X, z, (char[]) null));
    }

    /* renamed from: p */
    public final void mo16241p(C4089ja jaVar) {
        C4202nf nfVar;
        aba aba = jaVar.f17513g;
        if (aba != null) {
            nfVar = m18144aa(new abb(aba));
        } else {
            nfVar = mo16360X();
        }
        mo16359W(nfVar, 11, new C4193mx(nfVar, jaVar));
    }

    /* renamed from: q */
    public final void mo16242q(int i) {
        if (i == 1) {
            this.f18054h = false;
            i = 1;
        }
        C4200nd ndVar = this.f18050d;
        C4150lh lhVar = this.f18053g;
        aup.m14890u(lhVar);
        ndVar.mo16349f(lhVar);
        C4202nf X = mo16360X();
        mo16359W(X, 12, new C4191mv(X, i, (short[]) null));
    }

    /* renamed from: r */
    public final void mo16243r(C4146ld ldVar) {
        C4202nf X = mo16360X();
        mo16359W(X, 13, new C4194my(X, ldVar));
    }

    /* renamed from: s */
    public final void mo16244s() {
        C4202nf X = mo16360X();
        mo16359W(X, -1, new C4190mu(X, (char[]) null));
    }

    /* renamed from: t */
    public final void mo16245t() {
    }

    /* renamed from: u */
    public final void mo16246u() {
    }

    /* renamed from: v */
    public final void mo16247v() {
    }

    /* renamed from: w */
    public final void mo16248w(int i) {
        C4200nd ndVar = this.f18050d;
        C4150lh lhVar = this.f18053g;
        aup.m14890u(lhVar);
        ndVar.mo16350g(lhVar);
        C4202nf X = mo16360X();
        mo16359W(X, 0, new C4191mv(X, i, (byte[]) null));
    }

    /* renamed from: x */
    public final void mo16249x() {
    }

    /* renamed from: y */
    public final void mo14125y(int i, int i2, int i3, float f) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1028, new C4179mj(ac, i, i2, i3, f));
    }

    /* renamed from: z */
    public final void mo14126z(Surface surface, long j) {
        C4202nf ac = m18146ac();
        mo16359W(ac, 1027, new C4180mk(ac, surface, j));
    }
}
