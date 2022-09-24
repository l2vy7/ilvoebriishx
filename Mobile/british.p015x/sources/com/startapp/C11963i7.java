package com.startapp;

import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.startapp.i7 */
/* compiled from: Sta */
public class C11963i7 {

    /* renamed from: com.startapp.i7$a */
    /* compiled from: Sta */
    public static class C11964a {

        /* renamed from: a */
        public String f53099a;

        /* renamed from: b */
        public String f53100b;

        /* renamed from: c */
        public Map<String, List<String>> f53101c;

        /* renamed from: d */
        public long f53102d;

        /* renamed from: e */
        public long f53103e;

        /* renamed from: f */
        public long f53104f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        r3 = r9;
        r5 = r11;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0088, code lost:
        r11 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m52454a(java.lang.String r8, byte[] r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, boolean r12) throws com.startapp.sdk.common.SDKException {
        /*
            java.lang.String r5 = "application/json"
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            java.net.HttpURLConnection r10 = m52455a(r0, r1, r2, r3, r4, r5)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r9 == 0) goto L_0x0028
            int r11 = r9.length     // Catch:{ IOException -> 0x008b, all -> 0x0087 }
            if (r11 <= 0) goto L_0x0028
            java.io.OutputStream r11 = r10.getOutputStream()     // Catch:{ all -> 0x0022 }
            r11.write(r9)     // Catch:{ all -> 0x0020 }
            r11.flush()     // Catch:{ all -> 0x0020 }
            com.startapp.C12437y.m53780a((java.io.Closeable) r11)     // Catch:{ IOException -> 0x008b, all -> 0x0087 }
            goto L_0x0028
        L_0x0020:
            r9 = move-exception
            goto L_0x0024
        L_0x0022:
            r9 = move-exception
            r11 = r7
        L_0x0024:
            com.startapp.C12437y.m53780a((java.io.Closeable) r11)     // Catch:{ IOException -> 0x008b, all -> 0x0087 }
            throw r9     // Catch:{ IOException -> 0x008b, all -> 0x0087 }
        L_0x0028:
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x008b, all -> 0x0087 }
            r11 = 200(0xc8, float:2.8E-43)
            if (r9 != r11) goto L_0x0066
            java.io.InputStream r11 = r10.getInputStream()     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
            if (r11 == 0) goto L_0x005f
            java.io.StringWriter r12 = new java.io.StringWriter     // Catch:{ IOException -> 0x005b }
            r12.<init>()     // Catch:{ IOException -> 0x005b }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]     // Catch:{ IOException -> 0x005b }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x005b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x005b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r11, r3)     // Catch:{ IOException -> 0x005b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x005b }
        L_0x004b:
            int r2 = r1.read(r0)     // Catch:{ IOException -> 0x005b }
            r3 = -1
            if (r2 == r3) goto L_0x0056
            r12.write(r0, r6, r2)     // Catch:{ IOException -> 0x005b }
            goto L_0x004b
        L_0x0056:
            java.lang.String r7 = r12.toString()     // Catch:{ IOException -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r12 = move-exception
            r3 = r9
            r5 = r12
            goto L_0x0097
        L_0x005f:
            com.startapp.C12437y.m53780a((java.io.Closeable) r11)
            r10.disconnect()
            return r7
        L_0x0066:
            android.net.Uri r11 = android.net.Uri.parse(r8)     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
            android.net.Uri$Builder r11 = r11.query(r7)     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
            android.net.Uri r2 = r11.build()     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
            com.startapp.sdk.common.SDKException r11 = new com.startapp.sdk.common.SDKException     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
            java.lang.String r1 = "POST"
            r4 = 0
            r5 = 0
            r0 = r11
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
            throw r11     // Catch:{ IOException -> 0x0082, all -> 0x0087 }
        L_0x0082:
            r11 = move-exception
            r3 = r9
            r5 = r11
            r11 = r7
            goto L_0x0097
        L_0x0087:
            r8 = move-exception
            r11 = r7
        L_0x0089:
            r7 = r10
            goto L_0x00b3
        L_0x008b:
            r9 = move-exception
            r5 = r9
            r11 = r7
            goto L_0x0096
        L_0x008f:
            r8 = move-exception
            r11 = r7
            goto L_0x00b3
        L_0x0092:
            r9 = move-exception
            r5 = r9
            r10 = r7
            r11 = r10
        L_0x0096:
            r3 = 0
        L_0x0097:
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x00b1 }
            android.net.Uri$Builder r8 = r8.buildUpon()     // Catch:{ all -> 0x00b1 }
            android.net.Uri$Builder r8 = r8.query(r7)     // Catch:{ all -> 0x00b1 }
            android.net.Uri r2 = r8.build()     // Catch:{ all -> 0x00b1 }
            com.startapp.sdk.common.SDKException r8 = new com.startapp.sdk.common.SDKException     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "POST"
            r4 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b1 }
            throw r8     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r8 = move-exception
            goto L_0x0089
        L_0x00b3:
            com.startapp.C12437y.m53780a((java.io.Closeable) r11)
            if (r7 == 0) goto L_0x00bb
            r7.disconnect()
        L_0x00bb:
            goto L_0x00bd
        L_0x00bc:
            throw r8
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11963i7.m52454a(java.lang.String, byte[], java.util.Map, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        r3 = r10;
        r5 = r11;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c3, code lost:
        r7.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.C11963i7.C11964a m52453a(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10, boolean r11) throws com.startapp.sdk.common.SDKException {
        /*
            r1 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.net.HttpURLConnection r9 = m52455a(r0, r1, r2, r3, r4, r5)     // Catch:{ IOException -> 0x009d, all -> 0x009a }
            int r10 = r9.getResponseCode()     // Catch:{ IOException -> 0x0096, all -> 0x0092 }
            r11 = 200(0xc8, float:2.8E-43)
            if (r10 != r11) goto L_0x0071
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            r0 = 9
            if (r11 < r0) goto L_0x0029
            java.net.CookieManager r11 = com.startapp.C11844d2.f52726a     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            if (r11 == 0) goto L_0x0029
            java.net.URI r0 = java.net.URI.create(r8)     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            java.util.Map r1 = r9.getHeaderFields()     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            r11.put(r0, r1)     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
        L_0x0029:
            java.io.InputStream r11 = r9.getInputStream()     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            com.startapp.i7$a r0 = new com.startapp.i7$a     // Catch:{ IOException -> 0x006d }
            r0.<init>()     // Catch:{ IOException -> 0x006d }
            java.lang.String r1 = r9.getContentType()     // Catch:{ IOException -> 0x006d }
            r0.f53100b = r1     // Catch:{ IOException -> 0x006d }
            java.util.Map r1 = r9.getHeaderFields()     // Catch:{ IOException -> 0x006d }
            r0.f53101c = r1     // Catch:{ IOException -> 0x006d }
            if (r11 == 0) goto L_0x0066
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ IOException -> 0x006d }
            r1.<init>()     // Catch:{ IOException -> 0x006d }
            r2 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r2]     // Catch:{ IOException -> 0x006d }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006d }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x006d }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r11, r5)     // Catch:{ IOException -> 0x006d }
            r3.<init>(r4)     // Catch:{ IOException -> 0x006d }
        L_0x0055:
            int r4 = r3.read(r2)     // Catch:{ IOException -> 0x006d }
            r5 = -1
            if (r4 == r5) goto L_0x0060
            r1.write(r2, r6, r4)     // Catch:{ IOException -> 0x006d }
            goto L_0x0055
        L_0x0060:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x006d }
            r0.f53099a = r1     // Catch:{ IOException -> 0x006d }
        L_0x0066:
            com.startapp.C12437y.m53780a((java.io.Closeable) r11)
            r9.disconnect()
            return r0
        L_0x006d:
            r0 = move-exception
            r3 = r10
            r5 = r0
            goto L_0x00a2
        L_0x0071:
            android.net.Uri r11 = android.net.Uri.parse(r8)     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            android.net.Uri$Builder r11 = r11.query(r7)     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            android.net.Uri r2 = r11.build()     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            com.startapp.sdk.common.SDKException r11 = new com.startapp.sdk.common.SDKException     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            java.lang.String r1 = "GET"
            r4 = 1
            r5 = 0
            r0 = r11
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
            throw r11     // Catch:{ IOException -> 0x008d, all -> 0x0092 }
        L_0x008d:
            r11 = move-exception
            r3 = r10
            r5 = r11
            r11 = r7
            goto L_0x00a2
        L_0x0092:
            r8 = move-exception
            r11 = r7
        L_0x0094:
            r7 = r9
            goto L_0x00be
        L_0x0096:
            r11 = move-exception
            r5 = r11
            r11 = r7
            goto L_0x00a1
        L_0x009a:
            r8 = move-exception
            r11 = r7
            goto L_0x00be
        L_0x009d:
            r11 = move-exception
            r5 = r11
            r9 = r7
            r11 = r9
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x00bc }
            android.net.Uri$Builder r8 = r8.buildUpon()     // Catch:{ all -> 0x00bc }
            android.net.Uri$Builder r8 = r8.query(r7)     // Catch:{ all -> 0x00bc }
            android.net.Uri r2 = r8.build()     // Catch:{ all -> 0x00bc }
            com.startapp.sdk.common.SDKException r8 = new com.startapp.sdk.common.SDKException     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "GET"
            r4 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            throw r8     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r8 = move-exception
            goto L_0x0094
        L_0x00be:
            com.startapp.C12437y.m53780a((java.io.Closeable) r11)
            if (r7 == 0) goto L_0x00c6
            r7.disconnect()
        L_0x00c6:
            goto L_0x00c8
        L_0x00c7:
            throw r8
        L_0x00c8:
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11963i7.m52453a(java.lang.String, java.util.Map, java.lang.String, boolean):com.startapp.i7$a");
    }

    /* renamed from: a */
    public static HttpURLConnection m52455a(String str, byte[] bArr, Map<String, String> map, String str2, boolean z, String str3) throws IOException {
        CookieManager cookieManager;
        Map<String, List<String>> map2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.addRequestProperty(RtspHeaders.CACHE_CONTROL, "no-cache");
        if (Build.VERSION.SDK_INT >= 9 && (cookieManager = C11844d2.f52726a) != null && (map2 = cookieManager.get(URI.create(str), httpURLConnection.getRequestProperties())) != null && map2.size() > 0 && map2.get("Cookie").size() > 0) {
            httpURLConnection.addRequestProperty("Cookie", TextUtils.join("=", map2.get("Cookie")));
        }
        if (str2 != null && str2.length() > 0) {
            httpURLConnection.addRequestProperty(RtspHeaders.USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty(RtspHeaders.ACCEPT, "application/json;text/html;text/plain");
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            if (str3 != null) {
                httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, str3);
            }
            if (z) {
                httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
            }
        } else {
            httpURLConnection.setRequestMethod("GET");
        }
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str4 = (String) next.getKey();
                String str5 = (String) next.getValue();
                if (!(str4 == null || str5 == null)) {
                    httpURLConnection.setRequestProperty(str4, str5);
                }
            }
        }
        return httpURLConnection;
    }
}
