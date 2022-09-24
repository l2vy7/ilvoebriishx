package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C7406l0();

    /* renamed from: b */
    final int f29389b;

    /* renamed from: c */
    private final int f29390c;

    /* renamed from: d */
    private final int f29391d;
    @Deprecated

    /* renamed from: e */
    private final Scope[] f29392e;

    zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.f29389b = i;
        this.f29390c = i2;
        this.f29391d = i3;
        this.f29392e = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29389b);
        C11058b.m49527m(parcel, 2, this.f29390c);
        C11058b.m49527m(parcel, 3, this.f29391d);
        C11058b.m49540z(parcel, 4, this.f29392e, i, false);
        C11058b.m49516b(parcel, a);
    }
}
