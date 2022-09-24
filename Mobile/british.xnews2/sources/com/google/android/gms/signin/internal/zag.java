package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p256v4.C11058b;
import p266y5.C11110d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zag extends AbstractSafeParcelable implements C7341k {
    public static final Parcelable.Creator<zag> CREATOR = new C11110d();

    /* renamed from: b */
    private final List<String> f47005b;

    /* renamed from: c */
    private final String f47006c;

    public zag(List<String> list, String str) {
        this.f47005b = list;
        this.f47006c = str;
    }

    /* renamed from: p0 */
    public final Status mo29527p0() {
        if (this.f47006c != null) {
            return Status.f28882g;
        }
        return Status.f28886k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49539y(parcel, 1, this.f47005b, false);
        C11058b.m49537w(parcel, 2, this.f47006c, false);
        C11058b.m49516b(parcel, a);
    }
}
