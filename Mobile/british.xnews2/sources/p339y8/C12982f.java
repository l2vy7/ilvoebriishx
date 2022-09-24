package p339y8;

import com.google.android.exoplayer2.C6540C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: y8.f */
/* compiled from: StringBody */
public class C12982f extends C12977a {

    /* renamed from: d */
    private final byte[] f55722d;

    /* renamed from: e */
    private final Charset f55723e;

    public C12982f(String str, String str2, Charset charset) throws UnsupportedEncodingException {
        super(str2);
        if (str != null) {
            charset = charset == null ? Charset.forName(C6540C.ASCII_NAME) : charset;
            this.f55722d = str.getBytes(charset.name());
            this.f55723e = charset;
            return;
        }
        throw new IllegalArgumentException("Text may not be null");
    }

    /* renamed from: a */
    public void mo48154a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f55722d);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    /* renamed from: b */
    public long mo48155b() {
        return (long) this.f55722d.length;
    }

    /* renamed from: c */
    public String mo48156c() {
        return "8bit";
    }

    /* renamed from: d */
    public String mo48157d() {
        return this.f55723e.name();
    }

    /* renamed from: f */
    public String mo48158f() {
        return null;
    }

    public C12982f(String str) throws UnsupportedEncodingException {
        this(str, "text/plain", (Charset) null);
    }
}
