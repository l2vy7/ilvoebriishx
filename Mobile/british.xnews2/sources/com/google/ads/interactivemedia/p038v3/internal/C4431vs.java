package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vs */
/* compiled from: IMASDK */
public final class C4431vs implements C4432vt {

    /* renamed from: a */
    private final List<C4465wz> f19249a;

    /* renamed from: b */
    private final C4327rw[] f19250b;

    /* renamed from: c */
    private boolean f19251c;

    /* renamed from: d */
    private int f19252d;

    /* renamed from: e */
    private int f19253e;

    /* renamed from: f */
    private long f19254f;

    public C4431vs(List<C4465wz> list) {
        this.f19249a = list;
        this.f19250b = new C4327rw[list.size()];
    }

    /* renamed from: f */
    private final boolean m19276f(alw alw, int i) {
        if (alw.mo13947e() == 0) {
            return false;
        }
        if (alw.mo13957o() != i) {
            this.f19251c = false;
        }
        this.f19252d--;
        return this.f19251c;
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19251c = false;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        for (int i = 0; i < this.f19250b.length; i++) {
            C4465wz wzVar = this.f19249a.get(i);
            xcVar.mo16763a();
            C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 3);
            C4119kd kdVar = new C4119kd();
            kdVar.mo16107S(xcVar.mo16765c());
            kdVar.mo16120ae(MimeTypes.APPLICATION_DVBSUBS);
            kdVar.mo16108T(Collections.singletonList(wzVar.f19521b));
            kdVar.mo16110V(wzVar.f19520a);
            ba.mo13403a(kdVar.mo16115a());
            this.f19250b[i] = ba;
        }
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        if ((i & 4) != 0) {
            this.f19251c = true;
            this.f19254f = j;
            this.f19253e = 0;
            this.f19252d = 2;
        }
    }

    /* renamed from: d */
    public final void mo16710d(alw alw) {
        if (!this.f19251c) {
            return;
        }
        if (this.f19252d != 2 || m19276f(alw, 32)) {
            if (this.f19252d != 1 || m19276f(alw, 0)) {
                int h = alw.mo13950h();
                int e = alw.mo13947e();
                for (C4327rw d : this.f19250b) {
                    alw.mo13951i(h);
                    d.mo13406d(alw, e);
                }
                this.f19253e += e;
            }
        }
    }

    /* renamed from: e */
    public final void mo16711e() {
        if (this.f19251c) {
            for (C4327rw b : this.f19250b) {
                b.mo13404b(this.f19254f, 1, this.f19253e, 0, (C4326rv) null);
            }
            this.f19251c = false;
        }
    }
}
