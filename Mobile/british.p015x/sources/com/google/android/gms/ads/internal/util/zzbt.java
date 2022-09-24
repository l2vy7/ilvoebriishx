package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8152sd;
import com.google.android.gms.internal.ads.C8223ud;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbt extends C8152sd implements zzbv {
    zzbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zze(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(2, x);
    }

    public final boolean zzf(C10487a aVar, String str, String str2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeString(str);
        x.writeString(str2);
        Parcel b2 = mo34694b2(1, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
