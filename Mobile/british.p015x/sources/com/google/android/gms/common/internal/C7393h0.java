package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;
import p229l5.C10713a;
import p229l5.C10715c;

/* renamed from: com.google.android.gms.common.internal.h0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7393h0 extends C10713a {
    C7393h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: n6 */
    public final C10487a mo30103n6(C10487a aVar, zax zax) throws RemoteException {
        Parcel x = mo42870x();
        C10715c.m48549d(x, aVar);
        C10715c.m48548c(x, zax);
        Parcel b2 = mo42867b2(2, x);
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }
}
