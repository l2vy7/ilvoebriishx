package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C9619s3();

    /* renamed from: b */
    public int f46050b;

    /* renamed from: c */
    private boolean f46051c;

    public zzk() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f46050b);
        C11058b.m49517c(parcel, 3, this.f46051c);
        C11058b.m49516b(parcel, a);
    }

    public zzk(int i, boolean z) {
        this.f46050b = i;
        this.f46051c = z;
    }
}
