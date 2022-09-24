package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C7061a();

    /* renamed from: h */
    public static final int f28217h = 0;

    /* renamed from: i */
    public static final int f28218i = 1;

    /* renamed from: j */
    public static final int f28219j = 2;

    /* renamed from: k */
    public static final int f28220k = 3;

    /* renamed from: l */
    public static final int f28221l = 4;

    /* renamed from: m */
    public static final int f28222m = 5;

    /* renamed from: n */
    public static final int f28223n = 6;

    /* renamed from: o */
    public static final int f28224o = 7;

    /* renamed from: p */
    public static final int f28225p = 7;

    /* renamed from: b */
    private final int f28226b;

    /* renamed from: c */
    public final String f28227c;

    /* renamed from: d */
    public final int f28228d;

    /* renamed from: e */
    public final long f28229e;

    /* renamed from: f */
    public final byte[] f28230f;

    /* renamed from: g */
    private Bundle f28231g;

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f28226b = i;
        this.f28227c = str;
        this.f28228d = i2;
        this.f28229e = j;
        this.f28230f = bArr;
        this.f28231g = bundle;
    }

    public String toString() {
        String str = this.f28227c;
        int i = this.f28228d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f28227c, false);
        C11058b.m49527m(parcel, 2, this.f28228d);
        C11058b.m49531q(parcel, 3, this.f28229e);
        C11058b.m49520f(parcel, 4, this.f28230f, false);
        C11058b.m49519e(parcel, 5, this.f28231g, false);
        C11058b.m49527m(parcel, 1000, this.f28226b);
        C11058b.m49516b(parcel, a);
    }
}
