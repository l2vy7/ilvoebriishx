package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p191b6.C6513b;
import p257v4.C11058b;

@UsedByNative("wrapper.cc")
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new C6513b();

    /* renamed from: b */
    private final int f47094b;

    /* renamed from: c */
    public final int f47095c;

    /* renamed from: d */
    public final float f47096d;

    /* renamed from: e */
    public final float f47097e;

    /* renamed from: f */
    public final float f47098f;

    /* renamed from: g */
    public final float f47099g;

    /* renamed from: h */
    public final float f47100h;

    /* renamed from: i */
    public final float f47101i;

    /* renamed from: j */
    public final float f47102j;

    /* renamed from: k */
    public final LandmarkParcel[] f47103k;

    /* renamed from: l */
    public final float f47104l;

    /* renamed from: m */
    public final float f47105m;

    /* renamed from: n */
    public final float f47106n;

    /* renamed from: o */
    public final zza[] f47107o;

    /* renamed from: p */
    public final float f47108p;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, zza[] zzaArr, float f11) {
        this.f47094b = i;
        this.f47095c = i2;
        this.f47096d = f;
        this.f47097e = f2;
        this.f47098f = f3;
        this.f47099g = f4;
        this.f47100h = f5;
        this.f47101i = f6;
        this.f47102j = f7;
        this.f47103k = landmarkParcelArr;
        this.f47104l = f8;
        this.f47105m = f9;
        this.f47106n = f10;
        this.f47107o = zzaArr;
        this.f47108p = f11;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f47094b);
        C11058b.m49527m(parcel, 2, this.f47095c);
        C11058b.m49524j(parcel, 3, this.f47096d);
        C11058b.m49524j(parcel, 4, this.f47097e);
        C11058b.m49524j(parcel, 5, this.f47098f);
        C11058b.m49524j(parcel, 6, this.f47099g);
        C11058b.m49524j(parcel, 7, this.f47100h);
        C11058b.m49524j(parcel, 8, this.f47101i);
        C11058b.m49540z(parcel, 9, this.f47103k, i, false);
        C11058b.m49524j(parcel, 10, this.f47104l);
        C11058b.m49524j(parcel, 11, this.f47105m);
        C11058b.m49524j(parcel, 12, this.f47106n);
        C11058b.m49540z(parcel, 13, this.f47107o, i, false);
        C11058b.m49524j(parcel, 14, this.f47102j);
        C11058b.m49524j(parcel, 15, this.f47108p);
        C11058b.m49516b(parcel, a);
    }
}
