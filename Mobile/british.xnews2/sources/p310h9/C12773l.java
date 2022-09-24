package p310h9;

import java.io.Serializable;
import p307g8.C12738v;
import p316k9.C12821b;
import p316k9.C12825f;

/* renamed from: h9.l */
/* compiled from: BasicNameValuePair */
public class C12773l implements C12738v, Cloneable, Serializable {

    /* renamed from: b */
    private final String f55455b;

    /* renamed from: c */
    private final String f55456c;

    public C12773l(String str, String str2) {
        if (str != null) {
            this.f55455b = str;
            this.f55456c = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12738v)) {
            return false;
        }
        C12773l lVar = (C12773l) obj;
        if (!this.f55455b.equals(lVar.f55455b) || !C12825f.m54377a(this.f55456c, lVar.f55456c)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.f55455b;
    }

    public String getValue() {
        return this.f55456c;
    }

    public int hashCode() {
        return C12825f.m54380d(C12825f.m54380d(17, this.f55455b), this.f55456c);
    }

    public String toString() {
        if (this.f55456c == null) {
            return this.f55455b;
        }
        C12821b bVar = new C12821b(this.f55455b.length() + 1 + this.f55456c.length());
        bVar.mo47966c(this.f55455b);
        bVar.mo47966c("=");
        bVar.mo47966c(this.f55456c);
        return bVar.toString();
    }
}
