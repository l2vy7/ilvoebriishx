package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.o */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7176o implements Parcelable.Creator<MediaQueueContainerMetadata> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        ArrayList<MediaMetadata> arrayList = null;
        ArrayList<WebImage> arrayList2 = null;
        double d = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 3) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 4) {
                arrayList = C11056a.m49504u(parcel, D, MediaMetadata.CREATOR);
            } else if (w == 5) {
                arrayList2 = C11056a.m49504u(parcel, D, WebImage.CREATOR);
            } else if (w != 6) {
                C11056a.m49480L(parcel, D);
            } else {
                d = C11056a.m49509z(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new MediaQueueContainerMetadata(i, str, arrayList, arrayList2, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueContainerMetadata[i];
    }
}
