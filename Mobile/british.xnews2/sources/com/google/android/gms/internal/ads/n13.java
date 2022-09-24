package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n13 {
    /* renamed from: a */
    public static boolean m35017a(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0061=Splitter:B:17:0x0061, B:39:0x00a3=Splitter:B:39:0x00a3} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m35018b(android.content.Context r13, com.google.android.gms.internal.ads.k03 r14) {
        /*
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r13.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            r1.<init>(r2)
            java.lang.String r2 = "lib"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 5017(0x1399, float:7.03E-42)
            r3 = 7
            r4 = 6
            r5 = 1000(0x3e8, float:1.401E-42)
            r6 = 0
            r7 = 5
            r8 = 3
            r9 = 1
            if (r1 != 0) goto L_0x002b
            java.lang.String r0 = "No lib/"
            r14.mo33004b(r2, r0)
        L_0x0027:
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x00b5
        L_0x002b:
            com.google.android.gms.internal.ads.w83 r1 = new com.google.android.gms.internal.ads.w83
            java.lang.String r10 = ".*\\.so$"
            r11 = 2
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10, r11)
            r1.<init>(r10)
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto L_0x00ae
            int r1 = r0.length
            if (r1 != 0) goto L_0x0042
            goto L_0x00ae
        L_0x0042:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a4 }
            r2 = 0
            r0 = r0[r2]     // Catch:{ IOException -> 0x00a4 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a4 }
            r0 = 20
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x009f }
            int r12 = r1.read(r10)     // Catch:{ all -> 0x009f }
            if (r12 != r0) goto L_0x0061
            byte[] r0 = new byte[r11]     // Catch:{ all -> 0x009f }
            r0[r2] = r2     // Catch:{ all -> 0x009f }
            r0[r9] = r2     // Catch:{ all -> 0x009f }
            byte r12 = r10[r7]     // Catch:{ all -> 0x009f }
            if (r12 != r11) goto L_0x0065
            m35020d(r10, r6, r13, r14)     // Catch:{ all -> 0x009f }
        L_0x0061:
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x00ac
        L_0x0065:
            r11 = 19
            byte r11 = r10[r11]     // Catch:{ all -> 0x009f }
            r0[r2] = r11     // Catch:{ all -> 0x009f }
            r2 = 18
            byte r2 = r10[r2]     // Catch:{ all -> 0x009f }
            r0[r9] = r2     // Catch:{ all -> 0x009f }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x009f }
            short r0 = r0.getShort()     // Catch:{ all -> 0x009f }
            if (r0 == r8) goto L_0x009a
            r2 = 40
            if (r0 == r2) goto L_0x0095
            r2 = 62
            if (r0 == r2) goto L_0x0090
            r2 = 183(0xb7, float:2.56E-43)
            if (r0 == r2) goto L_0x008b
            m35020d(r10, r6, r13, r14)     // Catch:{ all -> 0x009f }
            goto L_0x0061
        L_0x008b:
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            r0 = 6
            goto L_0x00b5
        L_0x0090:
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            r0 = 7
            goto L_0x00b5
        L_0x0095:
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            r0 = 3
            goto L_0x00b5
        L_0x009a:
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            r0 = 5
            goto L_0x00b5
        L_0x009f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            throw r0     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            m35020d(r6, r0, r13, r14)
        L_0x00ac:
            r0 = 1
            goto L_0x00b5
        L_0x00ae:
            java.lang.String r0 = "No .so"
            r14.mo33004b(r2, r0)
            goto L_0x0027
        L_0x00b5:
            if (r0 != r5) goto L_0x0105
            java.lang.String r0 = m35019c(r13, r14)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = "Empty dev arch"
            m35020d(r6, r0, r13, r14)
        L_0x00c6:
            r0 = 1
            goto L_0x0105
        L_0x00c8:
            java.lang.String r1 = "i686"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0104
            java.lang.String r1 = "x86"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00d9
            goto L_0x0104
        L_0x00d9:
            java.lang.String r1 = "x86_64"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00e3
            r0 = 7
            goto L_0x0105
        L_0x00e3:
            java.lang.String r1 = "arm64-v8a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00ed
            r0 = 6
            goto L_0x0105
        L_0x00ed:
            java.lang.String r1 = "armeabi-v7a"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0102
            java.lang.String r1 = "armv71"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00fe
            goto L_0x0102
        L_0x00fe:
            m35020d(r6, r0, r13, r14)
            goto L_0x00c6
        L_0x0102:
            r0 = 3
            goto L_0x0105
        L_0x0104:
            r0 = 5
        L_0x0105:
            if (r0 == r9) goto L_0x011e
            if (r0 == r8) goto L_0x011b
            if (r0 == r7) goto L_0x0118
            if (r0 == r4) goto L_0x0115
            if (r0 == r3) goto L_0x0112
            java.lang.String r13 = "null"
            goto L_0x0120
        L_0x0112:
            java.lang.String r13 = "X86_64"
            goto L_0x0120
        L_0x0115:
            java.lang.String r13 = "ARM64"
            goto L_0x0120
        L_0x0118:
            java.lang.String r13 = "X86"
            goto L_0x0120
        L_0x011b:
            java.lang.String r13 = "ARM7"
            goto L_0x0120
        L_0x011e:
            java.lang.String r13 = "UNSUPPORTED"
        L_0x0120:
            r1 = 5018(0x139a, float:7.032E-42)
            r14.mo33004b(r1, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n13.m35018b(android.content.Context, com.google.android.gms.internal.ads.k03):int");
    }

    /* renamed from: c */
    private static final String m35019c(Context context, k03 k03) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        String d = l43.OS_ARCH.mo18502d();
        if (!TextUtils.isEmpty(d) && hashSet.contains(d)) {
            return d;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (NoSuchFieldException e) {
            k03.mo33005c(2024, 0, e);
        } catch (IllegalAccessException e2) {
            k03.mo33005c(2024, 0, e2);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    /* renamed from: d */
    private static final void m35020d(byte[] bArr, String str, Context context, k03 k03) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(l43.OS_ARCH.mo18502d());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        k03.mo33004b(4007, sb.toString());
    }
}
