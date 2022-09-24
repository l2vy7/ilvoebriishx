package p310h9;

import p307g8.C12714b;
import p307g8.C12715b0;
import p307g8.C12716c;
import p307g8.C12717c0;
import p307g8.C12742z;
import p316k9.C12821b;

/* renamed from: h9.i */
/* compiled from: BasicLineFormatter */
public class C12770i implements C12780s {

    /* renamed from: a */
    public static final C12770i f55448a = new C12770i();

    /* renamed from: a */
    public C12821b mo47867a(C12821b bVar, C12715b0 b0Var) {
        if (b0Var != null) {
            C12821b i = mo47875i(bVar);
            mo47871e(i, b0Var);
            return i;
        }
        throw new IllegalArgumentException("Request line may not be null");
    }

    /* renamed from: b */
    public C12821b mo47868b(C12821b bVar, C12716c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (cVar instanceof C12714b) {
            return ((C12714b) cVar).mo47755a();
        } else {
            C12821b i = mo47875i(bVar);
            mo47870d(i, cVar);
            return i;
        }
    }

    /* renamed from: c */
    public C12821b mo47869c(C12821b bVar, C12742z zVar) {
        if (zVar != null) {
            int g = mo47873g(zVar);
            if (bVar == null) {
                bVar = new C12821b(g);
            } else {
                bVar.mo47974k(g);
            }
            bVar.mo47966c(zVar.mo47817g());
            bVar.mo47964a('/');
            bVar.mo47966c(Integer.toString(zVar.mo47813c()));
            bVar.mo47964a('.');
            bVar.mo47966c(Integer.toString(zVar.mo47815d()));
            return bVar;
        }
        throw new IllegalArgumentException("Protocol version may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo47870d(C12821b bVar, C12716c cVar) {
        String name = cVar.getName();
        String value = cVar.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        bVar.mo47974k(length);
        bVar.mo47966c(name);
        bVar.mo47966c(": ");
        if (value != null) {
            bVar.mo47966c(value);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo47871e(C12821b bVar, C12715b0 b0Var) {
        String c = b0Var.mo47758c();
        String uri = b0Var.getUri();
        bVar.mo47974k(c.length() + 1 + uri.length() + 1 + mo47873g(b0Var.mo47757a()));
        bVar.mo47966c(c);
        bVar.mo47964a(' ');
        bVar.mo47966c(uri);
        bVar.mo47964a(' ');
        mo47869c(bVar, b0Var.mo47757a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo47872f(C12821b bVar, C12717c0 c0Var) {
        int g = mo47873g(c0Var.mo47763a()) + 1 + 3 + 1;
        String c = c0Var.mo47765c();
        if (c != null) {
            g += c.length();
        }
        bVar.mo47974k(g);
        mo47869c(bVar, c0Var.mo47763a());
        bVar.mo47964a(' ');
        bVar.mo47966c(Integer.toString(c0Var.mo47764b()));
        bVar.mo47964a(' ');
        if (c != null) {
            bVar.mo47966c(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo47873g(C12742z zVar) {
        return zVar.mo47817g().length() + 4;
    }

    /* renamed from: h */
    public C12821b mo47874h(C12821b bVar, C12717c0 c0Var) {
        if (c0Var != null) {
            C12821b i = mo47875i(bVar);
            mo47872f(i, c0Var);
            return i;
        }
        throw new IllegalArgumentException("Status line may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C12821b mo47875i(C12821b bVar) {
        if (bVar == null) {
            return new C12821b(64);
        }
        bVar.mo47973j();
        return bVar;
    }
}
