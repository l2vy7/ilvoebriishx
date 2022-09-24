package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbeu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbeu> CREATOR = new C7732gu();

    /* renamed from: b */
    public final String f42933b;

    /* renamed from: c */
    public final String f42934c;

    public zzbeu(String str, String str2) {
        this.f42933b = str;
        this.f42934c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f42933b, false);
        C11058b.m49537w(parcel, 2, this.f42934c, false);
        C11058b.m49516b(parcel, a);
    }
}
