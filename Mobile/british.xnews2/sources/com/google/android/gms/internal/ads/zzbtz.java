package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import p256v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbtz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtz> CREATOR = new j90();

    /* renamed from: b */
    public final int f21081b;

    /* renamed from: c */
    public final int f21082c;

    /* renamed from: d */
    public final String f21083d;

    /* renamed from: e */
    public final int f21084e;

    public zzbtz(int i, int i2, String str, int i3) {
        this.f21081b = i;
        this.f21082c = i2;
        this.f21083d = str;
        this.f21084e = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f21082c);
        C11058b.m49537w(parcel, 2, this.f21083d, false);
        C11058b.m49527m(parcel, 3, this.f21084e);
        C11058b.m49527m(parcel, 1000, this.f21081b);
        C11058b.m49516b(parcel, a);
    }
}
