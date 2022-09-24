package p258v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.zzi;
import p257v4.C11056a;

/* renamed from: v5.d */
public final class C11062d implements Parcelable.Creator<zzi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        long j = 0;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 4:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 5:
                    d = C11056a.m49509z(parcel2, D);
                    break;
                case 6:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 7:
                    bArr = C11056a.m49490g(parcel2, D);
                    break;
                case 8:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 9:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzi(str, j, z, d, str2, bArr, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
