package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jx2 extends kp3<jx2, ix2> implements vq3 {
    /* access modifiers changed from: private */
    public static final jx2 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public int zzh;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    /* access modifiers changed from: private */
    public int zzl;
    private int zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public long zzo;
    private int zzp;
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    /* access modifiers changed from: private */
    public String zzt = "";
    private String zzu = "";

    static {
        jx2 jx2 = new jx2();
        zzb = jx2;
        kp3.m34067t(jx2.class, jx2);
    }

    private jx2() {
    }

    /* renamed from: E */
    public static ix2 m33776E() {
        return (ix2) zzb.mo33147w();
    }

    /* renamed from: H */
    static /* synthetic */ void m33778H(jx2 jx2, String str) {
        str.getClass();
        jx2.zzi = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m33779I(jx2 jx2, String str) {
        str.getClass();
        jx2.zzj = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m33780J(jx2 jx2, String str) {
        str.getClass();
        jx2.zzk = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m33784N(jx2 jx2, String str) {
        str.getClass();
        jx2.zzq = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m33785O(jx2 jx2, String str) {
        str.getClass();
        jx2.zzr = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m33786P(jx2 jx2, String str) {
        str.getClass();
        jx2.zzs = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m33789S(jx2 jx2, String str) {
        str.getClass();
        jx2.zzu = str;
    }

    /* renamed from: V */
    static /* synthetic */ void m33792V(jx2 jx2, int i) {
        if (i != 1) {
            jx2.zzm = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: W */
    static /* synthetic */ void m33793W(jx2 jx2, int i) {
        if (i != 1) {
            jx2.zzp = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        } else if (i2 == 3) {
            return new jx2();
        } else {
            if (i2 == 4) {
                return new ix2((hx2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
