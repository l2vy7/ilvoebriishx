package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zt3 extends kp3<zt3, at3> implements vq3 {
    /* access modifiers changed from: private */
    public static final zt3 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private dt3 zzk;
    private tp3<wt3> zzl = kp3.m34063p();
    private String zzm = "";
    private qt3 zzn;
    private boolean zzo;
    private tp3<String> zzp = kp3.m34063p();
    private String zzq = "";
    private boolean zzr;
    private boolean zzs;
    private eo3 zzt = eo3.f31444c;
    private yt3 zzu;
    private tp3<String> zzv = kp3.m34063p();
    private tp3<String> zzw = kp3.m34063p();
    private byte zzx = 2;

    static {
        zt3 zt3 = new zt3();
        zzb = zt3;
        kp3.m34067t(zt3.class, zt3);
    }

    private zt3() {
    }

    /* renamed from: E */
    public static at3 m40497E() {
        return (at3) zzb.mo33147w();
    }

    /* renamed from: K */
    static /* synthetic */ void m40499K(zt3 zt3, String str) {
        str.getClass();
        zt3.zze |= 4;
        zt3.zzh = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m40500L(zt3 zt3, String str) {
        str.getClass();
        zt3.zze |= 8;
        zt3.zzi = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m40501M(zt3 zt3, dt3 dt3) {
        dt3.getClass();
        zt3.zzk = dt3;
        zt3.zze |= 32;
    }

    /* renamed from: N */
    static /* synthetic */ void m40502N(zt3 zt3, wt3 wt3) {
        wt3.getClass();
        tp3<wt3> tp3 = zt3.zzl;
        if (!tp3.zzc()) {
            zt3.zzl = kp3.m34064q(tp3);
        }
        zt3.zzl.add(wt3);
    }

    /* renamed from: O */
    static /* synthetic */ void m40503O(zt3 zt3, String str) {
        zt3.zze |= 64;
        zt3.zzm = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m40504P(zt3 zt3) {
        zt3.zze &= -65;
        zt3.zzm = zzb.zzm;
    }

    /* renamed from: Q */
    static /* synthetic */ void m40505Q(zt3 zt3, qt3 qt3) {
        qt3.getClass();
        zt3.zzn = qt3;
        zt3.zze |= 128;
    }

    /* renamed from: R */
    static /* synthetic */ void m40506R(zt3 zt3, yt3 yt3) {
        yt3.getClass();
        zt3.zzu = yt3;
        zt3.zze |= 8192;
    }

    /* renamed from: S */
    static /* synthetic */ void m40507S(zt3 zt3, Iterable iterable) {
        tp3<String> tp3 = zt3.zzv;
        if (!tp3.zzc()) {
            zt3.zzv = kp3.m34064q(tp3);
        }
        ln3.m34512f(iterable, zt3.zzv);
    }

    /* renamed from: T */
    static /* synthetic */ void m40508T(zt3 zt3, Iterable iterable) {
        tp3<String> tp3 = zt3.zzw;
        if (!tp3.zzc()) {
            zt3.zzw = kp3.m34064q(tp3);
        }
        ln3.m34512f(iterable, zt3.zzw);
    }

    /* renamed from: U */
    static /* synthetic */ void m40509U(zt3 zt3, int i) {
        zt3.zzf = i - 1;
        zt3.zze |= 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzx);
        }
        byte b = 1;
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", wt3.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzf", rt3.f38775a, "zzg", zs3.f42584a, "zzk", "zzm", "zzn", "zzt", "zzu", "zzv", "zzw"});
        } else if (i2 == 3) {
            return new zt3();
        } else {
            if (i2 == 4) {
                return new at3((ys3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzx = b;
            return null;
        }
    }

    /* renamed from: H */
    public final String mo36132H() {
        return this.zzm;
    }

    /* renamed from: I */
    public final String mo36133I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final List<wt3> mo36134J() {
        return this.zzl;
    }
}
