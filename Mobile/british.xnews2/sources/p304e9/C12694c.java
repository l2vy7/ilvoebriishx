package p304e9;

import p307g8.C12716c;
import p307g8.C12718d;
import p307g8.C12727k;
import p307g8.C12730n;
import p307g8.C12740x;
import p307g8.C12741y;
import p335w8.C12945d;

/* renamed from: e9.c */
/* compiled from: LaxContentLengthStrategy */
public class C12694c implements C12945d {
    /* renamed from: a */
    public long mo47698a(C12730n nVar) throws C12727k {
        long j;
        if (nVar != null) {
            boolean k = nVar.mo47801s().mo47932k("http.protocol.strict-transfer-encoding");
            C12716c I = nVar.mo47792I("Transfer-Encoding");
            C12716c I2 = nVar.mo47792I(RtspHeaders.CONTENT_LENGTH);
            if (I != null) {
                try {
                    C12718d[] b = I.mo47760b();
                    if (k) {
                        int i = 0;
                        while (i < b.length) {
                            String name = b[i].getName();
                            if (name == null || name.length() <= 0 || name.equalsIgnoreCase("chunked") || name.equalsIgnoreCase("identity")) {
                                i++;
                            } else {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Unsupported transfer encoding: ");
                                stringBuffer.append(name);
                                throw new C12741y(stringBuffer.toString());
                            }
                        }
                    }
                    int length = b.length;
                    if ("identity".equalsIgnoreCase(I.getValue())) {
                        return -1;
                    }
                    if (length > 0 && "chunked".equalsIgnoreCase(b[length - 1].getName())) {
                        return -2;
                    }
                    if (!k) {
                        return -1;
                    }
                    throw new C12741y("Chunk-encoding must be the last one applied");
                } catch (C12740x e) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Invalid Transfer-Encoding header value: ");
                    stringBuffer2.append(I);
                    throw new C12741y(stringBuffer2.toString(), e);
                }
            } else {
                if (I2 != null) {
                    C12716c[] o = nVar.mo47800o(RtspHeaders.CONTENT_LENGTH);
                    if (!k || o.length <= 1) {
                        int length2 = o.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                j = -1;
                                break;
                            }
                            C12716c cVar = o[length2];
                            try {
                                j = Long.parseLong(cVar.getValue());
                                break;
                            } catch (NumberFormatException unused) {
                                if (!k) {
                                    length2--;
                                } else {
                                    StringBuffer stringBuffer3 = new StringBuffer();
                                    stringBuffer3.append("Invalid content length: ");
                                    stringBuffer3.append(cVar.getValue());
                                    throw new C12741y(stringBuffer3.toString());
                                }
                            }
                        }
                        if (j >= 0) {
                            return j;
                        }
                    } else {
                        throw new C12741y("Multiple content length headers");
                    }
                }
                return -1;
            }
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
