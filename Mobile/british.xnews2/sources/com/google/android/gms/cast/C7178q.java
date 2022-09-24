package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.q */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7178q implements Parcelable.Creator<MediaQueueData> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
        ArrayList<MediaQueueItem> arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 5:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    mediaQueueContainerMetadata = (MediaQueueContainerMetadata) C11056a.m49499p(parcel2, D, MediaQueueContainerMetadata.CREATOR);
                    break;
                case 7:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    arrayList = C11056a.m49504u(parcel2, D, MediaQueueItem.CREATOR);
                    break;
                case 9:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 10:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new MediaQueueData(str, str2, i, str3, mediaQueueContainerMetadata, i2, arrayList, i3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueData[i];
    }
}
