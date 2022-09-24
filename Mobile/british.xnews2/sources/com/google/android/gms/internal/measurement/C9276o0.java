package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public class C9276o0 implements IInterface {

    /* renamed from: b */
    private final IBinder f45332b;

    /* renamed from: c */
    private final String f45333c;

    protected C9276o0(IBinder iBinder, String str) {
        this.f45332b = iBinder;
        this.f45333c = str;
    }

    public final IBinder asBinder() {
        return this.f45332b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo37765b2(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f45332b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public final void mo37766f3(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45332b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo37767x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45333c);
        return obtain;
    }
}
