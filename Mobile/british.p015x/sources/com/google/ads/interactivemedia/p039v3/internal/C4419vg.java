package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vg */
/* compiled from: IMASDK */
public final class C4419vg implements C4306rb {

    /* renamed from: a */
    private final C4120ke f19156a;

    /* renamed from: b */
    private final alw f19157b = new alw(9);

    /* renamed from: c */
    private C4327rw f19158c;

    /* renamed from: d */
    private int f19159d = 0;

    /* renamed from: e */
    private int f19160e;

    /* renamed from: f */
    private long f19161f;

    /* renamed from: g */
    private int f19162g;

    /* renamed from: h */
    private int f19163h;

    public C4419vg(C4120ke keVar) {
        this.f19156a = keVar;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        this.f19157b.mo13943a(8);
        rcVar.mo16600g(this.f19157b.mo13952j(), 0, 8);
        if (this.f19157b.mo13965w() == 1380139777) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        reVar.mo13364bc(new C4323rs(C6540C.TIME_UNSET));
        C4327rw ba = reVar.mo13362ba(0, 3);
        this.f19158c = ba;
        ba.mo13403a(this.f19156a);
        reVar.mo13363bb();
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        aup.m14889t(this.f19158c);
        while (true) {
            int i = this.f19159d;
            if (i == 0) {
                this.f19157b.mo13943a(8);
                if (!rcVar.mo16595b(this.f19157b.mo13952j(), 0, 8, true)) {
                    return -1;
                }
                if (this.f19157b.mo13965w() == 1380139777) {
                    this.f19160e = this.f19157b.mo13957o();
                    this.f19159d = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i != 1) {
                while (this.f19162g > 0) {
                    this.f19157b.mo13943a(3);
                    rcVar.mo16596c(this.f19157b.mo13952j(), 0, 3);
                    this.f19158c.mo13406d(this.f19157b, 3);
                    this.f19163h += 3;
                    this.f19162g--;
                }
                int i2 = this.f19163h;
                if (i2 > 0) {
                    this.f19158c.mo13404b(this.f19161f, 1, i2, 0, (C4326rv) null);
                }
                this.f19159d = 1;
                return 0;
            } else {
                int i3 = this.f19160e;
                if (i3 == 0) {
                    this.f19157b.mo13943a(5);
                    if (!rcVar.mo16595b(this.f19157b.mo13952j(), 0, 5, true)) {
                        break;
                    }
                    this.f19161f = (this.f19157b.mo13963u() * 1000) / 45;
                } else if (i3 == 1) {
                    this.f19157b.mo13943a(9);
                    if (!rcVar.mo16595b(this.f19157b.mo13952j(), 0, 9, true)) {
                        break;
                    }
                    this.f19161f = this.f19157b.mo13967y();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported version number: ");
                    sb.append(i3);
                    throw new C4144lb(sb.toString());
                }
                this.f19162g = this.f19157b.mo13957o();
                this.f19163h = 0;
                this.f19159d = 2;
            }
        }
        this.f19159d = 0;
        return -1;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        this.f19159d = 0;
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
