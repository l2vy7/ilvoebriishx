package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbkm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkm> CREATOR = new C8209tz();

    /* renamed from: b */
    public final String f42989b;

    public zzbkm(SearchAdRequest searchAdRequest) {
        this.f42989b = searchAdRequest.getQuery();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 15, this.f42989b, false);
        C11058b.m49516b(parcel, a);
    }

    zzbkm(String str) {
        this.f42989b = str;
    }
}
