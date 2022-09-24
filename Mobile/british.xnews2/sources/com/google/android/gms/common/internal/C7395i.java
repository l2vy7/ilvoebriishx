package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p231m5.C10798b;

/* renamed from: com.google.android.gms.common.internal.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public interface C7395i extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.i$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class C7396a extends C10798b implements C7395i {
        /* renamed from: b2 */
        public static C7395i m30009b2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C7395i ? (C7395i) queryLocalInterface : new C7422q1(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
