package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbta extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbta> CREATOR = new n80();

    /* renamed from: b */
    public final String f43001b;

    /* renamed from: c */
    public final String[] f43002c;

    /* renamed from: d */
    public final String[] f43003d;

    zzbta(String str, String[] strArr, String[] strArr2) {
        this.f43001b = str;
        this.f43002c = strArr;
        this.f43003d = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f43001b, false);
        C11058b.m49538x(parcel, 2, this.f43002c, false);
        C11058b.m49538x(parcel, 3, this.f43003d, false);
        C11058b.m49516b(parcel, a);
    }
}
