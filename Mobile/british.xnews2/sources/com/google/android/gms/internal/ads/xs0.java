package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xs0 extends va1 implements kr1 {

    /* renamed from: u */
    private static final Pattern f41287u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference<byte[]> f41288v = new AtomicReference<>();

    /* renamed from: e */
    private final SSLSocketFactory f41289e = new ws0(this);

    /* renamed from: f */
    private final int f41290f;

    /* renamed from: g */
    private final int f41291g;

    /* renamed from: h */
    private final String f41292h;

    /* renamed from: i */
    private final jq1 f41293i;

    /* renamed from: j */
    private ci1 f41294j;

    /* renamed from: k */
    private HttpURLConnection f41295k;

    /* renamed from: l */
    private InputStream f41296l;

    /* renamed from: m */
    private boolean f41297m;

    /* renamed from: n */
    private int f41298n;

    /* renamed from: o */
    private long f41299o;

    /* renamed from: p */
    private long f41300p;

    /* renamed from: q */
    private long f41301q;

    /* renamed from: r */
    private long f41302r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f41303s;

    /* renamed from: t */
    private final Set<Socket> f41304t = new HashSet();

    xs0(String str, mt1 mt1, int i, int i2, int i3) {
        super(true);
        nu1.m20744c(str);
        this.f41292h = str;
        this.f41293i = new jq1();
        this.f41290f = i;
        this.f41291g = i2;
        this.f41303s = i3;
        if (mt1 != null) {
            mo30796h(mt1);
        }
    }

    /* renamed from: q */
    private final void m39588q() {
        HttpURLConnection httpURLConnection = this.f41295k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                co0.zzh("Unexpected error while disconnecting", e);
            }
            this.f41295k = null;
        }
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws ho1 {
        try {
            if (this.f41301q != this.f41299o) {
                byte[] andSet = f41288v.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.f41301q;
                    long j2 = this.f41299o;
                    if (j == j2) {
                        f41288v.set(andSet);
                        break;
                    }
                    int read = this.f41296l.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f41301q += (long) read;
                        mo35395j(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f41300p;
            if (j3 != -1) {
                long j4 = j3 - this.f41302r;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f41296l.read(bArr, i, i2);
            if (read2 != -1) {
                this.f41302r += (long) read2;
                mo35395j(read2);
                return read2;
            } else if (this.f41300p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new ho1(e, this.f41294j, 2000, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010b, code lost:
        if (r2 != 0) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f3  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30478i(com.google.android.gms.internal.ads.ci1 r22) throws com.google.android.gms.internal.ads.ho1 {
        /*
            r21 = this;
            r1 = r21
            r7 = r22
            java.lang.String r2 = "Unable to connect to "
            r1.f41294j = r7
            r3 = 0
            r1.f41302r = r3
            r1.f41301q = r3
            r5 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x02d6 }
            android.net.Uri r6 = r7.f30390a     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x02d6 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x02d6 }
            long r8 = r7.f30395f     // Catch:{ IOException -> 0x02d6 }
            long r10 = r7.f30396g     // Catch:{ IOException -> 0x02d6 }
            boolean r6 = r7.mo30932b(r5)     // Catch:{ IOException -> 0x02d6 }
            r13 = 0
        L_0x0023:
            int r14 = r13 + 1
            r15 = 20
            if (r13 > r15) goto L_0x02bd
            java.net.URLConnection r13 = r0.openConnection()     // Catch:{ IOException -> 0x02d6 }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x02d6 }
            boolean r5 = r13 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x02d6 }
            if (r5 == 0) goto L_0x003b
            r5 = r13
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x02d6 }
            javax.net.ssl.SSLSocketFactory r12 = r1.f41289e     // Catch:{ IOException -> 0x02d6 }
            r5.setSSLSocketFactory(r12)     // Catch:{ IOException -> 0x02d6 }
        L_0x003b:
            int r5 = r1.f41290f     // Catch:{ IOException -> 0x02d6 }
            r13.setConnectTimeout(r5)     // Catch:{ IOException -> 0x02d6 }
            int r5 = r1.f41291g     // Catch:{ IOException -> 0x02d6 }
            r13.setReadTimeout(r5)     // Catch:{ IOException -> 0x02d6 }
            com.google.android.gms.internal.ads.jq1 r5 = r1.f41293i     // Catch:{ IOException -> 0x02d6 }
            java.util.Map r5 = r5.mo32928a()     // Catch:{ IOException -> 0x02d6 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x02d6 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02d6 }
        L_0x0053:
            boolean r12 = r5.hasNext()     // Catch:{ IOException -> 0x02d6 }
            if (r12 == 0) goto L_0x0073
            java.lang.Object r12 = r5.next()     // Catch:{ IOException -> 0x02d6 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IOException -> 0x02d6 }
            java.lang.Object r16 = r12.getKey()     // Catch:{ IOException -> 0x02d6 }
            r15 = r16
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x02d6 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x02d6 }
            r13.setRequestProperty(r15, r12)     // Catch:{ IOException -> 0x02d6 }
            r15 = 20
            goto L_0x0053
        L_0x0073:
            r5 = 27
            r17 = -1
            int r12 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x007f
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 == 0) goto L_0x00b9
        L_0x007f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d6 }
            r12.<init>(r5)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r15 = "bytes="
            r12.append(r15)     // Catch:{ IOException -> 0x02d6 }
            r12.append(r8)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r15 = "-"
            r12.append(r15)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x02d6 }
            int r15 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x00b4
            long r19 = r8 + r10
            long r3 = r19 + r17
            int r15 = r12.length()     // Catch:{ IOException -> 0x02d6 }
            r16 = 20
            int r15 = r15 + 20
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d6 }
            r5.<init>(r15)     // Catch:{ IOException -> 0x02d6 }
            r5.append(r12)     // Catch:{ IOException -> 0x02d6 }
            r5.append(r3)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r12 = r5.toString()     // Catch:{ IOException -> 0x02d6 }
        L_0x00b4:
            java.lang.String r3 = "Range"
            r13.setRequestProperty(r3, r12)     // Catch:{ IOException -> 0x02d6 }
        L_0x00b9:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.f41292h     // Catch:{ IOException -> 0x02d6 }
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x02d6 }
            if (r6 != 0) goto L_0x00c9
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x02d6 }
        L_0x00c9:
            r3 = 0
            r13.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x02d6 }
            r13.setDoOutput(r3)     // Catch:{ IOException -> 0x02d6 }
            r13.connect()     // Catch:{ IOException -> 0x02d6 }
            int r4 = r13.getResponseCode()     // Catch:{ IOException -> 0x02d6 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x026c
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x026c
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x026c
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x026c
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x026c
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x00f1
            goto L_0x026c
        L_0x00f1:
            r1.f41295k = r13     // Catch:{ IOException -> 0x02d6 }
            int r0 = r13.getResponseCode()     // Catch:{ IOException -> 0x0246 }
            r1.f41298n = r0     // Catch:{ IOException -> 0x0246 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L_0x021e
            r3 = 299(0x12b, float:4.19E-43)
            if (r0 <= r3) goto L_0x0103
            goto L_0x021e
        L_0x0103:
            if (r0 != r2) goto L_0x010e
            long r2 = r7.f30395f
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r2 = 0
        L_0x0110:
            r1.f41299o = r2
            r2 = 1
            boolean r0 = r7.mo30932b(r2)
            if (r0 != 0) goto L_0x01fc
            long r2 = r7.f30396g
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
            r1.f41300p = r2
            goto L_0x0200
        L_0x0123:
            java.net.HttpURLConnection r0 = r1.f41295k
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.getHeaderField(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "]"
            if (r3 != 0) goto L_0x0159
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0138 }
            goto L_0x015b
        L_0x0138:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 28
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Length ["
            r5.append(r3)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            com.google.android.gms.internal.ads.co0.zzg(r3)
        L_0x0159:
            r5 = r17
        L_0x015b:
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x01ef
            java.util.regex.Pattern r3 = f41287u
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L_0x01ef
            r8 = 2
            java.lang.String r8 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x01cd }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x01cd }
            r10 = 1
            java.lang.String r3 = r3.group(r10)     // Catch:{ NumberFormatException -> 0x01cd }
            long r10 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01cd }
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            r19 = 0
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x0191
            r5 = r8
            goto L_0x01ef
        L_0x0191:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01ef
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x01cd }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x01cd }
            int r3 = r3 + 26
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01cd }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x01cd }
            int r3 = r3 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01cd }
            r10.<init>(r3)     // Catch:{ NumberFormatException -> 0x01cd }
            java.lang.String r3 = "Inconsistent headers ["
            r10.append(r3)     // Catch:{ NumberFormatException -> 0x01cd }
            r10.append(r2)     // Catch:{ NumberFormatException -> 0x01cd }
            java.lang.String r2 = "] ["
            r10.append(r2)     // Catch:{ NumberFormatException -> 0x01cd }
            r10.append(r0)     // Catch:{ NumberFormatException -> 0x01cd }
            r10.append(r4)     // Catch:{ NumberFormatException -> 0x01cd }
            java.lang.String r2 = r10.toString()     // Catch:{ NumberFormatException -> 0x01cd }
            com.google.android.gms.internal.ads.co0.zzj(r2)     // Catch:{ NumberFormatException -> 0x01cd }
            long r2 = java.lang.Math.max(r5, r8)     // Catch:{ NumberFormatException -> 0x01cd }
            r5 = r2
            goto L_0x01ef
        L_0x01cd:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r8 = 27
            int r2 = r2 + r8
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected Content-Range ["
            r3.append(r2)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.co0.zzg(r0)
        L_0x01ef:
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x01f7
            long r2 = r1.f41299o
            long r17 = r5 - r2
        L_0x01f7:
            r2 = r17
            r1.f41300p = r2
            goto L_0x0200
        L_0x01fc:
            long r2 = r7.f30396g
            r1.f41300p = r2
        L_0x0200:
            java.net.HttpURLConnection r0 = r1.f41295k     // Catch:{ IOException -> 0x0211 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0211 }
            r1.f41296l = r0     // Catch:{ IOException -> 0x0211 }
            r2 = 1
            r1.f41297m = r2
            r21.mo35398m(r22)
            long r2 = r1.f41300p
            return r2
        L_0x0211:
            r0 = move-exception
            r21.m39588q()
            com.google.android.gms.internal.ads.ho1 r2 = new com.google.android.gms.internal.ads.ho1
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 1
            r2.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.ci1) r7, (int) r3, (int) r4)
            throw r2
        L_0x021e:
            java.net.HttpURLConnection r0 = r1.f41295k
            java.util.Map r6 = r0.getHeaderFields()
            r21.m39588q()
            com.google.android.gms.internal.ads.ip1 r0 = new com.google.android.gms.internal.ads.ip1
            int r3 = r1.f41298n
            r4 = 0
            r5 = 0
            byte[] r8 = com.google.android.gms.internal.ads.d13.f20200f
            r2 = r0
            r7 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r2 = r1.f41298n
            r3 = 416(0x1a0, float:5.83E-43)
            if (r2 != r3) goto L_0x0245
            com.google.android.gms.internal.ads.ze1 r2 = new com.google.android.gms.internal.ads.ze1
            r3 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r3)
            r0.initCause(r2)
        L_0x0245:
            throw r0
        L_0x0246:
            r0 = move-exception
            r21.m39588q()
            com.google.android.gms.internal.ads.ho1 r3 = new com.google.android.gms.internal.ads.ho1
            android.net.Uri r4 = r7.f30390a
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0261
            java.lang.String r2 = r2.concat(r4)
            goto L_0x0267
        L_0x0261:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            r2 = r4
        L_0x0267:
            r4 = 1
            r3.<init>((java.lang.String) r2, (java.io.IOException) r0, (com.google.android.gms.internal.ads.ci1) r7, (int) r4)
            throw r3
        L_0x026c:
            r19 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r13.getHeaderField(r4)     // Catch:{ IOException -> 0x02d6 }
            r13.disconnect()     // Catch:{ IOException -> 0x02d6 }
            if (r4 == 0) goto L_0x02b5
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x02d6 }
            r5.<init>(r0, r4)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r0 = r5.getProtocol()     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02d6 }
            if (r4 != 0) goto L_0x02ae
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02d6 }
            if (r4 != 0) goto L_0x02ae
            java.net.ProtocolException r3 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r4 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02d6 }
            int r5 = r0.length()     // Catch:{ IOException -> 0x02d6 }
            if (r5 == 0) goto L_0x02a5
            java.lang.String r0 = r4.concat(r0)     // Catch:{ IOException -> 0x02d6 }
            goto L_0x02aa
        L_0x02a5:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x02d6 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02d6 }
        L_0x02aa:
            r3.<init>(r0)     // Catch:{ IOException -> 0x02d6 }
            throw r3     // Catch:{ IOException -> 0x02d6 }
        L_0x02ae:
            r0 = r5
            r13 = r14
            r3 = r19
            r5 = 1
            goto L_0x0023
        L_0x02b5:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r3 = "Null location redirect"
            r0.<init>(r3)     // Catch:{ IOException -> 0x02d6 }
            throw r0     // Catch:{ IOException -> 0x02d6 }
        L_0x02bd:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x02d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d6 }
            r4 = 31
            r3.<init>(r4)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r4 = "Too many redirects: "
            r3.append(r4)     // Catch:{ IOException -> 0x02d6 }
            r3.append(r14)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02d6 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x02d6 }
            throw r0     // Catch:{ IOException -> 0x02d6 }
        L_0x02d6:
            r0 = move-exception
            com.google.android.gms.internal.ads.ho1 r3 = new com.google.android.gms.internal.ads.ho1
            android.net.Uri r4 = r7.f30390a
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x02ee
            java.lang.String r2 = r2.concat(r4)
            goto L_0x02f4
        L_0x02ee:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            r2 = r4
        L_0x02f4:
            r4 = 1
            r3.<init>((java.lang.String) r2, (java.io.IOException) r0, (com.google.android.gms.internal.ads.ci1) r7, (int) r4)
            goto L_0x02fa
        L_0x02f9:
            throw r3
        L_0x02fa:
            goto L_0x02f9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xs0.mo30478i(com.google.android.gms.internal.ads.ci1):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo35793p(int i) {
        this.f41303s = i;
        for (Socket next : this.f41304t) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.f41303s);
                } catch (SocketException e) {
                    co0.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f41295k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final Uri zzi() {
        HttpURLConnection httpURLConnection = this.f41295k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj() throws com.google.android.gms.internal.ads.ho1 {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f41296l     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0079
            java.net.HttpURLConnection r2 = r9.f41295k     // Catch:{ all -> 0x008d }
            long r3 = r9.f41300p     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f41302r     // Catch:{ all -> 0x008d }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ all -> 0x008d }
            r8 = 19
            if (r7 == r8) goto L_0x001f
            r8 = 20
            if (r7 == r8) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0067 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            int r3 = r2.read()     // Catch:{ Exception -> 0x0067 }
            r4 = -1
            if (r3 == r4) goto L_0x0067
            goto L_0x0036
        L_0x002f:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r4 != 0) goto L_0x004e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0067
        L_0x004e:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0067 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            java.io.InputStream r2 = r9.f41296l     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0079
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.ho1 r3 = new com.google.android.gms.internal.ads.ho1     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.ci1 r4 = r9.f41294j     // Catch:{ all -> 0x008d }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.ci1) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x0079:
            r9.f41296l = r0
            r9.m39588q()
            boolean r0 = r9.f41297m
            if (r0 == 0) goto L_0x0087
            r9.f41297m = r1
            r9.mo35396k()
        L_0x0087:
            java.util.Set<java.net.Socket> r0 = r9.f41304t
            r0.clear()
            return
        L_0x008d:
            r2 = move-exception
            r9.f41296l = r0
            r9.m39588q()
            boolean r0 = r9.f41297m
            if (r0 == 0) goto L_0x009c
            r9.f41297m = r1
            r9.mo35396k()
        L_0x009c:
            java.util.Set<java.net.Socket> r0 = r9.f41304t
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xs0.zzj():void");
    }
}
