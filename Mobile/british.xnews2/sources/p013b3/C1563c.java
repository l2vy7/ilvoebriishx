package p013b3;

/* renamed from: b3.c */
/* compiled from: StateVerifier */
public abstract class C1563c {

    /* renamed from: b3.c$b */
    /* compiled from: StateVerifier */
    private static class C1565b extends C1563c {

        /* renamed from: a */
        private volatile boolean f6655a;

        C1565b() {
            super();
        }

        /* renamed from: b */
        public void mo7113b(boolean z) {
            this.f6655a = z;
        }

        /* renamed from: c */
        public void mo7114c() {
            if (this.f6655a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static C1563c m7996a() {
        return new C1565b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo7113b(boolean z);

    /* renamed from: c */
    public abstract void mo7114c();

    private C1563c() {
    }
}
