package p271a9;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.Oid;
import p306f8.C12696a;
import p308g8.C12716c;
import p308g8.C12731o;
import p310h8.C12755f;
import p310h8.C12757h;
import p310h8.C12759j;
import p315j9.C12811e;
import p317k9.C12821b;

/* renamed from: a9.k */
/* compiled from: NegotiateScheme */
public class C11174k extends C11157a {

    /* renamed from: b */
    private final Log f50219b = LogFactory.getLog(getClass());

    /* renamed from: c */
    private final C11178n f50220c;

    /* renamed from: d */
    private final boolean f50221d;

    /* renamed from: e */
    private GSSContext f50222e = null;

    /* renamed from: f */
    private C11175a f50223f = C11175a.UNINITIATED;

    /* renamed from: g */
    private byte[] f50224g;

    /* renamed from: h */
    private Oid f50225h = null;

    /* renamed from: a9.k$a */
    /* compiled from: NegotiateScheme */
    enum C11175a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    public C11174k(C11178n nVar, boolean z) {
        this.f50220c = nVar;
        this.f50221d = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0167, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0168, code lost:
        r5.f50223f = p271a9.C11174k.C11175a.f50229e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0175, code lost:
        throw new p310h8.C12755f(r6.getMessage());
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0167 A[ExcHandler: IOException (r6v6 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:4:0x000a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p308g8.C12716c mo43461a(p310h8.C12757h r6, p308g8.C12731o r7, p315j9.C12811e r8) throws p310h8.C12755f {
        /*
            r5 = this;
            java.lang.String r6 = "HTTP/"
            if (r7 == 0) goto L_0x01dc
            a9.k$a r7 = r5.f50223f
            a9.k$a r0 = p271a9.C11174k.C11175a.CHALLENGE_RECEIVED
            if (r7 != r0) goto L_0x01d4
            boolean r7 = r5.mo43462b()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r7 == 0) goto L_0x0013
            java.lang.String r7 = "http.proxy_host"
            goto L_0x0015
        L_0x0013:
            java.lang.String r7 = "http.target_host"
        L_0x0015:
            java.lang.Object r7 = r8.mo43606b(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            g8.l r7 = (p308g8.C12728l) r7     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r7 == 0) goto L_0x015f
            boolean r8 = r5.f50221d     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r8 != 0) goto L_0x002c
            int r8 = r7.mo47783b()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r8 <= 0) goto L_0x002c
            java.lang.String r7 = r7.mo47786d()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            goto L_0x0030
        L_0x002c:
            java.lang.String r7 = r7.mo47782a()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x0030:
            org.apache.commons.logging.Log r8 = r5.f50219b     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            boolean r8 = r8.isDebugEnabled()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r8 == 0) goto L_0x004e
            org.apache.commons.logging.Log r8 = r5.f50219b     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r0.<init>()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r1 = "init "
            r0.append(r1)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r0.append(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r0 = r0.toString()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r8.debug(r0)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x004e:
            org.ietf.jgss.Oid r8 = new org.ietf.jgss.Oid     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r0 = "1.3.6.1.5.5.2"
            r8.<init>(r0)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50225h = r8     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r8 = 0
            r0 = 1
            r1 = 0
            org.ietf.jgss.GSSManager r2 = r5.mo43498j()     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            r3.<init>()     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            r3.append(r6)     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            r3.append(r7)     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            java.lang.String r3 = r3.toString()     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            org.ietf.jgss.GSSName r3 = r2.createName(r3, r8)     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            org.ietf.jgss.Oid r4 = r5.f50225h     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            org.ietf.jgss.GSSName r3 = r3.canonicalize(r4)     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            org.ietf.jgss.Oid r4 = r5.f50225h     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            org.ietf.jgss.GSSContext r2 = r2.createContext(r3, r4, r8, r1)     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            r5.f50222e = r2     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            r2.requestMutualAuth(r0)     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            org.ietf.jgss.GSSContext r2 = r5.f50222e     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            r2.requestCredDeleg(r0)     // Catch:{ GSSException -> 0x0089, IOException -> 0x0167 }
            r2 = 0
            goto L_0x0099
        L_0x0089:
            r2 = move-exception
            int r3 = r2.getMajor()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r4 = 2
            if (r3 != r4) goto L_0x015e
            org.apache.commons.logging.Log r2 = r5.f50219b     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r3 = "GSSException BAD_MECH, retry with Kerberos MECH"
            r2.debug(r3)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r2 = 1
        L_0x0099:
            java.lang.String r3 = "1.2.840.113554.1.2.2"
            if (r2 == 0) goto L_0x00d8
            org.apache.commons.logging.Log r2 = r5.f50219b     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r4 = "Using Kerberos MECH 1.2.840.113554.1.2.2"
            r2.debug(r4)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.Oid r2 = new org.ietf.jgss.Oid     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r2.<init>(r3)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50225h = r2     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.GSSManager r2 = r5.mo43498j()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r4.<init>()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r4.append(r6)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r4.append(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r6 = r4.toString()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.GSSName r6 = r2.createName(r6, r8)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.Oid r7 = r5.f50225h     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.GSSName r6 = r6.canonicalize(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.Oid r7 = r5.f50225h     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.GSSContext r6 = r2.createContext(r6, r7, r8, r1)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50222e = r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r6.requestMutualAuth(r0)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.ietf.jgss.GSSContext r6 = r5.f50222e     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r6.requestCredDeleg(r0)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x00d8:
            byte[] r6 = r5.f50224g     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r6 != 0) goto L_0x00e0
            byte[] r6 = new byte[r1]     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50224g = r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x00e0:
            org.ietf.jgss.GSSContext r6 = r5.f50222e     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            byte[] r7 = r5.f50224g     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            int r8 = r7.length     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            byte[] r6 = r6.initSecContext(r7, r1, r8)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50224g = r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r6 == 0) goto L_0x0152
            a9.n r6 = r5.f50220c     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r6 == 0) goto L_0x0107
            org.ietf.jgss.Oid r6 = r5.f50225h     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r6 = r6.toString()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            boolean r6 = r6.equals(r3)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r6 == 0) goto L_0x0107
            a9.n r6 = r5.f50220c     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            byte[] r7 = r5.f50224g     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            byte[] r6 = r6.mo43501a(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50224g = r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x0107:
            a9.k$a r6 = p271a9.C11174k.C11175a.TOKEN_GENERATED     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50223f = r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r6 = new java.lang.String     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            byte[] r7 = r5.f50224g     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            byte[] r7 = p306f8.C12696a.m53998i(r7, r1)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r6.<init>(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            org.apache.commons.logging.Log r7 = r5.f50219b     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            boolean r7 = r7.isDebugEnabled()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            if (r7 == 0) goto L_0x0139
            org.apache.commons.logging.Log r7 = r5.f50219b     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r8.<init>()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r0 = "Sending response '"
            r8.append(r0)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r8.append(r6)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r0 = "' back to the auth server"
            r8.append(r0)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r8 = r8.toString()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r7.debug(r8)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x0139:
            h9.b r7 = new h9.b     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r8 = "Authorization"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r0.<init>()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r1 = "Negotiate "
            r0.append(r1)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r0.append(r6)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r6 = r0.toString()     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r7.<init>(r8, r6)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            return r7
        L_0x0152:
            a9.k$a r6 = p271a9.C11174k.C11175a.FAILED     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            r5.f50223f = r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            h8.f r6 = new h8.f     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r7 = "GSS security context initialization failed"
            r6.<init>(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            throw r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x015e:
            throw r2     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x015f:
            h8.f r6 = new h8.f     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            java.lang.String r7 = "Authentication host is not set in the execution context"
            r6.<init>(r7)     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
            throw r6     // Catch:{ GSSException -> 0x0176, IOException -> 0x0167 }
        L_0x0167:
            r6 = move-exception
            a9.k$a r7 = p271a9.C11174k.C11175a.FAILED
            r5.f50223f = r7
            h8.f r7 = new h8.f
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        L_0x0176:
            r6 = move-exception
            a9.k$a r7 = p271a9.C11174k.C11175a.FAILED
            r5.f50223f = r7
            int r7 = r6.getMajor()
            r8 = 9
            if (r7 == r8) goto L_0x01ca
            int r7 = r6.getMajor()
            r8 = 8
            if (r7 == r8) goto L_0x01ca
            int r7 = r6.getMajor()
            r8 = 13
            if (r7 == r8) goto L_0x01c0
            int r7 = r6.getMajor()
            r8 = 10
            if (r7 == r8) goto L_0x01b6
            int r7 = r6.getMajor()
            r8 = 19
            if (r7 == r8) goto L_0x01b6
            int r7 = r6.getMajor()
            r8 = 20
            if (r7 != r8) goto L_0x01ac
            goto L_0x01b6
        L_0x01ac:
            h8.f r7 = new h8.f
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        L_0x01b6:
            h8.f r7 = new h8.f
            java.lang.String r8 = r6.getMessage()
            r7.<init>(r8, r6)
            throw r7
        L_0x01c0:
            h8.i r7 = new h8.i
            java.lang.String r8 = r6.getMessage()
            r7.<init>(r8, r6)
            throw r7
        L_0x01ca:
            h8.i r7 = new h8.i
            java.lang.String r8 = r6.getMessage()
            r7.<init>(r8, r6)
            throw r7
        L_0x01d4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Negotiation authentication process has not been initiated"
            r6.<init>(r7)
            throw r6
        L_0x01dc:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "HTTP request may not be null"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p271a9.C11174k.mo43461a(h8.h, g8.o, j9.e):g8.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo43463c(C12821b bVar, int i, int i2) throws C12759j {
        String r = bVar.mo47980r(i, i2);
        if (this.f50219b.isDebugEnabled()) {
            Log log = this.f50219b;
            log.debug("Received challenge '" + r + "' from the auth server");
        }
        if (this.f50223f == C11175a.UNINITIATED) {
            this.f50224g = new C12696a().mo47701d(r.getBytes());
            this.f50223f = C11175a.CHALLENGE_RECEIVED;
            return;
        }
        this.f50219b.debug("Authentication already attempted");
        this.f50223f = C11175a.FAILED;
    }

    /* renamed from: d */
    public boolean mo43466d() {
        C11175a aVar = this.f50223f;
        return aVar == C11175a.TOKEN_GENERATED || aVar == C11175a.FAILED;
    }

    @Deprecated
    /* renamed from: e */
    public C12716c mo43467e(C12757h hVar, C12731o oVar) throws C12755f {
        return mo43461a(hVar, oVar, (C12811e) null);
    }

    /* renamed from: g */
    public String mo43497g() {
        return null;
    }

    /* renamed from: h */
    public boolean mo43468h() {
        return true;
    }

    /* renamed from: i */
    public String mo43469i() {
        return "Negotiate";
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public GSSManager mo43498j() {
        return GSSManager.getInstance();
    }
}
