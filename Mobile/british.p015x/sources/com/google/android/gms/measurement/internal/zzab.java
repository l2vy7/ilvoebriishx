package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C9731c();

    /* renamed from: b */
    public String f46925b;

    /* renamed from: c */
    public String f46926c;

    /* renamed from: d */
    public zzks f46927d;

    /* renamed from: e */
    public long f46928e;

    /* renamed from: f */
    public boolean f46929f;

    /* renamed from: g */
    public String f46930g;

    /* renamed from: h */
    public final zzau f46931h;

    /* renamed from: i */
    public long f46932i;

    /* renamed from: j */
    public zzau f46933j;

    /* renamed from: k */
    public final long f46934k;

    /* renamed from: l */
    public final zzau f46935l;

    zzab(zzab zzab) {
        C4604n.m20098k(zzab);
        this.f46925b = zzab.f46925b;
        this.f46926c = zzab.f46926c;
        this.f46927d = zzab.f46927d;
        this.f46928e = zzab.f46928e;
        this.f46929f = zzab.f46929f;
        this.f46930g = zzab.f46930g;
        this.f46931h = zzab.f46931h;
        this.f46932i = zzab.f46932i;
        this.f46933j = zzab.f46933j;
        this.f46934k = zzab.f46934k;
        this.f46935l = zzab.f46935l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f46925b, false);
        C11058b.m49537w(parcel, 3, this.f46926c, false);
        C11058b.m49535u(parcel, 4, this.f46927d, i, false);
        C11058b.m49531q(parcel, 5, this.f46928e);
        C11058b.m49517c(parcel, 6, this.f46929f);
        C11058b.m49537w(parcel, 7, this.f46930g, false);
        C11058b.m49535u(parcel, 8, this.f46931h, i, false);
        C11058b.m49531q(parcel, 9, this.f46932i);
        C11058b.m49535u(parcel, 10, this.f46933j, i, false);
        C11058b.m49531q(parcel, 11, this.f46934k);
        C11058b.m49535u(parcel, 12, this.f46935l, i, false);
        C11058b.m49516b(parcel, a);
    }

    zzab(String str, String str2, zzks zzks, long j, boolean z, String str3, zzau zzau, long j2, zzau zzau2, long j3, zzau zzau3) {
        this.f46925b = str;
        this.f46926c = str2;
        this.f46927d = zzks;
        this.f46928e = j;
        this.f46929f = z;
        this.f46930g = str3;
        this.f46931h = zzau;
        this.f46932i = j2;
        this.f46933j = zzau2;
        this.f46934k = j3;
        this.f46935l = zzau3;
    }
}
