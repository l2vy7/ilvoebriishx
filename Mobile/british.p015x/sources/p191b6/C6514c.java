package p191b6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.zzf;
import p257v4.C11056a;

/* renamed from: b6.c */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C6514c implements Parcelable.Creator<zzf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 3:
                    i2 = C11056a.m49474F(parcel, D);
                    break;
                case 4:
                    i3 = C11056a.m49474F(parcel, D);
                    break;
                case 5:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 6:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 7:
                    f = C11056a.m49470B(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzf(i, i2, i3, z, z2, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
