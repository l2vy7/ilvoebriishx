package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import p256v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcfn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcfn> CREATOR = new qk0();

    /* renamed from: b */
    public final String f21160b;

    /* renamed from: c */
    public final String f21161c;

    public zzcfn(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f21160b, false);
        C11058b.m49537w(parcel, 2, this.f21161c, false);
        C11058b.m49516b(parcel, a);
    }

    public zzcfn(String str, String str2) {
        this.f21160b = str;
        this.f21161c = str2;
    }
}
