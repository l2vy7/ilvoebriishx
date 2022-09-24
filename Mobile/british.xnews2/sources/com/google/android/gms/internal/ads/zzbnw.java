package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbnw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbnw> CREATOR = new e30();

    /* renamed from: b */
    public final int f42993b;

    /* renamed from: c */
    public final boolean f42994c;

    /* renamed from: d */
    public final int f42995d;

    /* renamed from: e */
    public final boolean f42996e;

    /* renamed from: f */
    public final int f42997f;

    /* renamed from: g */
    public final zzbkq f42998g;

    /* renamed from: h */
    public final boolean f42999h;

    /* renamed from: i */
    public final int f43000i;

    public zzbnw(int i, boolean z, int i2, boolean z2, int i3, zzbkq zzbkq, boolean z3, int i4) {
        this.f42993b = i;
        this.f42994c = z;
        this.f42995d = i2;
        this.f42996e = z2;
        this.f42997f = i3;
        this.f42998g = zzbkq;
        this.f42999h = z3;
        this.f43000i = i4;
    }

    /* renamed from: C0 */
    public static NativeAdOptions m40650C0(zzbnw zzbnw) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbnw == null) {
            return builder.build();
        }
        int i = zzbnw.f42993b;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbnw.f42999h);
                    builder.setMediaAspectRatio(zzbnw.f43000i);
                }
                builder.setReturnUrlsForImageAssets(zzbnw.f42994c);
                builder.setRequestMultipleImages(zzbnw.f42996e);
                return builder.build();
            }
            zzbkq zzbkq = zzbnw.f42998g;
            if (zzbkq != null) {
                builder.setVideoOptions(new VideoOptions(zzbkq));
            }
        }
        builder.setAdChoicesPlacement(zzbnw.f42997f);
        builder.setReturnUrlsForImageAssets(zzbnw.f42994c);
        builder.setRequestMultipleImages(zzbnw.f42996e);
        return builder.build();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f42993b);
        C11058b.m49517c(parcel, 2, this.f42994c);
        C11058b.m49527m(parcel, 3, this.f42995d);
        C11058b.m49517c(parcel, 4, this.f42996e);
        C11058b.m49527m(parcel, 5, this.f42997f);
        C11058b.m49535u(parcel, 6, this.f42998g, i, false);
        C11058b.m49517c(parcel, 7, this.f42999h);
        C11058b.m49527m(parcel, 8, this.f43000i);
        C11058b.m49516b(parcel, a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbnw(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzbkq(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}
