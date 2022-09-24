package p231m5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10799c {

    /* renamed from: a */
    private static final ClassLoader f49530a = C10799c.class.getClassLoader();

    private C10799c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m48738a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m48739b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: c */
    public static void m48740c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m48741d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: e */
    public static boolean m48742e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
