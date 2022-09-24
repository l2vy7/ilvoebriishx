package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aec */
/* compiled from: IMASDK */
public final class aec extends C4544zx {

    /* renamed from: A */
    private long f14352A;

    /* renamed from: B */
    private int f14353B;

    /* renamed from: C */
    private final aef f14354C;

    /* renamed from: D */
    private final aea f14355D;

    /* renamed from: E */
    private final C4396uk f14356E;

    /* renamed from: F */
    private final aup f14357F;

    /* renamed from: a */
    private final C4129kn f14358a;

    /* renamed from: b */
    private final ajf f14359b;

    /* renamed from: c */
    private final C4286qi f14360c;

    /* renamed from: d */
    private final long f14361d;

    /* renamed from: e */
    private final abj f14362e;

    /* renamed from: f */
    private final akk<? extends aep> f14363f;

    /* renamed from: g */
    private final Object f14364g;

    /* renamed from: h */
    private final SparseArray<C3833ads> f14365h;

    /* renamed from: i */
    private final Runnable f14366i;

    /* renamed from: j */
    private final Runnable f14367j;

    /* renamed from: k */
    private final ael f14368k;

    /* renamed from: l */
    private final akj f14369l;

    /* renamed from: m */
    private ajg f14370m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public aki f14371n;

    /* renamed from: o */
    private akp f14372o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public IOException f14373p;

    /* renamed from: q */
    private Handler f14374q;

    /* renamed from: r */
    private C4127kl f14375r;

    /* renamed from: s */
    private Uri f14376s;

    /* renamed from: t */
    private final Uri f14377t;

    /* renamed from: u */
    private aep f14378u = null;

    /* renamed from: v */
    private boolean f14379v;

    /* renamed from: w */
    private long f14380w;

    /* renamed from: x */
    private long f14381x;

    /* renamed from: y */
    private long f14382y;

    /* renamed from: z */
    private int f14383z;

    static {
        C4116ka.m17669b("goog.exo.dash");
    }

    /* synthetic */ aec(C4129kn knVar, ajf ajf, akk akk, aef aef, C4396uk ukVar, C4286qi qiVar, aup aup, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14358a = knVar;
        this.f14375r = knVar.f17730c;
        C4128km kmVar = knVar.f17729b;
        aup.m14890u(kmVar);
        this.f14376s = kmVar.f17720a;
        this.f14377t = knVar.f17729b.f17720a;
        this.f14359b = ajf;
        this.f14363f = akk;
        this.f14354C = aef;
        this.f14360c = qiVar;
        this.f14357F = aup;
        this.f14361d = j;
        this.f14356E = ukVar;
        this.f14362e = mo16938f((abb) null);
        this.f14364g = new Object();
        this.f14365h = new SparseArray<>();
        this.f14368k = new adw(this);
        this.f14352A = C6540C.TIME_UNSET;
        this.f14382y = C6540C.TIME_UNSET;
        this.f14355D = new aea(this, (byte[]) null);
        this.f14369l = new adz(this);
        this.f14366i = new adt(this, (byte[]) null);
        this.f14367j = new adt(this);
    }

    /* renamed from: L */
    private final void m13263L(afj afj, akk<Long> akk) {
        m13270S(new akl(this.f14370m, Uri.parse(afj.f14521b), 5, akk), new aea(this), 1);
    }

    /* renamed from: M */
    private final void m13264M() {
        ame.m14135c(this.f14371n, new adu(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m13265N(long j) {
        this.f14382y = j;
        m13267P(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m13266O(IOException iOException) {
        ali.m14023b(DashMediaSource.DEFAULT_MEDIA_ID, "Failed to resolve time offset.", iOException);
        m13267P(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        if (r1.f14432b != 3) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00dc, code lost:
        if (r14.f14432b != 3) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
        if (r0 == com.google.android.exoplayer2.C6540C.TIME_UNSET) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cc, code lost:
        if (r4 == com.google.android.exoplayer2.C6540C.TIME_UNSET) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fd, code lost:
        if (r13 != com.google.android.exoplayer2.C6540C.TIME_UNSET) goto L_0x0209;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0186  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13267P(boolean r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = 0
            r2 = 0
        L_0x0004:
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.ads> r3 = r0.f14365h
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0029
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.ads> r3 = r0.f14365h
            int r3 = r3.keyAt(r2)
            int r4 = r0.f14353B
            if (r3 < r4) goto L_0x0026
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.ads> r4 = r0.f14365h
            java.lang.Object r4 = r4.valueAt(r2)
            com.google.ads.interactivemedia.v3.internal.ads r4 = (com.google.ads.interactivemedia.p039v3.internal.C3833ads) r4
            com.google.ads.interactivemedia.v3.internal.aep r5 = r0.f14378u
            int r6 = r0.f14353B
            int r3 = r3 - r6
            r4.mo13511o(r5, r3)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0029:
            com.google.ads.interactivemedia.v3.internal.aep r2 = r0.f14378u
            com.google.ads.interactivemedia.v3.internal.aeu r2 = r2.mo13566c(r1)
            com.google.ads.interactivemedia.v3.internal.aep r3 = r0.f14378u
            int r3 = r3.mo13565b()
            int r3 = r3 + -1
            com.google.ads.interactivemedia.v3.internal.aep r4 = r0.f14378u
            com.google.ads.interactivemedia.v3.internal.aeu r4 = r4.mo13566c(r3)
            com.google.ads.interactivemedia.v3.internal.aep r5 = r0.f14378u
            long r5 = r5.mo13568e(r3)
            long r7 = r0.f14382y
            long r7 = com.google.ads.interactivemedia.p039v3.internal.amm.m14218ah(r7)
            long r7 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r7)
            com.google.ads.interactivemedia.v3.internal.aep r3 = r0.f14378u
            long r9 = r3.mo13568e(r1)
            long r11 = r2.f14470b
            long r11 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r11)
            boolean r3 = m13271T(r2)
            r14 = r11
            r13 = 0
        L_0x005f:
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r1 = r2.f14471c
            int r1 = r1.size()
            if (r13 >= r1) goto L_0x00b1
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r1 = r2.f14471c
            java.lang.Object r1 = r1.get(r13)
            com.google.ads.interactivemedia.v3.internal.aeo r1 = (com.google.ads.interactivemedia.p039v3.internal.aeo) r1
            java.util.List<com.google.ads.interactivemedia.v3.internal.aez> r0 = r1.f14433c
            if (r3 == 0) goto L_0x007b
            int r1 = r1.f14432b
            r17 = r3
            r3 = 3
            if (r1 == r3) goto L_0x0083
            goto L_0x007d
        L_0x007b:
            r17 = r3
        L_0x007d:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0085
        L_0x0083:
            r3 = r2
            goto L_0x00a9
        L_0x0085:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.ads.interactivemedia.v3.internal.aez r0 = (com.google.ads.interactivemedia.p039v3.internal.aez) r0
            com.google.ads.interactivemedia.v3.internal.aed r0 = r0.mo13587l()
            if (r0 != 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            int r1 = r0.mo13536h(r9, r7)
            if (r1 != 0) goto L_0x009b
        L_0x0099:
            r3 = r2
            goto L_0x00b3
        L_0x009b:
            r3 = r2
            long r1 = r0.mo13534f(r9, r7)
            long r0 = r0.mo13530b(r1)
            long r0 = r0 + r11
            long r14 = java.lang.Math.max(r14, r0)
        L_0x00a9:
            int r13 = r13 + 1
            r0 = r34
            r2 = r3
            r3 = r17
            goto L_0x005f
        L_0x00b1:
            r3 = r2
            r11 = r14
        L_0x00b3:
            long r0 = r4.f14470b
            long r0 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r0)
            boolean r2 = m13271T(r4)
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
        L_0x00c3:
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r14 = r4.f14471c
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x012a
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r14 = r4.f14471c
            java.lang.Object r14 = r14.get(r13)
            com.google.ads.interactivemedia.v3.internal.aeo r14 = (com.google.ads.interactivemedia.p039v3.internal.aeo) r14
            java.util.List<com.google.ads.interactivemedia.v3.internal.aez> r15 = r14.f14433c
            if (r2 == 0) goto L_0x00df
            int r14 = r14.f14432b
            r17 = r2
            r2 = 3
            if (r14 == r2) goto L_0x00e8
            goto L_0x00e2
        L_0x00df:
            r17 = r2
            r2 = 3
        L_0x00e2:
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x00eb
        L_0x00e8:
            r16 = r3
            goto L_0x0123
        L_0x00eb:
            r14 = 0
            java.lang.Object r15 = r15.get(r14)
            com.google.ads.interactivemedia.v3.internal.aez r15 = (com.google.ads.interactivemedia.p039v3.internal.aez) r15
            com.google.ads.interactivemedia.v3.internal.aed r14 = r15.mo13587l()
            if (r14 != 0) goto L_0x00fe
            long r0 = r0 + r5
        L_0x00f9:
            r2 = r34
            r16 = r3
            goto L_0x012f
        L_0x00fe:
            int r15 = r14.mo13536h(r5, r7)
            if (r15 != 0) goto L_0x0105
            goto L_0x00f9
        L_0x0105:
            long r18 = r14.mo13534f(r5, r7)
            r16 = r3
            long r2 = (long) r15
            long r18 = r18 + r2
            r2 = -1
            long r2 = r18 + r2
            long r18 = r14.mo13530b(r2)
            long r18 = r0 + r18
            long r2 = r14.mo13531c(r2, r5)
            long r2 = r18 + r2
            long r2 = java.lang.Math.min(r9, r2)
            r9 = r2
        L_0x0123:
            int r13 = r13 + 1
            r3 = r16
            r2 = r17
            goto L_0x00c3
        L_0x012a:
            r16 = r3
            r2 = r34
            r0 = r9
        L_0x012f:
            com.google.ads.interactivemedia.v3.internal.aep r3 = r2.f14378u
            boolean r3 = r3.f14440d
            r5 = 1
            if (r3 == 0) goto L_0x0162
            r3 = 0
        L_0x0137:
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r6 = r4.f14471c
            int r6 = r6.size()
            if (r3 >= r6) goto L_0x0160
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r6 = r4.f14471c
            java.lang.Object r6 = r6.get(r3)
            com.google.ads.interactivemedia.v3.internal.aeo r6 = (com.google.ads.interactivemedia.p039v3.internal.aeo) r6
            java.util.List<com.google.ads.interactivemedia.v3.internal.aez> r6 = r6.f14433c
            r9 = 0
            java.lang.Object r6 = r6.get(r9)
            com.google.ads.interactivemedia.v3.internal.aez r6 = (com.google.ads.interactivemedia.p039v3.internal.aez) r6
            com.google.ads.interactivemedia.v3.internal.aed r6 = r6.mo13587l()
            if (r6 == 0) goto L_0x0162
            boolean r6 = r6.mo13538j()
            if (r6 == 0) goto L_0x015d
            goto L_0x0162
        L_0x015d:
            int r3 = r3 + 1
            goto L_0x0137
        L_0x0160:
            r3 = 1
            goto L_0x0163
        L_0x0162:
            r3 = 0
        L_0x0163:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x017c
            com.google.ads.interactivemedia.v3.internal.aep r4 = r2.f14378u
            long r13 = r4.f14442f
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x017c
            long r13 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r13)
            long r13 = r0 - r13
            long r11 = java.lang.Math.max(r11, r13)
        L_0x017c:
            long r27 = r0 - r11
            com.google.ads.interactivemedia.v3.internal.aep r0 = r2.f14378u
            boolean r1 = r0.f14440d
            r13 = 0
            if (r1 == 0) goto L_0x0293
            long r0 = r0.f14437a
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x018e
            r1 = 1
            goto L_0x018f
        L_0x018e:
            r1 = 0
        L_0x018f:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r1)
            com.google.ads.interactivemedia.v3.internal.aep r0 = r2.f14378u
            long r0 = r0.f14437a
            long r0 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r0)
            long r7 = r7 - r0
            long r7 = r7 - r11
            com.google.ads.interactivemedia.v3.internal.kn r0 = r2.f14358a
            com.google.ads.interactivemedia.v3.internal.kl r0 = r0.f17730c
            long r0 = r0.f17717c
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x01a7
            goto L_0x01b7
        L_0x01a7:
            com.google.ads.interactivemedia.v3.internal.aep r0 = r2.f14378u
            com.google.ads.interactivemedia.v3.internal.afg r0 = r0.f14446j
            if (r0 == 0) goto L_0x01b3
            long r0 = r0.f14512c
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x01b7
        L_0x01b3:
            long r0 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17451a(r7)
        L_0x01b7:
            com.google.ads.interactivemedia.v3.internal.kn r4 = r2.f14358a
            com.google.ads.interactivemedia.v3.internal.kl r4 = r4.f17730c
            long r4 = r4.f17716b
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x01c2
            goto L_0x01ea
        L_0x01c2:
            com.google.ads.interactivemedia.v3.internal.aep r4 = r2.f14378u
            com.google.ads.interactivemedia.v3.internal.afg r4 = r4.f14446j
            if (r4 == 0) goto L_0x01ce
            long r4 = r4.f14511b
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x01ea
        L_0x01ce:
            long r4 = r7 - r27
            long r4 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17451a(r4)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x01dd
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x01dd
            r4 = r13
        L_0x01dd:
            com.google.ads.interactivemedia.v3.internal.aep r6 = r2.f14378u
            long r13 = r6.f14439c
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x01ea
            long r4 = r4 + r13
            long r4 = java.lang.Math.min(r4, r0)
        L_0x01ea:
            com.google.ads.interactivemedia.v3.internal.kl r6 = r2.f14375r
            long r13 = r6.f17715a
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x01f3
            goto L_0x0209
        L_0x01f3:
            com.google.ads.interactivemedia.v3.internal.aep r6 = r2.f14378u
            com.google.ads.interactivemedia.v3.internal.afg r13 = r6.f14446j
            if (r13 == 0) goto L_0x0200
            long r13 = r13.f14510a
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0200
            goto L_0x0209
        L_0x0200:
            long r13 = r6.f14443g
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0207
            goto L_0x0209
        L_0x0207:
            long r13 = r2.f14361d
        L_0x0209:
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x020e
            r13 = r4
        L_0x020e:
            r29 = 2
            r9 = 5000000(0x4c4b40, double:2.470328E-317)
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x022b
            long r13 = r27 / r29
            long r13 = java.lang.Math.min(r9, r13)
            long r13 = r7 - r13
            long r17 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17451a(r13)
            r19 = r4
            r21 = r0
            long r13 = com.google.ads.interactivemedia.p039v3.internal.amm.m14192I(r17, r19, r21)
        L_0x022b:
            r18 = r13
            com.google.ads.interactivemedia.v3.internal.kn r6 = r2.f14358a
            com.google.ads.interactivemedia.v3.internal.kl r6 = r6.f17730c
            float r13 = r6.f17718d
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r15 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r15 == 0) goto L_0x023d
        L_0x023a:
            r24 = r13
            goto L_0x0249
        L_0x023d:
            com.google.ads.interactivemedia.v3.internal.aep r13 = r2.f14378u
            com.google.ads.interactivemedia.v3.internal.afg r13 = r13.f14446j
            if (r13 == 0) goto L_0x0246
            float r13 = r13.f14513d
            goto L_0x023a
        L_0x0246:
            r24 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0249:
            float r6 = r6.f17719e
            int r13 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x0252
        L_0x024f:
            r25 = r6
            goto L_0x025e
        L_0x0252:
            com.google.ads.interactivemedia.v3.internal.aep r6 = r2.f14378u
            com.google.ads.interactivemedia.v3.internal.afg r6 = r6.f14446j
            if (r6 == 0) goto L_0x025b
            float r6 = r6.f14514e
            goto L_0x024f
        L_0x025b:
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x025e:
            com.google.ads.interactivemedia.v3.internal.kl r6 = new com.google.ads.interactivemedia.v3.internal.kl
            r17 = r6
            r20 = r4
            r22 = r0
            r17.<init>(r18, r20, r22, r24, r25)
            r2.f14375r = r6
            com.google.ads.interactivemedia.v3.internal.aep r0 = r2.f14378u
            long r0 = r0.f14437a
            long r4 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17451a(r11)
            long r0 = r0 + r4
            com.google.ads.interactivemedia.v3.internal.kl r4 = r2.f14375r
            long r4 = r4.f17715a
            long r4 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r4)
            long r7 = r7 - r4
            long r4 = r27 / r29
            long r4 = java.lang.Math.min(r9, r4)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x028c
            r20 = r0
            r29 = r4
            goto L_0x0290
        L_0x028c:
            r20 = r0
            r29 = r7
        L_0x0290:
            r0 = r16
            goto L_0x029c
        L_0x0293:
            r0 = r16
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = 0
        L_0x029c:
            long r0 = r0.f14470b
            long r0 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r0)
            long r25 = r11 - r0
            com.google.ads.interactivemedia.v3.internal.adv r0 = new com.google.ads.interactivemedia.v3.internal.adv
            com.google.ads.interactivemedia.v3.internal.aep r1 = r2.f14378u
            long r4 = r1.f14437a
            long r6 = r2.f14382y
            int r8 = r2.f14353B
            com.google.ads.interactivemedia.v3.internal.kn r9 = r2.f14358a
            boolean r10 = r1.f14440d
            if (r10 == 0) goto L_0x02b7
            com.google.ads.interactivemedia.v3.internal.kl r10 = r2.f14375r
            goto L_0x02b8
        L_0x02b7:
            r10 = 0
        L_0x02b8:
            r33 = r10
            r17 = r0
            r18 = r4
            r22 = r6
            r24 = r8
            r31 = r1
            r32 = r9
            r17.<init>(r18, r20, r22, r24, r25, r27, r29, r31, r32, r33)
            r2.mo16937e(r0)
            android.os.Handler r0 = r2.f14374q
            java.lang.Runnable r1 = r2.f14367j
            r0.removeCallbacks(r1)
            r0 = 5000(0x1388, double:2.4703E-320)
            if (r3 == 0) goto L_0x0363
            android.os.Handler r3 = r2.f14374q
            java.lang.Runnable r4 = r2.f14367j
            com.google.ads.interactivemedia.v3.internal.aep r5 = r2.f14378u
            long r6 = r2.f14382y
            long r6 = com.google.ads.interactivemedia.p039v3.internal.amm.m14218ah(r6)
            int r8 = r5.mo13565b()
            int r8 = r8 + -1
            com.google.ads.interactivemedia.v3.internal.aeu r9 = r5.mo13566c(r8)
            long r10 = r9.f14470b
            long r10 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r10)
            long r12 = r5.mo13568e(r8)
            long r6 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r6)
            long r14 = r5.f14437a
            long r14 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r14)
            long r16 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r0)
            r0 = r16
            r5 = 0
        L_0x0308:
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r8 = r9.f14471c
            int r8 = r8.size()
            if (r5 >= r8) goto L_0x035a
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeo> r8 = r9.f14471c
            java.lang.Object r8 = r8.get(r5)
            com.google.ads.interactivemedia.v3.internal.aeo r8 = (com.google.ads.interactivemedia.p039v3.internal.aeo) r8
            java.util.List<com.google.ads.interactivemedia.v3.internal.aez> r8 = r8.f14433c
            boolean r18 = r8.isEmpty()
            if (r18 == 0) goto L_0x0324
            r18 = r9
            r9 = 0
            goto L_0x0355
        L_0x0324:
            r18 = r9
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            com.google.ads.interactivemedia.v3.internal.aez r8 = (com.google.ads.interactivemedia.p039v3.internal.aez) r8
            com.google.ads.interactivemedia.v3.internal.aed r8 = r8.mo13587l()
            if (r8 == 0) goto L_0x0355
            long r19 = r14 + r10
            long r21 = r8.mo13537i(r12, r6)
            long r19 = r19 + r21
            long r19 = r19 - r6
            r21 = -100000(0xfffffffffffe7960, double:NaN)
            long r21 = r0 + r21
            int r8 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r8 < 0) goto L_0x0353
            int r8 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0355
            r21 = 100000(0x186a0, double:4.94066E-319)
            long r21 = r0 + r21
            int r8 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r8 >= 0) goto L_0x0355
        L_0x0353:
            r0 = r19
        L_0x0355:
            int r5 = r5 + 1
            r9 = r18
            goto L_0x0308
        L_0x035a:
            java.math.RoundingMode r5 = java.math.RoundingMode.CEILING
            long r0 = com.google.ads.interactivemedia.p039v3.internal.avy.m14981a(r0, r5)
            r3.postDelayed(r4, r0)
        L_0x0363:
            boolean r0 = r2.f14379v
            if (r0 == 0) goto L_0x036b
            r34.mo13526K()
            return
        L_0x036b:
            if (r35 == 0) goto L_0x0395
            com.google.ads.interactivemedia.v3.internal.aep r0 = r2.f14378u
            boolean r1 = r0.f14440d
            if (r1 == 0) goto L_0x0395
            long r0 = r0.f14441e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0395
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0386
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x0386:
            long r5 = r2.f14380w
            long r5 = r5 + r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            long r0 = java.lang.Math.max(r3, r5)
            r2.m13268Q(r0)
        L_0x0395:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aec.m13267P(boolean):void");
    }

    /* renamed from: Q */
    private final void m13268Q(long j) {
        this.f14374q.postDelayed(this.f14366i, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void mo13526K() {
        Uri uri;
        this.f14374q.removeCallbacks(this.f14366i);
        if (!this.f14371n.mo13841c()) {
            if (this.f14371n.mo13844f()) {
                this.f14379v = true;
                return;
            }
            synchronized (this.f14364g) {
                uri = this.f14376s;
            }
            this.f14379v = false;
            m13270S(new akl(this.f14370m, uri, 4, this.f14363f), this.f14355D, aup.m14894y(4));
        }
    }

    /* renamed from: S */
    private final <T> void m13270S(akl<T> akl, akb<akl<T>> akb, int i) {
        this.f14371n.mo13843e(akl, akb, i);
        this.f14362e.mo13330d(new aas(akl.f15152b), akl.f15153c);
    }

    /* renamed from: T */
    private static boolean m13271T(aeu aeu) {
        for (int i = 0; i < aeu.f14471c.size(); i++) {
            int i2 = aeu.f14471c.get(i).f14432b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo13520A(akl<aep> akl, long j, long j2) {
        int i;
        akl<aep> akl2 = akl;
        long j3 = j;
        long j4 = akl2.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        this.f14362e.mo13332f(new aas(), akl2.f15153c);
        aep a = akl.mo13849a();
        aep aep = this.f14378u;
        if (aep == null) {
            i = 0;
        } else {
            i = aep.mo13565b();
        }
        long j5 = a.mo13566c(0).f14470b;
        int i2 = 0;
        while (i2 < i && this.f14378u.mo13566c(i2).f14470b < j5) {
            i2++;
        }
        if (a.f14440d) {
            if (i - i2 > a.mo13565b()) {
                Log.w(DashMediaSource.DEFAULT_MEDIA_ID, "Loaded out of sync manifest");
            } else {
                long j6 = this.f14352A;
                if (j6 != C6540C.TIME_UNSET) {
                    long j7 = a.f14444h;
                    if (1000 * j7 <= j6) {
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("Loaded stale dynamic manifest: ");
                        sb.append(j7);
                        sb.append(", ");
                        sb.append(j6);
                        Log.w(DashMediaSource.DEFAULT_MEDIA_ID, sb.toString());
                    }
                }
                this.f14383z = 0;
            }
            int i3 = this.f14383z;
            this.f14383z = i3 + 1;
            if (i3 < aup.m14894y(akl2.f15153c)) {
                m13268Q((long) Math.min((this.f14383z - 1) * 1000, 5000));
                return;
            } else {
                this.f14373p = new adq();
                return;
            }
        }
        this.f14378u = a;
        this.f14379v = a.f14440d & this.f14379v;
        this.f14380w = j3 - j2;
        this.f14381x = j3;
        synchronized (this.f14364g) {
            if (akl2.f15152b.f15056a == this.f14376s) {
                Uri uri = this.f14378u.f14447k;
                if (uri == null) {
                    uri = akl.mo13851e();
                }
                this.f14376s = uri;
            }
        }
        if (i == 0) {
            aep aep2 = this.f14378u;
            if (aep2.f14440d) {
                afj afj = aep2.f14445i;
                if (afj != null) {
                    String str = afj.f14520a;
                    if (amm.m14233c(str, "urn:mpeg:dash:utc:direct:2014") || amm.m14233c(str, "urn:mpeg:dash:utc:direct:2012")) {
                        try {
                            m13265N(amm.m14195L(afj.f14521b) - this.f14381x);
                        } catch (C4144lb e) {
                            m13266O(e);
                        }
                    } else if (amm.m14233c(str, "urn:mpeg:dash:utc:http-iso:2014") || amm.m14233c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        m13263L(afj, new ady());
                    } else if (amm.m14233c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || amm.m14233c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                        m13263L(afj, new aeb((byte[]) null));
                    } else if (amm.m14233c(str, "urn:mpeg:dash:utc:ntp:2014") || amm.m14233c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        m13264M();
                    } else {
                        m13266O(new IOException("Unsupported UTC timing scheme"));
                    }
                } else {
                    m13264M();
                }
            } else {
                m13267P(true);
            }
        } else {
            this.f14353B += i2;
            m13267P(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final akc mo13521B(akl<aep> akl, long j, long j2, IOException iOException, int i) {
        akc akc;
        long j3 = akl.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        aas aas = new aas();
        new aax(akl.f15153c);
        long z = aup.m14895z(new aka(iOException, i));
        if (z == C6540C.TIME_UNSET) {
            akc = aki.f15147c;
        } else {
            akc = aki.m13929b(false, z);
        }
        this.f14362e.mo13336j(aas, akl.f15153c, iOException, !akc.mo13834a());
        return akc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo13522C(akl<Long> akl, long j, long j2) {
        long j3 = akl.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        this.f14362e.mo13332f(new aas(), akl.f15153c);
        m13265N(akl.mo13849a().longValue() - j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final akc mo13523D(akl<Long> akl, long j, long j2, IOException iOException) {
        abj abj = this.f14362e;
        long j3 = akl.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        abj.mo13336j(new aas(), akl.f15153c, iOException, true);
        m13266O(iOException);
        return aki.f15146b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo13524E(akl<?> akl, long j, long j2) {
        long j3 = akl.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        this.f14362e.mo13334h(new aas(), akl.f15153c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo13525F() {
        m13267P(false);
    }

    /* renamed from: U */
    public final C4129kn mo13273U() {
        return this.f14358a;
    }

    /* renamed from: V */
    public final void mo13274V(aaz aaz) {
        C3833ads ads = (C3833ads) aaz;
        ads.mo13512q();
        this.f14365h.remove(ads.f14304a);
    }

    /* renamed from: W */
    public final aaz mo13275W(abb abb, ajl ajl, long j) {
        abb abb2 = abb;
        int intValue = ((Integer) abb2.f13998a).intValue() - this.f14353B;
        int i = intValue;
        abj g = mo16939g(abb2, this.f14378u.mo13566c(intValue).f14470b);
        C4281qd h = mo16940h(abb);
        C3833ads ads = r2;
        C3833ads ads2 = new C3833ads(intValue + this.f14353B, this.f14378u, i, this.f14354C, this.f14372o, this.f14360c, h, this.f14357F, g, this.f14382y, this.f14369l, ajl, this.f14356E, this.f14368k, (byte[]) null, (byte[]) null, (byte[]) null);
        C3833ads ads3 = ads;
        this.f14365h.put(ads3.f14304a, ads3);
        return ads3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13254a(akp akp) {
        this.f14372o = akp;
        this.f14360c.mo16576c();
        this.f14370m = this.f14359b.mo13800a();
        this.f14371n = new aki(DashMediaSource.DEFAULT_MEDIA_ID);
        this.f14374q = amm.m14241k();
        mo13526K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo13256d() {
        this.f14379v = false;
        this.f14370m = null;
        aki aki = this.f14371n;
        if (aki != null) {
            aki.mo13846h();
            this.f14371n = null;
        }
        this.f14380w = 0;
        this.f14381x = 0;
        this.f14378u = null;
        this.f14376s = this.f14377t;
        this.f14373p = null;
        Handler handler = this.f14374q;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f14374q = null;
        }
        this.f14382y = C6540C.TIME_UNSET;
        this.f14383z = 0;
        this.f14352A = C6540C.TIME_UNSET;
        this.f14353B = 0;
        this.f14365h.clear();
        this.f14360c.mo16577d();
    }

    /* renamed from: u */
    public final void mo13257u() throws IOException {
        this.f14369l.mo13518a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo13527y() {
        this.f14374q.removeCallbacks(this.f14367j);
        mo13526K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo13528z(long j) {
        long j2 = this.f14352A;
        if (j2 == C6540C.TIME_UNSET || j2 < j) {
            this.f14352A = j;
        }
    }
}
