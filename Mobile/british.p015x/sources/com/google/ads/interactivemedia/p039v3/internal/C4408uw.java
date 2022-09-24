package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uw */
/* compiled from: IMASDK */
public final class C4408uw implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f19106a = 0;

    /* renamed from: b */
    private C4309re f19107b;

    /* renamed from: c */
    private C4416vd f19108c;

    /* renamed from: d */
    private boolean f19109d;

    static {
        int i = C4407uv.f19105b;
    }

    /* renamed from: a */
    private final boolean m19173a(C4307rc rcVar) throws IOException {
        C4410uy uyVar = new C4410uy();
        if (uyVar.mo16700d(rcVar, true) && (uyVar.f19116b & 2) == 2) {
            int min = Math.min(uyVar.f19120f, 8);
            alw alw = new alw(min);
            rcVar.mo16600g(alw.mo13952j(), 0, min);
            m19174b(alw);
            if (alw.mo13947e() >= 5 && alw.mo13957o() == 127 && alw.mo13963u() == 1179402563) {
                this.f19108c = new C4406uu();
            } else {
                m19174b(alw);
                try {
                    if (ajq.m13890d(1, alw, true)) {
                        this.f19108c = new C4418vf();
                    }
                } catch (C4144lb unused) {
                }
                m19174b(alw);
                if (C4413va.m19196d(alw)) {
                    this.f19108c = new C4413va();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m19174b(alw alw) {
        alw.mo13951i(0);
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        try {
            return m19173a(rcVar);
        } catch (C4144lb unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f19107b = reVar;
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        aup.m14889t(this.f19107b);
        if (this.f19108c == null) {
            if (m19173a(rcVar)) {
                rcVar.mo16603j();
            } else {
                throw new C4144lb("Failed to determine bitstream type");
            }
        }
        if (!this.f19109d) {
            C4327rw ba = this.f19107b.mo13362ba(0, 1);
            this.f19107b.mo13363bb();
            this.f19108c.mo16701e(this.f19107b, ba);
            this.f19109d = true;
        }
        return this.f19108c.mo16703g(rcVar, rqVar);
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        C4416vd vdVar = this.f19108c;
        if (vdVar != null) {
            vdVar.mo16702f(j, j2);
        }
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
