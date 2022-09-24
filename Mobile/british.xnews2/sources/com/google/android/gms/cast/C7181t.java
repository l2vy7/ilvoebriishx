package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.t */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7181t implements Parcelable.Creator<MediaQueueItem> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    mediaInfo = (MediaInfo) C11056a.m49499p(parcel2, D, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 5:
                    d = C11056a.m49509z(parcel2, D);
                    break;
                case 6:
                    d2 = C11056a.m49509z(parcel2, D);
                    break;
                case 7:
                    d3 = C11056a.m49509z(parcel2, D);
                    break;
                case 8:
                    jArr = C11056a.m49496m(parcel2, D);
                    break;
                case 9:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new MediaQueueItem(mediaInfo, i, z, d, d2, d3, jArr, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueItem[i];
    }
}
