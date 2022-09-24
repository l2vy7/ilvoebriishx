package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zb4 {
    /* renamed from: a */
    public static int m21282a(wb4 wb4, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int a = wb4.mo33308a(bArr, i + i3, i2 - i3);
            if (a == -1) {
                break;
            }
            i3 += a;
        }
        return i3;
    }

    @Pure
    /* renamed from: b */
    public static void m21283b(boolean z, String str) throws C7811iy {
        if (!z) {
            throw C7811iy.m33482a(str, (Throwable) null);
        }
    }

    /* renamed from: c */
    public static boolean m21284c(wb4 wb4, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return wb4.mo33311e(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: d */
    public static boolean m21285d(wb4 wb4, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((qb4) wb4).mo33310d(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m21286e(wb4 wb4, int i) throws IOException {
        try {
            ((qb4) wb4).mo34305k(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
