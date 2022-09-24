package p207f5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;
import p239o5.C10854b;
import p239o5.C10855c;

/* renamed from: f5.g */
public abstract class C10536g extends C10854b implements C10535f {
    public C10536g() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static C10535f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof C10535f) {
            return (C10535f) queryLocalInterface;
        }
        return new C10537h(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo42656x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            init(C10487a.C10488a.m48193b2(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), C10855c.m48865b(parcel), parcel.readInt());
            parcel2.writeNoException();
            C10855c.m48864a(parcel2, booleanFlagValue);
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
