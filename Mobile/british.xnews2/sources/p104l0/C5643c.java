package p104l0;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: l0.c */
/* compiled from: ObjectsCompat */
public class C5643c {
    /* renamed from: a */
    public static boolean m24954a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m24955b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static String m24956c(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
