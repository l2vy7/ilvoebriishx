package com.google.ads.interactivemedia.p039v3.internal;

import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wo */
/* compiled from: IMASDK */
public final class C4454wo implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f19458a = 0;

    /* renamed from: b */
    private final amk f19459b = new amk(0);

    /* renamed from: c */
    private final SparseArray<C4453wn> f19460c = new SparseArray<>();

    /* renamed from: d */
    private final alw f19461d = new alw(4096);

    /* renamed from: e */
    private final C4451wl f19462e = new C4451wl();

    /* renamed from: f */
    private boolean f19463f;

    /* renamed from: g */
    private boolean f19464g;

    /* renamed from: h */
    private boolean f19465h;

    /* renamed from: i */
    private long f19466i;

    /* renamed from: j */
    private C4309re f19467j;

    /* renamed from: k */
    private boolean f19468k;

    /* renamed from: l */
    private C4459wt f19469l;

    static {
        int i = C4452wm.f19449b;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        byte[] bArr = new byte[14];
        rcVar.mo16600g(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        rcVar.mo16602i(bArr[13] & 7);
        rcVar.mo16600g(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f19467j = reVar;
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        C4432vt vvVar;
        aup.m14889t(this.f19467j);
        long m = rcVar.mo16606m();
        if (m != -1 && !this.f19462e.mo16751a()) {
            return this.f19462e.mo16753c(rcVar, rqVar);
        }
        if (!this.f19468k) {
            this.f19468k = true;
            if (this.f19462e.mo16754d() != C6540C.TIME_UNSET) {
                C4459wt wtVar = new C4459wt(this.f19462e.mo16752b(), this.f19462e.mo16754d(), m);
                this.f19469l = wtVar;
                this.f19467j.mo13364bc(wtVar.mo16587a());
            } else {
                this.f19467j.mo13364bc(new C4323rs(this.f19462e.mo16754d()));
            }
        }
        C4459wt wtVar2 = this.f19469l;
        if (wtVar2 != null && wtVar2.mo16589c()) {
            return this.f19469l.mo16590d(rcVar, rqVar);
        }
        rcVar.mo16603j();
        long k = m != -1 ? m - rcVar.mo16604k() : -1;
        if ((k != -1 && k < 4) || !rcVar.mo16599f(this.f19461d.mo13952j(), 0, 4, true)) {
            return -1;
        }
        this.f19461d.mo13951i(0);
        int w = this.f19461d.mo13965w();
        if (w == 441) {
            return -1;
        }
        if (w == 442) {
            rcVar.mo16600g(this.f19461d.mo13952j(), 0, 10);
            this.f19461d.mo13951i(9);
            rcVar.mo16597d((this.f19461d.mo13957o() & 7) + 14);
            return 0;
        } else if (w == 443) {
            rcVar.mo16600g(this.f19461d.mo13952j(), 0, 2);
            this.f19461d.mo13951i(0);
            rcVar.mo16597d(this.f19461d.mo13958p() + 6);
            return 0;
        } else if ((w >> 8) != 1) {
            rcVar.mo16597d(1);
            return 0;
        } else {
            int i = w & 255;
            C4453wn wnVar = this.f19460c.get(i);
            if (!this.f19463f) {
                if (wnVar == null) {
                    C4432vt vtVar = null;
                    if (i == 189) {
                        vtVar = new C4422vj();
                        this.f19464g = true;
                        this.f19466i = rcVar.mo16605l();
                    } else {
                        if ((i & 224) == 192) {
                            vvVar = new C4446wg((String) null);
                            this.f19464g = true;
                            this.f19466i = rcVar.mo16605l();
                        } else if ((i & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                            vvVar = new C4434vv((C4471xe) null);
                            this.f19465h = true;
                            this.f19466i = rcVar.mo16605l();
                        }
                        vtVar = vvVar;
                    }
                    if (vtVar != null) {
                        vtVar.mo16708b(this.f19467j, new C4469xc(i, 256));
                        wnVar = new C4453wn(vtVar, this.f19459b);
                        this.f19460c.put(i, wnVar);
                    }
                }
                long j = 1048576;
                if (this.f19464g && this.f19465h) {
                    j = this.f19466i + 8192;
                }
                if (rcVar.mo16605l() > j) {
                    this.f19463f = true;
                    this.f19467j.mo13363bb();
                }
            }
            rcVar.mo16600g(this.f19461d.mo13952j(), 0, 2);
            this.f19461d.mo13951i(0);
            int p = this.f19461d.mo13958p() + 6;
            if (wnVar == null) {
                rcVar.mo16597d(p);
            } else {
                this.f19461d.mo13943a(p);
                rcVar.mo16596c(this.f19461d.mo13952j(), 0, p);
                this.f19461d.mo13951i(6);
                wnVar.mo16756b(this.f19461d);
                alw alw = this.f19461d;
                alw.mo13949g(alw.mo13953k());
            }
            return 0;
        }
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        if (this.f19459b.mo13996d() == C6540C.TIME_UNSET || !(this.f19459b.mo13994b() == 0 || this.f19459b.mo13994b() == j2)) {
            this.f19459b.mo13997e(j2);
        }
        C4459wt wtVar = this.f19469l;
        if (wtVar != null) {
            wtVar.mo16588b(j2);
        }
        for (int i = 0; i < this.f19460c.size(); i++) {
            this.f19460c.valueAt(i).mo16755a();
        }
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
