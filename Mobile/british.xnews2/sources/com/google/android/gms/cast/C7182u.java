package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p243q4.C10920a;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.u */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7182u implements Parcelable.Creator<MediaTrack> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 3:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 7:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 8:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 9:
                    arrayList = C11056a.m49502s(parcel2, D);
                    break;
                case 10:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new MediaTrack(j, i, str2, str3, str4, str5, i2, arrayList, C10920a.m49138a(str));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaTrack[i];
    }
}
