package p273b9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p308g8.C12716c;
import p308g8.C12725i;
import p308g8.C12726j;
import p308g8.C12741y;
import p336w8.C12946e;

/* renamed from: b9.o */
/* compiled from: EntityEnclosingRequestWrapper */
public class C11195o extends C11198q implements C12726j {

    /* renamed from: i */
    private C12725i f50285i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f50286j;

    /* renamed from: b9.o$a */
    /* compiled from: EntityEnclosingRequestWrapper */
    class C11196a extends C12946e {
        C11196a(C12725i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public void mo43576a(OutputStream outputStream) throws IOException {
            boolean unused = C11195o.this.f50286j = true;
            super.mo43576a(outputStream);
        }

        /* renamed from: k */
        public InputStream mo43577k() throws IOException {
            boolean unused = C11195o.this.f50286j = true;
            return super.mo43577k();
        }

        @Deprecated
        /* renamed from: s */
        public void mo43578s() throws IOException {
            boolean unused = C11195o.this.f50286j = true;
            super.mo43578s();
        }
    }

    public C11195o(C12726j jVar) throws C12741y {
        super(jVar);
        mo43572B(jVar.mo43574b());
    }

    /* renamed from: B */
    public void mo43572B(C12725i iVar) {
        this.f50285i = iVar != null ? new C11196a(iVar) : null;
        this.f50286j = false;
    }

    /* renamed from: O */
    public boolean mo43573O() {
        C12725i iVar = this.f50285i;
        return iVar == null || iVar.mo47778i() || !this.f50286j;
    }

    /* renamed from: b */
    public C12725i mo43574b() {
        return this.f50285i;
    }

    /* renamed from: h */
    public boolean mo43575h() {
        C12716c I = mo47792I("Expect");
        return I != null && "100-continue".equalsIgnoreCase(I.getValue());
    }
}
