package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.auth.a */
public final class C7049a implements Parcelable.Creator<AccountChangeEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 2:
                    j = C11056a.m49476H(parcel, D);
                    break;
                case 3:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 4:
                    i2 = C11056a.m49474F(parcel, D);
                    break;
                case 5:
                    i3 = C11056a.m49474F(parcel, D);
                    break;
                case 6:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new AccountChangeEvent(i, j, str, i2, i3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
