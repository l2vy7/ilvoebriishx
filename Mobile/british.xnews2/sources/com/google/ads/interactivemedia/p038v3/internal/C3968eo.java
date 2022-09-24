package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eo */
/* compiled from: IMASDK */
final class C3968eo implements C3969ep {
    private C3968eo() {
    }

    /* synthetic */ C3968eo(byte[] bArr) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p038v3.impl.data.C3791bd mo15741a(com.google.ads.interactivemedia.p038v3.impl.data.C3790bc r9) {
        /*
            r8 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r2 = r9.url()     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r0 = "User-Agent"
            java.lang.String r2 = r9.userAgent()     // Catch:{ IOException -> 0x00a7 }
            r1.setRequestProperty(r0, r2)     // Catch:{ IOException -> 0x00a7 }
            int r0 = r9.connectionTimeoutMs()     // Catch:{ IOException -> 0x00a7 }
            r1.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00a7 }
            int r0 = r9.readTimeoutMs()     // Catch:{ IOException -> 0x00a7 }
            r1.setReadTimeout(r0)     // Catch:{ IOException -> 0x00a7 }
            com.google.ads.interactivemedia.v3.impl.data.bb r0 = r9.requestType()     // Catch:{ IOException -> 0x00a7 }
            com.google.ads.interactivemedia.v3.impl.data.bb r2 = com.google.ads.interactivemedia.p038v3.impl.data.C3789bb.POST     // Catch:{ IOException -> 0x00a7 }
            if (r0 != r2) goto L_0x005e
            r0 = 1
            r1.setDoOutput(r0)     // Catch:{ IOException -> 0x00a7 }
            r0 = 0
            r1.setChunkedStreamingMode(r0)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r9.content()     // Catch:{ IOException -> 0x00a7 }
            if (r0 == 0) goto L_0x005e
            java.io.OutputStream r0 = r1.getOutputStream()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r2 = r9.content()     // Catch:{ all -> 0x0052 }
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0052 }
            byte[] r2 = r2.getBytes(r3)     // Catch:{ all -> 0x0052 }
            r0.write(r2)     // Catch:{ all -> 0x0052 }
            r0.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x005e
        L_0x0052:
            r2 = move-exception
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            com.google.ads.interactivemedia.p038v3.internal.bej.m15774a(r2, r0)     // Catch:{ IOException -> 0x00a7 }
        L_0x005d:
            throw r2     // Catch:{ IOException -> 0x00a7 }
        L_0x005e:
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ IOException -> 0x00a7 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x009b }
            r2.<init>(r0)     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r3.<init>()     // Catch:{ all -> 0x009b }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x009b }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x009b }
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x009b }
            r5.<init>(r2, r6)     // Catch:{ all -> 0x009b }
            r4.<init>(r5)     // Catch:{ all -> 0x009b }
        L_0x0078:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0082
            r3.append(r2)     // Catch:{ all -> 0x009b }
            goto L_0x0078
        L_0x0082:
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x008b
            r0.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x008b:
            java.lang.String r0 = r1.getContentType()     // Catch:{ IOException -> 0x00a7 }
            r1.disconnect()
            java.lang.String r9 = r9.mo13111id()
            com.google.ads.interactivemedia.v3.impl.data.bd r9 = com.google.ads.interactivemedia.p038v3.impl.data.C3791bd.forResponse(r9, r2, r0)
            return r9
        L_0x009b:
            r2 = move-exception
            if (r0 == 0) goto L_0x00a6
            r0.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            com.google.ads.interactivemedia.p038v3.internal.bej.m15774a(r2, r0)     // Catch:{ IOException -> 0x00a7 }
        L_0x00a6:
            throw r2     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            goto L_0x00af
        L_0x00a9:
            r9 = move-exception
            goto L_0x00d5
        L_0x00ab:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x00af:
            boolean r0 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r9 = r9.mo13111id()     // Catch:{ all -> 0x00d3 }
            r0 = 101(0x65, float:1.42E-43)
            com.google.ads.interactivemedia.v3.impl.data.bd r9 = com.google.ads.interactivemedia.p038v3.impl.data.C3791bd.forError(r9, r0)     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x00c2
            r1.disconnect()
        L_0x00c2:
            return r9
        L_0x00c3:
            java.lang.String r9 = r9.mo13111id()     // Catch:{ all -> 0x00d3 }
            r0 = 100
            com.google.ads.interactivemedia.v3.impl.data.bd r9 = com.google.ads.interactivemedia.p038v3.impl.data.C3791bd.forError(r9, r0)     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x00d2
            r1.disconnect()
        L_0x00d2:
            return r9
        L_0x00d3:
            r9 = move-exception
            r0 = r1
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r0.disconnect()
        L_0x00da:
            goto L_0x00dc
        L_0x00db:
            throw r9
        L_0x00dc:
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C3968eo.mo15741a(com.google.ads.interactivemedia.v3.impl.data.bc):com.google.ads.interactivemedia.v3.impl.data.bd");
    }
}
