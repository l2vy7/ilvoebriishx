package p274c9;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p307g8.C12716c;
import p307g8.C12727k;
import p307g8.C12728l;
import p307g8.C12731o;
import p307g8.C12733q;
import p307g8.C12734r;
import p308g9.C12745c;
import p308g9.C12748f;
import p308g9.C12749g;
import p310h9.C12781t;
import p312i9.C12790d;
import p312i9.C12791e;
import p314j9.C12811e;
import p321p8.C12863o;
import p341z8.C12999f;

/* renamed from: c9.e */
/* compiled from: DefaultClientConnection */
public class C11208e extends C12999f implements C12863o, C12811e {

    /* renamed from: l */
    private final Log f50316l = LogFactory.getLog(getClass());

    /* renamed from: m */
    private final Log f50317m = LogFactory.getLog("org.apache.http.headers");

    /* renamed from: n */
    private final Log f50318n = LogFactory.getLog("org.apache.http.wire");

    /* renamed from: o */
    private volatile Socket f50319o;

    /* renamed from: p */
    private C12728l f50320p;

    /* renamed from: q */
    private boolean f50321q;

    /* renamed from: r */
    private volatile boolean f50322r;

    /* renamed from: s */
    private final Map<String, Object> f50323s = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C12745c mo43640G(C12748f fVar, C12734r rVar, C12790d dVar) {
        return new C11211h(fVar, (C12781t) null, rVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C12748f mo43641M(Socket socket, int i, C12790d dVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        C12748f M = super.mo43641M(socket, i, dVar);
        return this.f50318n.isDebugEnabled() ? new C11212i(M, new C11219m(this.f50318n), C12791e.m54278a(dVar)) : M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public C12749g mo43642N(Socket socket, int i, C12790d dVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        C12749g N = super.mo43642N(socket, i, dVar);
        return this.f50318n.isDebugEnabled() ? new C11213j(N, new C11219m(this.f50318n), C12791e.m54278a(dVar)) : N;
    }

    /* renamed from: a */
    public final boolean mo43643a() {
        return this.f50321q;
    }

    /* renamed from: b */
    public Object mo43606b(String str) {
        return this.f50323s.get(str);
    }

    public void close() throws IOException {
        try {
            super.close();
            this.f50316l.debug("Connection closed");
        } catch (IOException e) {
            this.f50316l.debug("I/O error closing connection", e);
        }
    }

    /* renamed from: e */
    public void mo43607e(C12731o oVar) throws C12727k, IOException {
        if (this.f50316l.isDebugEnabled()) {
            this.f50316l.debug("Sending request: " + oVar.mo43589y());
        }
        super.mo43607e(oVar);
        if (this.f50317m.isDebugEnabled()) {
            this.f50317m.debug(">> " + oVar.mo43589y().toString());
            for (C12716c cVar : oVar.mo47793J()) {
                this.f50317m.debug(">> " + cVar.toString());
            }
        }
    }

    /* renamed from: f */
    public void mo43644f(Socket socket, C12728l lVar, boolean z, C12790d dVar) throws IOException {
        mo48175g();
        if (lVar == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (dVar != null) {
            if (socket != null) {
                this.f50319o = socket;
                mo48182L(socket, dVar);
            }
            this.f50320p = lVar;
            this.f50321q = z;
        } else {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
    }

    /* renamed from: l */
    public final Socket mo43645l() {
        return this.f50319o;
    }

    /* renamed from: p */
    public void mo43615p(String str, Object obj) {
        this.f50323s.put(str, obj);
    }

    /* renamed from: s */
    public void mo43646s(boolean z, C12790d dVar) throws IOException {
        mo48181K();
        if (dVar != null) {
            this.f50321q = z;
            mo48182L(this.f50319o, dVar);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public void shutdown() throws IOException {
        this.f50322r = true;
        try {
            super.shutdown();
            this.f50316l.debug("Connection shut down");
            Socket socket = this.f50319o;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            this.f50316l.debug("I/O error shutting down connection", e);
        }
    }

    /* renamed from: t */
    public C12733q mo43618t() throws C12727k, IOException {
        C12733q t = super.mo43618t();
        if (this.f50316l.isDebugEnabled()) {
            this.f50316l.debug("Receiving response: " + t.mo47806p());
        }
        if (this.f50317m.isDebugEnabled()) {
            this.f50317m.debug("<< " + t.mo47806p().toString());
            for (C12716c cVar : t.mo47793J()) {
                this.f50317m.debug("<< " + cVar.toString());
            }
        }
        return t;
    }

    /* renamed from: x */
    public void mo43647x(Socket socket, C12728l lVar) throws IOException {
        mo48181K();
        this.f50319o = socket;
        this.f50320p = lVar;
        if (this.f50322r) {
            socket.close();
            throw new IOException("Connection already shutdown");
        }
    }
}
