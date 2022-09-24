package com.ironsource.p055c;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.ironsource.mediationsdk.C11412m;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.c.b */
public class C4947b {

    /* renamed from: a */
    private C11412m f21959a = new C11412m();

    /* renamed from: com.ironsource.c.b$a */
    public static class C4948a {

        /* renamed from: a */
        final String f21960a;

        /* renamed from: b */
        final String f21961b;

        /* renamed from: c */
        final String f21962c;

        /* renamed from: d */
        final int f21963d;

        /* renamed from: e */
        final int f21964e;

        /* renamed from: f */
        final String f21965f;

        /* renamed from: g */
        ArrayList<Pair<String, String>> f21966g;

        /* renamed from: com.ironsource.c.b$a$a */
        public static class C4949a {

            /* renamed from: a */
            List<Pair<String, String>> f21967a = new ArrayList();

            /* renamed from: b */
            public String f21968b;

            /* renamed from: c */
            public String f21969c = "POST";

            /* renamed from: d */
            public String f21970d;

            /* renamed from: e */
            int f21971e = DefaultControlDispatcher.DEFAULT_FAST_FORWARD_MS;

            /* renamed from: f */
            int f21972f = DefaultControlDispatcher.DEFAULT_FAST_FORWARD_MS;

            /* renamed from: g */
            String f21973g = C6540C.UTF8_NAME;

            /* renamed from: a */
            public final C4949a mo20553a(List<Pair<String, String>> list) {
                this.f21967a.addAll(list);
                return this;
            }

            /* renamed from: a */
            public final C4948a mo20554a() {
                return new C4948a(this);
            }
        }

        public C4948a(C4949a aVar) {
            this.f21960a = aVar.f21968b;
            this.f21961b = aVar.f21969c;
            this.f21962c = aVar.f21970d;
            this.f21966g = new ArrayList<>(aVar.f21967a);
            this.f21963d = aVar.f21971e;
            this.f21964e = aVar.f21972f;
            this.f21965f = aVar.f21973g;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[SYNTHETIC, Splitter:B:31:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.p055c.C4950c m22702a(com.ironsource.p055c.C4947b.C4948a r7) {
        /*
            java.lang.String r0 = r7.f21960a
            java.lang.String r1 = r7.f21962c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x00ca
            com.ironsource.c.c r0 = new com.ironsource.c.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.lang.String r3 = r7.f21960a     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            int r3 = r7.f21963d     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            int r3 = r7.f21964e     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.lang.String r3 = r7.f21961b     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f21966g     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            m22704b(r2, r3)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f21961b     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r7.f21962c     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            java.lang.String r4 = r7.f21965f     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            int r4 = r3.length     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            m22705c(r2, r3)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
        L_0x005f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            r0.f21974a = r3     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            if (r1 == 0) goto L_0x0071
            byte[] r3 = com.ironsource.environment.C4952a.C49531.m22722a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            r0.f21975b = r3     // Catch:{ IOException -> 0x007c, all -> 0x007a }
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            r2.disconnect()
            goto L_0x00b9
        L_0x007a:
            r7 = move-exception
            goto L_0x00bf
        L_0x007c:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0086
        L_0x0081:
            r7 = move-exception
            r2 = r1
            goto L_0x00bf
        L_0x0084:
            r3 = move-exception
            r2 = r1
        L_0x0086:
            if (r1 == 0) goto L_0x00ba
            int r4 = r1.getResponseCode()     // Catch:{ all -> 0x00bb }
            r0.f21974a = r4     // Catch:{ all -> 0x00bb }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00ba
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = r7.f21960a     // Catch:{ all -> 0x00bb }
            r4.append(r7)     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch:{ all -> 0x00bb }
            int r7 = r0.f21974a     // Catch:{ all -> 0x00bb }
            r4.append(r7)     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00bb }
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00b6
            r2.close()
        L_0x00b6:
            r1.disconnect()
        L_0x00b9:
            return r0
        L_0x00ba:
            throw r3     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x00bf:
            if (r1 == 0) goto L_0x00c4
            r1.close()
        L_0x00c4:
            if (r2 == 0) goto L_0x00c9
            r2.disconnect()
        L_0x00c9:
            throw r7
        L_0x00ca:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.p055c.C4947b.m22702a(com.ironsource.c.b$a):com.ironsource.c.c");
    }

    /* renamed from: a */
    public static C4950c m22703a(String str, String str2, List<Pair<String, String>> list) {
        C4948a.C4949a aVar = new C4948a.C4949a();
        aVar.f21968b = str;
        aVar.f21970d = str2;
        aVar.f21969c = "POST";
        aVar.mo20553a(list);
        return m22702a(aVar.mo20554a());
    }

    /* renamed from: b */
    private static void m22704b(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair next : list) {
            httpURLConnection.setRequestProperty((String) next.first, (String) next.second);
        }
    }

    /* renamed from: c */
    private static void m22705c(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    public void mo20549a(Boolean bool) {
        C11412m.m51068a("fs", (Object) bool);
    }

    /* renamed from: a */
    public void mo20550a(String str) {
        C11412m.m51068a("usid", (Object) str);
    }

    /* renamed from: a */
    public void mo20551a(JSONObject jSONObject) {
        C11412m.m51068a("tkgp", (Object) jSONObject);
    }

    /* renamed from: b */
    public void mo20552b(String str) {
        C11412m.m51068a("audt", (Object) str);
    }
}
