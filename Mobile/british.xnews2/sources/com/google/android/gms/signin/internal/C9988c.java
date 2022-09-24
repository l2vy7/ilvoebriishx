package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C7395i;
import p228l5.C10713a;
import p228l5.C10715c;
import p266y5.C11109c;

/* renamed from: com.google.android.gms.signin.internal.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9988c extends C10713a {
    C9988c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: n6 */
    public final void mo39387n6(int i) throws RemoteException {
        Parcel x = mo42870x();
        x.writeInt(i);
        mo42868f3(7, x);
    }

    /* renamed from: o6 */
    public final void mo39388o6(C7395i iVar, int i, boolean z) throws RemoteException {
        Parcel x = mo42870x();
        C10715c.m48549d(x, iVar);
        x.writeInt(i);
        C10715c.m48547b(x, z);
        mo42868f3(9, x);
    }

    /* renamed from: p6 */
    public final void mo39389p6(zai zai, C11109c cVar) throws RemoteException {
        Parcel x = mo42870x();
        C10715c.m48548c(x, zai);
        C10715c.m48549d(x, cVar);
        mo42868f3(12, x);
    }
}
