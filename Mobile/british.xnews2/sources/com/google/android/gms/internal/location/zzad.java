package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p131p5.C10869b;
import p256v4.C11058b;

public final class zzad extends AbstractSafeParcelable implements C7341k {
    public static final Parcelable.Creator<zzad> CREATOR = new C10869b();

    /* renamed from: c */
    private static final zzad f44845c = new zzad(Status.f28882g);

    /* renamed from: b */
    private final Status f44846b;

    public zzad(Status status) {
        this.f44846b = status;
    }

    /* renamed from: p0 */
    public final Status mo29527p0() {
        return this.f44846b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, mo29527p0(), i, false);
        C11058b.m49516b(parcel, a);
    }
}
