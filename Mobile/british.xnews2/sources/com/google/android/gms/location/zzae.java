package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new C9696d();

    /* renamed from: b */
    private final String f46112b;

    /* renamed from: c */
    private final String f46113c;

    /* renamed from: d */
    private final String f46114d;

    zzae(String str, String str2, String str3) {
        this.f46114d = str;
        this.f46112b = str2;
        this.f46113c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f46112b, false);
        C11058b.m49537w(parcel, 2, this.f46113c, false);
        C11058b.m49537w(parcel, 5, this.f46114d, false);
        C11058b.m49516b(parcel, a);
    }
}
