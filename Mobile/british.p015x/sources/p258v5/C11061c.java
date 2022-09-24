package p258v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import p257v4.C11056a;

/* renamed from: v5.c */
public final class C11061c implements Parcelable.Creator<ExperimentTokens> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 3:
                    bArr = C11056a.m49490g(parcel, D);
                    break;
                case 4:
                    bArr2 = C11056a.m49491h(parcel, D);
                    break;
                case 5:
                    bArr3 = C11056a.m49491h(parcel, D);
                    break;
                case 6:
                    bArr4 = C11056a.m49491h(parcel, D);
                    break;
                case 7:
                    bArr5 = C11056a.m49491h(parcel, D);
                    break;
                case 8:
                    iArr = C11056a.m49494k(parcel, D);
                    break;
                case 9:
                    bArr6 = C11056a.m49491h(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
