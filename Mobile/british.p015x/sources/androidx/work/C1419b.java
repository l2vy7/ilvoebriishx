package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p129p1.C5883a;

/* renamed from: androidx.work.b */
/* compiled from: Configuration */
public final class C1419b {

    /* renamed from: a */
    final Executor f6284a;

    /* renamed from: b */
    final Executor f6285b;

    /* renamed from: c */
    final C1506z f6286c;

    /* renamed from: d */
    final C1481l f6287d;

    /* renamed from: e */
    final C1499u f6288e;

    /* renamed from: f */
    final C1479j f6289f;

    /* renamed from: g */
    final String f6290g;

    /* renamed from: h */
    final int f6291h;

    /* renamed from: i */
    final int f6292i;

    /* renamed from: j */
    final int f6293j;

    /* renamed from: k */
    final int f6294k;

    /* renamed from: l */
    private final boolean f6295l;

    /* renamed from: androidx.work.b$a */
    /* compiled from: Configuration */
    class C1420a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f6296a = new AtomicInteger(0);

        /* renamed from: b */
        final /* synthetic */ boolean f6297b;

        C1420a(boolean z) {
            this.f6297b = z;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f6297b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f6296a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.b$b */
    /* compiled from: Configuration */
    public static final class C1421b {

        /* renamed from: a */
        Executor f6299a;

        /* renamed from: b */
        C1506z f6300b;

        /* renamed from: c */
        C1481l f6301c;

        /* renamed from: d */
        Executor f6302d;

        /* renamed from: e */
        C1499u f6303e;

        /* renamed from: f */
        C1479j f6304f;

        /* renamed from: g */
        String f6305g;

        /* renamed from: h */
        int f6306h = 4;

        /* renamed from: i */
        int f6307i = 0;

        /* renamed from: j */
        int f6308j = Integer.MAX_VALUE;

        /* renamed from: k */
        int f6309k = 20;

        /* renamed from: a */
        public C1419b mo6867a() {
            return new C1419b(this);
        }
    }

    /* renamed from: androidx.work.b$c */
    /* compiled from: Configuration */
    public interface C1422c {
        /* renamed from: a */
        C1419b mo6868a();
    }

    C1419b(C1421b bVar) {
        Executor executor = bVar.f6299a;
        if (executor == null) {
            this.f6284a = m7533a(false);
        } else {
            this.f6284a = executor;
        }
        Executor executor2 = bVar.f6302d;
        if (executor2 == null) {
            this.f6295l = true;
            this.f6285b = m7533a(true);
        } else {
            this.f6295l = false;
            this.f6285b = executor2;
        }
        C1506z zVar = bVar.f6300b;
        if (zVar == null) {
            this.f6286c = C1506z.m7824c();
        } else {
            this.f6286c = zVar;
        }
        C1481l lVar = bVar.f6301c;
        if (lVar == null) {
            this.f6287d = C1481l.m7767c();
        } else {
            this.f6287d = lVar;
        }
        C1499u uVar = bVar.f6303e;
        if (uVar == null) {
            this.f6288e = new C5883a();
        } else {
            this.f6288e = uVar;
        }
        this.f6291h = bVar.f6306h;
        this.f6292i = bVar.f6307i;
        this.f6293j = bVar.f6308j;
        this.f6294k = bVar.f6309k;
        this.f6289f = bVar.f6304f;
        this.f6290g = bVar.f6305g;
    }

    /* renamed from: a */
    private Executor m7533a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m7534b(z));
    }

    /* renamed from: b */
    private ThreadFactory m7534b(boolean z) {
        return new C1420a(z);
    }

    /* renamed from: c */
    public String mo6855c() {
        return this.f6290g;
    }

    /* renamed from: d */
    public C1479j mo6856d() {
        return this.f6289f;
    }

    /* renamed from: e */
    public Executor mo6857e() {
        return this.f6284a;
    }

    /* renamed from: f */
    public C1481l mo6858f() {
        return this.f6287d;
    }

    /* renamed from: g */
    public int mo6859g() {
        return this.f6293j;
    }

    /* renamed from: h */
    public int mo6860h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f6294k / 2;
        }
        return this.f6294k;
    }

    /* renamed from: i */
    public int mo6861i() {
        return this.f6292i;
    }

    /* renamed from: j */
    public int mo6862j() {
        return this.f6291h;
    }

    /* renamed from: k */
    public C1499u mo6863k() {
        return this.f6288e;
    }

    /* renamed from: l */
    public Executor mo6864l() {
        return this.f6285b;
    }

    /* renamed from: m */
    public C1506z mo6865m() {
        return this.f6286c;
    }
}
