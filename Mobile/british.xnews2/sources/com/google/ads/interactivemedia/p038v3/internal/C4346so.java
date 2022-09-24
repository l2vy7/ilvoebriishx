package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.so */
/* compiled from: IMASDK */
final class C4346so extends C4345sn {

    /* renamed from: b */
    private final alw f18626b = new alw(alq.f15233a);

    /* renamed from: c */
    private final alw f18627c = new alw(4);

    /* renamed from: d */
    private int f18628d;

    /* renamed from: e */
    private boolean f18629e;

    /* renamed from: f */
    private boolean f18630f;

    /* renamed from: g */
    private int f18631g;

    public C4346so(C4327rw rwVar) {
        super(rwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16632a(alw alw) throws C4344sm {
        int o = alw.mo13957o();
        int i = o >> 4;
        int i2 = o & 15;
        if (i2 == 7) {
            this.f18631g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new C4344sm(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16633b(alw alw, long j) throws C4144lb {
        int o = alw.mo13957o();
        long t = j + (((long) alw.mo13962t()) * 1000);
        if (o == 0) {
            if (!this.f18629e) {
                alw alw2 = new alw(new byte[alw.mo13947e()]);
                alw.mo13956n(alw2.mo13952j(), 0, alw.mo13947e());
                amn a = amn.m14257a(alw2);
                this.f18628d = a.f15313b;
                C4119kd kdVar = new C4119kd();
                kdVar.mo16120ae(MimeTypes.VIDEO_H264);
                kdVar.mo16097I(a.f15317f);
                kdVar.mo16125aj(a.f15314c);
                kdVar.mo16105Q(a.f15315d);
                kdVar.mo16116aa(a.f15316e);
                kdVar.mo16108T(a.f15312a);
                this.f18625a.mo13403a(kdVar.mo16115a());
                this.f18629e = true;
                return false;
            }
        } else if (o == 1 && this.f18629e) {
            int i = this.f18631g == 1 ? 1 : 0;
            if (!this.f18630f && i == 0) {
                return false;
            }
            byte[] j2 = this.f18627c.mo13952j();
            j2[0] = 0;
            j2[1] = 0;
            j2[2] = 0;
            int i2 = 4 - this.f18628d;
            int i3 = 0;
            while (alw.mo13947e() > 0) {
                alw.mo13956n(this.f18627c.mo13952j(), i2, this.f18628d);
                this.f18627c.mo13951i(0);
                int C = this.f18627c.mo13934C();
                this.f18626b.mo13951i(0);
                this.f18625a.mo13406d(this.f18626b, 4);
                this.f18625a.mo13406d(alw, C);
                i3 = i3 + 4 + C;
            }
            this.f18625a.mo13404b(t, i, i3, 0, (C4326rv) null);
            this.f18630f = true;
            return true;
        }
        return false;
    }
}
