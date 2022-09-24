package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.aow */
/* compiled from: IMASDK */
public final class aow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aow> CREATOR = new aoy((byte[]) null);

    /* renamed from: a */
    private final String f15506a;

    /* renamed from: b */
    private final int f15507b;

    /* renamed from: c */
    private final String f15508c;

    @Hide
    public aow(String str, int i, String str2) {
        this.f15506a = str;
        this.f15507b = i;
        this.f15508c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f15506a, false);
        C11058b.m49527m(parcel, 2, this.f15507b);
        C11058b.m49537w(parcel, 3, this.f15508c, false);
        C11058b.m49516b(parcel, a);
    }
}
