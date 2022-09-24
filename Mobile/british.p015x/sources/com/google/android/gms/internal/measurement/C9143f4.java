package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9143f4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9143f4 zza;
    private int zze;
    /* access modifiers changed from: private */
    public C9438y8 zzf = C9330r8.m43563v();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C9143f4 f4Var = new C9143f4();
        zza = f4Var;
        C9330r8.m43558o(C9143f4.class, f4Var);
    }

    private C9143f4() {
    }

    /* renamed from: D */
    public static C9128e4 m42844D() {
        return (C9128e4) zza.mo37996p();
    }

    /* renamed from: J */
    static /* synthetic */ void m42846J(C9143f4 f4Var, int i, C9204j4 j4Var) {
        j4Var.getClass();
        f4Var.m42854U();
        f4Var.zzf.set(i, j4Var);
    }

    /* renamed from: K */
    static /* synthetic */ void m42847K(C9143f4 f4Var, C9204j4 j4Var) {
        j4Var.getClass();
        f4Var.m42854U();
        f4Var.zzf.add(j4Var);
    }

    /* renamed from: L */
    static /* synthetic */ void m42848L(C9143f4 f4Var, Iterable iterable) {
        f4Var.m42854U();
        C9083b7.m42674i(iterable, f4Var.zzf);
    }

    /* renamed from: N */
    static /* synthetic */ void m42850N(C9143f4 f4Var, int i) {
        f4Var.m42854U();
        f4Var.zzf.remove(i);
    }

    /* renamed from: O */
    static /* synthetic */ void m42851O(C9143f4 f4Var, String str) {
        str.getClass();
        f4Var.zze |= 1;
        f4Var.zzg = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m42852P(C9143f4 f4Var, long j) {
        f4Var.zze |= 2;
        f4Var.zzh = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m42853Q(C9143f4 f4Var, long j) {
        f4Var.zze |= 4;
        f4Var.zzi = j;
    }

    /* renamed from: U */
    private final void m42854U() {
        C9438y8 y8Var = this.zzf;
        if (!y8Var.zzc()) {
            this.zzf = C9330r8.m43564w(y8Var);
        }
    }

    /* renamed from: A */
    public final int mo37551A() {
        return this.zzf.size();
    }

    /* renamed from: B */
    public final long mo37552B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final long mo37553C() {
        return this.zzh;
    }

    /* renamed from: G */
    public final C9204j4 mo37554G(int i) {
        return (C9204j4) this.zzf.get(i);
    }

    /* renamed from: H */
    public final String mo37555H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List mo37556I() {
        return this.zzf;
    }

    /* renamed from: R */
    public final boolean mo37557R() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: S */
    public final boolean mo37558S() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: T */
    public final boolean mo37559T() {
        return (this.zze & 2) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C9204j4.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C9143f4();
        } else {
            if (i2 == 4) {
                return new C9128e4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo37560z() {
        return this.zzj;
    }
}
