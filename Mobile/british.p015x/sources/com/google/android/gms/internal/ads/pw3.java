package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pw3 {

    /* renamed from: a */
    public final b54 f37781a;

    /* renamed from: b */
    public final Object f37782b;

    /* renamed from: c */
    public final r64[] f37783c;

    /* renamed from: d */
    public boolean f37784d;

    /* renamed from: e */
    public boolean f37785e;

    /* renamed from: f */
    public qw3 f37786f;

    /* renamed from: g */
    public boolean f37787g;

    /* renamed from: h */
    private final boolean[] f37788h;

    /* renamed from: i */
    private final ix3[] f37789i;

    /* renamed from: j */
    private final y74 f37790j;

    /* renamed from: k */
    private final ax3 f37791k;

    /* renamed from: l */
    private pw3 f37792l;

    /* renamed from: m */
    private cm0 f37793m = cm0.f30416d;

    /* renamed from: n */
    private z74 f37794n;

    /* renamed from: o */
    private long f37795o;

    public pw3(ix3[] ix3Arr, long j, y74 y74, o84 o84, ax3 ax3, qw3 qw3, z74 z74, byte[] bArr) {
        qw3 qw32 = qw3;
        this.f37789i = ix3Arr;
        this.f37795o = j;
        this.f37790j = y74;
        this.f37791k = ax3;
        c54 c54 = qw32.f38301a;
        this.f37782b = c54.f34474a;
        this.f37786f = qw32;
        this.f37794n = z74;
        this.f37783c = new r64[2];
        this.f37788h = new boolean[2];
        long j2 = qw32.f38302b;
        long j3 = qw32.f38304d;
        o84 o842 = o84;
        b54 o = ax3.mo30567o(c54, o84, j2);
        this.f37781a = j3 != C6540C.TIME_UNSET ? new j44(o, true, 0, j3) : o;
    }

    /* renamed from: s */
    private final void m36220s() {
        if (m36222u()) {
            int i = 0;
            while (true) {
                z74 z74 = this.f37794n;
                if (i < z74.f42337a) {
                    z74.mo36021b(i);
                    e74 e74 = this.f37794n.f42341e[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private final void m36221t() {
        if (m36222u()) {
            int i = 0;
            while (true) {
                z74 z74 = this.f37794n;
                if (i < z74.f42337a) {
                    z74.mo36021b(i);
                    e74 e74 = this.f37794n.f42341e[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final boolean m36222u() {
        return this.f37792l == null;
    }

    /* renamed from: a */
    public final long mo34194a(z74 z74, long j, boolean z) {
        return mo34195b(z74, j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo34195b(z74 z74, long j, boolean z, boolean[] zArr) {
        z74 z742 = z74;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= z742.f42337a) {
                break;
            }
            boolean[] zArr2 = this.f37788h;
            if (z || !z74.mo36020a(this.f37794n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            ix3[] ix3Arr = this.f37789i;
            if (i2 >= 2) {
                break;
            }
            ix3Arr[i2].zzb();
            i2++;
        }
        m36220s();
        this.f37794n = z742;
        m36221t();
        long e = this.f37781a.mo18203e(z742.f42341e, this.f37788h, this.f37783c, zArr, j);
        int i3 = 0;
        while (true) {
            ix3[] ix3Arr2 = this.f37789i;
            if (i3 >= 2) {
                break;
            }
            ix3Arr2[i3].zzb();
            i3++;
        }
        this.f37785e = false;
        int i4 = 0;
        while (true) {
            r64[] r64Arr = this.f37783c;
            if (i4 >= 2) {
                return e;
            }
            if (r64Arr[i4] != null) {
                nu1.m20747f(z74.mo36021b(i4));
                this.f37789i[i4].zzb();
                this.f37785e = true;
            } else {
                nu1.m20747f(z742.f42341e[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final long mo34196c() {
        if (!this.f37784d) {
            return this.f37786f.f38302b;
        }
        long zzb = this.f37785e ? this.f37781a.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.f37786f.f38305e : zzb;
    }

    /* renamed from: d */
    public final long mo34197d() {
        if (!this.f37784d) {
            return 0;
        }
        return this.f37781a.zzc();
    }

    /* renamed from: e */
    public final long mo34198e() {
        return this.f37795o;
    }

    /* renamed from: f */
    public final long mo34199f() {
        return this.f37786f.f38302b + this.f37795o;
    }

    /* renamed from: g */
    public final cm0 mo34200g() {
        return this.f37793m;
    }

    /* renamed from: h */
    public final pw3 mo34201h() {
        return this.f37792l;
    }

    /* renamed from: i */
    public final z74 mo34202i() {
        return this.f37794n;
    }

    /* renamed from: j */
    public final z74 mo34203j(float f, gi0 gi0) throws vk3 {
        z74 a = this.f37790j.mo35588a(this.f37789i, this.f37793m, this.f37786f.f38301a, gi0);
        for (e74 e74 : a.f42341e) {
        }
        return a;
    }

    /* renamed from: k */
    public final void mo34204k(long j) {
        nu1.m20747f(m36222u());
        this.f37781a.mo18200b(j - this.f37795o);
    }

    /* renamed from: l */
    public final void mo34205l(float f, gi0 gi0) throws vk3 {
        this.f37784d = true;
        this.f37793m = this.f37781a.zzf();
        z74 j = mo34203j(f, gi0);
        qw3 qw3 = this.f37786f;
        long j2 = qw3.f38302b;
        long j3 = qw3.f38305e;
        if (j3 != C6540C.TIME_UNSET && j2 >= j3) {
            j2 = Math.max(0, j3 - 1);
        }
        long a = mo34194a(j, j2, false);
        long j4 = this.f37795o;
        qw3 qw32 = this.f37786f;
        this.f37795o = j4 + (qw32.f38302b - a);
        this.f37786f = qw32.mo34422b(a);
    }

    /* renamed from: m */
    public final void mo34206m(long j) {
        nu1.m20747f(m36222u());
        if (this.f37784d) {
            this.f37781a.mo18201c(j - this.f37795o);
        }
    }

    /* renamed from: n */
    public final void mo34207n() {
        m36220s();
        ax3 ax3 = this.f37791k;
        b54 b54 = this.f37781a;
        try {
            if (b54 instanceof j44) {
                ax3.mo30560h(((j44) b54).f33768b);
            } else {
                ax3.mo30560h(b54);
            }
        } catch (RuntimeException e) {
            fc2.m20475a("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: o */
    public final void mo34208o(pw3 pw3) {
        if (pw3 != this.f37792l) {
            m36220s();
            this.f37792l = pw3;
            m36221t();
        }
    }

    /* renamed from: p */
    public final void mo34209p(long j) {
        this.f37795o = 0;
    }

    /* renamed from: q */
    public final void mo34210q() {
        b54 b54 = this.f37781a;
        if (b54 instanceof j44) {
            long j = this.f37786f.f38304d;
            if (j == C6540C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((j44) b54).mo32849h(0, j);
        }
    }

    /* renamed from: r */
    public final boolean mo34211r() {
        return this.f37784d && (!this.f37785e || this.f37781a.zzb() == Long.MIN_VALUE);
    }
}
