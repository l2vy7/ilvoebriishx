package p087h3;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import java.nio.charset.Charset;

/* renamed from: h3.d */
/* compiled from: Utils */
public class C5417d {
    /* renamed from: a */
    static String m24365a(String str) {
        return TextUtils.join(" ", str.trim().split("\\s+"));
    }

    /* renamed from: b */
    static int[] m24366b(String str, int i) {
        int[] iArr = new int[i];
        byte[] bytes = m24365a(str).getBytes(Charset.forName(C6540C.UTF8_NAME));
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < bytes.length) {
                iArr[i2] = bytes[i2] & 255;
            } else {
                iArr[i2] = 0;
            }
        }
        return iArr;
    }
}
