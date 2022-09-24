package com.appnext.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.appnext.base.C3117a;
import com.appnext.base.moments.p030b.C3136b;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.StringWriter;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;

/* renamed from: com.appnext.core.g */
public final class C3198g {

    /* renamed from: dA */
    private static double f12349dA = -1.0d;

    /* renamed from: dB */
    private static String f12350dB = "";

    /* renamed from: dC */
    private static String f12351dC = "";

    /* renamed from: dD */
    private static String f12352dD = "";

    static {
        CookieHandler.setDefault(new CookieManager());
    }

    /* renamed from: a */
    public static String m10776a(Context context, String str, HashMap<String, String> hashMap) throws IOException {
        return m10778a(context, str, hashMap, true, (int) AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
    }

    /* renamed from: au */
    public static String m10785au() {
        try {
            return URLEncoder.encode("android " + Build.VERSION.SDK_INT + " " + Build.MANUFACTURER + " " + Build.MODEL, C6540C.UTF8_NAME);
        } catch (Throwable th) {
            C3117a.m10553a("AppnextHelperClass$getDevice", th);
            return MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
        }
    }

    /* renamed from: av */
    public static String m10786av() {
        String[] split = "2.6.5.473".split("\\.");
        if (split.length < 4) {
            return "2.6.5.473";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(split[i]);
            if (i < 2) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m10787b(Context context, boolean z) {
        String str;
        if (context == null || context.getApplicationContext() == null) {
            return "";
        }
        try {
            str = AdsIDHelper.m10637a(context.getApplicationContext(), z);
        } catch (Throwable th) {
            th.getMessage();
            if (!TextUtils.isEmpty(f12351dC)) {
                return f12351dC;
            }
            return "";
        }
        f12351dC = str;
        return str;
    }

    /* renamed from: c */
    public static boolean m10792c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static String m10793e(AppnextAd appnextAd) {
        String str;
        StringBuilder sb = new StringBuilder("https://www.appnext.com/privacy_policy/index.html?z=");
        sb.append(new Random().nextInt(10));
        sb.append(appnextAd.getZoneID());
        sb.append(new Random().nextInt(10));
        if (appnextAd.isGdpr()) {
            str = "&edda=1&geo=" + appnextAd.getCountry();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: f */
    public static String m10794f(String str, String str2) {
        String cookie = android.webkit.CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            return "";
        }
        String str3 = "";
        for (String str4 : cookie.split(";")) {
            if (str4.contains(str2)) {
                String[] split = str4.split("=");
                if (split.length <= 1) {
                    return "";
                }
                str3 = split[1];
            }
        }
        return str3;
    }

    /* renamed from: g */
    public static String m10795g(Context context) {
        if (context == null || context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            return "Unknown";
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "-";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "Unknown";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    /* renamed from: h */
    public static String m10797h(Context context) {
        if (TextUtils.isEmpty(f12352dD)) {
            synchronized ("2.6.5.473") {
                if (TextUtils.isEmpty(f12352dD)) {
                    f12352dD = m10798i(context);
                }
            }
        }
        return f12352dD;
    }

    /* renamed from: i */
    public static String m10798i(Context context) {
        String b = m10787b(context, true);
        if (TextUtils.isEmpty(b)) {
            return m10791c(32);
        }
        return m10803w(b + "_" + (System.currentTimeMillis() / 1000));
    }

    /* renamed from: j */
    public static boolean m10799j(Context context) {
        try {
            if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                m10776a(context, "http://www.appnext.com/myid.html", (HashMap<String, String>) null);
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            throw new IOException();
        } catch (Throwable th) {
            C3117a.m10553a("AppnextHelperClass$checkConnection", th);
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m10800k(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[DONT_GENERATE] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m10801u(java.lang.String r3) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x002a }
            r1.<init>(r3)     // Catch:{ all -> 0x002a }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ all -> 0x002a }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ all -> 0x002a }
            r1 = 1
            r3.setDoInput(r1)     // Catch:{ all -> 0x0028 }
            r3.connect()     // Catch:{ all -> 0x0028 }
            java.io.InputStream r1 = r3.getInputStream()     // Catch:{ all -> 0x0028 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ all -> 0x0028 }
            r1.close()     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x0024
            r3.disconnect()
            return r0
        L_0x0024:
            r3.disconnect()
            return r2
        L_0x0028:
            r1 = move-exception
            goto L_0x002c
        L_0x002a:
            r1 = move-exception
            r3 = r0
        L_0x002c:
            java.lang.String r2 = "AppnextHelperClass$getBitmapFromURL"
            com.appnext.base.C3117a.m10553a(r2, r1)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0036
            r3.disconnect()
        L_0x0036:
            return r0
        L_0x0037:
            r0 = move-exception
            if (r3 == 0) goto L_0x003d
            r3.disconnect()
        L_0x003d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3198g.m10801u(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10802v(java.lang.String r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = -1
            switch(r0) {
                case 1653: goto L_0x0038;
                case 1684: goto L_0x002d;
                case 1715: goto L_0x0022;
                case 3649301: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            r6 = -1
            goto L_0x0042
        L_0x0017:
            java.lang.String r0 = "wifi"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0020
            goto L_0x0015
        L_0x0020:
            r6 = 3
            goto L_0x0042
        L_0x0022:
            java.lang.String r0 = "4g"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002b
            goto L_0x0015
        L_0x002b:
            r6 = 2
            goto L_0x0042
        L_0x002d:
            java.lang.String r0 = "3g"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0036
            goto L_0x0015
        L_0x0036:
            r6 = 1
            goto L_0x0042
        L_0x0038:
            java.lang.String r0 = "2g"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0041
            goto L_0x0015
        L_0x0041:
            r6 = 0
        L_0x0042:
            switch(r6) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0048;
                case 2: goto L_0x0047;
                case 3: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            return r5
        L_0x0046:
            return r1
        L_0x0047:
            return r2
        L_0x0048:
            return r3
        L_0x0049:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3198g.m10802v(java.lang.String):int");
    }

    /* renamed from: w */
    private static String m10803w(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length << 1);
            for (int i = 0; i < length; i++) {
                sb.append(Character.forDigit((digest[i] & 240) >> 4, 16));
                sb.append(Character.forDigit(digest[i] & 15, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            C3117a.m10553a("AppnextHelperClass$md5", e);
            return m10791c(32);
        }
    }

    /* renamed from: a */
    public static String m10777a(Context context, String str, HashMap<String, String> hashMap, int i) throws IOException {
        return m10778a(context, str, hashMap, true, i);
    }

    /* renamed from: a */
    public static String m10778a(Context context, String str, HashMap<String, String> hashMap, boolean z, int i) throws IOException {
        return new String(m10784a(context, str, hashMap, z, i, C3136b.C3137a.HashMap), C6540C.UTF8_NAME);
    }

    /* renamed from: c */
    private static String m10791c(int i) {
        char[] charArray = "0123456789abcdef".toCharArray();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 32; i2++) {
            sb.append(charArray[random.nextInt(charArray.length)]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m10775a(Context context, String str, ArrayList<Pair<String, String>> arrayList, int i) throws IOException {
        return new String(m10784a(context, str, arrayList, true, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, C3136b.C3137a.ArrayList), C6540C.UTF8_NAME);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m10784a(android.content.Context r9, java.lang.String r10, java.lang.Object r11, boolean r12, int r13, com.appnext.base.moments.p030b.C3136b.C3137a r14) throws java.io.IOException {
        /*
            java.net.URL r0 = new java.net.URL
            r0.<init>(r10)
            r10 = 0
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x0116 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x0116 }
            r0.setReadTimeout(r13)     // Catch:{ all -> 0x0114 }
            r0.setConnectTimeout(r13)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.setRequestProperty(r1, r2)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "User-Agent"
            com.appnext.core.r r2 = com.appnext.core.C3218r.m10844aC()     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = r2.mo10830n(r9)     // Catch:{ all -> 0x0114 }
            r0.setRequestProperty(r1, r2)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "UTF-8"
            if (r11 == 0) goto L_0x00bf
            r2 = 1
            r0.setDoOutput(r2)     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = "POST"
            r0.setRequestMethod(r2)     // Catch:{ all -> 0x0114 }
            com.appnext.base.moments.b.b$a r2 = com.appnext.base.moments.p030b.C3136b.C3137a.JSONObject     // Catch:{ all -> 0x0114 }
            if (r14 == r2) goto L_0x003b
            com.appnext.base.moments.b.b$a r3 = com.appnext.base.moments.p030b.C3136b.C3137a.JSONArray     // Catch:{ all -> 0x0114 }
            if (r14 != r3) goto L_0x0045
        L_0x003b:
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json"
            r0.setRequestProperty(r3, r4)     // Catch:{ all -> 0x0114 }
            r11.toString()     // Catch:{ all -> 0x0114 }
        L_0x0045:
            java.io.OutputStream r3 = r0.getOutputStream()     // Catch:{ all -> 0x0114 }
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ all -> 0x0114 }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0114 }
            r5.<init>(r3, r1)     // Catch:{ all -> 0x0114 }
            r4.<init>(r5)     // Catch:{ all -> 0x0114 }
            com.appnext.base.moments.b.b$a r5 = com.appnext.base.moments.p030b.C3136b.C3137a.JSONArray     // Catch:{ all -> 0x0114 }
            if (r14 != r5) goto L_0x0062
            r2 = r11
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0114 }
            r4.write(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x00b6
        L_0x0062:
            if (r14 != r2) goto L_0x006f
            r2 = r11
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0114 }
            r4.write(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x00b6
        L_0x006f:
            com.appnext.base.moments.b.b$a r2 = com.appnext.base.moments.p030b.C3136b.C3137a.HashMap     // Catch:{ all -> 0x0114 }
            if (r14 != r2) goto L_0x00a8
            r2 = r11
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x0114 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r5.<init>()     // Catch:{ all -> 0x0114 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0114 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0114 }
        L_0x0083:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0114 }
            if (r6 == 0) goto L_0x00a0
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0114 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x0114 }
            android.util.Pair r7 = new android.util.Pair     // Catch:{ all -> 0x0114 }
            java.lang.Object r8 = r6.getKey()     // Catch:{ all -> 0x0114 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0114 }
            r7.<init>(r8, r6)     // Catch:{ all -> 0x0114 }
            r5.add(r7)     // Catch:{ all -> 0x0114 }
            goto L_0x0083
        L_0x00a0:
            java.lang.String r2 = m10780a((java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r5, (boolean) r12)     // Catch:{ all -> 0x0114 }
            r4.write(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x00b6
        L_0x00a8:
            com.appnext.base.moments.b.b$a r2 = com.appnext.base.moments.p030b.C3136b.C3137a.ArrayList     // Catch:{ all -> 0x0114 }
            if (r14 != r2) goto L_0x00b6
            r2 = r11
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = m10780a((java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r2, (boolean) r12)     // Catch:{ all -> 0x0114 }
            r4.write(r2)     // Catch:{ all -> 0x0114 }
        L_0x00b6:
            r4.flush()     // Catch:{ all -> 0x0114 }
            r4.close()     // Catch:{ all -> 0x0114 }
            r3.close()     // Catch:{ all -> 0x0114 }
        L_0x00bf:
            int r2 = r0.getResponseCode()     // Catch:{ all -> 0x0114 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x00dc
            java.io.InputStream r10 = r0.getInputStream()     // Catch:{ all -> 0x0114 }
            java.io.InputStream r9 = m10774a((java.io.InputStream) r10)     // Catch:{ all -> 0x0114 }
            byte[] r9 = m10790b((java.io.InputStream) r9)     // Catch:{ all -> 0x0114 }
            if (r10 == 0) goto L_0x00d8
            r10.close()
        L_0x00d8:
            r0.disconnect()
            return r9
        L_0x00dc:
            r3 = 301(0x12d, float:4.22E-43)
            if (r2 == r3) goto L_0x0101
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 == r3) goto L_0x0101
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 != r3) goto L_0x00e9
            goto L_0x0101
        L_0x00e9:
            java.lang.String r9 = ""
            java.io.InputStream r10 = r0.getErrorStream()     // Catch:{ all -> 0x0114 }
            if (r10 == 0) goto L_0x00fb
            byte[] r9 = m10790b((java.io.InputStream) r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0114 }
            r11.<init>(r9, r1)     // Catch:{ all -> 0x0114 }
            r9 = r11
        L_0x00fb:
            java.net.HttpRetryException r11 = new java.net.HttpRetryException     // Catch:{ all -> 0x0114 }
            r11.<init>(r9, r2)     // Catch:{ all -> 0x0114 }
            throw r11     // Catch:{ all -> 0x0114 }
        L_0x0101:
            java.lang.String r1 = "Location"
            java.lang.String r3 = r0.getHeaderField(r1)     // Catch:{ all -> 0x0114 }
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            byte[] r9 = m10784a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0114 }
            r0.disconnect()
            return r9
        L_0x0114:
            r9 = move-exception
            goto L_0x0118
        L_0x0116:
            r9 = move-exception
            r0 = r10
        L_0x0118:
            if (r10 == 0) goto L_0x011d
            r10.close()
        L_0x011d:
            if (r0 == 0) goto L_0x0122
            r0.disconnect()
        L_0x0122:
            goto L_0x0124
        L_0x0123:
            throw r9
        L_0x0124:
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3198g.m10784a(android.content.Context, java.lang.String, java.lang.Object, boolean, int, com.appnext.base.moments.b.b$a):byte[]");
    }

    /* renamed from: b */
    private static byte[] m10790b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: g */
    public static String m10796g(String str, String str2) {
        try {
            String[] split = str.split("&");
            HashMap hashMap = new HashMap();
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                String str3 = split3[0];
                String str4 = "";
                if (split3.length == 2) {
                    str4 = split3[1];
                }
                hashMap.put(str3, str4);
            }
            return (String) hashMap.get(str2);
        } catch (Throwable th) {
            C3117a.m10553a("AppnextHelperClass$getQueryMap", th);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m10789b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m10788b(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            return substring.substring(0, substring.lastIndexOf(46)) + "_" + queryParameter + substring.substring(substring.lastIndexOf(46));
        } catch (Throwable th) {
            C3117a.m10553a("AppnextHelperClass$extractFileNameFromPath", th);
            return substring;
        }
    }

    /* renamed from: a */
    public static InputStream m10774a(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        byte[] bArr = new byte[2];
        try {
            pushbackInputStream.unread(bArr, 0, pushbackInputStream.read(bArr));
            return (bArr[0] == 31 && bArr[1] == -117) ? new GZIPInputStream(pushbackInputStream) : pushbackInputStream;
        } catch (Throwable unused) {
            return inputStream;
        }
    }

    /* renamed from: a */
    private static String m10780a(List<Pair<String, String>> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Pair next : list) {
            try {
                if (next.first != null) {
                    if (next.second != null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (z2) {
                            z2 = false;
                        } else {
                            sb2.append("&");
                        }
                        if (z) {
                            sb2.append(URLEncoder.encode(URLDecoder.decode((String) next.first, C6540C.UTF8_NAME), C6540C.UTF8_NAME));
                            sb2.append("=");
                            sb2.append(URLEncoder.encode(URLDecoder.decode((String) next.second, C6540C.UTF8_NAME), C6540C.UTF8_NAME));
                        } else {
                            sb2.append(URLEncoder.encode((String) next.first, C6540C.UTF8_NAME));
                            sb2.append("=");
                            sb2.append(URLEncoder.encode((String) next.second, C6540C.UTF8_NAME));
                        }
                        String str = (String) next.first;
                        String str2 = (String) next.second;
                        sb.append(sb2);
                    }
                }
            } catch (Throwable th) {
                C3117a.m10553a("AppnextHelperClass$getPostDataString", th);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int m10773a(Context context, float f) {
        return (int) (f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* renamed from: a */
    public static void m10781a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10 = str6;
        try {
            if (TextUtils.isEmpty(str6)) {
                return;
            }
            if (str10.equals("video_started") || str10.equals("video_ended")) {
                final String str11 = str5;
                final String str12 = str6;
                final String str13 = str;
                final String str14 = str2;
                final String str15 = str3;
                final String str16 = str4;
                final String str17 = str7;
                final String str18 = str8;
                final String str19 = str9;
                final Context context2 = context;
                C3211o.m10825az().mo10821a(new Runnable() {
                    public final void run() {
                        String str;
                        String str2 = "";
                        try {
                            str = URLEncoder.encode(str11.replace(" ", "_"), C6540C.UTF8_NAME);
                        } catch (Throwable unused) {
                            str = str2;
                        }
                        try {
                            str2 = URLEncoder.encode(str12.replace(" ", "_"), C6540C.UTF8_NAME);
                        } catch (Throwable unused2) {
                        }
                        Object[] objArr = new Object[10];
                        objArr[0] = str13;
                        objArr[1] = str14;
                        objArr[2] = "100";
                        objArr[3] = str15;
                        objArr[4] = str;
                        objArr[5] = str16;
                        objArr[6] = str2;
                        objArr[7] = str17;
                        boolean isEmpty = TextUtils.isEmpty(str18);
                        String str3 = SessionDescription.SUPPORTED_SDP_VERSION;
                        objArr[8] = isEmpty ? str3 : str18;
                        if (!TextUtils.isEmpty(str19)) {
                            str3 = str19;
                        }
                        objArr[9] = str3;
                        try {
                            C3198g.m10776a(context2, String.format("https://admin.appnext.com/tp12.aspx?tid=%s&vid=%s&osid=%s&auid=%s&session_id=%s&pid=%s&ref=%s&ads_type=%s&bid=%s&cid=%s", objArr), (HashMap<String, String>) null);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextHelperClass$report", th);
        }
    }

    /* renamed from: a */
    public static void m10782a(C3148Ad ad, AppnextAd appnextAd, String str, String str2, SettingsManager settingsManager) {
        final SettingsManager settingsManager2 = settingsManager;
        final C3148Ad ad2 = ad;
        final AppnextAd appnextAd2 = appnextAd;
        final String str3 = str2;
        final String str4 = str;
        C3211o.m10825az().mo10821a(new Runnable() {
            public final void run() {
                try {
                    if (Boolean.parseBoolean(settingsManager2.mo10732y("stp_flag"))) {
                        ArrayList arrayList = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        arrayList.add(new Pair("client_date", sb.toString()));
                        arrayList.add(new Pair("did", C3198g.m10787b(ad2.getContext(), true)));
                        arrayList.add(new Pair("session_id", appnextAd2.getSession()));
                        arrayList.add(new Pair("tid", ad2.getTID()));
                        arrayList.add(new Pair("vid", ad2.getVID()));
                        arrayList.add(new Pair("auid", ad2.getAUID()));
                        arrayList.add(new Pair("osid", "100"));
                        arrayList.add(new Pair("tem_id", str3));
                        arrayList.add(new Pair("pid", ad2.getPlacementID()));
                        arrayList.add(new Pair("banner_id", appnextAd2.getBannerID()));
                        arrayList.add(new Pair("cm_id", appnextAd2.getCampaignID()));
                        arrayList.add(new Pair("event_name", str4));
                        arrayList.add(new Pair("package_id", ad2.getContext().getPackageName()));
                        C3198g.m10775a(ad2.context, "https://global.appnext.com/stp.aspx", (ArrayList<Pair<String, String>>) arrayList, (int) AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("AppnextHelperClass$tpReport", th);
                }
            }
        });
    }

    /* renamed from: a */
    public static String m10779a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String obj = stringWriter.toString();
        return obj.length() > 512 ? obj.substring(0, 512) : obj;
    }

    /* renamed from: a */
    public static void m10783a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                m10783a(a);
            }
        }
        file.delete();
    }
}
