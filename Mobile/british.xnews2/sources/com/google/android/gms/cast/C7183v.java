package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.v */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7183v implements Parcelable.Creator<ApplicationMetadata> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        ArrayList<WebImage> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
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
                    arrayList = C11056a.m49504u(parcel, D, WebImage.CREATOR);
                    break;
                case 5:
                    arrayList2 = C11056a.m49502s(parcel, D);
                    break;
                case 6:
                    str3 = C11056a.m49500q(parcel, D);
                    break;
                case 7:
                    uri = (Uri) C11056a.m49499p(parcel, D, Uri.CREATOR);
                    break;
                case 8:
                    str4 = C11056a.m49500q(parcel, D);
                    break;
                case 9:
                    str5 = C11056a.m49500q(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new ApplicationMetadata(str, str2, arrayList, arrayList2, str3, uri, str4, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
