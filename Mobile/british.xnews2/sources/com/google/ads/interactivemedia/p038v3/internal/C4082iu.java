package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.iu */
/* compiled from: IMASDK */
public abstract class C4082iu implements C4156ln, C4157lo {

    /* renamed from: a */
    private final int f17450a;

    /* renamed from: b */
    private final C4121kf f17451b = new C4121kf();

    /* renamed from: c */
    private C4158lp f17452c;

    /* renamed from: d */
    private int f17453d;

    /* renamed from: e */
    private int f17454e;

    /* renamed from: f */
    private ach f17455f;

    /* renamed from: g */
    private C4120ke[] f17456g;

    /* renamed from: h */
    private long f17457h;

    /* renamed from: i */
    private long f17458i = Long.MIN_VALUE;

    /* renamed from: j */
    private boolean f17459j;

    /* renamed from: k */
    private boolean f17460k;

    public C4082iu(int i) {
        this.f17450a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C4121kf mo15937A() {
        this.f17451b.mo16136a();
        return this.f17451b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final C4120ke[] mo15938B() {
        return (C4120ke[]) aup.m14890u(this.f17456g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final C4158lp mo15939C() {
        C4158lp lpVar = this.f17452c;
        aup.m14890u(lpVar);
        return lpVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final C4089ja mo15940D(Throwable th, C4120ke keVar) {
        return mo15941E(th, keVar, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final C4089ja mo15941E(Throwable th, C4120ke keVar, boolean z) {
        int i;
        if (keVar != null && !this.f17460k) {
            this.f17460k = true;
            try {
                int n = avr.m14972n(mo13724O(keVar));
                this.f17460k = false;
                i = n;
            } catch (C4089ja unused) {
                this.f17460k = false;
            } catch (Throwable th2) {
                this.f17460k = false;
                throw th2;
            }
            return C4089ja.m17489c(th, mo13720K(), this.f17453d, keVar, i, z);
        }
        i = 4;
        return C4089ja.m17489c(th, mo13720K(), this.f17453d, keVar, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo15942F(C4121kf kfVar, C4269ps psVar, int i) {
        ach ach = this.f17455f;
        aup.m14890u(ach);
        int d = ach.mo13226d(kfVar, psVar, i);
        if (d == -4) {
            if (psVar.mo16510c()) {
                this.f17458i = Long.MIN_VALUE;
                return this.f17459j ? -4 : -3;
            }
            long j = psVar.f18399d + this.f17457h;
            psVar.f18399d = j;
            this.f17458i = Math.max(this.f17458i, j);
        } else if (d == -5) {
            C4120ke keVar = kfVar.f17697b;
            aup.m14890u(keVar);
            if (keVar.f17685p != Long.MAX_VALUE) {
                C4119kd a = keVar.mo16126a();
                a.mo16124ai(keVar.f17685p + this.f17457h);
                kfVar.f17697b = a.mo16115a();
                return -5;
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo15943G(long j) {
        ach ach = this.f17455f;
        aup.m14890u(ach);
        return ach.mo13227e(j - this.f17457h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo15944H() {
        if (mo15954j()) {
            return this.f17459j;
        }
        ach ach = this.f17455f;
        aup.m14890u(ach);
        return ach.mo13224b();
    }

    /* renamed from: I */
    public void mo14027I(float f, float f2) throws C4089ja {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo13719J(long j, long j2) throws C4089ja {
        throw null;
    }

    /* renamed from: a */
    public final int mo15945a() {
        return this.f17450a;
    }

    /* renamed from: aX */
    public final void mo15946aX() throws C4089ja {
        boolean z = true;
        if (this.f17454e != 1) {
            z = false;
        }
        aup.m14887r(z);
        this.f17454e = 2;
        mo14056w();
    }

    /* renamed from: aY */
    public final void mo15947aY(C4120ke[] keVarArr, ach ach, long j, long j2) throws C4089ja {
        aup.m14887r(!this.f17459j);
        this.f17455f = ach;
        this.f17458i = j2;
        this.f17456g = keVarArr;
        this.f17457h = j2;
        mo13719J(j, j2);
    }

    /* renamed from: aZ */
    public final ach mo15948aZ() {
        return this.f17455f;
    }

    /* renamed from: b */
    public final C4157lo mo15949b() {
        return this;
    }

    /* renamed from: c */
    public final void mo15950c(int i) {
        this.f17453d = i;
    }

    /* renamed from: d */
    public alk mo15951d() {
        return null;
    }

    /* renamed from: e */
    public final int mo15952e() {
        return this.f17454e;
    }

    /* renamed from: f */
    public final void mo15953f(C4158lp lpVar, C4120ke[] keVarArr, ach ach, long j, boolean z, boolean z2, long j2, long j3) throws C4089ja {
        boolean z3 = z;
        aup.m14887r(this.f17454e == 0);
        this.f17452c = lpVar;
        this.f17454e = 1;
        mo14055u(z, z2);
        mo15947aY(keVarArr, ach, j2, j3);
        long j4 = j;
        mo13726v(j, z);
    }

    /* renamed from: j */
    public final boolean mo15954j() {
        return this.f17458i == Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final long mo15955k() {
        return this.f17458i;
    }

    /* renamed from: l */
    public final void mo15956l() {
        this.f17459j = true;
    }

    /* renamed from: m */
    public final boolean mo15957m() {
        return this.f17459j;
    }

    /* renamed from: n */
    public final void mo15958n() throws IOException {
        ach ach = this.f17455f;
        aup.m14890u(ach);
        ach.mo13225c();
    }

    /* renamed from: o */
    public final void mo15959o(long j) throws C4089ja {
        this.f17459j = false;
        this.f17458i = j;
        mo13726v(j, false);
    }

    /* renamed from: p */
    public final void mo15960p() {
        aup.m14887r(this.f17454e == 2);
        this.f17454e = 1;
        mo14057x();
    }

    /* renamed from: q */
    public final void mo15961q() {
        boolean z = true;
        if (this.f17454e != 1) {
            z = false;
        }
        aup.m14887r(z);
        this.f17451b.mo16136a();
        this.f17454e = 0;
        this.f17455f = null;
        this.f17456g = null;
        this.f17459j = false;
        mo13727y();
    }

    /* renamed from: r */
    public final void mo15962r() {
        aup.m14887r(this.f17454e == 0);
        this.f17451b.mo16136a();
        mo14058z();
    }

    /* renamed from: s */
    public int mo15963s() throws C4089ja {
        return 0;
    }

    /* renamed from: t */
    public void mo14054t(int i, Object obj) throws C4089ja {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo14055u(boolean z, boolean z2) throws C4089ja {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo13726v(long j, boolean z) throws C4089ja {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo14056w() throws C4089ja {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo14057x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo13727y() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo14058z() {
    }
}
