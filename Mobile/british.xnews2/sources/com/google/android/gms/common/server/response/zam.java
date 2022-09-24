package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C7460b();

    /* renamed from: b */
    final int f29442b;

    /* renamed from: c */
    final String f29443c;

    /* renamed from: d */
    final FastJsonResponse.Field<?, ?> f29444d;

    zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.f29442b = i;
        this.f29443c = str;
        this.f29444d = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29442b);
        C11058b.m49537w(parcel, 2, this.f29443c, false);
        C11058b.m49535u(parcel, 3, this.f29444d, i, false);
        C11058b.m49516b(parcel, a);
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f29442b = 1;
        this.f29443c = str;
        this.f29444d = field;
    }
}
