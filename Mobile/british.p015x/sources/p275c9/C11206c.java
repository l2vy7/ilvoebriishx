package p275c9;

import java.io.IOException;
import p308g8.C12728l;
import p313i9.C12790d;
import p315j9.C12811e;
import p322p8.C12850b;
import p322p8.C12863o;
import p326r8.C12871b;

/* renamed from: c9.c */
/* compiled from: AbstractPooledConnAdapter */
public abstract class C11206c extends C11204a {

    /* renamed from: g */
    protected volatile C11205b f50315g;

    protected C11206c(C12850b bVar, C11205b bVar2) {
        super(bVar, bVar2.f50311b);
        this.f50315g = bVar2;
    }

    /* renamed from: B */
    public void mo43630B(C12728l lVar, boolean z, C12790d dVar) throws IOException {
        C11205b K = mo43633K();
        mo43632J(K);
        K.mo43628e(lVar, z, dVar);
    }

    /* renamed from: C */
    public void mo43631C(C12811e eVar, C12790d dVar) throws IOException {
        C11205b K = mo43633K();
        mo43632J(K);
        K.mo43624a(eVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public synchronized void mo43599D() {
        this.f50315g = null;
        super.mo43599D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo43632J(C11205b bVar) {
        if (mo43603H() || bVar == null) {
            throw new C11207d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public C11205b mo43633K() {
        return this.f50315g;
    }

    /* renamed from: c */
    public C12871b mo43634c() {
        C11205b K = mo43633K();
        mo43632J(K);
        if (K.f50314e == null) {
            return null;
        }
        return K.f50314e.mo48036o();
    }

    public void close() throws IOException {
        C11205b K = mo43633K();
        if (K != null) {
            K.mo43627d();
        }
        C12863o F = mo43601F();
        if (F != null) {
            F.close();
        }
    }

    /* renamed from: d */
    public void mo43636d(C12871b bVar, C12811e eVar, C12790d dVar) throws IOException {
        C11205b K = mo43633K();
        mo43632J(K);
        K.mo43625b(bVar, eVar, dVar);
    }

    /* renamed from: j */
    public void mo43637j(Object obj) {
        C11205b K = mo43633K();
        mo43632J(K);
        K.mo43626c(obj);
    }

    /* renamed from: m */
    public void mo43638m(boolean z, C12790d dVar) throws IOException {
        C11205b K = mo43633K();
        mo43632J(K);
        K.mo43629f(z, dVar);
    }

    public void shutdown() throws IOException {
        C11205b K = mo43633K();
        if (K != null) {
            K.mo43627d();
        }
        C12863o F = mo43601F();
        if (F != null) {
            F.shutdown();
        }
    }
}
