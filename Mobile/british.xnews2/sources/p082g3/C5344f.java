package p082g3;

import java.io.File;

/* renamed from: g3.f */
/* compiled from: HashUtils */
final class C5344f {
    /* renamed from: a */
    public static final String m24056a(String str) throws Exception {
        return m24057b(new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m24057b(java.io.File r4) throws java.lang.Exception {
        /*
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            r4 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r4)
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ all -> 0x0035 }
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0035 }
        L_0x0014:
            int r2 = r0.read(r4)     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x001e
            r3 = 0
            r1.update(r4, r3, r2)     // Catch:{ all -> 0x0035 }
        L_0x001e:
            r3 = -1
            if (r2 != r3) goto L_0x0014
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch:{ all -> 0x0035 }
            r2 = 1
            byte[] r1 = r1.digest()     // Catch:{ all -> 0x0035 }
            r4.<init>(r2, r1)     // Catch:{ all -> 0x0035 }
            r1 = 16
            java.lang.String r4 = r4.toString(r1)     // Catch:{ all -> 0x0035 }
            r0.close()
            return r4
        L_0x0035:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r0 = move-exception
            r4.addSuppressed(r0)
        L_0x0040:
            goto L_0x0042
        L_0x0041:
            throw r1
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: p082g3.C5344f.m24057b(java.io.File):java.lang.String");
    }
}
