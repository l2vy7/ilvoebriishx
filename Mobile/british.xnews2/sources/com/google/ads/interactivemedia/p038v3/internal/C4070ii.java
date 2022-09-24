package com.google.ads.interactivemedia.p038v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ii */
/* compiled from: IMASDK */
public class C4070ii implements IInterface {

    /* renamed from: a */
    private final IBinder f17428a;

    /* renamed from: b */
    private final String f17429b;

    protected C4070ii(IBinder iBinder, String str) {
        this.f17428a = iBinder;
        this.f17429b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo15918a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17429b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f17428a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel mo15920b(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f17428a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15921c(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17428a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo15922d(Parcel parcel) throws RemoteException {
        try {
            this.f17428a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
