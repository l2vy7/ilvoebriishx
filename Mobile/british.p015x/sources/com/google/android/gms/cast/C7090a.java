package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.cast.a */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7090a implements Parcelable.Creator<AdBreakClipInfo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        VastAdsRequest vastAdsRequest = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 4:
                    j = C11056a.m49476H(parcel2, D);
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
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 9:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    str8 = C11056a.m49500q(parcel2, D);
                    break;
                case 11:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 12:
                    str9 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) C11056a.m49499p(parcel2, D, VastAdsRequest.CREATOR);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new AdBreakClipInfo(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, vastAdsRequest);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdBreakClipInfo[i];
    }
}
