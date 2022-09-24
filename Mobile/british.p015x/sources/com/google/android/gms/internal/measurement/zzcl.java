package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C9262n1();

    /* renamed from: b */
    public final long f45574b;

    /* renamed from: c */
    public final long f45575c;

    /* renamed from: d */
    public final boolean f45576d;

    /* renamed from: e */
    public final String f45577e;

    /* renamed from: f */
    public final String f45578f;

    /* renamed from: g */
    public final String f45579g;

    /* renamed from: h */
    public final Bundle f45580h;

    /* renamed from: i */
    public final String f45581i;

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f45574b = j;
        this.f45575c = j2;
        this.f45576d = z;
        this.f45577e = str;
        this.f45578f = str2;
        this.f45579g = str3;
        this.f45580h = bundle;
        this.f45581i = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49531q(parcel, 1, this.f45574b);
        C11058b.m49531q(parcel, 2, this.f45575c);
        C11058b.m49517c(parcel, 3, this.f45576d);
        C11058b.m49537w(parcel, 4, this.f45577e, false);
        C11058b.m49537w(parcel, 5, this.f45578f, false);
        C11058b.m49537w(parcel, 6, this.f45579g, false);
        C11058b.m49519e(parcel, 7, this.f45580h, false);
        C11058b.m49537w(parcel, 8, this.f45581i, false);
        C11058b.m49516b(parcel, a);
    }
}
