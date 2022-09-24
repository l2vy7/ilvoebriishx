package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aru */
/* compiled from: IMASDK */
public final class aru {
    /* renamed from: a */
    public static String m14635a(String str) {
        if (arr.m14620a(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m14636b(String str) {
        return arr.m14620a(str);
    }

    /* renamed from: c */
    public static String m14637c(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String str3;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb2);
                    if (valueOf.length() != 0) {
                        str3 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str3 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str3, e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb4.append(str, i3, str.length());
            } else {
                sb4.append(str, i3, indexOf);
                sb4.append(objArr[i]);
                int i4 = i + 1;
                i3 = indexOf + 2;
                i = i4;
            }
        }
        sb4.append(str, i3, str.length());
        if (i < length2) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i5 = i + 1; i5 < objArr.length; i5++) {
                sb4.append(", ");
                sb4.append(objArr[i5]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        throw new com.google.ads.interactivemedia.p038v3.internal.bff((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        throw new com.google.ads.interactivemedia.p038v3.internal.bez((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        throw new com.google.ads.interactivemedia.p038v3.internal.bff((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        return com.google.ads.interactivemedia.p038v3.internal.bfa.f16231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        throw new com.google.ads.interactivemedia.p038v3.internal.bff((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016 A[ExcHandler: IOException (r1v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[ExcHandler: biz (r1v4 'e' com.google.ads.interactivemedia.v3.internal.biz A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000f A[ExcHandler: NumberFormatException (r1v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p038v3.internal.bey m14638d(com.google.ads.interactivemedia.p038v3.internal.biw r1) throws com.google.ads.interactivemedia.p038v3.internal.bfc {
        /*
            r1.mo15101p()     // Catch:{ EOFException -> 0x0024, biz -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.ads.interactivemedia.v3.internal.bfi<com.google.ads.interactivemedia.v3.internal.bey> r0 = com.google.ads.interactivemedia.p038v3.internal.bip.f16397V     // Catch:{ EOFException -> 0x000c, biz -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r1 = r0.read(r1)     // Catch:{ EOFException -> 0x000c, biz -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.ads.interactivemedia.v3.internal.bey r1 = (com.google.ads.interactivemedia.p038v3.internal.bey) r1
            return r1
        L_0x000c:
            r1 = move-exception
            r0 = 0
            goto L_0x0026
        L_0x000f:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.bff r0 = new com.google.ads.interactivemedia.v3.internal.bff
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0016:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.bez r0 = new com.google.ads.interactivemedia.v3.internal.bez
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x001d:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.bff r0 = new com.google.ads.interactivemedia.v3.internal.bff
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0024:
            r1 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.ads.interactivemedia.v3.internal.bfa r1 = com.google.ads.interactivemedia.p038v3.internal.bfa.f16231a
            return r1
        L_0x002b:
            com.google.ads.interactivemedia.v3.internal.bff r0 = new com.google.ads.interactivemedia.v3.internal.bff
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.aru.m14638d(com.google.ads.interactivemedia.v3.internal.biw):com.google.ads.interactivemedia.v3.internal.bey");
    }

    /* renamed from: e */
    public static void m14639e(bey bey, biy biy) throws IOException {
        bip.f16397V.write(biy, bey);
    }

    /* renamed from: f */
    public static Writer m14640f(Appendable appendable) {
        return (Writer) appendable;
    }

    /* renamed from: g */
    public static DateFormat m14641g(int i, int i2) {
        StringBuilder sb = new StringBuilder(21);
        sb.append("MMM d, yyyy");
        sb.append(" ");
        sb.append("h:mm:ss a");
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
}
