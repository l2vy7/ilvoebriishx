package p131p5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzad;
import p256v4.C11056a;

/* renamed from: p5.b */
public final class C10869b implements Parcelable.Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Status status = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 1) {
                C11056a.m49480L(parcel, D);
            } else {
                status = (Status) C11056a.m49499p(parcel, D, Status.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
