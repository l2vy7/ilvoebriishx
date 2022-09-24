package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.cast.framework.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7099a implements Parcelable.Creator<CastOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        LaunchOptions launchOptions = null;
        CastMediaOptions castMediaOptions = null;
        double d = 0.0d;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    arrayList = C11056a.m49502s(parcel2, D);
                    break;
                case 4:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 5:
                    launchOptions = (LaunchOptions) C11056a.m49499p(parcel2, D, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) C11056a.m49499p(parcel2, D, CastMediaOptions.CREATOR);
                    break;
                case 8:
                    z3 = C11056a.m49507x(parcel2, D);
                    break;
                case 9:
                    d = C11056a.m49509z(parcel2, D);
                    break;
                case 10:
                    z4 = C11056a.m49507x(parcel2, D);
                    break;
                case 11:
                    z5 = C11056a.m49507x(parcel2, D);
                    break;
                case 12:
                    z6 = C11056a.m49507x(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new CastOptions(str, arrayList, z, launchOptions, z2, castMediaOptions, z3, d, z4, z5, z6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CastOptions[i];
    }
}
