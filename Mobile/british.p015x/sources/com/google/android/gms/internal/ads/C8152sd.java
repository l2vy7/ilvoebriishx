package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sd */
/* compiled from: com.google.android.gms:play-services-ads-base@@20.6.0 */
public class C8152sd implements IInterface {

    /* renamed from: b */
    private final IBinder f38948b;

    /* renamed from: c */
    private final String f38949c;

    protected C8152sd(IBinder iBinder, String str) {
        this.f38948b = iBinder;
        this.f38949c = str;
    }

    public final IBinder asBinder() {
        return this.f38948b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final Parcel mo34694b2(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f38948b.transact(i, parcel, parcel, 0);
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
    public final void mo34695f3(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f38948b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final void mo34696m6(int i, Parcel parcel) throws RemoteException {
        try {
            this.f38948b.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo34697x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38949c);
        return obtain;
    }
}
