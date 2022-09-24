package p267y6;

import p215h7.C10580a;
import p215h7.C10581b;

/* renamed from: y6.b0 */
/* compiled from: OptionalProvider */
class C11112b0<T> implements C10581b<T> {

    /* renamed from: c */
    private static final C10580a<Object> f50078c = C12971z.f55704a;

    /* renamed from: d */
    private static final C10581b<Object> f50079d = C12961a0.f55690a;

    /* renamed from: a */
    private C10580a<T> f50080a;

    /* renamed from: b */
    private volatile C10581b<T> f50081b;

    private C11112b0(C10580a<T> aVar, C10581b<T> bVar) {
        this.f50080a = aVar;
        this.f50081b = bVar;
    }

    /* renamed from: c */
    static <T> C11112b0<T> m49610c() {
        return new C11112b0<>(f50078c, f50079d);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m49611d(C10581b bVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ Object m49612e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo43391f(C10581b<T> bVar) {
        C10580a<T> aVar;
        if (this.f50081b == f50079d) {
            synchronized (this) {
                aVar = this.f50080a;
                this.f50080a = null;
                this.f50081b = bVar;
            }
            aVar.mo42696a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public T get() {
        return this.f50081b.get();
    }
}
