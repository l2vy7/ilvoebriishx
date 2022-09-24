package p108l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CredentialsData;
import p256v4.C11056a;

/* renamed from: l4.j */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10684j implements Parcelable.Creator<CredentialsData> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str = C11056a.m49500q(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                str2 = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new CredentialsData(str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CredentialsData[i];
    }
}
