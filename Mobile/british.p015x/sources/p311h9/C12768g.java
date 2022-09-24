package p311h9;

import p308g8.C12715b0;
import p308g8.C12731o;
import p308g8.C12742z;
import p313i9.C12791e;

/* renamed from: h9.g */
/* compiled from: BasicHttpRequest */
public class C12768g extends C12762a implements C12731o {

    /* renamed from: d */
    private final String f55441d;

    /* renamed from: e */
    private final String f55442e;

    /* renamed from: f */
    private C12715b0 f55443f;

    public C12768g(String str, String str2, C12742z zVar) {
        this(new C12774m(str, str2, zVar));
    }

    /* renamed from: a */
    public C12742z mo43587a() {
        return mo43589y().mo47757a();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f55441d);
        stringBuffer.append(" ");
        stringBuffer.append(this.f55442e);
        stringBuffer.append(" ");
        stringBuffer.append(this.f55426b);
        return stringBuffer.toString();
    }

    /* renamed from: y */
    public C12715b0 mo43589y() {
        if (this.f55443f == null) {
            this.f55443f = new C12774m(this.f55441d, this.f55442e, C12791e.m54280c(mo47801s()));
        }
        return this.f55443f;
    }

    public C12768g(C12715b0 b0Var) {
        if (b0Var != null) {
            this.f55443f = b0Var;
            this.f55441d = b0Var.mo47758c();
            this.f55442e = b0Var.getUri();
            return;
        }
        throw new IllegalArgumentException("Request line may not be null");
    }
}
