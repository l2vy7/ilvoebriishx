package p108l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: l4.l0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10689l0 implements Parcelable.Creator<MediaStatus> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList<MediaQueueItem> arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    mediaInfo = (MediaInfo) C11056a.m49499p(parcel2, D, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 4:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 5:
                    d = C11056a.m49509z(parcel2, D);
                    break;
                case 6:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 7:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 9:
                    j3 = C11056a.m49476H(parcel2, D);
                    break;
                case 10:
                    d2 = C11056a.m49509z(parcel2, D);
                    break;
                case 11:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 12:
                    jArr = C11056a.m49496m(parcel2, D);
                    break;
                case 13:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 14:
                    i5 = C11056a.m49474F(parcel2, D);
                    break;
                case 15:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 16:
                    i6 = C11056a.m49474F(parcel2, D);
                    break;
                case 17:
                    arrayList = C11056a.m49504u(parcel2, D, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) C11056a.m49499p(parcel2, D, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) C11056a.m49499p(parcel2, D, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) C11056a.m49499p(parcel2, D, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) C11056a.m49499p(parcel2, D, MediaQueueData.CREATOR);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaStatus[i];
    }
}
