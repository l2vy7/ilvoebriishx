package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class lb3 implements hx3, ix3 {

    /* renamed from: b */
    private final int f34971b;

    /* renamed from: c */
    private final mw3 f34972c = new mw3();

    /* renamed from: d */
    private jx3 f34973d;

    /* renamed from: e */
    private int f34974e;

    /* renamed from: f */
    private int f34975f;

    /* renamed from: g */
    private r64 f34976g;

    /* renamed from: h */
    private C8281w[] f34977h;

    /* renamed from: i */
    private long f34978i;

    /* renamed from: j */
    private long f34979j = Long.MIN_VALUE;

    /* renamed from: k */
    private boolean f34980k;

    /* renamed from: l */
    private boolean f34981l;

    public lb3(int i) {
        this.f34971b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo33297A() throws vk3 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo33298B() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo33244C(C8281w[] wVarArr, long j, long j2) throws vk3;

    /* renamed from: a */
    public final void mo32472a(int i) {
        this.f34974e = i;
    }

    /* renamed from: b */
    public final boolean mo32473b() {
        return this.f34979j == Long.MIN_VALUE;
    }

    /* renamed from: c */
    public /* synthetic */ void mo32474c(float f, float f2) {
    }

    /* renamed from: d */
    public final void mo32475d() {
        nu1.m20747f(this.f34975f == 0);
        mw3 mw3 = this.f34972c;
        mw3.f35637b = null;
        mw3.f35636a = null;
        mo33277z();
    }

    /* renamed from: e */
    public final void mo32476e(C8281w[] wVarArr, r64 r64, long j, long j2) throws vk3 {
        nu1.m20747f(!this.f34980k);
        this.f34976g = r64;
        if (this.f34979j == Long.MIN_VALUE) {
            this.f34979j = j;
        }
        this.f34977h = wVarArr;
        this.f34978i = j2;
        mo33244C(wVarArr, j, j2);
    }

    /* renamed from: f */
    public final void mo32477f() throws vk3 {
        boolean z = true;
        if (this.f34975f != 1) {
            z = false;
        }
        nu1.m20747f(z);
        this.f34975f = 2;
        mo33297A();
    }

    /* renamed from: h */
    public final void mo32479h(long j) throws vk3 {
        this.f34980k = false;
        this.f34979j = j;
        mo33276y(j, false);
    }

    /* renamed from: j */
    public void mo31428j(int i, Object obj) throws vk3 {
    }

    /* renamed from: k */
    public final void mo32480k(jx3 jx3, C8281w[] wVarArr, r64 r64, long j, boolean z, boolean z2, long j2, long j3) throws vk3 {
        boolean z3 = z;
        nu1.m20747f(this.f34975f == 0);
        this.f34973d = jx3;
        this.f34975f = 1;
        mo33275x(z, z2);
        mo32476e(wVarArr, r64, j2, j3);
        long j4 = j;
        mo33276y(j, z);
    }

    /* renamed from: l */
    public final int mo32481l() {
        return this.f34975f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo33299m() {
        if (mo32473b()) {
            return this.f34980k;
        }
        r64 r64 = this.f34976g;
        Objects.requireNonNull(r64);
        return r64.zze();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C8281w[] mo33300n() {
        C8281w[] wVarArr = this.f34977h;
        Objects.requireNonNull(wVarArr);
        return wVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo33301o(mw3 mw3, s51 s51, int i) {
        r64 r64 = this.f34976g;
        Objects.requireNonNull(r64);
        int b = r64.mo30315b(mw3, s51, i);
        if (b == -4) {
            if (s51.mo33441g()) {
                this.f34979j = Long.MIN_VALUE;
                return this.f34980k ? -4 : -3;
            }
            long j = s51.f20812e + this.f34978i;
            s51.f20812e = j;
            this.f34979j = Math.max(this.f34979j, j);
        } else if (b == -5) {
            C8281w wVar = mw3.f35636a;
            Objects.requireNonNull(wVar);
            if (wVar.f40623p != Long.MAX_VALUE) {
                ge4 b2 = wVar.mo35521b();
                b2.mo32097w(wVar.f40623p + this.f34978i);
                mw3.f35636a = b2.mo32099y();
                return -5;
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final vk3 mo33302p(Throwable th, C8281w wVar, boolean z, int i) {
        int i2;
        if (wVar != null && !this.f34981l) {
            this.f34981l = true;
            try {
                int i3 = mo32801i(wVar) & 7;
                this.f34981l = false;
                i2 = i3;
            } catch (vk3 unused) {
                this.f34981l = false;
            } catch (Throwable th2) {
                this.f34981l = false;
                throw th2;
            }
            return vk3.m38831b(th, zzJ(), this.f34974e, wVar, i2, z, i);
        }
        i2 = 4;
        return vk3.m38831b(th, zzJ(), this.f34974e, wVar, i2, z, i);
    }

    /* renamed from: q */
    public final boolean mo32482q() {
        return this.f34980k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo33303s(long j) {
        r64 r64 = this.f34976g;
        Objects.requireNonNull(r64);
        return r64.mo30314a(j - this.f34978i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final mw3 mo33304t() {
        mw3 mw3 = this.f34972c;
        mw3.f35637b = null;
        mw3.f35636a = null;
        return mw3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final jx3 mo33305v() {
        jx3 jx3 = this.f34973d;
        Objects.requireNonNull(jx3);
        return jx3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo33274w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo33275x(boolean z, boolean z2) throws vk3 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo33276y(long j, boolean z) throws vk3;

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo33277z() {
    }

    public final void zzA() {
        this.f34980k = true;
    }

    public final void zzE() {
        nu1.m20747f(this.f34975f == 2);
        this.f34975f = 1;
        mo33298B();
    }

    public final int zzb() {
        return this.f34971b;
    }

    public int zze() throws vk3 {
        return 0;
    }

    public final long zzf() {
        return this.f34979j;
    }

    public ow3 zzi() {
        return null;
    }

    public final ix3 zzj() {
        return this;
    }

    public final r64 zzl() {
        return this.f34976g;
    }

    public final void zzm() {
        boolean z = true;
        if (this.f34975f != 1) {
            z = false;
        }
        nu1.m20747f(z);
        mw3 mw3 = this.f34972c;
        mw3.f35637b = null;
        mw3.f35636a = null;
        this.f34975f = 0;
        this.f34976g = null;
        this.f34977h = null;
        this.f34980k = false;
        mo33274w();
    }

    public final void zzp() throws IOException {
        r64 r64 = this.f34976g;
        Objects.requireNonNull(r64);
        r64.zzd();
    }
}
