package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p132p5.C10875i;
import p257v4.C11058b;

public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new C10875i();

    /* renamed from: b */
    private final String f44862b;

    /* renamed from: c */
    private final long f44863c;

    /* renamed from: d */
    private final short f44864d;

    /* renamed from: e */
    private final double f44865e;

    /* renamed from: f */
    private final double f44866f;

    /* renamed from: g */
    private final float f44867g;

    /* renamed from: h */
    private final int f44868h;

    /* renamed from: i */
    private final int f44869i;

    /* renamed from: j */
    private final int f44870j;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f44864d = s;
                this.f44862b = str;
                this.f44865e = d;
                this.f44866f = d2;
                this.f44867g = f;
                this.f44863c = j;
                this.f44868h = i4;
                this.f44869i = i2;
                this.f44870j = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: C0 */
    public final String mo37294C0() {
        return this.f44862b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f44867g == zzbh.f44867g && this.f44865e == zzbh.f44865e && this.f44866f == zzbh.f44866f && this.f44864d == zzbh.f44864d;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44865e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44866f);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f44867g)) * 31) + this.f44864d) * 31) + this.f44868h;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f44864d != 1 ? null : "CIRCLE";
        objArr[1] = this.f44862b.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f44868h);
        objArr[3] = Double.valueOf(this.f44865e);
        objArr[4] = Double.valueOf(this.f44866f);
        objArr[5] = Float.valueOf(this.f44867g);
        objArr[6] = Integer.valueOf(this.f44869i / 1000);
        objArr[7] = Integer.valueOf(this.f44870j);
        objArr[8] = Long.valueOf(this.f44863c);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, mo37294C0(), false);
        C11058b.m49531q(parcel, 2, this.f44863c);
        C11058b.m49536v(parcel, 3, this.f44864d);
        C11058b.m49522h(parcel, 4, this.f44865e);
        C11058b.m49522h(parcel, 5, this.f44866f);
        C11058b.m49524j(parcel, 6, this.f44867g);
        C11058b.m49527m(parcel, 7, this.f44868h);
        C11058b.m49527m(parcel, 8, this.f44869i);
        C11058b.m49527m(parcel, 9, this.f44870j);
        C11058b.m49516b(parcel, a);
    }
}
