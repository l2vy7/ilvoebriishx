package p115m4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;

/* renamed from: m4.w */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10789w extends C8430a implements C10793y {
    C10789w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    /* renamed from: e2 */
    public final IBinder mo42962e2(Intent intent) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40679d(x, intent);
        Parcel b2 = mo36362b2(3, x);
        IBinder readStrongBinder = b2.readStrongBinder();
        b2.recycle();
        return readStrongBinder;
    }

    /* renamed from: z5 */
    public final int mo42963z5(Intent intent, int i, int i2) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40679d(x, intent);
        x.writeInt(i);
        x.writeInt(i2);
        Parcel b2 = mo36362b2(2, x);
        int readInt = b2.readInt();
        b2.recycle();
        return readInt;
    }

    public final void zze() throws RemoteException {
        mo36363f3(1, mo36365x());
    }

    public final void zzh() throws RemoteException {
        mo36363f3(4, mo36365x());
    }
}
