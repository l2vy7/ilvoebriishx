package p320o8;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import p307g8.C12738v;

/* renamed from: o8.c */
/* compiled from: URLEncodedUtils */
public class C12846c {
    /* renamed from: a */
    private static String m54429a(String str, String str2) {
        if (str2 == null) {
            str2 = C6540C.ISO88591_NAME;
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static String m54430b(List<? extends C12738v> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (C12738v vVar : list) {
            String a = m54429a(vVar.getName(), str);
            String value = vVar.getValue();
            String a2 = value != null ? m54429a(value, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(a2);
        }
        return sb.toString();
    }
}
