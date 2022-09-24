package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c74 extends e74 {

    /* renamed from: f */
    private final i84 f30270f;

    /* renamed from: g */
    private final p63<a74> f30271g;

    /* renamed from: h */
    private final ov1 f30272h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected c74(ck0 ck0, int[] iArr, int i, i84 i84, long j, long j2, long j3, int i2, int i3, float f, float f2, List<a74> list, ov1 ov1) {
        super(ck0, iArr, 0);
        ck0 ck02 = ck0;
        int[] iArr2 = iArr;
        this.f30270f = i84;
        this.f30271g = p63.m20824y(list);
        this.f30272h = ov1;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ p63 m30911e(t74[] t74Arr) {
        int i;
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            t74 t74 = t74Arr[i3];
            if (t74 == null || t74.f39320b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                m63 t = p63.m20820t();
                t.mo33496f(new a74(0, 0));
                arrayList.add(t);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            t74 t742 = t74Arr[i4];
            if (t742 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[t742.f39320b.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = t742.f39320b;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    jArr[i4][i5] = (long) t742.f39319a.mo30944b(iArr[i5]).f40615h;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        m30912f(arrayList, jArr2);
        f73 c2 = y73.m39787b(d83.m31324c()).mo35378b(2).mo34866c();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr4 = jArr[i7];
                    double d2 = 0.0d;
                    if (i8 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i8];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i8] = d2;
                    i8++;
                }
                int i9 = length - 1;
                double d3 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    double d4 = (dArr[i10] + dArr[i11]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d4 - dArr[c]) / d3;
                    }
                    c2.mo18409a(Double.valueOf(d), Integer.valueOf(i7));
                    i10 = i11;
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        p63 y = p63.m20824y(c2.zzr());
        for (int i12 = 0; i12 < y.size(); i12++) {
            int intValue = ((Integer) y.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr2[intValue] = jArr[intValue][i13];
            m30912f(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j2 = jArr2[i14];
                jArr2[i14] = j2 + j2;
            }
        }
        m30912f(arrayList, jArr2);
        m63 t2 = p63.m20820t();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            m63 m63 = (m63) arrayList.get(i15);
            t2.mo33496f(m63 == null ? p63.m20814A() : m63.mo33497g());
        }
        return t2.mo33497g();
    }

    /* renamed from: f */
    private static void m30912f(List<m63<a74>> list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            m63 m63 = list.get(i2);
            if (m63 != null) {
                m63.mo33496f(new a74(j, jArr[i2]));
            }
        }
    }
}
