package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import p256v4.C11056a;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.aoy */
/* compiled from: IMASDK */
public final class aoy implements Parcelable.Creator<aox> {

    /* renamed from: a */
    private final /* synthetic */ int f15510a = 0;

    public aoy() {
    }

    public aoy(byte[] bArr) {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        if (this.f15510a != 0) {
            int M = C11056a.m49481M(parcel);
            int i = 0;
            String str2 = "";
            while (parcel.dataPosition() < M) {
                int D = C11056a.m49472D(parcel);
                int w = C11056a.m49506w(D);
                if (w == 1) {
                    str = C11056a.m49500q(parcel, D);
                } else if (w == 2) {
                    i = C11056a.m49474F(parcel, D);
                } else if (w != 3) {
                    C11056a.m49480L(parcel, D);
                } else {
                    str2 = C11056a.m49500q(parcel, D);
                }
            }
            C11056a.m49505v(parcel, M);
            return new aow(str, i, str2);
        }
        int M2 = C11056a.m49481M(parcel);
        while (parcel.dataPosition() < M2) {
            int D2 = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D2) != 1) {
                C11056a.m49480L(parcel, D2);
            } else {
                str = C11056a.m49500q(parcel, D2);
            }
        }
        C11056a.m49505v(parcel, M2);
        return new aox(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.f15510a != 0) {
            return new aow[i];
        }
        return new aox[i];
    }
}
