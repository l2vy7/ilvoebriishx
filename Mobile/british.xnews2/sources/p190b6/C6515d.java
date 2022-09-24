package p190b6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import p256v4.C11056a;

/* renamed from: b6.d */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C6515d implements Parcelable.Creator<LandmarkParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                f = C11056a.m49470B(parcel, D);
            } else if (w == 3) {
                f2 = C11056a.m49470B(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                i2 = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new LandmarkParcel(i, f, f2, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LandmarkParcel[i];
    }
}
