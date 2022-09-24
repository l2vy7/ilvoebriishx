package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.server.response.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7460b implements Parcelable.Creator<zam> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                field = (FastJsonResponse.Field) C11056a.m49499p(parcel, D, FastJsonResponse.Field.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zam(i, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
