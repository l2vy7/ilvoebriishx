package p304e9;

import java.io.IOException;
import java.io.OutputStream;
import p306f9.C12703f;
import p306f9.C12705h;
import p306f9.C12709l;
import p307g8.C12725i;
import p307g8.C12727k;
import p307g8.C12730n;
import p308g9.C12749g;
import p335w8.C12945d;

/* renamed from: e9.b */
/* compiled from: EntitySerializer */
public class C12693b {

    /* renamed from: a */
    private final C12945d f55328a;

    public C12693b(C12945d dVar) {
        if (dVar != null) {
            this.f55328a = dVar;
            return;
        }
        throw new IllegalArgumentException("Content length strategy may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public OutputStream mo47696a(C12749g gVar, C12730n nVar) throws C12727k, IOException {
        long a = this.f55328a.mo47698a(nVar);
        if (a == -2) {
            return new C12703f(gVar);
        }
        if (a == -1) {
            return new C12709l(gVar);
        }
        return new C12705h(gVar, a);
    }

    /* renamed from: b */
    public void mo47697b(C12749g gVar, C12730n nVar, C12725i iVar) throws C12727k, IOException {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else if (nVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        } else if (iVar != null) {
            OutputStream a = mo47696a(gVar, nVar);
            iVar.mo43576a(a);
            a.close();
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }
}
