package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.vj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8266vj implements C8158sj, C8124rj {

    /* renamed from: b */
    public final C8158sj[] f40435b;

    /* renamed from: c */
    private final IdentityHashMap<C7649ek, Integer> f40436c = new IdentityHashMap<>();

    /* renamed from: d */
    private C8124rj f40437d;

    /* renamed from: e */
    private int f40438e;

    /* renamed from: f */
    private C7870kk f40439f;

    /* renamed from: g */
    private C8158sj[] f40440g;

    /* renamed from: h */
    private C7760hk f40441h;

    public C8266vj(C8158sj... sjVarArr) {
        this.f40435b = sjVarArr;
    }

    /* renamed from: a */
    public final boolean mo32146a(long j) {
        return this.f40441h.mo32146a(j);
    }

    /* renamed from: b */
    public final void mo33872b(C8158sj sjVar) {
        int i = this.f40438e - 1;
        this.f40438e = i;
        if (i <= 0) {
            int i2 = 0;
            for (C8158sj zzn : this.f40435b) {
                i2 += zzn.zzn().f34352a;
            }
            C7834jk[] jkVarArr = new C7834jk[i2];
            int i3 = 0;
            for (C8158sj zzn2 : this.f40435b) {
                C7870kk zzn3 = zzn2.zzn();
                int i4 = zzn3.f34352a;
                int i5 = 0;
                while (i5 < i4) {
                    jkVarArr[i3] = zzn3.mo33100b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f40439f = new C7870kk(jkVarArr);
            this.f40437d.mo33872b(this);
        }
    }

    /* renamed from: c */
    public final long mo33907c(C8018ok[] okVarArr, boolean[] zArr, C7649ek[] ekVarArr, boolean[] zArr2, long j) {
        int length;
        int i;
        C8018ok[] okVarArr2 = okVarArr;
        C7649ek[] ekVarArr2 = ekVarArr;
        int length2 = okVarArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = okVarArr2.length;
            if (i2 >= length) {
                break;
            }
            C7649ek ekVar = ekVarArr2[i2];
            if (ekVar == null) {
                i = -1;
            } else {
                i = this.f40436c.get(ekVar).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            C8018ok okVar = okVarArr2[i2];
            if (okVar != null) {
                C7834jk d = okVar.mo33932d();
                int i3 = 0;
                while (true) {
                    C8158sj[] sjVarArr = this.f40435b;
                    if (i3 >= sjVarArr.length) {
                        break;
                    } else if (sjVarArr[i3].zzn().mo33099a(d) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f40436c.clear();
        C7649ek[] ekVarArr3 = new C7649ek[length];
        C7649ek[] ekVarArr4 = new C7649ek[length];
        C8018ok[] okVarArr3 = new C8018ok[length];
        ArrayList arrayList = new ArrayList(this.f40435b.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f40435b.length) {
            for (int i5 = 0; i5 < okVarArr2.length; i5++) {
                C8018ok okVar2 = null;
                ekVarArr4[i5] = iArr[i5] == i4 ? ekVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    okVar2 = okVarArr2[i5];
                }
                okVarArr3[i5] = okVar2;
            }
            int i6 = i4;
            C8018ok[] okVarArr4 = okVarArr3;
            ArrayList arrayList2 = arrayList;
            long c = this.f40435b[i4].mo33907c(okVarArr3, zArr, ekVarArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = c;
            } else if (c != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < okVarArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    C8195tl.m37900e(ekVarArr4[i7] != null);
                    C7649ek ekVar2 = ekVarArr4[i7];
                    ekVarArr3[i7] = ekVar2;
                    this.f40436c.put(ekVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (ekVarArr4[i7] != null) {
                        z2 = false;
                    }
                    C8195tl.m37900e(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f40435b[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            okVarArr3 = okVarArr4;
            ekVarArr2 = ekVarArr;
        }
        C7649ek[] ekVarArr5 = ekVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ekVarArr3, 0, ekVarArr5, 0, length);
        C8158sj[] sjVarArr2 = new C8158sj[arrayList3.size()];
        this.f40440g = sjVarArr2;
        arrayList3.toArray(sjVarArr2);
        this.f40441h = new C7722gj(this.f40440g);
        return j2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo31883d(C7760hk hkVar) {
        C8158sj sjVar = (C8158sj) hkVar;
        if (this.f40439f != null) {
            this.f40437d.mo31883d(this);
        }
    }

    /* renamed from: f */
    public final void mo33908f(long j) {
        for (C8158sj f : this.f40440g) {
            f.mo33908f(j);
        }
    }

    /* renamed from: i */
    public final long mo33911i(long j) {
        long i = this.f40440g[0].mo33911i(j);
        int i2 = 1;
        while (true) {
            C8158sj[] sjVarArr = this.f40440g;
            if (i2 >= sjVarArr.length) {
                return i;
            }
            if (sjVarArr[i2].mo33911i(i) == i) {
                i2++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    /* renamed from: k */
    public final void mo33912k(C8124rj rjVar, long j) {
        this.f40437d = rjVar;
        this.f40438e = r0;
        for (C8158sj k : this.f40435b) {
            k.mo33912k(this, j);
        }
    }

    public final long zza() {
        return this.f40441h.zza();
    }

    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (C8158sj zzg : this.f40440g) {
            long zzg2 = zzg.zzg();
            if (zzg2 != Long.MIN_VALUE) {
                j = Math.min(j, zzg2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzh() {
        long zzh = this.f40435b[0].zzh();
        int i = 1;
        while (true) {
            C8158sj[] sjVarArr = this.f40435b;
            if (i >= sjVarArr.length) {
                if (zzh != C6540C.TIME_UNSET) {
                    C8158sj[] sjVarArr2 = this.f40440g;
                    int length = sjVarArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C8158sj sjVar = sjVarArr2[i2];
                        if (sjVar == this.f40435b[0] || sjVar.mo33911i(zzh) == zzh) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (sjVarArr[i].zzh() == C6540C.TIME_UNSET) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final C7870kk zzn() {
        return this.f40439f;
    }

    public final void zzs() throws IOException {
        for (C8158sj zzs : this.f40435b) {
            zzs.zzs();
        }
    }
}
