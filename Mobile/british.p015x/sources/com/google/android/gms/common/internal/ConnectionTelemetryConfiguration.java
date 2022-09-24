package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C7391g1();

    /* renamed from: b */
    private final RootTelemetryConfiguration f29267b;

    /* renamed from: c */
    private final boolean f29268c;

    /* renamed from: d */
    private final boolean f29269d;

    /* renamed from: e */
    private final int[] f29270e;

    /* renamed from: f */
    private final int f29271f;

    /* renamed from: g */
    private final int[] f29272g;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f29267b = rootTelemetryConfiguration;
        this.f29268c = z;
        this.f29269d = z2;
        this.f29270e = iArr;
        this.f29271f = i;
        this.f29272g = iArr2;
    }

    /* renamed from: C0 */
    public int mo30023C0() {
        return this.f29271f;
    }

    /* renamed from: D0 */
    public int[] mo30024D0() {
        return this.f29270e;
    }

    /* renamed from: E0 */
    public int[] mo30025E0() {
        return this.f29272g;
    }

    /* renamed from: F0 */
    public boolean mo30026F0() {
        return this.f29268c;
    }

    /* renamed from: G0 */
    public boolean mo30027G0() {
        return this.f29269d;
    }

    /* renamed from: H0 */
    public final RootTelemetryConfiguration mo30028H0() {
        return this.f29267b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, this.f29267b, i, false);
        C11058b.m49517c(parcel, 2, mo30026F0());
        C11058b.m49517c(parcel, 3, mo30027G0());
        C11058b.m49528n(parcel, 4, mo30024D0(), false);
        C11058b.m49527m(parcel, 5, mo30023C0());
        C11058b.m49528n(parcel, 6, mo30025E0(), false);
        C11058b.m49516b(parcel, a);
    }
}
