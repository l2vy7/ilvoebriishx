package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C7054e();

    /* renamed from: b */
    private final int f28158b;

    /* renamed from: c */
    private boolean f28159c;

    /* renamed from: d */
    private long f28160d;

    /* renamed from: e */
    private final boolean f28161e;

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f28158b = i;
        this.f28159c = z;
        this.f28160d = j;
        this.f28161e = z2;
    }

    /* renamed from: C0 */
    public long mo29022C0() {
        return this.f28160d;
    }

    /* renamed from: D0 */
    public boolean mo29023D0() {
        return this.f28161e;
    }

    /* renamed from: E0 */
    public boolean mo29024E0() {
        return this.f28159c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28158b);
        C11058b.m49517c(parcel, 2, mo29024E0());
        C11058b.m49531q(parcel, 3, mo29022C0());
        C11058b.m49517c(parcel, 4, mo29023D0());
        C11058b.m49516b(parcel, a);
    }
}
