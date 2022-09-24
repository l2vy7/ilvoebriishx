package p316k9;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;

/* renamed from: k9.c */
/* compiled from: EncodingUtils */
public final class C12822c {
    /* renamed from: a */
    public static byte[] m54365a(String str) {
        if (str != null) {
            try {
                return str.getBytes(C6540C.ASCII_NAME);
            } catch (UnsupportedEncodingException unused) {
                throw new Error("HttpClient requires ASCII support");
            }
        } else {
            throw new IllegalArgumentException("Parameter may not be null");
        }
    }

    /* renamed from: b */
    public static String m54366b(byte[] bArr) {
        if (bArr != null) {
            return m54367c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }

    /* renamed from: c */
    public static String m54367c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                return new String(bArr, i, i2, C6540C.ASCII_NAME);
            } catch (UnsupportedEncodingException unused) {
                throw new Error("HttpClient requires ASCII support");
            }
        } else {
            throw new IllegalArgumentException("Parameter may not be null");
        }
    }

    /* renamed from: d */
    public static byte[] m54368d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("data may not be null");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("charset may not be null or empty");
        } else {
            try {
                return str.getBytes(str2);
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
    }
}
