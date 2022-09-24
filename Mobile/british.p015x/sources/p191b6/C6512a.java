package p191b6;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.zza;
import p257v4.C11056a;

/* renamed from: b6.a */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C6512a implements Parcelable.Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                pointFArr = (PointF[]) C11056a.m49503t(parcel, D, PointF.CREATOR);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zza(pointFArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
