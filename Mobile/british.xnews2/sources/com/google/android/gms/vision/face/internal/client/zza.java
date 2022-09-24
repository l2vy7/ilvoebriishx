package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p190b6.C6512a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C6512a();

    /* renamed from: b */
    public final PointF[] f47113b;

    /* renamed from: c */
    public final int f47114c;

    public zza(PointF[] pointFArr, int i) {
        this.f47113b = pointFArr;
        this.f47114c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49540z(parcel, 2, this.f47113b, i, false);
        C11058b.m49527m(parcel, 3, this.f47114c);
        C11058b.m49516b(parcel, a);
    }
}
