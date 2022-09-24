package com.google.ads.interactivemedia.p039v3.internal;

import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahu */
/* compiled from: IMASDK */
public final class ahu extends ahv {

    /* renamed from: d */
    private final aiz f14875d;

    /* renamed from: e */
    private final atz<ahs> f14876e;

    /* renamed from: f */
    private final aks f14877f;

    /* renamed from: g */
    private float f14878g = 1.0f;

    /* renamed from: h */
    private int f14879h;

    /* renamed from: i */
    private int f14880i = 0;

    /* renamed from: j */
    private long f14881j = C6540C.TIME_UNSET;

    /* renamed from: k */
    private adl f14882k;

    protected ahu(aco aco, int[] iArr, int i, aiz aiz, List<ahs> list, aks aks) {
        super(aco, iArr);
        this.f14875d = aiz;
        this.f14876e = atz.m14811m(list);
        this.f14877f = aks;
    }

    /* renamed from: i */
    static /* synthetic */ atz m13724i(aig[] aigArr) {
        int length;
        int i;
        int[] iArr;
        double d;
        aig[] aigArr2 = aigArr;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i2 = 0;
        while (true) {
            length = aigArr2.length;
            i = 1;
            if (i2 >= length) {
                break;
            }
            aig aig = aigArr2[i2];
            if (aig == null || aig.f14986b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                atv s = atz.m14815s();
                s.mo14514d(new ahs(0, 0));
                arrayList.add(s);
            }
            i2++;
        }
        long[][] jArr = new long[length][];
        for (int i3 = 0; i3 < aigArr2.length; i3++) {
            aig aig2 = aigArr2[i3];
            if (aig2 == null) {
                jArr[i3] = new long[0];
            } else {
                jArr[i3] = new long[aig2.f14986b.length];
                int i4 = 0;
                while (true) {
                    int[] iArr2 = aig2.f14986b;
                    if (i4 >= iArr2.length) {
                        break;
                    }
                    jArr[i3][i4] = (long) aig2.f14985a.mo13445a(iArr2[i4]).f17677h;
                    i4++;
                }
                Arrays.sort(jArr[i3]);
            }
        }
        int[] iArr3 = new int[length];
        long[] jArr2 = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            long[] jArr3 = jArr[i5];
            jArr2[i5] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        m13725u(arrayList, jArr2);
        auq b = avb.m14914a().mo14602b().mo14603b();
        int i6 = 0;
        while (i6 < length) {
            int length2 = jArr[i6].length;
            if (length2 <= i) {
                iArr = iArr3;
            } else {
                double[] dArr = new double[length2];
                int i7 = 0;
                while (true) {
                    long[] jArr4 = jArr[i6];
                    double d2 = 0.0d;
                    if (i7 >= jArr4.length) {
                        break;
                    }
                    int[] iArr4 = iArr3;
                    long j = jArr4[i7];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i7] = d2;
                    i7++;
                    iArr3 = iArr4;
                }
                iArr = iArr3;
                int i8 = length2 - 1;
                double d3 = dArr[i8] - dArr[c];
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = i9 + 1;
                    double d4 = (dArr[i9] + dArr[i10]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d4 - dArr[c]) / d3;
                    }
                    b.mo14381u(Double.valueOf(d), Integer.valueOf(i6));
                    i9 = i10;
                    c = 0;
                }
            }
            i6++;
            iArr3 = iArr;
            c = 0;
            i = 1;
        }
        int[] iArr5 = iArr3;
        atz m = atz.m14811m(b.mo14397x());
        for (int i11 = 0; i11 < m.size(); i11++) {
            int intValue = ((Integer) m.get(i11)).intValue();
            int i12 = iArr5[intValue] + 1;
            iArr5[intValue] = i12;
            jArr2[intValue] = jArr[intValue][i12];
            m13725u(arrayList, jArr2);
        }
        for (int i13 = 0; i13 < aigArr2.length; i13++) {
            if (arrayList.get(i13) != null) {
                long j2 = jArr2[i13];
                jArr2[i13] = j2 + j2;
            }
        }
        m13725u(arrayList, jArr2);
        atv s2 = atz.m14815s();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            atv atv = (atv) arrayList.get(i14);
            s2.mo14514d(atv == null ? atz.m14807i() : atv.mo14513c());
        }
        return s2.mo14513c();
    }

    /* renamed from: u */
    private static void m13725u(List<atv<ahs>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            atv atv = list.get(i);
            if (atv != null) {
                atv.mo14514d(new ahs(j, jArr[i]));
            }
        }
    }

    /* renamed from: v */
    private final int m13726v(long j) {
        long a = (long) (((float) ((long) (((float) this.f14875d.mo13793a()) * 0.7f))) / this.f14878g);
        if (!this.f14876e.isEmpty()) {
            int i = 1;
            while (i < this.f14876e.size() - 1 && this.f14876e.get(i).f14872a < a) {
                i++;
            }
            ahs ahs = this.f14876e.get(i - 1);
            ahs ahs2 = this.f14876e.get(i);
            long j2 = ahs.f14872a;
            long j3 = ahs2.f14872a;
            long j4 = ahs.f14873b;
            a = ((long) ((((float) (a - j2)) / ((float) (j3 - j2))) * ((float) (ahs2.f14873b - j4)))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14884b; i3++) {
            if (j == Long.MIN_VALUE || !mo13746s(i3, j)) {
                if (((long) mo13739l(i3).f17677h) <= a) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* renamed from: w */
    private static final long m13727w(List<? extends adl> list) {
        if (list.isEmpty()) {
            return C6540C.TIME_UNSET;
        }
        adl adl = (adl) art.m14630a(list);
        long j = adl.f14244i;
        if (j != C6540C.TIME_UNSET) {
            long j2 = adl.f14245j;
            if (j2 != C6540C.TIME_UNSET) {
                return j2 - j;
            }
        }
        return C6540C.TIME_UNSET;
    }

    /* renamed from: a */
    public final int mo13614a() {
        return this.f14879h;
    }

    /* renamed from: b */
    public final int mo13615b() {
        return this.f14880i;
    }

    /* renamed from: c */
    public final void mo13616c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r9 < r5) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r9 >= 25000000) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r13 = r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13617d(long r9, long r11, java.util.List<? extends com.google.ads.interactivemedia.p039v3.internal.adl> r13, com.google.ads.interactivemedia.p039v3.internal.adn[] r14) {
        /*
            r8 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r8.f14879h
            int r3 = r14.length
            r4 = 0
            if (r2 >= r3) goto L_0x001d
            r2 = r14[r2]
            boolean r2 = r2.mo13467a()
            if (r2 == 0) goto L_0x001d
            int r2 = r8.f14879h
            r14 = r14[r2]
            r14.mo13508e()
            r14.mo13507d()
            goto L_0x0034
        L_0x001d:
            if (r4 >= r3) goto L_0x0031
            r2 = r14[r4]
            boolean r5 = r2.mo13467a()
            if (r5 == 0) goto L_0x002e
            r2.mo13508e()
            r2.mo13507d()
            goto L_0x0034
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x001d
        L_0x0031:
            m13727w(r13)
        L_0x0034:
            int r14 = r8.f14880i
            if (r14 != 0) goto L_0x0042
            r9 = 1
            r8.f14880i = r9
            int r9 = r8.m13726v(r0)
            r8.f14879h = r9
            return
        L_0x0042:
            int r2 = r8.f14879h
            boolean r3 = r13.isEmpty()
            r4 = -1
            if (r3 == 0) goto L_0x004d
            r3 = -1
            goto L_0x0059
        L_0x004d:
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.art.m14630a(r13)
            com.google.ads.interactivemedia.v3.internal.adl r3 = (com.google.ads.interactivemedia.p039v3.internal.adl) r3
            com.google.ads.interactivemedia.v3.internal.ke r3 = r3.f14241f
            int r3 = r8.mo13741n(r3)
        L_0x0059:
            if (r3 == r4) goto L_0x0064
            java.lang.Object r13 = com.google.ads.interactivemedia.p039v3.internal.art.m14630a(r13)
            com.google.ads.interactivemedia.v3.internal.adl r13 = (com.google.ads.interactivemedia.p039v3.internal.adl) r13
            int r14 = r13.f14242g
            r2 = r3
        L_0x0064:
            int r13 = r8.m13726v(r0)
            boolean r0 = r8.mo13746s(r2, r0)
            if (r0 != 0) goto L_0x00a1
            com.google.ads.interactivemedia.v3.internal.ke r0 = r8.mo13739l(r2)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r8.mo13739l(r13)
            int r1 = r1.f17677h
            int r0 = r0.f17677h
            if (r1 <= r0) goto L_0x0097
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 10000000(0x989680, double:4.9406565E-317)
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0092
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0092
            float r11 = (float) r11
            r12 = 1061158912(0x3f400000, float:0.75)
            float r11 = r11 * r12
            long r5 = (long) r11
        L_0x0092:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0097
            goto L_0x00a0
        L_0x0097:
            if (r1 >= r0) goto L_0x00a1
            r11 = 25000000(0x17d7840, double:1.2351641E-316)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00a1
        L_0x00a0:
            r13 = r2
        L_0x00a1:
            if (r13 != r2) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r14 = 3
        L_0x00a5:
            r8.f14880i = r14
            r8.f14879h = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.ahu.mo13617d(long, long, java.util.List, com.google.ads.interactivemedia.v3.internal.adn[]):void");
    }

    /* renamed from: e */
    public final void mo13731e() {
        this.f14881j = C6540C.TIME_UNSET;
        this.f14882k = null;
    }

    /* renamed from: f */
    public final void mo13732f() {
        this.f14882k = null;
    }

    /* renamed from: g */
    public final void mo13733g(float f) {
        this.f14878g = f;
    }

    /* renamed from: h */
    public final int mo13734h(long j, List<? extends adl> list) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f14881j;
        if (j2 != C6540C.TIME_UNSET && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((adl) art.m14630a(list)).equals(this.f14882k))) {
            return list.size();
        }
        this.f14881j = elapsedRealtime;
        this.f14882k = list.isEmpty() ? null : (adl) art.m14630a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (amm.m14198O(((adl) list.get(size - 1)).f14244i - j, this.f14878g) < 25000000) {
            return size;
        }
        m13727w(list);
        C4120ke l = mo13739l(m13726v(elapsedRealtime));
        for (int i3 = 0; i3 < size; i3++) {
            adl adl = (adl) list.get(i3);
            C4120ke keVar = adl.f14241f;
            if (amm.m14198O(adl.f14244i - j, this.f14878g) >= 25000000 && keVar.f17677h < l.f17677h && (i = keVar.f17687r) != -1 && i < 720 && (i2 = keVar.f17686q) != -1 && i2 < 1280 && i < l.f17687r) {
                return i3;
            }
        }
        return size;
    }
}
