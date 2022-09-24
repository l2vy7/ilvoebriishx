package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;
import p256v4.C11058b;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9890r implements Parcelable.Creator {
    /* renamed from: a */
    static void m45331a(zzau zzau, Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, zzau.f46937b, false);
        C11058b.m49535u(parcel, 3, zzau.f46938c, i, false);
        C11058b.m49537w(parcel, 4, zzau.f46939d, false);
        C11058b.m49531q(parcel, 5, zzau.f46940e);
        C11058b.m49516b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        zzas zzas = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 3) {
                zzas = (zzas) C11056a.m49499p(parcel, D, zzas.CREATOR);
            } else if (w == 4) {
                str2 = C11056a.m49500q(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                j = C11056a.m49476H(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzau(str, zzas, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
