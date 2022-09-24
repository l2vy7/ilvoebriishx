package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9389v4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9389v4 zza;
    /* access modifiers changed from: private */
    public C9423x8 zze = C9330r8.m43561t();
    /* access modifiers changed from: private */
    public C9423x8 zzf = C9330r8.m43561t();
    private C9438y8 zzg = C9330r8.m43563v();
    private C9438y8 zzh = C9330r8.m43563v();

    static {
        C9389v4 v4Var = new C9389v4();
        zza = v4Var;
        C9330r8.m43558o(C9389v4.class, v4Var);
    }

    private C9389v4() {
    }

    /* renamed from: F */
    public static C9374u4 m43730F() {
        return (C9374u4) zza.mo37996p();
    }

    /* renamed from: H */
    public static C9389v4 m43732H() {
        return zza;
    }

    /* renamed from: N */
    static /* synthetic */ void m43733N(C9389v4 v4Var, Iterable iterable) {
        C9423x8 x8Var = v4Var.zze;
        if (!x8Var.zzc()) {
            v4Var.zze = C9330r8.m43562u(x8Var);
        }
        C9083b7.m42674i(iterable, v4Var.zze);
    }

    /* renamed from: P */
    static /* synthetic */ void m43735P(C9389v4 v4Var, Iterable iterable) {
        C9423x8 x8Var = v4Var.zzf;
        if (!x8Var.zzc()) {
            v4Var.zzf = C9330r8.m43562u(x8Var);
        }
        C9083b7.m42674i(iterable, v4Var.zzf);
    }

    /* renamed from: R */
    static /* synthetic */ void m43737R(C9389v4 v4Var, Iterable iterable) {
        v4Var.m43741V();
        C9083b7.m42674i(iterable, v4Var.zzg);
    }

    /* renamed from: S */
    static /* synthetic */ void m43738S(C9389v4 v4Var, int i) {
        v4Var.m43741V();
        v4Var.zzg.remove(i);
    }

    /* renamed from: T */
    static /* synthetic */ void m43739T(C9389v4 v4Var, Iterable iterable) {
        v4Var.m43742W();
        C9083b7.m42674i(iterable, v4Var.zzh);
    }

    /* renamed from: U */
    static /* synthetic */ void m43740U(C9389v4 v4Var, int i) {
        v4Var.m43742W();
        v4Var.zzh.remove(i);
    }

    /* renamed from: V */
    private final void m43741V() {
        C9438y8 y8Var = this.zzg;
        if (!y8Var.zzc()) {
            this.zzg = C9330r8.m43564w(y8Var);
        }
    }

    /* renamed from: W */
    private final void m43742W() {
        C9438y8 y8Var = this.zzh;
        if (!y8Var.zzc()) {
            this.zzh = C9330r8.m43564w(y8Var);
        }
    }

    /* renamed from: A */
    public final int mo38103A() {
        return this.zzf.size();
    }

    /* renamed from: B */
    public final int mo38104B() {
        return this.zzh.size();
    }

    /* renamed from: C */
    public final int mo38105C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final C9112d4 mo38106D(int i) {
        return (C9112d4) this.zzg.get(i);
    }

    /* renamed from: I */
    public final C9420x4 mo38107I(int i) {
        return (C9420x4) this.zzh.get(i);
    }

    /* renamed from: J */
    public final List mo38108J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final List mo38109K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final List mo38110L() {
        return this.zzh;
    }

    /* renamed from: M */
    public final List mo38111M() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C9112d4.class, "zzh", C9420x4.class});
        } else if (i2 == 3) {
            return new C9389v4();
        } else {
            if (i2 == 4) {
                return new C9374u4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo38112z() {
        return this.zzg.size();
    }
}
