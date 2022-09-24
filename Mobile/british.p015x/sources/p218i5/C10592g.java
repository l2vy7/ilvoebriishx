package p218i5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;

/* renamed from: i5.g */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C10592g extends C10586a {
    C10592g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* renamed from: f3 */
    public final void mo42708f3(zza zza, C10591f fVar) throws RemoteException {
        Parcel x = mo42703x();
        C10588c.m48333b(x, zza);
        C10588c.m48334c(x, fVar);
        mo42702b2(1, x);
    }
}
