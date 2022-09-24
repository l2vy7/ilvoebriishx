package p107l3;

import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.GraphRequest;
import com.facebook.internal.C3481f0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l3.c */
/* compiled from: InstrumentUtility */
public final class C5673c {

    /* renamed from: l3.c$a */
    /* compiled from: InstrumentUtility */
    static class C5674a implements FilenameFilter {
        C5674a() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"crash_log_"}));
        }
    }

    /* renamed from: a */
    public static boolean m25026a(String str) {
        File c = m25028c();
        if (c == null || str == null) {
            return false;
        }
        return new File(c, str).delete();
    }

    /* renamed from: b */
    public static String m25027b(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return th.getCause().toString();
    }

    /* renamed from: c */
    public static File m25028c() {
        File file = new File(C3642m.m12279e().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public static String m25029d(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public static boolean m25030e(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement className : th.getStackTrace()) {
                if (className.getClassName().startsWith("com.facebook")) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: f */
    public static File[] m25031f() {
        File c = m25028c();
        if (c == null) {
            return new File[0];
        }
        File[] listFiles = c.listFiles(new C5674a());
        return listFiles != null ? listFiles : new File[0];
    }

    /* renamed from: g */
    public static JSONObject m25032g(String str, boolean z) {
        File c = m25028c();
        if (!(c == null || str == null)) {
            try {
                return new JSONObject(C3481f0.m11621c0(new FileInputStream(new File(c, str))));
            } catch (Exception unused) {
                if (z) {
                    m25026a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public static void m25033h(String str, JSONArray jSONArray, GraphRequest.C3360f fVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                GraphRequest.m11254L((AccessToken) null, String.format("%s/instruments", new Object[]{C3642m.m12280f()}), jSONObject, fVar).mo11251i();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: i */
    public static void m25034i(String str, String str2) {
        File c = m25028c();
        if (c != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(c, str));
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
