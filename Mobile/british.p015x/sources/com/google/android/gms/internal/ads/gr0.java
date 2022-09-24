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
final class gr0 implements C7945ml {

    /* renamed from: q */
    private static final Pattern f32398q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    private static final AtomicReference<byte[]> f32399r = new AtomicReference<>();

    /* renamed from: a */
    private final SSLSocketFactory f32400a = new er0(this);

    /* renamed from: b */
    private final int f32401b;

    /* renamed from: c */
    private final int f32402c;

    /* renamed from: d */
    private final String f32403d;

    /* renamed from: e */
    private final C7908ll f32404e;

    /* renamed from: f */
    private final C8160sl<? super gr0> f32405f;

    /* renamed from: g */
    private C7687fl f32406g;

    /* renamed from: h */
    private HttpURLConnection f32407h;

    /* renamed from: i */
    private InputStream f32408i;

    /* renamed from: j */
    private boolean f32409j;

    /* renamed from: k */
    private long f32410k;

    /* renamed from: l */
    private long f32411l;

    /* renamed from: m */
    private long f32412m;

    /* renamed from: n */
    private long f32413n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f32414o;

    /* renamed from: p */
    private final Set<Socket> f32415p = new HashSet();

    gr0(String str, C8160sl<? super gr0> slVar, int i, int i2, int i3) {
        C8195tl.m37897b(str);
        this.f32403d = str;
        this.f32405f = slVar;
        this.f32404e = new C7908ll();
        this.f32401b = i;
        this.f32402c = i2;
        this.f32414o = i3;
    }

    /* renamed from: f */
    private final void m32650f() {
        HttpURLConnection httpURLConnection = this.f32407h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                co0.zzh("Unexpected error while disconnecting", e);
            }
            this.f32407h = null;
        }
    }

    /* renamed from: a */
    public final int mo30699a(byte[] bArr, int i, int i2) throws C7835jl {
        try {
            if (this.f32412m != this.f32410k) {
                byte[] andSet = f32399r.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.f32412m;
                    long j2 = this.f32410k;
                    if (j == j2) {
                        f32399r.set(andSet);
                        break;
                    }
                    int read = this.f32408i.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f32412m += (long) read;
                        C8160sl<? super gr0> slVar = this.f32405f;
                        if (slVar != null) {
                            ((tr0) slVar).mo35026g0(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f32411l;
            if (j3 != -1) {
                long j4 = j3 - this.f32413n;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f32408i.read(bArr, i, i2);
            if (read2 != -1) {
                this.f32413n += (long) read2;
                C8160sl<? super gr0> slVar2 = this.f32405f;
                if (slVar2 == null) {
                    return read2;
                }
                ((tr0) slVar2).mo35026g0(this, read2);
                return read2;
            } else if (this.f32411l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new C7835jl(e, this.f32406g, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        if (r6 != 0) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec A[Catch:{ IOException -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30700b(com.google.android.gms.internal.ads.C7687fl r24) throws com.google.android.gms.internal.ads.C7835jl {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "Unable to connect to "
            r1.f32406g = r2
            r4 = 0
            r1.f32413n = r4
            r1.f32412m = r4
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x02b7 }
            android.net.Uri r7 = r2.f31785a     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x02b7 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x02b7 }
            long r7 = r2.f31787c     // Catch:{ IOException -> 0x02b7 }
            long r9 = r2.f31788d     // Catch:{ IOException -> 0x02b7 }
            r12 = 0
        L_0x001e:
            int r13 = r12 + 1
            r14 = 20
            if (r12 > r14) goto L_0x029e
            java.net.URLConnection r12 = r0.openConnection()     // Catch:{ IOException -> 0x02b7 }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ IOException -> 0x02b7 }
            boolean r15 = r12 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x02b7 }
            if (r15 == 0) goto L_0x0036
            r15 = r12
            javax.net.ssl.HttpsURLConnection r15 = (javax.net.ssl.HttpsURLConnection) r15     // Catch:{ IOException -> 0x02b7 }
            javax.net.ssl.SSLSocketFactory r6 = r1.f32400a     // Catch:{ IOException -> 0x02b7 }
            r15.setSSLSocketFactory(r6)     // Catch:{ IOException -> 0x02b7 }
        L_0x0036:
            int r6 = r1.f32401b     // Catch:{ IOException -> 0x02b7 }
            r12.setConnectTimeout(r6)     // Catch:{ IOException -> 0x02b7 }
            int r6 = r1.f32402c     // Catch:{ IOException -> 0x02b7 }
            r12.setReadTimeout(r6)     // Catch:{ IOException -> 0x02b7 }
            com.google.android.gms.internal.ads.ll r6 = r1.f32404e     // Catch:{ IOException -> 0x02b7 }
            java.util.Map r6 = r6.mo33351a()     // Catch:{ IOException -> 0x02b7 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ IOException -> 0x02b7 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x02b7 }
        L_0x004e:
            boolean r15 = r6.hasNext()     // Catch:{ IOException -> 0x02b7 }
            if (r15 == 0) goto L_0x006c
            java.lang.Object r15 = r6.next()     // Catch:{ IOException -> 0x02b7 }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ IOException -> 0x02b7 }
            java.lang.Object r16 = r15.getKey()     // Catch:{ IOException -> 0x02b7 }
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x02b7 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x02b7 }
            r12.setRequestProperty(r11, r15)     // Catch:{ IOException -> 0x02b7 }
            goto L_0x004e
        L_0x006c:
            r6 = 27
            r17 = -1
            int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x007c
            int r11 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r11 == 0) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r21 = r7
            goto L_0x00b8
        L_0x007c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b7 }
            r11.<init>(r6)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r15 = "bytes="
            r11.append(r15)     // Catch:{ IOException -> 0x02b7 }
            r11.append(r7)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r15 = "-"
            r11.append(r15)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x02b7 }
            int r15 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x00b1
            long r19 = r7 + r9
            r21 = r7
            long r6 = r19 + r17
            int r15 = r11.length()     // Catch:{ IOException -> 0x02b7 }
            int r15 = r15 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b7 }
            r14.<init>(r15)     // Catch:{ IOException -> 0x02b7 }
            r14.append(r11)     // Catch:{ IOException -> 0x02b7 }
            r14.append(r6)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r11 = r14.toString()     // Catch:{ IOException -> 0x02b7 }
            goto L_0x00b3
        L_0x00b1:
            r21 = r7
        L_0x00b3:
            java.lang.String r6 = "Range"
            r12.setRequestProperty(r6, r11)     // Catch:{ IOException -> 0x02b7 }
        L_0x00b8:
            java.lang.String r6 = "User-Agent"
            java.lang.String r7 = r1.f32403d     // Catch:{ IOException -> 0x02b7 }
            r12.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r7 = "identity"
            r12.setRequestProperty(r6, r7)     // Catch:{ IOException -> 0x02b7 }
            r6 = 0
            r12.setInstanceFollowRedirects(r6)     // Catch:{ IOException -> 0x02b7 }
            r12.setDoOutput(r6)     // Catch:{ IOException -> 0x02b7 }
            r12.connect()     // Catch:{ IOException -> 0x02b7 }
            int r6 = r12.getResponseCode()     // Catch:{ IOException -> 0x02b7 }
            r7 = 300(0x12c, float:4.2E-43)
            if (r6 == r7) goto L_0x024f
            r7 = 301(0x12d, float:4.22E-43)
            if (r6 == r7) goto L_0x024f
            r7 = 302(0x12e, float:4.23E-43)
            if (r6 == r7) goto L_0x024f
            r7 = 303(0x12f, float:4.25E-43)
            if (r6 == r7) goto L_0x024f
            r7 = 307(0x133, float:4.3E-43)
            if (r6 == r7) goto L_0x024f
            r7 = 308(0x134, float:4.32E-43)
            if (r6 != r7) goto L_0x00ee
            goto L_0x024f
        L_0x00ee:
            r1.f32407h = r12     // Catch:{ IOException -> 0x02b7 }
            int r0 = r12.getResponseCode()     // Catch:{ IOException -> 0x0228 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x020c
            r6 = 299(0x12b, float:4.19E-43)
            if (r0 <= r6) goto L_0x00fe
            goto L_0x020c
        L_0x00fe:
            if (r0 != r3) goto L_0x0107
            long r6 = r2.f31787c
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r6 = r4
        L_0x0108:
            r1.f32410k = r6
            long r6 = r2.f31788d
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0114
            r1.f32411l = r6
            goto L_0x01ea
        L_0x0114:
            java.net.HttpURLConnection r0 = r1.f32407h
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r7 = "]"
            if (r6 != 0) goto L_0x014a
            long r9 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0129 }
            goto L_0x014c
        L_0x0129:
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r6 = r6 + 28
            r9.<init>(r6)
            java.lang.String r6 = "Unexpected Content-Length ["
            r9.append(r6)
            r9.append(r3)
            r9.append(r7)
            java.lang.String r6 = r9.toString()
            com.google.android.gms.internal.ads.co0.zzg(r6)
        L_0x014a:
            r9 = r17
        L_0x014c:
            java.lang.String r6 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x01de
            java.util.regex.Pattern r6 = f32398q
            java.util.regex.Matcher r6 = r6.matcher(r0)
            boolean r11 = r6.find()
            if (r11 == 0) goto L_0x01de
            r11 = 2
            java.lang.String r11 = r6.group(r11)     // Catch:{ NumberFormatException -> 0x01bc }
            long r11 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x01bc }
            r13 = 1
            java.lang.String r6 = r6.group(r13)     // Catch:{ NumberFormatException -> 0x01bc }
            long r13 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x01bc }
            long r11 = r11 - r13
            r13 = 1
            long r11 = r11 + r13
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0180
            r9 = r11
            goto L_0x01de
        L_0x0180:
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x01de
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ NumberFormatException -> 0x01bc }
            int r4 = r4.length()     // Catch:{ NumberFormatException -> 0x01bc }
            int r4 = r4 + 26
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01bc }
            int r5 = r5.length()     // Catch:{ NumberFormatException -> 0x01bc }
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01bc }
            r5.<init>(r4)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.String r4 = "Inconsistent headers ["
            r5.append(r4)     // Catch:{ NumberFormatException -> 0x01bc }
            r5.append(r3)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.String r3 = "] ["
            r5.append(r3)     // Catch:{ NumberFormatException -> 0x01bc }
            r5.append(r0)     // Catch:{ NumberFormatException -> 0x01bc }
            r5.append(r7)     // Catch:{ NumberFormatException -> 0x01bc }
            java.lang.String r3 = r5.toString()     // Catch:{ NumberFormatException -> 0x01bc }
            com.google.android.gms.internal.ads.co0.zzj(r3)     // Catch:{ NumberFormatException -> 0x01bc }
            long r3 = java.lang.Math.max(r9, r11)     // Catch:{ NumberFormatException -> 0x01bc }
            r9 = r3
            goto L_0x01de
        L_0x01bc:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 27
            int r3 = r3 + r5
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Range ["
            r4.append(r3)
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = r4.toString()
            com.google.android.gms.internal.ads.co0.zzg(r0)
        L_0x01de:
            int r0 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x01e6
            long r3 = r1.f32410k
            long r17 = r9 - r3
        L_0x01e6:
            r3 = r17
            r1.f32411l = r3
        L_0x01ea:
            java.net.HttpURLConnection r0 = r1.f32407h     // Catch:{ IOException -> 0x0201 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0201 }
            r1.f32408i = r0     // Catch:{ IOException -> 0x0201 }
            r3 = 1
            r1.f32409j = r3
            com.google.android.gms.internal.ads.sl<? super com.google.android.gms.internal.ads.gr0> r0 = r1.f32405f
            if (r0 == 0) goto L_0x01fe
            com.google.android.gms.internal.ads.tr0 r0 = (com.google.android.gms.internal.ads.tr0) r0
            r0.mo34721r(r1, r2)
        L_0x01fe:
            long r2 = r1.f32411l
            return r2
        L_0x0201:
            r0 = move-exception
            r23.m32650f()
            com.google.android.gms.internal.ads.jl r3 = new com.google.android.gms.internal.ads.jl
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.C7687fl) r2, (int) r4)
            throw r3
        L_0x020c:
            java.net.HttpURLConnection r3 = r1.f32407h
            java.util.Map r3 = r3.getHeaderFields()
            r23.m32650f()
            com.google.android.gms.internal.ads.kl r4 = new com.google.android.gms.internal.ads.kl
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x0227
            com.google.android.gms.internal.ads.el r0 = new com.google.android.gms.internal.ads.el
            r6 = 0
            r0.<init>(r6)
            r4.initCause(r0)
        L_0x0227:
            throw r4
        L_0x0228:
            r0 = move-exception
            r4 = r0
            r23.m32650f()
            com.google.android.gms.internal.ads.jl r0 = new com.google.android.gms.internal.ads.jl
            android.net.Uri r5 = r2.f31785a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0244
            java.lang.String r3 = r3.concat(r5)
            goto L_0x024a
        L_0x0244:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x024a:
            r5 = 1
            r0.<init>(r3, r4, r2, r5)
            throw r0
        L_0x024f:
            r6 = 0
            java.lang.String r7 = "Location"
            java.lang.String r7 = r12.getHeaderField(r7)     // Catch:{ IOException -> 0x02b7 }
            r12.disconnect()     // Catch:{ IOException -> 0x02b7 }
            if (r7 == 0) goto L_0x0296
            java.net.URL r8 = new java.net.URL     // Catch:{ IOException -> 0x02b7 }
            r8.<init>(r0, r7)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r0 = r8.getProtocol()     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r7 = "https"
            boolean r7 = r7.equals(r0)     // Catch:{ IOException -> 0x02b7 }
            if (r7 != 0) goto L_0x0290
            java.lang.String r7 = "http"
            boolean r7 = r7.equals(r0)     // Catch:{ IOException -> 0x02b7 }
            if (r7 != 0) goto L_0x0290
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02b7 }
            int r6 = r0.length()     // Catch:{ IOException -> 0x02b7 }
            if (r6 == 0) goto L_0x0287
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x02b7 }
            goto L_0x028c
        L_0x0287:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x02b7 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x02b7 }
        L_0x028c:
            r4.<init>(r0)     // Catch:{ IOException -> 0x02b7 }
            throw r4     // Catch:{ IOException -> 0x02b7 }
        L_0x0290:
            r0 = r8
            r12 = r13
            r7 = r21
            goto L_0x001e
        L_0x0296:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x02b7 }
            throw r0     // Catch:{ IOException -> 0x02b7 }
        L_0x029e:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x02b7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b7 }
            r5 = 31
            r4.<init>(r5)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r5 = "Too many redirects: "
            r4.append(r5)     // Catch:{ IOException -> 0x02b7 }
            r4.append(r13)     // Catch:{ IOException -> 0x02b7 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x02b7 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02b7 }
            throw r0     // Catch:{ IOException -> 0x02b7 }
        L_0x02b7:
            r0 = move-exception
            com.google.android.gms.internal.ads.jl r4 = new com.google.android.gms.internal.ads.jl
            android.net.Uri r5 = r2.f31785a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x02cf
            java.lang.String r3 = r3.concat(r5)
            goto L_0x02d5
        L_0x02cf:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x02d5:
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            goto L_0x02db
        L_0x02da:
            throw r4
        L_0x02db:
            goto L_0x02da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gr0.mo30700b(com.google.android.gms.internal.ads.fl):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo32222e(int i) {
        this.f32414o = i;
        for (Socket next : this.f32415p) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.f32414o);
                } catch (SocketException e) {
                    co0.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f32407h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() throws com.google.android.gms.internal.ads.C7835jl {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f32408i     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0077
            java.net.HttpURLConnection r2 = r9.f32407h     // Catch:{ all -> 0x0088 }
            long r3 = r9.f32411l     // Catch:{ all -> 0x0088 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f32413n     // Catch:{ all -> 0x0088 }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.C7836jm.f33934a     // Catch:{ all -> 0x0088 }
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
            java.io.InputStream r2 = r9.f32408i     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.jl r3 = new com.google.android.gms.internal.ads.jl     // Catch:{ all -> 0x0088 }
            com.google.android.gms.internal.ads.fl r4 = r9.f32406g     // Catch:{ all -> 0x0088 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.C7687fl) r4, (int) r5)     // Catch:{ all -> 0x0088 }
            throw r3     // Catch:{ all -> 0x0088 }
        L_0x0077:
            r9.f32408i = r0
            r9.m32650f()
            boolean r0 = r9.f32409j
            if (r0 == 0) goto L_0x0082
            r9.f32409j = r1
        L_0x0082:
            java.util.Set<java.net.Socket> r0 = r9.f32415p
            r0.clear()
            return
        L_0x0088:
            r2 = move-exception
            r9.f32408i = r0
            r9.m32650f()
            boolean r0 = r9.f32409j
            if (r0 == 0) goto L_0x0094
            r9.f32409j = r1
        L_0x0094:
            java.util.Set<java.net.Socket> r0 = r9.f32415p
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gr0.zzd():void");
    }

    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.f32407h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
