package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v44 implements b54, a54 {

    /* renamed from: b */
    public final c54 f40300b;

    /* renamed from: c */
    private final long f40301c;

    /* renamed from: d */
    private f54 f40302d;

    /* renamed from: e */
    private b54 f40303e;

    /* renamed from: f */
    private a54 f40304f;

    /* renamed from: g */
    private long f40305g = C6540C.TIME_UNSET;

    /* renamed from: h */
    private final o84 f40306h;

    public v44(c54 c54, o84 o84, long j, byte[] bArr) {
        this.f40300b = c54;
        this.f40306h = o84;
        this.f40301c = j;
    }

    /* renamed from: p */
    private final long m38712p(long j) {
        long j2 = this.f40305g;
        return j2 != C6540C.TIME_UNSET ? j2 : j;
    }

    /* renamed from: a */
    public final long mo18199a(long j) {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        return b54.mo18199a(j);
    }

    /* renamed from: b */
    public final boolean mo18200b(long j) {
        b54 b54 = this.f40303e;
        return b54 != null && b54.mo18200b(j);
    }

    /* renamed from: c */
    public final void mo18201c(long j) {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        b54.mo18201c(j);
    }

    /* renamed from: d */
    public final void mo30309d(b54 b54) {
        a54 a54 = this.f40304f;
        int i = d13.f20195a;
        a54.mo30309d(this);
    }

    /* renamed from: e */
    public final long mo18203e(e74[] e74Arr, boolean[] zArr, r64[] r64Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f40305g;
        if (j3 == C6540C.TIME_UNSET || j != this.f40301c) {
            j2 = j;
        } else {
            this.f40305g = C6540C.TIME_UNSET;
            j2 = j3;
        }
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        return b54.mo18203e(e74Arr, zArr, r64Arr, zArr2, j2);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo32848f(t64 t64) {
        b54 b54 = (b54) t64;
        a54 a54 = this.f40304f;
        int i = d13.f20195a;
        a54.mo32848f(this);
    }

    /* renamed from: g */
    public final long mo18205g(long j, kx3 kx3) {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        return b54.mo18205g(j, kx3);
    }

    /* renamed from: h */
    public final long mo35368h() {
        return this.f40305g;
    }

    /* renamed from: i */
    public final void mo18207i(long j, boolean z) {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        b54.mo18207i(j, false);
    }

    /* renamed from: j */
    public final long mo35369j() {
        return this.f40301c;
    }

    /* renamed from: k */
    public final void mo18209k(a54 a54, long j) {
        this.f40304f = a54;
        b54 b54 = this.f40303e;
        if (b54 != null) {
            b54.mo18209k(this, m38712p(this.f40301c));
        }
    }

    /* renamed from: l */
    public final void mo35370l(c54 c54) {
        long p = m38712p(this.f40301c);
        f54 f54 = this.f40302d;
        Objects.requireNonNull(f54);
        b54 k = f54.mo18988k(c54, this.f40306h, p);
        this.f40303e = k;
        if (this.f40304f != null) {
            k.mo18209k(this, p);
        }
    }

    /* renamed from: m */
    public final void mo35371m(long j) {
        this.f40305g = j;
    }

    /* renamed from: n */
    public final void mo35372n() {
        b54 b54 = this.f40303e;
        if (b54 != null) {
            f54 f54 = this.f40302d;
            Objects.requireNonNull(f54);
            f54.mo18987g(b54);
        }
    }

    /* renamed from: o */
    public final void mo35373o(f54 f54) {
        nu1.m20747f(this.f40302d == null);
        this.f40302d = f54;
    }

    public final long zzb() {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        return b54.zzb();
    }

    public final long zzc() {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        return b54.zzc();
    }

    public final long zzd() {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        return b54.zzd();
    }

    public final cm0 zzf() {
        b54 b54 = this.f40303e;
        int i = d13.f20195a;
        return b54.zzf();
    }

    public final void zzj() throws IOException {
        try {
            b54 b54 = this.f40303e;
            if (b54 != null) {
                b54.zzj();
                return;
            }
            f54 f54 = this.f40302d;
            if (f54 != null) {
                f54.zzv();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public final boolean zzo() {
        b54 b54 = this.f40303e;
        return b54 != null && b54.zzo();
    }
}
