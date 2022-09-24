package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ud */
/* compiled from: IMASDK */
public final class C4389ud implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f18971a = 0;

    /* renamed from: b */
    private static final byte[] f18972b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: c */
    private static final C4120ke f18973c;

    /* renamed from: A */
    private long f18974A;

    /* renamed from: B */
    private C4388uc f18975B;

    /* renamed from: C */
    private int f18976C;

    /* renamed from: D */
    private int f18977D;

    /* renamed from: E */
    private int f18978E;

    /* renamed from: F */
    private boolean f18979F;

    /* renamed from: G */
    private C4309re f18980G;

    /* renamed from: H */
    private C4327rw[] f18981H;

    /* renamed from: I */
    private C4327rw[] f18982I;

    /* renamed from: J */
    private boolean f18983J;

    /* renamed from: d */
    private final int f18984d;

    /* renamed from: e */
    private final List<C4120ke> f18985e;

    /* renamed from: f */
    private final SparseArray<C4388uc> f18986f;

    /* renamed from: g */
    private final alw f18987g;

    /* renamed from: h */
    private final alw f18988h;

    /* renamed from: i */
    private final alw f18989i;

    /* renamed from: j */
    private final byte[] f18990j;

    /* renamed from: k */
    private final alw f18991k;

    /* renamed from: l */
    private final amk f18992l;

    /* renamed from: m */
    private final C4512ys f18993m;

    /* renamed from: n */
    private final alw f18994n;

    /* renamed from: o */
    private final ArrayDeque<C4373to> f18995o;

    /* renamed from: p */
    private final ArrayDeque<C4387ub> f18996p;

    /* renamed from: q */
    private final C4327rw f18997q;

    /* renamed from: r */
    private int f18998r;

    /* renamed from: s */
    private int f18999s;

    /* renamed from: t */
    private long f19000t;

    /* renamed from: u */
    private int f19001u;

    /* renamed from: v */
    private alw f19002v;

    /* renamed from: w */
    private long f19003w;

    /* renamed from: x */
    private int f19004x;

    /* renamed from: y */
    private long f19005y;

    /* renamed from: z */
    private long f19006z;

    static {
        int i = C4386ua.f18956b;
        C4119kd kdVar = new C4119kd();
        kdVar.mo16120ae(MimeTypes.APPLICATION_EMSG);
        f18973c = kdVar.mo16115a();
    }

    public C4389ud() {
        this((byte[]) null);
    }

    /* renamed from: a */
    private final void m19099a() {
        this.f18998r = 0;
        this.f19001u = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0357  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19100b(long r48) throws com.google.ads.interactivemedia.p038v3.internal.C4144lb {
        /*
            r47 = this;
            r0 = r47
        L_0x0002:
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r1 = r0.f18995o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0734
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r1 = r0.f18995o
            java.lang.Object r1 = r1.peek()
            com.google.ads.interactivemedia.v3.internal.to r1 = (com.google.ads.interactivemedia.p038v3.internal.C4373to) r1
            long r1 = r1.f18832a
            int r3 = (r1 > r48 ? 1 : (r1 == r48 ? 0 : -1))
            if (r3 != 0) goto L_0x0734
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r1 = r0.f18995o
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.ads.interactivemedia.v3.internal.to r2 = (com.google.ads.interactivemedia.p038v3.internal.C4373to) r2
            int r1 = r2.f18836d
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r8 = 8
            r10 = 1
            if (r1 != r3) goto L_0x0144
            java.lang.String r1 = "Unexpected moov box."
            com.google.ads.interactivemedia.p038v3.internal.aup.m14888s(r10, r1)
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r1 = r2.f18833b
            com.google.ads.interactivemedia.v3.internal.pz r1 = m19102i(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.ads.interactivemedia.v3.internal.to r3 = r2.mo16660d(r3)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r3)
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r12 = r3.f18833b
            int r12 = r12.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
        L_0x0053:
            if (r13 >= r12) goto L_0x00bf
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r14 = r3.f18833b
            java.lang.Object r14 = r14.get(r13)
            com.google.ads.interactivemedia.v3.internal.tp r14 = (com.google.ads.interactivemedia.p038v3.internal.C4374tp) r14
            int r15 = r14.f18836d
            r9 = 1953654136(0x74726578, float:7.6818474E31)
            if (r15 != r9) goto L_0x009c
            com.google.ads.interactivemedia.v3.internal.alw r9 = r14.f18835a
            r9.mo13951i(r6)
            int r14 = r9.mo13965w()
            int r15 = r9.mo13965w()
            int r6 = r9.mo13965w()
            int r10 = r9.mo13965w()
            int r9 = r9.mo13965w()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.ads.interactivemedia.v3.internal.ty r7 = new com.google.ads.interactivemedia.v3.internal.ty
            int r15 = r15 + -1
            r7.<init>(r15, r6, r10, r9)
            android.util.Pair r6 = android.util.Pair.create(r14, r7)
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            com.google.ads.interactivemedia.v3.internal.ty r6 = (com.google.ads.interactivemedia.p038v3.internal.C4383ty) r6
            r11.put(r7, r6)
            goto L_0x00b9
        L_0x009c:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r15 != r6) goto L_0x00b9
            com.google.ads.interactivemedia.v3.internal.alw r4 = r14.f18835a
            r4.mo13951i(r8)
            int r5 = r4.mo13965w()
            int r5 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r5)
            if (r5 != 0) goto L_0x00b5
            long r4 = r4.mo13963u()
            goto L_0x00b9
        L_0x00b5:
            long r4 = r4.mo13936E()
        L_0x00b9:
            int r13 = r13 + 1
            r6 = 12
            r10 = 1
            goto L_0x0053
        L_0x00bf:
            com.google.ads.interactivemedia.v3.internal.rn r3 = new com.google.ads.interactivemedia.v3.internal.rn
            r3.<init>()
            com.google.ads.interactivemedia.v3.internal.uf r8 = new com.google.ads.interactivemedia.v3.internal.uf
            r6 = 0
            r8.<init>(r6)
            r7 = 0
            r6 = r1
            java.util.List r1 = com.google.ads.interactivemedia.p038v3.internal.C4382tx.m19022d(r2, r3, r4, r6, r7, r8)
            int r2 = r1.size()
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r3 = r0.f18986f
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0115
            r9 = 0
        L_0x00dd:
            if (r9 >= r2) goto L_0x010e
            java.lang.Object r3 = r1.get(r9)
            com.google.ads.interactivemedia.v3.internal.uq r3 = (com.google.ads.interactivemedia.p038v3.internal.C4402uq) r3
            com.google.ads.interactivemedia.v3.internal.un r4 = r3.f19077a
            com.google.ads.interactivemedia.v3.internal.uc r5 = new com.google.ads.interactivemedia.v3.internal.uc
            com.google.ads.interactivemedia.v3.internal.re r6 = r0.f18980G
            int r7 = r4.f19044b
            com.google.ads.interactivemedia.v3.internal.rw r6 = r6.mo13362ba(r9, r7)
            int r7 = r4.f19043a
            com.google.ads.interactivemedia.v3.internal.ty r7 = m19104k(r11, r7)
            r5.<init>(r6, r3, r7)
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r3 = r0.f18986f
            int r6 = r4.f19043a
            r3.put(r6, r5)
            long r5 = r0.f19006z
            long r3 = r4.f19047e
            long r3 = java.lang.Math.max(r5, r3)
            r0.f19006z = r3
            int r9 = r9 + 1
            goto L_0x00dd
        L_0x010e:
            com.google.ads.interactivemedia.v3.internal.re r1 = r0.f18980G
            r1.mo13363bb()
            goto L_0x0002
        L_0x0115:
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r3 = r0.f18986f
            int r3 = r3.size()
            if (r3 != r2) goto L_0x011f
            r10 = 1
            goto L_0x0120
        L_0x011f:
            r10 = 0
        L_0x0120:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r10)
            r9 = 0
        L_0x0124:
            if (r9 >= r2) goto L_0x0002
            java.lang.Object r3 = r1.get(r9)
            com.google.ads.interactivemedia.v3.internal.uq r3 = (com.google.ads.interactivemedia.p038v3.internal.C4402uq) r3
            com.google.ads.interactivemedia.v3.internal.un r4 = r3.f19077a
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r5 = r0.f18986f
            int r6 = r4.f19043a
            java.lang.Object r5 = r5.get(r6)
            com.google.ads.interactivemedia.v3.internal.uc r5 = (com.google.ads.interactivemedia.p038v3.internal.C4388uc) r5
            int r4 = r4.f19043a
            com.google.ads.interactivemedia.v3.internal.ty r4 = m19104k(r11, r4)
            r5.mo16670a(r3, r4)
            int r9 = r9 + 1
            goto L_0x0124
        L_0x0144:
            r6 = 0
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L_0x071c
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r1 = r0.f18986f
            int r3 = r0.f18984d
            byte[] r7 = r0.f18990j
            java.util.List<com.google.ads.interactivemedia.v3.internal.to> r9 = r2.f18834c
            int r9 = r9.size()
            r10 = 0
        L_0x0157:
            if (r10 >= r9) goto L_0x0686
            java.util.List<com.google.ads.interactivemedia.v3.internal.to> r11 = r2.f18834c
            java.lang.Object r11 = r11.get(r10)
            com.google.ads.interactivemedia.v3.internal.to r11 = (com.google.ads.interactivemedia.p038v3.internal.C4373to) r11
            int r12 = r11.f18836d
            r13 = 1953653094(0x74726166, float:7.6813435E31)
            if (r12 != r13) goto L_0x0666
            r12 = 1952868452(0x74666864, float:7.301914E31)
            com.google.ads.interactivemedia.v3.internal.tp r12 = r11.mo16659c(r12)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r12)
            com.google.ads.interactivemedia.v3.internal.alw r12 = r12.f18835a
            r12.mo13951i(r8)
            int r13 = r12.mo13965w()
            int r13 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19004f(r13)
            int r14 = r12.mo13965w()
            int r15 = r1.size()
            r6 = 1
            if (r15 != r6) goto L_0x0192
            r6 = 0
            java.lang.Object r14 = r1.valueAt(r6)
            com.google.ads.interactivemedia.v3.internal.uc r14 = (com.google.ads.interactivemedia.p038v3.internal.C4388uc) r14
            goto L_0x0199
        L_0x0192:
            java.lang.Object r6 = r1.get(r14)
            r14 = r6
            com.google.ads.interactivemedia.v3.internal.uc r14 = (com.google.ads.interactivemedia.p038v3.internal.C4388uc) r14
        L_0x0199:
            if (r14 != 0) goto L_0x019d
            r14 = 0
            goto L_0x01e4
        L_0x019d:
            r6 = r13 & 1
            if (r6 == 0) goto L_0x01ab
            long r4 = r12.mo13936E()
            com.google.ads.interactivemedia.v3.internal.up r6 = r14.f18960b
            r6.f19060b = r4
            r6.f19061c = r4
        L_0x01ab:
            com.google.ads.interactivemedia.v3.internal.ty r4 = r14.f18963e
            r5 = r13 & 2
            if (r5 == 0) goto L_0x01b8
            int r5 = r12.mo13965w()
            int r5 = r5 + -1
            goto L_0x01ba
        L_0x01b8:
            int r5 = r4.f18862a
        L_0x01ba:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x01c3
            int r6 = r12.mo13965w()
            goto L_0x01c5
        L_0x01c3:
            int r6 = r4.f18863b
        L_0x01c5:
            r15 = r13 & 16
            if (r15 == 0) goto L_0x01ce
            int r15 = r12.mo13965w()
            goto L_0x01d0
        L_0x01ce:
            int r15 = r4.f18864c
        L_0x01d0:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x01d9
            int r4 = r12.mo13965w()
            goto L_0x01db
        L_0x01d9:
            int r4 = r4.f18865d
        L_0x01db:
            com.google.ads.interactivemedia.v3.internal.up r12 = r14.f18960b
            com.google.ads.interactivemedia.v3.internal.ty r13 = new com.google.ads.interactivemedia.v3.internal.ty
            r13.<init>(r5, r6, r15, r4)
            r12.f19059a = r13
        L_0x01e4:
            if (r14 != 0) goto L_0x01e8
            goto L_0x0666
        L_0x01e8:
            com.google.ads.interactivemedia.v3.internal.up r4 = r14.f18960b
            long r5 = r4.f19075q
            boolean r12 = r4.f19076r
            r14.mo16671b()
            r14.f18970l = true
            r13 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.ads.interactivemedia.v3.internal.tp r13 = r11.mo16659c(r13)
            if (r13 == 0) goto L_0x021a
            r15 = r3 & 2
            if (r15 != 0) goto L_0x021a
            com.google.ads.interactivemedia.v3.internal.alw r5 = r13.f18835a
            r5.mo13951i(r8)
            int r6 = r5.mo13965w()
            int r6 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r6)
            r12 = 1
            if (r6 != r12) goto L_0x0216
            long r5 = r5.mo13936E()
            goto L_0x021a
        L_0x0216:
            long r5 = r5.mo13963u()
        L_0x021a:
            r4.f19075q = r5
            r4.f19076r = r12
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r5 = r11.f18833b
            int r6 = r5.size()
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x0227:
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            if (r12 >= r6) goto L_0x0253
            java.lang.Object r16 = r5.get(r12)
            r17 = r1
            r1 = r16
            com.google.ads.interactivemedia.v3.internal.tp r1 = (com.google.ads.interactivemedia.p038v3.internal.C4374tp) r1
            r16 = r9
            int r9 = r1.f18836d
            if (r9 != r8) goto L_0x024c
            com.google.ads.interactivemedia.v3.internal.alw r1 = r1.f18835a
            r8 = 12
            r1.mo13951i(r8)
            int r1 = r1.mo13934C()
            if (r1 <= 0) goto L_0x024c
            int r15 = r15 + r1
            int r13 = r13 + 1
        L_0x024c:
            int r12 = r12 + 1
            r9 = r16
            r1 = r17
            goto L_0x0227
        L_0x0253:
            r17 = r1
            r16 = r9
            r1 = 0
            r14.f18966h = r1
            r14.f18965g = r1
            r14.f18964f = r1
            com.google.ads.interactivemedia.v3.internal.up r1 = r14.f18960b
            r1.f19062d = r13
            r1.f19063e = r15
            int[] r9 = r1.f19065g
            int r9 = r9.length
            if (r9 >= r13) goto L_0x0271
            long[] r9 = new long[r13]
            r1.f19064f = r9
            int[] r9 = new int[r13]
            r1.f19065g = r9
        L_0x0271:
            int[] r9 = r1.f19066h
            int r9 = r9.length
            if (r9 >= r15) goto L_0x028e
            int r15 = r15 * 125
            int r15 = r15 / 100
            int[] r9 = new int[r15]
            r1.f19066h = r9
            int[] r9 = new int[r15]
            r1.f19067i = r9
            long[] r9 = new long[r15]
            r1.f19068j = r9
            boolean[] r9 = new boolean[r15]
            r1.f19069k = r9
            boolean[] r9 = new boolean[r15]
            r1.f19071m = r9
        L_0x028e:
            r1 = 0
            r9 = 0
            r12 = 0
        L_0x0291:
            r18 = 0
            if (r1 >= r6) goto L_0x0436
            java.lang.Object r20 = r5.get(r1)
            r15 = r20
            com.google.ads.interactivemedia.v3.internal.tp r15 = (com.google.ads.interactivemedia.p038v3.internal.C4374tp) r15
            int r13 = r15.f18836d
            if (r13 != r8) goto L_0x0409
            int r13 = r12 + 1
            com.google.ads.interactivemedia.v3.internal.alw r15 = r15.f18835a
            r8 = 8
            r15.mo13951i(r8)
            int r8 = r15.mo13965w()
            int r8 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19004f(r8)
            r21 = r5
            com.google.ads.interactivemedia.v3.internal.uq r5 = r14.f18962d
            com.google.ads.interactivemedia.v3.internal.un r5 = r5.f19077a
            r22 = r6
            com.google.ads.interactivemedia.v3.internal.up r6 = r14.f18960b
            r23 = r13
            com.google.ads.interactivemedia.v3.internal.ty r13 = r6.f19059a
            int r24 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            int[] r0 = r6.f19065g
            int r24 = r15.mo13934C()
            r0[r12] = r24
            long[] r0 = r6.f19064f
            r24 = r10
            r25 = r11
            long r10 = r6.f19060b
            r0[r12] = r10
            r26 = r8 & 1
            if (r26 == 0) goto L_0x02e5
            r26 = r2
            int r2 = r15.mo13965w()
            r27 = r1
            long r1 = (long) r2
            long r10 = r10 + r1
            r0[r12] = r10
            goto L_0x02e9
        L_0x02e5:
            r27 = r1
            r26 = r2
        L_0x02e9:
            r0 = r8 & 4
            int r1 = r13.f18865d
            if (r0 == 0) goto L_0x02f3
            int r1 = r15.mo13965w()
        L_0x02f3:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r10 = r8 & 512(0x200, float:7.175E-43)
            r11 = r8 & 1024(0x400, float:1.435E-42)
            r8 = r8 & 2048(0x800, float:2.87E-42)
            r28 = r1
            long[] r1 = r5.f19050h
            if (r1 == 0) goto L_0x0327
            r29 = r7
            int r7 = r1.length
            r30 = r4
            r4 = 1
            if (r7 != r4) goto L_0x032b
            r4 = 0
            r31 = r1[r4]
            int r1 = (r31 > r18 ? 1 : (r31 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x032b
            long[] r1 = r5.f19051i
            java.lang.Object r1 = com.google.ads.interactivemedia.p038v3.internal.amm.m14236f(r1)
            long[] r1 = (long[]) r1
            r31 = r1[r4]
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r8
            long r7 = r5.f19045c
            r35 = r7
            long r18 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r31, r33, r35)
            goto L_0x032c
        L_0x0327:
            r30 = r4
            r29 = r7
        L_0x032b:
            r1 = r8
        L_0x032c:
            int[] r4 = r6.f19066h
            int[] r7 = r6.f19067i
            long[] r8 = r6.f19068j
            r31 = r4
            boolean[] r4 = r6.f19069k
            r32 = r4
            int r4 = r5.f19044b
            r33 = r14
            r14 = 2
            if (r4 != r14) goto L_0x0345
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0345
            r4 = 1
            goto L_0x0346
        L_0x0345:
            r4 = 0
        L_0x0346:
            int[] r14 = r6.f19065g
            r12 = r14[r12]
            int r12 = r12 + r9
            r14 = r3
            r20 = r4
            long r3 = r5.f19045c
            r40 = r8
            r5 = r9
            long r8 = r6.f19075q
        L_0x0355:
            if (r5 >= r12) goto L_0x03fe
            if (r2 == 0) goto L_0x0362
            int r34 = r15.mo13965w()
            r41 = r2
            r2 = r34
            goto L_0x0366
        L_0x0362:
            r41 = r2
            int r2 = r13.f18863b
        L_0x0366:
            m19103j(r2)
            if (r10 == 0) goto L_0x0374
            int r34 = r15.mo13965w()
            r42 = r10
            r10 = r34
            goto L_0x0378
        L_0x0374:
            r42 = r10
            int r10 = r13.f18864c
        L_0x0378:
            m19103j(r10)
            if (r11 == 0) goto L_0x0386
            int r34 = r15.mo13965w()
            r43 = r0
            r0 = r34
            goto L_0x0393
        L_0x0386:
            r43 = r0
            if (r5 != 0) goto L_0x0391
            if (r0 == 0) goto L_0x0390
            r0 = r28
            r5 = 0
            goto L_0x0393
        L_0x0390:
            r5 = 0
        L_0x0391:
            int r0 = r13.f18865d
        L_0x0393:
            if (r1 == 0) goto L_0x03aa
            r44 = r1
            int r1 = r15.mo13965w()
            r45 = r11
            r46 = r12
            long r11 = (long) r1
            r34 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r34
            long r11 = r11 / r3
            int r1 = (int) r11
            r7[r5] = r1
            goto L_0x03b3
        L_0x03aa:
            r44 = r1
            r45 = r11
            r46 = r12
            r1 = 0
            r7[r5] = r1
        L_0x03b3:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r34 = r8
            r38 = r3
            long r11 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r34, r36, r38)
            long r11 = r11 - r18
            r40[r5] = r11
            boolean r1 = r6.f19076r
            if (r1 != 0) goto L_0x03d2
            r1 = r33
            r33 = r3
            com.google.ads.interactivemedia.v3.internal.uq r3 = r1.f18962d
            long r3 = r3.f19084h
            long r11 = r11 + r3
            r40[r5] = r11
            goto L_0x03d6
        L_0x03d2:
            r1 = r33
            r33 = r3
        L_0x03d6:
            r31[r5] = r10
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            if (r0 != 0) goto L_0x03e5
            if (r20 == 0) goto L_0x03e3
            if (r5 != 0) goto L_0x03e5
        L_0x03e3:
            r0 = 1
            goto L_0x03e6
        L_0x03e5:
            r0 = 0
        L_0x03e6:
            r32[r5] = r0
            long r2 = (long) r2
            long r8 = r8 + r2
            int r5 = r5 + 1
            r3 = r33
            r2 = r41
            r10 = r42
            r0 = r43
            r11 = r45
            r12 = r46
            r33 = r1
            r1 = r44
            goto L_0x0355
        L_0x03fe:
            r46 = r12
            r1 = r33
            r6.f19075q = r8
            r12 = r23
            r9 = r46
            goto L_0x041c
        L_0x0409:
            r27 = r1
            r26 = r2
            r30 = r4
            r21 = r5
            r22 = r6
            r29 = r7
            r5 = r9
            r24 = r10
            r25 = r11
            r1 = r14
            r14 = r3
        L_0x041c:
            int r0 = r27 + 1
            r3 = r14
            r5 = r21
            r6 = r22
            r10 = r24
            r11 = r25
            r2 = r26
            r7 = r29
            r4 = r30
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            r14 = r1
            r1 = r0
            r0 = r47
            goto L_0x0291
        L_0x0436:
            r26 = r2
            r30 = r4
            r29 = r7
            r24 = r10
            r25 = r11
            r1 = r14
            r14 = r3
            com.google.ads.interactivemedia.v3.internal.uq r0 = r1.f18962d
            com.google.ads.interactivemedia.v3.internal.un r0 = r0.f19077a
            r1 = r30
            com.google.ads.interactivemedia.v3.internal.ty r2 = r1.f19059a
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            int r2 = r2.f18862a
            com.google.ads.interactivemedia.v3.internal.uo r0 = r0.mo16679a(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            com.google.ads.interactivemedia.v3.internal.tp r2 = r11.mo16659c(r2)
            if (r2 == 0) goto L_0x04d7
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r0)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r2.f18835a
            int r3 = r0.f19057d
            r4 = 8
            r2.mo13951i(r4)
            int r5 = r2.mo13965w()
            int r5 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19004f(r5)
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0477
            r2.mo13954l(r4)
        L_0x0477:
            int r4 = r2.mo13957o()
            int r5 = r2.mo13934C()
            int r6 = r1.f19063e
            if (r5 > r6) goto L_0x04b6
            if (r4 != 0) goto L_0x049c
            boolean[] r4 = r1.f19071m
            r6 = 0
            r7 = 0
        L_0x0489:
            if (r6 >= r5) goto L_0x049a
            int r8 = r2.mo13957o()
            int r7 = r7 + r8
            if (r8 <= r3) goto L_0x0494
            r8 = 1
            goto L_0x0495
        L_0x0494:
            r8 = 0
        L_0x0495:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x0489
        L_0x049a:
            r4 = 0
            goto L_0x04a9
        L_0x049c:
            if (r4 <= r3) goto L_0x04a0
            r2 = 1
            goto L_0x04a1
        L_0x04a0:
            r2 = 0
        L_0x04a1:
            int r7 = r4 * r5
            boolean[] r3 = r1.f19071m
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r2)
        L_0x04a9:
            boolean[] r2 = r1.f19071m
            int r3 = r1.f19063e
            java.util.Arrays.fill(r2, r5, r3, r4)
            if (r7 <= 0) goto L_0x04d7
            r1.mo16680a(r7)
            goto L_0x04d7
        L_0x04b6:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 78
            r1.<init>(r2)
            java.lang.String r2 = "Saiz sample count "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " is greater than fragment sample count"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04d7:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.ads.interactivemedia.v3.internal.tp r2 = r11.mo16659c(r2)
            if (r2 == 0) goto L_0x052a
            com.google.ads.interactivemedia.v3.internal.alw r2 = r2.f18835a
            r3 = 8
            r2.mo13951i(r3)
            int r4 = r2.mo13965w()
            int r5 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19004f(r4)
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x04f6
            r2.mo13954l(r3)
        L_0x04f6:
            int r3 = r2.mo13934C()
            if (r3 != r6) goto L_0x0511
            long r5 = r1.f19061c
            int r3 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r4)
            if (r3 != 0) goto L_0x0509
            long r2 = r2.mo13963u()
            goto L_0x050d
        L_0x0509:
            long r2 = r2.mo13936E()
        L_0x050d:
            long r5 = r5 + r2
            r1.f19061c = r5
            goto L_0x052a
        L_0x0511:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 40
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected saio entry count: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x052a:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.ads.interactivemedia.v3.internal.tp r2 = r11.mo16659c(r2)
            if (r2 == 0) goto L_0x0539
            com.google.ads.interactivemedia.v3.internal.alw r2 = r2.f18835a
            r3 = 0
            m19101c(r2, r3, r1)
        L_0x0539:
            if (r0 == 0) goto L_0x053f
            java.lang.String r0 = r0.f19055b
            r4 = r0
            goto L_0x0540
        L_0x053f:
            r4 = 0
        L_0x0540:
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x0543:
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r5 = r11.f18833b
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0580
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r5 = r11.f18833b
            java.lang.Object r5 = r5.get(r0)
            com.google.ads.interactivemedia.v3.internal.tp r5 = (com.google.ads.interactivemedia.p038v3.internal.C4374tp) r5
            com.google.ads.interactivemedia.v3.internal.alw r6 = r5.f18835a
            int r5 = r5.f18836d
            r7 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r5 != r7) goto L_0x056c
            r10 = 12
            r6.mo13951i(r10)
            int r5 = r6.mo13965w()
            if (r5 != r8) goto L_0x057d
            r2 = r6
            goto L_0x057d
        L_0x056c:
            r10 = 12
            r7 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r7) goto L_0x057d
            r6.mo13951i(r10)
            int r5 = r6.mo13965w()
            if (r5 != r8) goto L_0x057d
            r3 = r6
        L_0x057d:
            int r0 = r0 + 1
            goto L_0x0543
        L_0x0580:
            r10 = 12
            if (r2 == 0) goto L_0x0620
            if (r3 != 0) goto L_0x0588
            goto L_0x0620
        L_0x0588:
            r0 = 8
            r2.mo13951i(r0)
            int r5 = r2.mo13965w()
            r6 = 4
            r2.mo13954l(r6)
            int r5 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r5)
            r7 = 1
            if (r5 != r7) goto L_0x059f
            r2.mo13954l(r6)
        L_0x059f:
            int r2 = r2.mo13965w()
            if (r2 != r7) goto L_0x0618
            r3.mo13951i(r0)
            int r0 = r3.mo13965w()
            int r0 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r0)
            r3.mo13954l(r6)
            if (r0 != r7) goto L_0x05c6
            long r7 = r3.mo13963u()
            int r0 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x05be
            goto L_0x05cc
        L_0x05be:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Variable length description in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05c6:
            r2 = 2
            if (r0 < r2) goto L_0x05cc
            r3.mo13954l(r6)
        L_0x05cc:
            long r7 = r3.mo13963u()
            r12 = 1
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0610
            r0 = 1
            r3.mo13954l(r0)
            int r2 = r3.mo13957o()
            r5 = r2 & 240(0xf0, float:3.36E-43)
            int r7 = r5 >> 4
            r8 = r2 & 15
            int r2 = r3.mo13957o()
            if (r2 != r0) goto L_0x0621
            int r5 = r3.mo13957o()
            r2 = 16
            byte[] r6 = new byte[r2]
            r9 = 0
            r3.mo13956n(r6, r9, r2)
            if (r5 != 0) goto L_0x0603
            int r2 = r3.mo13957o()
            byte[] r12 = new byte[r2]
            r3.mo13956n(r12, r9, r2)
            r9 = r12
            goto L_0x0604
        L_0x0603:
            r9 = 0
        L_0x0604:
            r1.f19070l = r0
            com.google.ads.interactivemedia.v3.internal.uo r12 = new com.google.ads.interactivemedia.v3.internal.uo
            r3 = 1
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f19072n = r12
            goto L_0x0621
        L_0x0610:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0618:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0620:
            r0 = 1
        L_0x0621:
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r2 = r11.f18833b
            int r2 = r2.size()
            r6 = 0
        L_0x0628:
            if (r6 >= r2) goto L_0x0660
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r3 = r11.f18833b
            java.lang.Object r3 = r3.get(r6)
            com.google.ads.interactivemedia.v3.internal.tp r3 = (com.google.ads.interactivemedia.p038v3.internal.C4374tp) r3
            int r4 = r3.f18836d
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r4 != r5) goto L_0x0654
            com.google.ads.interactivemedia.v3.internal.alw r3 = r3.f18835a
            r4 = 8
            r3.mo13951i(r4)
            r7 = r29
            r5 = 0
            r8 = 16
            r3.mo13956n(r7, r5, r8)
            byte[] r9 = f18972b
            boolean r9 = java.util.Arrays.equals(r7, r9)
            if (r9 == 0) goto L_0x065b
            m19101c(r3, r8, r1)
            goto L_0x065b
        L_0x0654:
            r7 = r29
            r4 = 8
            r5 = 0
            r8 = 16
        L_0x065b:
            int r6 = r6 + 1
            r29 = r7
            goto L_0x0628
        L_0x0660:
            r7 = r29
            r4 = 8
            r5 = 0
            goto L_0x0675
        L_0x0666:
            r17 = r1
            r26 = r2
            r14 = r3
            r16 = r9
            r24 = r10
            r0 = 1
            r4 = 8
            r5 = 0
            r10 = 12
        L_0x0675:
            int r1 = r24 + 1
            r6 = 0
            r8 = 8
            r0 = r47
            r10 = r1
            r3 = r14
            r9 = r16
            r1 = r17
            r2 = r26
            goto L_0x0157
        L_0x0686:
            r1 = r2
            r5 = 0
            java.util.List<com.google.ads.interactivemedia.v3.internal.tp> r0 = r1.f18833b
            com.google.ads.interactivemedia.v3.internal.pz r0 = m19102i(r0)
            r2 = r47
            if (r0 == 0) goto L_0x06d6
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r1 = r2.f18986f
            int r1 = r1.size()
            r6 = 0
        L_0x0699:
            if (r6 >= r1) goto L_0x06d6
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r3 = r2.f18986f
            java.lang.Object r3 = r3.valueAt(r6)
            com.google.ads.interactivemedia.v3.internal.uc r3 = (com.google.ads.interactivemedia.p038v3.internal.C4388uc) r3
            com.google.ads.interactivemedia.v3.internal.uq r4 = r3.f18962d
            com.google.ads.interactivemedia.v3.internal.un r4 = r4.f19077a
            com.google.ads.interactivemedia.v3.internal.up r7 = r3.f18960b
            com.google.ads.interactivemedia.v3.internal.ty r7 = r7.f19059a
            int r8 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            int r7 = r7.f18862a
            com.google.ads.interactivemedia.v3.internal.uo r4 = r4.mo16679a(r7)
            if (r4 == 0) goto L_0x06b8
            java.lang.String r4 = r4.f19055b
            goto L_0x06b9
        L_0x06b8:
            r4 = 0
        L_0x06b9:
            com.google.ads.interactivemedia.v3.internal.pz r4 = r0.mo16539b(r4)
            com.google.ads.interactivemedia.v3.internal.uq r7 = r3.f18962d
            com.google.ads.interactivemedia.v3.internal.un r7 = r7.f19077a
            com.google.ads.interactivemedia.v3.internal.ke r7 = r7.f19048f
            com.google.ads.interactivemedia.v3.internal.kd r7 = r7.mo16126a()
            r7.mo16100L(r4)
            com.google.ads.interactivemedia.v3.internal.ke r4 = r7.mo16115a()
            com.google.ads.interactivemedia.v3.internal.rw r3 = r3.f18959a
            r3.mo13403a(r4)
            int r6 = r6 + 1
            goto L_0x0699
        L_0x06d6:
            long r0 = r2.f19005y
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0731
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r0 = r2.f18986f
            int r0 = r0.size()
            r9 = 0
        L_0x06e8:
            if (r9 >= r0) goto L_0x0714
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.uc> r1 = r2.f18986f
            java.lang.Object r1 = r1.valueAt(r9)
            com.google.ads.interactivemedia.v3.internal.uc r1 = (com.google.ads.interactivemedia.p038v3.internal.C4388uc) r1
            long r3 = r2.f19005y
            int r5 = r1.f18964f
        L_0x06f6:
            com.google.ads.interactivemedia.v3.internal.up r6 = r1.f18960b
            int r7 = r6.f19063e
            if (r5 >= r7) goto L_0x0711
            long r6 = r6.mo16681b(r5)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0711
            com.google.ads.interactivemedia.v3.internal.up r6 = r1.f18960b
            boolean[] r6 = r6.f19069k
            boolean r6 = r6[r5]
            if (r6 == 0) goto L_0x070e
            r1.f18967i = r5
        L_0x070e:
            int r5 = r5 + 1
            goto L_0x06f6
        L_0x0711:
            int r9 = r9 + 1
            goto L_0x06e8
        L_0x0714:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f19005y = r3
            goto L_0x0731
        L_0x071c:
            r1 = r2
            r2 = r0
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r0 = r2.f18995o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0731
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r0 = r2.f18995o
            java.lang.Object r0 = r0.peek()
            com.google.ads.interactivemedia.v3.internal.to r0 = (com.google.ads.interactivemedia.p038v3.internal.C4373to) r0
            r0.mo16658b(r1)
        L_0x0731:
            r0 = r2
            goto L_0x0002
        L_0x0734:
            r2 = r0
            r47.m19099a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4389ud.m19100b(long):void");
    }

    /* renamed from: c */
    private static void m19101c(alw alw, int i, C4401up upVar) throws C4144lb {
        alw.mo13951i(i + 8);
        int f = C4375tq.m19004f(alw.mo13965w());
        if ((f & 1) == 0) {
            boolean z = (f & 2) != 0;
            int C = alw.mo13934C();
            if (C == 0) {
                Arrays.fill(upVar.f19071m, 0, upVar.f19063e, false);
                return;
            }
            int i2 = upVar.f19063e;
            if (C == i2) {
                Arrays.fill(upVar.f19071m, 0, C, z);
                upVar.mo16680a(alw.mo13947e());
                alw.mo13956n(upVar.f19073o.mo13952j(), 0, upVar.f19073o.mo13948f());
                upVar.f19073o.mo13951i(0);
                upVar.f19074p = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(C);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw new C4144lb(sb.toString());
        }
        throw new C4144lb("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: i */
    private static C4276pz m19102i(List<C4374tp> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C4374tp tpVar = list.get(i);
            if (tpVar.f18836d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] j = tpVar.f18835a.mo13952j();
                UUID c = C4396uk.m19134c(j);
                if (c == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C4275py(c, MimeTypes.VIDEO_MP4, j));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C4276pz((List<C4275py>) arrayList);
    }

    /* renamed from: j */
    private static void m19103j(int i) throws C4144lb {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unexpected negative value: ");
            sb.append(i);
            throw new C4144lb(sb.toString());
        }
    }

    /* renamed from: k */
    private static final C4383ty m19104k(SparseArray<C4383ty> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C4383ty tyVar = sparseArray.get(i);
        aup.m14890u(tyVar);
        return tyVar;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        return C4398um.m19144a(rcVar);
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        int i;
        this.f18980G = reVar;
        m19099a();
        C4327rw[] rwVarArr = new C4327rw[2];
        this.f18981H = rwVarArr;
        C4327rw rwVar = this.f18997q;
        int i2 = 0;
        if (rwVar != null) {
            rwVarArr[0] = rwVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f18984d & 4) != 0) {
            rwVarArr[i] = this.f18980G.mo13362ba(100, 5);
            i3 = 101;
            i++;
        }
        C4327rw[] rwVarArr2 = (C4327rw[]) amm.m14238h(this.f18981H, i);
        this.f18981H = rwVarArr2;
        for (C4327rw a : rwVarArr2) {
            a.mo13403a(f18973c);
        }
        this.f18982I = new C4327rw[this.f18985e.size()];
        while (i2 < this.f18982I.length) {
            C4327rw ba = this.f18980G.mo13362ba(i3, 3);
            ba.mo13403a(this.f18985e.get(i2));
            this.f18982I[i2] = ba;
            i2++;
            i3++;
        }
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        byte b;
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        long j5;
        long j6;
        C4388uc ucVar;
        int i;
        boolean z;
        int i2;
        int i3;
        C4307rc rcVar2 = rcVar;
        while (true) {
            int i4 = this.f18998r;
            C4388uc ucVar2 = null;
            b = 1;
            if (i4 == 0) {
                if (this.f19001u == 0) {
                    if (!rcVar2.mo16595b(this.f18994n.mo13952j(), 0, 8, true)) {
                        return -1;
                    }
                    this.f19001u = 8;
                    this.f18994n.mo13951i(0);
                    this.f19000t = this.f18994n.mo13963u();
                    this.f18999s = this.f18994n.mo13965w();
                }
                long j7 = this.f19000t;
                if (j7 == 1) {
                    rcVar2.mo16596c(this.f18994n.mo13952j(), 8, 8);
                    this.f19001u += 8;
                    this.f19000t = this.f18994n.mo13936E();
                } else if (j7 == 0) {
                    long m = rcVar.mo16606m();
                    if (m == -1 && !this.f18995o.isEmpty()) {
                        m = this.f18995o.peek().f18832a;
                    }
                    if (m != -1) {
                        this.f19000t = (m - rcVar.mo16605l()) + ((long) this.f19001u);
                    }
                }
                if (this.f19000t >= ((long) this.f19001u)) {
                    long l = rcVar.mo16605l() - ((long) this.f19001u);
                    int i5 = this.f18999s;
                    if ((i5 == 1836019558 || i5 == 1835295092) && !this.f18983J) {
                        this.f18980G.mo13364bc(new C4323rs(this.f19006z, l));
                        this.f18983J = true;
                    }
                    if (this.f18999s == 1836019558) {
                        int size = this.f18986f.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            C4401up upVar = this.f18986f.valueAt(i6).f18960b;
                            upVar.f19061c = l;
                            upVar.f19060b = l;
                        }
                    }
                    int i7 = this.f18999s;
                    if (i7 == 1835295092) {
                        this.f18975B = null;
                        this.f19003w = l + this.f19000t;
                        this.f18998r = 2;
                    } else if (i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1836019558 || i7 == 1953653094 || i7 == 1836475768 || i7 == 1701082227) {
                        long l2 = (rcVar.mo16605l() + this.f19000t) - 8;
                        this.f18995o.push(new C4373to(this.f18999s, l2));
                        if (this.f19000t == ((long) this.f19001u)) {
                            m19100b(l2);
                        } else {
                            m19099a();
                        }
                    } else if (i7 == 1751411826 || i7 == 1835296868 || i7 == 1836476516 || i7 == 1936286840 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1668576371 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1937011571 || i7 == 1952867444 || i7 == 1952868452 || i7 == 1953196132 || i7 == 1953654136 || i7 == 1953658222 || i7 == 1886614376 || i7 == 1935763834 || i7 == 1935763823 || i7 == 1936027235 || i7 == 1970628964 || i7 == 1935828848 || i7 == 1936158820 || i7 == 1701606260 || i7 == 1835362404 || i7 == 1701671783) {
                        if (this.f19001u == 8) {
                            long j8 = this.f19000t;
                            if (j8 <= 2147483647L) {
                                alw alw = new alw((int) j8);
                                System.arraycopy(this.f18994n.mo13952j(), 0, alw.mo13952j(), 0, 8);
                                this.f19002v = alw;
                                this.f18998r = 1;
                            } else {
                                throw new C4144lb("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw new C4144lb("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else if (this.f19000t <= 2147483647L) {
                        this.f19002v = null;
                        this.f18998r = 1;
                    } else {
                        throw new C4144lb("Skipping atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new C4144lb("Atom size less than header length (unsupported).");
                }
            } else if (i4 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i4 != 2) {
                    ucVar = this.f18975B;
                    if (ucVar != null) {
                        break;
                    }
                    SparseArray<C4388uc> sparseArray = this.f18986f;
                    int size2 = sparseArray.size();
                    long j10 = Long.MAX_VALUE;
                    C4388uc ucVar3 = null;
                    for (int i8 = 0; i8 < size2; i8++) {
                        C4388uc valueAt = sparseArray.valueAt(i8);
                        if ((valueAt.f18970l || valueAt.f18964f != valueAt.f18962d.f19078b) && (!valueAt.f18970l || valueAt.f18966h != valueAt.f18960b.f19062d)) {
                            long d = valueAt.mo16673d();
                            if (d < j10) {
                                ucVar3 = valueAt;
                                j10 = d;
                            }
                        }
                    }
                    if (ucVar3 == null) {
                        int l3 = (int) (this.f19003w - rcVar.mo16605l());
                        if (l3 >= 0) {
                            rcVar2.mo16597d(l3);
                            m19099a();
                        } else {
                            throw new C4144lb("Offset to end of mdat was negative.");
                        }
                    } else {
                        int d2 = (int) (ucVar3.mo16673d() - rcVar.mo16605l());
                        if (d2 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            d2 = 0;
                        }
                        rcVar2.mo16597d(d2);
                        this.f18975B = ucVar3;
                        ucVar = ucVar3;
                    }
                } else {
                    int size3 = this.f18986f.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        C4401up upVar2 = this.f18986f.valueAt(i9).f18960b;
                        if (upVar2.f19074p) {
                            long j11 = upVar2.f19061c;
                            if (j11 < j9) {
                                ucVar2 = this.f18986f.valueAt(i9);
                                j9 = j11;
                            }
                        }
                    }
                    if (ucVar2 == null) {
                        this.f18998r = 3;
                    } else {
                        int l4 = (int) (j9 - rcVar.mo16605l());
                        if (l4 >= 0) {
                            rcVar2.mo16597d(l4);
                            C4401up upVar3 = ucVar2.f18960b;
                            rcVar2.mo16596c(upVar3.f19073o.mo13952j(), 0, upVar3.f19073o.mo13948f());
                            upVar3.f19073o.mo13951i(0);
                            upVar3.f19074p = false;
                        } else {
                            throw new C4144lb("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i10 = ((int) this.f19000t) - this.f19001u;
                alw alw2 = this.f19002v;
                if (alw2 != null) {
                    rcVar2.mo16596c(alw2.mo13952j(), 8, i10);
                    C4374tp tpVar = new C4374tp(this.f18999s, alw2);
                    long l5 = rcVar.mo16605l();
                    if (!this.f18995o.isEmpty()) {
                        this.f18995o.peek().mo16657a(tpVar);
                    } else {
                        int i11 = tpVar.f18836d;
                        if (i11 == 1936286840) {
                            alw alw3 = tpVar.f18835a;
                            alw3.mo13951i(8);
                            int w = alw3.mo13965w();
                            alw3.mo13954l(4);
                            long u = alw3.mo13963u();
                            if (C4375tq.m19003e(w) == 0) {
                                j6 = alw3.mo13963u();
                                j5 = alw3.mo13963u();
                            } else {
                                j6 = alw3.mo13936E();
                                j5 = alw3.mo13936E();
                            }
                            long j12 = l5 + j5;
                            long M = amm.m14196M(j6, 1000000, u);
                            alw3.mo13954l(2);
                            int p = alw3.mo13958p();
                            int[] iArr = new int[p];
                            long[] jArr = new long[p];
                            long[] jArr2 = new long[p];
                            long[] jArr3 = new long[p];
                            long j13 = M;
                            int i12 = 0;
                            while (i12 < p) {
                                int w2 = alw3.mo13965w();
                                if ((w2 & Integer.MIN_VALUE) == 0) {
                                    long u2 = alw3.mo13963u();
                                    iArr[i12] = w2 & Integer.MAX_VALUE;
                                    jArr[i12] = j12;
                                    jArr3[i12] = j13;
                                    long j14 = j6 + u2;
                                    int i13 = i12;
                                    long j15 = j14;
                                    long j16 = j14;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i14 = p;
                                    int[] iArr2 = iArr;
                                    j13 = amm.m14196M(j15, 1000000, u);
                                    jArr4[i13] = j13 - jArr5[i13];
                                    alw3.mo13954l(4);
                                    j12 += (long) iArr2[i13];
                                    jArr = jArr;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    i12 = i13 + 1;
                                    iArr = iArr2;
                                    j6 = j16;
                                    C4307rc rcVar3 = rcVar;
                                    p = i14;
                                } else {
                                    throw new C4144lb("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(M), new C4300qw(iArr, jArr, jArr2, jArr3));
                            this.f18974A = ((Long) create.first).longValue();
                            this.f18980G.mo13364bc((C4324rt) create.second);
                            this.f18983J = true;
                        } else if (i11 == 1701671783) {
                            alw alw4 = tpVar.f18835a;
                            if (this.f18981H.length != 0) {
                                alw4.mo13951i(8);
                                int e = C4375tq.m19003e(alw4.mo13965w());
                                if (e == 0) {
                                    String I = alw4.mo13940I();
                                    aup.m14890u(I);
                                    String I2 = alw4.mo13940I();
                                    aup.m14890u(I2);
                                    long u3 = alw4.mo13963u();
                                    j3 = amm.m14196M(alw4.mo13963u(), 1000000, u3);
                                    long j17 = this.f18974A;
                                    long j18 = j17 != C6540C.TIME_UNSET ? j17 + j3 : -9223372036854775807L;
                                    str2 = I;
                                    j2 = amm.m14196M(alw4.mo13963u(), 1000, u3);
                                    j = alw4.mo13963u();
                                    str = I2;
                                    j4 = j18;
                                } else if (e != 1) {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(e);
                                    Log.w("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long u4 = alw4.mo13963u();
                                    j4 = amm.m14196M(alw4.mo13936E(), 1000000, u4);
                                    long M2 = amm.m14196M(alw4.mo13963u(), 1000, u4);
                                    long u5 = alw4.mo13963u();
                                    String I3 = alw4.mo13940I();
                                    aup.m14890u(I3);
                                    String I4 = alw4.mo13940I();
                                    aup.m14890u(I4);
                                    str2 = I3;
                                    j3 = -9223372036854775807L;
                                    j2 = M2;
                                    j = u5;
                                    str = I4;
                                }
                                byte[] bArr = new byte[alw4.mo13947e()];
                                alw4.mo13956n(bArr, 0, alw4.mo13947e());
                                alw alw5 = new alw(this.f18993m.mo16850a(new C4510yq(str2, str, j2, j, bArr)));
                                int e2 = alw5.mo13947e();
                                for (C4327rw d3 : this.f18981H) {
                                    alw5.mo13951i(0);
                                    d3.mo13406d(alw5, e2);
                                }
                                if (j4 == C6540C.TIME_UNSET) {
                                    this.f18996p.addLast(new C4387ub(j3, e2));
                                    this.f19004x += e2;
                                } else {
                                    amk amk = this.f18992l;
                                    if (amk != null) {
                                        j4 = amk.mo13999g(j4);
                                    }
                                    for (C4327rw b2 : this.f18981H) {
                                        b2.mo13404b(j4, 1, e2, 0, (C4326rv) null);
                                    }
                                }
                            }
                        }
                        rcVar2 = rcVar;
                    }
                } else {
                    rcVar2.mo16597d(i10);
                }
                m19100b(rcVar.mo16605l());
            }
        }
        byte b3 = 6;
        if (this.f18998r == 3) {
            int e3 = ucVar.mo16674e();
            this.f18976C = e3;
            if (ucVar.f18964f < ucVar.f18967i) {
                rcVar2.mo16597d(e3);
                C4400uo i15 = ucVar.mo16678i();
                if (i15 != null) {
                    alw alw6 = ucVar.f18960b.f19073o;
                    int i16 = i15.f19057d;
                    if (i16 != 0) {
                        alw6.mo13954l(i16);
                    }
                    if (ucVar.f18960b.mo16682c(ucVar.f18964f)) {
                        alw6.mo13954l(alw6.mo13958p() * 6);
                    }
                }
                if (!ucVar.mo16676g()) {
                    this.f18975B = null;
                }
                this.f18998r = 3;
                return 0;
            }
            if (ucVar.f18962d.f19077a.f19049g == 1) {
                this.f18976C = e3 - 8;
                rcVar2.mo16597d(8);
            }
            if (MimeTypes.AUDIO_AC4.equals(ucVar.f18962d.f19077a.f19048f.f17681l)) {
                this.f18977D = ucVar.mo16677h(this.f18976C, 7);
                C4209nm.m18277b(this.f18976C, this.f18991k);
                ucVar.f18959a.mo13406d(this.f18991k, 7);
                i3 = this.f18977D + 7;
                this.f18977D = i3;
                i2 = 0;
            } else {
                i2 = 0;
                i3 = ucVar.mo16677h(this.f18976C, 0);
                this.f18977D = i3;
            }
            this.f18976C += i3;
            this.f18998r = 4;
            this.f18978E = i2;
        }
        C4399un unVar = ucVar.f18962d.f19077a;
        C4327rw rwVar = ucVar.f18959a;
        long c = ucVar.mo16672c();
        amk amk2 = this.f18992l;
        if (amk2 != null) {
            c = amk2.mo13999g(c);
        }
        if (unVar.f19052j == 0) {
            while (true) {
                int i17 = this.f18977D;
                int i18 = this.f18976C;
                if (i17 >= i18) {
                    break;
                }
                this.f18977D += rwVar.mo13405c(rcVar2, i18 - i17, false);
            }
        } else {
            byte[] j19 = this.f18988h.mo13952j();
            j19[0] = 0;
            j19[1] = 0;
            j19[2] = 0;
            int i19 = unVar.f19052j;
            int i20 = i19 + 1;
            int i21 = 4 - i19;
            while (this.f18977D < this.f18976C) {
                int i22 = this.f18978E;
                if (i22 == 0) {
                    rcVar2.mo16596c(j19, i21, i20);
                    this.f18988h.mo13951i(0);
                    int w3 = this.f18988h.mo13965w();
                    if (w3 > 0) {
                        this.f18978E = w3 - 1;
                        this.f18987g.mo13951i(0);
                        rwVar.mo13406d(this.f18987g, 4);
                        rwVar.mo13406d(this.f18988h, b);
                        if (this.f18982I.length > 0) {
                            String str3 = unVar.f19048f.f17681l;
                            byte b4 = j19[4];
                            byte[] bArr2 = alq.f15233a;
                            if ((MimeTypes.VIDEO_H264.equals(str3) && (b4 & 31) == b3) || (MimeTypes.VIDEO_H265.equals(str3) && ((b4 & 126) >> b) == 39)) {
                                z = true;
                                this.f18979F = z;
                                this.f18977D += 5;
                                this.f18976C += i21;
                            }
                        }
                        z = false;
                        this.f18979F = z;
                        this.f18977D += 5;
                        this.f18976C += i21;
                    } else {
                        throw new C4144lb("Invalid NAL length");
                    }
                } else {
                    if (this.f18979F) {
                        this.f18989i.mo13943a(i22);
                        rcVar2.mo16596c(this.f18989i.mo13952j(), 0, this.f18978E);
                        rwVar.mo13406d(this.f18989i, this.f18978E);
                        i = this.f18978E;
                        int a = alq.m14048a(this.f18989i.mo13952j(), this.f18989i.mo13948f());
                        this.f18989i.mo13951i(MimeTypes.VIDEO_H265.equals(unVar.f19048f.f17681l) ? 1 : 0);
                        this.f18989i.mo13949g(a);
                        C4038hd.m17327m(c, this.f18989i, this.f18982I);
                    } else {
                        i = rwVar.mo13405c(rcVar2, i22, false);
                    }
                    this.f18977D += i;
                    this.f18978E -= i;
                    b3 = 6;
                    b = 1;
                }
            }
        }
        int f = ucVar.mo16675f();
        C4400uo i23 = ucVar.mo16678i();
        rwVar.mo13404b(c, f, this.f18976C, 0, i23 != null ? i23.f19056c : null);
        while (!this.f18996p.isEmpty()) {
            C4387ub removeFirst = this.f18996p.removeFirst();
            this.f19004x -= removeFirst.f18958b;
            long j20 = removeFirst.f18957a + c;
            amk amk3 = this.f18992l;
            if (amk3 != null) {
                j20 = amk3.mo13999g(j20);
            }
            for (C4327rw b5 : this.f18981H) {
                b5.mo13404b(j20, 1, removeFirst.f18958b, this.f19004x, (C4326rv) null);
            }
        }
        if (!ucVar.mo16676g()) {
            this.f18975B = null;
        }
        this.f18998r = 3;
        return 0;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        int size = this.f18986f.size();
        for (int i = 0; i < size; i++) {
            this.f18986f.valueAt(i).mo16671b();
        }
        this.f18996p.clear();
        this.f19004x = 0;
        this.f19005y = j2;
        this.f18995o.clear();
        m19099a();
    }

    /* renamed from: h */
    public final void mo13693h() {
    }

    public C4389ud(byte[] bArr) {
        this(0, (amk) null, Collections.emptyList());
    }

    public C4389ud(int i, amk amk, List<C4120ke> list) {
        this(i, amk, list, (C4327rw) null);
    }

    public C4389ud(int i, amk amk, List<C4120ke> list, C4327rw rwVar) {
        this.f18984d = i;
        this.f18992l = amk;
        this.f18985e = Collections.unmodifiableList(list);
        this.f18997q = rwVar;
        this.f18993m = new C4512ys();
        this.f18994n = new alw(16);
        this.f18987g = new alw(alq.f15233a);
        this.f18988h = new alw(5);
        this.f18989i = new alw();
        byte[] bArr = new byte[16];
        this.f18990j = bArr;
        this.f18991k = new alw(bArr);
        this.f18995o = new ArrayDeque<>();
        this.f18996p = new ArrayDeque<>();
        this.f18986f = new SparseArray<>();
        this.f19006z = C6540C.TIME_UNSET;
        this.f19005y = C6540C.TIME_UNSET;
        this.f18974A = C6540C.TIME_UNSET;
        this.f18980G = C4309re.f18503a;
        this.f18981H = new C4327rw[0];
        this.f18982I = new C4327rw[0];
    }
}
