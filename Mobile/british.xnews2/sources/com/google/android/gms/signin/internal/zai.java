package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C9989d();

    /* renamed from: b */
    final int f47007b;

    /* renamed from: c */
    final zat f47008c;

    zai(int i, zat zat) {
        this.f47007b = i;
        this.f47008c = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f47007b);
        C11058b.m49535u(parcel, 2, this.f47008c, i, false);
        C11058b.m49516b(parcel, a);
    }
}
