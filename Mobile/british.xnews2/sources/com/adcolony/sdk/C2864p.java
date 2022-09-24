package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C2978z;
import com.google.android.exoplayer2.C6540C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.p */
class C2864p implements Runnable {

    /* renamed from: a */
    private final int f11614a = 4096;

    /* renamed from: b */
    private final int f11615b = 299;

    /* renamed from: c */
    private final int f11616c = 60000;

    /* renamed from: d */
    private HttpURLConnection f11617d;

    /* renamed from: e */
    private InputStream f11618e;

    /* renamed from: f */
    private C2714c0 f11619f;

    /* renamed from: g */
    private C2865a f11620g;

    /* renamed from: h */
    private String f11621h;

    /* renamed from: i */
    private int f11622i = 0;

    /* renamed from: j */
    private boolean f11623j = false;

    /* renamed from: k */
    private Map<String, List<String>> f11624k;

    /* renamed from: l */
    private String f11625l = "";

    /* renamed from: m */
    private String f11626m = "";

    /* renamed from: n */
    String f11627n = "";

    /* renamed from: o */
    String f11628o = "";

    /* renamed from: p */
    boolean f11629p;

    /* renamed from: q */
    int f11630q;

    /* renamed from: r */
    int f11631r;

    /* renamed from: com.adcolony.sdk.p$a */
    interface C2865a {
        /* renamed from: a */
        void mo9705a(C2864p pVar, C2714c0 c0Var, Map<String, List<String>> map);
    }

    C2864p(C2714c0 c0Var, C2865a aVar) {
        this.f11619f = c0Var;
        this.f11620g = aVar;
    }

    /* renamed from: a */
    private boolean m9932a() throws IOException {
        JSONObject b = this.f11619f.mo9608b();
        String i = C2976x.m10337i(b, "content_type");
        String i2 = C2976x.m10337i(b, "content");
        int a = C2976x.m10299a(b, "read_timeout", 60000);
        int a2 = C2976x.m10299a(b, "connect_timeout", 60000);
        boolean c = C2976x.m10329c(b, "no_redirect");
        this.f11627n = C2976x.m10337i(b, "url");
        this.f11625l = C2976x.m10337i(b, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(C2684a.m9409c().mo9738y().mo9908d());
        String str = this.f11625l;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.f11626m = sb.toString();
        this.f11621h = C2976x.m10337i(b, "encoding");
        int a3 = C2976x.m10299a(b, "max_size", 0);
        this.f11622i = a3;
        this.f11623j = a3 != 0;
        this.f11630q = 0;
        this.f11618e = null;
        this.f11617d = null;
        this.f11624k = null;
        if (!this.f11627n.startsWith("file://")) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f11627n).openConnection();
            this.f11617d = httpURLConnection;
            httpURLConnection.setReadTimeout(a);
            this.f11617d.setConnectTimeout(a2);
            this.f11617d.setInstanceFollowRedirects(!c);
            this.f11617d.setRequestProperty("Accept-Charset", C6540C.UTF8_NAME);
            String H = C2684a.m9409c().mo9723j().mo9837H();
            if (H != null && !H.equals("")) {
                this.f11617d.setRequestProperty(RtspHeaders.USER_AGENT, H);
            }
            if (!i.equals("")) {
                this.f11617d.setRequestProperty(RtspHeaders.CONTENT_TYPE, i);
            }
            if (this.f11619f.mo9611c().equals("WebServices.post")) {
                this.f11617d.setDoOutput(true);
                this.f11617d.setFixedLengthStreamingMode(i2.getBytes(C6540C.UTF8_NAME).length);
                new PrintStream(this.f11617d.getOutputStream()).print(i2);
            }
        } else if (this.f11627n.startsWith("file:///android_asset/")) {
            Context b2 = C2684a.m9407b();
            if (b2 != null) {
                this.f11618e = b2.getAssets().open(this.f11627n.substring(22));
            }
        } else {
            this.f11618e = new FileInputStream(this.f11627n.substring(7));
        }
        if (this.f11617d == null && this.f11618e == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m9934c() throws Exception {
        OutputStream outputStream;
        InputStream inputStream;
        String c = this.f11619f.mo9611c();
        if (this.f11618e != null) {
            outputStream = this.f11625l.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.f11625l).getAbsolutePath());
        } else if (c.equals("WebServices.download")) {
            this.f11618e = this.f11617d.getInputStream();
            outputStream = new FileOutputStream(this.f11626m);
        } else if (c.equals("WebServices.get")) {
            this.f11618e = this.f11617d.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (c.equals("WebServices.post")) {
            this.f11617d.connect();
            if (this.f11617d.getResponseCode() < 200 || this.f11617d.getResponseCode() > 299) {
                inputStream = this.f11617d.getErrorStream();
            } else {
                inputStream = this.f11617d.getInputStream();
            }
            this.f11618e = inputStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f11617d;
        if (httpURLConnection != null) {
            this.f11631r = httpURLConnection.getResponseCode();
            this.f11624k = this.f11617d.getHeaderFields();
        }
        return m9933a(this.f11618e, outputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2714c0 mo9912b() {
        return this.f11619f;
    }

    public void run() {
        boolean z = false;
        this.f11629p = false;
        try {
            if (m9932a()) {
                this.f11629p = m9934c();
                if (this.f11619f.mo9611c().equals("WebServices.post") && this.f11631r != 200) {
                    this.f11629p = false;
                }
            }
        } catch (MalformedURLException e) {
            new C2978z.C2979a().mo10088a("MalformedURLException: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            this.f11629p = true;
        } catch (OutOfMemoryError unused) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("Out of memory error - disabling AdColony. (").mo10086a(this.f11630q).mo10088a("/").mo10086a(this.f11622i);
            a.mo10088a("): " + this.f11627n).mo10090a(C2978z.f11949i);
            C2684a.m9409c().mo9711b(true);
        } catch (IOException e2) {
            new C2978z.C2979a().mo10088a("Download of ").mo10088a(this.f11627n).mo10088a(" failed: ").mo10088a(e2.toString()).mo10090a(C2978z.f11948h);
            int i = this.f11631r;
            if (i == 0) {
                i = 504;
            }
            this.f11631r = i;
        } catch (IllegalStateException e3) {
            new C2978z.C2979a().mo10088a("okhttp error: ").mo10088a(e3.toString()).mo10090a(C2978z.f11949i);
            e3.printStackTrace();
        } catch (Exception e4) {
            new C2978z.C2979a().mo10088a("Exception: ").mo10088a(e4.toString()).mo10090a(C2978z.f11949i);
            e4.printStackTrace();
        }
        z = true;
        if (z) {
            if (this.f11619f.mo9611c().equals("WebServices.download")) {
                m9931a(this.f11626m, this.f11625l);
            }
            this.f11620g.mo9705a(this, this.f11619f, this.f11624k);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r0 = r8.f11621h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r0 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r0.isEmpty() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r0 = r8.f11621h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r0 = com.google.android.exoplayer2.C6540C.UTF8_NAME;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if ((r10 instanceof java.io.ByteArrayOutputStream) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r8.f11628o = ((java.io.ByteArrayOutputStream) r10).toString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r10 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r9 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9933a(java.io.InputStream r9, java.io.OutputStream r10) throws java.lang.Exception {
        /*
            r8 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0084 }
        L_0x000a:
            r3 = 0
            int r4 = r1.read(r2, r3, r0)     // Catch:{ Exception -> 0x0084 }
            r5 = -1
            if (r4 == r5) goto L_0x0059
            int r5 = r8.f11630q     // Catch:{ Exception -> 0x0084 }
            int r5 = r5 + r4
            r8.f11630q = r5     // Catch:{ Exception -> 0x0084 }
            boolean r6 = r8.f11623j     // Catch:{ Exception -> 0x0084 }
            if (r6 == 0) goto L_0x0055
            int r6 = r8.f11622i     // Catch:{ Exception -> 0x0084 }
            if (r5 > r6) goto L_0x0020
            goto L_0x0055
        L_0x0020:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0084 }
            r2.<init>()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r3 = "Data exceeds expected maximum ("
            r2.append(r3)     // Catch:{ Exception -> 0x0084 }
            int r3 = r8.f11630q     // Catch:{ Exception -> 0x0084 }
            r2.append(r3)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ Exception -> 0x0084 }
            int r3 = r8.f11622i     // Catch:{ Exception -> 0x0084 }
            r2.append(r3)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r3 = "): "
            r2.append(r3)     // Catch:{ Exception -> 0x0084 }
            java.net.HttpURLConnection r3 = r8.f11617d     // Catch:{ Exception -> 0x0084 }
            java.net.URL r3 = r3.getURL()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0084 }
            r2.append(r3)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0084 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0084 }
            throw r0     // Catch:{ Exception -> 0x0084 }
        L_0x0055:
            r10.write(r2, r3, r4)     // Catch:{ Exception -> 0x0084 }
            goto L_0x000a
        L_0x0059:
            java.lang.String r0 = r8.f11621h     // Catch:{ Exception -> 0x0084 }
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0084 }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = r8.f11621h     // Catch:{ Exception -> 0x0084 }
            goto L_0x0068
        L_0x0066:
            java.lang.String r0 = "UTF-8"
        L_0x0068:
            boolean r2 = r10 instanceof java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0084 }
            if (r2 == 0) goto L_0x0075
            r2 = r10
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = r2.toString(r0)     // Catch:{ Exception -> 0x0084 }
            r8.f11628o = r0     // Catch:{ Exception -> 0x0084 }
        L_0x0075:
            r0 = 1
            if (r10 == 0) goto L_0x007b
            r10.close()
        L_0x007b:
            if (r9 == 0) goto L_0x0080
            r9.close()
        L_0x0080:
            r1.close()
            return r0
        L_0x0084:
            r0 = move-exception
            goto L_0x008c
        L_0x0086:
            r1 = move-exception
            goto L_0x0091
        L_0x0088:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x008c:
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x0091:
            if (r10 == 0) goto L_0x0096
            r10.close()
        L_0x0096:
            if (r9 == 0) goto L_0x009b
            r9.close()
        L_0x009b:
            if (r0 == 0) goto L_0x00a0
            r0.close()
        L_0x00a0:
            goto L_0x00a2
        L_0x00a1:
            throw r1
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2864p.m9933a(java.io.InputStream, java.io.OutputStream):boolean");
    }

    /* renamed from: a */
    private void m9931a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (!str2.equals("") && !substring.equals(C2684a.m9409c().mo9738y().mo9908d()) && !new File(str).renameTo(new File(str2))) {
                new C2978z.C2979a().mo10088a("Moving of ").mo10088a(str).mo10088a(" failed.").mo10090a(C2978z.f11948h);
            }
        } catch (Exception e) {
            new C2978z.C2979a().mo10088a("Exception: ").mo10088a(e.toString()).mo10090a(C2978z.f11949i);
            e.printStackTrace();
        }
    }
}
