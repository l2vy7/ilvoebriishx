package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C9041y5();

    /* renamed from: b */
    private final String f44824b;

    /* renamed from: c */
    private final int f44825c;

    /* renamed from: d */
    public final int f44826d;

    /* renamed from: e */
    private final String f44827e;

    /* renamed from: f */
    private final String f44828f;

    /* renamed from: g */
    private final boolean f44829g;

    /* renamed from: h */
    public final String f44830h;

    /* renamed from: i */
    private final boolean f44831i;

    /* renamed from: j */
    private final int f44832j;

    public zzr(String str, int i, int i2, String str2, String str3, String str4, boolean z, C8882d5 d5Var) {
        this.f44824b = (String) C4604n.m20098k(str);
        this.f44825c = i;
        this.f44826d = i2;
        this.f44830h = str2;
        this.f44827e = str3;
        this.f44828f = str4;
        this.f44829g = !z;
        this.f44831i = z;
        this.f44832j = d5Var.zzc();
    }

    public zzr(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.f44824b = str;
        this.f44825c = i;
        this.f44826d = i2;
        this.f44827e = str2;
        this.f44828f = str3;
        this.f44829g = z;
        this.f44830h = str4;
        this.f44831i = z2;
        this.f44832j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzr = (zzr) obj;
            return C7408m.m30028a(this.f44824b, zzr.f44824b) && this.f44825c == zzr.f44825c && this.f44826d == zzr.f44826d && C7408m.m30028a(this.f44830h, zzr.f44830h) && C7408m.m30028a(this.f44827e, zzr.f44827e) && C7408m.m30028a(this.f44828f, zzr.f44828f) && this.f44829g == zzr.f44829g && this.f44831i == zzr.f44831i && this.f44832j == zzr.f44832j;
        }
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f44824b, Integer.valueOf(this.f44825c), Integer.valueOf(this.f44826d), this.f44830h, this.f44827e, this.f44828f, Boolean.valueOf(this.f44829g), Boolean.valueOf(this.f44831i), Integer.valueOf(this.f44832j));
    }

    public final String toString() {
        return "PlayLoggerContext[" + "package=" + this.f44824b + ',' + "packageVersionCode=" + this.f44825c + ',' + "logSource=" + this.f44826d + ',' + "logSourceName=" + this.f44830h + ',' + "uploadAccount=" + this.f44827e + ',' + "loggingId=" + this.f44828f + ',' + "logAndroidId=" + this.f44829g + ',' + "isAnonymous=" + this.f44831i + ',' + "qosTier=" + this.f44832j + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f44824b, false);
        C11058b.m49527m(parcel, 3, this.f44825c);
        C11058b.m49527m(parcel, 4, this.f44826d);
        C11058b.m49537w(parcel, 5, this.f44827e, false);
        C11058b.m49537w(parcel, 6, this.f44828f, false);
        C11058b.m49517c(parcel, 7, this.f44829g);
        C11058b.m49537w(parcel, 8, this.f44830h, false);
        C11058b.m49517c(parcel, 9, this.f44831i);
        C11058b.m49527m(parcel, 10, this.f44832j);
        C11058b.m49516b(parcel, a);
    }
}
