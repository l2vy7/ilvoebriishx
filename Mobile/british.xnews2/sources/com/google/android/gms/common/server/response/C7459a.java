package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.server.response.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7459a implements Parcelable.Creator<FastJsonResponse.Field> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 2:
                    i2 = C11056a.m49474F(parcel, D);
                    break;
                case 3:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 4:
                    i3 = C11056a.m49474F(parcel, D);
                    break;
                case 5:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 6:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 7:
                    i4 = C11056a.m49474F(parcel, D);
                    break;
                case 8:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                case 9:
                    zaa = (zaa) C11056a.m49499p(parcel, D, zaa.CREATOR);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaa);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
