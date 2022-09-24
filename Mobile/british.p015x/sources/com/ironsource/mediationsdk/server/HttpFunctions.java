package com.ironsource.mediationsdk.server;

import com.ironsource.mediationsdk.C11232E;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a */
    private static final ExecutorService f51507a = Executors.newSingleThreadExecutor();

    /* renamed from: com.ironsource.mediationsdk.server.HttpFunctions$a */
    static class C11476a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51508b;

        /* renamed from: c */
        private /* synthetic */ String f51509c;

        /* renamed from: d */
        private /* synthetic */ String f51510d;

        /* renamed from: e */
        private /* synthetic */ String f51511e;

        /* renamed from: f */
        private /* synthetic */ C11477a f51512f;

        C11476a(String str, String str2, String str3, String str4, C11477a aVar) {
            this.f51508b = str;
            this.f51509c = str2;
            this.f51510d = str3;
            this.f51511e = str4;
            this.f51512f = aVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.io.OutputStream, java.lang.Throwable] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[SYNTHETIC, Splitter:B:34:0x00ab] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc A[SYNTHETIC, Splitter:B:42:0x00bc] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                java.lang.String r3 = r8.f51508b     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                java.lang.String r3 = r8.f51509c     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                if (r3 == 0) goto L_0x0016
                java.lang.String r4 = r8.f51510d     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                if (r4 != 0) goto L_0x0012
                goto L_0x0016
            L_0x0012:
                com.ironsource.mediationsdk.utils.IronSourceUtils.getBase64Auth(r3, r4)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                throw r1     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            L_0x0016:
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                r3 = 15000(0x3a98, float:2.102E-41)
                r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x0082 }
                r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r3 = "POST"
                r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x0082 }
                r3 = 1
                r2.setDoInput(r3)     // Catch:{ Exception -> 0x0082 }
                r2.setDoOutput(r3)     // Catch:{ Exception -> 0x0082 }
                java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ Exception -> 0x0082 }
                java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0082 }
                java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0082 }
                java.lang.String r6 = "UTF-8"
                r5.<init>(r1, r6)     // Catch:{ Exception -> 0x0082 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r5 = r8.f51511e     // Catch:{ Exception -> 0x0082 }
                r4.write(r5)     // Catch:{ Exception -> 0x0082 }
                r4.flush()     // Catch:{ Exception -> 0x0082 }
                r4.close()     // Catch:{ Exception -> 0x0082 }
                int r4 = r2.getResponseCode()     // Catch:{ Exception -> 0x0082 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r4 != r5) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r3 = 0
            L_0x0055:
                if (r3 != 0) goto L_0x006f
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x0082 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                java.lang.String r7 = "invalid response code "
                r6.<init>(r7)     // Catch:{ Exception -> 0x0082 }
                r6.append(r4)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r4 = " sending request"
                r6.append(r4)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0082 }
                r5.error(r4)     // Catch:{ Exception -> 0x0082 }
            L_0x006f:
                com.ironsource.mediationsdk.server.a r4 = r8.f51512f     // Catch:{ Exception -> 0x0082 }
                r4.mo44316a(r3)     // Catch:{ Exception -> 0x0082 }
                if (r1 == 0) goto L_0x007e
                r1.close()     // Catch:{ IOException -> 0x007a }
                goto L_0x007e
            L_0x007a:
                r0 = move-exception
                r0.printStackTrace()
            L_0x007e:
                r2.disconnect()
                return
            L_0x0082:
                r3 = move-exception
                goto L_0x008a
            L_0x0084:
                r0 = move-exception
                r2 = r1
                goto L_0x00ba
            L_0x0087:
                r2 = move-exception
                r3 = r2
                r2 = r1
            L_0x008a:
                r3.printStackTrace()     // Catch:{ all -> 0x00b9 }
                com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b9 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
                java.lang.String r6 = "exception while sending request "
                r5.<init>(r6)     // Catch:{ all -> 0x00b9 }
                java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00b9 }
                r5.append(r3)     // Catch:{ all -> 0x00b9 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b9 }
                r4.error(r3)     // Catch:{ all -> 0x00b9 }
                com.ironsource.mediationsdk.server.a r3 = r8.f51512f     // Catch:{ all -> 0x00b9 }
                r3.mo44316a(r0)     // Catch:{ all -> 0x00b9 }
                if (r1 == 0) goto L_0x00b3
                r1.close()     // Catch:{ IOException -> 0x00af }
                goto L_0x00b3
            L_0x00af:
                r0 = move-exception
                r0.printStackTrace()
            L_0x00b3:
                if (r2 == 0) goto L_0x00b8
                r2.disconnect()
            L_0x00b8:
                return
            L_0x00b9:
                r0 = move-exception
            L_0x00ba:
                if (r1 == 0) goto L_0x00c4
                r1.close()     // Catch:{ IOException -> 0x00c0 }
                goto L_0x00c4
            L_0x00c0:
                r1 = move-exception
                r1.printStackTrace()
            L_0x00c4:
                if (r2 == 0) goto L_0x00c9
                r2.disconnect()
            L_0x00c9:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.C11476a.run():void");
        }
    }

    public static String getStringFromURL(String str) {
        return getStringFromURL(str, (C11232E.C11233a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStringFromURL(java.lang.String r4, com.ironsource.mediationsdk.C11232E.C11233a r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007e, all -> 0x0071 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x007e, all -> 0x0071 }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ Exception -> 0x007e, all -> 0x0071 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x007e, all -> 0x0071 }
            r1 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r1)     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            r4.setConnectTimeout(r1)     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            java.lang.String r1 = "GET"
            r4.setRequestMethod(r1)     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            r1 = 1
            r4.setDoInput(r1)     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            r4.connect()     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 != r2) goto L_0x0033
            if (r5 == 0) goto L_0x002f
            java.lang.String r1 = "Bad Request - 400"
            r5.mo43782a(r1)     // Catch:{ Exception -> 0x006f, all -> 0x006a }
        L_0x002f:
            r4.disconnect()
            return r0
        L_0x0033:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            r5.<init>(r1)     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068, all -> 0x0062 }
            r1.<init>()     // Catch:{ Exception -> 0x0068, all -> 0x0062 }
        L_0x0046:
            java.lang.String r2 = r5.readLine()     // Catch:{ Exception -> 0x0068, all -> 0x0062 }
            if (r2 == 0) goto L_0x0050
            r1.append(r2)     // Catch:{ Exception -> 0x0068, all -> 0x0062 }
            goto L_0x0046
        L_0x0050:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0068, all -> 0x0062 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0068, all -> 0x0062 }
            r4.disconnect()
            r5.close()
            if (r2 == 0) goto L_0x0061
            return r0
        L_0x0061:
            return r1
        L_0x0062:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r5
            r5 = r3
            goto L_0x0073
        L_0x0068:
            goto L_0x0080
        L_0x006a:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0073
        L_0x006f:
            r5 = r0
            goto L_0x0080
        L_0x0071:
            r5 = move-exception
            r4 = r0
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            r0.disconnect()
        L_0x0078:
            if (r4 == 0) goto L_0x007d
            r4.close()
        L_0x007d:
            throw r5
        L_0x007e:
            r4 = r0
            r5 = r4
        L_0x0080:
            if (r4 == 0) goto L_0x0085
            r4.disconnect()
        L_0x0085:
            if (r5 == 0) goto L_0x008a
            r5.close()
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.getStringFromURL(java.lang.String, com.ironsource.mediationsdk.E$a):java.lang.String");
    }

    public static void sendPostRequest(String str, String str2, C11477a aVar) {
        sendPostRequestWithAutho(str, str2, (String) null, (String) null, aVar);
    }

    public static void sendPostRequestWithAutho(String str, String str2, String str3, String str4, C11477a aVar) {
        f51507a.submit(new C11476a(str, str3, str4, str2, aVar));
    }
}
