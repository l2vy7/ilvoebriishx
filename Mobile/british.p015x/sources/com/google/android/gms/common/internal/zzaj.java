package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C7438w0();

    /* renamed from: b */
    final int f29393b;

    zzaj(int i) {
        this.f29393b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29393b);
        C11058b.m49516b(parcel, a);
    }
}
