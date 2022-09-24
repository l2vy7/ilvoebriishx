package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C9478c();

    /* renamed from: b */
    public final Rect f46042b;

    public zzaj() {
        this.f46042b = new Rect();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, this.f46042b, i, false);
        C11058b.m49516b(parcel, a);
    }

    public zzaj(Rect rect) {
        this.f46042b = rect;
    }
}
