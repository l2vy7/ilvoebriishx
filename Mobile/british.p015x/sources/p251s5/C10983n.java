package p251s5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: s5.n */
public final class C10983n implements Parcelable.Creator<ActivityTransitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ArrayList<ActivityTransitionEvent> arrayList = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 1) {
                C11056a.m49480L(parcel, D);
            } else {
                arrayList = C11056a.m49504u(parcel, D, ActivityTransitionEvent.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new ActivityTransitionResult(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
