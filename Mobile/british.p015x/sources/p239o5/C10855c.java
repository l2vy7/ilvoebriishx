package p239o5;

import android.os.Parcel;

/* renamed from: o5.c */
public class C10855c {

    /* renamed from: a */
    private static final ClassLoader f49629a = C10855c.class.getClassLoader();

    private C10855c() {
    }

    /* renamed from: a */
    public static void m48864a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static boolean m48865b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
