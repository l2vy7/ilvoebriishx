package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.clearcut.a */
public class C8846a implements IInterface {

    /* renamed from: b */
    private final IBinder f44285b;

    /* renamed from: c */
    private final String f44286c;

    protected C8846a(IBinder iBinder, String str) {
        this.f44285b = iBinder;
        this.f44286c = str;
    }

    public IBinder asBinder() {
        return this.f44285b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final void mo36797b2(int i, Parcel parcel) throws RemoteException {
        try {
            this.f44285b.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final Parcel mo36798x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f44286c);
        return obtain;
    }
}
