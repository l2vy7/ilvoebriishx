package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C7457c();

    /* renamed from: b */
    final int f29418b;

    /* renamed from: c */
    final String f29419c;

    /* renamed from: d */
    final int f29420d;

    zac(int i, String str, int i2) {
        this.f29418b = i;
        this.f29419c = str;
        this.f29420d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29418b);
        C11058b.m49537w(parcel, 2, this.f29419c, false);
        C11058b.m49527m(parcel, 3, this.f29420d);
        C11058b.m49516b(parcel, a);
    }

    zac(String str, int i) {
        this.f29418b = 1;
        this.f29419c = str;
        this.f29420d = i;
    }
}
