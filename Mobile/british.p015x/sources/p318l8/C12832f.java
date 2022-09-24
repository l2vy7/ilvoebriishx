package p318l8;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p308g8.C12715b0;
import p308g8.C12742z;
import p311h9.C12762a;
import p311h9.C12774m;
import p311h9.C12778q;
import p313i9.C12790d;
import p313i9.C12791e;
import p321o8.C12844a;
import p322p8.C12853e;
import p322p8.C12857i;

/* renamed from: l8.f */
/* compiled from: HttpRequestBase */
public abstract class C12832f extends C12762a implements C12833g, C12827a, Cloneable {

    /* renamed from: d */
    private Lock f55499d = new ReentrantLock();

    /* renamed from: e */
    private boolean f55500e;

    /* renamed from: f */
    private URI f55501f;

    /* renamed from: g */
    private C12853e f55502g;

    /* renamed from: h */
    private C12857i f55503h;

    /* renamed from: C */
    public URI mo43581C() {
        return this.f55501f;
    }

    /* renamed from: L */
    public void mo47988L(URI uri) {
        this.f55501f = uri;
    }

    /* renamed from: a */
    public C12742z mo43587a() {
        return C12791e.m54280c(mo47801s());
    }

    /* renamed from: c */
    public abstract String mo43588c();

    public Object clone() throws CloneNotSupportedException {
        C12832f fVar = (C12832f) super.clone();
        fVar.f55499d = new ReentrantLock();
        fVar.f55500e = false;
        fVar.f55503h = null;
        fVar.f55502g = null;
        fVar.f55426b = (C12778q) C12844a.m54420a(this.f55426b);
        fVar.f55427c = (C12790d) C12844a.m54420a(this.f55427c);
        return fVar;
    }

    /* renamed from: g */
    public void mo47984g(C12857i iVar) throws IOException {
        this.f55499d.lock();
        try {
            if (!this.f55500e) {
                this.f55502g = null;
                this.f55503h = iVar;
                return;
            }
            throw new IOException("Request already aborted");
        } finally {
            this.f55499d.unlock();
        }
    }

    /* renamed from: k */
    public void mo47985k(C12853e eVar) throws IOException {
        this.f55499d.lock();
        try {
            if (!this.f55500e) {
                this.f55503h = null;
                this.f55502g = eVar;
                return;
            }
            throw new IOException("Request already aborted");
        } finally {
            this.f55499d.unlock();
        }
    }

    /* renamed from: y */
    public C12715b0 mo43589y() {
        String c = mo43588c();
        C12742z a = mo43587a();
        URI C = mo43581C();
        String aSCIIString = C != null ? C.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new C12774m(c, aSCIIString, a);
    }
}
