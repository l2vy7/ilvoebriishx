package p322p8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p308g8.C12725i;
import p317k9.C12823d;
import p336w8.C12946e;

/* renamed from: p8.a */
/* compiled from: BasicManagedEntity */
public class C12849a extends C12946e implements C12857i, C12859k {

    /* renamed from: c */
    protected C12862n f55518c;

    /* renamed from: d */
    protected final boolean f55519d;

    public C12849a(C12725i iVar, C12862n nVar, boolean z) {
        super(iVar);
        if (nVar != null) {
            this.f55518c = nVar;
            this.f55519d = z;
            return;
        }
        throw new IllegalArgumentException("Connection may not be null.");
    }

    /* renamed from: r */
    private void m54433r() throws IOException {
        if (this.f55518c != null) {
            try {
                if (this.f55519d) {
                    C12823d.m54369a(this.f55654b);
                    this.f55518c.mo43619u();
                }
            } finally {
                mo47995t();
            }
        }
    }

    /* renamed from: a */
    public void mo43576a(OutputStream outputStream) throws IOException {
        super.mo43576a(outputStream);
        m54433r();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public boolean mo47992e(InputStream inputStream) throws IOException {
        try {
            if (this.f55519d && this.f55518c != null) {
                inputStream.close();
                this.f55518c.mo43619u();
            }
            mo47995t();
            return false;
        } catch (Throwable th) {
            mo47995t();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public boolean mo47993f(InputStream inputStream) throws IOException {
        try {
            if (this.f55519d && this.f55518c != null) {
                inputStream.close();
                this.f55518c.mo43619u();
            }
            mo47995t();
            return false;
        } catch (Throwable th) {
            mo47995t();
            throw th;
        }
    }

    /* renamed from: i */
    public boolean mo47778i() {
        return false;
    }

    /* renamed from: k */
    public InputStream mo43577k() throws IOException {
        return new C12858j(this.f55654b.mo43577k(), this);
    }

    /* renamed from: q */
    public boolean mo47994q(InputStream inputStream) throws IOException {
        C12862n nVar = this.f55518c;
        if (nVar == null) {
            return false;
        }
        nVar.mo43613n();
        return false;
    }

    @Deprecated
    /* renamed from: s */
    public void mo43578s() throws IOException {
        m54433r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo47995t() throws IOException {
        C12862n nVar = this.f55518c;
        if (nVar != null) {
            try {
                nVar.mo43609g();
            } finally {
                this.f55518c = null;
            }
        }
    }
}
