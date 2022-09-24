package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbtn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtn> CREATOR = new y80();

    /* renamed from: b */
    public final String f43012b;

    /* renamed from: c */
    public final boolean f43013c;

    /* renamed from: d */
    public final int f43014d;

    /* renamed from: e */
    public final String f43015e;

    public zzbtn(String str, boolean z, int i, String str2) {
        this.f43012b = str;
        this.f43013c = z;
        this.f43014d = i;
        this.f43015e = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f43012b, false);
        C11058b.m49517c(parcel, 2, this.f43013c);
        C11058b.m49527m(parcel, 3, this.f43014d);
        C11058b.m49537w(parcel, 4, this.f43015e, false);
        C11058b.m49516b(parcel, a);
    }
}
