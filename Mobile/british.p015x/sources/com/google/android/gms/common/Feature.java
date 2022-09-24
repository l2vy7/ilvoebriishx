package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import p252t4.C11018h;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C11018h();

    /* renamed from: b */
    private final String f28867b;
    @Deprecated

    /* renamed from: c */
    private final int f28868c;

    /* renamed from: d */
    private final long f28869d;

    public Feature(String str, int i, long j) {
        this.f28867b = str;
        this.f28868c = i;
        this.f28869d = j;
    }

    public Feature(String str, long j) {
        this.f28867b = str;
        this.f28869d = j;
        this.f28868c = -1;
    }

    /* renamed from: C0 */
    public String mo29691C0() {
        return this.f28867b;
    }

    /* renamed from: D0 */
    public long mo29692D0() {
        long j = this.f28869d;
        return j == -1 ? (long) this.f28868c : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo29691C0() == null || !mo29691C0().equals(feature.mo29691C0())) && (mo29691C0() != null || feature.mo29691C0() != null)) || mo29692D0() != feature.mo29692D0()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7408m.m30029b(mo29691C0(), Long.valueOf(mo29692D0()));
    }

    public final String toString() {
        C7408m.C7409a c = C7408m.m30030c(this);
        c.mo30140a(MediationMetaData.KEY_NAME, mo29691C0());
        c.mo30140a(MediationMetaData.KEY_VERSION, Long.valueOf(mo29692D0()));
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, mo29691C0(), false);
        C11058b.m49527m(parcel, 2, this.f28868c);
        C11058b.m49531q(parcel, 3, mo29692D0());
        C11058b.m49516b(parcel, a);
    }
}
