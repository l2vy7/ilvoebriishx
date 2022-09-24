package p314j9;

/* renamed from: j9.c */
/* compiled from: DefaultedHttpContext */
public final class C12809c implements C12811e {

    /* renamed from: b */
    private final C12811e f55483b;

    /* renamed from: c */
    private final C12811e f55484c;

    public C12809c(C12811e eVar, C12811e eVar2) {
        if (eVar != null) {
            this.f55483b = eVar;
            this.f55484c = eVar2;
            return;
        }
        throw new IllegalArgumentException("HTTP context may not be null");
    }

    /* renamed from: b */
    public Object mo43606b(String str) {
        Object b = this.f55483b.mo43606b(str);
        return b == null ? this.f55484c.mo43606b(str) : b;
    }

    /* renamed from: p */
    public void mo43615p(String str, Object obj) {
        this.f55483b.mo43615p(str, obj);
    }
}
