package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class zzks extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzks> CREATOR = new C9720a9();

    /* renamed from: b */
    public final int f46941b;

    /* renamed from: c */
    public final String f46942c;

    /* renamed from: d */
    public final long f46943d;

    /* renamed from: e */
    public final Long f46944e;

    /* renamed from: f */
    public final String f46945f;

    /* renamed from: g */
    public final String f46946g;

    /* renamed from: h */
    public final Double f46947h;

    zzks(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f46941b = i;
        this.f46942c = str;
        this.f46943d = j;
        this.f46944e = l;
        if (i == 1) {
            this.f46947h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f46947h = d;
        }
        this.f46945f = str2;
        this.f46946g = str3;
    }

    /* renamed from: C0 */
    public final Object mo39366C0() {
        Long l = this.f46944e;
        if (l != null) {
            return l;
        }
        Double d = this.f46947h;
        if (d != null) {
            return d;
        }
        String str = this.f46945f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C9720a9.m45000a(this, parcel, i);
    }

    zzks(C9730b9 b9Var) {
        this(b9Var.f46186c, b9Var.f46187d, b9Var.f46188e, b9Var.f46185b);
    }

    zzks(String str, long j, Object obj, String str2) {
        C4604n.m20094g(str);
        this.f46941b = 2;
        this.f46942c = str;
        this.f46943d = j;
        this.f46946g = str2;
        if (obj == null) {
            this.f46944e = null;
            this.f46947h = null;
            this.f46945f = null;
        } else if (obj instanceof Long) {
            this.f46944e = (Long) obj;
            this.f46947h = null;
            this.f46945f = null;
        } else if (obj instanceof String) {
            this.f46944e = null;
            this.f46947h = null;
            this.f46945f = (String) obj;
        } else if (obj instanceof Double) {
            this.f46944e = null;
            this.f46947h = (Double) obj;
            this.f46945f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
