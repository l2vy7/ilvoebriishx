package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.m43;
import com.google.android.gms.internal.ads.us2;
import com.google.android.gms.internal.ads.zzbew;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbe();
    public final String zza;
    public final int zzb;

    zzbd(String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzbd zza(Throwable th) {
        String str;
        zzbew a = us2.m38443a(th);
        if (m43.m20697d(th.getMessage())) {
            str = a.f42936c;
        } else {
            str = th.getMessage();
        }
        return new zzbd(str, a.f42935b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.zza, false);
        C11058b.m49527m(parcel, 2, this.zzb);
        C11058b.m49516b(parcel, a);
    }
}
