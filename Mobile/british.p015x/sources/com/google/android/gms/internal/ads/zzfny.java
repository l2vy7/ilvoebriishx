package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfny extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfny> CREATOR = new z13();

    /* renamed from: b */
    public final int f43050b;

    /* renamed from: c */
    public final int f43051c;

    /* renamed from: d */
    public final String f43052d;

    /* renamed from: e */
    public final String f43053e;

    /* renamed from: f */
    public final int f43054f;

    zzfny(int i, int i2, int i3, String str, String str2) {
        this.f43050b = i;
        this.f43051c = i2;
        this.f43052d = str;
        this.f43053e = str2;
        this.f43054f = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43050b);
        C11058b.m49527m(parcel, 2, this.f43051c);
        C11058b.m49537w(parcel, 3, this.f43052d, false);
        C11058b.m49537w(parcel, 4, this.f43053e, false);
        C11058b.m49527m(parcel, 5, this.f43054f);
        C11058b.m49516b(parcel, a);
    }

    public zzfny(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
