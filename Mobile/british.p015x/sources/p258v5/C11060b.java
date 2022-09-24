package p258v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.zzi;
import p257v4.C11056a;

/* renamed from: v5.b */
public final class C11060b implements Parcelable.Creator<Configuration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        zzi[] zziArr = null;
        String[] strArr = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 3) {
                zziArr = (zzi[]) C11056a.m49503t(parcel, D, zzi.CREATOR);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                strArr = C11056a.m49501r(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new Configuration(i, zziArr, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
