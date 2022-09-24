package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p231m5.C10797a;
import p231m5.C10799c;

/* renamed from: com.google.android.gms.common.internal.q1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7422q1 extends C10797a implements C7395i {
    C7422q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() throws RemoteException {
        Parcel x = mo42968x(2, mo42967b2());
        Account account = (Account) C10799c.m48738a(x, Account.CREATOR);
        x.recycle();
        return account;
    }
}
