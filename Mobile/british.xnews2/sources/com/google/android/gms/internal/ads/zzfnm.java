package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfnm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnm> CREATOR = new q13();

    /* renamed from: b */
    public final int f43042b;

    /* renamed from: c */
    public final byte[] f43043c;

    zzfnm(int i, byte[] bArr) {
        this.f43042b = i;
        this.f43043c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43042b);
        C11058b.m49520f(parcel, 2, this.f43043c, false);
        C11058b.m49516b(parcel, a);
    }

    public zzfnm(byte[] bArr) {
        this(1, bArr);
    }
}
