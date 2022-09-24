package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.vision.barcode.Barcode;
import p198d5.C10487a;

/* renamed from: com.google.android.gms.internal.vision.n6 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9581n6 extends C9517g implements C9613r5 {
    C9581n6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: q0 */
    public final Barcode[] mo38522q0(C10487a aVar, zzu zzu) throws RemoteException {
        Parcel x = mo38397x();
        C9525h.m44278a(x, aVar);
        C9525h.m44279b(x, zzu);
        Parcel b2 = mo38395b2(1, x);
        Barcode[] barcodeArr = (Barcode[]) b2.createTypedArray(Barcode.CREATOR);
        b2.recycle();
        return barcodeArr;
    }

    /* renamed from: u1 */
    public final Barcode[] mo38523u1(C10487a aVar, zzu zzu) throws RemoteException {
        Parcel x = mo38397x();
        C9525h.m44278a(x, aVar);
        C9525h.m44279b(x, zzu);
        Parcel b2 = mo38395b2(2, x);
        Barcode[] barcodeArr = (Barcode[]) b2.createTypedArray(Barcode.CREATOR);
        b2.recycle();
        return barcodeArr;
    }

    public final void zzo() throws RemoteException {
        mo38396f3(3, mo38397x());
    }
}
