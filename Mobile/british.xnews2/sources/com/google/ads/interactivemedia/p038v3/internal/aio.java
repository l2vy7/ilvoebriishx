package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Pair;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aio */
/* compiled from: IMASDK */
public abstract class aio {

    /* renamed from: a */
    private aiz f15003a;

    public aio() {
    }

    public aio(byte[] bArr) {
        this();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Pair<C4158lp[], aih[]> mo13772f(aij aij, int[][][] iArr, int[] iArr2) throws C4089ja;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final aiz mo13778g() {
        aiz aiz = this.f15003a;
        aup.m14890u(aiz);
        return aiz;
    }

    /* renamed from: h */
    public aip mo13779h(C4157lo[] loVarArr, acq acq, abb abb, C4171mb mbVar) throws C4089ja {
        int[] iArr;
        acq acq2 = acq;
        int[] iArr2 = new int[3];
        aco[][] acoArr = new aco[3][];
        int[][][] iArr3 = new int[3][][];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = acq2.f14193b;
            acoArr[i2] = new aco[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = loVarArr[i5].mo15963s();
        }
        int i6 = 0;
        while (i6 < acq2.f14193b) {
            aco a = acq2.mo13453a(i6);
            int l = aln.m14042l(a.mo13445a(i).f17681l);
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z = true;
            while (i7 < i4) {
                C4157lo loVar = loVarArr[i7];
                int i10 = 0;
                while (i < a.f14188a) {
                    i10 = Math.max(i10, avr.m14972n(loVar.mo13724O(a.mo13445a(i))));
                    i++;
                }
                boolean z2 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z = z2;
                    i9 = i10;
                    i8 = i7;
                } else if (i10 == i9 && l == 5 && !z && z2) {
                    i9 = i10;
                    i8 = i7;
                    z = true;
                }
                i7++;
                i4 = 2;
                i = 0;
            }
            if (i8 == i4) {
                iArr = new int[a.f14188a];
            } else {
                C4157lo loVar2 = loVarArr[i8];
                int[] iArr5 = new int[a.f14188a];
                for (int i11 = 0; i11 < a.f14188a; i11++) {
                    iArr5[i11] = loVar2.mo13724O(a.mo13445a(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i8];
            acoArr[i8][i12] = a;
            iArr3[i8][i12] = iArr;
            iArr2[i8] = i12 + 1;
            i6++;
            i4 = 2;
            i = 0;
        }
        acq[] acqArr = new acq[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i13 = 0;
        while (i13 < i4) {
            int i14 = iArr2[i13];
            acqArr[i13] = new acq((aco[]) amm.m14238h(acoArr[i13], i14));
            iArr3[i13] = (int[][]) amm.m14238h(iArr3[i13], i14);
            strArr[i13] = loVarArr[i13].mo13720K();
            iArr6[i13] = loVarArr[i13].mo15945a();
            i13++;
            i4 = 2;
        }
        new acq((aco[]) amm.m14238h(acoArr[i4], iArr2[i4]));
        aij aij = new aij(iArr6, acqArr);
        Pair<C4158lp[], aih[]> f = mo13772f(aij, iArr3, iArr4);
        return new aip((C4158lp[]) f.first, (aih[]) f.second, aij);
    }

    /* renamed from: i */
    public final void mo13780i(aiz aiz) {
        this.f15003a = aiz;
    }
}
