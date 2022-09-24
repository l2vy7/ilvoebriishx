package p006a5;

import android.util.Base64;

/* renamed from: a5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C6481c {
    /* renamed from: a */
    public static String m28246a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m28247b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: c */
    public static String m28248c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
