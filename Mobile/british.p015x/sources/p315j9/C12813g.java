package p315j9;

import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.IOException;
import java.net.ProtocolException;
import p308g8.C12723g;
import p308g8.C12726j;
import p308g8.C12727k;
import p308g8.C12731o;
import p308g8.C12733q;
import p308g8.C12736t;
import p308g8.C12742z;

/* renamed from: j9.g */
/* compiled from: HttpRequestExecutor */
public class C12813g {
    /* renamed from: b */
    private static final void m54320b(C12723g gVar) {
        try {
            gVar.close();
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47945a(C12731o oVar, C12733q qVar) {
        int b;
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(oVar.mo43589y().mo47758c()) || (b = qVar.mo47806p().mo47764b()) < 200 || b == 204 || b == 304 || b == 205) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C12733q mo47946c(C12731o oVar, C12723g gVar, C12811e eVar) throws C12727k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (eVar != null) {
            C12733q qVar = null;
            int i = 0;
            while (true) {
                if (qVar != null && i >= 200) {
                    return qVar;
                }
                qVar = gVar.mo43618t();
                if (mo47945a(oVar, qVar)) {
                    gVar.mo43620v(qVar);
                }
                i = qVar.mo47806p().mo47764b();
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C12733q mo47947d(C12731o oVar, C12723g gVar, C12811e eVar) throws IOException, C12727k {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (eVar != null) {
            eVar.mo43615p("http.connection", gVar);
            eVar.mo43615p("http.request_sent", Boolean.FALSE);
            gVar.mo43607e(oVar);
            C12733q qVar = null;
            if (oVar instanceof C12726j) {
                boolean z = true;
                C12742z a = oVar.mo43589y().mo47757a();
                C12726j jVar = (C12726j) oVar;
                if (jVar.mo43575h() && !a.mo47820i(C12736t.f55406f)) {
                    gVar.flush();
                    if (gVar.mo43612k(oVar.mo47801s().mo47928b("http.protocol.wait-for-continue", 2000))) {
                        C12733q t = gVar.mo43618t();
                        if (mo47945a(oVar, t)) {
                            gVar.mo43620v(t);
                        }
                        int b = t.mo47806p().mo47764b();
                        if (b >= 200) {
                            z = false;
                            qVar = t;
                        } else if (b != 100) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Unexpected response: ");
                            stringBuffer.append(t.mo47806p());
                            throw new ProtocolException(stringBuffer.toString());
                        }
                    }
                }
                if (z) {
                    gVar.mo43611i(jVar);
                }
            }
            gVar.flush();
            eVar.mo43615p("http.request_sent", Boolean.TRUE);
            return qVar;
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* renamed from: e */
    public C12733q mo47948e(C12731o oVar, C12723g gVar, C12811e eVar) throws IOException, C12727k {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        } else if (eVar != null) {
            try {
                C12733q d = mo47947d(oVar, gVar, eVar);
                return d == null ? mo47946c(oVar, gVar, eVar) : d;
            } catch (IOException e) {
                m54320b(gVar);
                throw e;
            } catch (C12727k e2) {
                m54320b(gVar);
                throw e2;
            } catch (RuntimeException e3) {
                m54320b(gVar);
                throw e3;
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* renamed from: f */
    public void mo47949f(C12733q qVar, C12812f fVar, C12811e eVar) throws C12727k, IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (eVar != null) {
            eVar.mo43615p("http.response", qVar);
            fVar.mo47808b(qVar, eVar);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* renamed from: g */
    public void mo47950g(C12731o oVar, C12812f fVar, C12811e eVar) throws C12727k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (eVar != null) {
            eVar.mo43615p("http.request", oVar);
            fVar.mo47803a(oVar, eVar);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
