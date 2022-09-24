package p157u1;

import android.content.Context;
import p178y1.C6400a;

/* renamed from: u1.g */
/* compiled from: Trackers */
public class C6185g {

    /* renamed from: e */
    private static C6185g f25535e;

    /* renamed from: a */
    private C6175a f25536a;

    /* renamed from: b */
    private C6176b f25537b;

    /* renamed from: c */
    private C6181e f25538c;

    /* renamed from: d */
    private C6184f f25539d;

    private C6185g(Context context, C6400a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f25536a = new C6175a(applicationContext, aVar);
        this.f25537b = new C6176b(applicationContext, aVar);
        this.f25538c = new C6181e(applicationContext, aVar);
        this.f25539d = new C6184f(applicationContext, aVar);
    }

    /* renamed from: c */
    public static synchronized C6185g m27124c(Context context, C6400a aVar) {
        C6185g gVar;
        synchronized (C6185g.class) {
            if (f25535e == null) {
                f25535e = new C6185g(context, aVar);
            }
            gVar = f25535e;
        }
        return gVar;
    }

    /* renamed from: a */
    public C6175a mo23601a() {
        return this.f25536a;
    }

    /* renamed from: b */
    public C6176b mo23602b() {
        return this.f25537b;
    }

    /* renamed from: d */
    public C6181e mo23603d() {
        return this.f25538c;
    }

    /* renamed from: e */
    public C6184f mo23604e() {
        return this.f25539d;
    }
}
