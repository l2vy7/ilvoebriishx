package p275c9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;

/* renamed from: c9.m */
/* compiled from: Wire */
public class C11219m {

    /* renamed from: a */
    private final Log f50352a;

    public C11219m(Log log) {
        this.f50352a = log;
    }

    /* renamed from: h */
    private void m50060h(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                this.f50352a.debug(sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            this.f50352a.debug(sb.toString());
        }
    }

    /* renamed from: a */
    public boolean mo43680a() {
        return this.f50352a.isDebugEnabled();
    }

    /* renamed from: b */
    public void mo43681b(int i) throws IOException {
        mo43682c(new byte[]{(byte) i});
    }

    /* renamed from: c */
    public void mo43682c(byte[] bArr) throws IOException {
        if (bArr != null) {
            m50060h("<< ", new ByteArrayInputStream(bArr));
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    /* renamed from: d */
    public void mo43683d(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            m50060h("<< ", new ByteArrayInputStream(bArr, i, i2));
            return;
        }
        throw new IllegalArgumentException("Input may not be null");
    }

    /* renamed from: e */
    public void mo43684e(int i) throws IOException {
        mo43685f(new byte[]{(byte) i});
    }

    /* renamed from: f */
    public void mo43685f(byte[] bArr) throws IOException {
        if (bArr != null) {
            m50060h(">> ", new ByteArrayInputStream(bArr));
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }

    /* renamed from: g */
    public void mo43686g(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            m50060h(">> ", new ByteArrayInputStream(bArr, i, i2));
            return;
        }
        throw new IllegalArgumentException("Output may not be null");
    }
}
