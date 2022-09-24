package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzam;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p244q4.C10920a;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new C7170b();

    /* renamed from: b */
    private double f28832b;

    /* renamed from: c */
    private boolean f28833c;

    /* renamed from: d */
    private int f28834d;

    /* renamed from: e */
    private ApplicationMetadata f28835e;

    /* renamed from: f */
    private int f28836f;

    /* renamed from: g */
    private zzam f28837g;

    /* renamed from: h */
    private double f28838h;

    public zzy() {
        this(Double.NaN, false, -1, (ApplicationMetadata) null, -1, (zzam) null, Double.NaN);
    }

    /* renamed from: C0 */
    public final double mo29624C0() {
        return this.f28832b;
    }

    /* renamed from: D0 */
    public final boolean mo29625D0() {
        return this.f28833c;
    }

    /* renamed from: E0 */
    public final int mo29626E0() {
        return this.f28836f;
    }

    /* renamed from: F0 */
    public final ApplicationMetadata mo29627F0() {
        return this.f28835e;
    }

    /* renamed from: G0 */
    public final zzam mo29628G0() {
        return this.f28837g;
    }

    /* renamed from: H0 */
    public final double mo29629H0() {
        return this.f28838h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzy)) {
            return false;
        }
        zzy zzy = (zzy) obj;
        if (this.f28832b == zzy.f28832b && this.f28833c == zzy.f28833c && this.f28834d == zzy.f28834d && C10920a.m49143f(this.f28835e, zzy.f28835e) && this.f28836f == zzy.f28836f) {
            zzam zzam = this.f28837g;
            return C10920a.m49143f(zzam, zzam) && this.f28838h == zzy.f28838h;
        }
    }

    public final int hashCode() {
        return C7408m.m30029b(Double.valueOf(this.f28832b), Boolean.valueOf(this.f28833c), Integer.valueOf(this.f28834d), this.f28835e, Integer.valueOf(this.f28836f), this.f28837g, Double.valueOf(this.f28838h));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49522h(parcel, 2, this.f28832b);
        C11058b.m49517c(parcel, 3, this.f28833c);
        C11058b.m49527m(parcel, 4, this.f28834d);
        C11058b.m49535u(parcel, 5, this.f28835e, i, false);
        C11058b.m49527m(parcel, 6, this.f28836f);
        C11058b.m49535u(parcel, 7, this.f28837g, i, false);
        C11058b.m49522h(parcel, 8, this.f28838h);
        C11058b.m49516b(parcel, a);
    }

    public final int zzc() {
        return this.f28834d;
    }

    zzy(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, zzam zzam, double d2) {
        this.f28832b = d;
        this.f28833c = z;
        this.f28834d = i;
        this.f28835e = applicationMetadata;
        this.f28836f = i2;
        this.f28837g = zzam;
        this.f28838h = d2;
    }
}
