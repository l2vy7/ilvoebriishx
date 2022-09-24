package p314j9;

import java.io.IOException;
import p307g8.C12727k;
import p307g8.C12731o;
import p307g8.C12732p;
import p312i9.C12791e;

/* renamed from: j9.l */
/* compiled from: RequestUserAgent */
public class C12818l implements C12732p {
    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        String b;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!oVar.mo47791H(RtspHeaders.USER_AGENT) && (b = C12791e.m54279b(oVar.mo47801s())) != null) {
            oVar.mo47802w(RtspHeaders.USER_AGENT, b);
        }
    }
}
