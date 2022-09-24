package p221j4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p226k5.C10640b;
import p226k5.C10641c;

/* renamed from: j4.p */
public abstract class C10622p extends C10640b implements C10621o {
    public C10622p() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo42740x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo42732z2((GoogleSignInAccount) C10641c.m48410a(parcel, GoogleSignInAccount.CREATOR), (Status) C10641c.m48410a(parcel, Status.CREATOR));
                break;
            case 102:
                mo42731D0((Status) C10641c.m48410a(parcel, Status.CREATOR));
                break;
            case 103:
                mo42735v1((Status) C10641c.m48410a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
