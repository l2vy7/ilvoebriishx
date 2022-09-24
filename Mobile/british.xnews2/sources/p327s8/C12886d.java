package p327s8;

import java.util.Locale;
import p316k9.C12825f;

/* renamed from: s8.d */
/* compiled from: Scheme */
public final class C12886d {

    /* renamed from: a */
    private final String f55561a;

    /* renamed from: b */
    private final C12888f f55562b;

    /* renamed from: c */
    private final int f55563c;

    /* renamed from: d */
    private final boolean f55564d;

    /* renamed from: e */
    private String f55565e;

    public C12886d(String str, int i, C12888f fVar) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        } else if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("Port is invalid: " + i);
        } else if (fVar != null) {
            this.f55561a = str.toLowerCase(Locale.ENGLISH);
            this.f55562b = fVar;
            this.f55563c = i;
            this.f55564d = fVar instanceof C12884b;
        } else {
            throw new IllegalArgumentException("Socket factory may not be null");
        }
    }

    /* renamed from: a */
    public final int mo48047a() {
        return this.f55563c;
    }

    /* renamed from: b */
    public final String mo48048b() {
        return this.f55561a;
    }

    /* renamed from: c */
    public final C12888f mo48049c() {
        return this.f55562b;
    }

    /* renamed from: d */
    public final boolean mo48050d() {
        return this.f55564d;
    }

    /* renamed from: e */
    public final int mo48051e(int i) {
        return i <= 0 ? this.f55563c : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12886d)) {
            return false;
        }
        C12886d dVar = (C12886d) obj;
        if (this.f55561a.equals(dVar.f55561a) && this.f55563c == dVar.f55563c && this.f55564d == dVar.f55564d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C12825f.m54381e(C12825f.m54380d(C12825f.m54379c(17, this.f55563c), this.f55561a), this.f55564d);
    }

    public final String toString() {
        if (this.f55565e == null) {
            this.f55565e = this.f55561a + ':' + Integer.toString(this.f55563c);
        }
        return this.f55565e;
    }
}
