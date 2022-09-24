package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.location.g */
public final class C9699g implements Parcelable.Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ArrayList<String> arrayList = null;
        String str = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                arrayList = C11056a.m49502s(parcel, D);
            } else if (w == 2) {
                pendingIntent = (PendingIntent) C11056a.m49499p(parcel, D, PendingIntent.CREATOR);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzal(arrayList, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
