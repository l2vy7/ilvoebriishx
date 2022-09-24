package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p54 implements b54, a54 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final b54 f37339b;

    /* renamed from: c */
    private final long f37340c;

    /* renamed from: d */
    private a54 f37341d;

    public p54(b54 b54, long j) {
        this.f37339b = b54;
        this.f37340c = j;
    }

    /* renamed from: a */
    public final long mo18199a(long j) {
        return this.f37339b.mo18199a(j - this.f37340c) + this.f37340c;
    }

    /* renamed from: b */
    public final boolean mo18200b(long j) {
        return this.f37339b.mo18200b(j - this.f37340c);
    }

    /* renamed from: c */
    public final void mo18201c(long j) {
        this.f37339b.mo18201c(j - this.f37340c);
    }

    /* renamed from: d */
    public final void mo30309d(b54 b54) {
        a54 a54 = this.f37341d;
        Objects.requireNonNull(a54);
        a54.mo30309d(this);
    }

    /* renamed from: e */
    public final long mo18203e(e74[] e74Arr, boolean[] zArr, r64[] r64Arr, boolean[] zArr2, long j) {
        r64[] r64Arr2 = r64Arr;
        r64[] r64Arr3 = new r64[r64Arr2.length];
        int i = 0;
        while (true) {
            r64 r64 = null;
            if (i >= r64Arr2.length) {
                break;
            }
            q54 q54 = (q54) r64Arr2[i];
            if (q54 != null) {
                r64 = q54.mo34235c();
            }
            r64Arr3[i] = r64;
            i++;
        }
        long e = this.f37339b.mo18203e(e74Arr, zArr, r64Arr3, zArr2, j - this.f37340c);
        for (int i2 = 0; i2 < r64Arr2.length; i2++) {
            r64 r642 = r64Arr3[i2];
            if (r642 == null) {
                r64Arr2[i2] = null;
            } else {
                r64 r643 = r64Arr2[i2];
                if (r643 == null || ((q54) r643).mo34235c() != r642) {
                    r64Arr2[i2] = new q54(r642, this.f37340c);
                }
            }
        }
        return e + this.f37340c;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo32848f(t64 t64) {
        b54 b54 = (b54) t64;
        a54 a54 = this.f37341d;
        Objects.requireNonNull(a54);
        a54.mo32848f(this);
    }

    /* renamed from: g */
    public final long mo18205g(long j, kx3 kx3) {
        return this.f37339b.mo18205g(j - this.f37340c, kx3) + this.f37340c;
    }

    /* renamed from: i */
    public final void mo18207i(long j, boolean z) {
        this.f37339b.mo18207i(j - this.f37340c, false);
    }

    /* renamed from: k */
    public final void mo18209k(a54 a54, long j) {
        this.f37341d = a54;
        this.f37339b.mo18209k(this, j - this.f37340c);
    }

    public final long zzb() {
        long zzb = this.f37339b.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.f37340c;
    }

    public final long zzc() {
        long zzc = this.f37339b.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.f37340c;
    }

    public final long zzd() {
        long zzd = this.f37339b.zzd();
        return zzd == C6540C.TIME_UNSET ? C6540C.TIME_UNSET : zzd + this.f37340c;
    }

    public final cm0 zzf() {
        return this.f37339b.zzf();
    }

    public final void zzj() throws IOException {
        this.f37339b.zzj();
    }

    public final boolean zzo() {
        return this.f37339b.zzo();
    }
}
