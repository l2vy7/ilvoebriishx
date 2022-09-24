package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wb */
/* compiled from: IMASDK */
public final class C4441wb implements C4432vt {

    /* renamed from: a */
    private final C4457wr f19337a;

    /* renamed from: b */
    private final boolean f19338b;

    /* renamed from: c */
    private final boolean f19339c;

    /* renamed from: d */
    private final C4447wh f19340d = new C4447wh(7);

    /* renamed from: e */
    private final C4447wh f19341e = new C4447wh(8);

    /* renamed from: f */
    private final C4447wh f19342f = new C4447wh(6);

    /* renamed from: g */
    private long f19343g;

    /* renamed from: h */
    private final boolean[] f19344h = new boolean[3];

    /* renamed from: i */
    private String f19345i;

    /* renamed from: j */
    private C4327rw f19346j;

    /* renamed from: k */
    private C4440wa f19347k;

    /* renamed from: l */
    private boolean f19348l;

    /* renamed from: m */
    private long f19349m;

    /* renamed from: n */
    private boolean f19350n;

    /* renamed from: o */
    private final alw f19351o = new alw();

    public C4441wb(C4457wr wrVar, boolean z, boolean z2) {
        this.f19337a = wrVar;
        this.f19338b = z;
        this.f19339c = z2;
    }

    /* renamed from: f */
    private final void m19321f(byte[] bArr, int i, int i2) {
        if (!this.f19348l || this.f19347k.mo16730a()) {
            this.f19340d.mo16744d(bArr, i, i2);
            this.f19341e.mo16744d(bArr, i, i2);
        }
        this.f19342f.mo16744d(bArr, i, i2);
        this.f19347k.mo16735f(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19343g = 0;
        this.f19350n = false;
        alq.m14051d(this.f19344h);
        this.f19340d.mo16741a();
        this.f19341e.mo16741a();
        this.f19342f.mo16741a();
        C4440wa waVar = this.f19347k;
        if (waVar != null) {
            waVar.mo16733d();
        }
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19345i = xcVar.mo16765c();
        C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 2);
        this.f19346j = ba;
        this.f19347k = new C4440wa(ba, this.f19338b, this.f19339c);
        this.f19337a.mo16757a(reVar, xcVar);
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19349m = j;
        this.f19350n |= (i & 2) != 0;
    }

    /* renamed from: d */
    public final void mo16710d(alw alw) {
        aup.m14889t(this.f19346j);
        int i = amm.f15298a;
        int h = alw.mo13950h();
        int f = alw.mo13948f();
        byte[] j = alw.mo13952j();
        this.f19343g += (long) alw.mo13947e();
        this.f19346j.mo13406d(alw, alw.mo13947e());
        while (true) {
            int c = alq.m14050c(j, h, f, this.f19344h);
            if (c != f) {
                int i2 = c + 3;
                byte b = j[i2] & 31;
                int i3 = c - h;
                if (i3 > 0) {
                    m19321f(j, h, c);
                }
                int i4 = f - c;
                long j2 = this.f19343g - ((long) i4);
                int i5 = i3 < 0 ? -i3 : 0;
                long j3 = this.f19349m;
                if (!this.f19348l || this.f19347k.mo16730a()) {
                    this.f19340d.mo16745e(i5);
                    this.f19341e.mo16745e(i5);
                    if (!this.f19348l) {
                        if (this.f19340d.mo16742b() && this.f19341e.mo16742b()) {
                            ArrayList arrayList = new ArrayList();
                            C4447wh whVar = this.f19340d;
                            arrayList.add(Arrays.copyOf(whVar.f19418a, whVar.f19419b));
                            C4447wh whVar2 = this.f19341e;
                            arrayList.add(Arrays.copyOf(whVar2.f19418a, whVar2.f19419b));
                            C4447wh whVar3 = this.f19340d;
                            alp b2 = alq.m14049b(whVar3.f19418a, 3, whVar3.f19419b);
                            C4447wh whVar4 = this.f19341e;
                            alo e = alq.m14052e(whVar4.f19418a, whVar4.f19419b);
                            String a = akt.m13975a(b2.f15220a, b2.f15221b, b2.f15222c);
                            C4327rw rwVar = this.f19346j;
                            C4119kd kdVar = new C4119kd();
                            kdVar.mo16107S(this.f19345i);
                            kdVar.mo16120ae(MimeTypes.VIDEO_H264);
                            kdVar.mo16097I(a);
                            kdVar.mo16125aj(b2.f15224e);
                            kdVar.mo16105Q(b2.f15225f);
                            kdVar.mo16116aa(b2.f15226g);
                            kdVar.mo16108T(arrayList);
                            rwVar.mo13403a(kdVar.mo16115a());
                            this.f19348l = true;
                            this.f19347k.mo16731b(b2);
                            this.f19347k.mo16732c(e);
                            this.f19340d.mo16741a();
                            this.f19341e.mo16741a();
                        }
                    } else if (this.f19340d.mo16742b()) {
                        C4447wh whVar5 = this.f19340d;
                        this.f19347k.mo16731b(alq.m14049b(whVar5.f19418a, 3, whVar5.f19419b));
                        this.f19340d.mo16741a();
                    } else if (this.f19341e.mo16742b()) {
                        C4447wh whVar6 = this.f19341e;
                        this.f19347k.mo16732c(alq.m14052e(whVar6.f19418a, whVar6.f19419b));
                        this.f19341e.mo16741a();
                    }
                }
                if (this.f19342f.mo16745e(i5)) {
                    C4447wh whVar7 = this.f19342f;
                    this.f19351o.mo13945c(this.f19342f.f19418a, alq.m14048a(whVar7.f19418a, whVar7.f19419b));
                    this.f19351o.mo13951i(4);
                    this.f19337a.mo16758b(j3, this.f19351o);
                }
                if (this.f19347k.mo16736g(j2, i4, this.f19348l, this.f19350n)) {
                    this.f19350n = false;
                }
                long j4 = this.f19349m;
                if (!this.f19348l || this.f19347k.mo16730a()) {
                    this.f19340d.mo16743c(b);
                    this.f19341e.mo16743c(b);
                }
                this.f19342f.mo16743c(b);
                this.f19347k.mo16734e(j2, b, j4);
                h = i2;
            } else {
                m19321f(j, h, f);
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo16711e() {
    }
}
