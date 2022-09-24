package p173x1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C1483m;

/* renamed from: x1.d */
/* compiled from: PackageManagerHelper */
public class C6358d {

    /* renamed from: a */
    private static final String f26213a = C1483m.m7773f("PackageManagerHelper");

    /* renamed from: a */
    public static void m27998a(Context context, Class<?> cls, boolean z) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C1483m c = C1483m.m7771c();
            String str3 = f26213a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c.mo7013a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            C1483m c2 = C1483m.m7771c();
            String str4 = f26213a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c2.mo7013a(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}
