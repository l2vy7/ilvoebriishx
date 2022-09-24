package p082g2;

import java.security.MessageDigest;
import p065d2.C5159f;

/* renamed from: g2.d */
/* compiled from: DataCacheKey */
final class C5276d implements C5159f {

    /* renamed from: b */
    private final C5159f f23310b;

    /* renamed from: c */
    private final C5159f f23311c;

    C5276d(C5159f fVar, C5159f fVar2) {
        this.f23310b = fVar;
        this.f23311c = fVar2;
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        this.f23310b.mo21331a(messageDigest);
        this.f23311c.mo21331a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5276d)) {
            return false;
        }
        C5276d dVar = (C5276d) obj;
        if (!this.f23310b.equals(dVar.f23310b) || !this.f23311c.equals(dVar.f23311c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f23310b.hashCode() * 31) + this.f23311c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f23310b + ", signature=" + this.f23311c + '}';
    }
}
