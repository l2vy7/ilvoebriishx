package p118n1;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: n1.a */
/* compiled from: ParcelUtils */
public class C5790a {
    private C5790a() {
    }

    /* renamed from: a */
    public static <T extends C5791b> T m25636a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo6544a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends C5791b> T m25637b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C5790a.class.getClassLoader());
            return m25636a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m25638c(Bundle bundle, String str, C5791b bVar) {
        if (bVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", m25639d(bVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    /* renamed from: d */
    public static Parcelable m25639d(C5791b bVar) {
        return new ParcelImpl(bVar);
    }
}
