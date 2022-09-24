package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;
import p231m5.C10798b;
import p231m5.C10799c;

/* renamed from: com.google.android.gms.common.internal.s1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C7429s1 extends C10798b implements C7432t1 {
    public C7429s1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b2 */
    public static C7432t1 m30069b2(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C7432t1 ? (C7432t1) queryLocalInterface : new C7425r1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo30147x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C10487a zzd = zzd();
            parcel2.writeNoException();
            C10799c.m48741d(parcel2, zzd);
        } else if (i != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
