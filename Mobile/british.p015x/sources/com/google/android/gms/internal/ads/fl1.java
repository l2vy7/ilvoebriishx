package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fl1 extends va1 implements kr1 {

    /* renamed from: e */
    private final boolean f31789e;

    /* renamed from: f */
    private final int f31790f;

    /* renamed from: g */
    private final int f31791g;

    /* renamed from: h */
    private final String f31792h;

    /* renamed from: i */
    private final jq1 f31793i;

    /* renamed from: j */
    private final jq1 f31794j;

    /* renamed from: k */
    private ci1 f31795k;

    /* renamed from: l */
    private HttpURLConnection f31796l;

    /* renamed from: m */
    private InputStream f31797m;

    /* renamed from: n */
    private boolean f31798n;

    /* renamed from: o */
    private int f31799o;

    /* renamed from: p */
    private long f31800p;

    /* renamed from: q */
    private long f31801q;

    private fl1(String str, int i, int i2, boolean z, jq1 jq1, c43<String> c43, boolean z2) {
        super(true);
        this.f31792h = str;
        this.f31790f = i;
        this.f31791g = i2;
        this.f31789e = z;
        this.f31793i = jq1;
        this.f31794j = new jq1();
    }

    /* synthetic */ fl1(String str, int i, int i2, boolean z, jq1 jq1, c43 c43, boolean z2, ek1 ek1) {
        this(str, i, i2, z, jq1, (c43<String>) null, false);
    }

    /* renamed from: n */
    private final HttpURLConnection m32196n(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f31790f);
        httpURLConnection.setReadTimeout(this.f31791g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f31793i.mo32928a());
        hashMap.putAll(this.f31794j.mo32928a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0 && j2 == -1) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            str = sb.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty(RtspHeaders.RANGE, str);
        }
        String str2 = this.f31792h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(ci1.m31032a(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: o */
    private final URL m32197o(URL url, String str, ci1 ci1) throws ho1 {
        String str2;
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    if (valueOf.length() != 0) {
                        str2 = "Unsupported protocol redirect: ".concat(valueOf);
                    } else {
                        str2 = new String("Unsupported protocol redirect: ");
                    }
                    throw new ho1(str2, ci1, 2001, 1);
                } else if (this.f31789e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new ho1(sb.toString(), ci1, 2001, 1);
                }
            } catch (MalformedURLException e) {
                throw new ho1((IOException) e, ci1, 2001, 1);
            }
        } else {
            throw new ho1("Null location redirect", ci1, 2001, 1);
        }
    }

    /* renamed from: p */
    private final void m32198p() {
        HttpURLConnection httpURLConnection = this.f31796l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                fc2.m20475a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f31796l = null;
        }
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws ho1 {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f31800p;
            if (j != -1) {
                long j2 = j - this.f31801q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            InputStream inputStream = this.f31797m;
            int i3 = d13.f20195a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f31801q += (long) read;
            mo35395j(read);
            return read;
        } catch (IOException e) {
            ci1 ci1 = this.f31795k;
            int i4 = d13.f20195a;
            throw ho1.m32905a(e, ci1, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        if (r8 != 0) goto L_0x00b4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30478i(com.google.android.gms.internal.ads.ci1 r25) throws com.google.android.gms.internal.ads.ho1 {
        /*
            r24 = this;
            r12 = r24
            r13 = r25
            r12.f31795k = r13
            r14 = 0
            r12.f31801q = r14
            r12.f31800p = r14
            r24.mo35397l(r25)
            r11 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x01f1 }
            android.net.Uri r0 = r13.f30390a     // Catch:{ IOException -> 0x01f1 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01f1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01f1 }
            long r9 = r13.f30395f     // Catch:{ IOException -> 0x01f1 }
            long r7 = r13.f30396g     // Catch:{ IOException -> 0x01f1 }
            boolean r0 = r13.mo30932b(r11)     // Catch:{ IOException -> 0x01f1 }
            boolean r1 = r12.f31789e     // Catch:{ IOException -> 0x01f1 }
            r5 = 0
            if (r1 != 0) goto L_0x003d
            r3 = 1
            r4 = 0
            r16 = 1
            java.util.Map<java.lang.String, java.lang.String> r6 = r13.f30393d     // Catch:{ IOException -> 0x01f1 }
            r1 = r24
            r17 = r6
            r5 = r9
            r9 = r0
            r10 = r16
            r11 = r17
            java.net.HttpURLConnection r0 = r1.m32196n(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x01f1 }
            goto L_0x0087
        L_0x003d:
            r11 = r2
            r5 = 0
        L_0x003f:
            int r6 = r5 + 1
            r1 = 20
            if (r5 > r1) goto L_0x01ca
            r3 = 1
            r4 = 0
            r16 = 0
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.f30393d     // Catch:{ IOException -> 0x01f1 }
            r1 = r24
            r2 = r11
            r17 = r5
            r18 = r6
            r5 = r9
            r19 = r7
            r21 = r9
            r9 = r0
            r10 = r16
            r23 = r11
            r11 = r17
            java.net.HttpURLConnection r1 = r1.m32196n(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x01f1 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x01f1 }
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch:{ IOException -> 0x01f1 }
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 301(0x12d, float:4.22E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 302(0x12e, float:4.23E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 303(0x12f, float:4.25E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 308(0x134, float:4.32E-43)
            if (r2 != r4) goto L_0x0086
            goto L_0x01b7
        L_0x0086:
            r0 = r1
        L_0x0087:
            r12.f31796l = r0     // Catch:{ IOException -> 0x01f1 }
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x01f1 }
            r12.f31799o = r1     // Catch:{ IOException -> 0x01f1 }
            java.lang.String r3 = r0.getResponseMessage()     // Catch:{ IOException -> 0x01f1 }
            int r1 = r12.f31799o
            r2 = 2008(0x7d8, float:2.814E-42)
            java.lang.String r4 = "Content-Range"
            r5 = 200(0xc8, float:2.8E-43)
            r6 = -1
            if (r1 < r5) goto L_0x015f
            r8 = 299(0x12b, float:4.19E-43)
            if (r1 <= r8) goto L_0x00a5
            goto L_0x015f
        L_0x00a5:
            r0.getContentType()
            int r1 = r12.f31799o
            if (r1 != r5) goto L_0x00b3
            long r8 = r13.f30395f
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r8 = r14
        L_0x00b4:
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r1 = r0.getHeaderField(r1)
            java.lang.String r3 = "gzip"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00e2
            long r10 = r13.f30396g
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00cb
            r12.f31800p = r10
            goto L_0x00e6
        L_0x00cb:
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            java.lang.String r4 = r0.getHeaderField(r4)
            long r3 = com.google.android.gms.internal.ads.ls1.m34546a(r3, r4)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00df
            long r6 = r3 - r8
        L_0x00df:
            r12.f31800p = r6
            goto L_0x00e6
        L_0x00e2:
            long r3 = r13.f30396g
            r12.f31800p = r3
        L_0x00e6:
            r3 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0154 }
            r12.f31797m = r0     // Catch:{ IOException -> 0x0154 }
            if (r1 == 0) goto L_0x00f9
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0154 }
            java.io.InputStream r1 = r12.f31797m     // Catch:{ IOException -> 0x0154 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0154 }
            r12.f31797m = r0     // Catch:{ IOException -> 0x0154 }
        L_0x00f9:
            r5 = 1
            r12.f31798n = r5
            r24.mo35398m(r25)
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            goto L_0x0140
        L_0x0104:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0143 }
        L_0x0108:
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0140
            r6 = 4096(0x1000, double:2.0237E-320)
            long r6 = java.lang.Math.min(r8, r6)     // Catch:{ IOException -> 0x0143 }
            int r1 = (int) r6     // Catch:{ IOException -> 0x0143 }
            java.io.InputStream r4 = r12.f31797m     // Catch:{ IOException -> 0x0143 }
            int r6 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ IOException -> 0x0143 }
            r6 = 0
            int r1 = r4.read(r0, r6, r1)     // Catch:{ IOException -> 0x0143 }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0143 }
            boolean r4 = r4.isInterrupted()     // Catch:{ IOException -> 0x0143 }
            if (r4 != 0) goto L_0x0135
            r4 = -1
            if (r1 == r4) goto L_0x012f
            long r10 = (long) r1     // Catch:{ IOException -> 0x0143 }
            long r8 = r8 - r10
            r12.mo35395j(r1)     // Catch:{ IOException -> 0x0143 }
            goto L_0x0108
        L_0x012f:
            com.google.android.gms.internal.ads.ho1 r0 = new com.google.android.gms.internal.ads.ho1     // Catch:{ IOException -> 0x0143 }
            r0.<init>(r13, r2, r5)     // Catch:{ IOException -> 0x0143 }
            throw r0     // Catch:{ IOException -> 0x0143 }
        L_0x0135:
            com.google.android.gms.internal.ads.ho1 r0 = new com.google.android.gms.internal.ads.ho1     // Catch:{ IOException -> 0x0143 }
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0143 }
            r1.<init>()     // Catch:{ IOException -> 0x0143 }
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.ci1) r13, (int) r3, (int) r5)     // Catch:{ IOException -> 0x0143 }
            throw r0     // Catch:{ IOException -> 0x0143 }
        L_0x0140:
            long r0 = r12.f31800p
            return r0
        L_0x0143:
            r0 = move-exception
            r24.m32198p()
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ho1
            if (r1 == 0) goto L_0x014e
            com.google.android.gms.internal.ads.ho1 r0 = (com.google.android.gms.internal.ads.ho1) r0
            throw r0
        L_0x014e:
            com.google.android.gms.internal.ads.ho1 r1 = new com.google.android.gms.internal.ads.ho1
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.ci1) r13, (int) r3, (int) r5)
            throw r1
        L_0x0154:
            r0 = move-exception
            r5 = 1
            r24.m32198p()
            com.google.android.gms.internal.ads.ho1 r1 = new com.google.android.gms.internal.ads.ho1
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.ci1) r13, (int) r3, (int) r5)
            throw r1
        L_0x015f:
            r5 = 1
            java.util.Map r8 = r0.getHeaderFields()
            int r1 = r12.f31799o
            r9 = 416(0x1a0, float:5.83E-43)
            if (r1 != r9) goto L_0x0186
            java.lang.String r1 = r0.getHeaderField(r4)
            long r10 = com.google.android.gms.internal.ads.ls1.m34547b(r1)
            r4 = r3
            long r2 = r13.f30395f
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 != 0) goto L_0x0187
            r12.f31798n = r5
            r24.mo35398m(r25)
            long r0 = r13.f30396g
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0185
            return r0
        L_0x0185:
            return r14
        L_0x0186:
            r4 = r3
        L_0x0187:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x0192
            byte[] r0 = com.google.android.gms.internal.ads.d13.m20325x(r0)     // Catch:{ IOException -> 0x0196 }
            goto L_0x0194
        L_0x0192:
            byte[] r0 = com.google.android.gms.internal.ads.d13.f20200f     // Catch:{ IOException -> 0x0196 }
        L_0x0194:
            r7 = r0
            goto L_0x0199
        L_0x0196:
            byte[] r0 = com.google.android.gms.internal.ads.d13.f20200f
            goto L_0x0194
        L_0x0199:
            r24.m32198p()
            int r0 = r12.f31799o
            if (r0 != r9) goto L_0x01a8
            com.google.android.gms.internal.ads.ze1 r0 = new com.google.android.gms.internal.ads.ze1
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1)
            goto L_0x01a9
        L_0x01a8:
            r0 = 0
        L_0x01a9:
            com.google.android.gms.internal.ads.ip1 r9 = new com.google.android.gms.internal.ads.ip1
            int r2 = r12.f31799o
            r1 = r9
            r3 = r4
            r4 = r0
            r5 = r8
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7)
            throw r9
        L_0x01b7:
            r5 = 1
            r6 = 0
            r1.disconnect()     // Catch:{ IOException -> 0x01ef }
            r2 = r23
            java.net.URL r11 = r12.m32197o(r2, r3, r13)     // Catch:{ IOException -> 0x01ef }
            r5 = r18
            r7 = r19
            r9 = r21
            goto L_0x003f
        L_0x01ca:
            r18 = r6
            r5 = 1
            com.google.android.gms.internal.ads.ho1 r0 = new com.google.android.gms.internal.ads.ho1     // Catch:{ IOException -> 0x01ef }
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x01ef }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ef }
            r3 = 31
            r2.<init>(r3)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch:{ IOException -> 0x01ef }
            r3 = r18
            r2.append(r3)     // Catch:{ IOException -> 0x01ef }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01ef }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01ef }
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.ci1) r13, (int) r2, (int) r5)     // Catch:{ IOException -> 0x01ef }
            throw r0     // Catch:{ IOException -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            goto L_0x01f3
        L_0x01f1:
            r0 = move-exception
            r5 = 1
        L_0x01f3:
            r24.m32198p()
            com.google.android.gms.internal.ads.ho1 r0 = com.google.android.gms.internal.ads.ho1.m32905a(r0, r13, r5)
            goto L_0x01fc
        L_0x01fb:
            throw r0
        L_0x01fc:
            goto L_0x01fb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fl1.mo30478i(com.google.android.gms.internal.ads.ci1):long");
    }

    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f31796l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public final Uri zzi() {
        HttpURLConnection httpURLConnection = this.f31796l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(3:10|11|(5:15|16|(2:18|(1:20))(2:21|(1:23))|24|(4:28|29|30|31)))|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj() throws com.google.android.gms.internal.ads.ho1 {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f31797m     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007f
            long r3 = r10.f31800p     // Catch:{ all -> 0x008e }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0010
            r3 = r5
            goto L_0x0013
        L_0x0010:
            long r7 = r10.f31801q     // Catch:{ all -> 0x008e }
            long r3 = r3 - r7
        L_0x0013:
            java.net.HttpURLConnection r7 = r10.f31796l     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x006d
            int r8 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ all -> 0x008e }
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
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006d }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006d }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006d }
            r3.invoke(r7, r4)     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007f
        L_0x0071:
            r2 = move-exception
            com.google.android.gms.internal.ads.ho1 r3 = new com.google.android.gms.internal.ads.ho1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.ci1 r4 = r10.f31795k     // Catch:{ all -> 0x008e }
            int r5 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ all -> 0x008e }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.ci1) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x007f:
            r10.f31797m = r0
            r10.m32198p()
            boolean r0 = r10.f31798n
            if (r0 == 0) goto L_0x008d
            r10.f31798n = r1
            r10.mo35396k()
        L_0x008d:
            return
        L_0x008e:
            r2 = move-exception
            r10.f31797m = r0
            r10.m32198p()
            boolean r0 = r10.f31798n
            if (r0 == 0) goto L_0x009d
            r10.f31798n = r1
            r10.mo35396k()
        L_0x009d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fl1.zzj():void");
    }
}
