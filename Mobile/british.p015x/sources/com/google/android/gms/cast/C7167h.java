package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.cast.h */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7167h implements Parcelable.Creator<MediaInfo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        MediaMetadata mediaMetadata = null;
        ArrayList<MediaTrack> arrayList = null;
        TextTrackStyle textTrackStyle = null;
        String str3 = null;
        ArrayList<AdBreakInfo> arrayList2 = null;
        ArrayList<AdBreakClipInfo> arrayList3 = null;
        String str4 = null;
        VastAdsRequest vastAdsRequest = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) C11056a.m49499p(parcel2, D, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 7:
                    arrayList = C11056a.m49504u(parcel2, D, MediaTrack.CREATOR);
                    break;
                case 8:
                    textTrackStyle = (TextTrackStyle) C11056a.m49499p(parcel2, D, TextTrackStyle.CREATOR);
                    break;
                case 9:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    arrayList2 = C11056a.m49504u(parcel2, D, AdBreakInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = C11056a.m49504u(parcel2, D, AdBreakClipInfo.CREATOR);
                    break;
                case 12:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) C11056a.m49499p(parcel2, D, VastAdsRequest.CREATOR);
                    break;
                case 14:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 15:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 16:
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 17:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 18:
                    str8 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new MediaInfo(str, i, str2, mediaMetadata, j, arrayList, textTrackStyle, str3, arrayList2, arrayList3, str4, vastAdsRequest, j2, str5, str6, str7, str8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}
