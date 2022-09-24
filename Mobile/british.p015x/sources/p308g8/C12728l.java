package p308g8;

import java.io.Serializable;
import java.util.Locale;
import p317k9.C12821b;
import p317k9.C12825f;

/* renamed from: g8.l */
/* compiled from: HttpHost */
public final class C12728l implements Cloneable, Serializable {

    /* renamed from: b */
    protected final String f55401b;

    /* renamed from: c */
    protected final String f55402c;

    /* renamed from: d */
    protected final int f55403d;

    /* renamed from: e */
    protected final String f55404e;

    public C12728l(String str, int i, String str2) {
        if (str != null) {
            this.f55401b = str;
            Locale locale = Locale.ENGLISH;
            this.f55402c = str.toLowerCase(locale);
            if (str2 != null) {
                this.f55404e = str2.toLowerCase(locale);
            } else {
                this.f55404e = "http";
            }
            this.f55403d = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }

    /* renamed from: a */
    public String mo47782a() {
        return this.f55401b;
    }

    /* renamed from: b */
    public int mo47783b() {
        return this.f55403d;
    }

    /* renamed from: c */
    public String mo47784c() {
        return this.f55404e;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public String mo47786d() {
        if (this.f55403d == -1) {
            return this.f55401b;
        }
        C12821b bVar = new C12821b(this.f55401b.length() + 6);
        bVar.mo47966c(this.f55401b);
        bVar.mo47966c(":");
        bVar.mo47966c(Integer.toString(this.f55403d));
        return bVar.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12728l)) {
            return false;
        }
        C12728l lVar = (C12728l) obj;
        if (!this.f55402c.equals(lVar.f55402c) || this.f55403d != lVar.f55403d || !this.f55404e.equals(lVar.f55404e)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public String mo47788g() {
        C12821b bVar = new C12821b(32);
        bVar.mo47966c(this.f55404e);
        bVar.mo47966c("://");
        bVar.mo47966c(this.f55401b);
        if (this.f55403d != -1) {
            bVar.mo47964a(':');
            bVar.mo47966c(Integer.toString(this.f55403d));
        }
        return bVar.toString();
    }

    public int hashCode() {
        return C12825f.m54380d(C12825f.m54379c(C12825f.m54380d(17, this.f55402c), this.f55403d), this.f55404e);
    }

    public String toString() {
        return mo47788g();
    }

    public C12728l(String str, int i) {
        this(str, i, (String) null);
    }
}
