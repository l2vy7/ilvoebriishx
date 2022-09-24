package com.google.android.gms.internal.p197authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p226k5.C10644f;
import p257v4.C11058b;

/* renamed from: com.google.android.gms.internal.auth-api.zzs */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C10644f();

    /* renamed from: b */
    private final Credential f43127b;

    public zzs(Credential credential) {
        this.f43127b = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, this.f43127b, i, false);
        C11058b.m49516b(parcel, a);
    }
}
