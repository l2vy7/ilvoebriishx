package p310h9;

import p307g8.C12718d;
import p307g8.C12738v;
import p316k9.C12821b;
import p316k9.C12825f;

/* renamed from: h9.c */
/* compiled from: BasicHeaderElement */
public class C12764c implements C12718d, Cloneable {

    /* renamed from: b */
    private final String f55430b;

    /* renamed from: c */
    private final String f55431c;

    /* renamed from: d */
    private final C12738v[] f55432d;

    public C12764c(String str, String str2, C12738v[] vVarArr) {
        if (str != null) {
            this.f55430b = str;
            this.f55431c = str2;
            if (vVarArr != null) {
                this.f55432d = vVarArr;
            } else {
                this.f55432d = new C12738v[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }

    /* renamed from: a */
    public C12738v[] mo47766a() {
        return (C12738v[]) this.f55432d.clone();
    }

    /* renamed from: b */
    public C12738v mo47767b(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                C12738v[] vVarArr = this.f55432d;
                if (i >= vVarArr.length) {
                    return null;
                }
                C12738v vVar = vVarArr[i];
                if (vVar.getName().equalsIgnoreCase(str)) {
                    return vVar;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
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
        if (!(obj instanceof C12718d)) {
            return false;
        }
        C12764c cVar = (C12764c) obj;
        if (!this.f55430b.equals(cVar.f55430b) || !C12825f.m54377a(this.f55431c, cVar.f55431c) || !C12825f.m54378b(this.f55432d, cVar.f55432d)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.f55430b;
    }

    public String getValue() {
        return this.f55431c;
    }

    public int hashCode() {
        int d = C12825f.m54380d(C12825f.m54380d(17, this.f55430b), this.f55431c);
        int i = 0;
        while (true) {
            C12738v[] vVarArr = this.f55432d;
            if (i >= vVarArr.length) {
                return d;
            }
            d = C12825f.m54380d(d, vVarArr[i]);
            i++;
        }
    }

    public String toString() {
        C12821b bVar = new C12821b(64);
        bVar.mo47966c(this.f55430b);
        if (this.f55431c != null) {
            bVar.mo47966c("=");
            bVar.mo47966c(this.f55431c);
        }
        for (C12738v b : this.f55432d) {
            bVar.mo47966c("; ");
            bVar.mo47965b(b);
        }
        return bVar.toString();
    }
}
