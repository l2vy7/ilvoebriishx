package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9787h3 implements Runnable {

    /* renamed from: b */
    private final URL f46319b;

    /* renamed from: c */
    private final byte[] f46320c;

    /* renamed from: d */
    private final C9765f3 f46321d;

    /* renamed from: e */
    private final String f46322e;

    /* renamed from: f */
    private final Map f46323f;

    /* renamed from: g */
    final /* synthetic */ C9797i3 f46324g;

    public C9787h3(C9797i3 i3Var, String str, URL url, byte[] bArr, Map map, C9765f3 f3Var) {
        this.f46324g = i3Var;
        C4604n.m20094g(str);
        C4604n.m20098k(url);
        C4604n.m20098k(f3Var);
        this.f46319b = url;
        this.f46320c = bArr;
        this.f46321d = f3Var;
        this.f46322e = str;
        this.f46323f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3 A[SYNTHETIC, Splitter:B:43:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123 A[SYNTHETIC, Splitter:B:65:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0163 A[SYNTHETIC, Splitter:B:78:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.i3 r1 = r14.f46324g
            r1.mo19271a()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.i3 r3 = r14.f46324g     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.net.URL r4 = r14.f46319b     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            if (r5 == 0) goto L_0x0114
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            com.google.android.gms.measurement.internal.h4 r5 = r3.f21269a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r5.mo19392z()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3.mo19392z()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.util.Map r5 = r14.f46323f     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x005f
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
        L_0x0043:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            goto L_0x0043
        L_0x005f:
            byte[] r5 = r14.f46320c     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x00ac
            com.google.android.gms.measurement.internal.i3 r5 = r14.f46324g     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.x8 r5 = r5.f46518b     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.z8 r5 = r5.mo39292f0()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r6 = r14.f46320c     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r5 = r5.mo39350O(r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.i3 r6 = r14.f46324g     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19286v()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            int r7 = r5.length     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r6.mo38857b(r8, r9)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.connect()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r3.write(r5)     // Catch:{ IOException -> 0x00a7, all -> 0x00a2 }
            r3.close()     // Catch:{ IOException -> 0x00a7, all -> 0x00a2 }
            goto L_0x00ac
        L_0x00a2:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x0120
        L_0x00a7:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x015f
        L_0x00ac:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0107, all -> 0x0103 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ef }
            r3.<init>()     // Catch:{ all -> 0x00ef }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00ef }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00ed }
        L_0x00c1:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00ed }
            if (r7 <= 0) goto L_0x00cb
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00ed }
            goto L_0x00c1
        L_0x00cb:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00ed }
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
            r4.disconnect()
            com.google.android.gms.measurement.internal.i3 r0 = r14.f46324g
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a
            com.google.android.gms.measurement.internal.f4 r0 = r0.mo19273e()
            com.google.android.gms.measurement.internal.g3 r1 = new com.google.android.gms.measurement.internal.g3
            java.lang.String r6 = r14.f46322e
            com.google.android.gms.measurement.internal.f3 r7 = r14.f46321d
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00e9:
            r0.mo38909z(r1)
            return
        L_0x00ed:
            r1 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r1 = move-exception
            r5 = r2
        L_0x00f1:
            if (r5 == 0) goto L_0x00f6
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f6:
            throw r1     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f7:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x0121
        L_0x00fc:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x0161
        L_0x0103:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x0121
        L_0x0107:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x0161
        L_0x010c:
            r3 = move-exception
            r12 = r2
            r5 = r3
            goto L_0x0120
        L_0x0110:
            r3 = move-exception
            r12 = r2
            r10 = r3
            goto L_0x0160
        L_0x0114:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            throw r3     // Catch:{ IOException -> 0x015b, all -> 0x011c }
        L_0x011c:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x0120:
            r9 = 0
        L_0x0121:
            if (r2 == 0) goto L_0x013d
            r2.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x013d
        L_0x0127:
            r1 = move-exception
            com.google.android.gms.measurement.internal.i3 r2 = r14.f46324g
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()
            java.lang.String r3 = r14.f46322e
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)
            r2.mo38858c(r0, r3, r1)
        L_0x013d:
            if (r4 == 0) goto L_0x0142
            r4.disconnect()
        L_0x0142:
            com.google.android.gms.measurement.internal.i3 r0 = r14.f46324g
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a
            com.google.android.gms.measurement.internal.f4 r0 = r0.mo19273e()
            com.google.android.gms.measurement.internal.g3 r1 = new com.google.android.gms.measurement.internal.g3
            java.lang.String r7 = r14.f46322e
            com.google.android.gms.measurement.internal.f3 r8 = r14.f46321d
            r10 = 0
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.mo38909z(r1)
            throw r5
        L_0x015b:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x015f:
            r10 = r5
        L_0x0160:
            r9 = 0
        L_0x0161:
            if (r2 == 0) goto L_0x017d
            r2.close()     // Catch:{ IOException -> 0x0167 }
            goto L_0x017d
        L_0x0167:
            r1 = move-exception
            com.google.android.gms.measurement.internal.i3 r2 = r14.f46324g
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()
            java.lang.String r3 = r14.f46322e
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)
            r2.mo38858c(r0, r3, r1)
        L_0x017d:
            if (r4 == 0) goto L_0x0182
            r4.disconnect()
        L_0x0182:
            com.google.android.gms.measurement.internal.i3 r0 = r14.f46324g
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a
            com.google.android.gms.measurement.internal.f4 r0 = r0.mo19273e()
            com.google.android.gms.measurement.internal.g3 r1 = new com.google.android.gms.measurement.internal.g3
            java.lang.String r7 = r14.f46322e
            com.google.android.gms.measurement.internal.f3 r8 = r14.f46321d
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9787h3.run():void");
    }
}
