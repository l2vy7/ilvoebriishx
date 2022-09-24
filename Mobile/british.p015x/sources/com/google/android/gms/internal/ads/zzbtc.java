package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbtc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtc> CREATOR = new o80();

    /* renamed from: b */
    public final boolean f43004b;

    /* renamed from: c */
    public final String f43005c;

    /* renamed from: d */
    public final int f43006d;

    /* renamed from: e */
    public final byte[] f43007e;

    /* renamed from: f */
    public final String[] f43008f;

    /* renamed from: g */
    public final String[] f43009g;

    /* renamed from: h */
    public final boolean f43010h;

    /* renamed from: i */
    public final long f43011i;

    zzbtc(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f43004b = z;
        this.f43005c = str;
        this.f43006d = i;
        this.f43007e = bArr;
        this.f43008f = strArr;
        this.f43009g = strArr2;
        this.f43010h = z2;
        this.f43011i = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, this.f43004b);
        C11058b.m49537w(parcel, 2, this.f43005c, false);
        C11058b.m49527m(parcel, 3, this.f43006d);
        C11058b.m49520f(parcel, 4, this.f43007e, false);
        C11058b.m49538x(parcel, 5, this.f43008f, false);
        C11058b.m49538x(parcel, 6, this.f43009g, false);
        C11058b.m49517c(parcel, 7, this.f43010h);
        C11058b.m49531q(parcel, 8, this.f43011i);
        C11058b.m49516b(parcel, a);
    }
}
