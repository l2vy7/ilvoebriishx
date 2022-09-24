package p256u5;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: u5.v */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C11047v {
    /* renamed from: a */
    public static String m49450a(String str, String[] strArr, String[] strArr2) {
        C4604n.m20098k(strArr);
        C4604n.m20098k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m49451b(Context context, String str, String str2) {
        C4604n.m20098k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C11037l.m49435a(context);
        }
        return C11037l.m49436b("google_app_id", resources, str2);
    }
}
