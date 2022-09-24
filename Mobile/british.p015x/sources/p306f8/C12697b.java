package p306f8;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;

/* renamed from: f8.b */
/* compiled from: StringUtils */
public class C12697b {
    /* renamed from: a */
    private static IllegalStateException m54013a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(": ");
        stringBuffer.append(unsupportedEncodingException);
        return new IllegalStateException(stringBuffer.toString());
    }

    /* renamed from: b */
    public static String m54014b(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw m54013a(str, e);
        }
    }

    /* renamed from: c */
    public static String m54015c(byte[] bArr) {
        return m54014b(bArr, C6540C.UTF8_NAME);
    }
}
