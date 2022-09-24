package p311h9;

import java.io.Serializable;
import p308g8.C12717c0;
import p308g8.C12742z;
import p317k9.C12821b;

/* renamed from: h9.n */
/* compiled from: BasicStatusLine */
public class C12775n implements C12717c0, Cloneable, Serializable {

    /* renamed from: b */
    private final C12742z f55460b;

    /* renamed from: c */
    private final int f55461c;

    /* renamed from: d */
    private final String f55462d;

    public C12775n(C12742z zVar, int i, String str) {
        if (zVar == null) {
            throw new IllegalArgumentException("Protocol version may not be null.");
        } else if (i >= 0) {
            this.f55460b = zVar;
            this.f55461c = i;
            this.f55462d = str;
        } else {
            throw new IllegalArgumentException("Status code may not be negative.");
        }
    }

    /* renamed from: a */
    public C12742z mo47763a() {
        return this.f55460b;
    }

    /* renamed from: b */
    public int mo47764b() {
        return this.f55461c;
    }

    /* renamed from: c */
    public String mo47765c() {
        return this.f55462d;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return C12770i.f55448a.mo47874h((C12821b) null, this).toString();
    }
}
