package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;
import p257v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcab> CREATOR = new if0();

    /* renamed from: b */
    public final int f21085b;

    /* renamed from: c */
    public final int f21086c;

    /* renamed from: d */
    public final int f21087d;

    zzcab(int i, int i2, int i3) {
        this.f21085b = i;
        this.f21086c = i2;
        this.f21087d = i3;
    }

    /* renamed from: C0 */
    public static zzcab m21323C0(VersionInfo versionInfo) {
        return new zzcab(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcab)) {
            zzcab zzcab = (zzcab) obj;
            if (zzcab.f21087d == this.f21087d && zzcab.f21086c == this.f21086c && zzcab.f21085b == this.f21085b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f21085b, this.f21086c, this.f21087d});
    }

    public final String toString() {
        int i = this.f21085b;
        int i2 = this.f21086c;
        int i3 = this.f21087d;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f21085b);
        C11058b.m49527m(parcel, 2, this.f21086c);
        C11058b.m49527m(parcel, 3, this.f21087d);
        C11058b.m49516b(parcel, a);
    }
}
