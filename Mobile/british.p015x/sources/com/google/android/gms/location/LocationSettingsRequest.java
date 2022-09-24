package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p257v4.C11058b;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C9697e();

    /* renamed from: b */
    private final List<LocationRequest> f46096b;

    /* renamed from: c */
    private final boolean f46097c;

    /* renamed from: d */
    private final boolean f46098d;

    /* renamed from: e */
    private zzae f46099e;

    LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzae zzae) {
        this.f46096b = list;
        this.f46097c = z;
        this.f46098d = z2;
        this.f46099e = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49510A(parcel, 1, Collections.unmodifiableList(this.f46096b), false);
        C11058b.m49517c(parcel, 2, this.f46097c);
        C11058b.m49517c(parcel, 3, this.f46098d);
        C11058b.m49535u(parcel, 5, this.f46099e, i, false);
        C11058b.m49516b(parcel, a);
    }
}
