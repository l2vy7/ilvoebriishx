package p109l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import p244q4.C10920a;
import p257v4.C11056a;

/* renamed from: l4.i0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10683i0 implements Parcelable.Creator<MediaError> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        while (true) {
            long j2 = j;
            while (parcel.dataPosition() < M) {
                int D = C11056a.m49472D(parcel);
                int w = C11056a.m49506w(D);
                if (w == 2) {
                    str2 = C11056a.m49500q(parcel, D);
                } else if (w == 3) {
                    j = C11056a.m49476H(parcel, D);
                } else if (w == 4) {
                    num = C11056a.m49475G(parcel, D);
                } else if (w == 5) {
                    str3 = C11056a.m49500q(parcel, D);
                } else if (w != 6) {
                    C11056a.m49480L(parcel, D);
                } else {
                    str = C11056a.m49500q(parcel, D);
                }
            }
            C11056a.m49505v(parcel, M);
            return new MediaError(str2, j2, num, str3, C10920a.m49138a(str));
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaError[i];
    }
}
