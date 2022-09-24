package p226k5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.internal.p197authapi.zzs;
import p257v4.C11056a;

/* renamed from: k5.f */
public final class C10644f implements Parcelable.Creator<zzs> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 1) {
                C11056a.m49480L(parcel, D);
            } else {
                credential = (Credential) C11056a.m49499p(parcel, D, Credential.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzs(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
