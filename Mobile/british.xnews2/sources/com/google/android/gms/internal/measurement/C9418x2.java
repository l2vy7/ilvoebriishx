package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9418x2 extends C9330r8 implements C9424x9 {
    /* access modifiers changed from: private */
    public static final C9418x2 zza;
    private int zze;
    private int zzf;
    private C9438y8 zzg = C9330r8.m43563v();
    private C9438y8 zzh = C9330r8.m43563v();
    private boolean zzi;
    private boolean zzj;

    static {
        C9418x2 x2Var = new C9418x2();
        zza = x2Var;
        C9330r8.m43558o(C9418x2.class, x2Var);
    }

    private C9418x2() {
    }

    /* renamed from: I */
    static /* synthetic */ void m43796I(C9418x2 x2Var, int i, C9188i3 i3Var) {
        i3Var.getClass();
        C9438y8 y8Var = x2Var.zzg;
        if (!y8Var.zzc()) {
            x2Var.zzg = C9330r8.m43564w(y8Var);
        }
        x2Var.zzg.set(i, i3Var);
    }

    /* renamed from: J */
    static /* synthetic */ void m43797J(C9418x2 x2Var, int i, C9447z2 z2Var) {
        z2Var.getClass();
        C9438y8 y8Var = x2Var.zzh;
        if (!y8Var.zzc()) {
            x2Var.zzh = C9330r8.m43564w(y8Var);
        }
        x2Var.zzh.set(i, z2Var);
    }

    /* renamed from: A */
    public final int mo38135A() {
        return this.zzh.size();
    }

    /* renamed from: B */
    public final int mo38136B() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final C9447z2 mo38137D(int i) {
        return (C9447z2) this.zzh.get(i);
    }

    /* renamed from: F */
    public final C9188i3 mo38138F(int i) {
        return (C9188i3) this.zzg.get(i);
    }

    /* renamed from: G */
    public final List mo38139G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final List mo38140H() {
        return this.zzg;
    }

    /* renamed from: K */
    public final boolean mo38141K() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object mo37393y(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C9330r8.m43557n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C9188i3.class, "zzh", C9447z2.class, "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C9418x2();
        } else {
            if (i2 == 4) {
                return new C9403w2((C9387v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final int mo38142z() {
        return this.zzf;
    }
}
