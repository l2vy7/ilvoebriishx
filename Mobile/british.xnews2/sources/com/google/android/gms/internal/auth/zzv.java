package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C8429e();

    /* renamed from: b */
    private final int f43140b = 1;

    /* renamed from: c */
    private final String f43141c;

    zzv(int i, String str) {
        this.f43141c = (String) C4604n.m20098k(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43140b);
        C11058b.m49537w(parcel, 2, this.f43141c, false);
        C11058b.m49516b(parcel, a);
    }
}
