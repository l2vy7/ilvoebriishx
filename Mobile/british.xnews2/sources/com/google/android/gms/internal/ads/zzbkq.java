package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkq> CREATOR = new C8315wz();

    /* renamed from: b */
    public final boolean f42990b;

    /* renamed from: c */
    public final boolean f42991c;

    /* renamed from: d */
    public final boolean f42992d;

    public zzbkq(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 2, this.f42990b);
        C11058b.m49517c(parcel, 3, this.f42991c);
        C11058b.m49517c(parcel, 4, this.f42992d);
        C11058b.m49516b(parcel, a);
    }

    public zzbkq(boolean z, boolean z2, boolean z3) {
        this.f42990b = z;
        this.f42991c = z2;
        this.f42992d = z3;
    }
}
