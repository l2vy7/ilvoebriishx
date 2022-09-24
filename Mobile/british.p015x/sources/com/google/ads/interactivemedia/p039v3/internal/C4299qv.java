package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qv */
/* compiled from: IMASDK */
public class C4299qv {

    /* renamed from: a */
    protected final C4293qp f18452a;

    /* renamed from: b */
    protected final C4298qu f18453b;

    /* renamed from: c */
    protected C4295qr f18454c;

    /* renamed from: d */
    private final int f18455d;

    protected C4299qv(C4296qs qsVar, C4298qu quVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.f18453b = quVar;
        this.f18455d = i;
        this.f18452a = new C4293qp(qsVar, j, j2, j3, j4, j5);
    }

    /* renamed from: f */
    protected static final int m18682f(C4307rc rcVar, long j, C4321rq rqVar) {
        if (j == rcVar.mo16605l()) {
            return 0;
        }
        rqVar.f18533a = j;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m18683g(C4307rc rcVar, long j) throws IOException {
        long l = j - rcVar.mo16605l();
        if (l < 0 || l > 262144) {
            return false;
        }
        rcVar.mo16597d((int) l);
        return true;
    }

    /* renamed from: a */
    public final C4324rt mo16587a() {
        return this.f18452a;
    }

    /* renamed from: b */
    public final void mo16588b(long j) {
        long j2 = j;
        C4295qr qrVar = this.f18454c;
        if (qrVar == null || qrVar.f18440a != j2) {
            this.f18454c = new C4295qr(j, this.f18452a.mo16583d(j2), this.f18452a.f18436c, this.f18452a.f18437d, this.f18452a.f18438e, this.f18452a.f18439f);
        }
    }

    /* renamed from: c */
    public final boolean mo16589c() {
        return this.f18454c != null;
    }

    /* renamed from: d */
    public final int mo16590d(C4307rc rcVar, C4321rq rqVar) throws IOException {
        while (true) {
            C4295qr qrVar = this.f18454c;
            aup.m14889t(qrVar);
            long c = qrVar.f18445f;
            long d = qrVar.f18446g;
            long e = qrVar.f18447h;
            if (d - c <= ((long) this.f18455d)) {
                mo16591e();
                return m18682f(rcVar, c, rqVar);
            } else if (!m18683g(rcVar, e)) {
                return m18682f(rcVar, e, rqVar);
            } else {
                rcVar.mo16603j();
                C4297qt a = this.f18453b.mo16585a(rcVar, qrVar.f18441b);
                int d2 = a.f18449b;
                if (d2 == -3) {
                    mo16591e();
                    return m18682f(rcVar, e, rqVar);
                } else if (d2 == -2) {
                    C4295qr.m18671h(qrVar, a.f18450c, a.f18451d);
                } else if (d2 != -1) {
                    m18683g(rcVar, a.f18451d);
                    mo16591e();
                    return m18682f(rcVar, a.f18451d, rqVar);
                } else {
                    C4295qr.m18670g(qrVar, a.f18450c, a.f18451d);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16591e() {
        this.f18454c = null;
        this.f18453b.mo16586b();
    }
}
