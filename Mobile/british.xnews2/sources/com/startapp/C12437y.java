package com.startapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.os.Build;
import android.provider.Settings;
import android.webkit.WebView;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.startapp.y */
/* compiled from: Sta */
public class C12437y {

    /* renamed from: a */
    public static final /* synthetic */ int f55146a = 0;

    /* renamed from: com.startapp.y$a */
    /* compiled from: Sta */
    public class C12438a implements Comparator<Signature> {
        public int compare(Object obj, Object obj2) {
            return ((Signature) obj).toCharsString().compareTo(((Signature) obj2).toCharsString());
        }
    }

    /* renamed from: com.startapp.y$b */
    /* compiled from: Sta */
    public interface C12439b {
    }

    static {
        m53774a((Class<?>) C12437y.class);
    }

    /* renamed from: a */
    public static String m53774a(Class<?> cls) {
        StringBuilder a = C12458z0.m53804a("startapp.");
        a.append(cls.getSimpleName());
        return a.toString();
    }

    /* renamed from: b */
    public static boolean m53786b(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 17 || i >= 21) {
                if (Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1) {
                    return true;
                }
                return false;
            } else if (Settings.Global.getInt(context.getContentResolver(), "install_non_market_apps") != 1) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m53787c(Context context) {
        try {
            if (C12175s2.f54134k == null) {
                if (C12175s2.f54133j == null) {
                    Context a = C5009h0.m22892a(context);
                    if (a != null) {
                        context = a;
                    }
                    C12175s2.f54133j = new C12175s2(context);
                }
                C12175s2.f54134k = Boolean.valueOf(C12175s2.f54133j.mo45743c());
            }
            return C12175s2.f54134k.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m53772a(Activity activity, int i, boolean z) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = 8;
        if (i != 1) {
            if (i == 2) {
                if (Build.VERSION.SDK_INT <= 8 || z || rotation == 0 || rotation == 1) {
                    i2 = 0;
                }
                activity.setRequestedOrientation(i2);
                return i2;
            }
        } else if (Build.VERSION.SDK_INT > 8 && !z && (rotation == 1 || rotation == 2)) {
            i2 = 9;
            activity.setRequestedOrientation(i2);
            return i2;
        }
        i2 = 1;
        try {
            activity.setRequestedOrientation(i2);
        } catch (Throwable unused) {
        }
        return i2;
    }

    /* renamed from: b */
    public static void m53785b(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onResume();
            return;
        }
        try {
            Class.forName("android.webkit.WebView").getMethod("onResume", new Class[0]).invoke(webView, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m53781a() {
        return Build.VERSION.SDK_INT >= 14;
    }

    /* renamed from: a */
    public static void m53778a(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onPause();
            return;
        }
        try {
            Class.forName("android.webkit.WebView").getMethod("onPause", new Class[0]).invoke(webView, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m53779a(WebView webView, Paint paint) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: a */
    public static boolean m53782a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
                return false;
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    public static int m53771a(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            return i;
        }
        if (i == 16) {
            return 0;
        }
        if (i == 17) {
            return 1;
        }
        if (i == 20) {
            return 9;
        }
        if (i == 21) {
            return 11;
        }
        if (i != 8388611) {
            if (i == 8388613 && i2 < 14) {
                return 5;
            }
            return i;
        } else if (i2 < 14) {
            return 3;
        } else {
            return i;
        }
    }

    /* renamed from: a */
    public static String m53775a(String str, Context context) throws FileNotFoundException {
        String str2;
        int i;
        try {
            str2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).sourceDir;
        } catch (Throwable unused) {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(str2);
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bArr = new byte[8192];
            MessageDigest instance = MessageDigest.getInstance(str);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else if (read > 0) {
                    instance.update(bArr, 0, read);
                }
            }
            for (byte b : instance.digest()) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
        } catch (Throwable unused2) {
        }
        m53780a((Closeable) fileInputStream);
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public static boolean m53784a(PackageInfo packageInfo) {
        int i = packageInfo.applicationInfo.flags;
        return ((i & 1) == 0 && (i & 128) == 0) ? false : true;
    }

    /* renamed from: a */
    public static boolean m53783a(Context context, String str, int i) {
        try {
            if (context.getPackageManager().getPackageInfo(str, 128).versionCode >= i) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static List<PackageInfo> m53776a(PackageManager packageManager) throws Exception {
        return (List) packageManager.getClass().getMethod("getInstalledPackages", new Class[]{Integer.TYPE}).invoke(packageManager, new Object[]{8192});
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: a */
    public static String m53773a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return null;
            }
            if (signatureArr.length == 1) {
                return signatureArr[0].toCharsString();
            }
            Arrays.sort(signatureArr, new C12438a());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < signatureArr.length; i++) {
                sb.append(signatureArr[i].toCharsString());
                if (i < signatureArr.length - 1) {
                    sb.append(';');
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m53780a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m53777a(Context context, ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
