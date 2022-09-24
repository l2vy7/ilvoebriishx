package p082g3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.C3642m;
import com.facebook.internal.C3481f0;
import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g3.b */
/* compiled from: AppEventUtility */
public class C5337b {
    /* renamed from: a */
    public static void m24042a() {
    }

    /* renamed from: b */
    public static void m24043b() {
    }

    /* renamed from: c */
    public static String m24044c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m24045d() {
        Context e = C3642m.m12279e();
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static boolean m24046e() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith(C3791bd.UNKNOWN_CONTENT_TYPE)) {
            String str2 = Build.MODEL;
            return str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
        }
    }

    /* renamed from: f */
    public static double m24047f(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C3481f0.m11657v()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
