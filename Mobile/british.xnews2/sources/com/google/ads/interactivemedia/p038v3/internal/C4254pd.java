package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pd */
/* compiled from: IMASDK */
public final class C4254pd extends C4488xv implements alk {

    /* renamed from: b */
    private final Context f18299b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4225ob f18300c;

    /* renamed from: d */
    private final C4232oi f18301d;

    /* renamed from: e */
    private int f18302e;

    /* renamed from: f */
    private boolean f18303f;

    /* renamed from: g */
    private C4120ke f18304g;

    /* renamed from: h */
    private long f18305h;

    /* renamed from: i */
    private boolean f18306i;

    /* renamed from: j */
    private boolean f18307j;

    /* renamed from: k */
    private boolean f18308k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4155lm f18309l;

    public C4254pd(Context context, C4483xq xqVar, C4490xx xxVar, Handler handler, C4226oc ocVar, C4232oi oiVar) {
        super(1, xqVar, xxVar, 44100.0f);
        this.f18299b = context.getApplicationContext();
        this.f18301d = oiVar;
        this.f18300c = new C4225ob(handler, ocVar);
        oiVar.mo16413a(new C4253pc(this));
    }

    /* renamed from: aA */
    private final int m18474aA(C4486xt xtVar, C4120ke keVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(xtVar.f19587a) || (i = amm.f15298a) >= 24 || (i == 23 && amm.m14216af(this.f18299b))) {
            return keVar.f17682m;
        }
        return -1;
    }

    /* renamed from: aB */
    private final void m18475aB() {
        long d = this.f18301d.mo16416d(mo13723N());
        if (d != Long.MIN_VALUE) {
            if (!this.f18307j) {
                d = Math.max(this.f18305h, d);
            }
            this.f18305h = d;
            this.f18307j = false;
        }
    }

    /* renamed from: K */
    public final String mo13720K() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: M */
    public final boolean mo13722M() {
        return this.f18301d.mo16422j() || super.mo13722M();
    }

    /* renamed from: N */
    public final boolean mo13723N() {
        return super.mo13723N() && this.f18301d.mo16421i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final int mo14028P(C4490xx xxVar, C4120ke keVar) throws C4496yc {
        if (!aln.m14031a(keVar.f17681l)) {
            return avr.m14971m(0);
        }
        int i = amm.f15298a >= 21 ? 32 : 0;
        Class<? extends C4289ql> cls = keVar.f17668E;
        boolean ax = C4488xv.m19506ax(keVar);
        if (ax && this.f18301d.mo16414b(keVar) && (cls == null || C4501yh.m19576a() != null)) {
            return i | 12;
        }
        if (MimeTypes.AUDIO_RAW.equals(keVar.f17681l) && !this.f18301d.mo16414b(keVar)) {
            return avr.m14971m(1);
        }
        if (!this.f18301d.mo16414b(amm.m14205V(2, keVar.f17694y, keVar.f17695z))) {
            return avr.m14971m(1);
        }
        List<C4486xt> Q = mo14029Q(xxVar, keVar, false);
        if (Q.isEmpty()) {
            return avr.m14971m(1);
        }
        if (!ax) {
            return avr.m14971m(2);
        }
        C4486xt xtVar = Q.get(0);
        boolean b = xtVar.mo16779b(keVar);
        int i2 = 8;
        if (b && xtVar.mo16780c(keVar)) {
            i2 = 16;
        }
        return (true != b ? 3 : 4) | i2 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final List<C4486xt> mo14029Q(C4490xx xxVar, C4120ke keVar, boolean z) throws C4496yc {
        C4486xt a;
        String str = keVar.f17681l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f18301d.mo16414b(keVar) && (a = C4501yh.m19576a()) != null) {
            return Collections.singletonList(a);
        }
        List<C4486xt> c = C4501yh.m19578c(xxVar.mo16797a(str, z, false), keVar);
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            ArrayList arrayList = new ArrayList(c);
            arrayList.addAll(xxVar.mo16797a(MimeTypes.AUDIO_E_AC3, z, false));
            c = arrayList;
        }
        return Collections.unmodifiableList(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final boolean mo16490R(C4120ke keVar) {
        return this.f18301d.mo16414b(keVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final C4270pt mo14030S(C4486xt xtVar, C4120ke keVar, C4120ke keVar2) {
        int i;
        int i2;
        C4270pt d = xtVar.mo16781d(keVar, keVar2);
        int i3 = d.f18406e;
        if (m18474aA(xtVar, keVar2) > this.f18302e) {
            i3 |= 64;
        }
        String str = xtVar.f19587a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = d.f18405d;
            i = 0;
        }
        return new C4270pt(str, keVar, keVar2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo14031T(String str, long j, long j2) {
        this.f18300c.mo16392b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo14032U(String str) {
        this.f18300c.mo16396f(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo14033V(Exception exc) {
        ali.m14023b("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f18300c.mo16400j(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final C4270pt mo14034W(C4121kf kfVar) throws C4089ja {
        C4270pt W = super.mo14034W(kfVar);
        this.f18300c.mo16393c(kfVar.f17697b, W);
        return W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo14035X(C4120ke keVar, MediaFormat mediaFormat) throws C4089ja {
        int i;
        int i2;
        C4120ke keVar2 = this.f18304g;
        int[] iArr = null;
        if (keVar2 != null) {
            keVar = keVar2;
        } else if (mo16795ay() != null) {
            if (MimeTypes.AUDIO_RAW.equals(keVar.f17681l)) {
                i = keVar.f17664A;
            } else if (amm.f15298a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = amm.m14206W(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = MimeTypes.AUDIO_RAW.equals(keVar.f17681l) ? keVar.f17664A : 2;
            }
            C4119kd kdVar = new C4119kd();
            kdVar.mo16120ae(MimeTypes.AUDIO_RAW);
            kdVar.mo16113Y(i);
            kdVar.mo16101M(keVar.f17665B);
            kdVar.mo16102N(keVar.f17666C);
            kdVar.mo16096H(mediaFormat.getInteger("channel-count"));
            kdVar.mo16121af(mediaFormat.getInteger("sample-rate"));
            C4120ke a = kdVar.mo16115a();
            if (this.f18303f && a.f17694y == 6 && (i2 = keVar.f17694y) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < keVar.f17694y; i3++) {
                    iArr[i3] = i3;
                }
            }
            keVar = a;
        }
        try {
            this.f18301d.mo16435w(keVar, iArr);
        } catch (C4227od e) {
            throw mo15940D(e, e.f18153a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo16491Y() {
        this.f18307j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo14037Z(C4269ps psVar) {
        if (this.f18306i && !psVar.mo16509b()) {
            if (Math.abs(psVar.f18399d - this.f18305h) > 500000) {
                this.f18305h = psVar.f18399d;
            }
            this.f18306i = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo14042aa() {
        this.f18301d.mo16418f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public final void mo16492ab() throws C4089ja {
        try {
            this.f18301d.mo16420h();
        } catch (C4231oh e) {
            throw mo15941E(e, e.f18157b, e.f18156a);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r0) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* renamed from: ae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14045ae(com.google.ads.interactivemedia.p038v3.internal.C4486xt r9, com.google.ads.interactivemedia.p038v3.internal.C4504yk r10, com.google.ads.interactivemedia.p038v3.internal.C4120ke r11, android.media.MediaCrypto r12, float r13) {
        /*
            r8 = this;
            com.google.ads.interactivemedia.v3.internal.ke[] r0 = r8.mo15938B()
            int r1 = r8.m18474aA(r9, r11)
            int r2 = r0.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r5 = 0
        L_0x000f:
            if (r5 >= r2) goto L_0x0026
            r6 = r0[r5]
            com.google.ads.interactivemedia.v3.internal.pt r7 = r9.mo16781d(r11, r6)
            int r7 = r7.f18405d
            if (r7 == 0) goto L_0x0023
            int r6 = r8.m18474aA(r9, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0023:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0026:
            r8.f18302e = r1
            java.lang.String r0 = r9.f19587a
            int r1 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            r2 = 24
            if (r1 >= r2) goto L_0x005e
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15300c
            java.lang.String r5 = "samsung"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15299b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005c
            java.lang.String r5 = "herolte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005c
            java.lang.String r5 = "heroqlte"
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x005e
        L_0x005c:
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            r8.f18303f = r0
            java.lang.String r0 = r9.f19589c
            int r5 = r8.f18302e
            android.media.MediaFormat r6 = new android.media.MediaFormat
            r6.<init>()
            java.lang.String r7 = "mime"
            r6.setString(r7, r0)
            int r0 = r11.f17694y
            java.lang.String r7 = "channel-count"
            r6.setInteger(r7, r0)
            int r0 = r11.f17695z
            java.lang.String r7 = "sample-rate"
            r6.setInteger(r7, r0)
            java.util.List<byte[]> r0 = r11.f17683n
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19138g(r6, r0)
            java.lang.String r0 = "max-input-size"
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19139h(r6, r0, r5)
            r0 = 23
            if (r1 < r0) goto L_0x00af
            java.lang.String r5 = "priority"
            r6.setInteger(r5, r3)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00af
            if (r1 != r0) goto L_0x00aa
            java.lang.String r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15301d
            java.lang.String r3 = "ZTE B2017G"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00af
            java.lang.String r3 = "AXON 7 mini"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r0 = "operating-rate"
            r6.setFloat(r0, r13)
        L_0x00af:
            r13 = 28
            if (r1 > r13) goto L_0x00c2
            java.lang.String r13 = r11.f17681l
            java.lang.String r0 = "audio/ac4"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x00c2
            java.lang.String r13 = "ac4-is-sync"
            r6.setInteger(r13, r4)
        L_0x00c2:
            if (r1 < r2) goto L_0x00db
            com.google.ads.interactivemedia.v3.internal.oi r13 = r8.f18301d
            int r0 = r11.f17694y
            int r1 = r11.f17695z
            r2 = 4
            com.google.ads.interactivemedia.v3.internal.ke r0 = com.google.ads.interactivemedia.p038v3.internal.amm.m14205V(r2, r0, r1)
            int r13 = r13.mo16415c(r0)
            r0 = 2
            if (r13 != r0) goto L_0x00db
            java.lang.String r13 = "pcm-encoding"
            r6.setInteger(r13, r2)
        L_0x00db:
            r13 = 0
            r10.mo16826o(r6, r13, r12)
            java.lang.String r9 = r9.f19588b
            java.lang.String r10 = "audio/raw"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00f2
            java.lang.String r9 = r11.f17681l
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r11 = r13
        L_0x00f3:
            r8.f18304g = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4254pd.mo14045ae(com.google.ads.interactivemedia.v3.internal.xt, com.google.ads.interactivemedia.v3.internal.yk, com.google.ads.interactivemedia.v3.internal.ke, android.media.MediaCrypto, float):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo14046af(long j, long j2, C4504yk ykVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C4120ke keVar) throws C4089ja {
        aup.m14890u(byteBuffer);
        if (this.f18304g != null && (i2 & 2) != 0) {
            aup.m14890u(ykVar);
            ykVar.mo16818g(i, false);
            return true;
        } else if (z) {
            if (ykVar != null) {
                ykVar.mo16818g(i, false);
            }
            this.f19625a.f18390f += i3;
            this.f18301d.mo16418f();
            return true;
        } else {
            try {
                if (!this.f18301d.mo16419g(byteBuffer, j3, i3)) {
                    return false;
                }
                if (ykVar != null) {
                    ykVar.mo16818g(i, false);
                }
                this.f19625a.f18389e += i3;
                return true;
            } catch (C4228oe e) {
                throw mo15941E(e, e.f18155b, e.f18154a);
            } catch (C4231oh e2) {
                throw mo15941E(e2, keVar, e2.f18156a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public final float mo14047ag(float f, C4120ke[] keVarArr) {
        int i = -1;
        for (C4120ke keVar : keVarArr) {
            int i2 = keVar.f17695z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* renamed from: d */
    public final alk mo15951d() {
        return this;
    }

    /* renamed from: g */
    public final long mo13912g() {
        if (mo15952e() == 2) {
            m18475aB();
        }
        return this.f18305h;
    }

    /* renamed from: h */
    public final void mo13913h(C4146ld ldVar) {
        this.f18301d.mo16423k(ldVar);
    }

    /* renamed from: i */
    public final C4146ld mo13914i() {
        return this.f18301d.mo16424l();
    }

    /* renamed from: t */
    public final void mo14054t(int i, Object obj) throws C4089ja {
        if (i == 2) {
            this.f18301d.mo16431s(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f18301d.mo16426n((C4210nn) obj);
        } else if (i != 5) {
            switch (i) {
                case 101:
                    this.f18301d.mo16425m(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.f18301d.mo16427o(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f18309l = (C4155lm) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f18301d.mo16428p((C4237on) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo14055u(boolean z, boolean z2) throws C4089ja {
        super.mo14055u(z, z2);
        this.f18300c.mo16391a(this.f19625a);
        if (mo15939C().f17852b) {
            this.f18301d.mo16429q();
        } else {
            this.f18301d.mo16430r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo13726v(long j, boolean z) throws C4089ja {
        super.mo13726v(j, z);
        this.f18301d.mo16433u();
        this.f18305h = j;
        this.f18306i = true;
        this.f18307j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo14056w() {
        this.f18301d.mo16417e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo14057x() {
        m18475aB();
        this.f18301d.mo16432t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo13727y() {
        this.f18308k = true;
        try {
            this.f18301d.mo16433u();
            try {
                super.mo13727y();
            } finally {
                this.f18300c.mo16397g(this.f19625a);
            }
        } catch (Throwable th) {
            super.mo13727y();
            throw th;
        } finally {
            this.f18300c.mo16397g(this.f19625a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo14058z() {
        try {
            super.mo14058z();
            if (this.f18308k) {
                this.f18308k = false;
                this.f18301d.mo16434v();
            }
        } catch (Throwable th) {
            if (this.f18308k) {
                this.f18308k = false;
                this.f18301d.mo16434v();
            }
            throw th;
        }
    }
}
