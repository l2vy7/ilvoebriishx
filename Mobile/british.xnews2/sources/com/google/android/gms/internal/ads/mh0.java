package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class mh0 extends C8152sd implements oh0 {
    mh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* renamed from: b */
    public final void mo33543b(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(2, x);
    }

    /* renamed from: y1 */
    public final void mo33544y1(List<Uri> list) throws RemoteException {
        Parcel x = mo34697x();
        x.writeTypedList(list);
        mo34695f3(1, x);
    }
}
