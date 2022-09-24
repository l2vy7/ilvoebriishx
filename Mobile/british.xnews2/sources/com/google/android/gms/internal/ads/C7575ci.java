package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.ci */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7575ci implements C8155sg {

    /* renamed from: w */
    public static final C8226ug f30365w = new C8406zh();

    /* renamed from: x */
    private static final int f30366x = C7836jm.m33645g("seig");

    /* renamed from: y */
    private static final byte[] f30367y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: a */
    private final SparseArray<C7540bi> f30368a = new SparseArray<>();

    /* renamed from: b */
    private final C7544bm f30369b = new C7544bm(C8410zl.f42494a);

    /* renamed from: c */
    private final C7544bm f30370c = new C7544bm(5);

    /* renamed from: d */
    private final C7544bm f30371d = new C7544bm();

    /* renamed from: e */
    private final C7544bm f30372e = new C7544bm(1);

    /* renamed from: f */
    private final C7544bm f30373f = new C7544bm(16);

    /* renamed from: g */
    private final byte[] f30374g = new byte[16];

    /* renamed from: h */
    private final Stack<C8015oh> f30375h = new Stack<>();

    /* renamed from: i */
    private final LinkedList<C7504ai> f30376i = new LinkedList<>();

    /* renamed from: j */
    private int f30377j;

    /* renamed from: k */
    private int f30378k;

    /* renamed from: l */
    private long f30379l;

    /* renamed from: m */
    private int f30380m;

    /* renamed from: n */
    private C7544bm f30381n;

    /* renamed from: o */
    private long f30382o;

    /* renamed from: p */
    private long f30383p = C6540C.TIME_UNSET;

    /* renamed from: q */
    private C7540bi f30384q;

    /* renamed from: r */
    private int f30385r;

    /* renamed from: s */
    private int f30386s;

    /* renamed from: t */
    private int f30387t;

    /* renamed from: u */
    private C8190tg f30388u;

    /* renamed from: v */
    private boolean f30389v;

    public C7575ci(int i, C7688fm fmVar, C7796ii iiVar) {
        m31025f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzarf m31024a(java.util.List<com.google.android.gms.internal.ads.C8050ph> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b7
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.ph r5 = (com.google.android.gms.internal.ads.C8050ph) r5
            int r6 = r5.f38132a
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38076V
            if (r6 != r7) goto L_0x00b3
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.google.android.gms.internal.ads.bm r5 = r5.f37635P0
            byte[] r5 = r5.f30037a
            com.google.android.gms.internal.ads.bm r6 = new com.google.android.gms.internal.ads.bm
            r6.<init>((byte[]) r5)
            int r8 = r6.mo30707d()
            r9 = 32
            if (r8 >= r9) goto L_0x0030
        L_0x002e:
            r6 = r2
            goto L_0x0097
        L_0x0030:
            r6.mo30725v(r1)
            int r8 = r6.mo30708e()
            int r9 = r6.mo30704a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x0040
            goto L_0x002e
        L_0x0040:
            int r8 = r6.mo30708e()
            if (r8 == r7) goto L_0x0047
            goto L_0x002e
        L_0x0047:
            int r7 = r6.mo30708e()
            int r7 = com.google.android.gms.internal.ads.C8086qh.m36472b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x006b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x002e
        L_0x006b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo30715l()
            long r12 = r6.mo30715l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0083
            int r7 = r6.mo30712i()
            int r7 = r7 * 16
            r6.mo30726w(r7)
        L_0x0083:
            int r7 = r6.mo30712i()
            int r8 = r6.mo30704a()
            if (r7 == r8) goto L_0x008e
            goto L_0x002e
        L_0x008e:
            byte[] r8 = new byte[r7]
            r6.mo30720q(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0097:
            if (r6 != 0) goto L_0x009b
            r6 = r2
            goto L_0x009f
        L_0x009b:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x009f:
            if (r6 != 0) goto L_0x00a9
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b3
        L_0x00a9:
            com.google.android.gms.internal.ads.zzare r7 = new com.google.android.gms.internal.ads.zzare
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        L_0x00b3:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b7:
            if (r4 != 0) goto L_0x00ba
            return r2
        L_0x00ba:
            com.google.android.gms.internal.ads.zzarf r14 = new com.google.android.gms.internal.ads.zzarf
            r14.<init>((java.util.List<com.google.android.gms.internal.ads.zzare>) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7575ci.m31024a(java.util.List):com.google.android.gms.internal.ads.zzarf");
    }

    /* renamed from: f */
    private final void m31025f() {
        this.f30377j = 0;
        this.f30380m = 0;
    }

    /* renamed from: g */
    private static void m31026g(C7544bm bmVar, int i, C7905li liVar) throws C8153se {
        bmVar.mo30725v(i + 8);
        int a = C8086qh.m36471a(bmVar.mo30708e());
        if ((a & 1) == 0) {
            boolean z = (a & 2) != 0;
            int i2 = bmVar.mo30712i();
            int i3 = liVar.f35092e;
            if (i2 == i3) {
                Arrays.fill(liVar.f35100m, 0, i2, z);
                liVar.mo33339a(bmVar.mo30704a());
                bmVar.mo30720q(liVar.f35103p.f30037a, 0, liVar.f35102o);
                liVar.f35103p.mo30725v(0);
                liVar.f35104q = false;
                return;
            }
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            throw new C8153se(sb.toString());
        }
        throw new C8153se("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0599  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31027h(long r50) throws com.google.android.gms.internal.ads.C8153se {
        /*
            r49 = this;
        L_0x0000:
            r0 = r49
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.oh> r1 = r0.f30375h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0631
            java.util.Stack<com.google.android.gms.internal.ads.oh> r1 = r0.f30375h
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.oh r1 = (com.google.android.gms.internal.ads.C8015oh) r1
            long r1 = r1.f36460P0
            int r3 = (r1 > r50 ? 1 : (r1 == r50 ? 0 : -1))
            if (r3 != 0) goto L_0x0631
            java.util.Stack<com.google.android.gms.internal.ads.oh> r1 = r0.f30375h
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.oh r1 = (com.google.android.gms.internal.ads.C8015oh) r1
            int r2 = r1.f38132a
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38044C
            r4 = 12
            r5 = 8
            r7 = 1
            if (r2 != r3) goto L_0x015d
            java.util.List<com.google.android.gms.internal.ads.ph> r2 = r1.f36461Q0
            com.google.android.gms.internal.ads.zzarf r2 = m31024a(r2)
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38066N
            com.google.android.gms.internal.ads.oh r3 = r1.mo33898d(r3)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.List<com.google.android.gms.internal.ads.ph> r8 = r3.f36461Q0
            int r8 = r8.size()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = r9
            r9 = 0
        L_0x0049:
            if (r9 >= r8) goto L_0x00b3
            java.util.List<com.google.android.gms.internal.ads.ph> r10 = r3.f36461Q0
            java.lang.Object r10 = r10.get(r9)
            com.google.android.gms.internal.ads.ph r10 = (com.google.android.gms.internal.ads.C8050ph) r10
            int r11 = r10.f38132a
            int r12 = com.google.android.gms.internal.ads.C8086qh.f38130z
            if (r11 != r12) goto L_0x0091
            com.google.android.gms.internal.ads.bm r10 = r10.f37635P0
            r10.mo30725v(r4)
            int r11 = r10.mo30708e()
            int r12 = r10.mo30712i()
            int r13 = r10.mo30712i()
            int r6 = r10.mo30712i()
            int r10 = r10.mo30708e()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.android.gms.internal.ads.yh r4 = new com.google.android.gms.internal.ads.yh
            int r12 = r12 + -1
            r4.<init>(r12, r13, r6, r10)
            android.util.Pair r4 = android.util.Pair.create(r11, r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.yh r4 = (com.google.android.gms.internal.ads.C8370yh) r4
            r14.put(r6, r4)
            goto L_0x00ae
        L_0x0091:
            int r4 = com.google.android.gms.internal.ads.C8086qh.f38068O
            if (r11 != r4) goto L_0x00ae
            com.google.android.gms.internal.ads.bm r4 = r10.f37635P0
            r4.mo30725v(r5)
            int r6 = r4.mo30708e()
            int r6 = com.google.android.gms.internal.ads.C8086qh.m36472b(r6)
            if (r6 != 0) goto L_0x00a9
            long r10 = r4.mo30716m()
            goto L_0x00ad
        L_0x00a9:
            long r10 = r4.mo30717n()
        L_0x00ad:
            r15 = r10
        L_0x00ae:
            int r9 = r9 + 1
            r4 = 12
            goto L_0x0049
        L_0x00b3:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.google.android.gms.internal.ads.oh> r4 = r1.f36462R0
            int r4 = r4.size()
            r5 = 0
        L_0x00bf:
            if (r5 >= r4) goto L_0x00e7
            java.util.List<com.google.android.gms.internal.ads.oh> r6 = r1.f36462R0
            java.lang.Object r6 = r6.get(r5)
            r8 = r6
            com.google.android.gms.internal.ads.oh r8 = (com.google.android.gms.internal.ads.C8015oh) r8
            int r6 = r8.f38132a
            int r9 = com.google.android.gms.internal.ads.C8086qh.f38048E
            if (r6 != r9) goto L_0x00e4
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38046D
            com.google.android.gms.internal.ads.ph r9 = r1.mo33899e(r6)
            r13 = 0
            r10 = r15
            r12 = r2
            com.google.android.gms.internal.ads.ii r6 = com.google.android.gms.internal.ads.C8334xh.m39468a(r8, r9, r10, r12, r13)
            if (r6 == 0) goto L_0x00e4
            int r8 = r6.f33244a
            r3.put(r8, r6)
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00bf
        L_0x00e7:
            int r1 = r3.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.bi> r2 = r0.f30368a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x012f
            r6 = 0
        L_0x00f4:
            if (r6 >= r1) goto L_0x0128
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.ii r2 = (com.google.android.gms.internal.ads.C7796ii) r2
            com.google.android.gms.internal.ads.bi r4 = new com.google.android.gms.internal.ads.bi
            com.google.android.gms.internal.ads.tg r5 = r0.f30388u
            int r7 = r2.f33245b
            com.google.android.gms.internal.ads.bh r5 = r5.mo33910h(r6, r7)
            r4.<init>(r5)
            int r5 = r2.f33244a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.yh r5 = (com.google.android.gms.internal.ads.C8370yh) r5
            r4.mo30677a(r2, r5)
            android.util.SparseArray<com.google.android.gms.internal.ads.bi> r5 = r0.f30368a
            int r7 = r2.f33244a
            r5.put(r7, r4)
            long r4 = r0.f30383p
            long r7 = r2.f33248e
            long r4 = java.lang.Math.max(r4, r7)
            r0.f30383p = r4
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x0128:
            com.google.android.gms.internal.ads.tg r1 = r0.f30388u
            r1.zzb()
            goto L_0x0002
        L_0x012f:
            android.util.SparseArray<com.google.android.gms.internal.ads.bi> r2 = r0.f30368a
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r7)
            r6 = 0
        L_0x013d:
            if (r6 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.ii r2 = (com.google.android.gms.internal.ads.C7796ii) r2
            android.util.SparseArray<com.google.android.gms.internal.ads.bi> r4 = r0.f30368a
            int r5 = r2.f33244a
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.bi r4 = (com.google.android.gms.internal.ads.C7540bi) r4
            int r5 = r2.f33244a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.yh r5 = (com.google.android.gms.internal.ads.C8370yh) r5
            r4.mo30677a(r2, r5)
            int r6 = r6 + 1
            goto L_0x013d
        L_0x015d:
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38062L
            if (r2 != r3) goto L_0x061a
            android.util.SparseArray<com.google.android.gms.internal.ads.bi> r2 = r0.f30368a
            byte[] r3 = r0.f30374g
            java.util.List<com.google.android.gms.internal.ads.oh> r4 = r1.f36462R0
            int r4 = r4.size()
            r6 = 0
        L_0x016c:
            if (r6 >= r4) goto L_0x05ee
            java.util.List<com.google.android.gms.internal.ads.oh> r8 = r1.f36462R0
            java.lang.Object r8 = r8.get(r6)
            com.google.android.gms.internal.ads.oh r8 = (com.google.android.gms.internal.ads.C8015oh) r8
            int r9 = r8.f38132a
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38064M
            if (r9 != r10) goto L_0x05d4
            int r9 = com.google.android.gms.internal.ads.C8086qh.f38128y
            com.google.android.gms.internal.ads.ph r9 = r8.mo33899e(r9)
            com.google.android.gms.internal.ads.bm r9 = r9.f37635P0
            r9.mo30725v(r5)
            int r10 = r9.mo30708e()
            int r10 = com.google.android.gms.internal.ads.C8086qh.m36471a(r10)
            int r11 = r9.mo30708e()
            java.lang.Object r11 = r2.get(r11)
            com.google.android.gms.internal.ads.bi r11 = (com.google.android.gms.internal.ads.C7540bi) r11
            if (r11 != 0) goto L_0x019d
            r11 = 0
            goto L_0x01e4
        L_0x019d:
            r12 = r10 & 1
            if (r12 == 0) goto L_0x01ab
            long r12 = r9.mo30717n()
            com.google.android.gms.internal.ads.li r14 = r11.f30005a
            r14.f35089b = r12
            r14.f35090c = r12
        L_0x01ab:
            com.google.android.gms.internal.ads.yh r12 = r11.f30008d
            r13 = r10 & 2
            if (r13 == 0) goto L_0x01b8
            int r13 = r9.mo30712i()
            int r13 = r13 + -1
            goto L_0x01ba
        L_0x01b8:
            int r13 = r12.f41858a
        L_0x01ba:
            r14 = r10 & 8
            if (r14 == 0) goto L_0x01c3
            int r14 = r9.mo30712i()
            goto L_0x01c5
        L_0x01c3:
            int r14 = r12.f41859b
        L_0x01c5:
            r15 = r10 & 16
            if (r15 == 0) goto L_0x01ce
            int r15 = r9.mo30712i()
            goto L_0x01d0
        L_0x01ce:
            int r15 = r12.f41860c
        L_0x01d0:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01d9
            int r9 = r9.mo30712i()
            goto L_0x01db
        L_0x01d9:
            int r9 = r12.f41861d
        L_0x01db:
            com.google.android.gms.internal.ads.li r10 = r11.f30005a
            com.google.android.gms.internal.ads.yh r12 = new com.google.android.gms.internal.ads.yh
            r12.<init>(r13, r14, r15, r9)
            r10.f35088a = r12
        L_0x01e4:
            if (r11 != 0) goto L_0x01e8
            goto L_0x05d4
        L_0x01e8:
            com.google.android.gms.internal.ads.li r9 = r11.f30005a
            long r12 = r9.f35105r
            r11.mo30678b()
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38126x
            com.google.android.gms.internal.ads.ph r14 = r8.mo33899e(r10)
            if (r14 == 0) goto L_0x0213
            com.google.android.gms.internal.ads.ph r10 = r8.mo33899e(r10)
            com.google.android.gms.internal.ads.bm r10 = r10.f37635P0
            r10.mo30725v(r5)
            int r12 = r10.mo30708e()
            int r12 = com.google.android.gms.internal.ads.C8086qh.m36472b(r12)
            if (r12 != r7) goto L_0x020f
            long r12 = r10.mo30717n()
            goto L_0x0213
        L_0x020f:
            long r12 = r10.mo30716m()
        L_0x0213:
            java.util.List<com.google.android.gms.internal.ads.ph> r10 = r8.f36461Q0
            int r14 = r10.size()
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x021c:
            if (r15 >= r14) goto L_0x024e
            java.lang.Object r18 = r10.get(r15)
            r19 = r2
            r2 = r18
            com.google.android.gms.internal.ads.ph r2 = (com.google.android.gms.internal.ads.C8050ph) r2
            r18 = r4
            int r4 = r2.f38132a
            r20 = r12
            int r12 = com.google.android.gms.internal.ads.C8086qh.f38040A
            if (r4 != r12) goto L_0x0243
            com.google.android.gms.internal.ads.bm r2 = r2.f37635P0
            r4 = 12
            r2.mo30725v(r4)
            int r2 = r2.mo30712i()
            if (r2 <= 0) goto L_0x0245
            int r5 = r5 + r2
            int r7 = r7 + 1
            goto L_0x0245
        L_0x0243:
            r4 = 12
        L_0x0245:
            int r15 = r15 + 1
            r4 = r18
            r2 = r19
            r12 = r20
            goto L_0x021c
        L_0x024e:
            r19 = r2
            r18 = r4
            r20 = r12
            r2 = 0
            r4 = 12
            r11.f30011g = r2
            r11.f30010f = r2
            r11.f30009e = r2
            com.google.android.gms.internal.ads.li r2 = r11.f30005a
            r2.f35091d = r7
            r2.f35092e = r5
            int[] r12 = r2.f35094g
            if (r12 == 0) goto L_0x026a
            int r12 = r12.length
            if (r12 >= r7) goto L_0x0272
        L_0x026a:
            long[] r12 = new long[r7]
            r2.f35093f = r12
            int[] r7 = new int[r7]
            r2.f35094g = r7
        L_0x0272:
            int[] r7 = r2.f35095h
            if (r7 == 0) goto L_0x0279
            int r7 = r7.length
            if (r7 >= r5) goto L_0x0291
        L_0x0279:
            int r5 = r5 * 125
            int r5 = r5 / 100
            int[] r7 = new int[r5]
            r2.f35095h = r7
            int[] r7 = new int[r5]
            r2.f35096i = r7
            long[] r7 = new long[r5]
            r2.f35097j = r7
            boolean[] r7 = new boolean[r5]
            r2.f35098k = r7
            boolean[] r5 = new boolean[r5]
            r2.f35100m = r5
        L_0x0291:
            r2 = 0
            r5 = 0
            r7 = 0
        L_0x0294:
            if (r2 >= r14) goto L_0x03fe
            java.lang.Object r17 = r10.get(r2)
            r4 = r17
            com.google.android.gms.internal.ads.ph r4 = (com.google.android.gms.internal.ads.C8050ph) r4
            int r15 = r4.f38132a
            int r12 = com.google.android.gms.internal.ads.C8086qh.f38040A
            if (r15 != r12) goto L_0x03d4
            int r12 = r7 + 1
            com.google.android.gms.internal.ads.bm r4 = r4.f37635P0
            r13 = 8
            r4.mo30725v(r13)
            int r13 = r4.mo30708e()
            int r13 = com.google.android.gms.internal.ads.C8086qh.m36471a(r13)
            com.google.android.gms.internal.ads.ii r15 = r11.f30007c
            r24 = r10
            com.google.android.gms.internal.ads.li r10 = r11.f30005a
            r25 = r12
            com.google.android.gms.internal.ads.yh r12 = r10.f35088a
            r26 = r14
            int[] r14 = r10.f35094g
            int r27 = r4.mo30712i()
            r14[r7] = r27
            long[] r14 = r10.f35093f
            r27 = r1
            long r0 = r10.f35089b
            r14[r7] = r0
            r28 = r13 & 1
            if (r28 == 0) goto L_0x02e4
            r28 = r6
            int r6 = r4.mo30708e()
            r29 = r8
            r30 = r9
            long r8 = (long) r6
            long r0 = r0 + r8
            r14[r7] = r0
            goto L_0x02ea
        L_0x02e4:
            r28 = r6
            r29 = r8
            r30 = r9
        L_0x02ea:
            r0 = r13 & 4
            int r1 = r12.f41861d
            if (r0 == 0) goto L_0x02f4
            int r1 = r4.mo30712i()
        L_0x02f4:
            r6 = r13 & 256(0x100, float:3.59E-43)
            r8 = r13 & 512(0x200, float:7.175E-43)
            r9 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            long[] r14 = r15.f33252i
            if (r14 == 0) goto L_0x0323
            r31 = r1
            int r1 = r14.length
            r32 = r3
            r3 = 1
            if (r1 != r3) goto L_0x0327
            r1 = 0
            r33 = r14[r1]
            r22 = 0
            int r3 = (r33 > r22 ? 1 : (r33 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0327
            long[] r3 = r15.f33253j
            r33 = r3[r1]
            r35 = 1000(0x3e8, double:4.94E-321)
            r3 = r2
            long r1 = r15.f33246c
            r37 = r1
            long r1 = com.google.android.gms.internal.ads.C7836jm.m33648j(r33, r35, r37)
            r22 = r1
            goto L_0x032a
        L_0x0323:
            r31 = r1
            r32 = r3
        L_0x0327:
            r3 = r2
            r22 = 0
        L_0x032a:
            int[] r1 = r10.f35095h
            int[] r2 = r10.f35096i
            long[] r14 = r10.f35097j
            r33 = r11
            boolean[] r11 = r10.f35098k
            r34 = r3
            int[] r3 = r10.f35094g
            r3 = r3[r7]
            int r3 = r3 + r5
            r41 = r14
            long r14 = r15.f33246c
            if (r7 <= 0) goto L_0x0348
            r42 = r1
            r43 = r2
            long r1 = r10.f35105r
            goto L_0x034e
        L_0x0348:
            r42 = r1
            r43 = r2
            r1 = r20
        L_0x034e:
            if (r5 >= r3) goto L_0x03cb
            if (r6 == 0) goto L_0x0357
            int r7 = r4.mo30712i()
            goto L_0x0359
        L_0x0357:
            int r7 = r12.f41859b
        L_0x0359:
            if (r8 == 0) goto L_0x0364
            int r35 = r4.mo30712i()
            r44 = r3
            r3 = r35
            goto L_0x0368
        L_0x0364:
            r44 = r3
            int r3 = r12.f41860c
        L_0x0368:
            if (r5 != 0) goto L_0x0373
            if (r0 == 0) goto L_0x0372
            r45 = r0
            r0 = r31
            r5 = 0
            goto L_0x0382
        L_0x0372:
            r5 = 0
        L_0x0373:
            if (r9 == 0) goto L_0x037e
            int r35 = r4.mo30708e()
            r45 = r0
            r0 = r35
            goto L_0x0382
        L_0x037e:
            r45 = r0
            int r0 = r12.f41861d
        L_0x0382:
            if (r13 == 0) goto L_0x0396
            r46 = r6
            int r6 = r4.mo30708e()
            int r6 = r6 * 1000
            r47 = r8
            r48 = r9
            long r8 = (long) r6
            long r8 = r8 / r14
            int r6 = (int) r8
            r43[r5] = r6
            goto L_0x039f
        L_0x0396:
            r46 = r6
            r47 = r8
            r48 = r9
            r6 = 0
            r43[r5] = r6
        L_0x039f:
            r37 = 1000(0x3e8, double:4.94E-321)
            r35 = r1
            r39 = r14
            long r8 = com.google.android.gms.internal.ads.C7836jm.m33648j(r35, r37, r39)
            long r8 = r8 - r22
            r41[r5] = r8
            r42[r5] = r3
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            r0 = r0 ^ r3
            if (r3 == r0) goto L_0x03b9
            r0 = 0
            goto L_0x03ba
        L_0x03b9:
            r0 = 1
        L_0x03ba:
            r11[r5] = r0
            long r6 = (long) r7
            long r1 = r1 + r6
            int r5 = r5 + 1
            r3 = r44
            r0 = r45
            r6 = r46
            r8 = r47
            r9 = r48
            goto L_0x034e
        L_0x03cb:
            r44 = r3
            r10.f35105r = r1
            r7 = r25
            r5 = r44
            goto L_0x03e6
        L_0x03d4:
            r27 = r1
            r34 = r2
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r24 = r10
            r33 = r11
            r26 = r14
        L_0x03e6:
            int r2 = r34 + 1
            r0 = r49
            r10 = r24
            r14 = r26
            r1 = r27
            r6 = r28
            r8 = r29
            r9 = r30
            r3 = r32
            r11 = r33
            r4 = 12
            goto L_0x0294
        L_0x03fe:
            r27 = r1
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r33 = r11
            int r0 = com.google.android.gms.internal.ads.C8086qh.f38087d0
            com.google.android.gms.internal.ads.ph r0 = r8.mo33899e(r0)
            if (r0 == 0) goto L_0x048d
            r11 = r33
            com.google.android.gms.internal.ads.ii r1 = r11.f30007c
            com.google.android.gms.internal.ads.ji[] r1 = r1.f33251h
            r2 = r30
            com.google.android.gms.internal.ads.yh r3 = r2.f35088a
            int r3 = r3.f41858a
            r1 = r1[r3]
            com.google.android.gms.internal.ads.bm r0 = r0.f37635P0
            int r1 = r1.f33896a
            r3 = 8
            r0.mo30725v(r3)
            int r4 = r0.mo30708e()
            int r4 = com.google.android.gms.internal.ads.C8086qh.m36471a(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0438
            r0.mo30726w(r3)
        L_0x0438:
            int r3 = r0.mo30710g()
            int r4 = r0.mo30712i()
            int r5 = r2.f35092e
            if (r4 != r5) goto L_0x046c
            if (r3 != 0) goto L_0x045b
            boolean[] r3 = r2.f35100m
            r5 = 0
            r6 = 0
        L_0x044a:
            if (r5 >= r4) goto L_0x0468
            int r7 = r0.mo30710g()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x0455
            r7 = 1
            goto L_0x0456
        L_0x0455:
            r7 = 0
        L_0x0456:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x044a
        L_0x045b:
            if (r3 <= r1) goto L_0x045f
            r0 = 1
            goto L_0x0460
        L_0x045f:
            r0 = 0
        L_0x0460:
            int r6 = r3 * r4
            boolean[] r1 = r2.f35100m
            r3 = 0
            java.util.Arrays.fill(r1, r3, r4, r0)
        L_0x0468:
            r2.mo33339a(r6)
            goto L_0x048f
        L_0x046c:
            com.google.android.gms.internal.ads.se r0 = new com.google.android.gms.internal.ads.se
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 41
            r1.<init>(r2)
            java.lang.String r2 = "Length mismatch: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x048d:
            r2 = r30
        L_0x048f:
            int r0 = com.google.android.gms.internal.ads.C8086qh.f38089e0
            com.google.android.gms.internal.ads.ph r0 = r8.mo33899e(r0)
            if (r0 == 0) goto L_0x04e1
            com.google.android.gms.internal.ads.bm r0 = r0.f37635P0
            r1 = 8
            r0.mo30725v(r1)
            int r3 = r0.mo30708e()
            int r4 = com.google.android.gms.internal.ads.C8086qh.m36471a(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04ad
            r0.mo30726w(r1)
        L_0x04ad:
            int r1 = r0.mo30712i()
            if (r1 != r5) goto L_0x04c8
            long r4 = r2.f35090c
            int r1 = com.google.android.gms.internal.ads.C8086qh.m36472b(r3)
            if (r1 != 0) goto L_0x04c0
            long r0 = r0.mo30716m()
            goto L_0x04c4
        L_0x04c0:
            long r0 = r0.mo30717n()
        L_0x04c4:
            long r4 = r4 + r0
            r2.f35090c = r4
            goto L_0x04e1
        L_0x04c8:
            com.google.android.gms.internal.ads.se r0 = new com.google.android.gms.internal.ads.se
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 40
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x04e1:
            int r0 = com.google.android.gms.internal.ads.C8086qh.f38097i0
            com.google.android.gms.internal.ads.ph r0 = r8.mo33899e(r0)
            if (r0 == 0) goto L_0x04ef
            com.google.android.gms.internal.ads.bm r0 = r0.f37635P0
            r1 = 0
            m31026g(r0, r1, r2)
        L_0x04ef:
            int r0 = com.google.android.gms.internal.ads.C8086qh.f38091f0
            com.google.android.gms.internal.ads.ph r0 = r8.mo33899e(r0)
            int r1 = com.google.android.gms.internal.ads.C8086qh.f38093g0
            com.google.android.gms.internal.ads.ph r1 = r8.mo33899e(r1)
            if (r0 == 0) goto L_0x058f
            if (r1 == 0) goto L_0x058f
            com.google.android.gms.internal.ads.bm r0 = r0.f37635P0
            com.google.android.gms.internal.ads.bm r1 = r1.f37635P0
            r3 = 8
            r0.mo30725v(r3)
            int r3 = r0.mo30708e()
            int r4 = r0.mo30708e()
            int r5 = f30366x
            if (r4 == r5) goto L_0x0516
            goto L_0x058f
        L_0x0516:
            int r3 = com.google.android.gms.internal.ads.C8086qh.m36472b(r3)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x0521
            r0.mo30726w(r4)
        L_0x0521:
            int r0 = r0.mo30708e()
            if (r0 != r6) goto L_0x0587
            r0 = 8
            r1.mo30725v(r0)
            int r0 = r1.mo30708e()
            int r3 = r1.mo30708e()
            if (r3 != r5) goto L_0x058f
            int r0 = com.google.android.gms.internal.ads.C8086qh.m36472b(r0)
            r3 = 2
            if (r0 != r6) goto L_0x0550
            long r4 = r1.mo30716m()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0548
            goto L_0x0555
        L_0x0548:
            com.google.android.gms.internal.ads.se r0 = new com.google.android.gms.internal.ads.se
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x0550:
            if (r0 < r3) goto L_0x0555
            r1.mo30726w(r4)
        L_0x0555:
            long r4 = r1.mo30716m()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x057f
            r1.mo30726w(r3)
            int r0 = r1.mo30710g()
            r3 = 1
            if (r0 != r3) goto L_0x0590
            int r0 = r1.mo30710g()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r1.mo30720q(r5, r6, r4)
            r2.f35099l = r3
            com.google.android.gms.internal.ads.ji r1 = new com.google.android.gms.internal.ads.ji
            r1.<init>(r3, r0, r5)
            r2.f35101n = r1
            goto L_0x0590
        L_0x057f:
            com.google.android.gms.internal.ads.se r0 = new com.google.android.gms.internal.ads.se
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0587:
            com.google.android.gms.internal.ads.se r0 = new com.google.android.gms.internal.ads.se
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x058f:
            r3 = 1
        L_0x0590:
            java.util.List<com.google.android.gms.internal.ads.ph> r0 = r8.f36461Q0
            int r0 = r0.size()
            r1 = 0
        L_0x0597:
            if (r1 >= r0) goto L_0x05ce
            java.util.List<com.google.android.gms.internal.ads.ph> r4 = r8.f36461Q0
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.internal.ads.ph r4 = (com.google.android.gms.internal.ads.C8050ph) r4
            int r5 = r4.f38132a
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38095h0
            if (r5 != r6) goto L_0x05c2
            com.google.android.gms.internal.ads.bm r4 = r4.f37635P0
            r5 = 8
            r4.mo30725v(r5)
            r6 = r32
            r7 = 16
            r9 = 0
            r4.mo30720q(r6, r9, r7)
            byte[] r10 = f30367y
            boolean r10 = java.util.Arrays.equals(r6, r10)
            if (r10 == 0) goto L_0x05c9
            m31026g(r4, r7, r2)
            goto L_0x05c9
        L_0x05c2:
            r6 = r32
            r5 = 8
            r7 = 16
            r9 = 0
        L_0x05c9:
            int r1 = r1 + 1
            r32 = r6
            goto L_0x0597
        L_0x05ce:
            r6 = r32
            r5 = 8
            r9 = 0
            goto L_0x05df
        L_0x05d4:
            r27 = r1
            r19 = r2
            r18 = r4
            r28 = r6
            r9 = 0
            r6 = r3
            r3 = 1
        L_0x05df:
            int r0 = r28 + 1
            r3 = r6
            r4 = r18
            r2 = r19
            r1 = r27
            r7 = 1
            r6 = r0
            r0 = r49
            goto L_0x016c
        L_0x05ee:
            r9 = 0
            java.util.List<com.google.android.gms.internal.ads.ph> r0 = r1.f36461Q0
            com.google.android.gms.internal.ads.zzarf r0 = m31024a(r0)
            if (r0 == 0) goto L_0x0000
            r2 = r49
            android.util.SparseArray<com.google.android.gms.internal.ads.bi> r1 = r2.f30368a
            int r1 = r1.size()
            r6 = 0
        L_0x0600:
            if (r6 >= r1) goto L_0x062e
            android.util.SparseArray<com.google.android.gms.internal.ads.bi> r3 = r2.f30368a
            java.lang.Object r3 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.bi r3 = (com.google.android.gms.internal.ads.C7540bi) r3
            com.google.android.gms.internal.ads.bh r4 = r3.f30006b
            com.google.android.gms.internal.ads.ii r3 = r3.f30007c
            com.google.android.gms.internal.ads.zzapg r3 = r3.f33249f
            com.google.android.gms.internal.ads.zzapg r3 = r3.mo36186d(r0)
            r4.mo30672a(r3)
            int r6 = r6 + 1
            goto L_0x0600
        L_0x061a:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.oh> r0 = r2.f30375h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x062e
            java.util.Stack<com.google.android.gms.internal.ads.oh> r0 = r2.f30375h
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.oh r0 = (com.google.android.gms.internal.ads.C8015oh) r0
            r0.mo33900f(r1)
        L_0x062e:
            r0 = r2
            goto L_0x0002
        L_0x0631:
            r2 = r0
            r49.m31025f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7575ci.m31027h(long):void");
    }

    /* renamed from: b */
    public final boolean mo30928b(C8121rg rgVar) throws IOException, InterruptedException {
        return C7758hi.m32872a(rgVar);
    }

    /* renamed from: c */
    public final void mo30929c(C8190tg tgVar) {
        this.f30388u = tgVar;
    }

    /* renamed from: d */
    public final void mo30930d(long j, long j2) {
        int size = this.f30368a.size();
        for (int i = 0; i < size; i++) {
            this.f30368a.valueAt(i).mo30678b();
        }
        this.f30376i.clear();
        this.f30375h.clear();
        m31025f();
    }

    /* renamed from: e */
    public final int mo30931e(C8121rg rgVar, C8333xg xgVar) throws IOException, InterruptedException {
        long j;
        long j2;
        C7503ah ahVar;
        C7832ji jiVar;
        C7503ah ahVar2;
        int i;
        C8121rg rgVar2 = rgVar;
        while (true) {
            int i2 = this.f30377j;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f30380m == 0) {
                    if (!rgVar2.mo34538h(this.f30373f.f30037a, 0, 8, true)) {
                        return -1;
                    }
                    this.f30380m = 8;
                    this.f30373f.mo30725v(0);
                    this.f30379l = this.f30373f.mo30716m();
                    this.f30378k = this.f30373f.mo30708e();
                }
                long j3 = this.f30379l;
                if (j3 == 1) {
                    rgVar2.mo34538h(this.f30373f.f30037a, 8, 8, false);
                    this.f30380m += 8;
                    j3 = this.f30373f.mo30717n();
                    this.f30379l = j3;
                }
                if (j3 >= ((long) this.f30380m)) {
                    long d = rgVar.mo34534d() - ((long) this.f30380m);
                    if (this.f30378k == C8086qh.f38062L) {
                        int size = this.f30368a.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C7905li liVar = this.f30368a.valueAt(i4).f30005a;
                            liVar.f35090c = d;
                            liVar.f35089b = d;
                        }
                    }
                    int i5 = this.f30378k;
                    if (i5 == C8086qh.f38096i) {
                        this.f30384q = null;
                        this.f30382o = d + this.f30379l;
                        if (!this.f30389v) {
                            this.f30388u.mo33909g(new C8369yg(this.f30383p));
                            this.f30389v = true;
                        }
                        this.f30377j = 2;
                    } else if (i5 == C8086qh.f38044C || i5 == C8086qh.f38048E || i5 == C8086qh.f38050F || i5 == C8086qh.f38052G || i5 == C8086qh.f38054H || i5 == C8086qh.f38062L || i5 == C8086qh.f38064M || i5 == C8086qh.f38066N || i5 == C8086qh.f38071Q) {
                        long d2 = (rgVar.mo34534d() + this.f30379l) - 8;
                        this.f30375h.add(new C8015oh(this.f30378k, d2));
                        if (this.f30379l == ((long) this.f30380m)) {
                            m31027h(d2);
                        } else {
                            m31025f();
                        }
                    } else if (i5 == C8086qh.f38074T || i5 == C8086qh.f38073S || i5 == C8086qh.f38046D || i5 == C8086qh.f38042B || i5 == C8086qh.f38075U || i5 == C8086qh.f38126x || i5 == C8086qh.f38128y || i5 == C8086qh.f38070P || i5 == C8086qh.f38130z || i5 == C8086qh.f38040A || i5 == C8086qh.f38076V || i5 == C8086qh.f38087d0 || i5 == C8086qh.f38089e0 || i5 == C8086qh.f38097i0 || i5 == C8086qh.f38095h0 || i5 == C8086qh.f38091f0 || i5 == C8086qh.f38093g0 || i5 == C8086qh.f38072R || i5 == C8086qh.f38068O || i5 == C8086qh.f38053G0) {
                        if (this.f30380m == 8) {
                            long j4 = this.f30379l;
                            if (j4 <= 2147483647L) {
                                C7544bm bmVar = new C7544bm((int) j4);
                                this.f30381n = bmVar;
                                System.arraycopy(this.f30373f.f30037a, 0, bmVar.f30037a, 0, 8);
                                this.f30377j = 1;
                            } else {
                                throw new C8153se("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw new C8153se("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else if (this.f30379l <= 2147483647L) {
                        this.f30381n = null;
                        this.f30377j = 1;
                    } else {
                        throw new C8153se("Skipping atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new C8153se("Atom size less than header length (unsupported).");
                }
            } else if (i2 != 1) {
                long j5 = Long.MAX_VALUE;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.f30384q != null) {
                            break;
                        }
                        SparseArray<C7540bi> sparseArray = this.f30368a;
                        int size2 = sparseArray.size();
                        C7540bi biVar = null;
                        for (int i6 = 0; i6 < size2; i6++) {
                            C7540bi valueAt = sparseArray.valueAt(i6);
                            int i7 = valueAt.f30011g;
                            C7905li liVar2 = valueAt.f30005a;
                            if (i7 != liVar2.f35091d) {
                                long j6 = liVar2.f35093f[i7];
                                if (j6 < j5) {
                                    biVar = valueAt;
                                    j5 = j6;
                                }
                            }
                        }
                        if (biVar == null) {
                            int d3 = (int) (this.f30382o - rgVar.mo34534d());
                            if (d3 >= 0) {
                                rgVar2.mo34539i(d3, false);
                                m31025f();
                            } else {
                                throw new C8153se("Offset to end of mdat was negative.");
                            }
                        } else {
                            int d4 = (int) (biVar.f30005a.f35093f[biVar.f30011g] - rgVar.mo34534d());
                            if (d4 < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                d4 = 0;
                            }
                            rgVar2.mo34539i(d4, false);
                            this.f30384q = biVar;
                        }
                    } else {
                        break;
                    }
                } else {
                    int size3 = this.f30368a.size();
                    C7540bi biVar2 = null;
                    for (int i8 = 0; i8 < size3; i8++) {
                        C7905li liVar3 = this.f30368a.valueAt(i8).f30005a;
                        if (liVar3.f35104q) {
                            long j7 = liVar3.f35090c;
                            if (j7 < j5) {
                                biVar2 = this.f30368a.valueAt(i8);
                                j5 = j7;
                            }
                        }
                    }
                    if (biVar2 == null) {
                        this.f30377j = 3;
                    } else {
                        int d5 = (int) (j5 - rgVar.mo34534d());
                        if (d5 >= 0) {
                            rgVar2.mo34539i(d5, false);
                            C7905li liVar4 = biVar2.f30005a;
                            rgVar2.mo34538h(liVar4.f35103p.f30037a, 0, liVar4.f35102o, false);
                            liVar4.f35103p.mo30725v(0);
                            liVar4.f35104q = false;
                        } else {
                            throw new C8153se("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i9 = ((int) this.f30379l) - this.f30380m;
                C7544bm bmVar2 = this.f30381n;
                if (bmVar2 != null) {
                    rgVar2.mo34538h(bmVar2.f30037a, 8, i9, false);
                    C8050ph phVar = new C8050ph(this.f30378k, this.f30381n);
                    long d6 = rgVar.mo34534d();
                    if (!this.f30375h.isEmpty()) {
                        this.f30375h.peek().mo33901g(phVar);
                    } else {
                        if (phVar.f38132a == C8086qh.f38042B) {
                            C7544bm bmVar3 = phVar.f37635P0;
                            bmVar3.mo30725v(8);
                            int e = bmVar3.mo30708e();
                            bmVar3.mo30726w(4);
                            long m = bmVar3.mo30716m();
                            if (C8086qh.m36472b(e) == 0) {
                                j2 = bmVar3.mo30716m();
                                j = bmVar3.mo30716m();
                            } else {
                                j2 = bmVar3.mo30717n();
                                j = bmVar3.mo30717n();
                            }
                            long j8 = d6 + j;
                            long j9 = j2;
                            long j10 = C7836jm.m33648j(j9, 1000000, m);
                            bmVar3.mo30726w(2);
                            int j11 = bmVar3.mo30713j();
                            int[] iArr = new int[j11];
                            long[] jArr = new long[j11];
                            long[] jArr2 = new long[j11];
                            long[] jArr3 = new long[j11];
                            long j12 = j10;
                            while (i3 < j11) {
                                int e2 = bmVar3.mo30708e();
                                if ((e2 & Integer.MIN_VALUE) == 0) {
                                    long m2 = bmVar3.mo30716m();
                                    iArr[i3] = e2 & Integer.MAX_VALUE;
                                    jArr[i3] = j8;
                                    jArr3[i3] = j12;
                                    j9 += m2;
                                    int i10 = j11;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    j12 = C7836jm.m33648j(j9, 1000000, m);
                                    jArr4[i3] = j12 - jArr5[i3];
                                    bmVar3.mo30726w(4);
                                    j8 += (long) iArr[i3];
                                    i3++;
                                    jArr = jArr;
                                    jArr3 = jArr5;
                                    jArr2 = jArr4;
                                    j11 = i10;
                                    C8121rg rgVar3 = rgVar;
                                } else {
                                    throw new C8153se("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(j10), new C8085qg(iArr, jArr, jArr2, jArr3));
                            ((Long) create.first).longValue();
                            this.f30388u.mo33909g((C8405zg) create.second);
                            this.f30389v = true;
                        }
                        rgVar2 = rgVar;
                    }
                } else {
                    rgVar2.mo34539i(i9, false);
                }
                m31027h(rgVar.mo34534d());
            }
        }
        C7540bi biVar3 = this.f30384q;
        C7905li liVar5 = biVar3.f30005a;
        int[] iArr2 = liVar5.f35095h;
        int i11 = biVar3.f30009e;
        int i12 = iArr2[i11];
        this.f30385r = i12;
        if (liVar5.f35099l) {
            C7544bm bmVar4 = liVar5.f35103p;
            int i13 = liVar5.f35088a.f41858a;
            C7832ji jiVar2 = liVar5.f35101n;
            if (jiVar2 == null) {
                jiVar2 = biVar3.f30007c.f33251h[i13];
            }
            int i14 = jiVar2.f33896a;
            boolean z = liVar5.f35100m[i11];
            C7544bm bmVar5 = this.f30372e;
            bmVar5.f30037a[0] = (byte) ((true != z ? 0 : 128) | i14);
            bmVar5.mo30725v(0);
            C7539bh bhVar = biVar3.f30006b;
            bhVar.mo30673b(this.f30372e, 1);
            bhVar.mo30673b(bmVar4, i14);
            if (!z) {
                i = i14 + 1;
            } else {
                int j13 = bmVar4.mo30713j();
                bmVar4.mo30726w(-2);
                int i15 = (j13 * 6) + 2;
                bhVar.mo30673b(bmVar4, i15);
                i = i14 + 1 + i15;
            }
            this.f30386s = i;
            i12 = this.f30385r + i;
            this.f30385r = i12;
        } else {
            this.f30386s = 0;
        }
        if (this.f30384q.f30007c.f33250g == 1) {
            this.f30385r = i12 - 8;
            rgVar2.mo34539i(8, false);
        }
        this.f30377j = 4;
        this.f30387t = 0;
        C7540bi biVar4 = this.f30384q;
        C7905li liVar6 = biVar4.f30005a;
        C7796ii iiVar = biVar4.f30007c;
        C7539bh bhVar2 = biVar4.f30006b;
        int i16 = biVar4.f30009e;
        int i17 = iiVar.f33254k;
        if (i17 == 0) {
            while (true) {
                int i18 = this.f30386s;
                int i19 = this.f30385r;
                if (i18 >= i19) {
                    break;
                }
                this.f30386s += bhVar2.mo30675d(rgVar2, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.f30370c.f30037a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.f30386s < this.f30385r) {
                int i22 = this.f30387t;
                if (i22 == 0) {
                    rgVar2.mo34538h(bArr, i21, i20, false);
                    this.f30370c.mo30725v(0);
                    this.f30387t = this.f30370c.mo30712i() - 1;
                    this.f30369b.mo30725v(0);
                    bhVar2.mo30673b(this.f30369b, 4);
                    bhVar2.mo30673b(this.f30370c, 1);
                    this.f30386s += 5;
                    this.f30385r += i21;
                } else {
                    int d7 = bhVar2.mo30675d(rgVar2, i22, false);
                    this.f30386s += d7;
                    this.f30387t -= d7;
                }
            }
        }
        long j14 = (liVar6.f35097j[i16] + ((long) liVar6.f35096i[i16])) * 1000;
        boolean z2 = liVar6.f35099l;
        boolean z3 = (true != z2 ? (char) 0 : 0) | liVar6.f35098k[i16];
        if (z2) {
            jiVar = liVar6.f35101n;
            if (jiVar == null) {
                jiVar = iiVar.f33251h[liVar6.f35088a.f41858a];
            }
            C7540bi biVar5 = this.f30384q;
            if (jiVar != biVar5.f30013i) {
                ahVar2 = new C7503ah(1, jiVar.f33897b);
            } else {
                ahVar2 = biVar5.f30012h;
            }
            ahVar = ahVar2;
        } else {
            jiVar = null;
            ahVar = null;
        }
        C7540bi biVar6 = this.f30384q;
        biVar6.f30012h = ahVar;
        biVar6.f30013i = jiVar;
        bhVar2.mo30674c(j14, z3 ? 1 : 0, this.f30385r, 0, ahVar);
        if (this.f30376i.isEmpty()) {
            C7540bi biVar7 = this.f30384q;
            biVar7.f30009e++;
            int i23 = biVar7.f30010f + 1;
            biVar7.f30010f = i23;
            int[] iArr3 = liVar6.f35094g;
            int i24 = biVar7.f30011g;
            if (i23 == iArr3[i24]) {
                biVar7.f30011g = i24 + 1;
                biVar7.f30010f = 0;
                this.f30384q = null;
            }
            this.f30377j = 3;
            return 0;
        }
        int i25 = this.f30376i.removeFirst().f29641a;
        throw null;
    }
}
