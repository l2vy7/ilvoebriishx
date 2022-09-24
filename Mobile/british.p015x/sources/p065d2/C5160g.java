package p065d2;

import java.security.MessageDigest;
import p004a3.C0065j;

/* renamed from: d2.g */
/* compiled from: Option */
public final class C5160g<T> {

    /* renamed from: e */
    private static final C5162b<Object> f22595e = new C5161a();

    /* renamed from: a */
    private final T f22596a;

    /* renamed from: b */
    private final C5162b<T> f22597b;

    /* renamed from: c */
    private final String f22598c;

    /* renamed from: d */
    private volatile byte[] f22599d;

    /* renamed from: d2.g$a */
    /* compiled from: Option */
    class C5161a implements C5162b<Object> {
        C5161a() {
        }

        /* renamed from: a */
        public void mo21339a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: d2.g$b */
    /* compiled from: Option */
    public interface C5162b<T> {
        /* renamed from: a */
        void mo21339a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C5160g(String str, T t, C5162b<T> bVar) {
        this.f22598c = C0065j.m245b(str);
        this.f22596a = t;
        this.f22597b = (C5162b) C0065j.m247d(bVar);
    }

    /* renamed from: a */
    public static <T> C5160g<T> m23471a(String str, T t, C5162b<T> bVar) {
        return new C5160g<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> C5162b<T> m23472b() {
        return f22595e;
    }

    /* renamed from: d */
    private byte[] m23473d() {
        if (this.f22599d == null) {
            this.f22599d = this.f22598c.getBytes(C5159f.f22594a);
        }
        return this.f22599d;
    }

    /* renamed from: e */
    public static <T> C5160g<T> m23474e(String str) {
        return new C5160g<>(str, (Object) null, m23472b());
    }

    /* renamed from: f */
    public static <T> C5160g<T> m23475f(String str, T t) {
        return new C5160g<>(str, t, m23472b());
    }

    /* renamed from: c */
    public T mo21334c() {
        return this.f22596a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5160g) {
            return this.f22598c.equals(((C5160g) obj).f22598c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo21336g(T t, MessageDigest messageDigest) {
        this.f22597b.mo21339a(m23473d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f22598c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f22598c + '\'' + '}';
    }
}
