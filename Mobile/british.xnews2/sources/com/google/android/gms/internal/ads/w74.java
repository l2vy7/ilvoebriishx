package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class w74 extends y74 {

    /* renamed from: c */
    private v74 f40723c;

    /* renamed from: a */
    public final z74 mo35588a(ix3[] ix3Arr, cm0 cm0, c54 c54, gi0 gi0) throws vk3 {
        boolean z;
        char c;
        int[] iArr;
        cm0 cm02 = cm0;
        int[] iArr2 = new int[3];
        ck0[][] ck0Arr = new ck0[3][];
        int[][][] iArr3 = new int[3][][];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = cm02.f30418a;
            ck0Arr[i2] = new ck0[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = ix3Arr[i5].zze();
        }
        int i6 = 0;
        while (i6 < cm02.f30418a) {
            ck0 b = cm02.mo30958b(i6);
            int a = C7773hx.m32959a(b.mo30944b(i).f40619l);
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i4) {
                ix3 ix3 = ix3Arr[i7];
                int i10 = 0;
                while (i <= 0) {
                    i10 = Math.max(i10, ix3.mo32801i(b.mo30944b(i)) & 7);
                    i++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && a == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i4 = 2;
                i = 0;
            }
            if (i8 == i4) {
                iArr = new int[1];
            } else {
                ix3 ix32 = ix3Arr[i8];
                int[] iArr5 = new int[1];
                for (int i11 = 0; i11 <= 0; i11++) {
                    iArr5[i11] = ix32.mo32801i(b.mo30944b(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i8];
            ck0Arr[i8][i12] = b;
            iArr3[i8][i12] = iArr;
            iArr2[i8] = i12 + 1;
            i6++;
            i4 = 2;
            i = 0;
        }
        cm0[] cm0Arr = new cm0[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i13 = 0;
        while (i13 < i4) {
            int i14 = iArr2[i13];
            cm0Arr[i13] = new cm0((ck0[]) d13.m20271B(ck0Arr[i13], i14));
            iArr3[i13] = (int[][]) d13.m20271B(iArr3[i13], i14);
            strArr[i13] = ix3Arr[i13].zzJ();
            iArr6[i13] = ix3Arr[i13].zzb();
            i13++;
            i4 = 2;
        }
        v74 v74 = new v74(strArr, iArr6, cm0Arr, iArr4, iArr3, new cm0((ck0[]) d13.m20271B(ck0Arr[2], iArr2[2])));
        Pair<jx3[], e74[]> f = mo34677f(v74, iArr3, iArr4, c54, gi0);
        e74[] e74Arr = (e74[]) f.second;
        m63 m63 = new m63();
        for (int i15 = 0; i15 < 2; i15++) {
            cm0 c2 = v74.mo35381c(i15);
            e74 e74 = e74Arr[i15];
            for (int i16 = 0; i16 < c2.f30418a; i16++) {
                ck0 b2 = c2.mo30958b(i16);
                int i17 = b2.f30405a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (char c3 = 0; c3 <= 0; c3 = 1) {
                    iArr7[0] = v74.mo35380b(i15, i16, 0);
                    if (e74 != null && e74.f31249a == b2) {
                        int i18 = 0;
                        while (true) {
                            if (i18 >= e74.f31250b) {
                                break;
                            } else if (e74.f31251c[i18] != 0) {
                                i18++;
                            } else if (i18 != -1) {
                                c = 0;
                                z = true;
                            }
                        }
                    }
                    c = 0;
                    z = false;
                    zArr[c] = z;
                }
                m63.mo33496f(new jv0(b2, iArr7, v74.mo35379a(i15), zArr));
            }
        }
        cm0 d = v74.mo35382d();
        for (int i19 = 0; i19 < d.f30418a; i19++) {
            ck0 b3 = d.mo30958b(i19);
            int i20 = b3.f30405a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            m63.mo33496f(new jv0(b3, iArr8, C7773hx.m32959a(b3.mo30944b(0).f40619l), new boolean[1]));
        }
        return new z74((jx3[]) f.first, (e74[]) f.second, new iw0(m63.mo33497g()), v74, (byte[]) null);
    }

    /* renamed from: b */
    public final void mo35589b(Object obj) {
        this.f40723c = (v74) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Pair<jx3[], e74[]> mo34677f(v74 v74, int[][][] iArr, int[] iArr2, c54 c54, gi0 gi0) throws vk3;
}
