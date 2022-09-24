package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C7074a();

    /* renamed from: b */
    final int f28288b;

    /* renamed from: c */
    private int f28289c;

    /* renamed from: d */
    private Bundle f28290d;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f28288b = i;
        this.f28289c = i2;
        this.f28290d = bundle;
    }

    /* renamed from: C0 */
    public int mo29122C0() {
        return this.f28289c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28288b);
        C11058b.m49527m(parcel, 2, mo29122C0());
        C11058b.m49519e(parcel, 3, this.f28290d, false);
        C11058b.m49516b(parcel, a);
    }
}
