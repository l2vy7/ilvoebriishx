package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfd> CREATOR = new C8063pu();

    /* renamed from: b */
    public final int f42940b;
    @Deprecated

    /* renamed from: c */
    public final long f42941c;

    /* renamed from: d */
    public final Bundle f42942d;
    @Deprecated

    /* renamed from: e */
    public final int f42943e;

    /* renamed from: f */
    public final List<String> f42944f;

    /* renamed from: g */
    public final boolean f42945g;

    /* renamed from: h */
    public final int f42946h;

    /* renamed from: i */
    public final boolean f42947i;

    /* renamed from: j */
    public final String f42948j;

    /* renamed from: k */
    public final zzbkm f42949k;

    /* renamed from: l */
    public final Location f42950l;

    /* renamed from: m */
    public final String f42951m;

    /* renamed from: n */
    public final Bundle f42952n;

    /* renamed from: o */
    public final Bundle f42953o;

    /* renamed from: p */
    public final List<String> f42954p;

    /* renamed from: q */
    public final String f42955q;

    /* renamed from: r */
    public final String f42956r;
    @Deprecated

    /* renamed from: s */
    public final boolean f42957s;

    /* renamed from: t */
    public final zzbeu f42958t;

    /* renamed from: u */
    public final int f42959u;

    /* renamed from: v */
    public final String f42960v;

    /* renamed from: w */
    public final List<String> f42961w;

    /* renamed from: x */
    public final int f42962x;

    /* renamed from: y */
    public final String f42963y;

    public zzbfd(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzbkm zzbkm, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzbeu zzbeu, int i4, String str5, List<String> list3, int i5, String str6) {
        this.f42940b = i;
        this.f42941c = j;
        this.f42942d = bundle == null ? new Bundle() : bundle;
        this.f42943e = i2;
        this.f42944f = list;
        this.f42945g = z;
        this.f42946h = i3;
        this.f42947i = z2;
        this.f42948j = str;
        this.f42949k = zzbkm;
        this.f42950l = location;
        this.f42951m = str2;
        this.f42952n = bundle2 == null ? new Bundle() : bundle2;
        this.f42953o = bundle3;
        this.f42954p = list2;
        this.f42955q = str3;
        this.f42956r = str4;
        this.f42957s = z3;
        this.f42958t = zzbeu;
        this.f42959u = i4;
        this.f42960v = str5;
        this.f42961w = list3 == null ? new ArrayList<>() : list3;
        this.f42962x = i5;
        this.f42963y = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfd)) {
            return false;
        }
        zzbfd zzbfd = (zzbfd) obj;
        if (this.f42940b != zzbfd.f42940b || this.f42941c != zzbfd.f42941c || !eo0.m20403a(this.f42942d, zzbfd.f42942d) || this.f42943e != zzbfd.f42943e || !C7408m.m30028a(this.f42944f, zzbfd.f42944f) || this.f42945g != zzbfd.f42945g || this.f42946h != zzbfd.f42946h || this.f42947i != zzbfd.f42947i || !C7408m.m30028a(this.f42948j, zzbfd.f42948j) || !C7408m.m30028a(this.f42949k, zzbfd.f42949k) || !C7408m.m30028a(this.f42950l, zzbfd.f42950l) || !C7408m.m30028a(this.f42951m, zzbfd.f42951m) || !eo0.m20403a(this.f42952n, zzbfd.f42952n) || !eo0.m20403a(this.f42953o, zzbfd.f42953o) || !C7408m.m30028a(this.f42954p, zzbfd.f42954p) || !C7408m.m30028a(this.f42955q, zzbfd.f42955q) || !C7408m.m30028a(this.f42956r, zzbfd.f42956r) || this.f42957s != zzbfd.f42957s || this.f42959u != zzbfd.f42959u || !C7408m.m30028a(this.f42960v, zzbfd.f42960v) || !C7408m.m30028a(this.f42961w, zzbfd.f42961w) || this.f42962x != zzbfd.f42962x || !C7408m.m30028a(this.f42963y, zzbfd.f42963y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f42940b), Long.valueOf(this.f42941c), this.f42942d, Integer.valueOf(this.f42943e), this.f42944f, Boolean.valueOf(this.f42945g), Integer.valueOf(this.f42946h), Boolean.valueOf(this.f42947i), this.f42948j, this.f42949k, this.f42950l, this.f42951m, this.f42952n, this.f42953o, this.f42954p, this.f42955q, this.f42956r, Boolean.valueOf(this.f42957s), Integer.valueOf(this.f42959u), this.f42960v, this.f42961w, Integer.valueOf(this.f42962x), this.f42963y);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f42940b);
        C11058b.m49531q(parcel, 2, this.f42941c);
        C11058b.m49519e(parcel, 3, this.f42942d, false);
        C11058b.m49527m(parcel, 4, this.f42943e);
        C11058b.m49539y(parcel, 5, this.f42944f, false);
        C11058b.m49517c(parcel, 6, this.f42945g);
        C11058b.m49527m(parcel, 7, this.f42946h);
        C11058b.m49517c(parcel, 8, this.f42947i);
        C11058b.m49537w(parcel, 9, this.f42948j, false);
        C11058b.m49535u(parcel, 10, this.f42949k, i, false);
        C11058b.m49535u(parcel, 11, this.f42950l, i, false);
        C11058b.m49537w(parcel, 12, this.f42951m, false);
        C11058b.m49519e(parcel, 13, this.f42952n, false);
        C11058b.m49519e(parcel, 14, this.f42953o, false);
        C11058b.m49539y(parcel, 15, this.f42954p, false);
        C11058b.m49537w(parcel, 16, this.f42955q, false);
        C11058b.m49537w(parcel, 17, this.f42956r, false);
        C11058b.m49517c(parcel, 18, this.f42957s);
        C11058b.m49535u(parcel, 19, this.f42958t, i, false);
        C11058b.m49527m(parcel, 20, this.f42959u);
        C11058b.m49537w(parcel, 21, this.f42960v, false);
        C11058b.m49539y(parcel, 22, this.f42961w, false);
        C11058b.m49527m(parcel, 23, this.f42962x);
        C11058b.m49537w(parcel, 24, this.f42963y, false);
        C11058b.m49516b(parcel, a);
    }
}
