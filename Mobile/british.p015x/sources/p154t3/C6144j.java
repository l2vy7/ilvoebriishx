package p154t3;

import java.util.concurrent.Executor;
import p165v3.C6237b;
import p165v3.C6239d;

/* renamed from: t3.j */
/* compiled from: ExecutionModule_ExecutorFactory */
public final class C6144j implements C6237b<Executor> {

    /* renamed from: t3.j$a */
    /* compiled from: ExecutionModule_ExecutorFactory */
    private static final class C6145a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6144j f25424a = new C6144j();
    }

    /* renamed from: a */
    public static C6144j m26975a() {
        return C6145a.f25424a;
    }

    /* renamed from: b */
    public static Executor m26976b() {
        return (Executor) C6239d.m27333c(C6143i.m26974a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m26976b();
    }
}
