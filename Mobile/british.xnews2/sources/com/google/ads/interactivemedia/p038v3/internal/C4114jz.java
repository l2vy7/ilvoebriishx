package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jz */
/* compiled from: IMASDK */
final class C4114jz implements Handler.Callback, aay, C4141kz, C4086iy, C4151li {

    /* renamed from: A */
    private int f17593A = 0;

    /* renamed from: B */
    private boolean f17594B = false;

    /* renamed from: C */
    private boolean f17595C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f17596D;

    /* renamed from: E */
    private boolean f17597E;

    /* renamed from: F */
    private int f17598F;

    /* renamed from: G */
    private C4113jy f17599G;

    /* renamed from: H */
    private long f17600H;

    /* renamed from: I */
    private int f17601I;

    /* renamed from: J */
    private boolean f17602J;

    /* renamed from: K */
    private C4089ja f17603K;

    /* renamed from: L */
    private final C4085ix f17604L;

    /* renamed from: M */
    private final C4084iw f17605M;

    /* renamed from: a */
    private final C4156ln[] f17606a;

    /* renamed from: b */
    private final C4157lo[] f17607b;

    /* renamed from: c */
    private final aio f17608c;

    /* renamed from: d */
    private final aip f17609d;

    /* renamed from: e */
    private final aiz f17610e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final alb f17611f;

    /* renamed from: g */
    private final HandlerThread f17612g;

    /* renamed from: h */
    private final Looper f17613h;

    /* renamed from: i */
    private final C4170ma f17614i;

    /* renamed from: j */
    private final C4168lz f17615j;

    /* renamed from: k */
    private final long f17616k;

    /* renamed from: l */
    private final C4087iz f17617l;

    /* renamed from: m */
    private final ArrayList<C4109ju> f17618m;

    /* renamed from: n */
    private final aks f17619n;

    /* renamed from: o */
    private final C4111jw f17620o;

    /* renamed from: p */
    private final C4135kt f17621p;

    /* renamed from: q */
    private final C4143la f17622q;

    /* renamed from: r */
    private final long f17623r;

    /* renamed from: s */
    private C4159lq f17624s;

    /* renamed from: t */
    private C4145lc f17625t;

    /* renamed from: u */
    private C4110jv f17626u;

    /* renamed from: v */
    private boolean f17627v;

    /* renamed from: w */
    private boolean f17628w;

    /* renamed from: x */
    private boolean f17629x;

    /* renamed from: y */
    private boolean f17630y;

    /* renamed from: z */
    private boolean f17631z;

    public C4114jz(C4156ln[] lnVarArr, aio aio, aip aip, C4085ix ixVar, aiz aiz, C4201ne neVar, C4159lq lqVar, C4084iw iwVar, long j, Looper looper, aks aks, C4111jw jwVar) {
        this.f17620o = jwVar;
        this.f17606a = lnVarArr;
        this.f17608c = aio;
        this.f17609d = aip;
        this.f17604L = ixVar;
        this.f17610e = aiz;
        this.f17624s = lqVar;
        this.f17605M = iwVar;
        this.f17623r = 500;
        this.f17628w = false;
        this.f17619n = aks;
        this.f17616k = ixVar.mo15972d();
        C4145lc a = C4145lc.m17839a(aip);
        this.f17625t = a;
        this.f17626u = new C4110jv(a);
        int length = lnVarArr.length;
        this.f17607b = new C4157lo[2];
        for (int i = 0; i < 2; i++) {
            lnVarArr[i].mo15950c(i);
            this.f17607b[i] = lnVarArr[i].mo15949b();
        }
        this.f17617l = new C4087iz(this, aks);
        this.f17618m = new ArrayList<>();
        this.f17614i = new C4170ma();
        this.f17615j = new C4168lz();
        aio.mo13780i(aiz);
        this.f17602J = true;
        Handler handler = new Handler(looper);
        this.f17621p = new C4135kt(neVar, handler);
        this.f17622q = new C4143la(this, neVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f17612g = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f17613h = looper2;
        this.f17611f = aks.mo13858b(looper2, this);
    }

    /* renamed from: A */
    private final long m17556A(C4171mb mbVar, Object obj, long j) {
        mbVar.mo16334w(mbVar.mo15925g(obj, this.f17615j).f17914c, this.f17614i);
        C4170ma maVar = this.f17614i;
        if (maVar.f17930f != C6540C.TIME_UNSET && maVar.mo16326b()) {
            C4170ma maVar2 = this.f17614i;
            if (maVar2.f17933i) {
                return C4083iv.m17452b(amm.m14218ah(maVar2.f17931g) - this.f17614i.f17930f) - (j + this.f17615j.f17916e);
            }
        }
        return C6540C.TIME_UNSET;
    }

    /* renamed from: B */
    private final boolean m17557B(C4171mb mbVar, abb abb) {
        if (!abb.mo13312b() && !mbVar.mo16333v()) {
            mbVar.mo16334w(mbVar.mo15925g(abb.f13998a, this.f17615j).f17914c, this.f17614i);
            if (this.f17614i.mo16326b()) {
                C4170ma maVar = this.f17614i;
                if (!maVar.f17933i || maVar.f17930f == C6540C.TIME_UNSET) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private final void m17558C(long j, long j2) {
        this.f17611f.mo13887h();
        this.f17611f.mo13889j(j + j2);
    }

    /* renamed from: D */
    private final long m17559D(abb abb, long j, boolean z) throws C4089ja {
        return m17560E(abb, j, this.f17621p.mo16189h() != this.f17621p.mo16190i(), z);
    }

    /* renamed from: E */
    private final long m17560E(abb abb, long j, boolean z, boolean z2) throws C4089ja {
        m17602x();
        this.f17630y = false;
        if (z2 || this.f17625t.f17810d == 3) {
            m17597s(2);
        }
        C4132kq h = this.f17621p.mo16189h();
        C4132kq kqVar = h;
        while (kqVar != null && !abb.equals(kqVar.f17739f.f17749a)) {
            kqVar = kqVar.mo16172o();
        }
        if (z || h != kqVar || (kqVar != null && kqVar.mo16158a(j) < 0)) {
            C4156ln[] lnVarArr = this.f17606a;
            int length = lnVarArr.length;
            for (int i = 0; i < 2; i++) {
                m17567L(lnVarArr[i]);
            }
            if (kqVar != null) {
                while (this.f17621p.mo16189h() != kqVar) {
                    this.f17621p.mo16192k();
                }
                this.f17621p.mo16193l(kqVar);
                kqVar.mo16176s();
                m17578W();
            }
        }
        if (kqVar != null) {
            this.f17621p.mo16193l(kqVar);
            if (!kqVar.f17737d) {
                kqVar.f17739f = kqVar.f17739f.mo16177a(j);
            } else {
                long j2 = kqVar.f17739f.f17753e;
                if (j2 != C6540C.TIME_UNSET && j >= j2) {
                    j = Math.max(0, j2 - 1);
                }
                if (kqVar.f17738e) {
                    long h2 = kqVar.f17734a.mo13235h(j);
                    kqVar.f17734a.mo13243p(h2 - this.f17616k);
                    j = h2;
                }
            }
            m17561F(j);
            m17574S();
        } else {
            this.f17621p.mo16194m();
            m17561F(j);
        }
        m17580Y(false);
        this.f17611f.mo13888i(2);
        return j;
    }

    /* renamed from: F */
    private final void m17561F(long j) throws C4089ja {
        C4132kq h = this.f17621p.mo16189h();
        if (h != null) {
            j = h.mo16158a(j);
        }
        this.f17600H = j;
        this.f17617l.mo15980c(j);
        C4156ln[] lnVarArr = this.f17606a;
        int length = lnVarArr.length;
        for (int i = 0; i < 2; i++) {
            C4156ln lnVar = lnVarArr[i];
            if (m17589ah(lnVar)) {
                lnVar.mo15959o(this.f17600H);
            }
        }
        for (C4132kq h2 = this.f17621p.mo16189h(); h2 != null; h2 = h2.mo16172o()) {
            for (aih aih : h2.mo16174q().f15006c) {
            }
        }
    }

    /* renamed from: G */
    private final void m17562G(boolean z, boolean z2) {
        m17563H(z || !this.f17595C, false, true, false);
        this.f17626u.mo16027a(z2 ? 1 : 0);
        this.f17604L.mo15970b();
        m17597s(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17563H(boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r1 = r27
            com.google.ads.interactivemedia.v3.internal.alb r0 = r1.f17611f
            r0.mo13887h()
            r2 = 0
            r1.f17603K = r2
            r3 = 0
            r1.f17630y = r3
            com.google.ads.interactivemedia.v3.internal.iz r0 = r1.f17617l
            r0.mo15979b()
            r4 = 0
            r1.f17600H = r4
            com.google.ads.interactivemedia.v3.internal.ln[] r4 = r1.f17606a
            int r0 = r4.length
            r5 = 0
        L_0x001a:
            java.lang.String r6 = "ExoPlayerImplInternal"
            r7 = 2
            if (r5 >= r7) goto L_0x0030
            r0 = r4[r5]
            r1.m17567L(r0)     // Catch:{ ja -> 0x0027, RuntimeException -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r0 = move-exception
            goto L_0x0028
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            java.lang.String r7 = "Disable failed."
            com.google.ads.interactivemedia.p038v3.internal.ali.m14023b(r6, r7, r0)
        L_0x002d:
            int r5 = r5 + 1
            goto L_0x001a
        L_0x0030:
            if (r28 == 0) goto L_0x0048
            com.google.ads.interactivemedia.v3.internal.ln[] r4 = r1.f17606a
            int r0 = r4.length
            r5 = 0
        L_0x0036:
            if (r5 >= r7) goto L_0x0048
            r0 = r4[r5]
            r0.mo15962r()     // Catch:{ RuntimeException -> 0x003e }
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            com.google.ads.interactivemedia.p038v3.internal.ali.m14023b(r6, r0, r8)
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x0036
        L_0x0048:
            r1.f17598F = r3
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.f17625t
            com.google.ads.interactivemedia.v3.internal.abb r4 = r0.f17808b
            long r5 = r0.f17824r
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.f17625t
            com.google.ads.interactivemedia.v3.internal.lz r7 = r1.f17615j
            com.google.ads.interactivemedia.v3.internal.ma r8 = r1.f17614i
            boolean r0 = m17585ad(r0, r7, r8)
            if (r0 == 0) goto L_0x0061
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.f17625t
            long r7 = r0.f17809c
            goto L_0x0065
        L_0x0061:
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.f17625t
            long r7 = r0.f17824r
        L_0x0065:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r29 == 0) goto L_0x0097
            r1.f17599G = r2
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r0 = r0.f17807a
            android.util.Pair r0 = r1.m17564I(r0)
            java.lang.Object r4 = r0.first
            com.google.ads.interactivemedia.v3.internal.abb r4 = (com.google.ads.interactivemedia.p038v3.internal.abb) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.f17625t
            com.google.ads.interactivemedia.v3.internal.abb r0 = r0.f17808b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0092
            r0 = 1
            r15 = r4
            r23 = r5
            r7 = r9
            goto L_0x009b
        L_0x0092:
            r15 = r4
            r23 = r5
            r7 = r9
            goto L_0x009a
        L_0x0097:
            r15 = r4
            r23 = r5
        L_0x009a:
            r0 = 0
        L_0x009b:
            com.google.ads.interactivemedia.v3.internal.kt r4 = r1.f17621p
            r4.mo16194m()
            r1.f17631z = r3
            com.google.ads.interactivemedia.v3.internal.lc r3 = new com.google.ads.interactivemedia.v3.internal.lc
            com.google.ads.interactivemedia.v3.internal.lc r4 = r1.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r5 = r4.f17807a
            int r9 = r4.f17810d
            if (r31 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            com.google.ads.interactivemedia.v3.internal.ja r2 = r4.f17811e
        L_0x00af:
            r10 = r2
            if (r0 == 0) goto L_0x00b5
            com.google.ads.interactivemedia.v3.internal.acq r2 = com.google.ads.interactivemedia.p038v3.internal.acq.f14192a
            goto L_0x00b7
        L_0x00b5:
            com.google.ads.interactivemedia.v3.internal.acq r2 = r4.f17813g
        L_0x00b7:
            r12 = r2
            if (r0 == 0) goto L_0x00bd
            com.google.ads.interactivemedia.v3.internal.aip r2 = r1.f17609d
            goto L_0x00bf
        L_0x00bd:
            com.google.ads.interactivemedia.v3.internal.aip r2 = r4.f17814h
        L_0x00bf:
            r13 = r2
            if (r0 == 0) goto L_0x00c7
            com.google.ads.interactivemedia.v3.internal.atz r0 = com.google.ads.interactivemedia.p038v3.internal.atz.m14807i()
            goto L_0x00c9
        L_0x00c7:
            java.util.List<com.google.ads.interactivemedia.v3.internal.yn> r0 = r4.f17815i
        L_0x00c9:
            r14 = r0
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.f17625t
            r11 = 0
            boolean r2 = r0.f17817k
            r16 = r2
            int r2 = r0.f17818l
            r17 = r2
            com.google.ads.interactivemedia.v3.internal.ld r0 = r0.f17819m
            r18 = r0
            r21 = 0
            boolean r0 = r1.f17597E
            r25 = r0
            r26 = 0
            r4 = r3
            r6 = r15
            r19 = r23
            r4.<init>(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r26)
            r1.f17625t = r3
            if (r30 == 0) goto L_0x00f1
            com.google.ads.interactivemedia.v3.internal.la r0 = r1.f17622q
            r0.mo16206e()
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4114jz.m17563H(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: I */
    private final Pair<abb, Long> m17564I(C4171mb mbVar) {
        long j = 0;
        if (mbVar.mo16333v()) {
            return Pair.create(C4145lc.m17840b(), 0L);
        }
        C4171mb mbVar2 = mbVar;
        Pair<Object, Long> y = mbVar2.mo16336y(this.f17614i, this.f17615j, mbVar.mo13287e(this.f17594B), C6540C.TIME_UNSET);
        abb p = this.f17621p.mo16197p(mbVar, y.first, 0);
        long longValue = ((Long) y.second).longValue();
        if (p.mo13312b()) {
            mbVar.mo15925g(p.f13998a, this.f17615j);
            if (p.f14000c == this.f17615j.mo16316c(p.f13999b)) {
                this.f17615j.mo16322h();
            }
        } else {
            j = longValue;
        }
        return Pair.create(p, Long.valueOf(j));
    }

    /* renamed from: J */
    private final void m17565J(C4153lk lkVar) throws C4089ja {
        if (lkVar.mo16254e() == this.f17613h) {
            m17590ai(lkVar);
            int i = this.f17625t.f17810d;
            if (i == 3 || i == 2) {
                this.f17611f.mo13888i(2);
                return;
            }
            return;
        }
        this.f17611f.mo13881b(15, lkVar).mo13879a();
    }

    /* renamed from: K */
    private final void m17566K(C4171mb mbVar, C4171mb mbVar2) {
        if (!mbVar.mo16333v() || !mbVar2.mo16333v()) {
            int size = this.f17618m.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (!m17586ae(this.f17618m.get(size), mbVar, mbVar2, this.f17593A, this.f17594B, this.f17614i, this.f17615j)) {
                        this.f17618m.get(size).f17573a.mo16258i(false);
                        this.f17618m.remove(size);
                    }
                } else {
                    Collections.sort(this.f17618m);
                    return;
                }
            }
        }
    }

    /* renamed from: L */
    private final void m17567L(C4156ln lnVar) throws C4089ja {
        if (m17589ah(lnVar)) {
            this.f17617l.mo15982e(lnVar);
            m17591aj(lnVar);
            lnVar.mo15961q();
            this.f17598F--;
        }
    }

    /* renamed from: M */
    private final boolean m17568M() {
        C4132kq h = this.f17621p.mo16189h();
        long j = h.f17739f.f17753e;
        if (h.f17737d) {
            return j == C6540C.TIME_UNSET || this.f17625t.f17824r < j || !m17584ac();
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: com.google.ads.interactivemedia.v3.internal.ach} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: long} */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0244 A[Catch:{ all -> 0x0248, all -> 0x02c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0311  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17569N(com.google.ads.interactivemedia.p038v3.internal.C4171mb r32) throws com.google.ads.interactivemedia.p038v3.internal.C4089ja {
        /*
            r31 = this;
            r8 = r31
            r9 = r32
            com.google.ads.interactivemedia.v3.internal.lc r0 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.jy r10 = r8.f17599G
            com.google.ads.interactivemedia.v3.internal.kt r11 = r8.f17621p
            int r4 = r8.f17593A
            boolean r12 = r8.f17594B
            com.google.ads.interactivemedia.v3.internal.ma r13 = r8.f17614i
            com.google.ads.interactivemedia.v3.internal.lz r14 = r8.f17615j
            boolean r1 = r32.mo16333v()
            r15 = 4
            r16 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003b
            com.google.ads.interactivemedia.v3.internal.jx r0 = new com.google.ads.interactivemedia.v3.internal.jx
            com.google.ads.interactivemedia.v3.internal.abb r21 = com.google.ads.interactivemedia.p038v3.internal.C4145lc.m17840b()
            r22 = 0
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
            r27 = 1
            r28 = 0
            r20 = r0
            r20.<init>(r21, r22, r24, r26, r27, r28)
        L_0x0038:
            r7 = r0
            goto L_0x01b2
        L_0x003b:
            com.google.ads.interactivemedia.v3.internal.abb r5 = r0.f17808b
            java.lang.Object r3 = r5.f13998a
            boolean r1 = m17585ad(r0, r14, r13)
            if (r1 == 0) goto L_0x0048
            long r6 = r0.f17809c
            goto L_0x004a
        L_0x0048:
            long r6 = r0.f17824r
        L_0x004a:
            r22 = r6
            r7 = -1
            if (r10 == 0) goto L_0x00a1
            r6 = 1
            r1 = r32
            r2 = r10
            r29 = r3
            r3 = r6
            r6 = r5
            r5 = r12
            r30 = r6
            r6 = r13
            r7 = r14
            android.util.Pair r1 = m17587af(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x006c
            int r1 = r9.mo13287e(r12)
            r3 = r29
            r2 = 0
            r6 = 0
            r7 = 1
            goto L_0x0095
        L_0x006c:
            long r2 = r10.f17592c
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 != 0) goto L_0x007e
            java.lang.Object r1 = r1.first
            com.google.ads.interactivemedia.v3.internal.lz r1 = r9.mo15925g(r1, r14)
            int r7 = r1.f17914c
            r3 = r29
            r1 = 0
            goto L_0x008a
        L_0x007e:
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r22 = r1.longValue()
            r1 = 1
            r7 = -1
        L_0x008a:
            int r2 = r0.f17810d
            if (r2 != r15) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            r6 = r2
            r2 = r1
            r1 = r7
            r7 = 0
        L_0x0095:
            r4 = r1
            r29 = r2
            r27 = r6
            r28 = r7
            r7 = r30
            r15 = -1
            goto L_0x0132
        L_0x00a1:
            r29 = r3
            r30 = r5
            com.google.ads.interactivemedia.v3.internal.mb r2 = r0.f17807a
            boolean r2 = r2.mo16333v()
            if (r2 == 0) goto L_0x00bf
            int r1 = r9.mo13287e(r12)
            r4 = r1
            r3 = r29
            r7 = r30
            r15 = -1
        L_0x00b7:
            r27 = 0
            r28 = 0
        L_0x00bb:
            r29 = 0
            goto L_0x0132
        L_0x00bf:
            r10 = r29
            int r2 = r9.mo13290i(r10)
            r7 = -1
            if (r2 != r7) goto L_0x00ee
            com.google.ads.interactivemedia.v3.internal.mb r6 = r0.f17807a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r12
            r5 = r10
            r15 = -1
            r7 = r32
            java.lang.Object r1 = m17593k(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00de
            int r1 = r9.mo13287e(r12)
            r7 = 1
            goto L_0x00e5
        L_0x00de:
            com.google.ads.interactivemedia.v3.internal.lz r1 = r9.mo15925g(r1, r14)
            int r1 = r1.f17914c
            r7 = 0
        L_0x00e5:
            r4 = r1
            r28 = r7
            r3 = r10
            r7 = r30
            r27 = 0
            goto L_0x00bb
        L_0x00ee:
            r15 = -1
            if (r1 == 0) goto L_0x012d
            int r1 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x0100
            com.google.ads.interactivemedia.v3.internal.lz r1 = r9.mo15925g(r10, r14)
            int r1 = r1.f17914c
            r4 = r1
            r3 = r10
            r7 = r30
            goto L_0x00b7
        L_0x0100:
            com.google.ads.interactivemedia.v3.internal.mb r1 = r0.f17807a
            r7 = r30
            java.lang.Object r2 = r7.f13998a
            r1.mo15925g(r2, r14)
            long r1 = r14.f17916e
            com.google.ads.interactivemedia.v3.internal.lz r3 = r9.mo15925g(r10, r14)
            int r4 = r3.f17914c
            long r5 = r22 + r1
            r1 = r32
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo16336y(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r22 = r1.longValue()
            r4 = -1
            r27 = 0
            r28 = 0
            r29 = 1
            goto L_0x0132
        L_0x012d:
            r7 = r30
            r3 = r10
            r4 = -1
            goto L_0x00b7
        L_0x0132:
            if (r4 == r15) goto L_0x0150
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r32
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo16336y(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r22 = r1.longValue()
            r25 = r18
            r1 = r22
            goto L_0x0154
        L_0x0150:
            r1 = r22
            r25 = r1
        L_0x0154:
            com.google.ads.interactivemedia.v3.internal.abb r5 = r11.mo16197p(r9, r3, r1)
            int r4 = r5.f14002e
            if (r4 == r15) goto L_0x0167
            int r4 = r7.f14002e
            if (r4 == r15) goto L_0x0165
            int r6 = r5.f13999b
            if (r6 < r4) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r4 = 0
            goto L_0x0168
        L_0x0167:
            r4 = 1
        L_0x0168:
            java.lang.Object r6 = r7.f13998a
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x017f
            boolean r3 = r7.mo13312b()
            if (r3 != 0) goto L_0x017f
            boolean r3 = r5.mo13312b()
            if (r3 != 0) goto L_0x017f
            if (r4 == 0) goto L_0x017f
            r5 = r7
        L_0x017f:
            boolean r3 = r5.mo13312b()
            if (r3 == 0) goto L_0x01a5
            boolean r1 = r5.equals(r7)
            if (r1 == 0) goto L_0x0190
            long r0 = r0.f17824r
            r23 = r0
            goto L_0x01a7
        L_0x0190:
            java.lang.Object r0 = r5.f13998a
            r9.mo15925g(r0, r14)
            int r0 = r5.f14000c
            int r1 = r5.f13999b
            int r1 = r14.mo16316c(r1)
            if (r0 != r1) goto L_0x01a2
            r14.mo16322h()
        L_0x01a2:
            r23 = r16
            goto L_0x01a7
        L_0x01a5:
            r23 = r1
        L_0x01a7:
            com.google.ads.interactivemedia.v3.internal.jx r0 = new com.google.ads.interactivemedia.v3.internal.jx
            r21 = r0
            r22 = r5
            r21.<init>(r22, r23, r25, r27, r28, r29)
            goto L_0x0038
        L_0x01b2:
            com.google.ads.interactivemedia.v3.internal.abb r10 = r7.f17584a
            long r11 = r7.f17586c
            boolean r0 = r7.f17587d
            long r13 = r7.f17585b
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.abb r1 = r1.f17808b
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x01cf
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t
            long r1 = r1.f17824r
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01cd
            goto L_0x01cf
        L_0x01cd:
            r15 = 0
            goto L_0x01d0
        L_0x01cf:
            r15 = 1
        L_0x01d0:
            boolean r1 = r7.f17588e     // Catch:{ all -> 0x02c8 }
            if (r1 == 0) goto L_0x01e4
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ all -> 0x02c8 }
            int r1 = r1.f17810d     // Catch:{ all -> 0x02c8 }
            r6 = 1
            if (r1 == r6) goto L_0x01df
            r1 = 4
            r8.m17597s(r1)     // Catch:{ all -> 0x02c8 }
        L_0x01df:
            r3 = 0
            r8.m17563H(r3, r3, r3, r6)     // Catch:{ all -> 0x02c8 }
            goto L_0x01e6
        L_0x01e4:
            r3 = 0
            r6 = 1
        L_0x01e6:
            if (r15 != 0) goto L_0x024b
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ all -> 0x02c8 }
            long r3 = r8.f17600H     // Catch:{ all -> 0x02c8 }
            com.google.ads.interactivemedia.v3.internal.kq r0 = r1.mo16190i()     // Catch:{ all -> 0x02c8 }
            r20 = -9223372036854775808
            if (r0 != 0) goto L_0x01f9
        L_0x01f4:
            r22 = r11
            r5 = r16
            goto L_0x023a
        L_0x01f9:
            long r16 = r0.mo16160c()     // Catch:{ all -> 0x02c8 }
            boolean r2 = r0.f17737d     // Catch:{ all -> 0x02c8 }
            if (r2 != 0) goto L_0x0202
            goto L_0x01f4
        L_0x0202:
            r22 = r11
            r5 = r16
            r2 = 0
        L_0x0207:
            com.google.ads.interactivemedia.v3.internal.ln[] r11 = r8.f17606a     // Catch:{ all -> 0x0248 }
            int r12 = r11.length     // Catch:{ all -> 0x0248 }
            r12 = 2
            if (r2 >= r12) goto L_0x023a
            r11 = r11[r2]     // Catch:{ all -> 0x0248 }
            boolean r11 = m17589ah(r11)     // Catch:{ all -> 0x0248 }
            if (r11 == 0) goto L_0x0237
            com.google.ads.interactivemedia.v3.internal.ln[] r11 = r8.f17606a     // Catch:{ all -> 0x0248 }
            r11 = r11[r2]     // Catch:{ all -> 0x0248 }
            com.google.ads.interactivemedia.v3.internal.ach r11 = r11.mo15948aZ()     // Catch:{ all -> 0x0248 }
            com.google.ads.interactivemedia.v3.internal.ach[] r12 = r0.f17736c     // Catch:{ all -> 0x0248 }
            r12 = r12[r2]     // Catch:{ all -> 0x0248 }
            if (r11 == r12) goto L_0x0224
            goto L_0x0237
        L_0x0224:
            com.google.ads.interactivemedia.v3.internal.ln[] r11 = r8.f17606a     // Catch:{ all -> 0x0248 }
            r11 = r11[r2]     // Catch:{ all -> 0x0248 }
            long r11 = r11.mo15955k()     // Catch:{ all -> 0x0248 }
            int r17 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r17 != 0) goto L_0x0233
            r5 = r20
            goto L_0x023a
        L_0x0233:
            long r5 = java.lang.Math.max(r11, r5)     // Catch:{ all -> 0x0248 }
        L_0x0237:
            int r2 = r2 + 1
            goto L_0x0207
        L_0x023a:
            r2 = r32
            r11 = 0
            r12 = 1
            boolean r0 = r1.mo16195n(r2, r3, r5)     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x027b
            r8.m17600v(r11)     // Catch:{ all -> 0x02c6 }
            goto L_0x027b
        L_0x0248:
            r0 = move-exception
            goto L_0x02cb
        L_0x024b:
            r22 = r11
            r11 = 0
            r12 = 1
            boolean r1 = r32.mo16333v()     // Catch:{ all -> 0x02c6 }
            if (r1 != 0) goto L_0x027b
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ all -> 0x02c6 }
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16189h()     // Catch:{ all -> 0x02c6 }
        L_0x025b:
            if (r1 == 0) goto L_0x0276
            com.google.ads.interactivemedia.v3.internal.kr r2 = r1.f17739f     // Catch:{ all -> 0x02c6 }
            com.google.ads.interactivemedia.v3.internal.abb r2 = r2.f17749a     // Catch:{ all -> 0x02c6 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x02c6 }
            if (r2 == 0) goto L_0x0271
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ all -> 0x02c6 }
            com.google.ads.interactivemedia.v3.internal.kr r3 = r1.f17739f     // Catch:{ all -> 0x02c6 }
            com.google.ads.interactivemedia.v3.internal.kr r2 = r2.mo16196o(r9, r3)     // Catch:{ all -> 0x02c6 }
            r1.f17739f = r2     // Catch:{ all -> 0x02c6 }
        L_0x0271:
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16172o()     // Catch:{ all -> 0x02c6 }
            goto L_0x025b
        L_0x0276:
            long r0 = r8.m17559D(r10, r13, r0)     // Catch:{ all -> 0x02c6 }
            r13 = r0
        L_0x027b:
            com.google.ads.interactivemedia.v3.internal.lc r0 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r4 = r0.f17807a
            com.google.ads.interactivemedia.v3.internal.abb r5 = r0.f17808b
            boolean r0 = r7.f17589f
            if (r12 == r0) goto L_0x0288
            r6 = r18
            goto L_0x0289
        L_0x0288:
            r6 = r13
        L_0x0289:
            r1 = r31
            r2 = r32
            r3 = r10
            r1.m17570O(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x029b
            com.google.ads.interactivemedia.v3.internal.lc r0 = r8.f17625t
            long r0 = r0.f17809c
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02a7
        L_0x029b:
            r1 = r31
            r2 = r10
            r3 = r13
            r5 = r22
            com.google.ads.interactivemedia.v3.internal.lc r0 = r1.m17577V(r2, r3, r5)
            r8.f17625t = r0
        L_0x02a7:
            r31.m17571P()
            com.google.ads.interactivemedia.v3.internal.lc r0 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r0 = r0.f17807a
            r8.m17566K(r9, r0)
            com.google.ads.interactivemedia.v3.internal.lc r0 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.lc r0 = r0.mo16216d(r9)
            r8.f17625t = r0
            boolean r0 = r32.mo16333v()
            if (r0 != 0) goto L_0x02c2
            r1 = 0
            r8.f17599G = r1
        L_0x02c2:
            r8.m17580Y(r11)
            return
        L_0x02c6:
            r0 = move-exception
            goto L_0x02cd
        L_0x02c8:
            r0 = move-exception
            r22 = r11
        L_0x02cb:
            r11 = 0
            r12 = 1
        L_0x02cd:
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r4 = r1.f17807a
            com.google.ads.interactivemedia.v3.internal.abb r5 = r1.f17808b
            boolean r1 = r7.f17589f
            if (r12 == r1) goto L_0x02da
            r6 = r18
            goto L_0x02db
        L_0x02da:
            r6 = r13
        L_0x02db:
            r1 = r31
            r2 = r32
            r3 = r10
            r1.m17570O(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x02ed
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t
            long r1 = r1.f17809c
            int r3 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x02f9
        L_0x02ed:
            r1 = r31
            r2 = r10
            r3 = r13
            r5 = r22
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.m17577V(r2, r3, r5)
            r8.f17625t = r1
        L_0x02f9:
            r31.m17571P()
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r1 = r1.f17807a
            r8.m17566K(r9, r1)
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.mo16216d(r9)
            r8.f17625t = r1
            boolean r1 = r32.mo16333v()
            if (r1 != 0) goto L_0x0314
            r1 = 0
            r8.f17599G = r1
        L_0x0314:
            r8.m17580Y(r11)
            goto L_0x0319
        L_0x0318:
            throw r0
        L_0x0319:
            goto L_0x0318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4114jz.m17569N(com.google.ads.interactivemedia.v3.internal.mb):void");
    }

    /* renamed from: O */
    private final void m17570O(C4171mb mbVar, abb abb, C4171mb mbVar2, abb abb2, long j) {
        if (mbVar.mo16333v() || !m17557B(mbVar, abb)) {
            float f = this.f17617l.mo13914i().f17826b;
            C4146ld ldVar = this.f17625t.f17819m;
            if (f != ldVar.f17826b) {
                this.f17617l.mo13913h(ldVar);
                return;
            }
            return;
        }
        mbVar.mo16334w(mbVar.mo15925g(abb.f13998a, this.f17615j).f17914c, this.f17614i);
        C4084iw iwVar = this.f17605M;
        C4127kl klVar = this.f17614i.f17935k;
        int i = amm.f15298a;
        iwVar.mo15964a(klVar);
        if (j != C6540C.TIME_UNSET) {
            this.f17605M.mo15965b(m17556A(mbVar, abb.f13998a, j));
            return;
        }
        if (!amm.m14233c(!mbVar2.mo16333v() ? mbVar2.mo16334w(mbVar2.mo15925g(abb2.f13998a, this.f17615j).f17914c, this.f17614i).f17926b : null, this.f17614i.f17926b)) {
            this.f17605M.mo15965b(C6540C.TIME_UNSET);
        }
    }

    /* renamed from: P */
    private final void m17571P() {
        C4132kq h = this.f17621p.mo16189h();
        boolean z = false;
        if (h != null && h.f17739f.f17755g && this.f17628w) {
            z = true;
        }
        this.f17629x = z;
    }

    /* renamed from: Q */
    private final void m17572Q(C4146ld ldVar, boolean z) throws C4089ja {
        m17573R(ldVar, ldVar.f17826b, true, z);
    }

    /* renamed from: R */
    private final void m17573R(C4146ld ldVar, float f, boolean z, boolean z2) throws C4089ja {
        C4114jz jzVar;
        C4146ld ldVar2;
        int i;
        C4146ld ldVar3 = ldVar;
        if (z) {
            if (z2) {
                this.f17626u.mo16027a(1);
            }
            C4145lc lcVar = this.f17625t;
            C4145lc lcVar2 = r1;
            C4145lc lcVar3 = lcVar2;
            C4145lc lcVar4 = lcVar;
            ldVar2 = ldVar;
            C4145lc lcVar5 = new C4145lc(lcVar.f17807a, lcVar.f17808b, lcVar.f17809c, lcVar.f17810d, lcVar.f17811e, lcVar.f17812f, lcVar.f17813g, lcVar.f17814h, lcVar.f17815i, lcVar.f17816j, lcVar.f17817k, lcVar.f17818l, ldVar, lcVar4.f17822p, lcVar4.f17823q, lcVar4.f17824r, lcVar4.f17820n, lcVar4.f17821o);
            jzVar = this;
            jzVar.f17625t = lcVar2;
        } else {
            jzVar = this;
            ldVar2 = ldVar3;
        }
        float f2 = ldVar2.f17826b;
        C4132kq h = jzVar.f17621p.mo16189h();
        while (true) {
            i = 0;
            if (h == null) {
                break;
            }
            aih[] aihArr = h.mo16174q().f15006c;
            int length = aihArr.length;
            while (i < length) {
                aih aih = aihArr[i];
                if (aih != null) {
                    aih.mo13733g(f2);
                }
                i++;
            }
            h = h.mo16172o();
        }
        C4156ln[] lnVarArr = jzVar.f17606a;
        int length2 = lnVarArr.length;
        while (i < 2) {
            C4156ln lnVar = lnVarArr[i];
            if (lnVar != null) {
                lnVar.mo14027I(f, ldVar2.f17826b);
            } else {
                float f3 = f;
            }
            i++;
        }
    }

    /* renamed from: S */
    private final void m17574S() {
        boolean z;
        if (!m17575T()) {
            z = false;
        } else {
            C4132kq g = this.f17621p.mo16188g();
            long aa = m17582aa(g.mo16164g());
            if (g == this.f17621p.mo16189h()) {
                g.mo16159b(this.f17600H);
            } else {
                g.mo16159b(this.f17600H);
                long j = g.f17739f.f17750b;
            }
            z = this.f17604L.mo15976h(aa, this.f17617l.mo13914i().f17826b);
        }
        this.f17631z = z;
        if (z) {
            this.f17621p.mo16188g().mo16167j(this.f17600H);
        }
        m17576U();
    }

    /* renamed from: T */
    private final boolean m17575T() {
        C4132kq g = this.f17621p.mo16188g();
        if (g == null || g.mo16164g() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    private final void m17576U() {
        C4132kq g = this.f17621p.mo16188g();
        boolean z = this.f17631z || (g != null && g.f17734a.mo13241n());
        C4145lc lcVar = this.f17625t;
        if (z != lcVar.f17812f) {
            this.f17625t = new C4145lc(lcVar.f17807a, lcVar.f17808b, lcVar.f17809c, lcVar.f17810d, lcVar.f17811e, z, lcVar.f17813g, lcVar.f17814h, lcVar.f17815i, lcVar.f17816j, lcVar.f17817k, lcVar.f17818l, lcVar.f17819m, lcVar.f17822p, lcVar.f17823q, lcVar.f17824r, lcVar.f17820n, lcVar.f17821o);
        }
    }

    /* renamed from: V */
    private final C4145lc m17577V(abb abb, long j, long j2) {
        atz atz;
        aip aip;
        acq acq;
        abb abb2 = abb;
        long j3 = j2;
        this.f17602J = this.f17602J || j != this.f17625t.f17824r || !abb2.equals(this.f17625t.f17808b);
        m17571P();
        C4145lc lcVar = this.f17625t;
        acq acq2 = lcVar.f17813g;
        aip aip2 = lcVar.f17814h;
        List<C4507yn> list = lcVar.f17815i;
        if (this.f17622q.mo16202a()) {
            C4132kq h = this.f17621p.mo16189h();
            if (h == null) {
                acq2 = acq.f14192a;
            } else {
                acq2 = h.mo16173p();
            }
            if (h == null) {
                aip2 = this.f17609d;
            } else {
                aip2 = h.mo16174q();
            }
            aih[] aihArr = aip2.f15006c;
            atv atv = new atv();
            boolean z = false;
            for (aih aih : aihArr) {
                if (aih != null) {
                    C4507yn ynVar = aih.mo13739l(0).f17679j;
                    if (ynVar == null) {
                        atv.mo14514d(new C4507yn(new C4506ym[0]));
                    } else {
                        atv.mo14514d(ynVar);
                        z = true;
                    }
                }
            }
            atz c = z ? atv.mo14513c() : atz.m14807i();
            if (h != null) {
                C4133kr krVar = h.f17739f;
                if (krVar.f17751c != j3) {
                    h.f17739f = krVar.mo16178b(j3);
                }
            }
            atz = c;
        } else if (!abb2.equals(this.f17625t.f17808b)) {
            acq = acq.f14192a;
            aip = this.f17609d;
            atz = atz.m14807i();
            return this.f17625t.mo16215c(abb, j, j2, m17581Z(), acq, aip, atz);
        } else {
            atz = list;
        }
        acq = acq2;
        aip = aip2;
        return this.f17625t.mo16215c(abb, j, j2, m17581Z(), acq, aip, atz);
    }

    /* renamed from: W */
    private final void m17578W() throws C4089ja {
        int length = this.f17606a.length;
        m17579X(new boolean[2]);
    }

    /* renamed from: X */
    private final void m17579X(boolean[] zArr) throws C4089ja {
        C4132kq i = this.f17621p.mo16190i();
        aip q = i.mo16174q();
        int i2 = 0;
        while (true) {
            int length = this.f17606a.length;
            if (i2 >= 2) {
                break;
            }
            if (!q.mo13781a(i2)) {
                this.f17606a[i2].mo15962r();
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length2 = this.f17606a.length;
            if (i3 < 2) {
                if (q.mo13781a(i3)) {
                    boolean z = zArr[i3];
                    C4156ln lnVar = this.f17606a[i3];
                    if (!m17589ah(lnVar)) {
                        C4132kq i4 = this.f17621p.mo16190i();
                        boolean z2 = i4 == this.f17621p.mo16189h();
                        aip q2 = i4.mo16174q();
                        C4158lp lpVar = q2.f15005b[i3];
                        C4120ke[] ag = m17588ag(q2.f15006c[i3]);
                        boolean z3 = m17584ac() && this.f17625t.f17810d == 3;
                        boolean z4 = !z && z3;
                        this.f17598F++;
                        lnVar.mo15953f(lpVar, ag, i4.f17736c[i3], this.f17600H, z4, z2, i4.mo16161d(), i4.mo16160c());
                        lnVar.mo14054t(103, new C4106jr(this));
                        this.f17617l.mo15981d(lnVar);
                        if (z3) {
                            lnVar.mo15946aX();
                        }
                    }
                }
                i3++;
            } else {
                i.f17740g = true;
                return;
            }
        }
    }

    /* renamed from: Y */
    private final void m17580Y(boolean z) {
        abb abb;
        long j;
        C4132kq g = this.f17621p.mo16188g();
        if (g == null) {
            abb = this.f17625t.f17808b;
        } else {
            abb = g.f17739f.f17749a;
        }
        boolean z2 = !this.f17625t.f17816j.equals(abb);
        if (z2) {
            this.f17625t = this.f17625t.mo16219g(abb);
        }
        C4145lc lcVar = this.f17625t;
        if (g == null) {
            j = lcVar.f17824r;
        } else {
            j = g.mo16163f();
        }
        lcVar.f17822p = j;
        this.f17625t.f17823q = m17581Z();
        if ((z2 || z) && g != null && g.f17737d) {
            m17583ab(g.mo16173p(), g.mo16174q());
        }
    }

    /* renamed from: Z */
    private final long m17581Z() {
        return m17582aa(this.f17625t.f17822p);
    }

    /* renamed from: aa */
    private final long m17582aa(long j) {
        C4132kq g = this.f17621p.mo16188g();
        if (g == null) {
            return 0;
        }
        return Math.max(0, j - g.mo16159b(this.f17600H));
    }

    /* renamed from: ab */
    private final void m17583ab(acq acq, aip aip) {
        this.f17604L.mo15975g(this.f17606a, aip.f15006c);
    }

    /* renamed from: ac */
    private final boolean m17584ac() {
        C4145lc lcVar = this.f17625t;
        return lcVar.f17817k && lcVar.f17818l == 0;
    }

    /* renamed from: ad */
    private static boolean m17585ad(C4145lc lcVar, C4168lz lzVar, C4170ma maVar) {
        abb abb = lcVar.f17808b;
        C4171mb mbVar = lcVar.f17807a;
        return abb.mo13312b() || mbVar.mo16333v() || mbVar.mo16334w(mbVar.mo15925g(abb.f13998a, lzVar).f17914c, maVar).f17936l;
    }

    /* renamed from: ae */
    private static boolean m17586ae(C4109ju juVar, C4171mb mbVar, C4171mb mbVar2, int i, boolean z, C4170ma maVar, C4168lz lzVar) {
        C4109ju juVar2 = juVar;
        C4171mb mbVar3 = mbVar;
        C4171mb mbVar4 = mbVar2;
        C4168lz lzVar2 = lzVar;
        Object obj = juVar2.f17576d;
        if (obj == null) {
            juVar2.f17573a.mo16255f();
            juVar2.f17573a.mo16255f();
            Pair<Object, Long> af = m17587af(mbVar, new C4113jy(juVar2.f17573a.mo16250a(), juVar2.f17573a.mo16256g(), C4083iv.m17452b(C6540C.TIME_UNSET)), false, i, z, maVar, lzVar);
            if (af == null) {
                return false;
            }
            juVar.mo16025a(mbVar.mo13290i(af.first), ((Long) af.second).longValue(), af.first);
            juVar2.f17573a.mo16255f();
            return true;
        }
        int i2 = mbVar.mo13290i(obj);
        if (i2 == -1) {
            return false;
        }
        juVar2.f17573a.mo16255f();
        juVar2.f17574b = i2;
        mbVar2.mo15925g(juVar2.f17576d, lzVar2);
        if (mbVar2.mo16334w(lzVar2.f17914c, maVar).f17936l) {
            Pair<Object, Long> y = mbVar.mo16336y(maVar, lzVar, mbVar.mo15925g(juVar2.f17576d, lzVar2).f17914c, juVar2.f17575c + lzVar2.f17916e);
            juVar.mo16025a(mbVar.mo13290i(y.first), ((Long) y.second).longValue(), y.first);
        }
        return true;
    }

    /* renamed from: af */
    private static Pair<Object, Long> m17587af(C4171mb mbVar, C4113jy jyVar, boolean z, int i, boolean z2, C4170ma maVar, C4168lz lzVar) {
        Object k;
        C4171mb mbVar2 = mbVar;
        C4113jy jyVar2 = jyVar;
        C4168lz lzVar2 = lzVar;
        C4171mb mbVar3 = jyVar2.f17590a;
        if (mbVar.mo16333v()) {
            return null;
        }
        C4171mb mbVar4 = true == mbVar3.mo16333v() ? mbVar2 : mbVar3;
        try {
            Pair<Object, Long> y = mbVar4.mo16336y(maVar, lzVar, jyVar2.f17591b, jyVar2.f17592c);
            if (mbVar.equals(mbVar4)) {
                return y;
            }
            if (mbVar.mo13290i(y.first) != -1) {
                mbVar4.mo15925g(y.first, lzVar2);
                if (!mbVar4.mo16334w(lzVar2.f17914c, maVar).f17936l) {
                    return y;
                }
                return mbVar.mo16336y(maVar, lzVar, mbVar.mo15925g(y.first, lzVar2).f17914c, jyVar2.f17592c);
            }
            C4170ma maVar2 = maVar;
            if (z && (k = m17593k(maVar, lzVar, i, z2, y.first, mbVar4, mbVar)) != null) {
                return mbVar.mo16336y(maVar, lzVar, mbVar.mo15925g(k, lzVar2).f17914c, C6540C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: ag */
    private static C4120ke[] m17588ag(aih aih) {
        int k = aih != null ? aih.mo13738k() : 0;
        C4120ke[] keVarArr = new C4120ke[k];
        for (int i = 0; i < k; i++) {
            keVarArr[i] = aih.mo13739l(i);
        }
        return keVarArr;
    }

    /* renamed from: ah */
    private static boolean m17589ah(C4156ln lnVar) {
        return lnVar.mo15952e() != 0;
    }

    /* renamed from: ai */
    private static final void m17590ai(C4153lk lkVar) throws C4089ja {
        lkVar.mo16260k();
        try {
            lkVar.mo16251b().mo14054t(lkVar.mo16252c(), lkVar.mo16253d());
        } finally {
            lkVar.mo16258i(true);
        }
    }

    /* renamed from: aj */
    private static final void m17591aj(C4156ln lnVar) throws C4089ja {
        if (lnVar.mo15952e() == 2) {
            lnVar.mo15960p();
        }
    }

    /* renamed from: ak */
    private static final void m17592ak(C4156ln lnVar) {
        lnVar.mo15956l();
        if (lnVar instanceof ahp) {
            ahp ahp = (ahp) lnVar;
            throw null;
        }
    }

    /* renamed from: k */
    static Object m17593k(C4170ma maVar, C4168lz lzVar, int i, boolean z, Object obj, C4171mb mbVar, C4171mb mbVar2) {
        int i2 = mbVar.mo13290i(obj);
        int u = mbVar.mo13272u();
        int i3 = 0;
        int i4 = i2;
        int i5 = -1;
        while (true) {
            if (i3 >= u || i5 != -1) {
                break;
            }
            i4 = mbVar.mo16335x(i4, lzVar, maVar, i, z);
            if (i4 == -1) {
                i5 = -1;
                break;
            }
            i5 = mbVar2.mo13290i(mbVar.mo13291j(i4));
            i3++;
        }
        if (i5 == -1) {
            return null;
        }
        return mbVar2.mo13291j(i5);
    }

    /* renamed from: r */
    private final synchronized void m17596r(arv<Boolean> arv, long j) {
        long j2 = 500;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        while (!arv.mo14153a().booleanValue() && j2 > 0) {
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
            j2 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: s */
    private final void m17597s(int i) {
        C4145lc lcVar = this.f17625t;
        if (lcVar.f17810d != i) {
            this.f17625t = lcVar.mo16217e(i);
        }
    }

    /* renamed from: t */
    private final void m17598t() {
        this.f17626u.mo16028b(this.f17625t);
        if (this.f17626u.f17583g) {
            this.f17620o.mo15989a(this.f17626u);
            this.f17626u = new C4110jv(this.f17625t);
        }
    }

    /* renamed from: u */
    private final void m17599u(boolean z, int i, boolean z2, int i2) throws C4089ja {
        this.f17626u.mo16027a(z2 ? 1 : 0);
        this.f17626u.mo16030d(i2);
        this.f17625t = this.f17625t.mo16220h(z, i);
        this.f17630y = false;
        for (C4132kq h = this.f17621p.mo16189h(); h != null; h = h.mo16172o()) {
            for (aih aih : h.mo16174q().f15006c) {
            }
        }
        if (!m17584ac()) {
            m17602x();
            m17603y();
            return;
        }
        int i3 = this.f17625t.f17810d;
        if (i3 == 3) {
            m17601w();
            this.f17611f.mo13888i(2);
        } else if (i3 == 2) {
            this.f17611f.mo13888i(2);
        }
    }

    /* renamed from: v */
    private final void m17600v(boolean z) throws C4089ja {
        abb abb = this.f17621p.mo16189h().f17739f.f17749a;
        long E = m17560E(abb, this.f17625t.f17824r, true, false);
        if (E != this.f17625t.f17824r) {
            this.f17625t = m17577V(abb, E, this.f17625t.f17809c);
            if (z) {
                this.f17626u.mo16029c(4);
            }
        }
    }

    /* renamed from: w */
    private final void m17601w() throws C4089ja {
        this.f17630y = false;
        this.f17617l.mo15978a();
        C4156ln[] lnVarArr = this.f17606a;
        int length = lnVarArr.length;
        for (int i = 0; i < 2; i++) {
            C4156ln lnVar = lnVarArr[i];
            if (m17589ah(lnVar)) {
                lnVar.mo15946aX();
            }
        }
    }

    /* renamed from: x */
    private final void m17602x() throws C4089ja {
        this.f17617l.mo15979b();
        C4156ln[] lnVarArr = this.f17606a;
        int length = lnVarArr.length;
        for (int i = 0; i < 2; i++) {
            C4156ln lnVar = lnVarArr[i];
            if (m17589ah(lnVar)) {
                m17591aj(lnVar);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00bc A[EDGE_INSN: B:84:0x00bc->B:36:0x00bc ?: BREAK  , SYNTHETIC] */
    /* renamed from: y */
    private final void m17603y() throws com.google.ads.interactivemedia.p038v3.internal.C4089ja {
        /*
            r12 = this;
            com.google.ads.interactivemedia.v3.internal.kt r0 = r12.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r0 = r0.mo16189h()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f17737d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            com.google.ads.interactivemedia.v3.internal.aaz r1 = r0.f17734a
            long r4 = r1.mo13233f()
            r8 = r4
            goto L_0x001b
        L_0x001a:
            r8 = r2
        L_0x001b:
            r1 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0040
            r12.m17561F(r8)
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            long r2 = r0.f17824r
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            com.google.ads.interactivemedia.v3.internal.abb r7 = r0.f17808b
            long r10 = r0.f17809c
            r6 = r12
            com.google.ads.interactivemedia.v3.internal.lc r0 = r6.m17577V(r7, r8, r10)
            r12.f17625t = r0
            com.google.ads.interactivemedia.v3.internal.jv r0 = r12.f17626u
            r2 = 4
            r0.mo16029c(r2)
            goto L_0x013b
        L_0x0040:
            com.google.ads.interactivemedia.v3.internal.iz r2 = r12.f17617l
            com.google.ads.interactivemedia.v3.internal.kt r3 = r12.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r3 = r3.mo16190i()
            if (r0 == r3) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            long r2 = r2.mo15983f(r3)
            r12.f17600H = r2
            long r2 = r0.mo16159b(r2)
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            long r4 = r0.f17824r
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r0 = r12.f17618m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0137
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            com.google.ads.interactivemedia.v3.internal.abb r0 = r0.f17808b
            boolean r0 = r0.mo13312b()
            if (r0 == 0) goto L_0x006f
            goto L_0x0137
        L_0x006f:
            boolean r0 = r12.f17602J
            if (r0 == 0) goto L_0x0078
            r6 = -1
            long r4 = r4 + r6
            r12.f17602J = r1
        L_0x0078:
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r6 = r0.f17807a
            com.google.ads.interactivemedia.v3.internal.abb r0 = r0.f17808b
            java.lang.Object r0 = r0.f13998a
            int r0 = r6.mo13290i(r0)
            int r6 = r12.f17601I
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r7 = r12.f17618m
            int r7 = r7.size()
            int r6 = java.lang.Math.min(r6, r7)
            r7 = 0
            if (r6 <= 0) goto L_0x009e
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            int r9 = r6 + -1
            java.lang.Object r8 = r8.get(r9)
            com.google.ads.interactivemedia.v3.internal.ju r8 = (com.google.ads.interactivemedia.p038v3.internal.C4109ju) r8
            goto L_0x009f
        L_0x009e:
            r8 = r7
        L_0x009f:
            if (r8 == 0) goto L_0x00bc
            int r9 = r8.f17574b
            if (r9 > r0) goto L_0x00ad
            if (r9 != r0) goto L_0x00bc
            long r8 = r8.f17575c
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x00bc
        L_0x00ad:
            int r6 = r6 + -1
            if (r6 <= 0) goto L_0x009e
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            int r9 = r6 + -1
            java.lang.Object r8 = r8.get(r9)
            com.google.ads.interactivemedia.v3.internal.ju r8 = (com.google.ads.interactivemedia.p038v3.internal.C4109ju) r8
            goto L_0x009f
        L_0x00bc:
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x00cd
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            java.lang.Object r8 = r8.get(r6)
            com.google.ads.interactivemedia.v3.internal.ju r8 = (com.google.ads.interactivemedia.p038v3.internal.C4109ju) r8
            goto L_0x00ce
        L_0x00cd:
            r8 = r7
        L_0x00ce:
            if (r8 == 0) goto L_0x00f3
            java.lang.Object r9 = r8.f17576d
            if (r9 == 0) goto L_0x00f3
            int r9 = r8.f17574b
            if (r9 < r0) goto L_0x00e0
            if (r9 != r0) goto L_0x00f3
            long r9 = r8.f17575c
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x00f3
        L_0x00e0:
            int r6 = r6 + 1
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x00cd
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            java.lang.Object r8 = r8.get(r6)
            com.google.ads.interactivemedia.v3.internal.ju r8 = (com.google.ads.interactivemedia.p038v3.internal.C4109ju) r8
            goto L_0x00ce
        L_0x00f3:
            if (r8 == 0) goto L_0x0135
            java.lang.Object r9 = r8.f17576d
            if (r9 == 0) goto L_0x0135
            int r9 = r8.f17574b
            if (r9 != r0) goto L_0x0135
            long r9 = r8.f17575c
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x0135
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x0135
            com.google.ads.interactivemedia.v3.internal.lk r9 = r8.f17573a     // Catch:{ all -> 0x0129 }
            r12.m17565J(r9)     // Catch:{ all -> 0x0129 }
            com.google.ads.interactivemedia.v3.internal.lk r8 = r8.f17573a
            r8.mo16257h()
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            r8.remove(r6)
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x0127
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r8 = r12.f17618m
            java.lang.Object r8 = r8.get(r6)
            com.google.ads.interactivemedia.v3.internal.ju r8 = (com.google.ads.interactivemedia.p038v3.internal.C4109ju) r8
            goto L_0x00f3
        L_0x0127:
            r8 = r7
            goto L_0x00f3
        L_0x0129:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.lk r1 = r8.f17573a
            r1.mo16257h()
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.ju> r1 = r12.f17618m
            r1.remove(r6)
            throw r0
        L_0x0135:
            r12.f17601I = r6
        L_0x0137:
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            r0.f17824r = r2
        L_0x013b:
            com.google.ads.interactivemedia.v3.internal.kt r0 = r12.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r0 = r0.mo16188g()
            com.google.ads.interactivemedia.v3.internal.lc r2 = r12.f17625t
            long r3 = r0.mo16163f()
            r2.f17822p = r3
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            long r2 = r12.m17581Z()
            r0.f17823q = r2
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            boolean r2 = r0.f17817k
            if (r2 == 0) goto L_0x01b3
            int r2 = r0.f17810d
            r3 = 3
            if (r2 != r3) goto L_0x01b3
            com.google.ads.interactivemedia.v3.internal.mb r2 = r0.f17807a
            com.google.ads.interactivemedia.v3.internal.abb r0 = r0.f17808b
            boolean r0 = r12.m17557B(r2, r0)
            if (r0 == 0) goto L_0x01b3
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            com.google.ads.interactivemedia.v3.internal.ld r2 = r0.f17819m
            float r2 = r2.f17826b
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01b3
            com.google.ads.interactivemedia.v3.internal.iw r2 = r12.f17605M
            com.google.ads.interactivemedia.v3.internal.mb r3 = r0.f17807a
            com.google.ads.interactivemedia.v3.internal.abb r4 = r0.f17808b
            java.lang.Object r4 = r4.f13998a
            long r5 = r0.f17824r
            long r3 = r12.m17556A(r3, r4, r5)
            long r5 = r12.m17581Z()
            float r0 = r2.mo15967d(r3, r5)
            com.google.ads.interactivemedia.v3.internal.iz r2 = r12.f17617l
            com.google.ads.interactivemedia.v3.internal.ld r2 = r2.mo13914i()
            float r2 = r2.f17826b
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01b3
            com.google.ads.interactivemedia.v3.internal.iz r2 = r12.f17617l
            com.google.ads.interactivemedia.v3.internal.lc r3 = r12.f17625t
            com.google.ads.interactivemedia.v3.internal.ld r3 = r3.f17819m
            com.google.ads.interactivemedia.v3.internal.ld r4 = new com.google.ads.interactivemedia.v3.internal.ld
            float r3 = r3.f17827c
            r4.<init>(r0, r3)
            r2.mo13913h(r4)
            com.google.ads.interactivemedia.v3.internal.lc r0 = r12.f17625t
            com.google.ads.interactivemedia.v3.internal.ld r0 = r0.f17819m
            com.google.ads.interactivemedia.v3.internal.iz r2 = r12.f17617l
            com.google.ads.interactivemedia.v3.internal.ld r2 = r2.mo13914i()
            float r2 = r2.f17826b
            r12.m17573R(r0, r2, r1, r1)
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4114jz.m17603y():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x034f, code lost:
        if (m17568M() != false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03bd, code lost:
        if (r7.f17604L.mo15973e(m17581Z(), r7.f17617l.mo13914i().f17826b, r7.f17630y, r28) != false) goto L_0x0351;
     */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04b0  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17604z() throws com.google.ads.interactivemedia.p038v3.internal.C4089ja, java.io.IOException {
        /*
            r39 = this;
            r7 = r39
            long r8 = android.os.SystemClock.uptimeMillis()
            com.google.ads.interactivemedia.v3.internal.lc r0 = r7.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r0 = r0.f17807a
            boolean r0 = r0.mo16333v()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 2
            r14 = 1
            r15 = 0
            if (r0 != 0) goto L_0x0269
            com.google.ads.interactivemedia.v3.internal.la r0 = r7.f17622q
            boolean r0 = r0.mo16202a()
            if (r0 != 0) goto L_0x0022
            goto L_0x0269
        L_0x0022:
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            long r1 = r7.f17600H
            r0.mo16185d(r1)
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            boolean r0 = r0.mo16186e()
            if (r0 == 0) goto L_0x0076
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            long r1 = r7.f17600H
            com.google.ads.interactivemedia.v3.internal.lc r3 = r7.f17625t
            com.google.ads.interactivemedia.v3.internal.kr r0 = r0.mo16187f(r1, r3)
            if (r0 == 0) goto L_0x0076
            com.google.ads.interactivemedia.v3.internal.kt r1 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.lo[] r2 = r7.f17607b
            com.google.ads.interactivemedia.v3.internal.aio r3 = r7.f17608c
            com.google.ads.interactivemedia.v3.internal.ix r4 = r7.f17604L
            com.google.ads.interactivemedia.v3.internal.ajl r19 = r4.mo15974f()
            com.google.ads.interactivemedia.v3.internal.la r4 = r7.f17622q
            com.google.ads.interactivemedia.v3.internal.aip r5 = r7.f17609d
            r16 = r1
            r17 = r2
            r18 = r3
            r20 = r4
            r21 = r0
            r22 = r5
            com.google.ads.interactivemedia.v3.internal.kq r1 = r16.mo16199r(r17, r18, r19, r20, r21, r22)
            com.google.ads.interactivemedia.v3.internal.aaz r2 = r1.f17734a
            long r3 = r0.f17750b
            r2.mo13228a(r7, r3)
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r0 = r0.mo16189h()
            if (r0 != r1) goto L_0x0073
            long r0 = r1.mo16161d()
            r7.m17561F(r0)
        L_0x0073:
            r7.m17580Y(r15)
        L_0x0076:
            boolean r0 = r7.f17631z
            if (r0 == 0) goto L_0x0084
            boolean r0 = r39.m17575T()
            r7.f17631z = r0
            r39.m17576U()
            goto L_0x0087
        L_0x0084:
            r39.m17574S()
        L_0x0087:
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r0 = r0.mo16190i()
            if (r0 != 0) goto L_0x0091
            goto L_0x017b
        L_0x0091:
            com.google.ads.interactivemedia.v3.internal.kq r1 = r0.mo16172o()
            if (r1 == 0) goto L_0x014b
            boolean r1 = r7.f17629x
            if (r1 == 0) goto L_0x009d
            goto L_0x014b
        L_0x009d:
            com.google.ads.interactivemedia.v3.internal.kt r1 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16190i()
            boolean r2 = r1.f17737d
            if (r2 == 0) goto L_0x017b
            r2 = 0
        L_0x00a8:
            com.google.ads.interactivemedia.v3.internal.ln[] r3 = r7.f17606a
            int r4 = r3.length
            if (r2 >= r13) goto L_0x00c4
            r3 = r3[r2]
            com.google.ads.interactivemedia.v3.internal.ach[] r4 = r1.f17736c
            r4 = r4[r2]
            com.google.ads.interactivemedia.v3.internal.ach r5 = r3.mo15948aZ()
            if (r5 != r4) goto L_0x017b
            if (r4 == 0) goto L_0x00c1
            boolean r3 = r3.mo15954j()
            if (r3 == 0) goto L_0x017b
        L_0x00c1:
            int r2 = r2 + 1
            goto L_0x00a8
        L_0x00c4:
            com.google.ads.interactivemedia.v3.internal.kq r1 = r0.mo16172o()
            boolean r1 = r1.f17737d
            if (r1 != 0) goto L_0x00da
            long r1 = r7.f17600H
            com.google.ads.interactivemedia.v3.internal.kq r3 = r0.mo16172o()
            long r3 = r3.mo16161d()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x017b
        L_0x00da:
            com.google.ads.interactivemedia.v3.internal.aip r0 = r0.mo16174q()
            com.google.ads.interactivemedia.v3.internal.kt r1 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16191j()
            com.google.ads.interactivemedia.v3.internal.aip r2 = r1.mo16174q()
            boolean r3 = r1.f17737d
            if (r3 == 0) goto L_0x010d
            com.google.ads.interactivemedia.v3.internal.aaz r3 = r1.f17734a
            long r3 = r3.mo13233f()
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x010d
            r1.mo16161d()
            com.google.ads.interactivemedia.v3.internal.ln[] r0 = r7.f17606a
            int r1 = r0.length
            r1 = 0
        L_0x00fd:
            if (r1 >= r13) goto L_0x017b
            r2 = r0[r1]
            com.google.ads.interactivemedia.v3.internal.ach r3 = r2.mo15948aZ()
            if (r3 == 0) goto L_0x010a
            m17592ak(r2)
        L_0x010a:
            int r1 = r1 + 1
            goto L_0x00fd
        L_0x010d:
            r3 = 0
        L_0x010e:
            com.google.ads.interactivemedia.v3.internal.ln[] r4 = r7.f17606a
            int r4 = r4.length
            if (r3 >= r13) goto L_0x017b
            boolean r4 = r0.mo13781a(r3)
            boolean r5 = r2.mo13781a(r3)
            if (r4 == 0) goto L_0x0148
            com.google.ads.interactivemedia.v3.internal.ln[] r4 = r7.f17606a
            r4 = r4[r3]
            boolean r4 = r4.mo15957m()
            if (r4 != 0) goto L_0x0148
            com.google.ads.interactivemedia.v3.internal.lo[] r4 = r7.f17607b
            r4 = r4[r3]
            r4.mo15945a()
            com.google.ads.interactivemedia.v3.internal.lp[] r4 = r0.f15005b
            r4 = r4[r3]
            com.google.ads.interactivemedia.v3.internal.lp[] r6 = r2.f15005b
            r6 = r6[r3]
            if (r5 == 0) goto L_0x013e
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0148
        L_0x013e:
            com.google.ads.interactivemedia.v3.internal.ln[] r4 = r7.f17606a
            r4 = r4[r3]
            r1.mo16161d()
            m17592ak(r4)
        L_0x0148:
            int r3 = r3 + 1
            goto L_0x010e
        L_0x014b:
            com.google.ads.interactivemedia.v3.internal.kr r1 = r0.f17739f
            boolean r1 = r1.f17756h
            if (r1 != 0) goto L_0x0155
            boolean r1 = r7.f17629x
            if (r1 == 0) goto L_0x017b
        L_0x0155:
            r1 = 0
        L_0x0156:
            com.google.ads.interactivemedia.v3.internal.ln[] r2 = r7.f17606a
            int r3 = r2.length
            if (r1 >= r13) goto L_0x017b
            r2 = r2[r1]
            com.google.ads.interactivemedia.v3.internal.ach[] r3 = r0.f17736c
            r3 = r3[r1]
            if (r3 == 0) goto L_0x0178
            com.google.ads.interactivemedia.v3.internal.ach r4 = r2.mo15948aZ()
            if (r4 != r3) goto L_0x0178
            boolean r3 = r2.mo15954j()
            if (r3 == 0) goto L_0x0178
            com.google.ads.interactivemedia.v3.internal.kr r3 = r0.f17739f
            long r3 = r3.f17753e
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            m17592ak(r2)
        L_0x0178:
            int r1 = r1 + 1
            goto L_0x0156
        L_0x017b:
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r0 = r0.mo16190i()
            if (r0 == 0) goto L_0x01ed
            com.google.ads.interactivemedia.v3.internal.kt r1 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16189h()
            if (r1 == r0) goto L_0x01ed
            boolean r0 = r0.f17740g
            if (r0 == 0) goto L_0x0190
            goto L_0x01ed
        L_0x0190:
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r0 = r0.mo16190i()
            com.google.ads.interactivemedia.v3.internal.aip r1 = r0.mo16174q()
            r2 = 0
            r3 = 0
        L_0x019c:
            com.google.ads.interactivemedia.v3.internal.ln[] r4 = r7.f17606a
            int r5 = r4.length
            if (r2 >= r13) goto L_0x01e8
            r4 = r4[r2]
            boolean r5 = m17589ah(r4)
            if (r5 == 0) goto L_0x01e5
            com.google.ads.interactivemedia.v3.internal.ach r5 = r4.mo15948aZ()
            com.google.ads.interactivemedia.v3.internal.ach[] r6 = r0.f17736c
            r6 = r6[r2]
            boolean r16 = r1.mo13781a(r2)
            if (r16 == 0) goto L_0x01ba
            if (r5 != r6) goto L_0x01ba
            goto L_0x01e5
        L_0x01ba:
            boolean r5 = r4.mo15957m()
            if (r5 != 0) goto L_0x01da
            com.google.ads.interactivemedia.v3.internal.aih[] r5 = r1.f15006c
            r5 = r5[r2]
            com.google.ads.interactivemedia.v3.internal.ke[] r17 = m17588ag(r5)
            com.google.ads.interactivemedia.v3.internal.ach[] r5 = r0.f17736c
            r18 = r5[r2]
            long r19 = r0.mo16161d()
            long r21 = r0.mo16160c()
            r16 = r4
            r16.mo15947aY(r17, r18, r19, r21)
            goto L_0x01e5
        L_0x01da:
            boolean r5 = r4.mo13723N()
            if (r5 == 0) goto L_0x01e4
            r7.m17567L(r4)
            goto L_0x01e5
        L_0x01e4:
            r3 = 1
        L_0x01e5:
            int r2 = r2 + 1
            goto L_0x019c
        L_0x01e8:
            if (r3 != 0) goto L_0x01ed
            r39.m17578W()
        L_0x01ed:
            r0 = 0
        L_0x01ee:
            boolean r1 = r39.m17584ac()
            if (r1 == 0) goto L_0x0269
            boolean r1 = r7.f17629x
            if (r1 != 0) goto L_0x0269
            com.google.ads.interactivemedia.v3.internal.kt r1 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16189h()
            if (r1 == 0) goto L_0x0269
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16172o()
            if (r1 == 0) goto L_0x0269
            long r2 = r7.f17600H
            long r4 = r1.mo16161d()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0269
            boolean r1 = r1.f17740g
            if (r1 == 0) goto L_0x0269
            if (r0 == 0) goto L_0x0219
            r39.m17598t()
        L_0x0219:
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r6 = r0.mo16189h()
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r4 = r0.mo16192k()
            com.google.ads.interactivemedia.v3.internal.kr r0 = r4.f17739f
            com.google.ads.interactivemedia.v3.internal.abb r1 = r0.f17749a
            long r2 = r0.f17750b
            long r10 = r0.f17751c
            r0 = r39
            r12 = r4
            r4 = r10
            com.google.ads.interactivemedia.v3.internal.lc r0 = r0.m17577V(r1, r2, r4)
            r7.f17625t = r0
            com.google.ads.interactivemedia.v3.internal.kr r0 = r6.f17739f
            boolean r0 = r0.f17754f
            if (r14 == r0) goto L_0x023f
            r0 = 3
            goto L_0x0240
        L_0x023f:
            r0 = 0
        L_0x0240:
            com.google.ads.interactivemedia.v3.internal.jv r1 = r7.f17626u
            r1.mo16029c(r0)
            com.google.ads.interactivemedia.v3.internal.lc r0 = r7.f17625t
            com.google.ads.interactivemedia.v3.internal.mb r3 = r0.f17807a
            com.google.ads.interactivemedia.v3.internal.kr r0 = r12.f17739f
            com.google.ads.interactivemedia.v3.internal.abb r2 = r0.f17749a
            com.google.ads.interactivemedia.v3.internal.kr r0 = r6.f17739f
            com.google.ads.interactivemedia.v3.internal.abb r4 = r0.f17749a
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r39
            r1 = r3
            r0.m17570O(r1, r2, r3, r4, r5)
            r39.m17571P()
            r39.m17603y()
            r0 = 1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01ee
        L_0x0269:
            com.google.ads.interactivemedia.v3.internal.lc r0 = r7.f17625t
            int r0 = r0.f17810d
            if (r0 == r14) goto L_0x0505
            r1 = 4
            if (r0 != r1) goto L_0x0274
            goto L_0x0505
        L_0x0274:
            com.google.ads.interactivemedia.v3.internal.kt r0 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r0 = r0.mo16189h()
            r2 = 10
            if (r0 != 0) goto L_0x0282
            r7.m17558C(r8, r2)
            return
        L_0x0282:
            java.lang.String r4 = "doSomeWork"
            com.google.ads.interactivemedia.p038v3.internal.age.m13544b(r4)
            r39.m17603y()
            boolean r4 = r0.f17737d
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x02fd
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 * r5
            com.google.ads.interactivemedia.v3.internal.aaz r4 = r0.f17734a
            com.google.ads.interactivemedia.v3.internal.lc r12 = r7.f17625t
            long r5 = r12.f17824r
            long r2 = r7.f17616k
            long r5 = r5 - r2
            r4.mo13243p(r5)
            r2 = 0
            r3 = 1
            r4 = 1
        L_0x02a5:
            com.google.ads.interactivemedia.v3.internal.ln[] r5 = r7.f17606a
            int r6 = r5.length
            if (r2 >= r13) goto L_0x0304
            r5 = r5[r2]
            boolean r6 = m17589ah(r5)
            if (r6 != 0) goto L_0x02b3
            goto L_0x02f8
        L_0x02b3:
            long r13 = r7.f17600H
            r5.mo13721L(r13, r10)
            if (r4 == 0) goto L_0x02c2
            boolean r4 = r5.mo13723N()
            if (r4 == 0) goto L_0x02c2
            r4 = 1
            goto L_0x02c3
        L_0x02c2:
            r4 = 0
        L_0x02c3:
            com.google.ads.interactivemedia.v3.internal.ach[] r13 = r0.f17736c
            r13 = r13[r2]
            com.google.ads.interactivemedia.v3.internal.ach r14 = r5.mo15948aZ()
            if (r13 != r14) goto L_0x02d6
            boolean r23 = r5.mo15954j()
            if (r23 == 0) goto L_0x02d6
            r23 = 1
            goto L_0x02d8
        L_0x02d6:
            r23 = 0
        L_0x02d8:
            if (r13 != r14) goto L_0x02eb
            if (r23 != 0) goto L_0x02eb
            boolean r13 = r5.mo13722M()
            if (r13 != 0) goto L_0x02eb
            boolean r13 = r5.mo13723N()
            if (r13 == 0) goto L_0x02e9
            goto L_0x02eb
        L_0x02e9:
            r13 = 0
            goto L_0x02ec
        L_0x02eb:
            r13 = 1
        L_0x02ec:
            if (r3 == 0) goto L_0x02f2
            if (r13 == 0) goto L_0x02f2
            r3 = 1
            goto L_0x02f3
        L_0x02f2:
            r3 = 0
        L_0x02f3:
            if (r13 != 0) goto L_0x02f8
            r5.mo15958n()
        L_0x02f8:
            int r2 = r2 + 1
            r13 = 2
            r14 = 1
            goto L_0x02a5
        L_0x02fd:
            com.google.ads.interactivemedia.v3.internal.aaz r2 = r0.f17734a
            r2.mo13229b()
            r3 = 1
            r4 = 1
        L_0x0304:
            com.google.ads.interactivemedia.v3.internal.kr r2 = r0.f17739f
            long r10 = r2.f17753e
            if (r4 == 0) goto L_0x033b
            boolean r2 = r0.f17737d
            if (r2 == 0) goto L_0x033b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031f
            com.google.ads.interactivemedia.v3.internal.lc r2 = r7.f17625t
            long r13 = r2.f17824r
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0340
        L_0x031f:
            boolean r2 = r7.f17629x
            if (r2 == 0) goto L_0x032d
            r7.f17629x = r15
            com.google.ads.interactivemedia.v3.internal.lc r2 = r7.f17625t
            int r2 = r2.f17818l
            r10 = 5
            r7.m17599u(r15, r2, r15, r10)
        L_0x032d:
            com.google.ads.interactivemedia.v3.internal.kr r2 = r0.f17739f
            boolean r2 = r2.f17756h
            if (r2 == 0) goto L_0x0340
            r7.m17597s(r1)
            r39.m17602x()
            goto L_0x0416
        L_0x033b:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0340:
            com.google.ads.interactivemedia.v3.internal.lc r2 = r7.f17625t
            int r10 = r2.f17810d
            r6 = 2
            if (r10 != r6) goto L_0x03d0
            int r10 = r7.f17598F
            if (r10 != 0) goto L_0x0354
            boolean r2 = r39.m17568M()
            if (r2 == 0) goto L_0x03d0
        L_0x0351:
            r2 = 3
            goto L_0x03c0
        L_0x0354:
            if (r3 != 0) goto L_0x0358
            goto L_0x03d0
        L_0x0358:
            boolean r10 = r2.f17812f
            if (r10 == 0) goto L_0x0351
            com.google.ads.interactivemedia.v3.internal.mb r2 = r2.f17807a
            com.google.ads.interactivemedia.v3.internal.kt r10 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r10 = r10.mo16189h()
            com.google.ads.interactivemedia.v3.internal.kr r10 = r10.f17739f
            com.google.ads.interactivemedia.v3.internal.abb r10 = r10.f17749a
            boolean r2 = r7.m17557B(r2, r10)
            if (r2 == 0) goto L_0x0377
            com.google.ads.interactivemedia.v3.internal.iw r2 = r7.f17605M
            long r10 = r2.mo15968e()
            r28 = r10
            goto L_0x0379
        L_0x0377:
            r28 = r4
        L_0x0379:
            com.google.ads.interactivemedia.v3.internal.kt r2 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16188g()
            boolean r4 = r2.mo16162e()
            if (r4 == 0) goto L_0x038d
            com.google.ads.interactivemedia.v3.internal.kr r4 = r2.f17739f
            boolean r4 = r4.f17756h
            if (r4 == 0) goto L_0x038d
            r4 = 1
            goto L_0x038e
        L_0x038d:
            r4 = 0
        L_0x038e:
            com.google.ads.interactivemedia.v3.internal.kr r5 = r2.f17739f
            com.google.ads.interactivemedia.v3.internal.abb r5 = r5.f17749a
            boolean r5 = r5.mo13312b()
            if (r5 == 0) goto L_0x039e
            boolean r2 = r2.f17737d
            if (r2 != 0) goto L_0x039e
            r2 = 1
            goto L_0x039f
        L_0x039e:
            r2 = 0
        L_0x039f:
            if (r4 != 0) goto L_0x0351
            if (r2 != 0) goto L_0x0351
            com.google.ads.interactivemedia.v3.internal.ix r2 = r7.f17604L
            long r24 = r39.m17581Z()
            com.google.ads.interactivemedia.v3.internal.iz r4 = r7.f17617l
            com.google.ads.interactivemedia.v3.internal.ld r4 = r4.mo13914i()
            float r4 = r4.f17826b
            boolean r5 = r7.f17630y
            r23 = r2
            r26 = r4
            r27 = r5
            boolean r2 = r23.mo15973e(r24, r26, r27, r28)
            if (r2 == 0) goto L_0x03d0
            goto L_0x0351
        L_0x03c0:
            r7.m17597s(r2)
            r3 = 0
            r7.f17603K = r3
            boolean r3 = r39.m17584ac()
            if (r3 == 0) goto L_0x0416
            r39.m17601w()
            goto L_0x0416
        L_0x03d0:
            r2 = 3
            com.google.ads.interactivemedia.v3.internal.lc r4 = r7.f17625t
            int r4 = r4.f17810d
            if (r4 != r2) goto L_0x0416
            int r2 = r7.f17598F
            if (r2 != 0) goto L_0x03e2
            boolean r2 = r39.m17568M()
            if (r2 != 0) goto L_0x0416
            goto L_0x03e4
        L_0x03e2:
            if (r3 != 0) goto L_0x0416
        L_0x03e4:
            boolean r2 = r39.m17584ac()
            r7.f17630y = r2
            r2 = 2
            r7.m17597s(r2)
            boolean r2 = r7.f17630y
            if (r2 == 0) goto L_0x0413
            com.google.ads.interactivemedia.v3.internal.kt r2 = r7.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16189h()
        L_0x03f8:
            if (r2 == 0) goto L_0x040e
            com.google.ads.interactivemedia.v3.internal.aip r3 = r2.mo16174q()
            com.google.ads.interactivemedia.v3.internal.aih[] r3 = r3.f15006c
            int r4 = r3.length
            r5 = 0
        L_0x0402:
            if (r5 >= r4) goto L_0x0409
            r10 = r3[r5]
            int r5 = r5 + 1
            goto L_0x0402
        L_0x0409:
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16172o()
            goto L_0x03f8
        L_0x040e:
            com.google.ads.interactivemedia.v3.internal.iw r2 = r7.f17605M
            r2.mo15966c()
        L_0x0413:
            r39.m17602x()
        L_0x0416:
            com.google.ads.interactivemedia.v3.internal.lc r2 = r7.f17625t
            int r2 = r2.f17810d
            r3 = 2
            if (r2 != r3) goto L_0x0462
            r2 = 0
        L_0x041e:
            com.google.ads.interactivemedia.v3.internal.ln[] r4 = r7.f17606a
            int r5 = r4.length
            if (r2 >= r3) goto L_0x0444
            r3 = r4[r2]
            boolean r3 = m17589ah(r3)
            if (r3 == 0) goto L_0x0440
            com.google.ads.interactivemedia.v3.internal.ln[] r3 = r7.f17606a
            r3 = r3[r2]
            com.google.ads.interactivemedia.v3.internal.ach r3 = r3.mo15948aZ()
            com.google.ads.interactivemedia.v3.internal.ach[] r4 = r0.f17736c
            r4 = r4[r2]
            if (r3 != r4) goto L_0x0440
            com.google.ads.interactivemedia.v3.internal.ln[] r3 = r7.f17606a
            r3 = r3[r2]
            r3.mo15958n()
        L_0x0440:
            int r2 = r2 + 1
            r3 = 2
            goto L_0x041e
        L_0x0444:
            com.google.ads.interactivemedia.v3.internal.lc r0 = r7.f17625t
            boolean r2 = r0.f17812f
            if (r2 != 0) goto L_0x0462
            long r2 = r0.f17823q
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0462
            boolean r0 = r39.m17575T()
            if (r0 != 0) goto L_0x045a
            goto L_0x0462
        L_0x045a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x0462:
            boolean r0 = r7.f17597E
            com.google.ads.interactivemedia.v3.internal.lc r2 = r7.f17625t
            boolean r3 = r2.f17820n
            if (r0 == r3) goto L_0x0470
            com.google.ads.interactivemedia.v3.internal.lc r0 = r2.mo16221i(r0)
            r7.f17625t = r0
        L_0x0470:
            boolean r0 = r39.m17584ac()
            if (r0 == 0) goto L_0x047d
            com.google.ads.interactivemedia.v3.internal.lc r0 = r7.f17625t
            int r0 = r0.f17810d
            r2 = 3
            if (r0 == r2) goto L_0x0484
        L_0x047d:
            com.google.ads.interactivemedia.v3.internal.lc r0 = r7.f17625t
            int r0 = r0.f17810d
            r2 = 2
            if (r0 != r2) goto L_0x0498
        L_0x0484:
            boolean r0 = r7.f17597E
            if (r0 == 0) goto L_0x048f
            boolean r0 = r7.f17596D
            if (r0 == 0) goto L_0x048f
            r0 = 1
            r12 = 0
            goto L_0x0496
        L_0x048f:
            r0 = 10
            r7.m17558C(r8, r0)
            r0 = 1
            r12 = 1
        L_0x0496:
            r0 = r0 ^ r12
            goto L_0x04aa
        L_0x0498:
            int r2 = r7.f17598F
            if (r2 == 0) goto L_0x04a4
            if (r0 == r1) goto L_0x04a4
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.m17558C(r8, r0)
            goto L_0x04a9
        L_0x04a4:
            com.google.ads.interactivemedia.v3.internal.alb r0 = r7.f17611f
            r0.mo13887h()
        L_0x04a9:
            r0 = 0
        L_0x04aa:
            com.google.ads.interactivemedia.v3.internal.lc r1 = r7.f17625t
            boolean r2 = r1.f17821o
            if (r2 == r0) goto L_0x04ff
            com.google.ads.interactivemedia.v3.internal.lc r2 = new com.google.ads.interactivemedia.v3.internal.lc
            r16 = r2
            com.google.ads.interactivemedia.v3.internal.mb r3 = r1.f17807a
            r17 = r3
            com.google.ads.interactivemedia.v3.internal.abb r3 = r1.f17808b
            r18 = r3
            long r3 = r1.f17809c
            r19 = r3
            int r3 = r1.f17810d
            r21 = r3
            com.google.ads.interactivemedia.v3.internal.ja r3 = r1.f17811e
            r22 = r3
            boolean r3 = r1.f17812f
            r23 = r3
            com.google.ads.interactivemedia.v3.internal.acq r3 = r1.f17813g
            r24 = r3
            com.google.ads.interactivemedia.v3.internal.aip r3 = r1.f17814h
            r25 = r3
            java.util.List<com.google.ads.interactivemedia.v3.internal.yn> r3 = r1.f17815i
            r26 = r3
            com.google.ads.interactivemedia.v3.internal.abb r3 = r1.f17816j
            r27 = r3
            boolean r3 = r1.f17817k
            r28 = r3
            int r3 = r1.f17818l
            r29 = r3
            com.google.ads.interactivemedia.v3.internal.ld r3 = r1.f17819m
            r30 = r3
            long r3 = r1.f17822p
            r31 = r3
            long r3 = r1.f17823q
            r33 = r3
            long r3 = r1.f17824r
            r35 = r3
            boolean r1 = r1.f17820n
            r37 = r1
            r38 = r0
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r38)
            r7.f17625t = r2
        L_0x04ff:
            r7.f17596D = r15
            com.google.ads.interactivemedia.p038v3.internal.age.m13545c()
            return
        L_0x0505:
            com.google.ads.interactivemedia.v3.internal.alb r0 = r7.f17611f
            r0.mo13887h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4114jz.m17604z():void");
    }

    /* renamed from: a */
    public final void mo15977a(C4146ld ldVar) {
        this.f17611f.mo13881b(16, ldVar).mo13879a();
    }

    /* renamed from: b */
    public final void mo16031b() {
        this.f17611f.mo13880a(0).mo13879a();
    }

    /* renamed from: c */
    public final void mo16032c(boolean z, int i) {
        this.f17611f.mo13884e(z ? 1 : 0, i).mo13879a();
    }

    /* renamed from: d */
    public final void mo16033d(C4171mb mbVar, int i, long j) {
        this.f17611f.mo13881b(3, new C4113jy(mbVar, i, j)).mo13879a();
    }

    /* renamed from: e */
    public final void mo16034e() {
        this.f17611f.mo13880a(6).mo13879a();
    }

    /* renamed from: f */
    public final synchronized void mo16035f(C4153lk lkVar) {
        if (!this.f17627v) {
            if (this.f17612g.isAlive()) {
                this.f17611f.mo13881b(14, lkVar).mo13879a();
                return;
            }
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        lkVar.mo16258i(false);
    }

    /* renamed from: g */
    public final synchronized boolean mo16036g() {
        if (!this.f17627v) {
            if (this.f17612g.isAlive()) {
                this.f17611f.mo13888i(7);
                m17596r(new C4104jp(this), 500);
                return this.f17627v;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final Looper mo16037h() {
        return this.f17613h;
    }

    /* JADX WARNING: type inference failed for: r2v27, types: [com.google.ads.interactivemedia.v3.internal.aiz, com.google.ads.interactivemedia.v3.internal.akp] */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0344, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x050e, code lost:
        m17598t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0516, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0517, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0518, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0536, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0537, code lost:
        r1 = com.google.ads.interactivemedia.p038v3.internal.C4089ja.m17487a(r0);
        r2 = r8.f17621p.mo16189h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0542, code lost:
        if (r2 != null) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0544, code lost:
        r1 = r1.mo15986e(r2.f17739f.f17749a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x054c, code lost:
        com.google.ads.interactivemedia.p038v3.internal.ali.m14023b("ExoPlayerImplInternal", "Playback error", r1);
        m17562G(false, false);
        r8.f17625t = r8.f17625t.mo16218f(r1);
        m17598t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0563, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0564, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0572, code lost:
        r1 = r1.mo15986e(r2.f17739f.f17749a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x057c, code lost:
        if (r1.f17514h == false) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0582, code lost:
        com.google.ads.interactivemedia.p038v3.internal.ali.m14022a("ExoPlayerImplInternal", "Recoverable renderer error", r1);
        r8.f17603K = r1;
        r2 = r8.f17611f;
        r2.mo13890k(r2.mo13881b(25, r1));
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0598, code lost:
        r2 = r8.f17603K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x059a, code lost:
        if (r2 != null) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x059c, code lost:
        com.google.ads.interactivemedia.p038v3.internal.bej.m15774a(r2, r1);
        r1 = r8.f17603K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05a1, code lost:
        com.google.ads.interactivemedia.p038v3.internal.ali.m14023b("ExoPlayerImplInternal", "Playback error", r1);
        r3 = true;
        m17562G(true, false);
        r8.f17625t = r8.f17625t.mo16218f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05b5, code lost:
        m17598t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:?, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04af A[Catch:{ all -> 0x033a, all -> 0x0184, ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04ca A[Catch:{ all -> 0x033a, all -> 0x0184, ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0536 A[ExcHandler: IOException (r0v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0563 A[ExcHandler: ja (r0v0 'e' com.google.ads.interactivemedia.v3.internal.ja A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r25) {
        /*
            r24 = this;
            r8 = r24
            r1 = r25
            r9 = 0
            r10 = 1
            int r2 = r1.what     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0516 }
            r7 = 4
            r11 = 2
            switch(r2) {
                case 0: goto L_0x04e3;
                case 1: goto L_0x04d5;
                case 2: goto L_0x04d1;
                case 3: goto L_0x0363;
                case 4: goto L_0x034f;
                case 5: goto L_0x0347;
                case 6: goto L_0x033e;
                case 7: goto L_0x0321;
                case 8: goto L_0x02c9;
                case 9: goto L_0x02b1;
                case 10: goto L_0x01bd;
                case 11: goto L_0x01a5;
                case 12: goto L_0x0188;
                case 13: goto L_0x0151;
                case 14: goto L_0x0145;
                case 15: goto L_0x0116;
                case 16: goto L_0x010d;
                case 17: goto L_0x00d3;
                case 18: goto L_0x00ae;
                case 19: goto L_0x0098;
                case 20: goto L_0x0080;
                case 21: goto L_0x006c;
                case 22: goto L_0x0061;
                case 23: goto L_0x003b;
                case 24: goto L_0x0014;
                case 25: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            r1 = 0
            return r1
        L_0x000f:
            r8.m17600v(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0014:
            int r1 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 != r10) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            boolean r2 = r8.f17597E     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == r2) goto L_0x050e
            r8.f17597E = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r2 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r3 = r2.f17810d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 != 0) goto L_0x0033
            if (r3 == r7) goto L_0x0033
            if (r3 != r10) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            com.google.ads.interactivemedia.v3.internal.alb r1 = r8.f17611f     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo13888i(r11)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0033:
            com.google.ads.interactivemedia.v3.internal.lc r1 = r2.mo16221i(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17625t = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x003b:
            int r1 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            r8.f17628w = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r24.m17571P()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r1 = r8.f17629x     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == 0) goto L_0x050e
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16190i()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16189h()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == r2) goto L_0x050e
            r8.m17600v(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17580Y(r9)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0061:
            com.google.ads.interactivemedia.v3.internal.la r1 = r8.f17622q     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r1 = r1.mo16207f()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17569N(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x006c:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ack r1 = (com.google.ads.interactivemedia.p038v3.internal.ack) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jv r2 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.mo16027a(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.la r2 = r8.f17622q     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r1 = r2.mo16211l(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17569N(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0080:
            int r2 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r3 = r1.arg2     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ack r1 = (com.google.ads.interactivemedia.p038v3.internal.ack) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jv r4 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r4.mo16027a(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.la r4 = r8.f17622q     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r1 = r4.mo16210k(r2, r3, r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17569N(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0098:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jt r1 = (com.google.ads.interactivemedia.p038v3.internal.C4108jt) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jv r2 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.mo16027a(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.la r2 = r8.f17622q     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r1 = r1.f17569a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r1 = r2.mo16214o()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17569N(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x00ae:
            java.lang.Object r2 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.js r2 = (com.google.ads.interactivemedia.p038v3.internal.C4107js) r2     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r1 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jv r3 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r3.mo16027a(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.la r3 = r8.f17622q     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r4 = -1
            if (r1 != r4) goto L_0x00c2
            int r1 = r3.mo16203b()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x00c2:
            java.util.List r4 = r2.f17565a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ack r2 = r2.f17568d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r1 = r3.mo16209j(r1, r4, r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17569N(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x00d3:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.js r1 = (com.google.ads.interactivemedia.p038v3.internal.C4107js) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jv r2 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.mo16027a(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int unused = r1.f17566b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jy r2 = new com.google.ads.interactivemedia.v3.internal.jy     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ll r3 = new com.google.ads.interactivemedia.v3.internal.ll     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.util.List r4 = r1.f17565a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ack r5 = r1.f17568d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r3.<init>(r4, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int unused = r1.f17566b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r4 = r1.f17567c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.<init>(r3, r9, r4)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17599G = r2     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.la r2 = r8.f17622q     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.util.List r3 = r1.f17565a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ack r1 = r1.f17568d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r1 = r2.mo16208i(r3, r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17569N(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x010d:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ld r1 = (com.google.ads.interactivemedia.p038v3.internal.C4146ld) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17572Q(r1, r9)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0116:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lk r1 = (com.google.ads.interactivemedia.p038v3.internal.C4153lk) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            android.os.Looper r2 = r1.mo16254e()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Thread r3 = r2.getThread()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r3 = r3.isAlive()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r3 != 0) goto L_0x0134
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "Trying to send message on a dead thread."
            android.util.Log.w(r2, r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo16258i(r9)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0134:
            com.google.ads.interactivemedia.v3.internal.aks r3 = r8.f17619n     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r4 = 0
            com.google.ads.interactivemedia.v3.internal.alb r2 = r3.mo13858b(r2, r4)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jq r3 = new com.google.ads.interactivemedia.v3.internal.jq     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r3.<init>(r8, r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.mo13885f(r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0145:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lk r1 = (com.google.ads.interactivemedia.p038v3.internal.C4153lk) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo16255f()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17565J(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0151:
            int r2 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r2 == 0) goto L_0x0157
            r2 = 1
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r3 = r8.f17595C     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r3 == r2) goto L_0x0178
            r8.f17595C = r2     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r2 != 0) goto L_0x0178
            com.google.ads.interactivemedia.v3.internal.ln[] r2 = r8.f17606a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r3 = r2.length     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r3 = 0
        L_0x0168:
            if (r3 >= r11) goto L_0x0178
            r4 = r2[r3]     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r5 = m17589ah(r4)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r5 != 0) goto L_0x0175
            r4.mo15962r()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x0175:
            int r3 = r3 + 1
            goto L_0x0168
        L_0x0178:
            if (r1 == 0) goto L_0x050e
            monitor-enter(r24)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.set(r10)     // Catch:{ all -> 0x0184 }
            r24.notifyAll()     // Catch:{ all -> 0x0184 }
            monitor-exit(r24)     // Catch:{ all -> 0x0184 }
            goto L_0x050e
        L_0x0184:
            r0 = move-exception
            r1 = r0
            monitor-exit(r24)     // Catch:{ all -> 0x0184 }
            throw r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x0188:
            int r1 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == 0) goto L_0x018e
            r1 = 1
            goto L_0x018f
        L_0x018e:
            r1 = 0
        L_0x018f:
            r8.f17594B = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r3 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r3 = r3.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r1 = r2.mo16183b(r3, r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 != 0) goto L_0x01a0
            r8.m17600v(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x01a0:
            r8.m17580Y(r9)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x01a5:
            int r1 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17593A = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r3 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r3 = r3.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r1 = r2.mo16182a(r3, r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 != 0) goto L_0x01b8
            r8.m17600v(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x01b8:
            r8.m17580Y(r9)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x01bd:
            com.google.ads.interactivemedia.v3.internal.iz r1 = r8.f17617l     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ld r1 = r1.mo13914i()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            float r1 = r1.f17826b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16189h()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r3 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kq r3 = r3.mo16190i()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r4 = 1
        L_0x01d2:
            if (r2 == 0) goto L_0x050e
            boolean r5 = r2.f17737d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r5 != 0) goto L_0x01da
            goto L_0x050e
        L_0x01da:
            com.google.ads.interactivemedia.v3.internal.lc r5 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r5 = r5.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.aip r13 = r2.mo16168k(r1, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.aip r5 = r2.mo16174q()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r5 == 0) goto L_0x020b
            com.google.ads.interactivemedia.v3.internal.aih[] r6 = r5.f15006c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r6 = r6.length     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.aih[] r12 = r13.f15006c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r12 = r12.length     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r6 == r12) goto L_0x01f1
            goto L_0x020b
        L_0x01f1:
            r6 = 0
        L_0x01f2:
            com.google.ads.interactivemedia.v3.internal.aih[] r12 = r13.f15006c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r12 = r12.length     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r6 >= r12) goto L_0x0200
            boolean r12 = r13.mo13782b(r5, r6)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r12 == 0) goto L_0x020b
            int r6 = r6 + 1
            goto L_0x01f2
        L_0x0200:
            if (r2 != r3) goto L_0x0204
            r5 = 0
            goto L_0x0205
        L_0x0204:
            r5 = 1
        L_0x0205:
            r4 = r4 & r5
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16172o()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x01d2
        L_0x020b:
            if (r4 == 0) goto L_0x0281
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kq r5 = r1.mo16189h()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r16 = r1.mo16193l(r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ln[] r1 = r8.f17606a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r1 = r1.length     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean[] r6 = new boolean[r11]     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r14 = r1.f17824r     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r12 = r5
            r17 = r6
            long r12 = r12.mo16169l(r13, r14, r16, r17)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.abb r2 = r1.f17808b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r14 = r1.f17809c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1 = r24
            r3 = r12
            r9 = r5
            r17 = r6
            r5 = r14
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.m17577V(r2, r3, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17625t = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r2 = r1.f17810d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r2 == r7) goto L_0x024e
            long r1 = r1.f17824r     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x024e
            com.google.ads.interactivemedia.v3.internal.jv r1 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo16029c(r7)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17561F(r12)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x024e:
            com.google.ads.interactivemedia.v3.internal.ln[] r1 = r8.f17606a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r1 = r1.length     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean[] r1 = new boolean[r11]     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2 = 0
        L_0x0254:
            com.google.ads.interactivemedia.v3.internal.ln[] r3 = r8.f17606a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r4 = r3.length     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r2 >= r11) goto L_0x027d
            r3 = r3[r2]     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r4 = m17589ah(r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1[r2] = r4     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ach[] r5 = r9.f17736c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r5 = r5[r2]     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r4 == 0) goto L_0x027a
            com.google.ads.interactivemedia.v3.internal.ach r4 = r3.mo15948aZ()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r5 == r4) goto L_0x0271
            r8.m17567L(r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x027a
        L_0x0271:
            boolean r4 = r17[r2]     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r4 == 0) goto L_0x027a
            long r4 = r8.f17600H     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r3.mo15959o(r4)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x027a:
            int r2 = r2 + 1
            goto L_0x0254
        L_0x027d:
            r8.m17579X(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x029b
        L_0x0281:
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo16193l(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r1 = r2.f17737d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == 0) goto L_0x029b
            com.google.ads.interactivemedia.v3.internal.kr r1 = r2.f17739f     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r3 = r1.f17750b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r5 = r8.f17600H     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r5 = r2.mo16159b(r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.mo16175r(r13, r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x029b:
            r8.m17580Y(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r1 = r1.f17810d     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == r7) goto L_0x050e
            r24.m17574S()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r24.m17603y()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.alb r1 = r8.f17611f     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo13888i(r11)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x02b1:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.aaz r1 = (com.google.ads.interactivemedia.p038v3.internal.aaz) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r1 = r2.mo16184c(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == 0) goto L_0x050e
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r2 = r8.f17600H     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo16185d(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r24.m17574S()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x02c9:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.aaz r1 = (com.google.ads.interactivemedia.p038v3.internal.aaz) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r1 = r2.mo16184c(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 == 0) goto L_0x050e
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16188g()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.iz r2 = r8.f17617l     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ld r2 = r2.mo13914i()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            float r2 = r2.f17826b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r3 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r3 = r3.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo16165h(r2, r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.acq r2 = r1.mo16173p()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.aip r3 = r1.mo16174q()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17583ab(r2, r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16189h()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r1 != r2) goto L_0x031c
            com.google.ads.interactivemedia.v3.internal.kr r2 = r1.f17739f     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r2 = r2.f17750b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17561F(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r24.m17578W()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r2 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.abb r3 = r2.f17808b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.kr r1 = r1.f17739f     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r4 = r1.f17750b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r6 = r2.f17809c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1 = r24
            r2 = r3
            r3 = r4
            r5 = r6
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.m17577V(r2, r3, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17625t = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x031c:
            r24.m17574S()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0321:
            r1 = 0
            r8.m17563H(r10, r1, r10, r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0344 }
            com.google.ads.interactivemedia.v3.internal.ix r1 = r8.f17604L     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo15971c()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17597s(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            android.os.HandlerThread r1 = r8.f17612g     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.quit()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            monitor-enter(r24)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17627v = r10     // Catch:{ all -> 0x033a }
            r24.notifyAll()     // Catch:{ all -> 0x033a }
            monitor-exit(r24)     // Catch:{ all -> 0x033a }
            return r10
        L_0x033a:
            r0 = move-exception
            r1 = r0
            monitor-exit(r24)     // Catch:{ all -> 0x033a }
            throw r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x033e:
            r1 = 0
            r8.m17562G(r1, r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0344 }
            goto L_0x050e
        L_0x0344:
            r0 = move-exception
            goto L_0x0518
        L_0x0347:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lq r1 = (com.google.ads.interactivemedia.p038v3.internal.C4159lq) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17624s = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x034f:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ld r1 = (com.google.ads.interactivemedia.p038v3.internal.C4146ld) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.iz r2 = r8.f17617l     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.mo13913h(r1)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.iz r1 = r8.f17617l     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ld r1 = r1.mo13914i()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.m17572Q(r1, r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x0363:
            java.lang.Object r1 = r1.obj     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jy r1 = (com.google.ads.interactivemedia.p038v3.internal.C4113jy) r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.jv r2 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2.mo16027a(r10)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r2 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r2 = r2.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r19 = 1
            int r3 = r8.f17593A     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r4 = r8.f17594B     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.ma r5 = r8.f17614i     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lz r6 = r8.f17615j     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r17 = r2
            r18 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            android.util.Pair r2 = m17587af(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x03b2
            com.google.ads.interactivemedia.v3.internal.lc r9 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r9 = r9.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            android.util.Pair r9 = r8.m17564I(r9)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Object r12 = r9.first     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.abb r12 = (com.google.ads.interactivemedia.p038v3.internal.abb) r12     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Object r9 = r9.second     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r13 = r9.longValue()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r9 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r9 = r9.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r9 = r9.mo16333v()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r9 = r9 ^ r10
            r19 = r5
            r10 = r9
            goto L_0x0404
        L_0x03b2:
            java.lang.Object r9 = r2.first     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Object r12 = r2.second     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r13 = r12.longValue()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            long r11 = r1.f17592c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r17 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r17 != 0) goto L_0x03c4
            r11 = r5
            goto L_0x03c5
        L_0x03c4:
            r11 = r13
        L_0x03c5:
            com.google.ads.interactivemedia.v3.internal.kt r15 = r8.f17621p     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r3 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r3 = r3.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.abb r3 = r15.mo16197p(r3, r9, r13)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r4 = r3.mo13312b()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r4 == 0) goto L_0x03f7
            com.google.ads.interactivemedia.v3.internal.lc r4 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r4 = r4.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            java.lang.Object r5 = r3.f13998a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lz r6 = r8.f17615j     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r4.mo15925g(r5, r6)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lz r4 = r8.f17615j     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r5 = r3.f13999b     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r4 = r4.mo16316c(r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r5 = r3.f14000c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r4 != r5) goto L_0x03f1
            com.google.ads.interactivemedia.v3.internal.lz r4 = r8.f17615j     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r4.mo16322h()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x03f1:
            r19 = r11
            r13 = 0
            r12 = r3
            goto L_0x0404
        L_0x03f7:
            r19 = r11
            long r10 = r1.f17592c     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0401
            r4 = 1
            goto L_0x0402
        L_0x0401:
            r4 = 0
        L_0x0402:
            r12 = r3
            r10 = r4
        L_0x0404:
            com.google.ads.interactivemedia.v3.internal.lc r3 = r8.f17625t     // Catch:{ all -> 0x04b9 }
            com.google.ads.interactivemedia.v3.internal.mb r3 = r3.f17807a     // Catch:{ all -> 0x04b9 }
            boolean r3 = r3.mo16333v()     // Catch:{ all -> 0x04b9 }
            if (r3 == 0) goto L_0x0411
            r8.f17599G = r1     // Catch:{ all -> 0x04b9 }
            goto L_0x0421
        L_0x0411:
            if (r2 != 0) goto L_0x0424
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ all -> 0x04b9 }
            int r1 = r1.f17810d     // Catch:{ all -> 0x04b9 }
            r2 = 1
            if (r1 == r2) goto L_0x041d
            r8.m17597s(r7)     // Catch:{ all -> 0x04b9 }
        L_0x041d:
            r1 = 0
            r8.m17563H(r1, r2, r1, r2)     // Catch:{ all -> 0x04b9 }
        L_0x0421:
            r3 = r13
            goto L_0x04a2
        L_0x0424:
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ all -> 0x04b9 }
            com.google.ads.interactivemedia.v3.internal.abb r1 = r1.f17808b     // Catch:{ all -> 0x04b9 }
            boolean r1 = r12.equals(r1)     // Catch:{ all -> 0x04b9 }
            if (r1 == 0) goto L_0x047b
            com.google.ads.interactivemedia.v3.internal.kt r1 = r8.f17621p     // Catch:{ all -> 0x04b9 }
            com.google.ads.interactivemedia.v3.internal.kq r1 = r1.mo16189h()     // Catch:{ all -> 0x04b9 }
            if (r1 == 0) goto L_0x0449
            boolean r2 = r1.f17737d     // Catch:{ all -> 0x04b9 }
            if (r2 == 0) goto L_0x0449
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0449
            com.google.ads.interactivemedia.v3.internal.aaz r1 = r1.f17734a     // Catch:{ all -> 0x04b9 }
            com.google.ads.interactivemedia.v3.internal.lq r2 = r8.f17624s     // Catch:{ all -> 0x04b9 }
            long r1 = r1.mo13236i(r13, r2)     // Catch:{ all -> 0x04b9 }
            goto L_0x044a
        L_0x0449:
            r1 = r13
        L_0x044a:
            long r3 = com.google.ads.interactivemedia.p038v3.internal.C4083iv.m17451a(r1)     // Catch:{ all -> 0x04b9 }
            com.google.ads.interactivemedia.v3.internal.lc r5 = r8.f17625t     // Catch:{ all -> 0x04b9 }
            long r5 = r5.f17824r     // Catch:{ all -> 0x04b9 }
            long r5 = com.google.ads.interactivemedia.p038v3.internal.C4083iv.m17451a(r5)     // Catch:{ all -> 0x04b9 }
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x047c
            com.google.ads.interactivemedia.v3.internal.lc r3 = r8.f17625t     // Catch:{ all -> 0x04b9 }
            int r4 = r3.f17810d     // Catch:{ all -> 0x04b9 }
            r5 = 2
            if (r4 == r5) goto L_0x0464
            r5 = 3
            if (r4 != r5) goto L_0x047c
        L_0x0464:
            long r3 = r3.f17824r     // Catch:{ all -> 0x04b9 }
            r1 = r24
            r2 = r12
            r5 = r19
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.m17577V(r2, r3, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17625t = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r10 == 0) goto L_0x050e
            com.google.ads.interactivemedia.v3.internal.jv r1 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2 = 2
        L_0x0476:
            r1.mo16029c(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x047b:
            r1 = r13
        L_0x047c:
            com.google.ads.interactivemedia.v3.internal.lc r3 = r8.f17625t     // Catch:{ all -> 0x04b9 }
            int r3 = r3.f17810d     // Catch:{ all -> 0x04b9 }
            if (r3 != r7) goto L_0x0484
            r3 = 1
            goto L_0x0485
        L_0x0484:
            r3 = 0
        L_0x0485:
            long r17 = r8.m17559D(r12, r1, r3)     // Catch:{ all -> 0x04b9 }
            int r1 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x048f
            r1 = 1
            goto L_0x0490
        L_0x048f:
            r1 = 0
        L_0x0490:
            r10 = r10 | r1
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ all -> 0x04b3 }
            com.google.ads.interactivemedia.v3.internal.mb r4 = r1.f17807a     // Catch:{ all -> 0x04b3 }
            com.google.ads.interactivemedia.v3.internal.abb r5 = r1.f17808b     // Catch:{ all -> 0x04b3 }
            r1 = r24
            r2 = r4
            r3 = r12
            r6 = r19
            r1.m17570O(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x04b3 }
            r3 = r17
        L_0x04a2:
            r1 = r24
            r2 = r12
            r5 = r19
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.m17577V(r2, r3, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17625t = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r10 == 0) goto L_0x050e
            com.google.ads.interactivemedia.v3.internal.jv r1 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2 = 2
            goto L_0x0476
        L_0x04b3:
            r0 = move-exception
            r1 = r0
            r7 = r1
            r3 = r17
            goto L_0x04bd
        L_0x04b9:
            r0 = move-exception
            r1 = r0
            r7 = r1
            r3 = r13
        L_0x04bd:
            r1 = r24
            r2 = r12
            r5 = r19
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.m17577V(r2, r3, r5)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r8.f17625t = r1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r10 == 0) goto L_0x04d0
            com.google.ads.interactivemedia.v3.internal.jv r1 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2 = 2
            r1.mo16029c(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x04d0:
            throw r7     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x04d1:
            r24.m17604z()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x04d5:
            int r2 = r1.arg1     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            if (r2 == 0) goto L_0x04db
            r2 = 1
            goto L_0x04dc
        L_0x04db:
            r2 = 0
        L_0x04dc:
            int r1 = r1.arg2     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r3 = 1
            r8.m17599u(r2, r1, r3, r3)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x050e
        L_0x04e3:
            com.google.ads.interactivemedia.v3.internal.jv r1 = r8.f17626u     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2 = 1
            r1.mo16027a(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1 = 0
            r8.m17563H(r1, r1, r1, r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0344 }
            com.google.ads.interactivemedia.v3.internal.ix r1 = r8.f17604L     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo15969a()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.mb r1 = r1.f17807a     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            boolean r1 = r1.mo16333v()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2 = 1
            if (r2 == r1) goto L_0x04fe
            r7 = 2
        L_0x04fe:
            r8.m17597s(r7)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.la r1 = r8.f17622q     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.aiz r2 = r8.f17610e     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r1.mo16204c(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            com.google.ads.interactivemedia.v3.internal.alb r1 = r8.f17611f     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            r2 = 2
            r1.mo13888i(r2)     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
        L_0x050e:
            r24.m17598t()     // Catch:{ ja -> 0x0563, IOException -> 0x0536, RuntimeException -> 0x0512 }
            goto L_0x0533
        L_0x0512:
            r0 = move-exception
            r2 = r0
            r1 = 0
            goto L_0x0519
        L_0x0516:
            r0 = move-exception
            r1 = 0
        L_0x0518:
            r2 = r0
        L_0x0519:
            com.google.ads.interactivemedia.v3.internal.ja r2 = com.google.ads.interactivemedia.p038v3.internal.C4089ja.m17490d(r2)
            java.lang.String r3 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Playback error"
            com.google.ads.interactivemedia.p038v3.internal.ali.m14023b(r3, r4, r2)
            r3 = 1
            r8.m17562G(r3, r1)
            com.google.ads.interactivemedia.v3.internal.lc r1 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.lc r1 = r1.mo16218f(r2)
            r8.f17625t = r1
            r24.m17598t()
        L_0x0533:
            r3 = 1
            goto L_0x05b8
        L_0x0536:
            r0 = move-exception
            r1 = r0
            com.google.ads.interactivemedia.v3.internal.ja r1 = com.google.ads.interactivemedia.p038v3.internal.C4089ja.m17487a(r1)
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16189h()
            if (r2 == 0) goto L_0x054c
            com.google.ads.interactivemedia.v3.internal.kr r2 = r2.f17739f
            com.google.ads.interactivemedia.v3.internal.abb r2 = r2.f17749a
            com.google.ads.interactivemedia.v3.internal.ja r1 = r1.mo15986e(r2)
        L_0x054c:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.ads.interactivemedia.p038v3.internal.ali.m14023b(r2, r3, r1)
            r2 = 0
            r8.m17562G(r2, r2)
            com.google.ads.interactivemedia.v3.internal.lc r2 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.lc r1 = r2.mo16218f(r1)
            r8.f17625t = r1
            r24.m17598t()
            goto L_0x0533
        L_0x0563:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f17507a
            r3 = 1
            if (r2 != r3) goto L_0x057a
            com.google.ads.interactivemedia.v3.internal.kt r2 = r8.f17621p
            com.google.ads.interactivemedia.v3.internal.kq r2 = r2.mo16190i()
            if (r2 == 0) goto L_0x057a
            com.google.ads.interactivemedia.v3.internal.kr r2 = r2.f17739f
            com.google.ads.interactivemedia.v3.internal.abb r2 = r2.f17749a
            com.google.ads.interactivemedia.v3.internal.ja r1 = r1.mo15986e(r2)
        L_0x057a:
            boolean r2 = r1.f17514h
            if (r2 == 0) goto L_0x0598
            com.google.ads.interactivemedia.v3.internal.ja r2 = r8.f17603K
            if (r2 != 0) goto L_0x0598
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Recoverable renderer error"
            com.google.ads.interactivemedia.p038v3.internal.ali.m14022a(r2, r3, r1)
            r8.f17603K = r1
            com.google.ads.interactivemedia.v3.internal.alb r2 = r8.f17611f
            r3 = 25
            com.google.ads.interactivemedia.v3.internal.ala r1 = r2.mo13881b(r3, r1)
            r2.mo13890k(r1)
            r3 = 1
            goto L_0x05b5
        L_0x0598:
            com.google.ads.interactivemedia.v3.internal.ja r2 = r8.f17603K
            if (r2 == 0) goto L_0x05a1
            com.google.ads.interactivemedia.p038v3.internal.bej.m15774a(r2, r1)
            com.google.ads.interactivemedia.v3.internal.ja r1 = r8.f17603K
        L_0x05a1:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.ads.interactivemedia.p038v3.internal.ali.m14023b(r2, r3, r1)
            r2 = 0
            r3 = 1
            r8.m17562G(r3, r2)
            com.google.ads.interactivemedia.v3.internal.lc r2 = r8.f17625t
            com.google.ads.interactivemedia.v3.internal.lc r1 = r2.mo16218f(r1)
            r8.f17625t = r1
        L_0x05b5:
            r24.m17598t()
        L_0x05b8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4114jz.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: i */
    public final void mo16039i() {
        this.f17611f.mo13888i(22);
    }

    /* renamed from: j */
    public final void mo13237j(aaz aaz) {
        this.f17611f.mo13881b(8, aaz).mo13879a();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo13239l(acj acj) {
        this.f17611f.mo13881b(9, (aaz) acj).mo13879a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo16040m(C4153lk lkVar) {
        try {
            m17590ai(lkVar);
        } catch (C4089ja e) {
            ali.m14023b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ Boolean mo16041n() {
        return Boolean.valueOf(this.f17627v);
    }

    /* renamed from: p */
    public final void mo16042p(List<C4140ky> list, int i, long j, ack ack) {
        this.f17611f.mo13881b(17, new C4107js(list, ack, 0, j)).mo13879a();
    }
}
