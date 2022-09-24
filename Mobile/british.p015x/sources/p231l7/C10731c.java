package p231l7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.common.internal.C4604n;
import com.google.firebase.installations.C10459c;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6479a;
import p006a5.C6488j;
import p133p7.C10919i;
import p205e7.C10518f;
import p216h7.C10581b;
import p231l7.C10732d;
import p231l7.C10736f;

/* renamed from: l7.c */
/* compiled from: FirebaseInstallationServiceClient */
public class C10731c {

    /* renamed from: e */
    private static final Pattern f49365e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    private static final Charset f49366f = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: a */
    private final Context f49367a;

    /* renamed from: b */
    private final C10581b<C10919i> f49368b;

    /* renamed from: c */
    private final C10581b<C10518f> f49369c;

    /* renamed from: d */
    private final C10735e f49370d = new C10735e();

    public C10731c(Context context, C10581b<C10919i> bVar, C10581b<C10518f> bVar2) {
        this.f49367a = context;
        this.f49368b = bVar;
        this.f49369c = bVar2;
    }

    /* renamed from: a */
    private static String m48575a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m48576b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m48577c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m48578f() {
        try {
            Context context = this.f49367a;
            byte[] a = C6479a.m28234a(context, context.getPackageName());
            if (a != null) {
                return C6488j.m28272b(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f49367a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f49367a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m48579g(String str) throws C10459c {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C10459c(e.getMessage(), C10459c.C10460a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m48580h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes(C6540C.UTF8_NAME);
    }

    /* renamed from: i */
    private static boolean m48581i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m48582j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m48583k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o = m48587o(httpURLConnection);
        if (!TextUtils.isEmpty(o)) {
            Log.w("Firebase-Installations", o);
            Log.w("Firebase-Installations", m48575a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m48584l(URL url, String str) throws C10459c {
        C10518f.C10519a a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty(RtspHeaders.ACCEPT, "application/json");
            httpURLConnection.addRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty(RtspHeaders.CACHE_CONTROL, "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f49367a.getPackageName());
            if (!(this.f49369c.get() == null || this.f49368b.get() == null || (a = this.f49369c.get().mo42649a("fire-installations-id")) == C10518f.C10519a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f49368b.get().mo43184a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.mo42650d()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m48578f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C10459c("Firebase Installations Service is unavailable. Please try again later.", C10459c.C10460a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m48585m(String str) {
        C4604n.m20089b(f49365e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private C10732d m48586n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f49366f));
        C10736f.C10737a a = C10736f.m48612a();
        C10732d.C10733a a2 = C10732d.m48594a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(MediationMetaData.KEY_NAME)) {
                a2.mo42890f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo42887c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo42888d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo42899c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo42900d(m48585m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo42886b(a.mo42897a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo42889e(C10732d.C10734b.OK).mo42885a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m48587o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f49366f
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p231l7.C10731c.m48587o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: p */
    private C10736f m48588p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f49366f));
        C10736f.C10737a a = C10736f.m48612a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo42899c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo42900d(m48585m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo42898b(C10736f.C10738b.OK).mo42897a();
    }

    /* renamed from: q */
    private void m48589q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m48591s(httpURLConnection, m48580h(m48576b(str, str2)));
    }

    /* renamed from: r */
    private void m48590r(HttpURLConnection httpURLConnection) throws IOException {
        m48591s(httpURLConnection, m48580h(m48577c()));
    }

    /* renamed from: s */
    private static void m48591s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: d */
    public C10732d mo42901d(String str, String str2, String str3, String str4, String str5) throws C10459c {
        C10732d n;
        if (this.f49370d.mo42903b()) {
            int i = 0;
            URL g = m48579g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m48584l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m48589q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f49370d.mo42904f(responseCode);
                    if (m48581i(responseCode)) {
                        n = m48586n(l);
                    } else {
                        m48583k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new C10459c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C10459c.C10460a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m48582j();
                            n = C10732d.m48594a().mo42889e(C10732d.C10734b.BAD_CONFIG).mo42885a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new C10459c("Firebase Installations Service is unavailable. Please try again later.", C10459c.C10460a.UNAVAILABLE);
        }
        throw new C10459c("Firebase Installations Service is unavailable. Please try again later.", C10459c.C10460a.UNAVAILABLE);
    }

    /* renamed from: e */
    public C10736f mo42902e(String str, String str2, String str3, String str4) throws C10459c {
        C10736f p;
        if (this.f49370d.mo42903b()) {
            int i = 0;
            URL g = m48579g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m48584l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty(RtspHeaders.AUTHORIZATION, "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    m48590r(l);
                    int responseCode = l.getResponseCode();
                    this.f49370d.mo42904f(responseCode);
                    if (m48581i(responseCode)) {
                        p = m48588p(l);
                    } else {
                        m48583k(l, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new C10459c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C10459c.C10460a.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    m48582j();
                                    p = C10736f.m48612a().mo42898b(C10736f.C10738b.BAD_CONFIG).mo42897a();
                                } else {
                                    l.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        p = C10736f.m48612a().mo42898b(C10736f.C10738b.AUTH_ERROR).mo42897a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new C10459c("Firebase Installations Service is unavailable. Please try again later.", C10459c.C10460a.UNAVAILABLE);
        }
        throw new C10459c("Firebase Installations Service is unavailable. Please try again later.", C10459c.C10460a.UNAVAILABLE);
    }
}
