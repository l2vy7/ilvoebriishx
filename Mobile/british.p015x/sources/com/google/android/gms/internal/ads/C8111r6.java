package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.r6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8111r6 implements C7634e5 {

    /* renamed from: a */
    private final Map<String, C8004o6> f38554a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f38555b = 0;

    /* renamed from: c */
    private final C8075q6 f38556c;

    /* renamed from: d */
    private final int f38557d;

    public C8111r6(C8075q6 q6Var, int i) {
        this.f38556c = q6Var;
        this.f38557d = 5242880;
    }

    /* renamed from: c */
    static int m36943c(InputStream inputStream) throws IOException {
        return (m36950l(inputStream) << 24) | m36950l(inputStream) | (m36950l(inputStream) << 8) | (m36950l(inputStream) << 16);
    }

    /* renamed from: d */
    static long m36944d(InputStream inputStream) throws IOException {
        return (((long) m36950l(inputStream)) & 255) | ((((long) m36950l(inputStream)) & 255) << 8) | ((((long) m36950l(inputStream)) & 255) << 16) | ((((long) m36950l(inputStream)) & 255) << 24) | ((((long) m36950l(inputStream)) & 255) << 32) | ((((long) m36950l(inputStream)) & 255) << 40) | ((((long) m36950l(inputStream)) & 255) << 48) | ((255 & ((long) m36950l(inputStream))) << 56);
    }

    /* renamed from: f */
    static String m36945f(C8039p6 p6Var) throws IOException {
        return new String(m36949k(p6Var, m36944d(p6Var)), C6540C.UTF8_NAME);
    }

    /* renamed from: h */
    static void m36946h(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: i */
    static void m36947i(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: j */
    static void m36948j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(C6540C.UTF8_NAME);
        int length = bytes.length;
        m36947i(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: k */
    static byte[] m36949k(C8039p6 p6Var, long j) throws IOException {
        long c = p6Var.mo34059c();
        if (j >= 0 && j <= c) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(p6Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(c);
        throw new IOException(sb.toString());
    }

    /* renamed from: l */
    private static int m36950l(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: m */
    private final void m36951m(String str, C8004o6 o6Var) {
        if (!this.f38554a.containsKey(str)) {
            this.f38555b += o6Var.f36284a;
        } else {
            this.f38555b += o6Var.f36284a - this.f38554a.get(str).f36284a;
        }
        this.f38554a.put(str, o6Var);
    }

    /* renamed from: n */
    private final void m36952n(String str) {
        C8004o6 remove = this.f38554a.remove(str);
        if (remove != null) {
            this.f38555b -= remove.f36284a;
        }
    }

    /* renamed from: o */
    private static final String m36953o(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x016e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31473a(java.lang.String r16, com.google.android.gms.internal.ads.C7597d5 r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f38555b     // Catch:{ all -> 0x01a4 }
            byte[] r5 = r2.f30636a     // Catch:{ all -> 0x01a4 }
            int r5 = r5.length     // Catch:{ all -> 0x01a4 }
            int r6 = r1.f38557d     // Catch:{ all -> 0x01a4 }
            long r7 = (long) r5
            long r3 = r3 + r7
            long r7 = (long) r6
            r9 = 1063675494(0x3f666666, float:0.9)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0022
            float r3 = (float) r5
            float r4 = (float) r6
            float r4 = r4 * r9
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            monitor-exit(r15)
            return
        L_0x0022:
            java.io.File r3 = r15.mo34507e(r16)     // Catch:{ all -> 0x01a4 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x016e }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x016e }
            r7.<init>(r3)     // Catch:{ IOException -> 0x016e }
            r6.<init>(r7)     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.o6 r7 = new com.google.android.gms.internal.ads.o6     // Catch:{ IOException -> 0x016e }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x016e }
            r8 = 538247942(0x20150306, float:1.2621791E-19)
            m36946h(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f36285b     // Catch:{ IOException -> 0x014a }
            m36948j(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f36286c     // Catch:{ IOException -> 0x014a }
            if (r8 != 0) goto L_0x0048
            java.lang.String r8 = ""
        L_0x0048:
            m36948j(r6, r8)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f36287d     // Catch:{ IOException -> 0x014a }
            m36947i(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f36288e     // Catch:{ IOException -> 0x014a }
            m36947i(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f36289f     // Catch:{ IOException -> 0x014a }
            m36947i(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f36290g     // Catch:{ IOException -> 0x014a }
            m36947i(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.List<com.google.android.gms.internal.ads.m5> r8 = r7.f36291h     // Catch:{ IOException -> 0x014a }
            if (r8 == 0) goto L_0x0089
            int r10 = r8.size()     // Catch:{ IOException -> 0x014a }
            m36946h(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x014a }
        L_0x006e:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x014a }
            if (r10 == 0) goto L_0x008c
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x014a }
            com.google.android.gms.internal.ads.m5 r10 = (com.google.android.gms.internal.ads.C7929m5) r10     // Catch:{ IOException -> 0x014a }
            java.lang.String r11 = r10.mo33476a()     // Catch:{ IOException -> 0x014a }
            m36948j(r6, r11)     // Catch:{ IOException -> 0x014a }
            java.lang.String r10 = r10.mo33477b()     // Catch:{ IOException -> 0x014a }
            m36948j(r6, r10)     // Catch:{ IOException -> 0x014a }
            goto L_0x006e
        L_0x0089:
            m36946h(r6, r5)     // Catch:{ IOException -> 0x014a }
        L_0x008c:
            r6.flush()     // Catch:{ IOException -> 0x014a }
            byte[] r2 = r2.f30636a     // Catch:{ IOException -> 0x016e }
            r6.write(r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            long r10 = r3.length()     // Catch:{ IOException -> 0x016e }
            r7.f36284a = r10     // Catch:{ IOException -> 0x016e }
            r15.m36951m(r0, r7)     // Catch:{ IOException -> 0x016e }
            long r6 = r1.f38555b     // Catch:{ IOException -> 0x016e }
            int r0 = r1.f38557d     // Catch:{ IOException -> 0x016e }
            long r10 = (long) r0     // Catch:{ IOException -> 0x016e }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            goto L_0x01a2
        L_0x00ab:
            boolean r0 = com.google.android.gms.internal.ads.C7745h6.f32629b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C7745h6.m32821d(r0, r2)     // Catch:{ IOException -> 0x016e }
        L_0x00b6:
            long r6 = r1.f38555b     // Catch:{ IOException -> 0x016e }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.o6> r0 = r1.f38554a     // Catch:{ IOException -> 0x016e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x016e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x016e }
            r2 = 0
        L_0x00c7:
            boolean r8 = r0.hasNext()     // Catch:{ IOException -> 0x016e }
            r12 = 2
            if (r8 == 0) goto L_0x011e
            java.lang.Object r8 = r0.next()     // Catch:{ IOException -> 0x016e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x016e }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.o6 r8 = (com.google.android.gms.internal.ads.C8004o6) r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r13 = r8.f36285b     // Catch:{ IOException -> 0x016e }
            java.io.File r13 = r15.mo34507e(r13)     // Catch:{ IOException -> 0x016e }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x016e }
            if (r13 == 0) goto L_0x00f0
            long r13 = r1.f38555b     // Catch:{ IOException -> 0x016e }
            r16 = r10
            long r9 = r8.f36284a     // Catch:{ IOException -> 0x016e }
            long r13 = r13 - r9
            r1.f38555b = r13     // Catch:{ IOException -> 0x016e }
            goto L_0x0103
        L_0x00f0:
            r16 = r10
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = r8.f36285b     // Catch:{ IOException -> 0x016e }
            r10[r5] = r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = m36953o(r8)     // Catch:{ IOException -> 0x016e }
            r10[r4] = r8     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C7745h6.m32818a(r9, r10)     // Catch:{ IOException -> 0x016e }
        L_0x0103:
            r0.remove()     // Catch:{ IOException -> 0x016e }
            int r2 = r2 + 1
            long r8 = r1.f38555b     // Catch:{ IOException -> 0x016e }
            float r8 = (float) r8     // Catch:{ IOException -> 0x016e }
            int r9 = r1.f38557d     // Catch:{ IOException -> 0x016e }
            float r9 = (float) r9     // Catch:{ IOException -> 0x016e }
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            r10 = r16
            r9 = 1063675494(0x3f666666, float:0.9)
            goto L_0x00c7
        L_0x011e:
            r16 = r10
        L_0x0120:
            boolean r0 = com.google.android.gms.internal.ads.C7745h6.f32629b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x01a2
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x016e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x016e }
            r0[r5] = r2     // Catch:{ IOException -> 0x016e }
            long r8 = r1.f38555b     // Catch:{ IOException -> 0x016e }
            long r8 = r8 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x016e }
            r0[r4] = r2     // Catch:{ IOException -> 0x016e }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            r8 = r16
            long r6 = r6 - r8
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x016e }
            r0[r12] = r2     // Catch:{ IOException -> 0x016e }
            java.lang.String r2 = "pruned %d files, %d bytes, %d ms"
            com.google.android.gms.internal.ads.C7745h6.m32821d(r2, r0)     // Catch:{ IOException -> 0x016e }
            monitor-exit(r15)
            return
        L_0x014a:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r0     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "%s"
            com.google.android.gms.internal.ads.C7745h6.m32818a(r0, r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r6     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C7745h6.m32818a(r0, r2)     // Catch:{ IOException -> 0x016e }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x016e }
            r0.<init>()     // Catch:{ IOException -> 0x016e }
            throw r0     // Catch:{ IOException -> 0x016e }
        L_0x016e:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0181
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x01a4 }
            r0[r5] = r2     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.C7745h6.m32818a(r2, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0181:
            com.google.android.gms.internal.ads.q6 r0 = r1.f38556c     // Catch:{ all -> 0x01a4 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x01a4 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a4 }
            com.google.android.gms.internal.ads.C7745h6.m32818a(r0, r2)     // Catch:{ all -> 0x01a4 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.o6> r0 = r1.f38554a     // Catch:{ all -> 0x01a4 }
            r0.clear()     // Catch:{ all -> 0x01a4 }
            r2 = 0
            r1.f38555b = r2     // Catch:{ all -> 0x01a4 }
            r15.zzb()     // Catch:{ all -> 0x01a4 }
            monitor-exit(r15)
            return
        L_0x01a2:
            monitor-exit(r15)
            return
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x01a8
        L_0x01a7:
            throw r0
        L_0x01a8:
            goto L_0x01a7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8111r6.mo31473a(java.lang.String, com.google.android.gms.internal.ads.d5):void");
    }

    /* renamed from: b */
    public final synchronized void mo31474b(String str, boolean z) {
        C7597d5 zza = zza(str);
        if (zza != null) {
            zza.f30641f = 0;
            zza.f30640e = 0;
            mo31473a(str, zza);
        }
    }

    /* renamed from: e */
    public final File mo34507e(String str) {
        return new File(this.f38556c.zza(), m36953o(str));
    }

    /* renamed from: g */
    public final synchronized void mo34508g(String str) {
        boolean delete = mo34507e(str).delete();
        m36952n(str);
        if (!delete) {
            C7745h6.m32818a("Could not delete cache entry for key=%s, filename=%s", str, m36953o(str));
        }
    }

    public final synchronized C7597d5 zza(String str) {
        C8039p6 p6Var;
        C8004o6 o6Var = this.f38554a.get(str);
        if (o6Var == null) {
            return null;
        }
        File e = mo34507e(str);
        try {
            p6Var = new C8039p6(new BufferedInputStream(new FileInputStream(e)), e.length());
            C8004o6 a = C8004o6.m35570a(p6Var);
            if (!TextUtils.equals(str, a.f36285b)) {
                C7745h6.m32818a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a.f36285b);
                m36952n(str);
                p6Var.close();
                return null;
            }
            byte[] k = m36949k(p6Var, p6Var.mo34059c());
            C7597d5 d5Var = new C7597d5();
            d5Var.f30636a = k;
            d5Var.f30637b = o6Var.f36286c;
            d5Var.f30638c = o6Var.f36287d;
            d5Var.f30639d = o6Var.f36288e;
            d5Var.f30640e = o6Var.f36289f;
            d5Var.f30641f = o6Var.f36290g;
            List<C7929m5> list = o6Var.f36291h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C7929m5 next : list) {
                treeMap.put(next.mo33476a(), next.mo33477b());
            }
            d5Var.f30642g = treeMap;
            d5Var.f30643h = Collections.unmodifiableList(o6Var.f36291h);
            p6Var.close();
            return d5Var;
        } catch (IOException e2) {
            C7745h6.m32818a("%s: %s", e.getAbsolutePath(), e2.toString());
            mo34508g(str);
            return null;
        } catch (Throwable th) {
            p6Var.close();
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.q6 r0 = r9.f38556c     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0024
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1[r2] = r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.C7745h6.m32819b(r0, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r9)
            return
        L_0x0024:
            monitor-exit(r9)
            return
        L_0x0026:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r1 = r0.length     // Catch:{ all -> 0x0062 }
        L_0x002f:
            if (r2 >= r1) goto L_0x0060
            r3 = r0[r2]     // Catch:{ all -> 0x0062 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.p6 r6 = new com.google.android.gms.internal.ads.p6     // Catch:{ IOException -> 0x005a }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005a }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r8.<init>(r3)     // Catch:{ IOException -> 0x005a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x005a }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.o6 r7 = com.google.android.gms.internal.ads.C8004o6.m35570a(r6)     // Catch:{ all -> 0x0055 }
            r7.f36284a = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r7.f36285b     // Catch:{ all -> 0x0055 }
            r9.m36951m(r4, r7)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x005a }
            throw r4     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r3.delete()     // Catch:{ all -> 0x0062 }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0066
        L_0x0065:
            throw r0
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8111r6.zzb():void");
    }

    public C8111r6(File file, int i) {
        this.f38556c = new C7968n6(this, file);
        this.f38557d = 20971520;
    }
}
