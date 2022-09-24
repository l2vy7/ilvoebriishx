package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.zzj;
import java.util.List;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.location.k */
public final class C9059k implements Parcelable.Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        zzj zzj = zzm.f44872f;
        List<ClientIdentity> list = zzm.f44871e;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                zzj = (zzj) C11056a.m49499p(parcel, D, zzj.CREATOR);
            } else if (w == 2) {
                list = C11056a.m49504u(parcel, D, ClientIdentity.CREATOR);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
