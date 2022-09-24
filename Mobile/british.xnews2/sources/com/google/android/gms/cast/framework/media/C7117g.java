package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.framework.media.g */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7117g implements Parcelable.Creator<CastMediaOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        NotificationOptions notificationOptions = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 3:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                case 4:
                    iBinder = C11056a.m49473E(parcel, D);
                    break;
                case 5:
                    notificationOptions = (NotificationOptions) C11056a.m49499p(parcel, D, NotificationOptions.CREATOR);
                    break;
                case 6:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 7:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new CastMediaOptions(str, str2, iBinder, notificationOptions, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CastMediaOptions[i];
    }
}
