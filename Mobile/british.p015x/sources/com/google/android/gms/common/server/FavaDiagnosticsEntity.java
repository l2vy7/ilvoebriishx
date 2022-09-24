package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;
import p266y4.C11106a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C11106a();

    /* renamed from: b */
    final int f29410b;

    /* renamed from: c */
    public final String f29411c;

    /* renamed from: d */
    public final int f29412d;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f29410b = i;
        this.f29411c = str;
        this.f29412d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29410b);
        C11058b.m49537w(parcel, 2, this.f29411c, false);
        C11058b.m49527m(parcel, 3, this.f29412d);
        C11058b.m49516b(parcel, a);
    }
}
