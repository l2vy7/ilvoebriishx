package p250s5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import p256v4.C11056a;

/* renamed from: s5.i */
public final class C10978i implements Parcelable.Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                status = (Status) C11056a.m49499p(parcel, D, Status.CREATOR);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                locationSettingsStates = (LocationSettingsStates) C11056a.m49499p(parcel, D, LocationSettingsStates.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
