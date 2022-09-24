package p251s5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: s5.k */
public final class C10980k implements Parcelable.Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                arrayList = C11056a.m49504u(parcel, D, DetectedActivity.CREATOR);
            } else if (w == 2) {
                j = C11056a.m49476H(parcel, D);
            } else if (w == 3) {
                j2 = C11056a.m49476H(parcel, D);
            } else if (w == 4) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                bundle = C11056a.m49489f(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
