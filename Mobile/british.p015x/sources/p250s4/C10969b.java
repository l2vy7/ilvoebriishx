package p250s4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.zzc;
import p257v4.C11056a;

/* renamed from: s4.b */
public final class C10969b implements Parcelable.Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 2) {
                j2 = C11056a.m49476H(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                j = C11056a.m49476H(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzc(z, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
