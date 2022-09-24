package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;
import p256v4.C11058b;

/* renamed from: com.google.android.gms.measurement.internal.a9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9720a9 implements Parcelable.Creator {
    /* renamed from: a */
    static void m45000a(zzks zzks, Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, zzks.f46941b);
        C11058b.m49537w(parcel, 2, zzks.f46942c, false);
        C11058b.m49531q(parcel, 3, zzks.f46943d);
        C11058b.m49533s(parcel, 4, zzks.f46944e, false);
        C11058b.m49525k(parcel, 5, (Float) null, false);
        C11058b.m49537w(parcel, 6, zzks.f46945f, false);
        C11058b.m49537w(parcel, 7, zzks.f46946g, false);
        C11058b.m49523i(parcel, 8, zzks.f46947h, false);
        C11058b.m49516b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 4:
                    l = C11056a.m49477I(parcel2, D);
                    break;
                case 5:
                    f = C11056a.m49471C(parcel2, D);
                    break;
                case 6:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 7:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 8:
                    d = C11056a.m49469A(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzks(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzks[i];
    }
}
