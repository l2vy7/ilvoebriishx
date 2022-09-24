package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.vision.g */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class C9517g implements IInterface {

    /* renamed from: b */
    private final IBinder f45644b;

    /* renamed from: c */
    private final String f45645c;

    protected C9517g(IBinder iBinder, String str) {
        this.f45644b = iBinder;
        this.f45645c = str;
    }

    public IBinder asBinder() {
        return this.f45644b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo38395b2(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f45644b.transact(i, parcel, parcel, 0);
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
    public final void mo38396f3(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45644b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo38397x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45645c);
        return obtain;
    }
}
