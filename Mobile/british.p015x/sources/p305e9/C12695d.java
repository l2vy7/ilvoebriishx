package p305e9;

import p308g8.C12716c;
import p308g8.C12727k;
import p308g8.C12730n;
import p308g8.C12736t;
import p308g8.C12741y;
import p336w8.C12945d;

/* renamed from: e9.d */
/* compiled from: StrictContentLengthStrategy */
public class C12695d implements C12945d {
    /* renamed from: a */
    public long mo47698a(C12730n nVar) throws C12727k {
        if (nVar != null) {
            C12716c I = nVar.mo47792I("Transfer-Encoding");
            C12716c I2 = nVar.mo47792I(RtspHeaders.CONTENT_LENGTH);
            if (I != null) {
                String value = I.getValue();
                if ("chunked".equalsIgnoreCase(value)) {
                    if (!nVar.mo43587a().mo47820i(C12736t.f55406f)) {
                        return -2;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Chunked transfer encoding not allowed for ");
                    stringBuffer.append(nVar.mo43587a());
                    throw new C12741y(stringBuffer.toString());
                } else if ("identity".equalsIgnoreCase(value)) {
                    return -1;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Unsupported transfer encoding: ");
                    stringBuffer2.append(value);
                    throw new C12741y(stringBuffer2.toString());
                }
            } else if (I2 == null) {
                return -1;
            } else {
                String value2 = I2.getValue();
                try {
                    return Long.parseLong(value2);
                } catch (NumberFormatException unused) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Invalid content length: ");
                    stringBuffer3.append(value2);
                    throw new C12741y(stringBuffer3.toString());
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
