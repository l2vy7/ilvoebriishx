package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zza {
    public static int zza(AdSize adSize) {
        return adSize.mo17581b();
    }

    public static int zzb(AdSize adSize) {
        return adSize.mo17580a();
    }

    public static AdSize zzc(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zzd(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.mo17584e(true);
        adSize.mo17582c(i2);
        return adSize;
    }

    public static AdSize zze(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.mo17586f(true);
        adSize.mo17583d(i2);
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.mo17587g();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.mo17592h();
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.mo17594i();
    }
}
