package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C9459a();

    /* renamed from: b */
    public final int f46026b;

    /* renamed from: c */
    public final int f46027c;

    /* renamed from: d */
    public final int f46028d;

    /* renamed from: e */
    public final int f46029e;

    /* renamed from: f */
    public final float f46030f;

    public zzab(int i, int i2, int i3, int i4, float f) {
        this.f46026b = i;
        this.f46027c = i2;
        this.f46028d = i3;
        this.f46029e = i4;
        this.f46030f = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f46026b);
        C11058b.m49527m(parcel, 3, this.f46027c);
        C11058b.m49527m(parcel, 4, this.f46028d);
        C11058b.m49527m(parcel, 5, this.f46029e);
        C11058b.m49524j(parcel, 6, this.f46030f);
        C11058b.m49516b(parcel, a);
    }
}
