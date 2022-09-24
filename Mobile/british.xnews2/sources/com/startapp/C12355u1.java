package com.startapp;

import com.google.android.exoplayer2.C6540C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.startapp.u1 */
/* compiled from: Sta */
public class C12355u1 {

    /* renamed from: a */
    private static final String f54802a = "u1";

    /* renamed from: b */
    private static final boolean f54803b = false;

    /* renamed from: c */
    private static final String f54804c = "cdnconfig.txt";

    /* renamed from: d */
    private static final String f54805d = "cdnconfig.txt.sig";

    /* renamed from: e */
    private static final int f54806e = 10000;

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m53517a() {
        /*
            r0 = 0
            com.startapp.t4 r1 = com.startapp.C12385v4.m53561b()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.CONNECTIVITY_TEST_CDNCONFIG_URL()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "[PROJECTID]"
            com.startapp.t4 r3 = com.startapp.C12385v4.m53561b()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = r3.PROJECT_ID()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0096 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0096 }
            r2.<init>(r1)     // Catch:{ all -> 0x0096 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0096 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "GET"
            r1.setRequestMethod(r0)     // Catch:{ all -> 0x0094 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r0)     // Catch:{ all -> 0x0094 }
            r1.setReadTimeout(r0)     // Catch:{ all -> 0x0094 }
            com.startapp.w4 r0 = com.startapp.C12385v4.m53562c()     // Catch:{ all -> 0x0094 }
            long r2 = r0.mo46749g()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = m53516a((long) r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "If-Modified-Since"
            r1.setRequestProperty(r2, r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "Connection"
            java.lang.String r2 = "close"
            r1.setRequestProperty(r0, r2)     // Catch:{ all -> 0x0094 }
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0094 }
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto L_0x005b
            com.startapp.w4 r0 = com.startapp.C12385v4.m53562c()     // Catch:{ all -> 0x0094 }
            long r2 = com.startapp.C12112oa.m52716d()     // Catch:{ all -> 0x0094 }
            r0.mo46741e((long) r2)     // Catch:{ all -> 0x0094 }
            goto L_0x009f
        L_0x005b:
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0094 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x009f
            long r2 = r1.getLastModified()     // Catch:{ all -> 0x0094 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ all -> 0x0094 }
            boolean r4 = m53519a((java.io.InputStream) r0)     // Catch:{ all -> 0x008f }
            r0.close()     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x0087
            com.startapp.w4 r0 = com.startapp.C12385v4.m53562c()     // Catch:{ all -> 0x0094 }
            long r4 = com.startapp.C12112oa.m52716d()     // Catch:{ all -> 0x0094 }
            r0.mo46741e((long) r4)     // Catch:{ all -> 0x0094 }
            com.startapp.w4 r0 = com.startapp.C12385v4.m53562c()     // Catch:{ all -> 0x0094 }
            r0.mo46727b((long) r2)     // Catch:{ all -> 0x0094 }
            goto L_0x009f
        L_0x0087:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "Verification of downloaded cdn config failed"
            r0.<init>(r2)     // Catch:{ all -> 0x0094 }
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x008f:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0094 }
            throw r2     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            goto L_0x009a
        L_0x0096:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x009a:
            com.startapp.C12356u2.m53522a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x00a2
        L_0x009f:
            r1.disconnect()
        L_0x00a2:
            return
        L_0x00a3:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a9
            r1.disconnect()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12355u1.m53517a():void");
    }

    /* renamed from: a */
    private static boolean m53519a(InputStream inputStream) throws IOException {
        C12338t1 t1Var;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byte[] bArr = new byte[512];
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                } else if (!nextEntry.isDirectory()) {
                    if (nextEntry.getName().equalsIgnoreCase(f54804c)) {
                        for (int read = zipInputStream.read(bArr); read != -1; read = zipInputStream.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase(f54805d)) {
                        for (int read2 = zipInputStream.read(bArr); read2 != -1; read2 = zipInputStream.read(bArr)) {
                            byteArrayOutputStream2.write(bArr, 0, read2);
                        }
                        byteArrayOutputStream2.flush();
                        zipInputStream.closeEntry();
                    }
                }
            } catch (Throwable th) {
                C12356u2.m53524b(th);
            }
        }
        zipInputStream.close();
        try {
            byteArrayOutputStream2.close();
        } catch (Throwable th2) {
            C12356u2.m53524b(th2);
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable th3) {
            C12356u2.m53524b(th3);
        }
        boolean z = true;
        if (C12385v4.m53561b().CONNECTIVITY_TEST_VERIFY_CDNCONFIG_SIGNATURE()) {
            z = m53518a(byteArrayOutputStream, byteArrayOutputStream2);
        }
        if (z && (t1Var = (C12338t1) C12028l5.m52556a(new String(byteArrayOutputStream.toByteArray(), C6540C.UTF8_NAME), C12338t1.class)) != null) {
            C12408w4 c = C12385v4.m53562c();
            c.mo46726a((Set<String>) null);
            c.mo46729b((Set<String>) new HashSet(t1Var.f54757ct.cdn));
            c.mo46732c(t1Var.f54757ct.criteria);
            c.mo46733c((Set<String>) new HashSet(t1Var.ltr.cdn));
            c.mo46738d(t1Var.ltr.criteria);
        }
        return z;
        throw th;
        byteArrayOutputStream.close();
        throw th;
    }

    /* renamed from: a */
    private static boolean m53518a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        try {
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(C12385v4.m53564e());
            instance.update(byteArray2);
            return instance.verify(byteArray);
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return false;
        }
    }

    /* renamed from: a */
    private static String m53516a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
