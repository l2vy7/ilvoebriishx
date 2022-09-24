package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbkk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkk> CREATOR = new C8173sz();

    /* renamed from: b */
    public final int f42987b;

    /* renamed from: c */
    public final int f42988c;

    public zzbkk(int i, int i2) {
        this.f42987b = i;
        this.f42988c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f42987b);
        C11058b.m49527m(parcel, 2, this.f42988c);
        C11058b.m49516b(parcel, a);
    }

    public zzbkk(RequestConfiguration requestConfiguration) {
        this.f42987b = requestConfiguration.getTagForChildDirectedTreatment();
        this.f42988c = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
