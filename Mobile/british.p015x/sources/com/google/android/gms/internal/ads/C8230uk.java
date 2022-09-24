package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C8230uk extends C8373yk {

    /* renamed from: b */
    private final SparseArray<Map<C7870kk, C8194tk>> f39877b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f39878c = new SparseBooleanArray();

    /* renamed from: d */
    private C8159sk f39879d;

    /* renamed from: a */
    public final C8409zk mo35195a(C8261ve[] veVarArr, C7870kk kkVar) throws C7536be {
        C8194tk tkVar;
        int[] iArr;
        C8261ve[] veVarArr2 = veVarArr;
        C7870kk kkVar2 = kkVar;
        int[] iArr2 = new int[3];
        C7834jk[][] jkVarArr = new C7834jk[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = kkVar2.f34352a;
            jkVarArr[i] = new C7834jk[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            veVarArr2[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < kkVar2.f34352a) {
            C7834jk b = kkVar2.mo33100b(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                C8261ve veVar = veVarArr2[i6];
                int i9 = 0;
                while (true) {
                    int i10 = b.f33907a;
                    if (i9 > 0) {
                        break;
                    }
                    int c = veVar.mo34134c(b.mo32903b(i9)) & 3;
                    if (c > i7) {
                        if (c == 3) {
                            break;
                        }
                        i8 = i6;
                        i7 = c;
                    }
                    i9++;
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = b.f33907a;
                iArr = new int[1];
            } else {
                C8261ve veVar2 = veVarArr2[i6];
                int i12 = b.f33907a;
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = veVar2.mo34134c(b.mo32903b(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i6];
            jkVarArr[i6][i14] = b;
            iArr3[i6][i14] = iArr;
            iArr2[i6] = i14 + 1;
            i5++;
            i3 = 2;
        }
        C7870kk[] kkVarArr = new C7870kk[2];
        int[] iArr6 = new int[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int i17 = iArr2[i15];
            kkVarArr[i15] = new C7870kk((C7834jk[]) Arrays.copyOf(jkVarArr[i15], i17));
            iArr3[i15] = (int[][]) Arrays.copyOf(iArr3[i15], i17);
            iArr6[i15] = veVarArr2[i15].zzc();
            i15++;
        }
        C7870kk kkVar3 = new C7870kk((C7834jk[]) Arrays.copyOf(jkVarArr[2], iArr2[2]));
        C8018ok[] e = mo34352e(veVarArr2, kkVarArr, iArr3);
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            if (this.f39878c.get(i18)) {
                e[i18] = null;
            } else {
                C7870kk kkVar4 = kkVarArr[i18];
                Map map = this.f39877b.get(i18);
                if (map == null) {
                    tkVar = null;
                } else {
                    tkVar = (C8194tk) map.get(kkVar4);
                }
                if (tkVar != null) {
                    throw null;
                }
            }
            i18++;
        }
        C8159sk skVar = new C8159sk(iArr6, kkVarArr, iArr4, iArr3, kkVar3);
        C8295we[] weVarArr = new C8295we[2];
        for (int i20 = 0; i20 < 2; i20++) {
            weVarArr[i20] = e[i20] != null ? C8295we.f40767b : null;
        }
        return new C8409zk(kkVar2, new C8301wk(e, (byte[]) null), skVar, weVarArr);
    }

    /* renamed from: b */
    public final void mo35196b(Object obj) {
        this.f39879d = (C8159sk) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C8018ok[] mo34352e(C8261ve[] veVarArr, C7870kk[] kkVarArr, int[][][] iArr) throws C7536be;

    /* renamed from: f */
    public final void mo35197f(int i, boolean z) {
        if (this.f39878c.get(i) != z) {
            this.f39878c.put(i, z);
            mo35942d();
        }
    }
}
