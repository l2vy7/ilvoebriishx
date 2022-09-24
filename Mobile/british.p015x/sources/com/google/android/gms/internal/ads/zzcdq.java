package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p257v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcdq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdq> CREATOR = new ui0();

    /* renamed from: b */
    public final Bundle f21150b;

    /* renamed from: c */
    public final zzcjf f21151c;

    /* renamed from: d */
    public final ApplicationInfo f21152d;

    /* renamed from: e */
    public final String f21153e;

    /* renamed from: f */
    public final List<String> f21154f;

    /* renamed from: g */
    public final PackageInfo f21155g;

    /* renamed from: h */
    public final String f21156h;

    /* renamed from: i */
    public final String f21157i;

    /* renamed from: j */
    public zzffu f21158j;

    /* renamed from: k */
    public String f21159k;

    public zzcdq(Bundle bundle, zzcjf zzcjf, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, zzffu zzffu, String str4) {
        this.f21150b = bundle;
        this.f21151c = zzcjf;
        this.f21153e = str;
        this.f21152d = applicationInfo;
        this.f21154f = list;
        this.f21155g = packageInfo;
        this.f21156h = str2;
        this.f21157i = str3;
        this.f21158j = zzffu;
        this.f21159k = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49519e(parcel, 1, this.f21150b, false);
        C11058b.m49535u(parcel, 2, this.f21151c, i, false);
        C11058b.m49535u(parcel, 3, this.f21152d, i, false);
        C11058b.m49537w(parcel, 4, this.f21153e, false);
        C11058b.m49539y(parcel, 5, this.f21154f, false);
        C11058b.m49535u(parcel, 6, this.f21155g, i, false);
        C11058b.m49537w(parcel, 7, this.f21156h, false);
        C11058b.m49537w(parcel, 9, this.f21157i, false);
        C11058b.m49535u(parcel, 10, this.f21158j, i, false);
        C11058b.m49537w(parcel, 11, this.f21159k, false);
        C11058b.m49516b(parcel, a);
    }
}
