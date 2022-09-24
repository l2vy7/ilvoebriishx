package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C7388f1();

    /* renamed from: b */
    Bundle f29394b;

    /* renamed from: c */
    Feature[] f29395c;

    /* renamed from: d */
    int f29396d;

    /* renamed from: e */
    ConnectionTelemetryConfiguration f29397e;

    public zzj() {
    }

    zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f29394b = bundle;
        this.f29395c = featureArr;
        this.f29396d = i;
        this.f29397e = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49519e(parcel, 1, this.f29394b, false);
        C11058b.m49540z(parcel, 2, this.f29395c, i, false);
        C11058b.m49527m(parcel, 3, this.f29396d);
        C11058b.m49535u(parcel, 4, this.f29397e, i, false);
        C11058b.m49516b(parcel, a);
    }
}
