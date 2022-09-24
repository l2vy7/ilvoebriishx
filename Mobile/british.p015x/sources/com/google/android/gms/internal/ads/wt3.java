package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wt3 extends kp3<wt3, vt3> implements vq3 {
    /* access modifiers changed from: private */
    public static final wt3 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private jt3 zzh;
    private nt3 zzi;
    private int zzj;
    private pp3 zzk = kp3.m34060m();
    private String zzl = "";
    private int zzm;
    private tp3<String> zzn = kp3.m34063p();
    private byte zzo = 2;

    static {
        wt3 wt3 = new wt3();
        zzb = wt3;
        kp3.m34067t(wt3.class, wt3);
    }

    private wt3() {
    }

    /* renamed from: F */
    public static vt3 m39260F() {
        return (vt3) zzb.mo33147w();
    }

    /* renamed from: J */
    static /* synthetic */ void m39262J(wt3 wt3, int i) {
        wt3.zze |= 1;
        wt3.zzf = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m39263K(wt3 wt3, String str) {
        str.getClass();
        wt3.zze |= 2;
        wt3.zzg = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m39264L(wt3 wt3, jt3 jt3) {
        jt3.getClass();
        wt3.zzh = jt3;
        wt3.zze |= 4;
    }

    /* renamed from: M */
    static /* synthetic */ void m39265M(wt3 wt3, String str) {
        str.getClass();
        tp3<String> tp3 = wt3.zzn;
        if (!tp3.zzc()) {
            wt3.zzn = kp3.m34064q(tp3);
        }
        wt3.zzn.add(str);
    }

    /* renamed from: N */
    static /* synthetic */ void m39266N(wt3 wt3, int i) {
        wt3.zzm = i - 1;
        wt3.zze |= 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo30379D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return kp3.m34066s(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", tt3.f39531a, "zzn"});
        } else if (i2 == 3) {
            return new wt3();
        } else {
            if (i2 == 4) {
                return new vt3((ys3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }

    /* renamed from: E */
    public final int mo35685E() {
        return this.zzn.size();
    }

    /* renamed from: I */
    public final String mo35686I() {
        return this.zzg;
    }
}
