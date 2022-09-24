package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.cast.framework.media.s */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7141s extends C8430a implements C7130m0 {
    C7141s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    public final C10487a zzf() throws RemoteException {
        Parcel b2 = mo36362b2(2, mo36365x());
        C10487a b22 = C10487a.C10488a.m48193b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }
}
