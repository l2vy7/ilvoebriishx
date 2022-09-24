package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.w5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9665w5 {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m44768a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C9513f3 {
        if (m44779l(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m44779l(b3) || m44779l(b4)) {
            throw C9513f3.m44260f();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m44769b(byte b, byte b2, byte b3, char[] cArr, int i) throws C9513f3 {
        if (m44779l(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m44779l(b3)))) {
            throw C9513f3.m44260f();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m44770c(byte b, byte b2, char[] cArr, int i) throws C9513f3 {
        if (b < -62 || m44779l(b2)) {
            throw C9513f3.m44260f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m44771d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m44776i(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m44777j(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static boolean m44778k(byte b) {
        return b < -16;
    }

    /* renamed from: l */
    private static boolean m44779l(byte b) {
        return b > -65;
    }
}
