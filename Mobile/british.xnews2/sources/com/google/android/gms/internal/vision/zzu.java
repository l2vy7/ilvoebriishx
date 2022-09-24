package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p186z5.C6471c;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new C9605q6();

    /* renamed from: b */
    public int f46052b;

    /* renamed from: c */
    public int f46053c;

    /* renamed from: d */
    public int f46054d;

    /* renamed from: e */
    public long f46055e;

    /* renamed from: f */
    public int f46056f;

    public zzu() {
    }

    /* renamed from: C0 */
    public static zzu m44925C0(C6471c cVar) {
        zzu zzu = new zzu();
        zzu.f46052b = cVar.mo24305c().mo24316f();
        zzu.f46053c = cVar.mo24305c().mo24312b();
        zzu.f46056f = cVar.mo24305c().mo24314d();
        zzu.f46054d = cVar.mo24305c().mo24313c();
        zzu.f46055e = cVar.mo24305c().mo24315e();
        return zzu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f46052b);
        C11058b.m49527m(parcel, 3, this.f46053c);
        C11058b.m49527m(parcel, 4, this.f46054d);
        C11058b.m49531q(parcel, 5, this.f46055e);
        C11058b.m49527m(parcel, 6, this.f46056f);
        C11058b.m49516b(parcel, a);
    }

    public zzu(int i, int i2, int i3, long j, int i4) {
        this.f46052b = i;
        this.f46053c = i2;
        this.f46054d = i3;
        this.f46055e = j;
        this.f46056f = i4;
    }
}
