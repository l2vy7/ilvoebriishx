package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C7436v0();

    /* renamed from: b */
    private final int f29298b;

    /* renamed from: c */
    private final boolean f29299c;

    /* renamed from: d */
    private final boolean f29300d;

    /* renamed from: e */
    private final int f29301e;

    /* renamed from: f */
    private final int f29302f;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f29298b = i;
        this.f29299c = z;
        this.f29300d = z2;
        this.f29301e = i2;
        this.f29302f = i3;
    }

    /* renamed from: C0 */
    public int mo30033C0() {
        return this.f29301e;
    }

    /* renamed from: D0 */
    public int mo30034D0() {
        return this.f29302f;
    }

    /* renamed from: E0 */
    public boolean mo30035E0() {
        return this.f29299c;
    }

    /* renamed from: F0 */
    public boolean mo30036F0() {
        return this.f29300d;
    }

    /* renamed from: G0 */
    public int mo30037G0() {
        return this.f29298b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, mo30037G0());
        C11058b.m49517c(parcel, 2, mo30035E0());
        C11058b.m49517c(parcel, 3, mo30036F0());
        C11058b.m49527m(parcel, 4, mo30033C0());
        C11058b.m49527m(parcel, 5, mo30034D0());
        C11058b.m49516b(parcel, a);
    }
}
