package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C7397i0();

    /* renamed from: b */
    private final int f29289b;

    /* renamed from: c */
    private final int f29290c;

    /* renamed from: d */
    private final int f29291d;

    /* renamed from: e */
    private final long f29292e;

    /* renamed from: f */
    private final long f29293f;

    /* renamed from: g */
    private final String f29294g;

    /* renamed from: h */
    private final String f29295h;

    /* renamed from: i */
    private final int f29296i;

    /* renamed from: j */
    private final int f29297j;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f29289b = i;
        this.f29290c = i2;
        this.f29291d = i3;
        this.f29292e = j;
        this.f29293f = j2;
        this.f29294g = str;
        this.f29295h = str2;
        this.f29296i = i4;
        this.f29297j = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29289b);
        C11058b.m49527m(parcel, 2, this.f29290c);
        C11058b.m49527m(parcel, 3, this.f29291d);
        C11058b.m49531q(parcel, 4, this.f29292e);
        C11058b.m49531q(parcel, 5, this.f29293f);
        C11058b.m49537w(parcel, 6, this.f29294g, false);
        C11058b.m49537w(parcel, 7, this.f29295h, false);
        C11058b.m49527m(parcel, 8, this.f29296i);
        C11058b.m49527m(parcel, 9, this.f29297j);
        C11058b.m49516b(parcel, a);
    }
}
