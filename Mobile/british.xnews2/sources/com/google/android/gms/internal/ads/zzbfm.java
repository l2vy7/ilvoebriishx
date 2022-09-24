package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfm> CREATOR = new C8240uu();

    /* renamed from: b */
    public final String f42979b;

    /* renamed from: c */
    public long f42980c;

    /* renamed from: d */
    public zzbew f42981d;

    /* renamed from: e */
    public final Bundle f42982e;

    public zzbfm(String str, long j, zzbew zzbew, Bundle bundle) {
        this.f42979b = str;
        this.f42980c = j;
        this.f42981d = zzbew;
        this.f42982e = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f42979b, false);
        C11058b.m49531q(parcel, 2, this.f42980c);
        C11058b.m49535u(parcel, 3, this.f42981d, i, false);
        C11058b.m49519e(parcel, 4, this.f42982e, false);
        C11058b.m49516b(parcel, a);
    }
}
