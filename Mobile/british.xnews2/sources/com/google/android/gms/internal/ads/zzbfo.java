package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfo> CREATOR = new C8277vu();
    @AppOpenAd.AppOpenAdOrientation

    /* renamed from: b */
    public final int f42983b;

    public zzbfo(@AppOpenAd.AppOpenAdOrientation int i) {
        this.f42983b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f42983b);
        C11058b.m49516b(parcel, a);
    }
}
