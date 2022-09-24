package p271a9;

import p308g8.C12716c;
import p308g8.C12731o;
import p310h8.C12755f;
import p310h8.C12757h;
import p310h8.C12758i;
import p310h8.C12759j;
import p310h8.C12760k;
import p311h9.C12777p;
import p317k9.C12821b;

/* renamed from: a9.i */
/* compiled from: NTLMScheme */
public class C11171i extends C11157a {

    /* renamed from: b */
    private final C11162f f50209b;

    /* renamed from: c */
    private C11172a f50210c;

    /* renamed from: d */
    private String f50211d;

    /* renamed from: a9.i$a */
    /* compiled from: NTLMScheme */
    enum C11172a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public C11171i(C11162f fVar) {
        if (fVar != null) {
            this.f50209b = fVar;
            this.f50210c = C11172a.UNINITIATED;
            this.f50211d = null;
            return;
        }
        throw new IllegalArgumentException("NTLM engine may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo43463c(C12821b bVar, int i, int i2) throws C12759j {
        String r = bVar.mo47980r(i, i2);
        if (r.length() == 0) {
            if (this.f50210c == C11172a.UNINITIATED) {
                this.f50210c = C11172a.CHALLENGE_RECEIVED;
            } else {
                this.f50210c = C11172a.FAILED;
            }
            this.f50211d = null;
            return;
        }
        this.f50210c = C11172a.MSG_TYPE2_RECEVIED;
        this.f50211d = r;
    }

    /* renamed from: d */
    public boolean mo43466d() {
        C11172a aVar = this.f50210c;
        return aVar == C11172a.MSG_TYPE3_GENERATED || aVar == C11172a.FAILED;
    }

    /* renamed from: e */
    public C12716c mo43467e(C12757h hVar, C12731o oVar) throws C12755f {
        String str;
        try {
            C12760k kVar = (C12760k) hVar;
            C11172a aVar = this.f50210c;
            if (aVar == C11172a.CHALLENGE_RECEIVED || aVar == C11172a.FAILED) {
                str = this.f50209b.mo43472b(kVar.mo47839c(), kVar.mo47841e());
                this.f50210c = C11172a.MSG_TYPE1_GENERATED;
            } else if (aVar == C11172a.MSG_TYPE2_RECEVIED) {
                str = this.f50209b.mo43471a(kVar.mo47840d(), kVar.mo47838b(), kVar.mo47839c(), kVar.mo47841e(), this.f50211d);
                this.f50210c = C11172a.MSG_TYPE3_GENERATED;
            } else {
                throw new C12755f("Unexpected state: " + this.f50210c);
            }
            C12821b bVar = new C12821b(32);
            if (mo43462b()) {
                bVar.mo47966c("Proxy-Authorization");
            } else {
                bVar.mo47966c(RtspHeaders.AUTHORIZATION);
            }
            bVar.mo47966c(": NTLM ");
            bVar.mo47966c(str);
            return new C12777p(bVar);
        } catch (ClassCastException unused) {
            throw new C12758i("Credentials cannot be used for NTLM authentication: " + hVar.getClass().getName());
        }
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
        return "ntlm";
    }
}
