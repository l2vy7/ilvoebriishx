package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;
import p232m5.C10797a;
import p232m5.C10799c;

/* renamed from: com.google.android.gms.dynamite.n */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7485n extends C10797a {
    C7485n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: f3 */
    public final C10487a mo30262f3(C10487a aVar, String str, int i, C10487a aVar2) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        b2.writeInt(i);
        C10799c.m48741d(b2, aVar2);
        Parcel x = mo42968x(2, b2);
        C10487a b22 = C10487a.C10488a.m48193b2(x.readStrongBinder());
        x.recycle();
        return b22;
    }

    /* renamed from: m6 */
    public final C10487a mo30263m6(C10487a aVar, String str, int i, C10487a aVar2) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        b2.writeInt(i);
        C10799c.m48741d(b2, aVar2);
        Parcel x = mo42968x(3, b2);
        C10487a b22 = C10487a.C10488a.m48193b2(x.readStrongBinder());
        x.recycle();
        return b22;
    }
}
