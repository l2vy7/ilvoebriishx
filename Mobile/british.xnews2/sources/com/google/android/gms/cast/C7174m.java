package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.m */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7174m implements Parcelable.Creator<MediaMetadata> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ArrayList<WebImage> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                arrayList = C11056a.m49504u(parcel, D, WebImage.CREATOR);
            } else if (w == 3) {
                bundle = C11056a.m49489f(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new MediaMetadata(arrayList, bundle, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaMetadata[i];
    }
}
