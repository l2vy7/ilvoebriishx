package com.adcolony.sdk;

import java.net.URL;

/* renamed from: com.adcolony.sdk.y */
class C2977y {

    /* renamed from: a */
    private URL f11942a;

    C2977y(URL url) {
        this.f11942a = url;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo10083a(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            java.net.URL r3 = r6.f11942a     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.lang.String r4 = "POST"
            r3.setRequestMethod(r4)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            r3.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r3.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            r3.setDoInput(r0)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            byte[] r7 = r7.getBytes(r1)     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            r5.write(r7)     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            r5.close()     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            int r7 = r3.getResponseCode()     // Catch:{ IOException -> 0x005a, all -> 0x0057 }
            r4.close()
            java.io.InputStream r0 = r3.getInputStream()
            if (r0 == 0) goto L_0x0053
            java.io.InputStream r0 = r3.getInputStream()
            r0.close()
        L_0x0053:
            r3.disconnect()
            return r7
        L_0x0057:
            r7 = move-exception
            r1 = r5
            goto L_0x0076
        L_0x005a:
            r7 = move-exception
            goto L_0x0062
        L_0x005c:
            r7 = move-exception
            r1 = r5
            r0 = 0
            goto L_0x0076
        L_0x0060:
            r7 = move-exception
            r0 = 0
        L_0x0062:
            r1 = r5
            goto L_0x0074
        L_0x0064:
            r7 = move-exception
            goto L_0x0077
        L_0x0066:
            r7 = move-exception
            goto L_0x0073
        L_0x0068:
            r7 = move-exception
            goto L_0x006e
        L_0x006a:
            r7 = move-exception
            goto L_0x0072
        L_0x006c:
            r7 = move-exception
            r3 = r1
        L_0x006e:
            r4 = r1
            goto L_0x0077
        L_0x0070:
            r7 = move-exception
            r3 = r1
        L_0x0072:
            r4 = r1
        L_0x0073:
            r0 = 0
        L_0x0074:
            throw r7     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r7 = move-exception
        L_0x0076:
            r2 = r0
        L_0x0077:
            if (r1 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x007e
            r1.close()
        L_0x007e:
            if (r4 == 0) goto L_0x0083
            r4.close()
        L_0x0083:
            if (r3 == 0) goto L_0x0095
            java.io.InputStream r0 = r3.getInputStream()
            if (r0 == 0) goto L_0x0092
            java.io.InputStream r0 = r3.getInputStream()
            r0.close()
        L_0x0092:
            r3.disconnect()
        L_0x0095:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2977y.mo10083a(java.lang.String):int");
    }
}
