package p092i2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p004a3.C0062g;
import p004a3.C0065j;
import p004a3.C0066k;
import p013b3.C1554a;
import p013b3.C1563c;
import p065d2.C5159f;
import p105l0.C5645e;

/* renamed from: i2.j */
/* compiled from: SafeKeyGenerator */
public class C5464j {

    /* renamed from: a */
    private final C0062g<C5159f, String> f23830a = new C0062g<>(1000);

    /* renamed from: b */
    private final C5645e<C5466b> f23831b = C1554a.m7980d(10, new C5465a());

    /* renamed from: i2.j$a */
    /* compiled from: SafeKeyGenerator */
    class C5465a implements C1554a.C1558d<C5466b> {
        C5465a() {
        }

        /* renamed from: b */
        public C5466b mo7107a() {
            try {
                return new C5466b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: i2.j$b */
    /* compiled from: SafeKeyGenerator */
    private static final class C5466b implements C1554a.C1560f {

        /* renamed from: b */
        final MessageDigest f23833b;

        /* renamed from: c */
        private final C1563c f23834c = C1563c.m7996a();

        C5466b(MessageDigest messageDigest) {
            this.f23833b = messageDigest;
        }

        /* renamed from: k */
        public C1563c mo7112k() {
            return this.f23834c;
        }
    }

    /* renamed from: a */
    private String m24470a(C5159f fVar) {
        C5466b bVar = (C5466b) C0065j.m247d(this.f23831b.acquire());
        try {
            fVar.mo21331a(bVar.f23833b);
            return C0066k.m268t(bVar.f23833b.digest());
        } finally {
            this.f23831b.mo7110a(bVar);
        }
    }

    /* renamed from: b */
    public String mo21930b(C5159f fVar) {
        String g;
        synchronized (this.f23830a) {
            g = this.f23830a.mo181g(fVar);
        }
        if (g == null) {
            g = m24470a(fVar);
        }
        synchronized (this.f23830a) {
            this.f23830a.mo185k(fVar, g);
        }
        return g;
    }
}
