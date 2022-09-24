package p082g2;

import java.security.MessageDigest;
import java.util.Map;
import p004a3.C0065j;
import p065d2.C5159f;
import p065d2.C5163h;
import p065d2.C5167l;

/* renamed from: g2.n */
/* compiled from: EngineKey */
class C5312n implements C5159f {

    /* renamed from: b */
    private final Object f23454b;

    /* renamed from: c */
    private final int f23455c;

    /* renamed from: d */
    private final int f23456d;

    /* renamed from: e */
    private final Class<?> f23457e;

    /* renamed from: f */
    private final Class<?> f23458f;

    /* renamed from: g */
    private final C5159f f23459g;

    /* renamed from: h */
    private final Map<Class<?>, C5167l<?>> f23460h;

    /* renamed from: i */
    private final C5163h f23461i;

    /* renamed from: j */
    private int f23462j;

    C5312n(Object obj, C5159f fVar, int i, int i2, Map<Class<?>, C5167l<?>> map, Class<?> cls, Class<?> cls2, C5163h hVar) {
        this.f23454b = C0065j.m247d(obj);
        this.f23459g = (C5159f) C0065j.m248e(fVar, "Signature must not be null");
        this.f23455c = i;
        this.f23456d = i2;
        this.f23460h = (Map) C0065j.m247d(map);
        this.f23457e = (Class) C0065j.m248e(cls, "Resource class must not be null");
        this.f23458f = (Class) C0065j.m248e(cls2, "Transcode class must not be null");
        this.f23461i = (C5163h) C0065j.m247d(hVar);
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5312n)) {
            return false;
        }
        C5312n nVar = (C5312n) obj;
        if (!this.f23454b.equals(nVar.f23454b) || !this.f23459g.equals(nVar.f23459g) || this.f23456d != nVar.f23456d || this.f23455c != nVar.f23455c || !this.f23460h.equals(nVar.f23460h) || !this.f23457e.equals(nVar.f23457e) || !this.f23458f.equals(nVar.f23458f) || !this.f23461i.equals(nVar.f23461i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f23462j == 0) {
            int hashCode = this.f23454b.hashCode();
            this.f23462j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f23459g.hashCode();
            this.f23462j = hashCode2;
            int i = (hashCode2 * 31) + this.f23455c;
            this.f23462j = i;
            int i2 = (i * 31) + this.f23456d;
            this.f23462j = i2;
            int hashCode3 = (i2 * 31) + this.f23460h.hashCode();
            this.f23462j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f23457e.hashCode();
            this.f23462j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f23458f.hashCode();
            this.f23462j = hashCode5;
            this.f23462j = (hashCode5 * 31) + this.f23461i.hashCode();
        }
        return this.f23462j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f23454b + ", width=" + this.f23455c + ", height=" + this.f23456d + ", resourceClass=" + this.f23457e + ", transcodeClass=" + this.f23458f + ", signature=" + this.f23459g + ", hashCode=" + this.f23462j + ", transformations=" + this.f23460h + ", options=" + this.f23461i + '}';
    }
}
