package p340y8;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: y8.b */
/* compiled from: ByteArrayBody */
public class C12978b extends C12977a {

    /* renamed from: d */
    private final byte[] f55717d;

    /* renamed from: e */
    private final String f55718e;

    public C12978b(byte[] bArr, String str, String str2) {
        super(str);
        if (bArr != null) {
            this.f55717d = bArr;
            this.f55718e = str2;
            return;
        }
        throw new IllegalArgumentException("byte[] may not be null");
    }

    /* renamed from: a */
    public void mo48154a(OutputStream outputStream) throws IOException {
        outputStream.write(this.f55717d);
    }

    /* renamed from: b */
    public long mo48155b() {
        return (long) this.f55717d.length;
    }

    /* renamed from: c */
    public String mo48156c() {
        return "binary";
    }

    /* renamed from: d */
    public String mo48157d() {
        return null;
    }

    /* renamed from: f */
    public String mo48158f() {
        return this.f55718e;
    }

    public C12978b(byte[] bArr, String str) {
        this(bArr, "application/octet-stream", str);
    }
}
