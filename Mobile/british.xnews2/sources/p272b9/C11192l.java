package p272b9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import p274c9.C11207d;
import p307g8.C12712a;
import p307g8.C12716c;
import p307g8.C12726j;
import p307g8.C12727k;
import p307g8.C12728l;
import p307g8.C12731o;
import p307g8.C12733q;
import p307g8.C12741y;
import p309h8.C12750a;
import p309h8.C12753d;
import p309h8.C12754e;
import p309h8.C12755f;
import p309h8.C12757h;
import p309h8.C12759j;
import p310h9.C12768g;
import p312i9.C12789c;
import p312i9.C12790d;
import p312i9.C12791e;
import p313j8.C12794b;
import p313j8.C12798f;
import p313j8.C12800h;
import p313j8.C12801i;
import p313j8.C12802j;
import p313j8.C12803k;
import p313j8.C12804l;
import p313j8.C12805m;
import p313j8.C12806n;
import p314j9.C12811e;
import p314j9.C12812f;
import p314j9.C12813g;
import p316k9.C12823d;
import p317l8.C12827a;
import p317l8.C12833g;
import p318m8.C12834a;
import p320o8.C12845b;
import p321p8.C12849a;
import p321p8.C12850b;
import p321p8.C12853e;
import p321p8.C12855g;
import p321p8.C12862n;
import p325r8.C12870a;
import p325r8.C12871b;
import p325r8.C12873d;

/* renamed from: b9.l */
/* compiled from: DefaultRequestDirector */
public class C11192l implements C12805m {

    /* renamed from: a */
    private final Log f50264a;

    /* renamed from: b */
    protected final C12850b f50265b;

    /* renamed from: c */
    protected final C12873d f50266c;

    /* renamed from: d */
    protected final C12712a f50267d;

    /* renamed from: e */
    protected final C12855g f50268e;

    /* renamed from: f */
    protected final C12813g f50269f;

    /* renamed from: g */
    protected final C12812f f50270g;

    /* renamed from: h */
    protected final C12800h f50271h;
    @Deprecated

    /* renamed from: i */
    protected final C12803k f50272i = null;

    /* renamed from: j */
    protected final C12804l f50273j;

    /* renamed from: k */
    protected final C12794b f50274k;

    /* renamed from: l */
    protected final C12794b f50275l;

    /* renamed from: m */
    protected final C12806n f50276m;

    /* renamed from: n */
    protected final C12790d f50277n;

    /* renamed from: o */
    protected C12862n f50278o;

    /* renamed from: p */
    protected final C12754e f50279p;

    /* renamed from: q */
    protected final C12754e f50280q;

    /* renamed from: r */
    private int f50281r;

    /* renamed from: s */
    private int f50282s;

    /* renamed from: t */
    private int f50283t;

    /* renamed from: u */
    private C12728l f50284u;

    public C11192l(Log log, C12813g gVar, C12850b bVar, C12712a aVar, C12855g gVar2, C12873d dVar, C12812f fVar, C12800h hVar, C12804l lVar, C12794b bVar2, C12794b bVar3, C12806n nVar, C12790d dVar2) {
        if (log == null) {
            throw new IllegalArgumentException("Log may not be null.");
        } else if (gVar == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        } else if (bVar == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        } else if (aVar == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        } else if (gVar2 == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        } else if (hVar == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        } else if (lVar == null) {
            throw new IllegalArgumentException("Redirect strategy may not be null.");
        } else if (bVar2 == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        } else if (bVar3 == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        } else if (nVar == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        } else if (dVar2 != null) {
            this.f50264a = log;
            this.f50269f = gVar;
            this.f50265b = bVar;
            this.f50267d = aVar;
            this.f50268e = gVar2;
            this.f50266c = dVar;
            this.f50270g = fVar;
            this.f50271h = hVar;
            this.f50273j = lVar;
            this.f50274k = bVar2;
            this.f50275l = bVar3;
            this.f50276m = nVar;
            this.f50277n = dVar2;
            this.f50278o = null;
            this.f50281r = 0;
            this.f50282s = 0;
            this.f50283t = dVar2.mo47928b("http.protocol.max-redirects", 100);
            this.f50279p = new C12754e();
            this.f50280q = new C12754e();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* renamed from: b */
    private void m49937b() {
        C12862n nVar = this.f50278o;
        if (nVar != null) {
            this.f50278o = null;
            try {
                nVar.mo43613n();
            } catch (IOException e) {
                if (this.f50264a.isDebugEnabled()) {
                    this.f50264a.debug(e.getMessage(), e);
                }
            }
            try {
                nVar.mo43609g();
            } catch (IOException e2) {
                this.f50264a.debug("Error releasing connection", e2);
            }
        }
    }

    /* renamed from: i */
    private void m49938i(Map<String, C12716c> map, C12754e eVar, C12794b bVar, C12733q qVar, C12811e eVar2) throws C12759j, C12755f {
        C12750a a = eVar.mo47828a();
        if (a == null) {
            a = bVar.mo43502c(map, qVar, eVar2);
            eVar.mo47833f(a);
        }
        String i = a.mo43469i();
        C12716c cVar = map.get(i.toLowerCase(Locale.ENGLISH));
        if (cVar != null) {
            a.mo43464f(cVar);
            this.f50264a.debug("Authorization challenge processed");
            return;
        }
        throw new C12755f(i + " authorization challenge expected, but not found");
    }

    /* renamed from: l */
    private void m49939l(C11199r rVar, C12811e eVar) throws C12727k, IOException {
        C12871b b = rVar.mo43591b();
        int i = 0;
        while (true) {
            i++;
            try {
                if (!this.f50278o.mo43616q()) {
                    this.f50278o.mo43636d(b, eVar, this.f50277n);
                } else {
                    this.f50278o.mo43617r(C12789c.m54262d(this.f50277n));
                }
                mo43567g(b, eVar);
                return;
            } catch (IOException e) {
                try {
                    this.f50278o.close();
                } catch (IOException unused) {
                }
                if (this.f50271h.mo43555a(e, i, eVar)) {
                    if (this.f50264a.isInfoEnabled()) {
                        Log log = this.f50264a;
                        log.info("I/O exception (" + e.getClass().getName() + ") caught when connecting to the target host: " + e.getMessage());
                    }
                    if (this.f50264a.isDebugEnabled()) {
                        this.f50264a.debug(e.getMessage(), e);
                    }
                    this.f50264a.info("Retrying connect");
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: m */
    private C12733q m49940m(C11199r rVar, C12811e eVar) throws C12727k, IOException {
        C11198q a = rVar.mo43590a();
        C12871b b = rVar.mo43591b();
        IOException e = null;
        while (true) {
            this.f50281r++;
            a.mo43584N();
            if (!a.mo43573O()) {
                this.f50264a.debug("Cannot retry non-repeatable request");
                if (e != null) {
                    throw new C12801i("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", e);
                }
                throw new C12801i("Cannot retry request with a non-repeatable request entity.");
            }
            try {
                if (!this.f50278o.mo43616q()) {
                    if (!b.mo48019c()) {
                        this.f50264a.debug("Reopening the direct connection.");
                        this.f50278o.mo43636d(b, eVar, this.f50277n);
                    } else {
                        this.f50264a.debug("Proxied connection. Need to start over.");
                        return null;
                    }
                }
                if (this.f50264a.isDebugEnabled()) {
                    this.f50264a.debug("Attempt " + this.f50281r + " to execute request");
                }
                return this.f50269f.mo47948e(a, this.f50278o, eVar);
            } catch (IOException e2) {
                e = e2;
                this.f50264a.debug("Closing the connection.");
                try {
                    this.f50278o.close();
                } catch (IOException unused) {
                }
                if (this.f50271h.mo43555a(e, a.mo43582L(), eVar)) {
                    if (this.f50264a.isInfoEnabled()) {
                        this.f50264a.info("I/O exception (" + e.getClass().getName() + ") caught when processing request: " + e.getMessage());
                    }
                    if (this.f50264a.isDebugEnabled()) {
                        this.f50264a.debug(e.getMessage(), e);
                    }
                    this.f50264a.info("Retrying request");
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: n */
    private void m49941n(C12754e eVar, C12728l lVar, C12798f fVar) {
        if (eVar.mo47832e()) {
            String a = lVar.mo47782a();
            int b = lVar.mo47783b();
            if (b < 0) {
                b = this.f50265b.mo43667a().mo48056b(lVar).mo48047a();
            }
            C12750a a2 = eVar.mo47828a();
            C12753d dVar = new C12753d(a, b, a2.mo43497g(), a2.mo43469i());
            if (this.f50264a.isDebugEnabled()) {
                Log log = this.f50264a;
                log.debug("Authentication scope: " + dVar);
            }
            C12757h c = eVar.mo47830c();
            if (c == null) {
                c = fVar.mo43550a(dVar);
                if (this.f50264a.isDebugEnabled()) {
                    if (c != null) {
                        this.f50264a.debug("Found credentials");
                    } else {
                        this.f50264a.debug("Credentials not found");
                    }
                }
            } else if (a2.mo43466d()) {
                this.f50264a.debug("Authentication failed");
                c = null;
            }
            eVar.mo47834g(dVar);
            eVar.mo47835h(c);
        }
    }

    /* renamed from: o */
    private C11198q m49942o(C12731o oVar) throws C12741y {
        if (oVar instanceof C12726j) {
            return new C11195o((C12726j) oVar);
        }
        return new C11198q(oVar);
    }

    /* renamed from: a */
    public C12733q mo43562a(C12728l lVar, C12731o oVar, C12811e eVar) throws C12727k, IOException {
        String str;
        C12731o oVar2 = oVar;
        C12811e eVar2 = eVar;
        C11198q o = m49942o(oVar2);
        o.mo47797l(this.f50277n);
        C12871b f = mo43566f(lVar, o, eVar2);
        this.f50284u = (C12728l) oVar.mo47801s().mo43553i("http.virtual-host");
        C11199r rVar = new C11199r(o, f);
        long a = (long) C12789c.m54259a(this.f50277n);
        C12733q qVar = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                C11198q a2 = rVar.mo43590a();
                C12871b b = rVar.mo43591b();
                Object b2 = eVar2.mo43606b("http.user-token");
                if (this.f50278o == null) {
                    C12853e b3 = this.f50265b.mo43668b(b, b2);
                    if (oVar2 instanceof C12827a) {
                        ((C12827a) oVar2).mo47985k(b3);
                    }
                    this.f50278o = b3.mo43677a(a, TimeUnit.MILLISECONDS);
                    if (C12789c.m54265g(this.f50277n) && this.f50278o.mo43616q()) {
                        this.f50264a.debug("Stale connection check");
                        if (this.f50278o.mo43623z()) {
                            this.f50264a.debug("Stale connection detected");
                            this.f50278o.close();
                        }
                    }
                }
                if (oVar2 instanceof C12827a) {
                    ((C12827a) oVar2).mo47984g(this.f50278o);
                }
                try {
                    m49939l(rVar, eVar2);
                    a2.mo43585P();
                    mo43570k(a2, b);
                    C12728l lVar2 = this.f50284u;
                    if (lVar2 == null) {
                        lVar2 = b.mo48024h();
                    }
                    C12728l k = b.mo48027k();
                    eVar2.mo43615p("http.target_host", lVar2);
                    eVar2.mo43615p("http.proxy_host", k);
                    eVar2.mo43615p("http.connection", this.f50278o);
                    eVar2.mo43615p("http.auth.target-scope", this.f50279p);
                    eVar2.mo43615p("http.auth.proxy-scope", this.f50280q);
                    this.f50269f.mo47950g(a2, this.f50270g, eVar2);
                    qVar = m49940m(rVar, eVar2);
                    if (qVar != null) {
                        qVar.mo47797l(this.f50277n);
                        this.f50269f.mo47949f(qVar, this.f50270g, eVar2);
                        z2 = this.f50267d.mo47754a(qVar, eVar2);
                        if (z2) {
                            long a3 = this.f50268e.mo43554a(qVar, eVar2);
                            if (this.f50264a.isDebugEnabled()) {
                                if (a3 > 0) {
                                    str = "for " + a3 + " " + TimeUnit.MILLISECONDS;
                                } else {
                                    str = "indefinitely";
                                }
                                this.f50264a.debug("Connection can be kept alive " + str);
                            }
                            this.f50278o.mo43610h(a3, TimeUnit.MILLISECONDS);
                        }
                        C11199r h = mo43568h(rVar, qVar, eVar2);
                        if (h == null) {
                            z = true;
                        } else {
                            if (z2) {
                                C12823d.m54369a(qVar.mo47805b());
                                this.f50278o.mo43619u();
                            } else {
                                this.f50278o.close();
                            }
                            if (!h.mo43591b().equals(rVar.mo43591b())) {
                                mo43569j();
                            }
                            rVar = h;
                        }
                        if (this.f50278o != null && b2 == null) {
                            Object a4 = this.f50276m.mo43571a(eVar2);
                            eVar2.mo43615p("http.user-token", a4);
                            if (a4 != null) {
                                this.f50278o.mo43637j(a4);
                            }
                        }
                        oVar2 = oVar;
                    }
                } catch (C11200s e) {
                    C11200s sVar = e;
                    if (this.f50264a.isDebugEnabled()) {
                        this.f50264a.debug(sVar.getMessage());
                    }
                    qVar = sVar.mo43592a();
                }
            } catch (InterruptedException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e2);
                throw interruptedIOException;
            } catch (C11207d e3) {
                InterruptedIOException interruptedIOException2 = new InterruptedIOException("Connection has been shut down");
                interruptedIOException2.initCause(e3);
                throw interruptedIOException2;
            } catch (C12727k e4) {
                m49937b();
                throw e4;
            } catch (IOException e5) {
                m49937b();
                throw e5;
            } catch (RuntimeException e6) {
                m49937b();
                throw e6;
            }
        }
        if (!(qVar == null || qVar.mo47805b() == null)) {
            if (qVar.mo47805b().mo47781p()) {
                qVar.mo47804B(new C12849a(qVar.mo47805b(), this.f50278o, z2));
                return qVar;
            }
        }
        if (z2) {
            this.f50278o.mo43619u();
        }
        mo43569j();
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C12731o mo43563c(C12871b bVar, C12811e eVar) {
        C12728l h = bVar.mo48024h();
        String a = h.mo47782a();
        int b = h.mo47783b();
        if (b < 0) {
            b = this.f50265b.mo43667a().mo48057c(h.mo47784c()).mo48047a();
        }
        StringBuilder sb = new StringBuilder(a.length() + 6);
        sb.append(a);
        sb.append(':');
        sb.append(Integer.toString(b));
        return new C12768g("CONNECT", sb.toString(), C12791e.m54280c(this.f50277n));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo43564d(C12871b bVar, int i, C12811e eVar) throws C12727k, IOException {
        throw new C12727k("Proxy chains are not supported.");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43565e(p325r8.C12871b r17, p314j9.C12811e r18) throws p307g8.C12727k, java.io.IOException {
        /*
            r16 = this;
            r7 = r16
            r8 = r18
            g8.l r9 = r17.mo48027k()
            g8.l r10 = r17.mo48024h()
            r11 = 0
            r12 = 0
            r1 = r11
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x012a
            p8.n r0 = r7.f50278o
            boolean r0 = r0.mo43616q()
            if (r0 != 0) goto L_0x0024
            p8.n r0 = r7.f50278o
            i9.d r1 = r7.f50277n
            r14 = r17
            r0.mo43636d(r14, r8, r1)
            goto L_0x0026
        L_0x0024:
            r14 = r17
        L_0x0026:
            g8.o r0 = r16.mo43563c(r17, r18)
            i9.d r1 = r7.f50277n
            r0.mo47797l(r1)
            java.lang.String r1 = "http.target_host"
            r8.mo43615p(r1, r10)
            java.lang.String r1 = "http.proxy_host"
            r8.mo43615p(r1, r9)
            p8.n r1 = r7.f50278o
            java.lang.String r2 = "http.connection"
            r8.mo43615p(r2, r1)
            h8.e r1 = r7.f50279p
            java.lang.String r2 = "http.auth.target-scope"
            r8.mo43615p(r2, r1)
            h8.e r1 = r7.f50280q
            java.lang.String r2 = "http.auth.proxy-scope"
            r8.mo43615p(r2, r1)
            java.lang.String r1 = "http.request"
            r8.mo43615p(r1, r0)
            j9.g r1 = r7.f50269f
            j9.f r2 = r7.f50270g
            r1.mo47950g(r0, r2, r8)
            j9.g r1 = r7.f50269f
            p8.n r2 = r7.f50278o
            g8.q r15 = r1.mo47948e(r0, r2, r8)
            i9.d r0 = r7.f50277n
            r15.mo47797l(r0)
            j9.g r0 = r7.f50269f
            j9.f r1 = r7.f50270g
            r0.mo47949f(r15, r1, r8)
            g8.c0 r0 = r15.mo47806p()
            int r0 = r0.mo47764b()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x010f
            java.lang.String r0 = "http.auth.credentials-provider"
            java.lang.Object r0 = r8.mo43606b(r0)
            r6 = r0
            j8.f r6 = (p313j8.C12798f) r6
            if (r6 == 0) goto L_0x010b
            i9.d r0 = r7.f50277n
            boolean r0 = p318m8.C12834a.m54403b(r0)
            if (r0 == 0) goto L_0x010b
            j8.b r0 = r7.f50275l
            boolean r0 = r0.mo43557b(r15, r8)
            if (r0 == 0) goto L_0x0106
            org.apache.commons.logging.Log r0 = r7.f50264a
            java.lang.String r1 = "Proxy requested authentication"
            r0.debug(r1)
            j8.b r0 = r7.f50275l
            java.util.Map r2 = r0.mo43556a(r15, r8)
            h8.e r3 = r7.f50280q     // Catch:{ f -> 0x00b2 }
            j8.b r4 = r7.f50275l     // Catch:{ f -> 0x00b2 }
            r1 = r16
            r5 = r15
            r13 = r6
            r6 = r18
            r1.m49938i(r2, r3, r4, r5, r6)     // Catch:{ f -> 0x00b0 }
            goto L_0x00d8
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b2:
            r0 = move-exception
            r13 = r6
        L_0x00b4:
            org.apache.commons.logging.Log r1 = r7.f50264a
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L_0x00d8
            org.apache.commons.logging.Log r1 = r7.f50264a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Authentication error: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.warn(r0)
            r1 = r15
            goto L_0x012a
        L_0x00d8:
            h8.e r0 = r7.f50280q
            r7.m49941n(r0, r9, r13)
            h8.e r0 = r7.f50280q
            h8.h r0 = r0.mo47830c()
            if (r0 == 0) goto L_0x0103
            g8.a r0 = r7.f50267d
            boolean r0 = r0.mo47754a(r15, r8)
            if (r0 == 0) goto L_0x00fc
            org.apache.commons.logging.Log r0 = r7.f50264a
            java.lang.String r1 = "Connection kept alive"
            r0.debug(r1)
            g8.i r0 = r15.mo47805b()
            p316k9.C12823d.m54369a(r0)
            goto L_0x0101
        L_0x00fc:
            p8.n r0 = r7.f50278o
            r0.close()
        L_0x0101:
            r13 = 0
            goto L_0x0104
        L_0x0103:
            r13 = 1
        L_0x0104:
            r0 = r13
            goto L_0x010c
        L_0x0106:
            h8.e r0 = r7.f50280q
            r0.mo47834g(r11)
        L_0x010b:
            r0 = 1
        L_0x010c:
            r1 = r15
            goto L_0x0010
        L_0x010f:
            g8.k r0 = new g8.k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected response to CONNECT request: "
            r1.append(r2)
            g8.c0 r2 = r15.mo47806p()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x012a:
            g8.c0 r0 = r1.mo47806p()
            int r0 = r0.mo47764b()
            r2 = 299(0x12b, float:4.19E-43)
            if (r0 <= r2) goto L_0x0164
            g8.i r0 = r1.mo47805b()
            if (r0 == 0) goto L_0x0144
            w8.c r2 = new w8.c
            r2.<init>(r0)
            r1.mo47804B(r2)
        L_0x0144:
            p8.n r0 = r7.f50278o
            r0.close()
            b9.s r0 = new b9.s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CONNECT refused by proxy: "
            r2.append(r3)
            g8.c0 r3 = r1.mo47806p()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x0164:
            p8.n r0 = r7.f50278o
            r0.mo43619u()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p272b9.C11192l.mo43565e(r8.b, j9.e):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C12871b mo43566f(C12728l lVar, C12731o oVar, C12811e eVar) throws C12727k {
        if (lVar == null) {
            lVar = (C12728l) oVar.mo47801s().mo43553i("http.default-host");
        }
        if (lVar != null) {
            return this.f50266c.mo43653a(lVar, oVar, eVar);
        }
        throw new IllegalStateException("Target host must not be null, or set in parameters.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo43567g(C12871b bVar, C12811e eVar) throws C12727k, IOException {
        int a;
        C12870a aVar = new C12870a();
        do {
            C12871b c = this.f50278o.mo43634c();
            a = aVar.mo48013a(bVar, c);
            switch (a) {
                case -1:
                    throw new C12727k("Unable to establish route: planned = " + bVar + "; current = " + c);
                case 0:
                    break;
                case 1:
                case 2:
                    this.f50278o.mo43636d(bVar, eVar, this.f50277n);
                    continue;
                case 3:
                    boolean e = mo43565e(bVar, eVar);
                    this.f50264a.debug("Tunnel to target created.");
                    this.f50278o.mo43638m(e, this.f50277n);
                    continue;
                case 4:
                    int b = c.mo48018b() - 1;
                    boolean d = mo43564d(bVar, b, eVar);
                    this.f50264a.debug("Tunnel to proxy created.");
                    this.f50278o.mo43630B(bVar.mo48023g(b), d, this.f50277n);
                    continue;
                case 5:
                    this.f50278o.mo43631C(eVar, this.f50277n);
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + a + " from RouteDirector.");
            }
        } while (a > 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C11199r mo43568h(C11199r rVar, C12733q qVar, C12811e eVar) throws C12727k, IOException {
        C12871b b = rVar.mo43591b();
        C11198q a = rVar.mo43590a();
        C12790d s = a.mo47801s();
        if (!C12834a.m54404c(s) || !this.f50273j.mo43558a(a, qVar, eVar)) {
            C12798f fVar = (C12798f) eVar.mo43606b("http.auth.credentials-provider");
            if (fVar != null && C12834a.m54403b(s)) {
                if (this.f50274k.mo43557b(qVar, eVar)) {
                    C12728l lVar = (C12728l) eVar.mo43606b("http.target_host");
                    if (lVar == null) {
                        lVar = b.mo48024h();
                    }
                    this.f50264a.debug("Target requested authentication");
                    try {
                        m49938i(this.f50274k.mo43556a(qVar, eVar), this.f50279p, this.f50274k, qVar, eVar);
                    } catch (C12755f e) {
                        if (this.f50264a.isWarnEnabled()) {
                            Log log = this.f50264a;
                            log.warn("Authentication error: " + e.getMessage());
                            return null;
                        }
                    }
                    m49941n(this.f50279p, lVar, fVar);
                    if (this.f50279p.mo47830c() != null) {
                        return rVar;
                    }
                    return null;
                }
                this.f50279p.mo47834g((C12753d) null);
                if (this.f50275l.mo43557b(qVar, eVar)) {
                    C12728l k = b.mo48027k();
                    this.f50264a.debug("Proxy requested authentication");
                    try {
                        m49938i(this.f50275l.mo43556a(qVar, eVar), this.f50280q, this.f50275l, qVar, eVar);
                    } catch (C12755f e2) {
                        if (this.f50264a.isWarnEnabled()) {
                            Log log2 = this.f50264a;
                            log2.warn("Authentication error: " + e2.getMessage());
                            return null;
                        }
                    }
                    m49941n(this.f50280q, k, fVar);
                    if (this.f50280q.mo47830c() != null) {
                        return rVar;
                    }
                    return null;
                }
                this.f50280q.mo47834g((C12753d) null);
            }
            return null;
        }
        int i = this.f50282s;
        if (i < this.f50283t) {
            this.f50282s = i + 1;
            this.f50284u = null;
            C12833g b2 = this.f50273j.mo43559b(a, qVar, eVar);
            b2.mo47796i(a.mo43583M().mo47793J());
            URI C = b2.mo43581C();
            if (C.getHost() != null) {
                C12728l lVar2 = new C12728l(C.getHost(), C.getPort(), C.getScheme());
                this.f50279p.mo47834g((C12753d) null);
                this.f50280q.mo47834g((C12753d) null);
                if (!b.mo48024h().equals(lVar2)) {
                    this.f50279p.mo47831d();
                    C12750a a2 = this.f50280q.mo47828a();
                    if (a2 != null && a2.mo43468h()) {
                        this.f50280q.mo47831d();
                    }
                }
                C11198q o = m49942o(b2);
                o.mo47797l(s);
                C12871b f = mo43566f(lVar2, o, eVar);
                C11199r rVar2 = new C11199r(o, f);
                if (this.f50264a.isDebugEnabled()) {
                    Log log3 = this.f50264a;
                    log3.debug("Redirecting to '" + C + "' via " + f);
                }
                return rVar2;
            }
            throw new C12741y("Redirect URI does not specify a valid host name: " + C);
        }
        throw new C12802j("Maximum redirects (" + this.f50283t + ") exceeded");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo43569j() {
        try {
            this.f50278o.mo43609g();
        } catch (IOException e) {
            this.f50264a.debug("IOException releasing connection", e);
        }
        this.f50278o = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo43570k(C11198q qVar, C12871b bVar) throws C12741y {
        try {
            URI C = qVar.mo43581C();
            if (bVar.mo48027k() == null || bVar.mo48019c()) {
                if (C.isAbsolute()) {
                    qVar.mo43586Q(C12845b.m54427g(C, (C12728l) null));
                }
            } else if (!C.isAbsolute()) {
                qVar.mo43586Q(C12845b.m54427g(C, bVar.mo48024h()));
            }
        } catch (URISyntaxException e) {
            throw new C12741y("Invalid URI: " + qVar.mo43589y().getUri(), e);
        }
    }
}
