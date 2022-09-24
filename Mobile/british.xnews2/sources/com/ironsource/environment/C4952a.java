package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.ironsource.mediationsdk.C11307ad;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.a */
public final class C4952a extends Thread {

    /* renamed from: m */
    private static final C4958b f21994m = new C4958b() {
        /* renamed from: a */
        public static String m22715a(int i) {
            String str = "not defined message for " + i;
            if (i != 404) {
                switch (i) {
                    case 1004:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i) {
                            case 1008:
                                return "socket timeout exception";
                            case AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED /*1009*/:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case 1011:
                                return "http error code";
                            default:
                                switch (i) {
                                    case AnalyticsListener.EVENT_AUDIO_SINK_ERROR /*1018*/:
                                        return "file not found exception";
                                    case AnalyticsListener.EVENT_VOLUME_CHANGED /*1019*/:
                                        return "out of memory exception";
                                    case 1020:
                                        return "failed to create folder for file";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        /* renamed from: a */
        public static String m22716a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb = new StringBuilder();
            if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null)) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = "wifi";
                        } else {
                            sb.append(typeName);
                        }
                        sb.append(str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public static String m22717a(String str) {
            try {
                return URLEncoder.encode(str, C6540C.UTF8_NAME).replace("+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return "";
            }
        }

        /* renamed from: a */
        public static String m22718a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(m22726b(str.getBytes(C6540C.UTF8_NAME), (PublicKey) (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on string encryption error: " + e.getMessage());
                e.printStackTrace();
                return "";
            }
        }

        /* renamed from: a */
        public static String m22719a(byte[] bArr) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, C6540C.UTF8_NAME));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return sb.toString();
                    }
                }
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while decompressing " + e);
                return null;
            }
        }

        /* renamed from: a */
        public static Map<String, Object> m22720a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        /* renamed from: a */
        public static void m22721a(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                context.startActivity(intent);
                return;
            }
            throw new Exception("url is null");
        }

        /* renamed from: a */
        public static byte[] m22722a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* renamed from: b */
        public static JSONObject m22723b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: b */
        public static boolean m22724b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        public static byte[] m22725b(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        }

        /* renamed from: b */
        private static byte[] m22726b(byte[] bArr, PublicKey publicKey) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, publicKey);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on encryption error: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }

        /* renamed from: c */
        public static int m22727c(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: c */
        public static String m22728c() {
            try {
                new C11307ad();
                return ",kiag";
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        /* renamed from: c */
        public static String m22729c(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        /* renamed from: d */
        public static int m22730d(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: d */
        public static boolean m22731d() {
            try {
                new C11307ad();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: e */
        public static String m22732e(Context context) {
            if (context == null) {
                return "";
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimOperator() : "";
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        /* renamed from: f */
        public static int m22733f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return -1;
        }

        /* renamed from: a */
        public final void mo20572a() {
        }

        /* renamed from: b */
        public final void mo20573b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    };

    /* renamed from: n */
    private static final C4982i f21995n = new C4954a();

    /* renamed from: b */
    C4958b f21996b = f21994m;

    /* renamed from: c */
    private C4982i f21997c = f21995n;

    /* renamed from: d */
    private final Handler f21998d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final int f21999e;

    /* renamed from: f */
    private String f22000f = "";

    /* renamed from: g */
    boolean f22001g = false;

    /* renamed from: h */
    boolean f22002h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile int f22003i = 0;

    /* renamed from: j */
    private int f22004j = 1;

    /* renamed from: k */
    private int f22005k = 0;

    /* renamed from: l */
    private final Runnable f22006l = new C4955b();

    /* renamed from: com.ironsource.environment.a$a */
    static class C4954a implements C4982i {
        C4954a() {
        }

        /* renamed from: a */
        public final void mo20574a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.environment.a$b */
    class C4955b implements Runnable {
        C4955b() {
        }

        public final void run() {
            C4952a aVar = C4952a.this;
            int unused = aVar.f22003i = (aVar.f22003i + 1) % Integer.MAX_VALUE;
        }
    }

    public C4952a(int i) {
        this.f21999e = i;
    }

    public final void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.f22005k < this.f22004j) {
            int i2 = this.f22003i;
            this.f21998d.post(this.f22006l);
            try {
                Thread.sleep((long) this.f21999e);
                if (this.f22003i != i2) {
                    this.f22005k = 0;
                } else if (this.f22002h || !Debug.isDebuggerConnected()) {
                    this.f22005k++;
                    this.f21996b.mo20572a();
                    String str = C4970e.f22030c;
                    if (str != null && !str.trim().isEmpty()) {
                        new C4961c(C4970e.f22030c, String.valueOf(System.currentTimeMillis()), "ANR").mo20579d();
                    }
                } else {
                    if (this.f22003i != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.f22003i;
                }
            } catch (InterruptedException e) {
                this.f21997c.mo20574a(e);
                return;
            }
        }
        if (this.f22005k >= this.f22004j) {
            this.f21996b.mo20573b();
        }
    }
}
