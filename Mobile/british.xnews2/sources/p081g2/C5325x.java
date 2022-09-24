package p081g2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p004a3.C0062g;
import p004a3.C0066k;
import p064d2.C5159f;
import p064d2.C5163h;
import p064d2.C5167l;
import p086h2.C5382b;

/* renamed from: g2.x */
/* compiled from: ResourceCacheKey */
final class C5325x implements C5159f {

    /* renamed from: j */
    private static final C0062g<Class<?>, byte[]> f23500j = new C0062g<>(50);

    /* renamed from: b */
    private final C5382b f23501b;

    /* renamed from: c */
    private final C5159f f23502c;

    /* renamed from: d */
    private final C5159f f23503d;

    /* renamed from: e */
    private final int f23504e;

    /* renamed from: f */
    private final int f23505f;

    /* renamed from: g */
    private final Class<?> f23506g;

    /* renamed from: h */
    private final C5163h f23507h;

    /* renamed from: i */
    private final C5167l<?> f23508i;

    C5325x(C5382b bVar, C5159f fVar, C5159f fVar2, int i, int i2, C5167l<?> lVar, Class<?> cls, C5163h hVar) {
        this.f23501b = bVar;
        this.f23502c = fVar;
        this.f23503d = fVar2;
        this.f23504e = i;
        this.f23505f = i2;
        this.f23508i = lVar;
        this.f23506g = cls;
        this.f23507h = hVar;
    }

    /* renamed from: c */
    private byte[] m24002c() {
        C0062g<Class<?>, byte[]> gVar = f23500j;
        byte[] g = gVar.mo181g(this.f23506g);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f23506g.getName().getBytes(C5159f.f22594a);
        gVar.mo185k(this.f23506g, bytes);
        return bytes;
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f23501b.mo21805c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f23504e).putInt(this.f23505f).array();
        this.f23503d.mo21331a(messageDigest);
        this.f23502c.mo21331a(messageDigest);
        messageDigest.update(bArr);
        C5167l<?> lVar = this.f23508i;
        if (lVar != null) {
            lVar.mo21331a(messageDigest);
        }
        this.f23507h.mo21331a(messageDigest);
        messageDigest.update(m24002c());
        this.f23501b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5325x)) {
            return false;
        }
        C5325x xVar = (C5325x) obj;
        if (this.f23505f != xVar.f23505f || this.f23504e != xVar.f23504e || !C0066k.m251c(this.f23508i, xVar.f23508i) || !this.f23506g.equals(xVar.f23506g) || !this.f23502c.equals(xVar.f23502c) || !this.f23503d.equals(xVar.f23503d) || !this.f23507h.equals(xVar.f23507h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f23502c.hashCode() * 31) + this.f23503d.hashCode()) * 31) + this.f23504e) * 31) + this.f23505f;
        C5167l<?> lVar = this.f23508i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f23506g.hashCode()) * 31) + this.f23507h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f23502c + ", signature=" + this.f23503d + ", width=" + this.f23504e + ", height=" + this.f23505f + ", decodedResourceClass=" + this.f23506g + ", transformation='" + this.f23508i + '\'' + ", options=" + this.f23507h + '}';
    }
}
