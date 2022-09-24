package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.List;
import p257v4.C11058b;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C9704l();

    /* renamed from: b */
    private final List<zzbh> f46078b;

    /* renamed from: c */
    private final int f46079c;

    /* renamed from: d */
    private final String f46080d;

    GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f46078b = list;
        this.f46079c = i;
        this.f46080d = str;
    }

    /* renamed from: C0 */
    public int mo38708C0() {
        return this.f46079c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f46078b);
        int i = this.f46079c;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f46080d);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49510A(parcel, 1, this.f46078b, false);
        C11058b.m49527m(parcel, 2, mo38708C0());
        C11058b.m49537w(parcel, 3, this.f46080d, false);
        C11058b.m49516b(parcel, a);
    }
}
