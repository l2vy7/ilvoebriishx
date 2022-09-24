package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajs */
/* compiled from: IMASDK */
public final class ajs extends aja {

    /* renamed from: a */
    private final int f15107a;

    /* renamed from: b */
    private final int f15108b;

    /* renamed from: c */
    private final String f15109c;

    /* renamed from: d */
    private final ajy f15110d;

    /* renamed from: e */
    private final ajy f15111e;

    /* renamed from: f */
    private ajk f15112f;

    /* renamed from: g */
    private HttpURLConnection f15113g;

    /* renamed from: h */
    private InputStream f15114h;

    /* renamed from: i */
    private boolean f15115i;

    /* renamed from: j */
    private int f15116j;

    /* renamed from: k */
    private long f15117k;

    /* renamed from: l */
    private long f15118l;

    @Deprecated
    public ajs() {
        this((String) null, 8000, 8000, (ajy) null);
    }

    /* renamed from: k */
    private final void m13899k() {
        HttpURLConnection httpURLConnection = this.f15113g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ali.m14023b("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f15113g = null;
        }
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws ajw {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f15117k;
            if (j != -1) {
                long j2 = j - this.f15118l;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            InputStream inputStream = this.f15114h;
            int i3 = amm.f15298a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f15118l += (long) read;
            mo13798i(read);
            return read;
        } catch (IOException e) {
            int i4 = amm.f15298a;
            throw new ajw(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
        if (r6 != 0) goto L_0x00ef;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo13296c(com.google.ads.interactivemedia.p038v3.internal.ajk r17) throws com.google.ads.interactivemedia.p038v3.internal.ajw {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = "Unable to connect"
            r1.f15112f = r2
            r4 = 0
            r1.f15118l = r4
            r1.f15117k = r4
            r16.mo13796g(r17)
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x01e2 }
            android.net.Uri r6 = r2.f15056a     // Catch:{ IOException -> 0x01e2 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x01e2 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x01e2 }
            int r6 = r2.f15057b     // Catch:{ IOException -> 0x01e2 }
            byte[] r7 = r2.f15058c     // Catch:{ IOException -> 0x01e2 }
            long r8 = r2.f15060e     // Catch:{ IOException -> 0x01e2 }
            long r10 = r2.f15061f     // Catch:{ IOException -> 0x01e2 }
            r12 = 1
            boolean r13 = r2.mo13812b(r12)     // Catch:{ IOException -> 0x01e2 }
            java.util.Map<java.lang.String, java.lang.String> r14 = r2.f15059d     // Catch:{ IOException -> 0x01e2 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x01e2 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x01e2 }
            r15 = 8000(0x1f40, float:1.121E-41)
            r0.setConnectTimeout(r15)     // Catch:{ IOException -> 0x01e2 }
            r0.setReadTimeout(r15)     // Catch:{ IOException -> 0x01e2 }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ IOException -> 0x01e2 }
            r15.<init>()     // Catch:{ IOException -> 0x01e2 }
            com.google.ads.interactivemedia.v3.internal.ajy r4 = r1.f15110d     // Catch:{ IOException -> 0x01e2 }
            java.util.Map r4 = r4.mo13831a()     // Catch:{ IOException -> 0x01e2 }
            r15.putAll(r4)     // Catch:{ IOException -> 0x01e2 }
            com.google.ads.interactivemedia.v3.internal.ajy r4 = r1.f15111e     // Catch:{ IOException -> 0x01e2 }
            java.util.Map r4 = r4.mo13831a()     // Catch:{ IOException -> 0x01e2 }
            r15.putAll(r4)     // Catch:{ IOException -> 0x01e2 }
            r15.putAll(r14)     // Catch:{ IOException -> 0x01e2 }
            java.util.Set r4 = r15.entrySet()     // Catch:{ IOException -> 0x01e2 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x01e2 }
        L_0x005b:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x01e2 }
            if (r5 == 0) goto L_0x0077
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x01e2 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x01e2 }
            java.lang.Object r14 = r5.getKey()     // Catch:{ IOException -> 0x01e2 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x01e2 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x01e2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x01e2 }
            r0.setRequestProperty(r14, r5)     // Catch:{ IOException -> 0x01e2 }
            goto L_0x005b
        L_0x0077:
            java.lang.String r4 = com.google.ads.interactivemedia.p038v3.internal.ajz.m13910a(r8, r10)     // Catch:{ IOException -> 0x01e2 }
            if (r4 == 0) goto L_0x0082
            java.lang.String r5 = "Range"
            r0.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x01e2 }
        L_0x0082:
            java.lang.String r4 = r1.f15109c     // Catch:{ IOException -> 0x01e2 }
            if (r4 == 0) goto L_0x008b
            java.lang.String r5 = "User-Agent"
            r0.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x01e2 }
        L_0x008b:
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            java.lang.String r8 = "gzip"
            if (r12 == r13) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r5 = r8
        L_0x0095:
            r0.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x01e2 }
            r0.setInstanceFollowRedirects(r12)     // Catch:{ IOException -> 0x01e2 }
            r4 = 0
            if (r7 == 0) goto L_0x00a0
            r5 = 1
            goto L_0x00a1
        L_0x00a0:
            r5 = 0
        L_0x00a1:
            r0.setDoOutput(r5)     // Catch:{ IOException -> 0x01e2 }
            java.lang.String r5 = com.google.ads.interactivemedia.p038v3.internal.ajk.m13851a(r6)     // Catch:{ IOException -> 0x01e2 }
            r0.setRequestMethod(r5)     // Catch:{ IOException -> 0x01e2 }
            if (r7 == 0) goto L_0x00bf
            int r5 = r7.length     // Catch:{ IOException -> 0x01e2 }
            r0.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x01e2 }
            r0.connect()     // Catch:{ IOException -> 0x01e2 }
            java.io.OutputStream r5 = r0.getOutputStream()     // Catch:{ IOException -> 0x01e2 }
            r5.write(r7)     // Catch:{ IOException -> 0x01e2 }
            r5.close()     // Catch:{ IOException -> 0x01e2 }
            goto L_0x00c2
        L_0x00bf:
            r0.connect()     // Catch:{ IOException -> 0x01e2 }
        L_0x00c2:
            r1.f15113g = r0     // Catch:{ IOException -> 0x01e2 }
            int r5 = r0.getResponseCode()     // Catch:{ IOException -> 0x01d8 }
            r1.f15116j = r5     // Catch:{ IOException -> 0x01d8 }
            r0.getResponseMessage()     // Catch:{ IOException -> 0x01d8 }
            int r3 = r1.f15116j
            java.lang.String r5 = "Content-Range"
            r6 = 200(0xc8, float:2.8E-43)
            r9 = -1
            if (r3 < r6) goto L_0x018b
            r7 = 299(0x12b, float:4.19E-43)
            if (r3 <= r7) goto L_0x00dd
            goto L_0x018b
        L_0x00dd:
            r0.getContentType()
            int r3 = r1.f15116j
            if (r3 != r6) goto L_0x00ed
            long r6 = r2.f15060e
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r6 = 0
        L_0x00ef:
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x011b
            long r13 = r2.f15061f
            int r8 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0104
            r1.f15117k = r13
            goto L_0x011f
        L_0x0104:
            java.lang.String r8 = "Content-Length"
            java.lang.String r8 = r0.getHeaderField(r8)
            java.lang.String r5 = r0.getHeaderField(r5)
            long r13 = com.google.ads.interactivemedia.p038v3.internal.ajz.m13912c(r8, r5)
            int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0118
            long r9 = r13 - r6
        L_0x0118:
            r1.f15117k = r9
            goto L_0x011f
        L_0x011b:
            long r8 = r2.f15061f
            r1.f15117k = r8
        L_0x011f:
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0181 }
            r1.f15114h = r0     // Catch:{ IOException -> 0x0181 }
            if (r3 == 0) goto L_0x0130
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0181 }
            java.io.InputStream r3 = r1.f15114h     // Catch:{ IOException -> 0x0181 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0181 }
            r1.f15114h = r0     // Catch:{ IOException -> 0x0181 }
        L_0x0130:
            r1.f15115i = r12
            r16.mo13797h(r17)
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x013c
            goto L_0x0174
        L_0x013c:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0177 }
        L_0x0140:
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0174
            r2 = 4096(0x1000, double:2.0237E-320)
            long r2 = java.lang.Math.min(r6, r2)     // Catch:{ IOException -> 0x0177 }
            int r3 = (int) r2     // Catch:{ IOException -> 0x0177 }
            java.io.InputStream r2 = r1.f15114h     // Catch:{ IOException -> 0x0177 }
            int r5 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a     // Catch:{ IOException -> 0x0177 }
            int r2 = r2.read(r0, r4, r3)     // Catch:{ IOException -> 0x0177 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0177 }
            boolean r3 = r3.isInterrupted()     // Catch:{ IOException -> 0x0177 }
            if (r3 != 0) goto L_0x016e
            r3 = -1
            if (r2 == r3) goto L_0x0168
            long r8 = (long) r2     // Catch:{ IOException -> 0x0177 }
            long r6 = r6 - r8
            r1.mo13798i(r2)     // Catch:{ IOException -> 0x0177 }
            r2 = 0
            goto L_0x0140
        L_0x0168:
            com.google.ads.interactivemedia.v3.internal.ajh r0 = new com.google.ads.interactivemedia.v3.internal.ajh     // Catch:{ IOException -> 0x0177 }
            r0.<init>()     // Catch:{ IOException -> 0x0177 }
            throw r0     // Catch:{ IOException -> 0x0177 }
        L_0x016e:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0177 }
            r0.<init>()     // Catch:{ IOException -> 0x0177 }
            throw r0     // Catch:{ IOException -> 0x0177 }
        L_0x0174:
            long r2 = r1.f15117k
            return r2
        L_0x0177:
            r0 = move-exception
            r16.m13899k()
            com.google.ads.interactivemedia.v3.internal.ajw r2 = new com.google.ads.interactivemedia.v3.internal.ajw
            r2.<init>((java.io.IOException) r0)
            throw r2
        L_0x0181:
            r0 = move-exception
            r16.m13899k()
            com.google.ads.interactivemedia.v3.internal.ajw r2 = new com.google.ads.interactivemedia.v3.internal.ajw
            r2.<init>((java.io.IOException) r0)
            throw r2
        L_0x018b:
            java.util.Map r3 = r0.getHeaderFields()
            int r4 = r1.f15116j
            r6 = 416(0x1a0, float:5.83E-43)
            if (r4 != r6) goto L_0x01b2
            java.lang.String r4 = r0.getHeaderField(r5)
            long r4 = com.google.ads.interactivemedia.p038v3.internal.ajz.m13911b(r4)
            long r7 = r2.f15060e
            int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x01b2
            r1.f15115i = r12
            r16.mo13797h(r17)
            long r2 = r2.f15061f
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x01af
            return r2
        L_0x01af:
            r2 = 0
            return r2
        L_0x01b2:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x01bc
            com.google.ads.interactivemedia.p038v3.internal.amm.m14210a(r0)     // Catch:{ IOException -> 0x01bf }
            goto L_0x01c1
        L_0x01bc:
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a     // Catch:{ IOException -> 0x01bf }
            goto L_0x01c1
        L_0x01bf:
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
        L_0x01c1:
            r16.m13899k()
            com.google.ads.interactivemedia.v3.internal.ajx r0 = new com.google.ads.interactivemedia.v3.internal.ajx
            int r4 = r1.f15116j
            r0.<init>(r4, r3, r2)
            int r2 = r1.f15116j
            if (r2 != r6) goto L_0x01d7
            com.google.ads.interactivemedia.v3.internal.ajh r2 = new com.google.ads.interactivemedia.v3.internal.ajh
            r2.<init>()
            r0.initCause(r2)
        L_0x01d7:
            throw r0
        L_0x01d8:
            r0 = move-exception
            r16.m13899k()
            com.google.ads.interactivemedia.v3.internal.ajw r2 = new com.google.ads.interactivemedia.v3.internal.ajw
            r2.<init>(r3, r0)
            throw r2
        L_0x01e2:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()
            if (r4 == 0) goto L_0x01fb
            java.lang.String r4 = com.google.ads.interactivemedia.p038v3.internal.amm.m14186C(r4)
            java.lang.String r5 = "cleartext http traffic.*not permitted.*"
            boolean r4 = r4.matches(r5)
            if (r4 == 0) goto L_0x01fb
            com.google.ads.interactivemedia.v3.internal.ajv r3 = new com.google.ads.interactivemedia.v3.internal.ajv
            r3.<init>(r0, r2)
            throw r3
        L_0x01fb:
            com.google.ads.interactivemedia.v3.internal.ajw r2 = new com.google.ads.interactivemedia.v3.internal.ajw
            r2.<init>(r3, r0)
            goto L_0x0202
        L_0x0201:
            throw r2
        L_0x0202:
            goto L_0x0201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.ajs.mo13296c(com.google.ads.interactivemedia.v3.internal.ajk):long");
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        HttpURLConnection httpURLConnection = this.f15113g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo13298e() {
        HttpURLConnection httpURLConnection = this.f15113g;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(3:10|11|(5:15|16|(2:18|(1:20))(2:21|(1:23))|24|(1:28)))|29|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13299f() throws com.google.ads.interactivemedia.p038v3.internal.ajw {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f15114h     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x007a
            long r3 = r10.f15117k     // Catch:{ all -> 0x0089 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0010
            r3 = r5
            goto L_0x0013
        L_0x0010:
            long r7 = r10.f15118l     // Catch:{ all -> 0x0089 }
            long r3 = r3 - r7
        L_0x0013:
            java.net.HttpURLConnection r7 = r10.f15113g     // Catch:{ all -> 0x0089 }
            if (r7 == 0) goto L_0x006d
            int r8 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a     // Catch:{ all -> 0x0089 }
            r9 = 19
            if (r8 < r9) goto L_0x006d
            r9 = 20
            if (r8 <= r9) goto L_0x0022
            goto L_0x006d
        L_0x0022:
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ Exception -> 0x006d }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0032
            int r3 = r7.read()     // Catch:{ Exception -> 0x006d }
            r4 = -1
            if (r3 == r4) goto L_0x006d
            goto L_0x0039
        L_0x0032:
            r5 = 2048(0x800, double:1.0118E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x006d }
            if (r4 != 0) goto L_0x0051
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x006d }
            if (r3 == 0) goto L_0x006d
        L_0x0051:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006d }
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r3)     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006d }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006d }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006d }
            r3.invoke(r7, r4)     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007a
        L_0x0071:
            r2 = move-exception
            com.google.ads.interactivemedia.v3.internal.ajw r3 = new com.google.ads.interactivemedia.v3.internal.ajw     // Catch:{ all -> 0x0089 }
            int r4 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a     // Catch:{ all -> 0x0089 }
            r3.<init>((java.io.IOException) r2)     // Catch:{ all -> 0x0089 }
            throw r3     // Catch:{ all -> 0x0089 }
        L_0x007a:
            r10.f15114h = r0
            r10.m13899k()
            boolean r0 = r10.f15115i
            if (r0 == 0) goto L_0x0088
            r10.f15115i = r1
            r10.mo13799j()
        L_0x0088:
            return
        L_0x0089:
            r2 = move-exception
            r10.f15114h = r0
            r10.m13899k()
            boolean r0 = r10.f15115i
            if (r0 == 0) goto L_0x0098
            r10.f15115i = r1
            r10.mo13799j()
        L_0x0098:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.ajs.mo13299f():void");
    }

    private ajs(String str, int i, int i2, ajy ajy) {
        super(true);
        this.f15109c = str;
        this.f15107a = 8000;
        this.f15108b = 8000;
        this.f15110d = ajy;
        this.f15111e = new ajy();
    }

    /* synthetic */ ajs(String str, int i, int i2, ajy ajy, byte[] bArr) {
        this(str, 8000, 8000, ajy);
    }
}
