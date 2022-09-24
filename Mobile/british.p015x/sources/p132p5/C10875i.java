package p132p5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbh;
import p257v4.C11056a;

/* renamed from: p5.i */
public final class C10875i implements Parcelable.Creator<zzbh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 2:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 3:
                    s = C11056a.m49478J(parcel2, D);
                    break;
                case 4:
                    d = C11056a.m49509z(parcel2, D);
                    break;
                case 5:
                    d2 = C11056a.m49509z(parcel2, D);
                    break;
                case 6:
                    f = C11056a.m49470B(parcel2, D);
                    break;
                case 7:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 9:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzbh(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
