package p108l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.zzak;
import com.google.android.gms.cast.zzam;
import p256v4.C11056a;

/* renamed from: l4.l */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10688l implements Parcelable.Creator<zzam> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        zzak zzak = null;
        zzak zzak2 = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                zzak = (zzak) C11056a.m49499p(parcel, D, zzak.CREATOR);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                zzak2 = (zzak) C11056a.m49499p(parcel, D, zzak.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzam(zzak, zzak2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzam[i];
    }
}
