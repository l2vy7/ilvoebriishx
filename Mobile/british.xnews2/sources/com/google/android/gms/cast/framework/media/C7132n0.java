package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.n0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7132n0 extends C8430a implements C7134o0 {
    C7132n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    public final List<NotificationAction> zzf() throws RemoteException {
        Parcel b2 = mo36362b2(3, mo36365x());
        ArrayList<NotificationAction> createTypedArrayList = b2.createTypedArrayList(NotificationAction.CREATOR);
        b2.recycle();
        return createTypedArrayList;
    }

    public final int[] zzg() throws RemoteException {
        Parcel b2 = mo36362b2(4, mo36365x());
        int[] createIntArray = b2.createIntArray();
        b2.recycle();
        return createIntArray;
    }
}
