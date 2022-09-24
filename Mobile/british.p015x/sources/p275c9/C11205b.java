package p275c9;

import java.io.IOException;
import java.net.Socket;
import p308g8.C12728l;
import p313i9.C12790d;
import p315j9.C12811e;
import p322p8.C12852d;
import p322p8.C12863o;
import p326r8.C12871b;
import p326r8.C12877f;

/* renamed from: c9.b */
/* compiled from: AbstractPoolEntry */
public abstract class C11205b {

    /* renamed from: a */
    protected final C12852d f50310a;

    /* renamed from: b */
    protected final C12863o f50311b;

    /* renamed from: c */
    protected volatile C12871b f50312c;

    /* renamed from: d */
    protected volatile Object f50313d;

    /* renamed from: e */
    protected volatile C12877f f50314e;

    protected C11205b(C12852d dVar, C12871b bVar) {
        if (dVar != null) {
            this.f50310a = dVar;
            this.f50311b = dVar.mo43650c();
            this.f50312c = bVar;
            this.f50314e = null;
            return;
        }
        throw new IllegalArgumentException("Connection operator may not be null");
    }

    /* renamed from: a */
    public void mo43624a(C12811e eVar, C12790d dVar) throws IOException {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f50314e == null || !this.f50314e.mo48034m()) {
            throw new IllegalStateException("Connection not open.");
        } else if (!this.f50314e.mo48019c()) {
            throw new IllegalStateException("Protocol layering without a tunnel not supported.");
        } else if (!this.f50314e.mo48026i()) {
            this.f50310a.mo43648a(this.f50311b, this.f50314e.mo48024h(), eVar, dVar);
            this.f50314e.mo48035n(this.f50311b.mo43643a());
        } else {
            throw new IllegalStateException("Multiple protocol layering not supported.");
        }
    }

    /* renamed from: b */
    public void mo43625b(C12871b bVar, C12811e eVar, C12790d dVar) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("Route must not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f50314e == null || !this.f50314e.mo48034m()) {
            this.f50314e = new C12877f(bVar);
            C12728l k = bVar.mo48027k();
            this.f50310a.mo43649b(this.f50311b, k != null ? k : bVar.mo48024h(), bVar.mo48021d(), eVar, dVar);
            C12877f fVar = this.f50314e;
            if (fVar == null) {
                throw new IOException("Request aborted");
            } else if (k == null) {
                fVar.mo48033l(this.f50311b.mo43643a());
            } else {
                fVar.mo48032k(k, this.f50311b.mo43643a());
            }
        } else {
            throw new IllegalStateException("Connection already open.");
        }
    }

    /* renamed from: c */
    public void mo43626c(Object obj) {
        this.f50313d = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo43627d() {
        this.f50314e = null;
        this.f50313d = null;
    }

    /* renamed from: e */
    public void mo43628e(C12728l lVar, boolean z, C12790d dVar) throws IOException {
        if (lVar == null) {
            throw new IllegalArgumentException("Next proxy must not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f50314e == null || !this.f50314e.mo48034m()) {
            throw new IllegalStateException("Connection not open.");
        } else {
            this.f50311b.mo43644f((Socket) null, lVar, z, dVar);
            this.f50314e.mo48037p(lVar, z);
        }
    }

    /* renamed from: f */
    public void mo43629f(boolean z, C12790d dVar) throws IOException {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f50314e == null || !this.f50314e.mo48034m()) {
            throw new IllegalStateException("Connection not open.");
        } else if (!this.f50314e.mo48019c()) {
            this.f50311b.mo43644f((Socket) null, this.f50314e.mo48024h(), z, dVar);
            this.f50314e.mo48038s(z);
        } else {
            throw new IllegalStateException("Connection is already tunnelled.");
        }
    }
}
