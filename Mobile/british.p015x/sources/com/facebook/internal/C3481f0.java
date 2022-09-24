package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C3572j;
import com.facebook.C3642m;
import com.facebook.C3655r;
import com.facebook.C3656s;
import com.facebook.GraphRequest;
import com.facebook.appevents.C3425p;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.f0 */
/* compiled from: Utility */
public final class C3481f0 {

    /* renamed from: a */
    private static int f13060a = 0;

    /* renamed from: b */
    private static long f13061b = -1;

    /* renamed from: c */
    private static long f13062c = -1;

    /* renamed from: d */
    private static long f13063d = -1;

    /* renamed from: e */
    private static String f13064e = "";

    /* renamed from: f */
    private static String f13065f = "";

    /* renamed from: g */
    private static String f13066g = "NoCarrier";

    /* renamed from: com.facebook.internal.f0$a */
    /* compiled from: Utility */
    static class C3482a implements GraphRequest.C3360f {

        /* renamed from: a */
        final /* synthetic */ C3484c f13067a;

        /* renamed from: b */
        final /* synthetic */ String f13068b;

        C3482a(C3484c cVar, String str) {
            this.f13067a = cVar;
            this.f13068b = str;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            if (rVar.mo12380g() != null) {
                this.f13067a.mo11290b(rVar.mo12380g().mo11229g());
                return;
            }
            C3463b0.m11555b(this.f13068b, rVar.mo12381h());
            this.f13067a.mo11289a(rVar.mo12381h());
        }
    }

    /* renamed from: com.facebook.internal.f0$b */
    /* compiled from: Utility */
    static class C3483b implements FilenameFilter {
        C3483b() {
        }

        public boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    /* renamed from: com.facebook.internal.f0$c */
    /* compiled from: Utility */
    public interface C3484c {
        /* renamed from: a */
        void mo11289a(JSONObject jSONObject);

        /* renamed from: b */
        void mo11290b(C3572j jVar);
    }

    /* renamed from: com.facebook.internal.f0$d */
    /* compiled from: Utility */
    public static class C3485d {

        /* renamed from: a */
        List<String> f13069a;

        /* renamed from: b */
        List<String> f13070b;

        /* renamed from: c */
        List<String> f13071c;

        public C3485d(List<String> list, List<String> list2, List<String> list3) {
            this.f13069a = list;
            this.f13070b = list2;
            this.f13071c = list3;
        }

        /* renamed from: a */
        public List<String> mo11935a() {
            return this.f13070b;
        }

        /* renamed from: b */
        public List<String> mo11936b() {
            return this.f13071c;
        }

        /* renamed from: c */
        public List<String> mo11937c() {
            return this.f13069a;
        }
    }

    /* renamed from: A */
    public static Method m11590A(String str, String str2, Class<?>... clsArr) {
        try {
            return m11661z(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static Locale m11591B() {
        try {
            return C3642m.m12279e().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static Object m11592C(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C3572j("Got an unexpected non-JSON object.");
    }

    /* renamed from: D */
    public static C3485d m11593D(JSONObject jSONObject) throws JSONException {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (!(optString2 == null || optString2.equals("installed") || (optString = optJSONObject.optString(IronSourceConstants.EVENTS_STATUS)) == null)) {
                if (optString.equals("granted")) {
                    arrayList.add(optString2);
                } else if (optString.equals("declined")) {
                    arrayList2.add(optString2);
                } else if (optString.equals("expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new C3485d(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: E */
    private static String m11594E(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: F */
    private static String m11595F(String str, String str2) {
        return m11596G(str, str2.getBytes());
    }

    /* renamed from: G */
    private static String m11596G(String str, byte[] bArr) {
        try {
            return m11594E(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static Object m11597H(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static boolean m11598I() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", new Object[]{C3642m.m12280f()})));
            Context e = C3642m.m12279e();
            PackageManager packageManager = e.getPackageManager();
            String packageName = e.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m11599J(Context context) {
        AutofillManager autofillManager;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m11600K(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && str.matches(".+_cheets|cheets_.+");
    }

    /* renamed from: L */
    public static boolean m11601L(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: M */
    public static boolean m11602M(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.m11205h());
    }

    /* renamed from: N */
    public static boolean m11603N(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: O */
    public static boolean m11604O(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: P */
    public static <T> boolean m11605P(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: Q */
    public static boolean m11606Q(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    /* renamed from: R */
    public static List<String> m11607R(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: S */
    public static void m11608S(String str, Exception exc) {
        if (C3642m.m12294t() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    /* renamed from: T */
    public static void m11609T(String str, String str2) {
        if (C3642m.m12294t() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: U */
    public static void m11610U(String str, String str2, Throwable th) {
        if (C3642m.m12294t() && !m11604O(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: V */
    public static String m11611V(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: W */
    public static String m11612W(String str) {
        return m11595F("MD5", str);
    }

    /* renamed from: X */
    public static boolean m11613X(Context context) {
        return m11599J(context);
    }

    /* renamed from: Y */
    public static Bundle m11614Y(String str) {
        Bundle bundle = new Bundle();
        if (!m11604O(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], C6540C.UTF8_NAME), URLDecoder.decode(split2[1], C6540C.UTF8_NAME));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], C6540C.UTF8_NAME), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m11608S("FacebookSDK", e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: Z */
    public static boolean m11615Z(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
            return true;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m11616a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: a0 */
    public static void m11617a0(Bundle bundle, String str, String str2) {
        if (!m11604O(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: b */
    public static <T> boolean m11618b(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    /* renamed from: b0 */
    public static void m11619b0(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m11617a0(bundle, str, uri.toString());
        }
    }

    /* renamed from: c */
    public static <T> List<T> m11620c(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: c0 */
    public static String m11621c0(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m11630h(bufferedInputStream);
                            m11630h(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m11630h(bufferedInputStream);
                    m11630h(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m11630h(bufferedInputStream);
                m11630h(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m11630h(bufferedInputStream);
            m11630h(inputStreamReader);
            throw th;
        }
    }

    /* renamed from: d */
    public static JSONObject m11622d(String str) {
        JSONObject a = C3463b0.m11554a(str);
        if (a != null) {
            return a;
        }
        C3655r g = m11658w(str).mo11250g();
        if (g.mo12380g() != null) {
            return null;
        }
        return g.mo12381h();
    }

    /* renamed from: d0 */
    public static Map<String, String> m11623d0(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: e */
    public static Uri m11624e(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: e0 */
    private static void m11625e0() {
        try {
            if (m11644o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f13063d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f13063d = m11634j((double) f13063d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private static void m11626f(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    instance.setCookie(str, split2[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: f0 */
    private static int m11627f0() {
        int i = f13060a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new C3483b());
            if (listFiles != null) {
                f13060a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f13060a <= 0) {
            f13060a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f13060a;
    }

    /* renamed from: g */
    public static void m11628g(Context context) {
        m11626f(context, "facebook.com");
        m11626f(context, ".facebook.com");
        m11626f(context, "https://facebook.com");
        m11626f(context, "https://.facebook.com");
    }

    /* renamed from: g0 */
    private static void m11629g0(Context context) {
        if (f13066g.equals("NoCarrier")) {
            try {
                f13066g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static void m11630h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h0 */
    private static void m11631h0(Context context) {
        if (f13061b == -1 || System.currentTimeMillis() - f13061b >= 1800000) {
            f13061b = System.currentTimeMillis();
            m11633i0();
            m11629g0(context);
            m11635j0();
            m11625e0();
        }
    }

    /* renamed from: i */
    public static String m11632i(String str, String str2) {
        return m11604O(str) ? str2 : str;
    }

    /* renamed from: i0 */
    private static void m11633i0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f13064e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f13065f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: j */
    private static long m11634j(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: j0 */
    private static void m11635j0() {
        try {
            if (m11644o()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f13062c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f13062c = m11634j((double) f13062c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public static List<String> m11636k(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: k0 */
    public static void m11637k0(Runnable runnable) {
        try {
            C3642m.m12288n().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public static Map<String, String> m11638l(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: l0 */
    public static String m11639l0(JSONObject jSONObject, String str) {
        return jSONObject != null ? jSONObject.optString(str, "") : "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m11640m(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0024 }
            r1.<init>(r6)     // Catch:{ all -> 0x0024 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r7 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            goto L_0x0031
        L_0x0030:
            throw r7
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3481f0.m11640m(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: m0 */
    public static void m11641m0(JSONObject jSONObject, C3459b bVar, String str, boolean z) throws JSONException {
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        if (bVar != null) {
            if (bVar.mo11919g() != null) {
                jSONObject.put("attribution", bVar.mo11919g());
            }
            if (bVar.mo11917b() != null) {
                jSONObject.put("advertiser_id", bVar.mo11917b());
                jSONObject.put("advertiser_tracking_enabled", !bVar.mo11920k());
            }
            if (!bVar.mo11920k()) {
                String d = C3425p.m11456d();
                if (!d.isEmpty()) {
                    jSONObject.put("ud", d);
                }
            }
            if (bVar.mo11918f() != null) {
                jSONObject.put("installer_package", bVar.mo11918f());
            }
        }
    }

    /* renamed from: n */
    public static void m11642n(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: n0 */
    public static void m11643n0(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m11631h0(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(f13064e);
        jSONArray.put(f13066g);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    int i5 = displayMetrics.heightPixels;
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused3) {
                    }
                    int i6 = i5;
                    i2 = i4;
                    i = i6;
                } catch (Exception unused4) {
                    i2 = i4;
                }
                jSONArray.put(i2);
                jSONArray.put(i);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(m11627f0());
                jSONArray.put(f13062c);
                jSONArray.put(f13063d);
                jSONArray.put(f13065f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused5) {
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(m11627f0());
        jSONArray.put(f13062c);
        jSONArray.put(f13063d);
        jSONArray.put(f13065f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: o */
    private static boolean m11644o() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: o0 */
    public static String m11645o0(byte[] bArr) {
        return m11596G("SHA-1", bArr);
    }

    /* renamed from: p */
    public static String m11646p(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: p0 */
    public static String m11647p0(String str) {
        if (str == null) {
            return null;
        }
        return m11595F("SHA-256", str);
    }

    /* renamed from: q */
    public static String m11648q(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return C3791bd.UNKNOWN_CONTENT_TYPE;
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: q0 */
    public static JSONArray m11649q0(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: r */
    public static String m11650r(Context context) {
        try {
            String g = C3642m.m12281g();
            if (g != null) {
                return g;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return context.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: r0 */
    public static JSONObject m11651r0(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: s */
    public static String m11652s() {
        Context e = C3642m.m12279e();
        if (e == null) {
            return null;
        }
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: s0 */
    public static <T> Collection<T> m11653s0(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: t */
    public static Date m11654t(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: t0 */
    public static void m11655t0(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* renamed from: u */
    public static long m11656u(Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = C3642m.m12279e().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j = query.getLong(columnIndex);
            query.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: v */
    public static Locale m11657v() {
        Locale B = m11591B();
        return B != null ? B : Locale.getDefault();
    }

    /* renamed from: w */
    private static GraphRequest m11658w(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        return new GraphRequest((AccessToken) null, "me", bundle, C3656s.GET, (GraphRequest.C3360f) null);
    }

    /* renamed from: x */
    public static void m11659x(String str, C3484c cVar) {
        JSONObject a = C3463b0.m11554a(str);
        if (a != null) {
            cVar.mo11289a(a);
            return;
        }
        C3482a aVar = new C3482a(cVar, str);
        GraphRequest w = m11658w(str);
        w.mo11243W(aVar);
        w.mo11251i();
    }

    /* renamed from: y */
    public static String m11660y(Context context) {
        C3489g0.m11687i(context, "context");
        C3642m.m12273B(context);
        return C3642m.m12280f();
    }

    /* renamed from: z */
    public static Method m11661z(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
