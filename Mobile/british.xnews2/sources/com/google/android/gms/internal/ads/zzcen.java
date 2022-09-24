package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcen> CREATOR = new rj0();

    /* renamed from: b */
    public final zzbfd f43024b;

    /* renamed from: c */
    public final String f43025c;

    public zzcen(zzbfd zzbfd, String str) {
        this.f43024b = zzbfd;
        this.f43025c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, this.f43024b, i, false);
        C11058b.m49537w(parcel, 3, this.f43025c, false);
        C11058b.m49516b(parcel, a);
    }
}
