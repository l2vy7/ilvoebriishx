package com.google.ads.interactivemedia.p039v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uy */
/* compiled from: IMASDK */
final class C4410uy {

    /* renamed from: a */
    public int f19115a;

    /* renamed from: b */
    public int f19116b;

    /* renamed from: c */
    public long f19117c;

    /* renamed from: d */
    public int f19118d;

    /* renamed from: e */
    public int f19119e;

    /* renamed from: f */
    public int f19120f;

    /* renamed from: g */
    public final int[] f19121g = new int[255];

    /* renamed from: h */
    private final alw f19122h = new alw(255);

    C4410uy() {
    }

    /* renamed from: e */
    private static boolean m19186e(C4307rc rcVar, byte[] bArr, int i, boolean z) throws IOException {
        try {
            return rcVar.mo16599f(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo16697a() {
        this.f19115a = 0;
        this.f19116b = 0;
        this.f19117c = 0;
        this.f19118d = 0;
        this.f19119e = 0;
        this.f19120f = 0;
    }

    /* renamed from: b */
    public final boolean mo16698b(C4307rc rcVar) throws IOException {
        return mo16699c(rcVar, -1);
    }

    /* renamed from: c */
    public final boolean mo16699c(C4307rc rcVar, long j) throws IOException {
        aup.m14885p(rcVar.mo16605l() == rcVar.mo16604k());
        this.f19122h.mo13943a(4);
        while (true) {
            if ((j == -1 || rcVar.mo16605l() + 4 < j) && m19186e(rcVar, this.f19122h.mo13952j(), 4, true)) {
                this.f19122h.mo13951i(0);
                if (this.f19122h.mo13963u() == 1332176723) {
                    rcVar.mo16603j();
                    return true;
                }
                rcVar.mo16597d(1);
            }
        }
        do {
            if ((j != -1 && rcVar.mo16605l() >= j) || rcVar.mo16607n() == -1) {
                return false;
            }
            break;
        } while (rcVar.mo16607n() == -1);
        return false;
    }

    /* renamed from: d */
    public final boolean mo16700d(C4307rc rcVar, boolean z) throws IOException {
        mo16697a();
        this.f19122h.mo13943a(27);
        if (!m19186e(rcVar, this.f19122h.mo13952j(), 27, z) || this.f19122h.mo13963u() != 1332176723) {
            return false;
        }
        int o = this.f19122h.mo13957o();
        this.f19115a = o;
        if (o == 0) {
            this.f19116b = this.f19122h.mo13957o();
            this.f19117c = this.f19122h.mo13968z();
            this.f19122h.mo13964v();
            this.f19122h.mo13964v();
            this.f19122h.mo13964v();
            int o2 = this.f19122h.mo13957o();
            this.f19118d = o2;
            this.f19119e = o2 + 27;
            this.f19122h.mo13943a(o2);
            rcVar.mo16600g(this.f19122h.mo13952j(), 0, this.f19118d);
            for (int i = 0; i < this.f19118d; i++) {
                this.f19121g[i] = this.f19122h.mo13957o();
                this.f19120f += this.f19121g[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new C4144lb("unsupported bit stream revision");
        }
    }
}
