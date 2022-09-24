package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9307q0 {

    /* renamed from: a */
    private static final ClassLoader f45380a = C9307q0.class.getClassLoader();

    private C9307q0() {
    }

    /* renamed from: a */
    public static Parcelable m43502a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m43503b(Parcel parcel) {
        return parcel.readHashMap(f45380a);
    }

    /* renamed from: c */
    public static void m43504c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m43505d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m43506e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: f */
    public static boolean m43507f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
