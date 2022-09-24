package androidx.lifecycle;

/* renamed from: androidx.lifecycle.r */
/* compiled from: ViewModelProvider */
public class C0790r {

    /* renamed from: a */
    private final C0791a f3863a;

    /* renamed from: b */
    private final C0794s f3864b;

    /* renamed from: androidx.lifecycle.r$a */
    /* compiled from: ViewModelProvider */
    public interface C0791a {
        /* renamed from: a */
        <T extends C0789q> T mo3803a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.r$b */
    /* compiled from: ViewModelProvider */
    static abstract class C0792b extends C0793c implements C0791a {
        C0792b() {
        }

        /* renamed from: a */
        public <T extends C0789q> T mo3803a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends C0789q> T mo4026c(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.r$c */
    /* compiled from: ViewModelProvider */
    static class C0793c {
        C0793c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4027b(C0789q qVar) {
        }
    }

    public C0790r(C0794s sVar, C0791a aVar) {
        this.f3863a = aVar;
        this.f3864b = sVar;
    }

    /* renamed from: a */
    public <T extends C0789q> T mo4024a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4025b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C0789q> T mo4025b(String str, Class<T> cls) {
        T t;
        T b = this.f3864b.mo4029b(str);
        if (cls.isInstance(b)) {
            C0791a aVar = this.f3863a;
            if (aVar instanceof C0793c) {
                ((C0793c) aVar).mo4027b(b);
            }
            return b;
        }
        C0791a aVar2 = this.f3863a;
        if (aVar2 instanceof C0792b) {
            t = ((C0792b) aVar2).mo4026c(str, cls);
        } else {
            t = aVar2.mo3803a(cls);
        }
        this.f3864b.mo4031d(str, t);
        return t;
    }
}
