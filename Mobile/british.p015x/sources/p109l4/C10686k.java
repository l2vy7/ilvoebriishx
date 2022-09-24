package p109l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.zzak;
import p257v4.C11056a;

/* renamed from: l4.k */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10686k implements Parcelable.Creator<zzak> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                f = C11056a.m49470B(parcel, D);
            } else if (w == 3) {
                f2 = C11056a.m49470B(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                f3 = C11056a.m49470B(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzak(f, f2, f3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzak[i];
    }
}
