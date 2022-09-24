package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbjd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjd> CREATOR = new C7959my();

    /* renamed from: b */
    public final int f42986b;

    public zzbjd(int i) {
        this.f42986b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f42986b);
        C11058b.m49516b(parcel, a);
    }
}
