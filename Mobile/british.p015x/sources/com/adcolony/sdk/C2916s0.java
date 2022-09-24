package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import androidx.preference.C1067b;
import com.adcolony.sdk.C2978z;
import com.appnext.core.C3148Ad;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.s0 */
class C2916s0 {

    /* renamed from: a */
    static final int f11753a = 128;

    /* renamed from: b */
    static ExecutorService f11754b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    static Handler f11755c;

    /* renamed from: com.adcolony.sdk.s0$a */
    static class C2917a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11756a;

        /* renamed from: b */
        final /* synthetic */ String f11757b;

        /* renamed from: c */
        final /* synthetic */ int f11758c;

        C2917a(Context context, String str, int i) {
            this.f11756a = context;
            this.f11757b = str;
            this.f11758c = i;
        }

        public void run() {
            Toast.makeText(this.f11756a, this.f11757b, this.f11758c).show();
        }
    }

    C2916s0() {
    }

    /* renamed from: a */
    static int m10049a(Context context, String str) {
        return m10050a(m10068b(context), str);
    }

    /* renamed from: b */
    static SharedPreferences m10068b(Context context) {
        try {
            return C1067b.m5461a(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    /* renamed from: c */
    static boolean m10077c(String str) {
        Application application;
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        try {
            if (b instanceof Application) {
                application = (Application) b;
            } else {
                application = ((Activity) b).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Deprecated
    /* renamed from: d */
    static int m10078d() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return 0;
        }
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new C2978z.C2979a().mo10088a("Failed to retrieve package info.").mo10090a(C2978z.f11950j);
            return 0;
        }
    }

    /* renamed from: e */
    static boolean m10083e(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        new C2978z.C2979a().mo10088a("String must be non-null and the max length is 128 characters.").mo10090a(C2978z.f11947g);
        return false;
    }

    /* renamed from: f */
    static int m10084f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new C2978z.C2979a().mo10088a("Unable to parse '").mo10088a(str).mo10088a("' as a color.").mo10090a(C2978z.f11948h);
            return -16777216;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", r1).parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd", r1).parse(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Date m10086g(java.lang.String r5) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZ"
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r2.<init>(r3, r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd"
            r3.<init>(r4, r1)
            java.util.Date r5 = r0.parse(r5)     // Catch:{ Exception -> 0x001c }
            return r5
        L_0x001c:
            java.util.Date r5 = r2.parse(r5)     // Catch:{ Exception -> 0x0021 }
            return r5
        L_0x0021:
            java.util.Date r5 = r3.parse(r5)     // Catch:{ Exception -> 0x0026 }
            return r5
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2916s0.m10086g(java.lang.String):java.util.Date");
    }

    /* renamed from: com.adcolony.sdk.s0$b */
    static class C2918b {

        /* renamed from: a */
        double f11759a;

        /* renamed from: b */
        double f11760b = ((double) System.currentTimeMillis());

        C2918b(double d) {
            mo9979a(d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9979a(double d) {
            this.f11759a = d;
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            this.f11760b = (currentTimeMillis / 1000.0d) + this.f11759a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public double mo9981b() {
            double currentTimeMillis = (double) System.currentTimeMillis();
            Double.isNaN(currentTimeMillis);
            double d = this.f11760b - (currentTimeMillis / 1000.0d);
            if (d <= 0.0d) {
                return 0.0d;
            }
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9982c() {
            mo9979a(this.f11759a);
        }

        public String toString() {
            return C2916s0.m10056a(mo9981b(), 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9980a() {
            return mo9981b() == 0.0d;
        }
    }

    /* renamed from: a */
    static int m10050a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            aVar.mo10088a("Key " + str + " in SharedPreferences ").mo10088a("does not have an int value.").mo10090a(C2978z.f11948h);
            return -1;
        }
    }

    /* renamed from: b */
    static String m10070b(Context context, String str) {
        return m10071b(m10068b(context), str);
    }

    /* renamed from: b */
    static String m10071b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, (String) null);
        } catch (ClassCastException unused) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            aVar.mo10088a("Key " + str + " in SharedPreferences ").mo10088a("does not have a String value.").mo10090a(C2978z.f11948h);
            return null;
        }
    }

    /* renamed from: e */
    static int m10081e(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID)) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: f */
    static boolean m10085f() {
        Context b = C2684a.m9407b();
        return b != null && Build.VERSION.SDK_INT >= 24 && (b instanceof Activity) && ((Activity) b).isInMultiWindowMode();
    }

    /* renamed from: c */
    static String m10075c() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return "1.0";
        }
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new C2978z.C2979a().mo10088a("Failed to retrieve package info.").mo10090a(C2978z.f11950j);
            return "1.0";
        }
    }

    /* renamed from: a */
    static JSONObject m10059a(JSONObject jSONObject) {
        jSONObject.remove("permissions");
        jSONObject.remove("launch_metadata");
        return jSONObject;
    }

    /* renamed from: d */
    static JSONArray m10080d(Context context) {
        JSONArray a = C2976x.m10301a();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    a = C2976x.m10301a();
                    int i = 0;
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i >= strArr.length) {
                            break;
                        }
                        a.put(strArr[i]);
                        i++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return a;
    }

    /* renamed from: e */
    static String m10082e() {
        Context b = C2684a.m9407b();
        return (!(b instanceof Activity) || b.getResources().getConfiguration().orientation != 1) ? C3148Ad.ORIENTATION_LANDSCAPE : C3148Ad.ORIENTATION_PORTRAIT;
    }

    /* renamed from: a */
    static int m10053a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            crc32.update(str.charAt(i));
        }
        return (int) crc32.getValue();
    }

    /* renamed from: b */
    static String m10069b() {
        Application application;
        Context b = C2684a.m9407b();
        if (b == null) {
            return "";
        }
        if (b instanceof Application) {
            application = (Application) b;
        } else {
            application = ((Activity) b).getApplication();
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(b.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new C2978z.C2979a().mo10088a("Failed to retrieve application label.").mo10090a(C2978z.f11950j);
            return "";
        }
    }

    /* renamed from: c */
    static String m10076c(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return C3791bd.UNKNOWN_CONTENT_TYPE;
        }
    }

    /* renamed from: a */
    static String m10055a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    static JSONArray m10058a(int i) {
        JSONArray a = C2976x.m10301a();
        for (int i2 = 0; i2 < i; i2++) {
            C2976x.m10322b(a, m10055a());
        }
        return a;
    }

    /* renamed from: d */
    static int m10079d(String str) {
        str.hashCode();
        if (!str.equals(C3148Ad.ORIENTATION_PORTRAIT)) {
            return !str.equals(C3148Ad.ORIENTATION_LANDSCAPE) ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: a */
    static boolean m10066a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        Arrays.sort(strArr);
        Arrays.sort(strArr2);
        return Arrays.equals(strArr, strArr2);
    }

    /* renamed from: b */
    static String m10072b(String str) {
        try {
            return C2971v0.m10282a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m10063a(Runnable runnable) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (f11755c == null) {
            f11755c = new Handler(mainLooper);
        }
        if (mainLooper == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        f11755c.post(runnable);
        return true;
    }

    /* renamed from: b */
    static boolean m10074b(AudioManager audioManager) {
        if (audioManager == null) {
            new C2978z.C2979a().mo10088a("isAudioEnabled() called with a null AudioManager").mo10090a(C2978z.f11950j);
            return false;
        }
        try {
            if (audioManager.getStreamVolume(3) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            new C2978z.C2979a().mo10088a("Exception occurred when accessing AudioManager.getStreamVolume: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: a */
    static double m10048a(AudioManager audioManager) {
        if (audioManager == null) {
            new C2978z.C2979a().mo10088a("getAudioVolume() called with a null AudioManager").mo10090a(C2978z.f11950j);
            return 0.0d;
        }
        try {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            Double.isNaN(streamVolume);
            Double.isNaN(streamMaxVolume);
            return streamVolume / streamMaxVolume;
        } catch (Exception e) {
            new C2978z.C2979a().mo10088a("Exception occurred when accessing AudioManager: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            return 0.0d;
        }
    }

    /* renamed from: b */
    static String m10073b(JSONArray jSONArray) throws JSONException {
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + jSONArray.getInt(i);
        }
        return str;
    }

    /* renamed from: b */
    static int m10067b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[1]) / C2684a.m9409c().mo9723j().mo9861n());
    }

    /* renamed from: a */
    static AudioManager m10054a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        new C2978z.C2979a().mo10088a("getAudioManager called with a null Context").mo10090a(C2978z.f11950j);
        return null;
    }

    /* renamed from: a */
    static String m10056a(double d, int i) {
        StringBuilder sb = new StringBuilder();
        m10060a(d, i, sb);
        return sb.toString();
    }

    /* renamed from: a */
    static void m10060a(double d, int i, StringBuilder sb) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            sb.append(d);
            return;
        }
        if (d < 0.0d) {
            d = -d;
            sb.append('-');
        }
        if (i == 0) {
            sb.append(Math.round(d));
            return;
        }
        long pow = (long) Math.pow(10.0d, (double) i);
        double d2 = (double) pow;
        Double.isNaN(d2);
        long round = Math.round(d * d2);
        sb.append(round / pow);
        sb.append('.');
        long j = round % pow;
        if (j == 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append('0');
            }
            return;
        }
        for (long j2 = j * 10; j2 < pow; j2 *= 10) {
            sb.append('0');
        }
        sb.append(j);
    }

    /* renamed from: a */
    static boolean m10065a(String str, File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to process file for MD5", e);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            new C2978z.C2979a().mo10088a("Exception on closing MD5 input stream").mo10090a(C2978z.f11950j);
                        }
                        throw th;
                    }
                }
                boolean equals = str.equals(String.format("%40s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0'));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    new C2978z.C2979a().mo10088a("Exception on closing MD5 input stream").mo10090a(C2978z.f11950j);
                }
                return equals;
            } catch (FileNotFoundException unused3) {
                new C2978z.C2979a().mo10088a("Exception while getting FileInputStream").mo10090a(C2978z.f11950j);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new C2978z.C2979a().mo10088a("Exception while getting Digest").mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: a */
    static String m10057a(JSONArray jSONArray) throws JSONException {
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            switch (jSONArray.getInt(i)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* renamed from: a */
    static boolean m10062a(Intent intent, boolean z) {
        try {
            Context b = C2684a.m9407b();
            if (b == null) {
                return false;
            }
            if (!(b instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial f = C2684a.m9409c().mo9719f();
            if (f != null && f.mo9478h()) {
                f.mo9474f().mo9781f();
            }
            if (z) {
                b.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            b.startActivity(intent);
            return true;
        } catch (Exception e) {
            new C2978z.C2979a().mo10088a(e.toString()).mo10090a(C2978z.f11948h);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m10061a(Intent intent) {
        return m10062a(intent, false);
    }

    /* renamed from: a */
    static boolean m10064a(String str, int i) {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        m10063a((Runnable) new C2917a(b, str, i));
        return true;
    }

    /* renamed from: a */
    static int m10052a(C2863o0 o0Var) {
        boolean z = false;
        try {
            Context b = C2684a.m9407b();
            if (b == null) {
                return 0;
            }
            int i = (int) (b.getPackageManager().getPackageInfo(b.getPackageName(), 0).lastUpdateTime / 1000);
            int i2 = 1;
            if (new File(o0Var.mo9905a() + "AppVersion").exists()) {
                if (C2976x.m10332e(C2976x.m10328c(o0Var.mo9905a() + "AppVersion"), "last_update") != i) {
                    z = true;
                } else {
                    i2 = 0;
                }
            } else {
                z = true;
                i2 = 2;
            }
            if (z) {
                try {
                    JSONObject b2 = C2976x.m10319b();
                    C2976x.m10323b(b2, "last_update", i);
                    C2976x.m10338j(b2, o0Var.mo9905a() + "AppVersion");
                } catch (Exception unused) {
                    return i2;
                }
            }
            return i2;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: a */
    static int m10051a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[0]) / C2684a.m9409c().mo9723j().mo9861n());
    }
}
