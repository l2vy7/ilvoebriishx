package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new C9705a();

    /* renamed from: b */
    private final int f46108b;

    /* renamed from: c */
    private final String f46109c;

    /* renamed from: d */
    private final String f46110d;

    /* renamed from: e */
    private final String f46111e;

    PlaceReport(int i, String str, String str2, String str3) {
        this.f46108b = i;
        this.f46109c = str;
        this.f46110d = str2;
        this.f46111e = str3;
    }

    /* renamed from: C0 */
    public String mo38758C0() {
        return this.f46109c;
    }

    /* renamed from: D0 */
    public String mo38759D0() {
        return this.f46110d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C7408m.m30028a(this.f46109c, placeReport.f46109c) && C7408m.m30028a(this.f46110d, placeReport.f46110d) && C7408m.m30028a(this.f46111e, placeReport.f46111e);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f46109c, this.f46110d, this.f46111e);
    }

    public String toString() {
        C7408m.C7409a c = C7408m.m30030c(this);
        c.mo30140a("placeId", this.f46109c);
        c.mo30140a("tag", this.f46110d);
        if (!C3791bd.UNKNOWN_CONTENT_TYPE.equals(this.f46111e)) {
            c.mo30140a("source", this.f46111e);
        }
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f46108b);
        C11058b.m49537w(parcel, 2, mo38758C0(), false);
        C11058b.m49537w(parcel, 3, mo38759D0(), false);
        C11058b.m49537w(parcel, 4, this.f46111e, false);
        C11058b.m49516b(parcel, a);
    }
}
