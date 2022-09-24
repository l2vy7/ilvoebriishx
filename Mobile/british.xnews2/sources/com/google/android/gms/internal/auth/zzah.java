package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C8428d();

    /* renamed from: b */
    private final int f43137b = 1;

    /* renamed from: c */
    private final String f43138c;

    /* renamed from: d */
    private final PendingIntent f43139d;

    zzah(int i, String str, PendingIntent pendingIntent) {
        this.f43138c = (String) C4604n.m20098k(str);
        this.f43139d = (PendingIntent) C4604n.m20098k(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43137b);
        C11058b.m49537w(parcel, 2, this.f43138c, false);
        C11058b.m49535u(parcel, 3, this.f43139d, i, false);
        C11058b.m49516b(parcel, a);
    }
}
