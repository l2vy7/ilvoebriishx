package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ans */
/* compiled from: IMASDK */
public abstract class ans extends C4071ij implements ant {
    public ans() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14139a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(mo14127b());
                return true;
            case 2:
                mo14128c(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                boolean d = mo14129d(aph.m14498b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C4072ik.m17379b(parcel2, d);
                return true;
            case 4:
                boolean e = mo14130e(aph.m14498b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C4072ik.m17379b(parcel2, e);
                return true;
            case 5:
                mo14131f(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                C3847api g = mo14132g(aph.m14498b(parcel.readStrongBinder()), aph.m14498b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C4072ik.m17382e(parcel2, g);
                return true;
            case 7:
                String h = mo14133h(aph.m14498b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 8:
                String j = mo14135j(aph.m14498b(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            case 9:
                mo14136k(aph.m14498b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                C3847api l = mo14137l(aph.m14498b(parcel.readStrongBinder()), aph.m14498b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C4072ik.m17382e(parcel2, l);
                return true;
            case 11:
                boolean m = mo14138m(parcel.readString(), C4072ik.m17378a(parcel));
                parcel2.writeNoException();
                C4072ik.m17379b(parcel2, m);
                return true;
            case 12:
                String i2 = mo14134i(aph.m14498b(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(i2);
                return true;
            default:
                return false;
        }
    }
}
