package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.si */
/* compiled from: IMASDK */
final class C4340si extends C4345sn {

    /* renamed from: b */
    private static final int[] f18599b = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f18600c;

    /* renamed from: d */
    private boolean f18601d;

    /* renamed from: e */
    private int f18602e;

    public C4340si(C4327rw rwVar) {
        super(rwVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16632a(alw alw) throws C4344sm {
        if (!this.f18600c) {
            int o = alw.mo13957o();
            int i = o >> 4;
            this.f18602e = i;
            if (i == 2) {
                int i2 = f18599b[(o >> 2) & 3];
                C4119kd kdVar = new C4119kd();
                kdVar.mo16120ae(MimeTypes.AUDIO_MPEG);
                kdVar.mo16096H(1);
                kdVar.mo16121af(i2);
                this.f18625a.mo13403a(kdVar.mo16115a());
                this.f18601d = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                C4119kd kdVar2 = new C4119kd();
                kdVar2.mo16120ae(str);
                kdVar2.mo16096H(1);
                kdVar2.mo16121af(8000);
                this.f18625a.mo13403a(kdVar2.mo16115a());
                this.f18601d = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new C4344sm(sb.toString());
            }
            this.f18600c = true;
        } else {
            alw.mo13954l(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16633b(alw alw, long j) throws C4144lb {
        if (this.f18602e == 2) {
            int e = alw.mo13947e();
            this.f18625a.mo13406d(alw, e);
            this.f18625a.mo13404b(j, 1, e, 0, (C4326rv) null);
            return true;
        }
        int o = alw.mo13957o();
        if (o == 0 && !this.f18601d) {
            int e2 = alw.mo13947e();
            byte[] bArr = new byte[e2];
            alw.mo13956n(bArr, 0, e2);
            C4204nh a = C4205ni.m18265a(bArr);
            C4119kd kdVar = new C4119kd();
            kdVar.mo16120ae(MimeTypes.AUDIO_AAC);
            kdVar.mo16097I(a.f18067c);
            kdVar.mo16096H(a.f18066b);
            kdVar.mo16121af(a.f18065a);
            kdVar.mo16108T(Collections.singletonList(bArr));
            this.f18625a.mo13403a(kdVar.mo16115a());
            this.f18601d = true;
            return false;
        } else if (this.f18602e == 10 && o != 1) {
            return false;
        } else {
            int e3 = alw.mo13947e();
            this.f18625a.mo13406d(alw, e3);
            this.f18625a.mo13404b(j, 1, e3, 0, (C4326rv) null);
            return true;
        }
    }
}
