package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C9890r();

    /* renamed from: b */
    public final String f46937b;

    /* renamed from: c */
    public final zzas f46938c;

    /* renamed from: d */
    public final String f46939d;

    /* renamed from: e */
    public final long f46940e;

    zzau(zzau zzau, long j) {
        C4604n.m20098k(zzau);
        this.f46937b = zzau.f46937b;
        this.f46938c = zzau.f46938c;
        this.f46939d = zzau.f46939d;
        this.f46940e = j;
    }

    public final String toString() {
        String str = this.f46939d;
        String str2 = this.f46937b;
        String valueOf = String.valueOf(this.f46938c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C9890r.m45331a(this, parcel, i);
    }

    public zzau(String str, zzas zzas, String str2, long j) {
        this.f46937b = str;
        this.f46938c = zzas;
        this.f46939d = str2;
        this.f46940e = j;
    }
}
