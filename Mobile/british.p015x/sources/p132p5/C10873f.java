package p132p5;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzo;

/* renamed from: p5.f */
public final class C10873f extends C10868a implements C10872e {
    C10873f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: W4 */
    public final void mo43054W4(zzbf zzbf) throws RemoteException {
        Parcel x = mo43051x();
        C10878l.m48897b(x, zzbf);
        mo43050f3(59, x);
    }

    /* renamed from: n3 */
    public final void mo43055n3(zzo zzo) throws RemoteException {
        Parcel x = mo43051x();
        C10878l.m48897b(x, zzo);
        mo43050f3(75, x);
    }

    public final Location zza(String str) throws RemoteException {
        Parcel x = mo43051x();
        x.writeString(str);
        Parcel b2 = mo43049b2(21, x);
        Location location = (Location) C10878l.m48896a(b2, Location.CREATOR);
        b2.recycle();
        return location;
    }

    public final void zza(boolean z) throws RemoteException {
        Parcel x = mo43051x();
        C10878l.m48898c(x, z);
        mo43050f3(12, x);
    }
}
