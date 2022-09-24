package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C8427c();

    /* renamed from: b */
    private final int f43134b = 1;

    /* renamed from: c */
    private final String f43135c;

    /* renamed from: d */
    private final byte[] f43136d;

    zzaf(int i, String str, byte[] bArr) {
        this.f43135c = (String) C4604n.m20098k(str);
        this.f43136d = (byte[]) C4604n.m20098k(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43134b);
        C11058b.m49537w(parcel, 2, this.f43135c, false);
        C11058b.m49520f(parcel, 3, this.f43136d, false);
        C11058b.m49516b(parcel, a);
    }
}
