package p230l7;

import com.google.firebase.installations.C10463f;
import java.util.concurrent.TimeUnit;

/* renamed from: l7.e */
/* compiled from: RequestLimiter */
class C10735e {

    /* renamed from: d */
    private static final long f49374d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f49375e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C10463f f49376a = C10463f.m48162c();

    /* renamed from: b */
    private long f49377b;

    /* renamed from: c */
    private int f49378c;

    C10735e() {
    }

    /* renamed from: a */
    private synchronized long m48606a(int i) {
        if (!m48607c(i)) {
            return f49374d;
        }
        double pow = Math.pow(2.0d, (double) this.f49378c);
        double e = (double) this.f49376a.mo41938e();
        Double.isNaN(e);
        return (long) Math.min(pow + e, (double) f49375e);
    }

    /* renamed from: c */
    private static boolean m48607c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m48608d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m48609e() {
        this.f49378c = 0;
    }

    /* renamed from: b */
    public synchronized boolean mo42903b() {
        return this.f49378c == 0 || this.f49376a.mo41936a() > this.f49377b;
    }

    /* renamed from: f */
    public synchronized void mo42904f(int i) {
        if (m48608d(i)) {
            m48609e();
            return;
        }
        this.f49378c++;
        this.f49377b = this.f49376a.mo41936a() + m48606a(i);
    }
}
