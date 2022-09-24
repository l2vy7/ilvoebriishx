package p075f2;

import android.net.Uri;

/* renamed from: f2.b */
/* compiled from: MediaStoreUtil */
public final class C5255b {
    /* renamed from: a */
    public static boolean m23756a(Uri uri) {
        return m23757b(uri) && !m23760e(uri);
    }

    /* renamed from: b */
    public static boolean m23757b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m23758c(Uri uri) {
        return m23757b(uri) && m23760e(uri);
    }

    /* renamed from: d */
    public static boolean m23759d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m23760e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
