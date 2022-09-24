package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p168w1.C6283p;

/* renamed from: androidx.work.y */
/* compiled from: WorkRequest */
public abstract class C1504y {

    /* renamed from: a */
    private UUID f6521a;

    /* renamed from: b */
    private C6283p f6522b;

    /* renamed from: c */
    private Set<String> f6523c;

    /* renamed from: androidx.work.y$a */
    /* compiled from: WorkRequest */
    public static abstract class C1505a<B extends C1505a<?, ?>, W extends C1504y> {

        /* renamed from: a */
        boolean f6524a = false;

        /* renamed from: b */
        UUID f6525b = UUID.randomUUID();

        /* renamed from: c */
        C6283p f6526c;

        /* renamed from: d */
        Set<String> f6527d = new HashSet();

        /* renamed from: e */
        Class<? extends ListenableWorker> f6528e;

        C1505a(Class<? extends ListenableWorker> cls) {
            this.f6528e = cls;
            this.f6526c = new C6283p(this.f6525b.toString(), cls.getName());
            mo7052a(cls.getName());
        }

        /* renamed from: a */
        public final B mo7052a(String str) {
            this.f6527d.add(str);
            return mo7019d();
        }

        /* renamed from: b */
        public final W mo7053b() {
            W c = mo7018c();
            C1423c cVar = this.f6526c.f25950j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && cVar.mo6873e()) || cVar.mo6875f() || cVar.mo6876g() || (i >= 23 && cVar.mo6877h());
            if (!this.f6526c.f25957q || !z) {
                this.f6525b = UUID.randomUUID();
                C6283p pVar = new C6283p(this.f6526c);
                this.f6526c = pVar;
                pVar.f25941a = this.f6525b.toString();
                return c;
            }
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract W mo7018c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract B mo7019d();

        /* renamed from: e */
        public final B mo7054e(C1423c cVar) {
            this.f6526c.f25950j = cVar;
            return mo7019d();
        }

        /* renamed from: f */
        public B mo7055f(long j, TimeUnit timeUnit) {
            this.f6526c.f25947g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f6526c.f25947g) {
                return mo7019d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        /* renamed from: g */
        public final B mo7056g(C1427e eVar) {
            this.f6526c.f25945e = eVar;
            return mo7019d();
        }
    }

    protected C1504y(UUID uuid, C6283p pVar, Set<String> set) {
        this.f6521a = uuid;
        this.f6522b = pVar;
        this.f6523c = set;
    }

    /* renamed from: a */
    public String mo7049a() {
        return this.f6521a.toString();
    }

    /* renamed from: b */
    public Set<String> mo7050b() {
        return this.f6523c;
    }

    /* renamed from: c */
    public C6283p mo7051c() {
        return this.f6522b;
    }
}
