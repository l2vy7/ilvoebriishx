package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C9803i9();

    /* renamed from: b */
    public final String f46948b;

    /* renamed from: c */
    public final String f46949c;

    /* renamed from: d */
    public final String f46950d;

    /* renamed from: e */
    public final String f46951e;

    /* renamed from: f */
    public final long f46952f;

    /* renamed from: g */
    public final long f46953g;

    /* renamed from: h */
    public final String f46954h;

    /* renamed from: i */
    public final boolean f46955i;

    /* renamed from: j */
    public final boolean f46956j;

    /* renamed from: k */
    public final long f46957k;

    /* renamed from: l */
    public final String f46958l;

    /* renamed from: m */
    public final long f46959m;

    /* renamed from: n */
    public final long f46960n;

    /* renamed from: o */
    public final int f46961o;

    /* renamed from: p */
    public final boolean f46962p;

    /* renamed from: q */
    public final boolean f46963q;

    /* renamed from: r */
    public final String f46964r;

    /* renamed from: s */
    public final Boolean f46965s;

    /* renamed from: t */
    public final long f46966t;

    /* renamed from: u */
    public final List f46967u;

    /* renamed from: v */
    public final String f46968v;

    /* renamed from: w */
    public final String f46969w;

    zzp(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9) {
        C4604n.m20094g(str);
        this.f46948b = str;
        this.f46949c = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f46950d = str3;
        this.f46957k = j;
        this.f46951e = str4;
        this.f46952f = j2;
        this.f46953g = j3;
        this.f46954h = str5;
        this.f46955i = z;
        this.f46956j = z2;
        this.f46958l = str6;
        this.f46959m = j4;
        this.f46960n = j5;
        this.f46961o = i;
        this.f46962p = z3;
        this.f46963q = z4;
        this.f46964r = str7;
        this.f46965s = bool;
        this.f46966t = j6;
        this.f46967u = list;
        this.f46968v = null;
        this.f46969w = str9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f46948b, false);
        C11058b.m49537w(parcel, 3, this.f46949c, false);
        C11058b.m49537w(parcel, 4, this.f46950d, false);
        C11058b.m49537w(parcel, 5, this.f46951e, false);
        C11058b.m49531q(parcel, 6, this.f46952f);
        C11058b.m49531q(parcel, 7, this.f46953g);
        C11058b.m49537w(parcel, 8, this.f46954h, false);
        C11058b.m49517c(parcel, 9, this.f46955i);
        C11058b.m49517c(parcel, 10, this.f46956j);
        C11058b.m49531q(parcel, 11, this.f46957k);
        C11058b.m49537w(parcel, 12, this.f46958l, false);
        C11058b.m49531q(parcel, 13, this.f46959m);
        C11058b.m49531q(parcel, 14, this.f46960n);
        C11058b.m49527m(parcel, 15, this.f46961o);
        C11058b.m49517c(parcel, 16, this.f46962p);
        C11058b.m49517c(parcel, 18, this.f46963q);
        C11058b.m49537w(parcel, 19, this.f46964r, false);
        C11058b.m49518d(parcel, 21, this.f46965s, false);
        C11058b.m49531q(parcel, 22, this.f46966t);
        C11058b.m49539y(parcel, 23, this.f46967u, false);
        C11058b.m49537w(parcel, 24, this.f46968v, false);
        C11058b.m49537w(parcel, 25, this.f46969w, false);
        C11058b.m49516b(parcel, a);
    }

    zzp(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9) {
        this.f46948b = str;
        this.f46949c = str2;
        this.f46950d = str3;
        this.f46957k = j3;
        this.f46951e = str4;
        this.f46952f = j;
        this.f46953g = j2;
        this.f46954h = str5;
        this.f46955i = z;
        this.f46956j = z2;
        this.f46958l = str6;
        this.f46959m = j4;
        this.f46960n = j5;
        this.f46961o = i;
        this.f46962p = z3;
        this.f46963q = z4;
        this.f46964r = str7;
        this.f46965s = bool;
        this.f46966t = j6;
        this.f46967u = list;
        this.f46968v = str8;
        this.f46969w = str9;
    }
}
