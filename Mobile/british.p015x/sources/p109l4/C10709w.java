package p109l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakInfo;
import p257v4.C11056a;

/* renamed from: l4.w */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10709w implements Parcelable.Creator<AdBreakInfo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String[] strArr = null;
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 3:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 4:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 5:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 6:
                    strArr = C11056a.m49501r(parcel2, D);
                    break;
                case 7:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 8:
                    z3 = C11056a.m49507x(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new AdBreakInfo(j, str, j2, z, strArr, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdBreakInfo[i];
    }
}
