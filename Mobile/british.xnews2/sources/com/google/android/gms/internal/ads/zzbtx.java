package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbtx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtx> CREATOR = new h90();

    /* renamed from: b */
    public final String f43016b;

    /* renamed from: c */
    public final Bundle f43017c;

    public zzbtx(String str, Bundle bundle) {
        this.f43016b = str;
        this.f43017c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f43016b, false);
        C11058b.m49519e(parcel, 2, this.f43017c, false);
        C11058b.m49516b(parcel, a);
    }
}
