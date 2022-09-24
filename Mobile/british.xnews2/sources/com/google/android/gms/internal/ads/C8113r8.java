package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.r8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8113r8 extends kp3<C8113r8, C8077q8> implements vq3 {
    /* access modifiers changed from: private */
    public static final C8113r8 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzu;
    private long zzv;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        C8113r8 r8Var = new C8113r8();
        zzb = r8Var;
        kp3.m34067t(C8113r8.class, r8Var);
    }

    private C8113r8() {
    }

    /* renamed from: E */
    public static C8077q8 m36968E() {
        return (C8077q8) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m36970H(C8113r8 r8Var, long j) {
        r8Var.zze |= 1;
        r8Var.zzf = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m36971I(C8113r8 r8Var, long j) {
        r8Var.zze |= 2;
        r8Var.zzg = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m36972J(C8113r8 r8Var, long j) {
        r8Var.zze |= 4;
        r8Var.zzh = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m36973K(C8113r8 r8Var, long j) {
        r8Var.zze |= 8;
        r8Var.zzi = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m36974L(C8113r8 r8Var) {
        r8Var.zze &= -9;
        r8Var.zzi = -1;
    }

    /* renamed from: M */
    static /* synthetic */ void m36975M(C8113r8 r8Var, long j) {
        r8Var.zze |= 16;
        r8Var.zzj = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m36976N(C8113r8 r8Var, long j) {
        r8Var.zze |= 32;
        r8Var.zzk = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m36977O(C8113r8 r8Var, long j) {
        r8Var.zze |= 128;
        r8Var.zzm = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m36978P(C8113r8 r8Var, long j) {
        r8Var.zze |= 256;
        r8Var.zzn = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m36979Q(C8113r8 r8Var, long j) {
        r8Var.zze |= 512;
        r8Var.zzo = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m36980R(C8113r8 r8Var, long j) {
        r8Var.zze |= 2048;
        r8Var.zzq = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m36981S(C8113r8 r8Var, long j) {
        r8Var.zze |= 4096;
        r8Var.zzr = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m36982T(C8113r8 r8Var, long j) {
        r8Var.zze |= 8192;
        r8Var.zzs = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m36983U(C8113r8 r8Var, long j) {
        r8Var.zze |= 16384;
        r8Var.zzt = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m36984V(C8113r8 r8Var, long j) {
        r8Var.zze |= 32768;
        r8Var.zzu = j;
    }

    /* renamed from: W */
    static /* synthetic */ void m36985W(C8113r8 r8Var, long j) {
        r8Var.zze |= C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
        r8Var.zzv = j;
    }

    /* renamed from: X */
    static /* synthetic */ void m36986X(C8113r8 r8Var, long j) {
        r8Var.zze |= 131072;
        r8Var.zzw = j;
    }

    /* renamed from: Y */
    static /* synthetic */ void m36987Y(C8113r8 r8Var, long j) {
        r8Var.zze |= 262144;
        r8Var.zzx = j;
    }

    /* renamed from: Z */
    static /* synthetic */ void m36988Z(C8113r8 r8Var, int i) {
        r8Var.zzl = i - 1;
        r8Var.zze |= 64;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m36989a0(C8113r8 r8Var, int i) {
        r8Var.zzp = i - 1;
        r8Var.zze |= 1024;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            op3 op3 = C7495a9.f29564a;
            return kp3.m34066s(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", op3, "zzm", "zzn", "zzo", "zzp", op3, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        } else if (i2 == 3) {
            return new C8113r8();
        } else {
            if (i2 == 4) {
                return new C8077q8((C7565c8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
