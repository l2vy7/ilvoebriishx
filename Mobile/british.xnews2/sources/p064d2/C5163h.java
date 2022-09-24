package p064d2;

import java.security.MessageDigest;
import p004a3.C0055b;
import p149t.C6077a;

/* renamed from: d2.h */
/* compiled from: Options */
public final class C5163h implements C5159f {

    /* renamed from: b */
    private final C6077a<C5160g<?>, Object> f22600b = new C0055b();

    /* renamed from: f */
    private static <T> void m23480f(C5160g<T> gVar, Object obj, MessageDigest messageDigest) {
        gVar.mo21336g(obj, messageDigest);
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f22600b.size(); i++) {
            m23480f(this.f22600b.mo23390j(i), this.f22600b.mo23391o(i), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T mo21340c(C5160g<T> gVar) {
        return this.f22600b.containsKey(gVar) ? this.f22600b.get(gVar) : gVar.mo21334c();
    }

    /* renamed from: d */
    public void mo21341d(C5163h hVar) {
        this.f22600b.mo158l(hVar.f22600b);
    }

    /* renamed from: e */
    public <T> C5163h mo21342e(C5160g<T> gVar, T t) {
        this.f22600b.put(gVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5163h) {
            return this.f22600b.equals(((C5163h) obj).f22600b);
        }
        return false;
    }

    public int hashCode() {
        return this.f22600b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f22600b + '}';
    }
}
