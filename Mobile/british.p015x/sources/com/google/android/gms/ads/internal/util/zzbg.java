package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.C7408m;
import com.unity3d.ads.metadata.MediationMetaData;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbg {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbg(String str, double d, double d2, double d3, int i) {
        this.zza = str;
        this.zzc = d;
        this.zzb = d2;
        this.zzd = d3;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbg)) {
            return false;
        }
        zzbg zzbg = (zzbg) obj;
        if (C7408m.m30028a(this.zza, zzbg.zza) && this.zzb == zzbg.zzb && this.zzc == zzbg.zzc && this.zze == zzbg.zze && Double.compare(this.zzd, zzbg.zzd) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7408m.m30029b(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return C7408m.m30030c(this).mo30140a(MediationMetaData.KEY_NAME, this.zza).mo30140a("minBound", Double.valueOf(this.zzc)).mo30140a("maxBound", Double.valueOf(this.zzb)).mo30140a("percent", Double.valueOf(this.zzd)).mo30140a("count", Integer.valueOf(this.zze)).toString();
    }
}
