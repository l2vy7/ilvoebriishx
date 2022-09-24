package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p191b6.C6515d;
import p257v4.C11058b;

@UsedByNative("wrapper.cc")
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new C6515d();

    /* renamed from: b */
    private final int f47109b;

    /* renamed from: c */
    public final float f47110c;

    /* renamed from: d */
    public final float f47111d;

    /* renamed from: e */
    public final int f47112e;

    @UsedByNative("wrapper.cc")
    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.f47109b = i;
        this.f47110c = f;
        this.f47111d = f2;
        this.f47112e = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f47109b);
        C11058b.m49524j(parcel, 2, this.f47110c);
        C11058b.m49524j(parcel, 3, this.f47111d);
        C11058b.m49527m(parcel, 4, this.f47112e);
        C11058b.m49516b(parcel, a);
    }
}
