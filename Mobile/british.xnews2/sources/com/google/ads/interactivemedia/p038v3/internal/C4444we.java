package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.we */
/* compiled from: IMASDK */
public final class C4444we implements C4432vt {

    /* renamed from: a */
    private final alw f19379a = new alw(10);

    /* renamed from: b */
    private C4327rw f19380b;

    /* renamed from: c */
    private boolean f19381c;

    /* renamed from: d */
    private long f19382d;

    /* renamed from: e */
    private int f19383e;

    /* renamed from: f */
    private int f19384f;

    /* renamed from: a */
    public final void mo16707a() {
        this.f19381c = false;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 5);
        this.f19380b = ba;
        C4119kd kdVar = new C4119kd();
        kdVar.mo16107S(xcVar.mo16765c());
        kdVar.mo16120ae(MimeTypes.APPLICATION_ID3);
        ba.mo13403a(kdVar.mo16115a());
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        if ((i & 4) != 0) {
            this.f19381c = true;
            this.f19382d = j;
            this.f19383e = 0;
            this.f19384f = 0;
        }
    }

    /* renamed from: d */
    public final void mo16710d(alw alw) {
        aup.m14889t(this.f19380b);
        if (this.f19381c) {
            int e = alw.mo13947e();
            int i = this.f19384f;
            if (i < 10) {
                int min = Math.min(e, 10 - i);
                System.arraycopy(alw.mo13952j(), alw.mo13950h(), this.f19379a.mo13952j(), this.f19384f, min);
                if (this.f19384f + min == 10) {
                    this.f19379a.mo13951i(0);
                    if (this.f19379a.mo13957o() == 73 && this.f19379a.mo13957o() == 68 && this.f19379a.mo13957o() == 51) {
                        this.f19379a.mo13954l(3);
                        this.f19383e = this.f19379a.mo13933B() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f19381c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(e, this.f19383e - this.f19384f);
            this.f19380b.mo13406d(alw, min2);
            this.f19384f += min2;
        }
    }

    /* renamed from: e */
    public final void mo16711e() {
        int i;
        aup.m14889t(this.f19380b);
        if (this.f19381c && (i = this.f19383e) != 0 && this.f19384f == i) {
            this.f19380b.mo13404b(this.f19382d, 1, i, 0, (C4326rv) null);
            this.f19381c = false;
        }
    }
}
