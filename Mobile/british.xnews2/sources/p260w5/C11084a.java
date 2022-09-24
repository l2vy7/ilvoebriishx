package p260w5;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import p251t4.C11013c;
import p251t4.C11014d;

/* renamed from: w5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C11084a {

    /* renamed from: a */
    private static final C7353b f50023a = C7353b.m29920h();

    /* renamed from: b */
    private static final Object f50024b = new Object();

    /* renamed from: c */
    private static Method f50025c = null;

    /* renamed from: d */
    private static Method f50026d = null;

    /* renamed from: a */
    public static void m49553a(Context context) throws C11014d, C11013c {
        Context context2;
        String str;
        String str2;
        C4604n.m20099l(context, "Context must not be null");
        f50023a.mo29978n(context, 11925000);
        synchronized (f50024b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m30157e(context, DynamiteModule.f29458f, "com.google.android.gms.providerinstaller.dynamite").mo30248b();
            } catch (DynamiteModule.C7468a e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Failed to load providerinstaller module: ".concat(valueOf);
                } else {
                    str2 = new String("Failed to load providerinstaller module: ");
                }
                Log.w("ProviderInstaller", str2);
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context e2 = C7355d.m29939e(context);
                if (e2 != null) {
                    try {
                        if (f50026d == null) {
                            Class cls = Long.TYPE;
                            f50026d = m49554b(e2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f50026d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e3) {
                        String valueOf2 = String.valueOf(e3.getMessage());
                        if (valueOf2.length() != 0) {
                            str = "Failed to report request stats: ".concat(valueOf2);
                        } else {
                            str = new String("Failed to report request stats: ");
                        }
                        Log.w("ProviderInstaller", str);
                    }
                }
                if (e2 != null) {
                    m49555c(e2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new C11013c(8);
                }
            } else {
                m49555c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: b */
    private static Method m49554b(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: c */
    private static void m49555c(Context context, Context context2, String str) throws C11013c {
        String str2;
        try {
            if (f50025c == null) {
                f50025c = m49554b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f50025c.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                String valueOf = String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Failed to install provider: ".concat(valueOf);
                } else {
                    str2 = new String("Failed to install provider: ");
                }
                Log.e("ProviderInstaller", str2);
            }
            throw new C11013c(8);
        }
    }
}
