package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C8425a();

    /* renamed from: b */
    private final int f43129b = 1;

    /* renamed from: c */
    private final String f43130c;

    /* renamed from: d */
    private final int f43131d;

    zzab(int i, String str, int i2) {
        this.f43130c = (String) C4604n.m20098k(str);
        this.f43131d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43129b);
        C11058b.m49537w(parcel, 2, this.f43130c, false);
        C11058b.m49527m(parcel, 3, this.f43131d);
        C11058b.m49516b(parcel, a);
    }
}
