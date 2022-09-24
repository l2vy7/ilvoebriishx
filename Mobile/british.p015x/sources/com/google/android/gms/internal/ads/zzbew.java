package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbew extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbew> CREATOR = new C7770hu();

    /* renamed from: b */
    public final int f42935b;

    /* renamed from: c */
    public final String f42936c;

    /* renamed from: d */
    public final String f42937d;

    /* renamed from: e */
    public zzbew f42938e;

    /* renamed from: f */
    public IBinder f42939f;

    public zzbew(int i, String str, String str2, zzbew zzbew, IBinder iBinder) {
        this.f42935b = i;
        this.f42936c = str;
        this.f42937d = str2;
        this.f42938e = zzbew;
        this.f42939f = iBinder;
    }

    /* renamed from: C0 */
    public final AdError mo36237C0() {
        zzbew zzbew = this.f42938e;
        return new AdError(this.f42935b, this.f42936c, this.f42937d, zzbew == null ? null : new AdError(zzbew.f42935b, zzbew.f42936c, zzbew.f42937d));
    }

    /* renamed from: D0 */
    public final LoadAdError mo36238D0() {
        AdError adError;
        zzbew zzbew = this.f42938e;
        C7663ey eyVar = null;
        if (zzbew == null) {
            adError = null;
        } else {
            adError = new AdError(zzbew.f42935b, zzbew.f42936c, zzbew.f42937d);
        }
        int i = this.f42935b;
        String str = this.f42936c;
        String str2 = this.f42937d;
        IBinder iBinder = this.f42939f;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            eyVar = queryLocalInterface instanceof C7663ey ? (C7663ey) queryLocalInterface : new C7591cy(iBinder);
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.zza(eyVar));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f42935b);
        C11058b.m49537w(parcel, 2, this.f42936c, false);
        C11058b.m49537w(parcel, 3, this.f42937d, false);
        C11058b.m49535u(parcel, 4, this.f42938e, i, false);
        C11058b.m49526l(parcel, 5, this.f42939f, false);
        C11058b.m49516b(parcel, a);
    }
}
