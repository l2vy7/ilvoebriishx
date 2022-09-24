package p267y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: y5.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C11110d implements Parcelable.Creator<zag> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                arrayList = C11056a.m49502s(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zag(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zag[i];
    }
}
