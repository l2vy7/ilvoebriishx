package p256u5;

import android.content.Context;
import android.content.res.Resources;
import p252t4.C11015e;

/* renamed from: u5.l */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C11037l {
    /* renamed from: a */
    public static String m49435a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C11015e.f49970a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m49436b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
