package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.cast.a */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C8430a implements IInterface {

    /* renamed from: b */
    private final IBinder f43142b;

    /* renamed from: c */
    private final String f43143c;

    protected C8430a(IBinder iBinder, String str) {
        this.f43142b = iBinder;
        this.f43143c = str;
    }

    public final IBinder asBinder() {
        return this.f43142b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo36362b2(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f43142b.transact(i, parcel, parcel, 0);
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
    public final void mo36363f3(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f43142b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final void mo36364m6(int i, Parcel parcel) throws RemoteException {
        try {
            this.f43142b.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo36365x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f43143c);
        return obtain;
    }
}
