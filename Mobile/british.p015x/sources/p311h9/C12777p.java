package p311h9;

import java.io.Serializable;
import p308g8.C12714b;
import p308g8.C12718d;
import p308g8.C12740x;
import p317k9.C12821b;

/* renamed from: h9.p */
/* compiled from: BufferedHeader */
public class C12777p implements C12714b, Cloneable, Serializable {

    /* renamed from: b */
    private final String f55467b;

    /* renamed from: c */
    private final C12821b f55468c;

    /* renamed from: d */
    private final int f55469d;

    public C12777p(C12821b bVar) throws C12740x {
        if (bVar != null) {
            int m = bVar.mo47975m(58);
            if (m != -1) {
                String r = bVar.mo47980r(0, m);
                if (r.length() != 0) {
                    this.f55468c = bVar;
                    this.f55467b = r;
                    this.f55469d = m + 1;
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid header: ");
                stringBuffer.append(bVar.toString());
                throw new C12740x(stringBuffer.toString());
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Invalid header: ");
            stringBuffer2.append(bVar.toString());
            throw new C12740x(stringBuffer2.toString());
        }
        throw new IllegalArgumentException("Char array buffer may not be null");
    }

    /* renamed from: a */
    public C12821b mo47755a() {
        return this.f55468c;
    }

    /* renamed from: b */
    public C12718d[] mo47760b() throws C12740x {
        C12782u uVar = new C12782u(0, this.f55468c.mo47978p());
        uVar.mo47923d(this.f55469d);
        return C12767f.f55439a.mo47858a(this.f55468c, uVar);
    }

    /* renamed from: c */
    public int mo47756c() {
        return this.f55469d;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return this.f55467b;
    }

    public String getValue() {
        C12821b bVar = this.f55468c;
        return bVar.mo47980r(this.f55469d, bVar.mo47978p());
    }

    public String toString() {
        return this.f55468c.toString();
    }
}
