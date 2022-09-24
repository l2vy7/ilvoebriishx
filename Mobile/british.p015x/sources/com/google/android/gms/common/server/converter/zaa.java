package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C7455a();

    /* renamed from: b */
    final int f29416b;

    /* renamed from: c */
    private final StringToIntConverter f29417c;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f29416b = i;
        this.f29417c = stringToIntConverter;
    }

    /* renamed from: C0 */
    public static zaa m30117C0(FastJsonResponse.C7458a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: D0 */
    public final FastJsonResponse.C7458a<?, ?> mo30203D0() {
        StringToIntConverter stringToIntConverter = this.f29417c;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29416b);
        C11058b.m49535u(parcel, 2, this.f29417c, i, false);
        C11058b.m49516b(parcel, a);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f29416b = 1;
        this.f29417c = stringToIntConverter;
    }
}
