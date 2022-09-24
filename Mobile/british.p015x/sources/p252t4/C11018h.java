package p252t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import p257v4.C11056a;

/* renamed from: t4.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C11018h implements Parcelable.Creator<Feature> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                j = C11056a.m49476H(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new Feature(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
