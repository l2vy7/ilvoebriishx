package p305e9;

import java.io.IOException;
import p307f9.C12702e;
import p307f9.C12704g;
import p307f9.C12708k;
import p308g8.C12716c;
import p308g8.C12725i;
import p308g8.C12727k;
import p308g8.C12730n;
import p309g9.C12748f;
import p336w8.C12943b;
import p336w8.C12945d;

/* renamed from: e9.a */
/* compiled from: EntityDeserializer */
public class C12692a {

    /* renamed from: a */
    private final C12945d f55327a;

    public C12692a(C12945d dVar) {
        if (dVar != null) {
            this.f55327a = dVar;
            return;
        }
        throw new IllegalArgumentException("Content length strategy may not be null");
    }

    /* renamed from: a */
    public C12725i mo47694a(C12748f fVar, C12730n nVar) throws C12727k, IOException {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (nVar != null) {
            return mo47695b(fVar, nVar);
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12943b mo47695b(C12748f fVar, C12730n nVar) throws C12727k, IOException {
        C12943b bVar = new C12943b();
        long a = this.f55327a.mo47698a(nVar);
        if (a == -2) {
            bVar.mo48108c(true);
            bVar.mo48113n(-1);
            bVar.mo48112m(new C12702e(fVar));
        } else if (a == -1) {
            bVar.mo48108c(false);
            bVar.mo48113n(-1);
            bVar.mo48112m(new C12708k(fVar));
        } else {
            bVar.mo48108c(false);
            bVar.mo48113n(a);
            bVar.mo48112m(new C12704g(fVar, a));
        }
        C12716c I = nVar.mo47792I(RtspHeaders.CONTENT_TYPE);
        if (I != null) {
            bVar.mo48110g(I);
        }
        C12716c I2 = nVar.mo47792I(RtspHeaders.CONTENT_ENCODING);
        if (I2 != null) {
            bVar.mo48109d(I2);
        }
        return bVar;
    }
}
