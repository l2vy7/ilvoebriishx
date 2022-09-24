package p221j4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p226k5.C10639a;
import p226k5.C10641c;

/* renamed from: j4.r */
public final class C10624r extends C10639a implements C10623q {
    C10624r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: s3 */
    public final void mo42741s3(C10621o oVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel x = mo42753x();
        C10641c.m48411b(x, oVar);
        C10641c.m48412c(x, googleSignInOptions);
        mo42752b2(103, x);
    }
}
