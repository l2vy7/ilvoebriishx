package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.qk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8089qk extends C8230uk {

    /* renamed from: e */
    private final AtomicReference<C8053pk> f38159e = new AtomicReference<>(new C8053pk());

    public C8089qk(C8267vk vkVar) {
    }

    /* renamed from: g */
    protected static boolean m36495g(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: h */
    private static int m36496h(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C8018ok[] mo34352e(C8261ve[] veVarArr, C7870kk[] kkVarArr, int[][][] iArr) throws C7536be {
        C8125rk rkVar;
        C8125rk rkVar2;
        int[] iArr2;
        ArrayList arrayList;
        C7834jk jkVar;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3 = 2;
        C8018ok[] okVarArr = new C8018ok[2];
        C8053pk pkVar = this.f38159e.get();
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            int i5 = -1;
            int i6 = 1;
            if (i4 >= i3) {
                break;
            }
            if (veVarArr[i4].zzc() == i3) {
                if (!z3) {
                    C8261ve veVar = veVarArr[i4];
                    C7870kk kkVar = kkVarArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i7 = pkVar.f37689d;
                    int i8 = -1;
                    int i9 = 0;
                    C7834jk jkVar2 = null;
                    int i10 = 0;
                    int i11 = 0;
                    while (i9 < kkVar.f34352a) {
                        C7834jk b = kkVar.mo33100b(i9);
                        int i12 = b.f33907a;
                        ArrayList arrayList2 = new ArrayList(i6);
                        for (int i13 = 0; i13 <= 0; i13++) {
                            arrayList2.add(Integer.valueOf(i13));
                        }
                        int[] iArr4 = iArr3[i9];
                        int i14 = 0;
                        while (i14 <= 0) {
                            C7870kk kkVar2 = kkVar;
                            if (m36495g(iArr4[i14], true)) {
                                zzapg b2 = b.mo32903b(i14);
                                if (arrayList2.contains(Integer.valueOf(i14))) {
                                    int i15 = b2.f42874k;
                                    jkVar = b;
                                    z2 = true;
                                    z = true;
                                } else {
                                    jkVar = b;
                                    z2 = true;
                                    z = false;
                                }
                                if (z2 != z) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean g = m36495g(iArr4[i14], false);
                                if (g) {
                                    i += 1000;
                                }
                                boolean z4 = i > i11;
                                if (i == i11) {
                                    if (b2.mo36184a() != i8) {
                                        i2 = m36496h(b2.mo36184a(), i8);
                                    } else {
                                        i2 = m36496h(b2.f42866c, i5);
                                    }
                                    z4 = !g || !z ? i2 < 0 : i2 > 0;
                                }
                                if (z4) {
                                    i5 = b2.f42866c;
                                    i8 = b2.mo36184a();
                                    i11 = i;
                                    i10 = i14;
                                    jkVar2 = jkVar;
                                }
                            } else {
                                jkVar = b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i14++;
                            kkVar = kkVar2;
                            b = jkVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        C7870kk kkVar3 = kkVar;
                        i9++;
                        i6 = 1;
                    }
                    if (jkVar2 == null) {
                        rkVar2 = null;
                    } else {
                        rkVar2 = new C8125rk(jkVar2, i10, 0, (Object) null);
                    }
                    okVarArr[i4] = rkVar2;
                    z3 = rkVar2 != null;
                }
                int i16 = kkVarArr[i4].f34352a;
            }
            i4++;
            i3 = 2;
        }
        int i17 = 0;
        boolean z5 = false;
        while (i17 < i3) {
            if (veVarArr[i17].zzc() == 1 && !z5) {
                C7870kk kkVar4 = kkVarArr[i17];
                int[][] iArr5 = iArr[i17];
                String str = pkVar.f37686a;
                int i18 = 0;
                int i19 = 0;
                int i20 = -1;
                int i21 = -1;
                while (i18 < kkVar4.f34352a) {
                    C7834jk b3 = kkVar4.mo33100b(i18);
                    int[] iArr6 = iArr5[i18];
                    int i22 = i21;
                    int i23 = i20;
                    int i24 = i19;
                    int i25 = 0;
                    while (true) {
                        int i26 = b3.f33907a;
                        if (i25 > 0) {
                            break;
                        }
                        if (m36495g(iArr6[i25], true)) {
                            zzapg b4 = b3.mo32903b(i25);
                            int i27 = iArr6[i25];
                            int i28 = 1 != (b4.f42888y & 1) ? 1 : 2;
                            if (m36495g(i27, false)) {
                                i28 += 1000;
                            }
                            if (i28 > i24) {
                                i23 = i18;
                                i22 = i25;
                                i24 = i28;
                            }
                        }
                        i25++;
                    }
                    i18++;
                    i19 = i24;
                    i20 = i23;
                    i21 = i22;
                }
                if (i20 == -1) {
                    rkVar = null;
                } else {
                    rkVar = new C8125rk(kkVar4.mo33100b(i20), i21, 0, (Object) null);
                }
                okVarArr[i17] = rkVar;
                z5 = rkVar != null;
            }
            i17++;
            i3 = 2;
        }
        return okVarArr;
    }
}
