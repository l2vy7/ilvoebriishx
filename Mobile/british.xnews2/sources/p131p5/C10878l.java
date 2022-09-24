package p131p5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p5.l */
public class C10878l {

    /* renamed from: a */
    private static final ClassLoader f49659a = C10878l.class.getClassLoader();

    private C10878l() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m48896a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m48897b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m48898c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
