package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.app */
/* compiled from: IMASDK */
public final class C3848app extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3848app> CREATOR = new apr((byte[]) null);

    /* renamed from: a */
    public final int f15535a;

    /* renamed from: b */
    public final String f15536b;

    /* renamed from: c */
    public final String f15537c;

    C3848app(int i, String str, String str2) {
        this.f15535a = i;
        this.f15536b = str;
        this.f15537c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f15535a);
        C11058b.m49537w(parcel, 2, this.f15536b, false);
        C11058b.m49537w(parcel, 3, this.f15537c, false);
        C11058b.m49516b(parcel, a);
    }

    public C3848app(String str, String str2) {
        this(1, str, str2);
    }
}
