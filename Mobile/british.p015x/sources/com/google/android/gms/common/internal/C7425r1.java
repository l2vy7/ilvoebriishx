package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;
import p232m5.C10797a;

/* renamed from: com.google.android.gms.common.internal.r1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7425r1 extends C10797a implements C7432t1 {
    C7425r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() throws RemoteException {
        Parcel x = mo42968x(2, mo42967b2());
        int readInt = x.readInt();
        x.recycle();
        return readInt;
    }

    public final C10487a zzd() throws RemoteException {
        Parcel x = mo42968x(1, mo42967b2());
        C10487a b2 = C10487a.C10488a.m48193b2(x.readStrongBinder());
        x.recycle();
        return b2;
    }
}
