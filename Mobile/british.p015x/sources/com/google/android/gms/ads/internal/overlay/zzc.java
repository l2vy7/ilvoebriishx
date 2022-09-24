package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p199d5.C10487a;
import p199d5.C10489b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzu zzi;
    public final boolean zzj;

    public zzc(Intent intent, zzu zzu) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent, C10489b.m48195m6(zzu).asBinder(), false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.zza, false);
        C11058b.m49537w(parcel, 3, this.zzb, false);
        C11058b.m49537w(parcel, 4, this.zzc, false);
        C11058b.m49537w(parcel, 5, this.zzd, false);
        C11058b.m49537w(parcel, 6, this.zze, false);
        C11058b.m49537w(parcel, 7, this.zzf, false);
        C11058b.m49537w(parcel, 8, this.zzg, false);
        C11058b.m49535u(parcel, 9, this.zzh, i, false);
        C11058b.m49526l(parcel, 10, C10489b.m48195m6(this.zzi).asBinder(), false);
        C11058b.m49517c(parcel, 11, this.zzj);
        C11058b.m49516b(parcel, a);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzu) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder));
        this.zzj = z;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzu zzu) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null, C10489b.m48195m6(zzu).asBinder(), false);
    }
}
