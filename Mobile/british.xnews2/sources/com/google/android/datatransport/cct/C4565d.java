package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import p020c4.C2657a;
import p142r3.C5996b;
import p147s3.C6025a;
import p147s3.C6051j;
import p147s3.C6052k;
import p147s3.C6055l;
import p147s3.C6057m;
import p147s3.C6060o;
import p147s3.C6064p;
import p153t3.C6140g;
import p153t3.C6141h;
import p158u3.C6197f;
import p158u3.C6199g;
import p158u3.C6207m;
import p169w3.C6315a;
import p174x3.C6391b;
import p188a7.C6501a;

/* renamed from: com.google.android.datatransport.cct.d */
/* compiled from: CctTransportBackend */
final class C4565d implements C6207m {

    /* renamed from: a */
    private final C6501a f19826a;

    /* renamed from: b */
    private final ConnectivityManager f19827b;

    /* renamed from: c */
    private final Context f19828c;

    /* renamed from: d */
    final URL f19829d;

    /* renamed from: e */
    private final C2657a f19830e;

    /* renamed from: f */
    private final C2657a f19831f;

    /* renamed from: g */
    private final int f19832g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* compiled from: CctTransportBackend */
    static final class C4566a {

        /* renamed from: a */
        final URL f19833a;

        /* renamed from: b */
        final C6051j f19834b;

        /* renamed from: c */
        final String f19835c;

        C4566a(URL url, C6051j jVar, String str) {
            this.f19833a = url;
            this.f19834b = jVar;
            this.f19835c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C4566a mo17000a(URL url) {
            return new C4566a(url, this.f19834b, this.f19835c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* compiled from: CctTransportBackend */
    static final class C4567b {

        /* renamed from: a */
        final int f19836a;

        /* renamed from: b */
        final URL f19837b;

        /* renamed from: c */
        final long f19838c;

        C4567b(int i, URL url, long j) {
            this.f19836a = i;
            this.f19837b = url;
            this.f19838c = j;
        }
    }

    C4565d(Context context, C2657a aVar, C2657a aVar2, int i) {
        this.f19826a = C6051j.m26614b();
        this.f19828c = context;
        this.f19827b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f19829d = m19692m(C4562a.f19816c);
        this.f19830e = aVar2;
        this.f19831f = aVar;
        this.f19832g = i;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x010d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x012a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0131 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.C4565d.C4567b m19683d(com.google.android.datatransport.cct.C4565d.C4566a r13) throws java.io.IOException {
        /*
            r12 = this;
            java.net.URL r0 = r13.f19833a
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            p169w3.C6315a.m27820a(r1, r2, r0)
            java.net.URL r0 = r13.f19833a
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            int r2 = r12.f19832g
            r0.setReadTimeout(r2)
            r2 = 1
            r0.setDoOutput(r2)
            r3 = 0
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "2.3.3"
            r2[r3] = r4
            java.lang.String r3 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "User-Agent"
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r0.setRequestProperty(r2, r3)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r0.setRequestProperty(r4, r5)
            java.lang.String r5 = "Accept-Encoding"
            r0.setRequestProperty(r5, r3)
            java.lang.String r3 = r13.f19835c
            if (r3 == 0) goto L_0x0055
            java.lang.String r5 = "X-Goog-Api-Key"
            r0.setRequestProperty(r5, r3)
        L_0x0055:
            r5 = 0
            r3 = 0
            java.io.OutputStream r7 = r0.getOutputStream()     // Catch:{ ConnectException -> 0x0144, UnknownHostException -> 0x0142, b -> 0x0134, IOException -> 0x0132 }
            java.util.zip.GZIPOutputStream r8 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x012b }
            r8.<init>(r7)     // Catch:{ all -> 0x012b }
            a7.a r9 = r12.f19826a     // Catch:{ all -> 0x0126 }
            s3.j r13 = r13.f19834b     // Catch:{ all -> 0x0126 }
            java.io.BufferedWriter r10 = new java.io.BufferedWriter     // Catch:{ all -> 0x0126 }
            java.io.OutputStreamWriter r11 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0126 }
            r11.<init>(r8)     // Catch:{ all -> 0x0126 }
            r10.<init>(r11)     // Catch:{ all -> 0x0126 }
            r9.mo24327a(r13, r10)     // Catch:{ all -> 0x0126 }
            r8.close()     // Catch:{ all -> 0x012b }
            if (r7 == 0) goto L_0x007a
            r7.close()     // Catch:{ ConnectException -> 0x0144, UnknownHostException -> 0x0142, b -> 0x0134, IOException -> 0x0132 }
        L_0x007a:
            int r13 = r0.getResponseCode()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Status Code: "
            r7.append(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            p169w3.C6315a.m27824e(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Content-Type: "
            r7.append(r8)
            java.lang.String r4 = r0.getHeaderField(r4)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            p169w3.C6315a.m27824e(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Content-Encoding: "
            r4.append(r7)
            java.lang.String r7 = r0.getHeaderField(r2)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            p169w3.C6315a.m27824e(r1, r4)
            r1 = 302(0x12e, float:4.23E-43)
            if (r13 == r1) goto L_0x0115
            r1 = 301(0x12d, float:4.22E-43)
            if (r13 == r1) goto L_0x0115
            r1 = 307(0x133, float:4.3E-43)
            if (r13 != r1) goto L_0x00cf
            goto L_0x0115
        L_0x00cf:
            r1 = 200(0xc8, float:2.8E-43)
            if (r13 == r1) goto L_0x00d9
            com.google.android.datatransport.cct.d$b r0 = new com.google.android.datatransport.cct.d$b
            r0.<init>(r13, r3, r5)
            return r0
        L_0x00d9:
            java.io.InputStream r1 = r0.getInputStream()
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ all -> 0x010e }
            java.io.InputStream r0 = m19691l(r1, r0)     // Catch:{ all -> 0x010e }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0107 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0107 }
            r4.<init>(r0)     // Catch:{ all -> 0x0107 }
            r2.<init>(r4)     // Catch:{ all -> 0x0107 }
            s3.n r2 = p147s3.C6059n.m26659b(r2)     // Catch:{ all -> 0x0107 }
            long r4 = r2.mo23237c()     // Catch:{ all -> 0x0107 }
            com.google.android.datatransport.cct.d$b r2 = new com.google.android.datatransport.cct.d$b     // Catch:{ all -> 0x0107 }
            r2.<init>(r13, r3, r4)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0101
            r0.close()     // Catch:{ all -> 0x010e }
        L_0x0101:
            if (r1 == 0) goto L_0x0106
            r1.close()
        L_0x0106:
            return r2
        L_0x0107:
            r13 = move-exception
            if (r0 == 0) goto L_0x010d
            r0.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            throw r13     // Catch:{ all -> 0x010e }
        L_0x010e:
            r13 = move-exception
            if (r1 == 0) goto L_0x0114
            r1.close()     // Catch:{ all -> 0x0114 }
        L_0x0114:
            throw r13
        L_0x0115:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            com.google.android.datatransport.cct.d$b r1 = new com.google.android.datatransport.cct.d$b
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r13, r2, r5)
            return r1
        L_0x0126:
            r13 = move-exception
            r8.close()     // Catch:{ all -> 0x012a }
        L_0x012a:
            throw r13     // Catch:{ all -> 0x012b }
        L_0x012b:
            r13 = move-exception
            if (r7 == 0) goto L_0x0131
            r7.close()     // Catch:{ all -> 0x0131 }
        L_0x0131:
            throw r13     // Catch:{ ConnectException -> 0x0144, UnknownHostException -> 0x0142, b -> 0x0134, IOException -> 0x0132 }
        L_0x0132:
            r13 = move-exception
            goto L_0x0135
        L_0x0134:
            r13 = move-exception
        L_0x0135:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            p169w3.C6315a.m27822c(r1, r0, r13)
            com.google.android.datatransport.cct.d$b r13 = new com.google.android.datatransport.cct.d$b
            r0 = 400(0x190, float:5.6E-43)
            r13.<init>(r0, r3, r5)
            return r13
        L_0x0142:
            r13 = move-exception
            goto L_0x0145
        L_0x0144:
            r13 = move-exception
        L_0x0145:
            java.lang.String r0 = "Couldn't open connection, returning with 500"
            p169w3.C6315a.m27822c(r1, r0, r13)
            com.google.android.datatransport.cct.d$b r13 = new com.google.android.datatransport.cct.d$b
            r0 = 500(0x1f4, float:7.0E-43)
            r13.<init>(r0, r3, r5)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.C4565d.m19683d(com.google.android.datatransport.cct.d$a):com.google.android.datatransport.cct.d$b");
    }

    /* renamed from: e */
    private static int m19684e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C6060o.C6062b.UNKNOWN_MOBILE_SUBTYPE.mo23251d();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return C6060o.C6062b.COMBINED.mo23251d();
        }
        if (C6060o.C6062b.m26667a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: f */
    private static int m19685f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C6060o.C6063c.NONE.mo23252d();
        }
        return networkInfo.getType();
    }

    /* renamed from: g */
    private static int m19686g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C6315a.m27822c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: h */
    private C6051j m19687h(C6197f fVar) {
        C6055l.C6056a aVar;
        HashMap hashMap = new HashMap();
        for (C6141h next : fVar.mo23611b()) {
            String j = next.mo23478j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C6141h hVar = (C6141h) ((List) entry.getValue()).get(0);
            C6057m.C6058a b = C6057m.m26640a().mo23234f(C6064p.DEFAULT).mo23235g(this.f19831f.mo9336a()).mo23236h(this.f19830e.mo9336a()).mo23230b(C6052k.m26616a().mo23200c(C6052k.C6054b.ANDROID_FIREBASE).mo23199b(C6025a.m26507a().mo23177m(Integer.valueOf(hVar.mo23523g("sdk-version"))).mo23174j(hVar.mo23522b("model")).mo23170f(hVar.mo23522b("hardware")).mo23168d(hVar.mo23522b("device")).mo23176l(hVar.mo23522b("product")).mo23175k(hVar.mo23522b("os-uild")).mo23172h(hVar.mo23522b("manufacturer")).mo23169e(hVar.mo23522b("fingerprint")).mo23167c(hVar.mo23522b("country")).mo23171g(hVar.mo23522b("locale")).mo23173i(hVar.mo23522b("mcc_mnc")).mo23166b(hVar.mo23522b("application_build")).mo23165a()).mo23198a());
            try {
                b.mo23249i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo23250j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C6141h hVar2 : (List) entry.getValue()) {
                C6140g e = hVar2.mo23474e();
                C5996b b2 = e.mo23518b();
                if (b2.equals(C5996b.m26427b("proto"))) {
                    aVar = C6055l.m26624j(e.mo23517a());
                } else if (b2.equals(C5996b.m26427b("json"))) {
                    aVar = C6055l.m26623i(new String(e.mo23517a(), Charset.forName(C6540C.UTF8_NAME)));
                } else {
                    C6315a.m27825f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo23213c(hVar2.mo23476f()).mo23214d(hVar2.mo23479k()).mo23218h(hVar2.mo23524h("tz-offset")).mo23215e(C6060o.m26661a().mo23248c(C6060o.C6063c.m26669a(hVar2.mo23523g("net-type"))).mo23247b(C6060o.C6062b.m26667a(hVar2.mo23523g("mobile-subtype"))).mo23246a());
                if (hVar2.mo23473d() != null) {
                    aVar.mo23212b(hVar2.mo23473d());
                }
                arrayList3.add(aVar.mo23211a());
            }
            b.mo23231c(arrayList3);
            arrayList2.add(b.mo23229a());
        }
        return C6051j.m26613a(arrayList2);
    }

    /* renamed from: i */
    private static TelephonyManager m19688i(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: j */
    static long m19689j() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* renamed from: k */
    static /* synthetic */ C4566a m19690k(C4566a aVar, C4567b bVar) {
        URL url = bVar.f19837b;
        if (url == null) {
            return null;
        }
        C6315a.m27820a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo17000a(bVar.f19837b);
    }

    /* renamed from: l */
    private static InputStream m19691l(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: m */
    private static URL m19692m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C6199g mo16998a(C6197f fVar) {
        C6051j h = m19687h(fVar);
        URL url = this.f19829d;
        String str = null;
        if (fVar.mo23612c() != null) {
            try {
                C4562a c = C4562a.m19673c(fVar.mo23612c());
                if (c.mo16993d() != null) {
                    str = c.mo16993d();
                }
                if (c.mo16994e() != null) {
                    url = m19692m(c.mo16994e());
                }
            } catch (IllegalArgumentException unused) {
                return C6199g.m27154a();
            }
        }
        try {
            C4567b bVar = (C4567b) C6391b.m28072a(5, new C4566a(url, h, str), C4563b.m19679a(this), C4564c.m19680b());
            int i = bVar.f19836a;
            if (i == 200) {
                return C6199g.m27155d(bVar.f19838c);
            }
            if (i < 500) {
                if (i != 404) {
                    return C6199g.m27154a();
                }
            }
            return C6199g.m27156e();
        } catch (IOException e) {
            C6315a.m27822c("CctTransportBackend", "Could not make request to the backend", e);
            return C6199g.m27156e();
        }
    }

    /* renamed from: b */
    public C6141h mo16999b(C6141h hVar) {
        NetworkInfo activeNetworkInfo = this.f19827b.getActiveNetworkInfo();
        return hVar.mo23526l().mo23527a("sdk-version", Build.VERSION.SDK_INT).mo23529c("model", Build.MODEL).mo23529c("hardware", Build.HARDWARE).mo23529c("device", Build.DEVICE).mo23529c("product", Build.PRODUCT).mo23529c("os-uild", Build.ID).mo23529c("manufacturer", Build.MANUFACTURER).mo23529c("fingerprint", Build.FINGERPRINT).mo23528b("tz-offset", m19689j()).mo23527a("net-type", m19685f(activeNetworkInfo)).mo23527a("mobile-subtype", m19684e(activeNetworkInfo)).mo23529c("country", Locale.getDefault().getCountry()).mo23529c("locale", Locale.getDefault().getLanguage()).mo23529c("mcc_mnc", m19688i(this.f19828c).getSimOperator()).mo23529c("application_build", Integer.toString(m19686g(this.f19828c))).mo23481d();
    }

    C4565d(Context context, C2657a aVar, C2657a aVar2) {
        this(context, aVar, aVar2, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND);
    }
}
