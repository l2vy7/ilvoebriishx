package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.C7659eu;
import com.google.android.gms.internal.ads.ab1;
import com.google.android.gms.internal.ads.d60;
import com.google.android.gms.internal.ads.f42;
import com.google.android.gms.internal.ads.f60;
import com.google.android.gms.internal.ads.gi1;
import com.google.android.gms.internal.ads.nv1;
import com.google.android.gms.internal.ads.nw2;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.zzcjf;
import p199d5.C10487a;
import p199d5.C10489b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    public final zzc zza;
    public final C7659eu zzb;
    public final zzo zzc;
    public final xt0 zzd;
    public final f60 zze;
    @RecentlyNonNull
    public final String zzf;
    public final boolean zzg;
    @RecentlyNonNull
    public final String zzh;
    public final zzw zzi;
    public final int zzj;
    public final int zzk;
    @RecentlyNonNull
    public final String zzl;
    public final zzcjf zzm;
    @RecentlyNonNull
    public final String zzn;
    public final zzj zzo;
    public final d60 zzp;
    @RecentlyNonNull
    public final String zzq;
    public final f42 zzr;
    public final nv1 zzs;
    public final nw2 zzt;
    public final zzbv zzu;
    @RecentlyNonNull
    public final String zzv;
    @RecentlyNonNull
    public final String zzw;
    public final ab1 zzx;
    public final gi1 zzy;

    public AdOverlayInfoParcel(C7659eu euVar, zzo zzo2, d60 d60, f60 f60, zzw zzw2, xt0 xt0, boolean z, int i, String str, zzcjf zzcjf, gi1 gi1) {
        this.zza = null;
        this.zzb = euVar;
        this.zzc = zzo2;
        this.zzd = xt0;
        this.zzp = d60;
        this.zze = f60;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzw2;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcjf;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = gi1;
    }

    @RecentlyNonNull
    public static AdOverlayInfoParcel zza(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, this.zza, i, false);
        C11058b.m49526l(parcel, 3, C10489b.m48195m6(this.zzb).asBinder(), false);
        C11058b.m49526l(parcel, 4, C10489b.m48195m6(this.zzc).asBinder(), false);
        C11058b.m49526l(parcel, 5, C10489b.m48195m6(this.zzd).asBinder(), false);
        C11058b.m49526l(parcel, 6, C10489b.m48195m6(this.zze).asBinder(), false);
        C11058b.m49537w(parcel, 7, this.zzf, false);
        C11058b.m49517c(parcel, 8, this.zzg);
        C11058b.m49537w(parcel, 9, this.zzh, false);
        C11058b.m49526l(parcel, 10, C10489b.m48195m6(this.zzi).asBinder(), false);
        C11058b.m49527m(parcel, 11, this.zzj);
        C11058b.m49527m(parcel, 12, this.zzk);
        C11058b.m49537w(parcel, 13, this.zzl, false);
        C11058b.m49535u(parcel, 14, this.zzm, i, false);
        C11058b.m49537w(parcel, 16, this.zzn, false);
        C11058b.m49535u(parcel, 17, this.zzo, i, false);
        C11058b.m49526l(parcel, 18, C10489b.m48195m6(this.zzp).asBinder(), false);
        C11058b.m49537w(parcel, 19, this.zzq, false);
        C11058b.m49526l(parcel, 20, C10489b.m48195m6(this.zzr).asBinder(), false);
        C11058b.m49526l(parcel, 21, C10489b.m48195m6(this.zzs).asBinder(), false);
        C11058b.m49526l(parcel, 22, C10489b.m48195m6(this.zzt).asBinder(), false);
        C11058b.m49526l(parcel, 23, C10489b.m48195m6(this.zzu).asBinder(), false);
        C11058b.m49537w(parcel, 24, this.zzv, false);
        C11058b.m49537w(parcel, 25, this.zzw, false);
        C11058b.m49526l(parcel, 26, C10489b.m48195m6(this.zzx).asBinder(), false);
        C11058b.m49526l(parcel, 27, C10489b.m48195m6(this.zzy).asBinder(), false);
        C11058b.m49516b(parcel, a);
    }

    public AdOverlayInfoParcel(C7659eu euVar, zzo zzo2, d60 d60, f60 f60, zzw zzw2, xt0 xt0, boolean z, int i, String str, String str2, zzcjf zzcjf, gi1 gi1) {
        this.zza = null;
        this.zzb = euVar;
        this.zzc = zzo2;
        this.zzd = xt0;
        this.zzp = d60;
        this.zze = f60;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzw2;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcjf;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = gi1;
    }

    public AdOverlayInfoParcel(C7659eu euVar, zzo zzo2, zzw zzw2, xt0 xt0, int i, zzcjf zzcjf, String str, zzj zzj2, String str2, String str3, String str4, ab1 ab1) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzo2;
        this.zzd = xt0;
        this.zzp = null;
        this.zze = null;
        this.zzf = str2;
        this.zzg = false;
        this.zzh = str3;
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcjf;
        this.zzn = str;
        this.zzo = zzj2;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
        this.zzx = ab1;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(C7659eu euVar, zzo zzo2, zzw zzw2, xt0 xt0, boolean z, int i, zzcjf zzcjf, gi1 gi1) {
        this.zza = null;
        this.zzb = euVar;
        this.zzc = zzo2;
        this.zzd = xt0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzw2;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcjf;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = gi1;
    }

    AdOverlayInfoParcel(zzc zzc2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzcjf zzcjf, String str4, zzj zzj2, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.zza = zzc2;
        this.zzb = (C7659eu) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder));
        this.zzc = (zzo) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder2));
        this.zzd = (xt0) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder3));
        this.zzp = (d60) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder6));
        this.zze = (f60) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzw) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzcjf;
        this.zzn = str4;
        this.zzo = zzj2;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (f42) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder7));
        this.zzs = (nv1) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder8));
        this.zzt = (nw2) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder9));
        this.zzu = (zzbv) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder10));
        this.zzw = str7;
        this.zzx = (ab1) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder11));
        this.zzy = (gi1) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzc2, C7659eu euVar, zzo zzo2, zzw zzw2, zzcjf zzcjf, xt0 xt0, gi1 gi1) {
        this.zza = zzc2;
        this.zzb = euVar;
        this.zzc = zzo2;
        this.zzd = xt0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzw2;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcjf;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = gi1;
    }

    public AdOverlayInfoParcel(zzo zzo2, xt0 xt0, int i, zzcjf zzcjf) {
        this.zzc = zzo2;
        this.zzd = xt0;
        this.zzj = 1;
        this.zzm = zzcjf;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(xt0 xt0, zzcjf zzcjf, zzbv zzbv, f42 f42, nv1 nv1, nw2 nw2, String str, String str2, int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = xt0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = i;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcjf;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = f42;
        this.zzs = nv1;
        this.zzt = nw2;
        this.zzu = zzbv;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }
}
