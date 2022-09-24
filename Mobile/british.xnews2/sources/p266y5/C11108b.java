package p266y5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
import p228l5.C10714b;
import p228l5.C10715c;

/* renamed from: y5.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C11108b extends C10714b implements C11109c {
    public C11108b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final boolean mo42872b2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C10715c.m48546a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) C10715c.m48546a(parcel, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) C10715c.m48546a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) C10715c.m48546a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C10715c.m48546a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C10715c.m48546a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo29897D1((zak) C10715c.m48546a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) C10715c.m48546a(parcel, zag.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
