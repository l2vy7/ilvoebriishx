package p271a9;

import p308g8.C12714b;
import p308g8.C12716c;
import p308g8.C12731o;
import p310h8.C12755f;
import p310h8.C12756g;
import p310h8.C12757h;
import p310h8.C12759j;
import p315j9.C12810d;
import p315j9.C12811e;
import p317k9.C12821b;

/* renamed from: a9.a */
/* compiled from: AuthSchemeBase */
public abstract class C11157a implements C12756g {

    /* renamed from: a */
    private boolean f50174a;

    /* renamed from: a */
    public C12716c mo43461a(C12757h hVar, C12731o oVar, C12811e eVar) throws C12755f {
        return mo43467e(hVar, oVar);
    }

    /* renamed from: b */
    public boolean mo43462b() {
        return this.f50174a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo43463c(C12821b bVar, int i, int i2) throws C12759j;

    /* renamed from: f */
    public void mo43464f(C12716c cVar) throws C12759j {
        C12821b bVar;
        if (cVar != null) {
            String name = cVar.getName();
            int i = 0;
            if (name.equalsIgnoreCase(RtspHeaders.WWW_AUTHENTICATE)) {
                this.f50174a = false;
            } else if (name.equalsIgnoreCase(RtspHeaders.PROXY_AUTHENTICATE)) {
                this.f50174a = true;
            } else {
                throw new C12759j("Unexpected header name: " + name);
            }
            if (cVar instanceof C12714b) {
                C12714b bVar2 = (C12714b) cVar;
                bVar = bVar2.mo47755a();
                i = bVar2.mo47756c();
            } else {
                String value = cVar.getValue();
                if (value != null) {
                    bVar = new C12821b(value.length());
                    bVar.mo47966c(value);
                } else {
                    throw new C12759j("Header value is null");
                }
            }
            while (i < bVar.mo47978p() && C12810d.m54317a(bVar.mo47972i(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < bVar.mo47978p() && !C12810d.m54317a(bVar.mo47972i(i2))) {
                i2++;
            }
            String q = bVar.mo47979q(i, i2);
            if (q.equalsIgnoreCase(mo43469i())) {
                mo43463c(bVar, i2, bVar.mo47978p());
                return;
            }
            throw new C12759j("Invalid scheme identifier: " + q);
        }
        throw new IllegalArgumentException("Header may not be null");
    }

    public String toString() {
        return mo43469i();
    }
}
