package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.framework.media.c1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7111c1 implements Parcelable.Creator<NotificationAction> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 3) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                str2 = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new NotificationAction(str, i, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NotificationAction[i];
    }
}
