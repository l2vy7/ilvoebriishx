package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C7062b();

    /* renamed from: b */
    private final int f28232b;

    /* renamed from: c */
    public final int f28233c;

    /* renamed from: d */
    public final PendingIntent f28234d;

    /* renamed from: e */
    public final int f28235e;

    /* renamed from: f */
    private final Bundle f28236f;

    /* renamed from: g */
    public final byte[] f28237g;

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f28232b = i;
        this.f28233c = i2;
        this.f28235e = i3;
        this.f28236f = bundle;
        this.f28237g = bArr;
        this.f28234d = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28233c);
        C11058b.m49535u(parcel, 2, this.f28234d, i, false);
        C11058b.m49527m(parcel, 3, this.f28235e);
        C11058b.m49519e(parcel, 4, this.f28236f, false);
        C11058b.m49520f(parcel, 5, this.f28237g, false);
        C11058b.m49527m(parcel, 1000, this.f28232b);
        C11058b.m49516b(parcel, a);
    }
}
