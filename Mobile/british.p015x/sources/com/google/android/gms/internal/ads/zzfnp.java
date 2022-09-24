package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfnp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnp> CREATOR = new s13();

    /* renamed from: b */
    public final int f43044b;

    /* renamed from: c */
    public final String f43045c;

    /* renamed from: d */
    public final String f43046d;

    zzfnp(int i, String str, String str2) {
        this.f43044b = i;
        this.f43045c = str;
        this.f43046d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43044b);
        C11058b.m49537w(parcel, 2, this.f43045c, false);
        C11058b.m49537w(parcel, 3, this.f43046d, false);
        C11058b.m49516b(parcel, a);
    }

    public zzfnp(String str, String str2) {
        this(1, str, str2);
    }
}
