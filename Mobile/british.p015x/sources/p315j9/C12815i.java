package p315j9;

import java.io.IOException;
import p308g8.C12725i;
import p308g8.C12726j;
import p308g8.C12727k;
import p308g8.C12731o;
import p308g8.C12732p;
import p308g8.C12736t;
import p308g8.C12741y;
import p308g8.C12742z;

/* renamed from: j9.i */
/* compiled from: RequestContent */
public class C12815i implements C12732p {
    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!(oVar instanceof C12726j)) {
        } else {
            if (oVar.mo47791H("Transfer-Encoding")) {
                throw new C12741y("Transfer-encoding header already present");
            } else if (!oVar.mo47791H(RtspHeaders.CONTENT_LENGTH)) {
                C12742z a = oVar.mo43589y().mo47757a();
                C12725i b = ((C12726j) oVar).mo43574b();
                if (b == null) {
                    oVar.mo47802w(RtspHeaders.CONTENT_LENGTH, SessionDescription.SUPPORTED_SDP_VERSION);
                    return;
                }
                if (!b.mo47780o() && b.mo47776b() >= 0) {
                    oVar.mo47802w(RtspHeaders.CONTENT_LENGTH, Long.toString(b.mo47776b()));
                } else if (!a.mo47820i(C12736t.f55406f)) {
                    oVar.mo47802w("Transfer-Encoding", "chunked");
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Chunked transfer encoding not allowed for ");
                    stringBuffer.append(a);
                    throw new C12741y(stringBuffer.toString());
                }
                if (b.getContentType() != null && !oVar.mo47791H(RtspHeaders.CONTENT_TYPE)) {
                    oVar.mo47795d(b.getContentType());
                }
                if (b.mo47779l() != null && !oVar.mo47791H(RtspHeaders.CONTENT_ENCODING)) {
                    oVar.mo47795d(b.mo47779l());
                }
            } else {
                throw new C12741y("Content-Length header already present");
            }
        }
    }
}
