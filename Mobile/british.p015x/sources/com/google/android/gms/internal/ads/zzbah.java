package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbah> CREATOR = new C8129rp();
    @GuardedBy("this")

    /* renamed from: b */
    private ParcelFileDescriptor f42918b;
    @GuardedBy("this")

    /* renamed from: c */
    private final boolean f42919c;
    @GuardedBy("this")

    /* renamed from: d */
    private final boolean f42920d;
    @GuardedBy("this")

    /* renamed from: e */
    private final long f42921e;
    @GuardedBy("this")

    /* renamed from: f */
    private final boolean f42922f;

    public zzbah() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    /* renamed from: C0 */
    public final synchronized long mo36227C0() {
        return this.f42921e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final synchronized ParcelFileDescriptor mo36228D0() {
        return this.f42918b;
    }

    /* renamed from: E0 */
    public final synchronized InputStream mo36229E0() {
        ParcelFileDescriptor parcelFileDescriptor = this.f42918b;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f42918b = null;
        return autoCloseInputStream;
    }

    /* renamed from: F0 */
    public final synchronized boolean mo36230F0() {
        return this.f42919c;
    }

    /* renamed from: G0 */
    public final synchronized boolean mo36231G0() {
        return this.f42918b != null;
    }

    /* renamed from: H0 */
    public final synchronized boolean mo36232H0() {
        return this.f42920d;
    }

    /* renamed from: I0 */
    public final synchronized boolean mo36233I0() {
        return this.f42922f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, mo36228D0(), i, false);
        C11058b.m49517c(parcel, 3, mo36230F0());
        C11058b.m49517c(parcel, 4, mo36232H0());
        C11058b.m49531q(parcel, 5, mo36227C0());
        C11058b.m49517c(parcel, 6, mo36233I0());
        C11058b.m49516b(parcel, a);
    }

    public zzbah(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f42918b = parcelFileDescriptor;
        this.f42919c = z;
        this.f42920d = z2;
        this.f42921e = j;
        this.f42922f = z3;
    }
}
