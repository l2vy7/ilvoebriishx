package p310h8;

import java.io.Serializable;
import java.security.Principal;
import p317k9.C12825f;

/* renamed from: h8.k */
/* compiled from: NTCredentials */
public class C12760k implements C12757h, Serializable {

    /* renamed from: b */
    private final C12761l f55423b;

    /* renamed from: c */
    private final String f55424c;

    /* renamed from: d */
    private final String f55425d;

    /* renamed from: a */
    public Principal mo47837a() {
        return this.f55423b;
    }

    /* renamed from: b */
    public String mo47838b() {
        return this.f55424c;
    }

    /* renamed from: c */
    public String mo47839c() {
        throw null;
    }

    /* renamed from: d */
    public String mo47840d() {
        throw null;
    }

    /* renamed from: e */
    public String mo47841e() {
        return this.f55425d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12760k)) {
            return false;
        }
        C12760k kVar = (C12760k) obj;
        if (!C12825f.m54377a(this.f55423b, kVar.f55423b) || !C12825f.m54377a(this.f55425d, kVar.f55425d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C12825f.m54380d(C12825f.m54380d(17, this.f55423b), this.f55425d);
    }

    public String toString() {
        return "[principal: " + this.f55423b + "][workstation: " + this.f55425d + "]";
    }
}
