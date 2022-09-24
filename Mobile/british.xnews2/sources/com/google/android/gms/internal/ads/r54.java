package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r54 implements b54, a54 {

    /* renamed from: b */
    private final b54[] f38546b;

    /* renamed from: c */
    private final IdentityHashMap<r64, Integer> f38547c;

    /* renamed from: d */
    private final ArrayList<b54> f38548d = new ArrayList<>();

    /* renamed from: e */
    private a54 f38549e;

    /* renamed from: f */
    private cm0 f38550f;

    /* renamed from: g */
    private b54[] f38551g;

    /* renamed from: h */
    private t64 f38552h;

    /* renamed from: i */
    private final p44 f38553i;

    public r54(p44 p44, long[] jArr, b54[] b54Arr, byte... bArr) {
        this.f38553i = p44;
        this.f38546b = b54Arr;
        this.f38552h = new o44(new t64[0]);
        this.f38547c = new IdentityHashMap<>();
        this.f38551g = new b54[0];
        for (int i = 0; i < b54Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f38546b[i] = new p54(b54Arr[i], j);
            }
        }
    }

    /* renamed from: a */
    public final long mo18199a(long j) {
        long a = this.f38551g[0].mo18199a(j);
        int i = 1;
        while (true) {
            b54[] b54Arr = this.f38551g;
            if (i >= b54Arr.length) {
                return a;
            }
            if (b54Arr[i].mo18199a(a) == a) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo18200b(long j) {
        if (this.f38548d.isEmpty()) {
            return this.f38552h.mo18200b(j);
        }
        int size = this.f38548d.size();
        for (int i = 0; i < size; i++) {
            this.f38548d.get(i).mo18200b(j);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo18201c(long j) {
        this.f38552h.mo18201c(j);
    }

    /* renamed from: d */
    public final void mo30309d(b54 b54) {
        this.f38548d.remove(b54);
        if (this.f38548d.isEmpty()) {
            int i = 0;
            for (b54 zzf : this.f38546b) {
                i += zzf.zzf().f30418a;
            }
            ck0[] ck0Arr = new ck0[i];
            int i2 = 0;
            for (b54 zzf2 : this.f38546b) {
                cm0 zzf3 = zzf2.zzf();
                int i3 = zzf3.f30418a;
                int i4 = 0;
                while (i4 < i3) {
                    ck0Arr[i2] = zzf3.mo30958b(i4);
                    i4++;
                    i2++;
                }
            }
            this.f38550f = new cm0(ck0Arr);
            a54 a54 = this.f38549e;
            Objects.requireNonNull(a54);
            a54.mo30309d(this);
        }
    }

    /* renamed from: e */
    public final long mo18203e(e74[] e74Arr, boolean[] zArr, r64[] r64Arr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int i;
        e74[] e74Arr2 = e74Arr;
        r64[] r64Arr2 = r64Arr;
        int length2 = e74Arr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = e74Arr2.length;
            if (i2 >= length) {
                break;
            }
            r64 r64 = r64Arr2[i2];
            if (r64 == null) {
                num = null;
            } else {
                num = this.f38547c.get(r64);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            e74 e74 = e74Arr2[i2];
            if (e74 != null) {
                ck0 d = e74.mo31497d();
                int i3 = 0;
                while (true) {
                    b54[] b54Arr = this.f38546b;
                    if (i3 >= b54Arr.length) {
                        break;
                    } else if (b54Arr[i3].zzf().mo30957a(d) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f38547c.clear();
        r64[] r64Arr3 = new r64[length];
        r64[] r64Arr4 = new r64[length];
        e74[] e74Arr3 = new e74[length];
        ArrayList arrayList = new ArrayList(this.f38546b.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f38546b.length) {
            for (int i5 = 0; i5 < e74Arr2.length; i5++) {
                r64Arr4[i5] = iArr[i5] == i4 ? r64Arr2[i5] : null;
                e74Arr3[i5] = iArr2[i5] == i4 ? e74Arr2[i5] : null;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            r64[] r64Arr5 = r64Arr4;
            e74[] e74Arr4 = e74Arr3;
            long e = this.f38546b[i4].mo18203e(e74Arr3, zArr, r64Arr4, zArr2, j2);
            if (i6 == 0) {
                j2 = e;
            } else if (e != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < e74Arr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    r64 r642 = r64Arr5[i7];
                    Objects.requireNonNull(r642);
                    r64Arr3[i7] = r642;
                    this.f38547c.put(r642, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (r64Arr5[i7] != null) {
                        z2 = false;
                    }
                    nu1.m20747f(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f38546b[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            r64Arr4 = r64Arr5;
            e74Arr3 = e74Arr4;
        }
        System.arraycopy(r64Arr3, 0, r64Arr2, 0, length);
        b54[] b54Arr2 = (b54[]) arrayList.toArray(new b54[0]);
        this.f38551g = b54Arr2;
        this.f38552h = new o44(b54Arr2);
        return j2;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo32848f(t64 t64) {
        b54 b54 = (b54) t64;
        a54 a54 = this.f38549e;
        Objects.requireNonNull(a54);
        a54.mo32848f(this);
    }

    /* renamed from: g */
    public final long mo18205g(long j, kx3 kx3) {
        b54 b54;
        b54[] b54Arr = this.f38551g;
        if (b54Arr.length > 0) {
            b54 = b54Arr[0];
        } else {
            b54 = this.f38546b[0];
        }
        return b54.mo18205g(j, kx3);
    }

    /* renamed from: h */
    public final b54 mo34506h(int i) {
        b54 b54 = this.f38546b[i];
        return b54 instanceof p54 ? ((p54) b54).f37339b : b54;
    }

    /* renamed from: i */
    public final void mo18207i(long j, boolean z) {
        for (b54 i : this.f38551g) {
            i.mo18207i(j, false);
        }
    }

    /* renamed from: k */
    public final void mo18209k(a54 a54, long j) {
        this.f38549e = a54;
        Collections.addAll(this.f38548d, this.f38546b);
        for (b54 k : this.f38546b) {
            k.mo18209k(this, j);
        }
    }

    public final long zzb() {
        return this.f38552h.zzb();
    }

    public final long zzc() {
        return this.f38552h.zzc();
    }

    public final long zzd() {
        long j = -9223372036854775807L;
        for (b54 b54 : this.f38551g) {
            long zzd = b54.zzd();
            if (zzd != C6540C.TIME_UNSET) {
                if (j == C6540C.TIME_UNSET) {
                    b54[] b54Arr = this.f38551g;
                    int length = b54Arr.length;
                    int i = 0;
                    while (i < length) {
                        b54 b542 = b54Arr[i];
                        if (b542 == b54) {
                            break;
                        } else if (b542.mo18199a(zzd) == zzd) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == C6540C.TIME_UNSET || b54.mo18199a(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final cm0 zzf() {
        cm0 cm0 = this.f38550f;
        Objects.requireNonNull(cm0);
        return cm0;
    }

    public final void zzj() throws IOException {
        for (b54 zzj : this.f38546b) {
            zzj.zzj();
        }
    }

    public final boolean zzo() {
        return this.f38552h.zzo();
    }
}
