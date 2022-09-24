package p250s5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DetectedActivity;
import p256v4.C11056a;

/* renamed from: s5.o */
public final class C10984o implements Parcelable.Creator<DetectedActivity> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                i2 = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new DetectedActivity(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
