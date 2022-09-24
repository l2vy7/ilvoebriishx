package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9204j4 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9204j4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    /* access modifiers changed from: private */
    public C9438y8 zzk = C9330r8.m43563v();

    static {
        C9204j4 j4Var = new C9204j4();
        zza = j4Var;
        C9330r8.m43558o(C9204j4.class, j4Var);
    }

    private C9204j4() {
    }

    /* renamed from: D */
    public static C9189i4 m43050D() {
        return (C9189i4) zza.mo37996p();
    }

    /* renamed from: J */
    static /* synthetic */ void m43052J(C9204j4 j4Var, String str) {
        str.getClass();
        j4Var.zze |= 1;
        j4Var.zzf = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m43053K(C9204j4 j4Var, String str) {
        str.getClass();
        j4Var.zze |= 2;
        j4Var.zzg = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m43054L(C9204j4 j4Var) {
        j4Var.zze &= -3;
        j4Var.zzg = zza.zzg;
    }

    /* renamed from: M */
    static /* synthetic */ void m43055M(C9204j4 j4Var, long j) {
        j4Var.zze |= 4;
        j4Var.zzh = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m43056N(C9204j4 j4Var) {
        j4Var.zze &= -5;
        j4Var.zzh = 0;
    }

    /* renamed from: O */
    static /* synthetic */ void m43057O(C9204j4 j4Var, double d) {
        j4Var.zze |= 16;
        j4Var.zzj = d;
    }

    /* renamed from: P */
    static /* synthetic */ void m43058P(C9204j4 j4Var) {
        j4Var.zze &= -17;
        j4Var.zzj = 0.0d;
    }

    /* renamed from: Q */
    static /* synthetic */ void m43059Q(C9204j4 j4Var, C9204j4 j4Var2) {
        j4Var2.getClass();
        j4Var.m43062Y();
        j4Var.zzk.add(j4Var2);
    }

    /* renamed from: R */
    static /* synthetic */ void m43060R(C9204j4 j4Var, Iterable iterable) {
        j4Var.m43062Y();
        C9083b7.m42674i(iterable, j4Var.zzk);
    }

    /* renamed from: Y */
    private final void m43062Y() {
        C9438y8 y8Var = this.zzk;
        if (!y8Var.zzc()) {
            this.zzk = C9330r8.m43564w(y8Var);
        }
    }

    /* renamed from: A */
    public final float mo37661A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final int mo37662B() {
        return this.zzk.size();
    }

    /* renamed from: C */
    public final long mo37663C() {
        return this.zzh;
    }

    /* renamed from: G */
    public final String mo37664G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String mo37665H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List mo37666I() {
        return this.zzk;
    }

    /* renamed from: T */
    public final boolean mo37667T() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: U */
    public final boolean mo37668U() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: V */
    public final boolean mo37669V() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: W */
    public final boolean mo37670W() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: X */
    public final boolean mo37671X() {
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
            return C9330r8.m43557n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C9204j4.class});
        } else if (i2 == 3) {
            return new C9204j4();
        } else {
            if (i2 == 4) {
                return new C9189i4((C9404w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final double mo37672z() {
        return this.zzj;
    }
}
