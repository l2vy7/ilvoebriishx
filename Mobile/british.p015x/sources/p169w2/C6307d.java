package p169w2;

/* renamed from: w2.d */
/* compiled from: RequestCoordinator */
public interface C6307d {

    /* renamed from: w2.d$a */
    /* compiled from: RequestCoordinator */
    public enum C6308a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: b */
        private final boolean f26033b;

        private C6308a(boolean z) {
            this.f26033b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo24073d() {
            return this.f26033b;
        }
    }

    /* renamed from: a */
    void mo24058a(C6306c cVar);

    /* renamed from: b */
    boolean mo24059b();

    /* renamed from: c */
    C6307d mo24060c();

    /* renamed from: f */
    boolean mo24064f(C6306c cVar);

    /* renamed from: h */
    boolean mo24066h(C6306c cVar);

    /* renamed from: j */
    boolean mo24069j(C6306c cVar);

    /* renamed from: k */
    void mo24070k(C6306c cVar);
}
