package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;
import p231m5.C10797a;
import p231m5.C10799c;

/* renamed from: com.google.android.gms.dynamite.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7484m extends C10797a {
    C7484m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: f3 */
    public final int mo30255f3(C10487a aVar, String str, boolean z) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        C10799c.m48739b(b2, z);
        Parcel x = mo42968x(3, b2);
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    /* renamed from: m6 */
    public final int mo30256m6(C10487a aVar, String str, boolean z) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        C10799c.m48739b(b2, z);
        Parcel x = mo42968x(5, b2);
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    /* renamed from: n6 */
    public final C10487a mo30257n6(C10487a aVar, String str, int i) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        b2.writeInt(i);
        Parcel x = mo42968x(2, b2);
        C10487a b22 = C10487a.C10488a.m48193b2(x.readStrongBinder());
        x.recycle();
        return b22;
    }

    /* renamed from: o6 */
    public final C10487a mo30258o6(C10487a aVar, String str, int i, C10487a aVar2) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        b2.writeInt(i);
        C10799c.m48741d(b2, aVar2);
        Parcel x = mo42968x(8, b2);
        C10487a b22 = C10487a.C10488a.m48193b2(x.readStrongBinder());
        x.recycle();
        return b22;
    }

    /* renamed from: p6 */
    public final C10487a mo30259p6(C10487a aVar, String str, int i) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        b2.writeInt(i);
        Parcel x = mo42968x(4, b2);
        C10487a b22 = C10487a.C10488a.m48193b2(x.readStrongBinder());
        x.recycle();
        return b22;
    }

    /* renamed from: q6 */
    public final C10487a mo30260q6(C10487a aVar, String str, boolean z, long j) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48741d(b2, aVar);
        b2.writeString(str);
        C10799c.m48739b(b2, z);
        b2.writeLong(j);
        Parcel x = mo42968x(7, b2);
        C10487a b22 = C10487a.C10488a.m48193b2(x.readStrongBinder());
        x.recycle();
        return b22;
    }

    public final int zze() throws RemoteException {
        Parcel x = mo42968x(6, mo42967b2());
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }
}
