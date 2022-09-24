package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.k */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7172k implements Parcelable.Creator<MediaLoadRequestData> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        MediaInfo mediaInfo = null;
        MediaQueueData mediaQueueData = null;
        Boolean bool = null;
        long[] jArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        double d = 0.0d;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    mediaInfo = (MediaInfo) C11056a.m49499p(parcel2, D, MediaInfo.CREATOR);
                    break;
                case 3:
                    mediaQueueData = (MediaQueueData) C11056a.m49499p(parcel2, D, MediaQueueData.CREATOR);
                    break;
                case 4:
                    bool = C11056a.m49508y(parcel2, D);
                    break;
                case 5:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 6:
                    d = C11056a.m49509z(parcel2, D);
                    break;
                case 7:
                    jArr = C11056a.m49496m(parcel2, D);
                    break;
                case 8:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 9:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 11:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 12:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d, jArr, str, str2, str3, str4, str5, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaLoadRequestData[i];
    }
}
