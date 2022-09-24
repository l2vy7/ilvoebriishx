package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.data.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7359c implements Parcelable.Creator<DataHolder> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                strArr = C11056a.m49501r(parcel, D);
            } else if (w == 2) {
                cursorWindowArr = (CursorWindow[]) C11056a.m49503t(parcel, D, CursorWindow.CREATOR);
            } else if (w == 3) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w == 4) {
                bundle = C11056a.m49489f(parcel, D);
            } else if (w != 1000) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo29982E0();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
