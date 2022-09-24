package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.e */
public final class C4970e {

    /* renamed from: c */
    public static String f22030c = "";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public JSONObject f22031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f22032b;

    /* renamed from: d */
    private String f22033d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f22034e;

    /* renamed from: f */
    Context f22035f;

    /* renamed from: g */
    private Thread.UncaughtExceptionHandler f22036g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f22037h;

    /* renamed from: i */
    String f22038i;

    /* renamed from: com.ironsource.environment.e$a */
    class C4971a implements C4958b {
        C4971a() {
        }

        /* renamed from: a */
        public final void mo20572a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread next : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = next.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append(",");
                    sb.append(next.getName());
                    sb.append("\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(next.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            C4970e.f22030c = sb.toString();
        }

        /* renamed from: b */
        public final void mo20573b() {
        }
    }

    /* renamed from: com.ironsource.environment.e$b */
    class C4972b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Context f22040b;

        /* renamed from: c */
        private /* synthetic */ String f22041c;

        C4972b(Context context, String str) {
            this.f22040b = context;
            this.f22041c = str;
        }

        public final void run() {
            try {
                String[] a = C4979h.m22787a(this.f22040b);
                if (!TextUtils.isEmpty(a[0])) {
                    String unused = C4970e.this.f22032b = a[0];
                }
                boolean unused2 = C4970e.this.f22034e = Boolean.parseBoolean(a[1]);
                SharedPreferences.Editor edit = this.f22040b.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", C4970e.this.f22032b);
                edit.putString("sId", this.f22041c);
                edit.apply();
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: com.ironsource.environment.e$c */
    class C4973c implements Runnable {
        C4973c() {
        }

        public final void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C4970e.m22762a().f22037h).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json;charset=UTF-8");
                httpURLConnection.setRequestProperty(RtspHeaders.ACCEPT, "application/json");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                Log.i("JSON", C4970e.this.f22031a.toString());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(C4970e.this.f22031a.toString());
                dataOutputStream.flush();
                dataOutputStream.close();
                Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                Log.i("MSG", httpURLConnection.getResponseMessage());
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.ironsource.environment.e$d */
    static class C4974d {

        /* renamed from: a */
        static volatile C4970e f22044a = new C4970e((byte) 0);
    }

    private C4970e() {
        this.f22034e = false;
        this.f22031a = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f22036g = defaultUncaughtExceptionHandler;
        this.f22038i = " ";
        this.f22037h = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C4967d(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ C4970e(byte b) {
        this();
    }

    /* renamed from: a */
    public static C4970e m22762a() {
        return C4974d.f22044a;
    }

    /* renamed from: b */
    private static String m22763b(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return "wifi";
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public final void mo20585a(Context context, HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        if (context != null) {
            Log.d("automation_log", "init ISCrashReporter");
            this.f22035f = context;
            if (!TextUtils.isEmpty(str2)) {
                this.f22038i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f22037h = str;
            }
            this.f22033d = str3;
            if (z) {
                C4952a aVar = new C4952a(i);
                aVar.f22002h = z2;
                aVar.f22001g = true;
                aVar.f21996b = new C4971a();
                aVar.start();
            }
            String b = m22763b(this.f22035f);
            if (!b.equals("none")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.f22032b);
                String string2 = sharedPreferences.getString("sId", this.f22033d);
                for (C4961c next : C4977f.m22774a()) {
                    String b2 = next.mo20577b();
                    String a = next.mo20576a();
                    String c = next.mo20578c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b2);
                        jSONObject.put("stacktraceCrash", a);
                        jSONObject.put("crashType", c);
                        jSONObject.put("CrashReporterVersion", "1.0.4");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", C4979h.m22790b(context));
                        jSONObject.put("appVersion", C4961c.m22745c(context, packageName));
                        jSONObject.put("deviceOSVersion", C4979h.m22798e());
                        jSONObject.put("network", b);
                        jSONObject.put("deviceApiLevel", C4979h.m22800f());
                        jSONObject.put("deviceModel", C4979h.m22803g());
                        jSONObject.put("deviceOS", C4979h.m22806i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.f22034e);
                        jSONObject.put("deviceOEM", C4979h.m22804h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next2 = it.next();
                                try {
                                    if (jSONObject.has(next2)) {
                                        jSONObject2.put(next2, jSONObject.opt(next2));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.f22031a = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.f22031a.length() == 0) {
                        Log.d("ISCrashReport", " Is Empty");
                    } else {
                        new Thread(new C4973c()).start();
                        C4977f.m22777c();
                    }
                }
            }
            new Thread(new C4972b(context, str3)).start();
        }
    }
}
