package p072e3;

import android.util.Log;
import com.unity3d.services.core.properties.MadeWithUnityDetector;

/* renamed from: e3.e */
/* compiled from: UnityReflection */
public class C5236e {

    /* renamed from: a */
    private static final String f22782a = "e3.e";

    /* renamed from: b */
    private static Class<?> f22783b;

    /* renamed from: a */
    public static void m23730a() {
        m23732c("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: b */
    public static void m23731b(String str) {
        m23732c("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: c */
    public static void m23732c(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (f22783b == null) {
                f22783b = Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            }
            f22783b.getMethod("UnitySendMessage", new Class[]{cls, cls, cls}).invoke(f22783b, new Object[]{str, str2, str3});
        } catch (Exception e) {
            Log.e(f22782a, "Failed to send message to Unity", e);
        }
    }
}
