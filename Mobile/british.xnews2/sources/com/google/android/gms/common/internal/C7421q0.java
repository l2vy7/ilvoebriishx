package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import p198d5.C10487a;
import p231m5.C10797a;
import p231m5.C10799c;

/* renamed from: com.google.android.gms.common.internal.q0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7421q0 extends C10797a implements C7428s0 {
    C7421q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: k3 */
    public final zzq mo30154k3(zzn zzn) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48740c(b2, zzn);
        Parcel x = mo42968x(6, b2);
        zzq zzq = (zzq) C10799c.m48738a(x, zzq.CREATOR);
        x.recycle();
        return zzq;
    }

    /* renamed from: k5 */
    public final boolean mo30155k5(zzs zzs, C10487a aVar) throws RemoteException {
        Parcel b2 = mo42967b2();
        C10799c.m48740c(b2, zzs);
        C10799c.m48741d(b2, aVar);
        Parcel x = mo42968x(5, b2);
        boolean e = C10799c.m48742e(x);
        x.recycle();
        return e;
    }

    public final boolean zzg() throws RemoteException {
        Parcel x = mo42968x(7, mo42967b2());
        boolean e = C10799c.m48742e(x);
        x.recycle();
        return e;
    }
}
