package com.google.android.gms.internal.p197authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p226k5.C10647i;
import p257v4.C11058b;

/* renamed from: com.google.android.gms.internal.auth-api.zzy */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new C10647i();

    /* renamed from: b */
    private final Credential f43128b;

    public zzy(Credential credential) {
        this.f43128b = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, this.f43128b, i, false);
        C11058b.m49516b(parcel, a);
    }
}
