package p316k8;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.util.List;
import p308g8.C12738v;
import p321o8.C12846c;
import p336w8.C12947f;

/* renamed from: k8.a */
/* compiled from: UrlEncodedFormEntity */
public class C12819a extends C12947f {
    public C12819a(List<? extends C12738v> list, String str) throws UnsupportedEncodingException {
        super(C12846c.m54430b(list, str), str);
        StringBuilder sb = new StringBuilder();
        sb.append("application/x-www-form-urlencoded; charset=");
        sb.append(str == null ? C6540C.ISO88591_NAME : str);
        mo48111h(sb.toString());
    }

    public C12819a(List<? extends C12738v> list) throws UnsupportedEncodingException {
        this(list, C6540C.ISO88591_NAME);
    }
}
