package com.google.android.gms.internal.ads;

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
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.y0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8353y0 implements vb4 {

    /* renamed from: E */
    public static final cc4 f41594E = C8174t0.f39223b;

    /* renamed from: F */
    private static final byte[] f41595F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    private static final C8281w f41596G;

    /* renamed from: A */
    private yb4 f41597A;

    /* renamed from: B */
    private ad4[] f41598B;

    /* renamed from: C */
    private ad4[] f41599C;

    /* renamed from: D */
    private boolean f41600D;

    /* renamed from: a */
    private final List<C8281w> f41601a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: b */
    private final SparseArray<C8282w0> f41602b;

    /* renamed from: c */
    private final uq2 f41603c = new uq2(kh2.f34333a);

    /* renamed from: d */
    private final uq2 f41604d = new uq2(5);

    /* renamed from: e */
    private final uq2 f41605e = new uq2();

    /* renamed from: f */
    private final byte[] f41606f;

    /* renamed from: g */
    private final uq2 f41607g;

    /* renamed from: h */
    private final ee4 f41608h = new ee4();

    /* renamed from: i */
    private final uq2 f41609i = new uq2(16);

    /* renamed from: j */
    private final ArrayDeque<C7777i0> f41610j;

    /* renamed from: k */
    private final ArrayDeque<C8247v0> f41611k;

    /* renamed from: l */
    private int f41612l;

    /* renamed from: m */
    private int f41613m;

    /* renamed from: n */
    private long f41614n;

    /* renamed from: o */
    private int f41615o;

    /* renamed from: p */
    private uq2 f41616p;

    /* renamed from: q */
    private long f41617q;

    /* renamed from: r */
    private int f41618r;

    /* renamed from: s */
    private long f41619s;

    /* renamed from: t */
    private long f41620t;

    /* renamed from: u */
    private long f41621u;

    /* renamed from: v */
    private C8282w0 f41622v;

    /* renamed from: w */
    private int f41623w;

    /* renamed from: x */
    private int f41624x;

    /* renamed from: y */
    private int f41625y;

    /* renamed from: z */
    private boolean f41626z;

    static {
        ge4 ge4 = new ge4();
        ge4.mo32093s(MimeTypes.APPLICATION_EMSG);
        f41596G = ge4.mo32099y();
    }

    public C8353y0(int i, ay2 ay2) {
        byte[] bArr = new byte[16];
        this.f41606f = bArr;
        this.f41607g = new uq2(bArr);
        this.f41610j = new ArrayDeque<>();
        this.f41611k = new ArrayDeque<>();
        this.f41602b = new SparseArray<>();
        this.f41620t = C6540C.TIME_UNSET;
        this.f41619s = C6540C.TIME_UNSET;
        this.f41621u = C6540C.TIME_UNSET;
        this.f41597A = yb4.f41780c0;
        this.f41598B = new ad4[0];
        this.f41599C = new ad4[0];
    }

    /* renamed from: b */
    private static int m39698b(int i) throws C7811iy {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw C7811iy.m33482a(sb.toString(), (Throwable) null);
    }

    /* renamed from: e */
    private static zzs m39699e(List<C7814j0> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C7814j0 j0Var = list.get(i);
            if (j0Var.f34088a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] h = j0Var.f33686b.mo35238h();
                UUID a = C7667f1.m31999a(h);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzr(a, (String) null, MimeTypes.VIDEO_MP4, h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzs((List<zzr>) arrayList);
    }

    /* renamed from: g */
    private final void m39700g() {
        this.f41612l = 0;
        this.f41615o = 0;
    }

    /* renamed from: h */
    private static void m39701h(uq2 uq2, int i, C7851k1 k1Var) throws C7811iy {
        uq2.mo35236f(i + 8);
        int m = uq2.mo35243m() & 16777215;
        if ((m & 1) == 0) {
            boolean z = (m & 2) != 0;
            int v = uq2.mo35252v();
            if (v == 0) {
                Arrays.fill(k1Var.f34112m, 0, k1Var.f34104e, false);
                return;
            }
            int i2 = k1Var.f34104e;
            if (v == i2) {
                Arrays.fill(k1Var.f34112m, 0, v, z);
                k1Var.mo33011b(uq2.mo35239i());
                uq2.mo35232b(k1Var.f34114o.mo35238h(), 0, k1Var.f34114o.mo35242l());
                k1Var.f34114o.mo35236f(0);
                k1Var.f34115p = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(v);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw C7811iy.m33482a(sb.toString(), (Throwable) null);
        }
        throw C7811iy.m33484c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x032c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m39702i(long r48) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            r47 = this;
            r0 = r47
        L_0x0002:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r1 = r0.f41610j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0704
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r1 = r0.f41610j
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.i0 r1 = (com.google.android.gms.internal.ads.C7777i0) r1
            long r1 = r1.f33005b
            int r3 = (r1 > r48 ? 1 : (r1 == r48 ? 0 : -1))
            if (r3 != 0) goto L_0x0704
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r1 = r0.f41610j
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.android.gms.internal.ads.i0 r2 = (com.google.android.gms.internal.ads.C7777i0) r2
            int r1 = r2.f34088a
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r7 = 8
            if (r1 != r3) goto L_0x013d
            java.util.List<com.google.android.gms.internal.ads.j0> r1 = r2.f33006c
            com.google.android.gms.internal.ads.zzs r1 = m39699e(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.gms.internal.ads.i0 r3 = r2.mo32507c(r3)
            java.util.Objects.requireNonNull(r3)
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.List<com.google.android.gms.internal.ads.j0> r8 = r3.f33006c
            int r8 = r8.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
        L_0x004d:
            if (r9 >= r8) goto L_0x00b8
            java.util.List<com.google.android.gms.internal.ads.j0> r13 = r3.f33006c
            java.lang.Object r13 = r13.get(r9)
            com.google.android.gms.internal.ads.j0 r13 = (com.google.android.gms.internal.ads.C7814j0) r13
            int r14 = r13.f34088a
            r15 = 1953654136(0x74726578, float:7.6818474E31)
            if (r14 != r15) goto L_0x0096
            com.google.android.gms.internal.ads.uq2 r13 = r13.f33686b
            r13.mo35236f(r6)
            int r14 = r13.mo35243m()
            int r15 = r13.mo35243m()
            int r10 = r13.mo35243m()
            int r6 = r13.mo35243m()
            int r13 = r13.mo35243m()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.android.gms.internal.ads.s0 r11 = new com.google.android.gms.internal.ads.s0
            int r15 = r15 + -1
            r11.<init>(r15, r10, r6, r13)
            android.util.Pair r6 = android.util.Pair.create(r14, r11)
            java.lang.Object r10 = r6.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.s0 r6 = (com.google.android.gms.internal.ads.C8140s0) r6
            r12.put(r10, r6)
            goto L_0x00b3
        L_0x0096:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r14 != r6) goto L_0x00b3
            com.google.android.gms.internal.ads.uq2 r4 = r13.f33686b
            r4.mo35236f(r7)
            int r5 = r4.mo35243m()
            int r5 = com.google.android.gms.internal.ads.C7850k0.m33804a(r5)
            if (r5 != 0) goto L_0x00af
            long r4 = r4.mo35223A()
            goto L_0x00b3
        L_0x00af:
            long r4 = r4.mo35224B()
        L_0x00b3:
            int r9 = r9 + 1
            r6 = 12
            goto L_0x004d
        L_0x00b8:
            com.google.android.gms.internal.ads.mc4 r3 = new com.google.android.gms.internal.ads.mc4
            r3.<init>()
            com.google.android.gms.internal.ads.u0 r9 = new com.google.android.gms.internal.ads.u0
            r9.<init>(r0)
            r7 = 0
            r8 = 0
            r6 = r1
            java.util.List r1 = com.google.android.gms.internal.ads.C8105r0.m36832c(r2, r3, r4, r6, r7, r8, r9)
            int r2 = r1.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r3 = r0.f41602b
            int r3 = r3.size()
            if (r3 != 0) goto L_0x010e
            r10 = 0
        L_0x00d6:
            if (r10 >= r2) goto L_0x0107
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.l1 r3 = (com.google.android.gms.internal.ads.C7888l1) r3
            com.google.android.gms.internal.ads.i1 r4 = r3.f34775a
            com.google.android.gms.internal.ads.w0 r5 = new com.google.android.gms.internal.ads.w0
            com.google.android.gms.internal.ads.yb4 r6 = r0.f41597A
            int r7 = r4.f33017b
            com.google.android.gms.internal.ads.ad4 r6 = r6.mo18211m(r10, r7)
            int r7 = r4.f33016a
            com.google.android.gms.internal.ads.s0 r7 = m39703j(r12, r7)
            r5.<init>(r6, r3, r7)
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r3 = r0.f41602b
            int r6 = r4.f33016a
            r3.put(r6, r5)
            long r5 = r0.f41620t
            long r3 = r4.f33020e
            long r3 = java.lang.Math.max(r5, r3)
            r0.f41620t = r3
            int r10 = r10 + 1
            goto L_0x00d6
        L_0x0107:
            com.google.android.gms.internal.ads.yb4 r1 = r0.f41597A
            r1.zzB()
            goto L_0x0002
        L_0x010e:
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r3 = r0.f41602b
            int r3 = r3.size()
            if (r3 != r2) goto L_0x0118
            r11 = 1
            goto L_0x0119
        L_0x0118:
            r11 = 0
        L_0x0119:
            com.google.android.gms.internal.ads.nu1.m20747f(r11)
            r10 = 0
        L_0x011d:
            if (r10 >= r2) goto L_0x0002
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.l1 r3 = (com.google.android.gms.internal.ads.C7888l1) r3
            com.google.android.gms.internal.ads.i1 r4 = r3.f34775a
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r5 = r0.f41602b
            int r6 = r4.f33016a
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.internal.ads.w0 r5 = (com.google.android.gms.internal.ads.C8282w0) r5
            int r4 = r4.f33016a
            com.google.android.gms.internal.ads.s0 r4 = m39703j(r12, r4)
            r5.mo35533h(r3, r4)
            int r10 = r10 + 1
            goto L_0x011d
        L_0x013d:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L_0x06ec
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r1 = r0.f41602b
            byte[] r3 = r0.f41606f
            java.util.List<com.google.android.gms.internal.ads.i0> r6 = r2.f33007d
            int r6 = r6.size()
            r8 = 0
        L_0x014d:
            if (r8 >= r6) goto L_0x0655
            java.util.List<com.google.android.gms.internal.ads.i0> r10 = r2.f33007d
            java.lang.Object r10 = r10.get(r8)
            com.google.android.gms.internal.ads.i0 r10 = (com.google.android.gms.internal.ads.C7777i0) r10
            int r11 = r10.f34088a
            r12 = 1953653094(0x74726166, float:7.6813435E31)
            if (r11 != r12) goto L_0x0636
            r11 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.gms.internal.ads.j0 r11 = r10.mo32508d(r11)
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.uq2 r11 = r11.f33686b
            r11.mo35236f(r7)
            int r12 = r11.mo35243m()
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            int r14 = r11.mo35243m()
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.w0 r14 = (com.google.android.gms.internal.ads.C8282w0) r14
            if (r14 != 0) goto L_0x0183
            r14 = 0
            goto L_0x01cc
        L_0x0183:
            r15 = r12 & 1
            if (r15 == 0) goto L_0x0191
            long r4 = r11.mo35224B()
            com.google.android.gms.internal.ads.k1 r15 = r14.f40635b
            r15.f34101b = r4
            r15.f34102c = r4
        L_0x0191:
            com.google.android.gms.internal.ads.s0 r4 = r14.f40638e
            r5 = r12 & 2
            if (r5 == 0) goto L_0x019e
            int r5 = r11.mo35243m()
            int r5 = r5 + -1
            goto L_0x01a0
        L_0x019e:
            int r5 = r4.f38821a
        L_0x01a0:
            r15 = r12 & 8
            if (r15 == 0) goto L_0x01a9
            int r15 = r11.mo35243m()
            goto L_0x01ab
        L_0x01a9:
            int r15 = r4.f38822b
        L_0x01ab:
            r16 = r12 & 16
            if (r16 == 0) goto L_0x01b6
            int r16 = r11.mo35243m()
            r9 = r16
            goto L_0x01b8
        L_0x01b6:
            int r9 = r4.f38823c
        L_0x01b8:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x01c1
            int r4 = r11.mo35243m()
            goto L_0x01c3
        L_0x01c1:
            int r4 = r4.f38824d
        L_0x01c3:
            com.google.android.gms.internal.ads.k1 r11 = r14.f40635b
            com.google.android.gms.internal.ads.s0 r12 = new com.google.android.gms.internal.ads.s0
            r12.<init>(r5, r15, r9, r4)
            r11.f34100a = r12
        L_0x01cc:
            if (r14 != 0) goto L_0x01d0
            goto L_0x0636
        L_0x01d0:
            com.google.android.gms.internal.ads.k1 r4 = r14.f40635b
            long r11 = r4.f34116q
            boolean r5 = r4.f34117r
            r14.mo35534i()
            r9 = 1
            r14.f40645l = true
            r15 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.gms.internal.ads.j0 r15 = r10.mo32508d(r15)
            if (r15 == 0) goto L_0x0203
            com.google.android.gms.internal.ads.uq2 r5 = r15.f33686b
            r5.mo35236f(r7)
            int r11 = r5.mo35243m()
            int r11 = com.google.android.gms.internal.ads.C7850k0.m33804a(r11)
            if (r11 != r9) goto L_0x01fa
            long r11 = r5.mo35224B()
            goto L_0x01fe
        L_0x01fa:
            long r11 = r5.mo35223A()
        L_0x01fe:
            r4.f34116q = r11
            r4.f34117r = r9
            goto L_0x0207
        L_0x0203:
            r4.f34116q = r11
            r4.f34117r = r5
        L_0x0207:
            java.util.List<com.google.android.gms.internal.ads.j0> r5 = r10.f33006c
            int r9 = r5.size()
            r11 = 0
            r12 = 0
            r15 = 0
        L_0x0210:
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            if (r11 >= r9) goto L_0x023a
            java.lang.Object r18 = r5.get(r11)
            r7 = r18
            com.google.android.gms.internal.ads.j0 r7 = (com.google.android.gms.internal.ads.C7814j0) r7
            r18 = r1
            int r1 = r7.f34088a
            if (r1 != r13) goto L_0x0233
            com.google.android.gms.internal.ads.uq2 r1 = r7.f33686b
            r7 = 12
            r1.mo35236f(r7)
            int r1 = r1.mo35252v()
            if (r1 <= 0) goto L_0x0233
            int r15 = r15 + r1
            int r12 = r12 + 1
        L_0x0233:
            int r11 = r11 + 1
            r1 = r18
            r7 = 8
            goto L_0x0210
        L_0x023a:
            r18 = r1
            r1 = 0
            r14.f40641h = r1
            r14.f40640g = r1
            r14.f40639f = r1
            com.google.android.gms.internal.ads.k1 r1 = r14.f40635b
            r1.f34103d = r12
            r1.f34104e = r15
            int[] r7 = r1.f34106g
            int r7 = r7.length
            if (r7 >= r12) goto L_0x0256
            long[] r7 = new long[r12]
            r1.f34105f = r7
            int[] r7 = new int[r12]
            r1.f34106g = r7
        L_0x0256:
            int[] r7 = r1.f34107h
            int r7 = r7.length
            if (r7 >= r15) goto L_0x0273
            int r15 = r15 * 125
            int r15 = r15 / 100
            int[] r7 = new int[r15]
            r1.f34107h = r7
            int[] r7 = new int[r15]
            r1.f34108i = r7
            long[] r7 = new long[r15]
            r1.f34109j = r7
            boolean[] r7 = new boolean[r15]
            r1.f34110k = r7
            boolean[] r7 = new boolean[r15]
            r1.f34112m = r7
        L_0x0273:
            r1 = 0
            r7 = 0
            r11 = 0
        L_0x0276:
            r19 = 0
            if (r1 >= r9) goto L_0x0404
            java.lang.Object r15 = r5.get(r1)
            com.google.android.gms.internal.ads.j0 r15 = (com.google.android.gms.internal.ads.C7814j0) r15
            int r12 = r15.f34088a
            if (r12 != r13) goto L_0x03d3
            int r12 = r11 + 1
            com.google.android.gms.internal.ads.uq2 r15 = r15.f33686b
            r13 = 8
            r15.mo35236f(r13)
            int r13 = r15.mo35243m()
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r17
            r21 = r5
            com.google.android.gms.internal.ads.l1 r5 = r14.f40637d
            com.google.android.gms.internal.ads.i1 r5 = r5.f34775a
            r22 = r6
            com.google.android.gms.internal.ads.k1 r6 = r14.f40635b
            r23 = r9
            com.google.android.gms.internal.ads.s0 r9 = r6.f34100a
            int r24 = com.google.android.gms.internal.ads.d13.f20195a
            r24 = r12
            int[] r12 = r6.f34106g
            int r25 = r15.mo35252v()
            r12[r11] = r25
            long[] r12 = r6.f34105f
            r25 = r2
            r26 = r3
            long r2 = r6.f34101b
            r12[r11] = r2
            r27 = r13 & 1
            if (r27 == 0) goto L_0x02c9
            int r0 = r15.mo35243m()
            r27 = r1
            long r0 = (long) r0
            long r2 = r2 + r0
            r12[r11] = r2
            goto L_0x02cb
        L_0x02c9:
            r27 = r1
        L_0x02cb:
            r0 = r13 & 4
            int r1 = r9.f38824d
            if (r0 == 0) goto L_0x02d5
            int r1 = r15.mo35243m()
        L_0x02d5:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = r13 & 512(0x200, float:7.175E-43)
            r12 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            r28 = r1
            long[] r1 = r5.f33023h
            if (r1 == 0) goto L_0x030a
            r29 = r8
            int r8 = r1.length
            r30 = r10
            r10 = 1
            if (r8 != r10) goto L_0x030e
            r8 = 0
            r31 = r1[r8]
            int r1 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x030e
            long[] r1 = r5.f33024i
            java.lang.Object r1 = com.google.android.gms.internal.ads.d13.m20300c(r1)
            long[] r1 = (long[]) r1
            r31 = r1[r8]
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r13
            r1 = r14
            long r13 = r5.f33018c
            r35 = r13
            long r19 = com.google.android.gms.internal.ads.d13.m20295Z(r31, r33, r35)
            goto L_0x0310
        L_0x030a:
            r29 = r8
            r30 = r10
        L_0x030e:
            r8 = r13
            r1 = r14
        L_0x0310:
            int[] r10 = r6.f34107h
            int[] r13 = r6.f34108i
            long[] r14 = r6.f34109j
            r31 = r4
            boolean[] r4 = r6.f34110k
            r32 = r4
            int[] r4 = r6.f34106g
            r4 = r4[r11]
            int r4 = r4 + r7
            r39 = r10
            long r10 = r5.f33018c
            r5 = r13
            r40 = r14
            long r13 = r6.f34116q
        L_0x032a:
            if (r7 >= r4) goto L_0x03ca
            if (r2 == 0) goto L_0x0337
            int r33 = r15.mo35243m()
            r41 = r2
            r2 = r33
            goto L_0x033b
        L_0x0337:
            r41 = r2
            int r2 = r9.f38822b
        L_0x033b:
            m39698b(r2)
            if (r3 == 0) goto L_0x0349
            int r33 = r15.mo35243m()
            r42 = r3
            r3 = r33
            goto L_0x034d
        L_0x0349:
            r42 = r3
            int r3 = r9.f38823c
        L_0x034d:
            m39698b(r3)
            if (r12 == 0) goto L_0x035b
            int r33 = r15.mo35243m()
            r43 = r0
            r0 = r33
            goto L_0x0368
        L_0x035b:
            r43 = r0
            if (r7 != 0) goto L_0x0366
            if (r0 == 0) goto L_0x0365
            r0 = r28
            r7 = 0
            goto L_0x0368
        L_0x0365:
            r7 = 0
        L_0x0366:
            int r0 = r9.f38824d
        L_0x0368:
            if (r8 == 0) goto L_0x037f
            r44 = r4
            int r4 = r15.mo35243m()
            r46 = r8
            r45 = r9
            long r8 = (long) r4
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r33
            long r8 = r8 / r10
            int r4 = (int) r8
            r5[r7] = r4
            goto L_0x0388
        L_0x037f:
            r44 = r4
            r46 = r8
            r45 = r9
            r4 = 0
            r5[r7] = r4
        L_0x0388:
            r35 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r13
            r37 = r10
            long r8 = com.google.android.gms.internal.ads.d13.m20295Z(r33, r35, r37)
            long r8 = r8 - r19
            r40[r7] = r8
            boolean r4 = r6.f34117r
            if (r4 != 0) goto L_0x03a5
            com.google.android.gms.internal.ads.l1 r4 = r1.f40637d
            r33 = r5
            long r4 = r4.f34782h
            long r8 = r8 + r4
            r40[r7] = r8
            goto L_0x03a7
        L_0x03a5:
            r33 = r5
        L_0x03a7:
            r39[r7] = r3
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            r0 = r0 ^ r3
            if (r3 == r0) goto L_0x03b3
            r0 = 0
            goto L_0x03b4
        L_0x03b3:
            r0 = 1
        L_0x03b4:
            r32[r7] = r0
            long r2 = (long) r2
            long r13 = r13 + r2
            int r7 = r7 + 1
            r5 = r33
            r2 = r41
            r3 = r42
            r0 = r43
            r4 = r44
            r9 = r45
            r8 = r46
            goto L_0x032a
        L_0x03ca:
            r44 = r4
            r6.f34116q = r13
            r11 = r24
            r7 = r44
            goto L_0x03e9
        L_0x03d3:
            r27 = r1
            r25 = r2
            r26 = r3
            r31 = r4
            r21 = r5
            r22 = r6
            r29 = r8
            r23 = r9
            r30 = r10
            r1 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
        L_0x03e9:
            int r0 = r27 + 1
            r14 = r1
            r5 = r21
            r6 = r22
            r9 = r23
            r2 = r25
            r3 = r26
            r8 = r29
            r10 = r30
            r4 = r31
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            r1 = r0
            r0 = r47
            goto L_0x0276
        L_0x0404:
            r25 = r2
            r26 = r3
            r31 = r4
            r22 = r6
            r29 = r8
            r30 = r10
            r1 = r14
            com.google.android.gms.internal.ads.l1 r0 = r1.f40637d
            com.google.android.gms.internal.ads.i1 r0 = r0.f34775a
            r1 = r31
            com.google.android.gms.internal.ads.s0 r2 = r1.f34100a
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.f38821a
            com.google.android.gms.internal.ads.j1 r0 = r0.mo32520a(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r10 = r30
            com.google.android.gms.internal.ads.j0 r2 = r10.mo32508d(r2)
            if (r2 == 0) goto L_0x04a4
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.uq2 r2 = r2.f33686b
            int r3 = r0.f33695d
            r4 = 8
            r2.mo35236f(r4)
            int r5 = r2.mo35243m()
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0444
            r2.mo35237g(r4)
        L_0x0444:
            int r4 = r2.mo35249s()
            int r5 = r2.mo35252v()
            int r6 = r1.f34104e
            if (r5 > r6) goto L_0x0483
            if (r4 != 0) goto L_0x0469
            boolean[] r4 = r1.f34112m
            r6 = 0
            r7 = 0
        L_0x0456:
            if (r6 >= r5) goto L_0x0467
            int r8 = r2.mo35249s()
            int r7 = r7 + r8
            if (r8 <= r3) goto L_0x0461
            r8 = 1
            goto L_0x0462
        L_0x0461:
            r8 = 0
        L_0x0462:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x0456
        L_0x0467:
            r4 = 0
            goto L_0x0476
        L_0x0469:
            if (r4 <= r3) goto L_0x046d
            r2 = 1
            goto L_0x046e
        L_0x046d:
            r2 = 0
        L_0x046e:
            int r7 = r4 * r5
            boolean[] r3 = r1.f34112m
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r2)
        L_0x0476:
            boolean[] r2 = r1.f34112m
            int r3 = r1.f34104e
            java.util.Arrays.fill(r2, r5, r3, r4)
            if (r7 <= 0) goto L_0x04a4
            r1.mo33011b(r7)
            goto L_0x04a4
        L_0x0483:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 78
            r0.<init>(r1)
            java.lang.String r1 = "Saiz sample count "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r1)
            throw r0
        L_0x04a4:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.gms.internal.ads.j0 r2 = r10.mo32508d(r2)
            if (r2 == 0) goto L_0x04f4
            com.google.android.gms.internal.ads.uq2 r2 = r2.f33686b
            r3 = 8
            r2.mo35236f(r3)
            int r4 = r2.mo35243m()
            r5 = r4 & 1
            r6 = 1
            if (r5 != r6) goto L_0x04c0
            r2.mo35237g(r3)
        L_0x04c0:
            int r3 = r2.mo35252v()
            if (r3 != r6) goto L_0x04db
            long r5 = r1.f34102c
            int r3 = com.google.android.gms.internal.ads.C7850k0.m33804a(r4)
            if (r3 != 0) goto L_0x04d3
            long r2 = r2.mo35223A()
            goto L_0x04d7
        L_0x04d3:
            long r2 = r2.mo35224B()
        L_0x04d7:
            long r5 = r5 + r2
            r1.f34102c = r5
            goto L_0x04f4
        L_0x04db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r2)
            throw r0
        L_0x04f4:
            r2 = 0
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.gms.internal.ads.j0 r3 = r10.mo32508d(r3)
            if (r3 == 0) goto L_0x0504
            com.google.android.gms.internal.ads.uq2 r3 = r3.f33686b
            r4 = 0
            m39701h(r3, r4, r1)
        L_0x0504:
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = r0.f33693b
            r32 = r0
            goto L_0x050d
        L_0x050b:
            r32 = r2
        L_0x050d:
            r0 = r2
            r3 = r0
            r4 = 0
        L_0x0510:
            java.util.List<com.google.android.gms.internal.ads.j0> r5 = r10.f33006c
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x054d
            java.util.List<com.google.android.gms.internal.ads.j0> r5 = r10.f33006c
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.j0 r5 = (com.google.android.gms.internal.ads.C7814j0) r5
            com.google.android.gms.internal.ads.uq2 r6 = r5.f33686b
            int r5 = r5.f34088a
            r7 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r5 != r7) goto L_0x0539
            r7 = 12
            r6.mo35236f(r7)
            int r5 = r6.mo35243m()
            if (r5 != r8) goto L_0x054a
            r0 = r6
            goto L_0x054a
        L_0x0539:
            r7 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r9) goto L_0x054a
            r6.mo35236f(r7)
            int r5 = r6.mo35243m()
            if (r5 != r8) goto L_0x054a
            r3 = r6
        L_0x054a:
            int r4 = r4 + 1
            goto L_0x0510
        L_0x054d:
            r7 = 12
            if (r0 == 0) goto L_0x05f0
            if (r3 != 0) goto L_0x0555
            goto L_0x05f0
        L_0x0555:
            r4 = 8
            r0.mo35236f(r4)
            int r5 = r0.mo35243m()
            r6 = 4
            r0.mo35237g(r6)
            int r5 = com.google.android.gms.internal.ads.C7850k0.m33804a(r5)
            r8 = 1
            if (r5 != r8) goto L_0x056c
            r0.mo35237g(r6)
        L_0x056c:
            int r0 = r0.mo35243m()
            if (r0 != r8) goto L_0x05e9
            r3.mo35236f(r4)
            int r0 = r3.mo35243m()
            int r0 = com.google.android.gms.internal.ads.C7850k0.m33804a(r0)
            r3.mo35237g(r6)
            if (r0 != r8) goto L_0x0592
            long r4 = r3.mo35223A()
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x058b
            goto L_0x0598
        L_0x058b:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33484c(r0)
            throw r0
        L_0x0592:
            r4 = 2
            if (r0 < r4) goto L_0x0598
            r3.mo35237g(r6)
        L_0x0598:
            long r4 = r3.mo35223A()
            r8 = 1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x05e2
            r0 = 1
            r3.mo35237g(r0)
            int r4 = r3.mo35249s()
            r5 = r4 & 240(0xf0, float:3.36E-43)
            int r35 = r5 >> 4
            r36 = r4 & 15
            int r4 = r3.mo35249s()
            if (r4 != r0) goto L_0x05f1
            int r33 = r3.mo35249s()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r3.mo35232b(r5, r6, r4)
            if (r33 != 0) goto L_0x05d0
            int r2 = r3.mo35249s()
            byte[] r9 = new byte[r2]
            r3.mo35232b(r9, r6, r2)
            r37 = r9
            goto L_0x05d2
        L_0x05d0:
            r37 = r2
        L_0x05d2:
            r1.f34111l = r0
            com.google.android.gms.internal.ads.j1 r2 = new com.google.android.gms.internal.ads.j1
            r31 = 1
            r30 = r2
            r34 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r1.f34113n = r2
            goto L_0x05f1
        L_0x05e2:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33484c(r0)
            throw r0
        L_0x05e9:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33484c(r0)
            throw r0
        L_0x05f0:
            r0 = 1
        L_0x05f1:
            java.util.List<com.google.android.gms.internal.ads.j0> r2 = r10.f33006c
            int r2 = r2.size()
            r3 = 0
        L_0x05f8:
            if (r3 >= r2) goto L_0x0630
            java.util.List<com.google.android.gms.internal.ads.j0> r4 = r10.f33006c
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.j0 r4 = (com.google.android.gms.internal.ads.C7814j0) r4
            int r5 = r4.f34088a
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 != r6) goto L_0x0624
            com.google.android.gms.internal.ads.uq2 r4 = r4.f33686b
            r5 = 8
            r4.mo35236f(r5)
            r8 = r26
            r6 = 0
            r9 = 16
            r4.mo35232b(r8, r6, r9)
            byte[] r11 = f41595F
            boolean r11 = java.util.Arrays.equals(r8, r11)
            if (r11 == 0) goto L_0x062b
            m39701h(r4, r9, r1)
            goto L_0x062b
        L_0x0624:
            r8 = r26
            r5 = 8
            r6 = 0
            r9 = 16
        L_0x062b:
            int r3 = r3 + 1
            r26 = r8
            goto L_0x05f8
        L_0x0630:
            r8 = r26
            r5 = 8
            r6 = 0
            goto L_0x0645
        L_0x0636:
            r18 = r1
            r25 = r2
            r22 = r6
            r29 = r8
            r0 = 1
            r5 = 8
            r6 = 0
            r7 = 12
            r8 = r3
        L_0x0645:
            int r1 = r29 + 1
            r0 = r47
            r3 = r8
            r6 = r22
            r2 = r25
            r7 = 8
            r8 = r1
            r1 = r18
            goto L_0x014d
        L_0x0655:
            r1 = r2
            r2 = 0
            r6 = 0
            java.util.List<com.google.android.gms.internal.ads.j0> r0 = r1.f33006c
            com.google.android.gms.internal.ads.zzs r0 = m39699e(r0)
            r3 = r47
            if (r0 == 0) goto L_0x06a6
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r1 = r3.f41602b
            int r1 = r1.size()
            r4 = 0
        L_0x0669:
            if (r4 >= r1) goto L_0x06a6
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r5 = r3.f41602b
            java.lang.Object r5 = r5.valueAt(r4)
            com.google.android.gms.internal.ads.w0 r5 = (com.google.android.gms.internal.ads.C8282w0) r5
            com.google.android.gms.internal.ads.l1 r7 = r5.f40637d
            com.google.android.gms.internal.ads.i1 r7 = r7.f34775a
            com.google.android.gms.internal.ads.k1 r8 = r5.f40635b
            com.google.android.gms.internal.ads.s0 r8 = r8.f34100a
            int r9 = com.google.android.gms.internal.ads.d13.f20195a
            int r8 = r8.f38821a
            com.google.android.gms.internal.ads.j1 r7 = r7.mo32520a(r8)
            if (r7 == 0) goto L_0x0688
            java.lang.String r7 = r7.f33693b
            goto L_0x0689
        L_0x0688:
            r7 = r2
        L_0x0689:
            com.google.android.gms.internal.ads.zzs r7 = r0.mo36292a(r7)
            com.google.android.gms.internal.ads.l1 r8 = r5.f40637d
            com.google.android.gms.internal.ads.i1 r8 = r8.f34775a
            com.google.android.gms.internal.ads.w r8 = r8.f33021f
            com.google.android.gms.internal.ads.ge4 r8 = r8.mo35521b()
            r8.mo32070b(r7)
            com.google.android.gms.internal.ads.w r7 = r8.mo32099y()
            com.google.android.gms.internal.ads.ad4 r5 = r5.f40634a
            r5.mo30354a(r7)
            int r4 = r4 + 1
            goto L_0x0669
        L_0x06a6:
            long r0 = r3.f41619s
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0701
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r0 = r3.f41602b
            int r0 = r0.size()
            r10 = 0
        L_0x06b8:
            if (r10 >= r0) goto L_0x06e4
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r1 = r3.f41602b
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.android.gms.internal.ads.w0 r1 = (com.google.android.gms.internal.ads.C8282w0) r1
            long r4 = r3.f41619s
            int r2 = r1.f40639f
        L_0x06c6:
            com.google.android.gms.internal.ads.k1 r6 = r1.f40635b
            int r7 = r6.f34104e
            if (r2 >= r7) goto L_0x06e1
            long r6 = r6.mo33010a(r2)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x06e1
            com.google.android.gms.internal.ads.k1 r6 = r1.f40635b
            boolean[] r6 = r6.f34110k
            boolean r6 = r6[r2]
            if (r6 == 0) goto L_0x06de
            r1.f40642i = r2
        L_0x06de:
            int r2 = r2 + 1
            goto L_0x06c6
        L_0x06e1:
            int r10 = r10 + 1
            goto L_0x06b8
        L_0x06e4:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f41619s = r1
            goto L_0x0701
        L_0x06ec:
            r3 = r0
            r1 = r2
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r0 = r3.f41610j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0701
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r0 = r3.f41610j
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.i0 r0 = (com.google.android.gms.internal.ads.C7777i0) r0
            r0.mo32509e(r1)
        L_0x0701:
            r0 = r3
            goto L_0x0002
        L_0x0704:
            r3 = r0
            r47.m39700g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8353y0.m39702i(long):void");
    }

    /* renamed from: j */
    private static final C8140s0 m39703j(SparseArray<C8140s0> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C8140s0 s0Var = sparseArray.get(i);
        Objects.requireNonNull(s0Var);
        return s0Var;
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        return C7740h1.m32775a(wb4);
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        byte b;
        boolean z;
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        long j5;
        long j6;
        C8282w0 w0Var;
        int i;
        boolean z2;
        int i2;
        wb4 wb42 = wb4;
        while (true) {
            int i3 = this.f41612l;
            b = 1;
            z = false;
            if (i3 == 0) {
                if (this.f41615o == 0) {
                    if (!wb42.mo33310d(this.f41609i.mo35238h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f41615o = 8;
                    this.f41609i.mo35236f(0);
                    this.f41614n = this.f41609i.mo35223A();
                    this.f41613m = this.f41609i.mo35243m();
                }
                long j7 = this.f41614n;
                if (j7 == 1) {
                    ((qb4) wb42).mo33310d(this.f41609i.mo35238h(), 8, 8, false);
                    this.f41615o += 8;
                    this.f41614n = this.f41609i.mo35224B();
                } else if (j7 == 0) {
                    long zzc = wb4.zzc();
                    if (zzc == -1 && !this.f41610j.isEmpty()) {
                        zzc = this.f41610j.peek().f33005b;
                    }
                    if (zzc != -1) {
                        this.f41614n = (zzc - wb4.zze()) + ((long) this.f41615o);
                    }
                }
                if (this.f41614n >= ((long) this.f41615o)) {
                    long zze = wb4.zze() - ((long) this.f41615o);
                    int i4 = this.f41613m;
                    if ((i4 == 1836019558 || i4 == 1835295092) && !this.f41600D) {
                        this.f41597A.mo18210l(new vc4(this.f41620t, zze));
                        this.f41600D = true;
                    }
                    if (this.f41613m == 1836019558) {
                        int size = this.f41602b.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            C7851k1 k1Var = this.f41602b.valueAt(i5).f40635b;
                            k1Var.f34102c = zze;
                            k1Var.f34101b = zze;
                        }
                    }
                    int i6 = this.f41613m;
                    if (i6 == 1835295092) {
                        this.f41622v = null;
                        this.f41617q = zze + this.f41614n;
                        this.f41612l = 2;
                    } else if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1836019558 || i6 == 1953653094 || i6 == 1836475768 || i6 == 1701082227) {
                        long zze2 = (wb4.zze() + this.f41614n) - 8;
                        this.f41610j.push(new C7777i0(this.f41613m, zze2));
                        if (this.f41614n == ((long) this.f41615o)) {
                            m39702i(zze2);
                        } else {
                            m39700g();
                        }
                    } else if (i6 == 1751411826 || i6 == 1835296868 || i6 == 1836476516 || i6 == 1936286840 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1668576371 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1937011571 || i6 == 1952867444 || i6 == 1952868452 || i6 == 1953196132 || i6 == 1953654136 || i6 == 1953658222 || i6 == 1886614376 || i6 == 1935763834 || i6 == 1935763823 || i6 == 1936027235 || i6 == 1970628964 || i6 == 1935828848 || i6 == 1936158820 || i6 == 1701606260 || i6 == 1835362404 || i6 == 1701671783) {
                        if (this.f41615o == 8) {
                            long j8 = this.f41614n;
                            if (j8 <= 2147483647L) {
                                uq2 uq2 = new uq2((int) j8);
                                System.arraycopy(this.f41609i.mo35238h(), 0, uq2.mo35238h(), 0, 8);
                                this.f41616p = uq2;
                                this.f41612l = 1;
                            } else {
                                throw C7811iy.m33484c("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw C7811iy.m33484c("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else if (this.f41614n <= 2147483647L) {
                        this.f41616p = null;
                        this.f41612l = 1;
                    } else {
                        throw C7811iy.m33484c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw C7811iy.m33484c("Atom size less than header length (unsupported).");
                }
            } else if (i3 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i3 != 2) {
                    w0Var = this.f41622v;
                    if (w0Var != null) {
                        break;
                    }
                    SparseArray<C8282w0> sparseArray = this.f41602b;
                    int size2 = sparseArray.size();
                    long j10 = Long.MAX_VALUE;
                    C8282w0 w0Var2 = null;
                    for (int i7 = 0; i7 < size2; i7++) {
                        C8282w0 valueAt = sparseArray.valueAt(i7);
                        if ((valueAt.f40645l || valueAt.f40639f != valueAt.f40637d.f34776b) && (!valueAt.f40645l || valueAt.f40641h != valueAt.f40635b.f34103d)) {
                            long d = valueAt.mo35530d();
                            if (d < j10) {
                                w0Var2 = valueAt;
                                j10 = d;
                            }
                        }
                    }
                    if (w0Var2 == null) {
                        int zze3 = (int) (this.f41617q - wb4.zze());
                        if (zze3 >= 0) {
                            ((qb4) wb42).mo34305k(zze3, false);
                            m39700g();
                        } else {
                            throw C7811iy.m33482a("Offset to end of mdat was negative.", (Throwable) null);
                        }
                    } else {
                        int d2 = (int) (w0Var2.mo35530d() - wb4.zze());
                        if (d2 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            d2 = 0;
                        }
                        ((qb4) wb42).mo34305k(d2, false);
                        this.f41622v = w0Var2;
                        w0Var = w0Var2;
                    }
                } else {
                    int size3 = this.f41602b.size();
                    C8282w0 w0Var3 = null;
                    for (int i8 = 0; i8 < size3; i8++) {
                        C7851k1 k1Var2 = this.f41602b.valueAt(i8).f40635b;
                        if (k1Var2.f34115p) {
                            long j11 = k1Var2.f34102c;
                            if (j11 < j9) {
                                w0Var3 = this.f41602b.valueAt(i8);
                                j9 = j11;
                            }
                        }
                    }
                    if (w0Var3 == null) {
                        this.f41612l = 3;
                    } else {
                        int zze4 = (int) (j9 - wb4.zze());
                        if (zze4 >= 0) {
                            qb4 qb4 = (qb4) wb42;
                            qb4.mo34305k(zze4, false);
                            C7851k1 k1Var3 = w0Var3.f40635b;
                            qb4.mo33310d(k1Var3.f34114o.mo35238h(), 0, k1Var3.f34114o.mo35242l(), false);
                            k1Var3.f34114o.mo35236f(0);
                            k1Var3.f34115p = false;
                        } else {
                            throw C7811iy.m33482a("Offset to encryption data was negative.", (Throwable) null);
                        }
                    }
                }
            } else {
                int i9 = ((int) this.f41614n) - this.f41615o;
                uq2 uq22 = this.f41616p;
                if (uq22 != null) {
                    ((qb4) wb42).mo33310d(uq22.mo35238h(), 8, i9, false);
                    C7814j0 j0Var = new C7814j0(this.f41613m, uq22);
                    long zze5 = wb4.zze();
                    if (!this.f41610j.isEmpty()) {
                        this.f41610j.peek().mo32510f(j0Var);
                    } else {
                        int i10 = j0Var.f34088a;
                        if (i10 == 1936286840) {
                            uq2 uq23 = j0Var.f33686b;
                            uq23.mo35236f(8);
                            int m = uq23.mo35243m();
                            uq23.mo35237g(4);
                            long A = uq23.mo35223A();
                            if (C7850k0.m33804a(m) == 0) {
                                j6 = uq23.mo35223A();
                                j5 = uq23.mo35223A();
                            } else {
                                j6 = uq23.mo35224B();
                                j5 = uq23.mo35224B();
                            }
                            long j12 = zze5 + j5;
                            long Z = d13.m20295Z(j6, 1000000, A);
                            uq23.mo35237g(2);
                            int w = uq23.mo35253w();
                            int[] iArr = new int[w];
                            long[] jArr = new long[w];
                            long[] jArr2 = new long[w];
                            long[] jArr3 = new long[w];
                            long j13 = Z;
                            int i11 = 0;
                            while (i11 < w) {
                                int m2 = uq23.mo35243m();
                                if ((m2 & Integer.MIN_VALUE) == 0) {
                                    long A2 = uq23.mo35223A();
                                    iArr[i11] = m2 & Integer.MAX_VALUE;
                                    jArr[i11] = j12;
                                    jArr3[i11] = j13;
                                    long j14 = j6 + A2;
                                    long[] jArr4 = jArr3;
                                    int i12 = i11;
                                    long[] jArr5 = jArr2;
                                    int[] iArr2 = iArr;
                                    j13 = d13.m20295Z(j14, 1000000, A);
                                    jArr5[i12] = j13 - jArr4[i12];
                                    uq23.mo35237g(4);
                                    j12 += (long) iArr2[i12];
                                    i11 = i12 + 1;
                                    iArr = iArr2;
                                    jArr = jArr;
                                    jArr2 = jArr5;
                                    jArr3 = jArr4;
                                    w = w;
                                    j6 = j14;
                                    wb4 wb43 = wb4;
                                } else {
                                    throw C7811iy.m33482a("Unhandled indirect reference", (Throwable) null);
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(Z), new ob4(iArr, jArr, jArr2, jArr3));
                            this.f41621u = ((Long) create.first).longValue();
                            this.f41597A.mo18210l((wc4) create.second);
                            this.f41600D = true;
                        } else if (i10 == 1701671783) {
                            uq2 uq24 = j0Var.f33686b;
                            if (this.f41598B.length != 0) {
                                uq24.mo35236f(8);
                                int a = C7850k0.m33804a(uq24.mo35243m());
                                if (a == 0) {
                                    String D = uq24.mo35226D(0);
                                    Objects.requireNonNull(D);
                                    String D2 = uq24.mo35226D(0);
                                    Objects.requireNonNull(D2);
                                    long A3 = uq24.mo35223A();
                                    long Z2 = d13.m20295Z(uq24.mo35223A(), 1000000, A3);
                                    long j15 = this.f41621u;
                                    j3 = j15 != C6540C.TIME_UNSET ? j15 + Z2 : -9223372036854775807L;
                                    j2 = d13.m20295Z(uq24.mo35223A(), 1000, A3);
                                    j = uq24.mo35223A();
                                    str2 = D;
                                    str = D2;
                                    j4 = Z2;
                                } else if (a != 1) {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(a);
                                    Log.w("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long A4 = uq24.mo35223A();
                                    long Z3 = d13.m20295Z(uq24.mo35224B(), 1000000, A4);
                                    long Z4 = d13.m20295Z(uq24.mo35223A(), 1000, A4);
                                    long A5 = uq24.mo35223A();
                                    String D3 = uq24.mo35226D(0);
                                    Objects.requireNonNull(D3);
                                    String D4 = uq24.mo35226D(0);
                                    Objects.requireNonNull(D4);
                                    j2 = Z4;
                                    j3 = Z3;
                                    j = A5;
                                    str2 = D3;
                                    str = D4;
                                    j4 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[uq24.mo35239i()];
                                uq24.mo35232b(bArr, 0, uq24.mo35239i());
                                uq2 uq25 = new uq2(this.f41608h.mo31551a(new zzyw(str2, str, j2, j, bArr)));
                                int i13 = uq25.mo35239i();
                                for (ad4 d3 : this.f41598B) {
                                    uq25.mo35236f(0);
                                    d3.mo30357d(uq25, i13);
                                }
                                if (j3 == C6540C.TIME_UNSET) {
                                    this.f41611k.addLast(new C8247v0(j4, i13));
                                    this.f41618r += i13;
                                } else {
                                    for (ad4 e : this.f41598B) {
                                        e.mo30358e(j3, 1, i13, 0, (zc4) null);
                                    }
                                }
                            }
                        }
                        wb42 = wb4;
                    }
                } else {
                    ((qb4) wb42).mo34305k(i9, false);
                }
                m39702i(wb4.zze());
            }
        }
        byte b2 = 6;
        if (this.f41612l == 3) {
            int b3 = w0Var.mo35528b();
            this.f41623w = b3;
            if (w0Var.f40639f < w0Var.f40642i) {
                ((qb4) wb42).mo34305k(b3, false);
                C7815j1 f = w0Var.mo35532f();
                if (f != null) {
                    uq2 uq26 = w0Var.f40635b.f34114o;
                    int i14 = f.f33695d;
                    if (i14 != 0) {
                        uq26.mo35237g(i14);
                    }
                    if (w0Var.f40635b.mo33012c(w0Var.f40639f)) {
                        uq26.mo35237g(uq26.mo35253w() * 6);
                    }
                }
                if (!w0Var.mo35535k()) {
                    this.f41622v = null;
                }
                this.f41612l = 3;
                return 0;
            }
            if (w0Var.f40637d.f34775a.f33022g == 1) {
                this.f41623w = b3 - 8;
                ((qb4) wb42).mo34305k(8, false);
            }
            if (MimeTypes.AUDIO_AC4.equals(w0Var.f40637d.f34775a.f33021f.f40619l)) {
                this.f41624x = w0Var.mo35529c(this.f41623w, 7);
                db4.m31346b(this.f41623w, this.f41607g);
                yc4.m39857b(w0Var.f40634a, this.f41607g, 7);
                i2 = this.f41624x + 7;
                this.f41624x = i2;
            } else {
                i2 = w0Var.mo35529c(this.f41623w, 0);
                this.f41624x = i2;
            }
            this.f41623w += i2;
            this.f41612l = 4;
            this.f41625y = 0;
        }
        C7778i1 i1Var = w0Var.f40637d.f34775a;
        ad4 ad4 = w0Var.f40634a;
        long e2 = w0Var.mo35531e();
        if (i1Var.f33025j == 0) {
            while (true) {
                int i15 = this.f41624x;
                int i16 = this.f41623w;
                if (i15 >= i16) {
                    break;
                }
                this.f41624x += yc4.m39856a(ad4, wb42, i16 - i15, false);
            }
        } else {
            byte[] h = this.f41604d.mo35238h();
            h[0] = 0;
            h[1] = 0;
            h[2] = 0;
            int i17 = i1Var.f33025j;
            int i18 = i17 + 1;
            int i19 = 4 - i17;
            while (this.f41624x < this.f41623w) {
                int i20 = this.f41625y;
                if (i20 == 0) {
                    ((qb4) wb42).mo33310d(h, i19, i18, z);
                    this.f41604d.mo35236f(z ? 1 : 0);
                    int m3 = this.f41604d.mo35243m();
                    if (m3 > 0) {
                        this.f41625y = m3 - 1;
                        this.f41603c.mo35236f(z);
                        yc4.m39857b(ad4, this.f41603c, 4);
                        yc4.m39857b(ad4, this.f41604d, b);
                        if (this.f41599C.length > 0) {
                            String str3 = i1Var.f33021f.f40619l;
                            byte b4 = h[4];
                            byte[] bArr2 = kh2.f34333a;
                            if ((MimeTypes.VIDEO_H264.equals(str3) && (b4 & 31) == b2) || (MimeTypes.VIDEO_H265.equals(str3) && ((b4 & 126) >> b) == 39)) {
                                z2 = true;
                                this.f41626z = z2;
                                this.f41624x += 5;
                                this.f41623w += i19;
                            }
                        }
                        z2 = false;
                        this.f41626z = z2;
                        this.f41624x += 5;
                        this.f41623w += i19;
                    } else {
                        throw C7811iy.m33482a("Invalid NAL length", (Throwable) null);
                    }
                } else {
                    if (this.f41626z) {
                        this.f41605e.mo35233c(i20);
                        ((qb4) wb42).mo33310d(this.f41605e.mo35238h(), 0, this.f41625y, false);
                        yc4.m39857b(ad4, this.f41605e, this.f41625y);
                        i = this.f41625y;
                        int b5 = kh2.m33959b(this.f41605e.mo35238h(), this.f41605e.mo35242l());
                        this.f41605e.mo35236f(MimeTypes.VIDEO_H265.equals(i1Var.f33021f.f40619l) ? 1 : 0);
                        this.f41605e.mo35235e(b5);
                        nb4.m35124a(e2, this.f41605e, this.f41599C);
                    } else {
                        i = yc4.m39856a(ad4, wb42, i20, false);
                    }
                    this.f41624x += i;
                    this.f41625y -= i;
                    b2 = 6;
                    b = 1;
                }
                z = false;
            }
        }
        int a2 = w0Var.mo35527a();
        C7815j1 f2 = w0Var.mo35532f();
        ad4.mo30358e(e2, a2, this.f41623w, 0, f2 != null ? f2.f33694c : null);
        while (!this.f41611k.isEmpty()) {
            C8247v0 removeFirst = this.f41611k.removeFirst();
            this.f41618r -= removeFirst.f40229b;
            long j16 = removeFirst.f40228a + e2;
            for (ad4 e3 : this.f41598B) {
                e3.mo30358e(j16, 1, removeFirst.f40229b, this.f41618r, (zc4) null);
            }
        }
        if (!w0Var.mo35535k()) {
            this.f41622v = null;
        }
        this.f41612l = 3;
        return 0;
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f41597A = yb4;
        m39700g();
        ad4[] ad4Arr = new ad4[2];
        this.f41598B = ad4Arr;
        int i = 0;
        ad4[] ad4Arr2 = (ad4[]) d13.m20271B(ad4Arr, 0);
        this.f41598B = ad4Arr2;
        for (ad4 a : ad4Arr2) {
            a.mo30354a(f41596G);
        }
        this.f41599C = new ad4[this.f41601a.size()];
        int i2 = 100;
        while (i < this.f41599C.length) {
            int i3 = i2 + 1;
            ad4 m = this.f41597A.mo18211m(i2, 3);
            m.mo30354a(this.f41601a.get(i));
            this.f41599C[i] = m;
            i++;
            i2 = i3;
        }
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        int size = this.f41602b.size();
        for (int i = 0; i < size; i++) {
            this.f41602b.valueAt(i).mo35534i();
        }
        this.f41611k.clear();
        this.f41618r = 0;
        this.f41619s = j2;
        this.f41610j.clear();
        m39700g();
    }
}
