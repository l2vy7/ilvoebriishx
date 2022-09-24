package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p243q4.C10920a;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.w */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7184w implements Parcelable.Creator<SessionState> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        MediaLoadRequestData mediaLoadRequestData = null;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                mediaLoadRequestData = (MediaLoadRequestData) C11056a.m49499p(parcel, D, MediaLoadRequestData.CREATOR);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new SessionState(mediaLoadRequestData, C10920a.m49138a(str));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SessionState[i];
    }
}
