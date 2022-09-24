package p250s5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsStates;
import p256v4.C11056a;

/* renamed from: s5.j */
public final class C10979j implements Parcelable.Creator<LocationSettingsStates> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 2:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 3:
                    z3 = C11056a.m49507x(parcel, D);
                    break;
                case 4:
                    z4 = C11056a.m49507x(parcel, D);
                    break;
                case 5:
                    z5 = C11056a.m49507x(parcel, D);
                    break;
                case 6:
                    z6 = C11056a.m49507x(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
