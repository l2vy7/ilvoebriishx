package p115m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;

/* renamed from: m4.d1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10748d1 extends C8430a implements C10754f1 {
    C10748d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    public final Bundle zze() throws RemoteException {
        Parcel b2 = mo36362b2(1, mo36365x());
        Bundle bundle = (Bundle) C8431a0.m40678c(b2, Bundle.CREATOR);
        b2.recycle();
        return bundle;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p115m4.C10747d0 zzf() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo36365x()
            r1 = 5
            android.os.Parcel r0 = r4.mo36362b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.ISessionManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p115m4.C10747d0
            if (r3 == 0) goto L_0x001f
            r1 = r2
            m4.d0 r1 = (p115m4.C10747d0) r1
            goto L_0x0025
        L_0x001f:
            m4.c0 r2 = new m4.c0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115m4.C10748d1.zzf():m4.d0");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p115m4.C10787v zzg() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo36365x()
            r1 = 6
            android.os.Parcel r0 = r4.mo36362b2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.IDiscoveryManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p115m4.C10787v
            if (r3 == 0) goto L_0x001f
            r1 = r2
            m4.v r1 = (p115m4.C10787v) r1
            goto L_0x0025
        L_0x001f:
            m4.u r2 = new m4.u
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115m4.C10748d1.zzg():m4.v");
    }

    public final boolean zzi() throws RemoteException {
        Parcel b2 = mo36362b2(12, mo36365x());
        boolean a = C8431a0.m40676a(b2);
        b2.recycle();
        return a;
    }
}
