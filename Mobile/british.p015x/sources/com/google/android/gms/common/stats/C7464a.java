package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.stats.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7464a implements Parcelable.Creator<WakeLockEvent> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 4:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 6:
                    arrayList = C11056a.m49502s(parcel2, D);
                    break;
                case 8:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 10:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 11:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 12:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 14:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 15:
                    f = C11056a.m49470B(parcel2, D);
                    break;
                case 16:
                    j3 = C11056a.m49476H(parcel2, D);
                    break;
                case 17:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 18:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
