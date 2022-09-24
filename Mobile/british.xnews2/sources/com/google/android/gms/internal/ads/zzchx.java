package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import p256v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzchx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzchx> CREATOR = new an0();
    @Deprecated

    /* renamed from: b */
    public final String f21162b;

    /* renamed from: c */
    public final String f21163c;
    @Deprecated

    /* renamed from: d */
    public final zzbfi f21164d;

    /* renamed from: e */
    public final zzbfd f21165e;

    public zzchx(String str, String str2, zzbfi zzbfi, zzbfd zzbfd) {
        this.f21162b = str;
        this.f21163c = str2;
        this.f21164d = zzbfi;
        this.f21165e = zzbfd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f21162b, false);
        C11058b.m49537w(parcel, 2, this.f21163c, false);
        C11058b.m49535u(parcel, 3, this.f21164d, i, false);
        C11058b.m49535u(parcel, 4, this.f21165e, i, false);
        C11058b.m49516b(parcel, a);
    }
}
