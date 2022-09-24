package p335w8;

import com.google.android.exoplayer2.C6540C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: w8.f */
/* compiled from: StringEntity */
public class C12947f extends C12942a implements Cloneable {

    /* renamed from: e */
    protected final byte[] f55655e;

    public C12947f(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (str != null) {
            str2 = str2 == null ? "text/plain" : str2;
            str3 = str3 == null ? C6540C.ISO88591_NAME : str3;
            this.f55655e = str.getBytes(str3);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            stringBuffer.append("; charset=");
            stringBuffer.append(str3);
            mo48111h(stringBuffer.toString());
            return;
        }
        throw new IllegalArgumentException("Source string may not be null");
    }

    /* renamed from: a */
    public void mo43576a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.f55655e);
            outputStream.flush();
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }

    /* renamed from: b */
    public long mo47776b() {
        return (long) this.f55655e.length;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: i */
    public boolean mo47778i() {
        return true;
    }

    /* renamed from: k */
    public InputStream mo43577k() throws IOException {
        return new ByteArrayInputStream(this.f55655e);
    }

    /* renamed from: p */
    public boolean mo47781p() {
        return false;
    }

    public C12947f(String str, String str2) throws UnsupportedEncodingException {
        this(str, (String) null, str2);
    }
}
