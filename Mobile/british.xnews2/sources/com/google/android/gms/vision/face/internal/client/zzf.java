package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p190b6.C6514c;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C6514c();

    /* renamed from: b */
    public int f47115b;

    /* renamed from: c */
    public int f47116c;

    /* renamed from: d */
    public int f47117d;

    /* renamed from: e */
    public boolean f47118e;

    /* renamed from: f */
    public boolean f47119f;

    /* renamed from: g */
    public float f47120g;

    public zzf() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f47115b);
        C11058b.m49527m(parcel, 3, this.f47116c);
        C11058b.m49527m(parcel, 4, this.f47117d);
        C11058b.m49517c(parcel, 5, this.f47118e);
        C11058b.m49517c(parcel, 6, this.f47119f);
        C11058b.m49524j(parcel, 7, this.f47120g);
        C11058b.m49516b(parcel, a);
    }

    public zzf(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.f47115b = i;
        this.f47116c = i2;
        this.f47117d = i3;
        this.f47118e = z;
        this.f47119f = z2;
        this.f47120g = f;
    }
}
