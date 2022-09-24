package p101k2;

import com.bumptech.glide.C3325f;
import p064d2.C5154a;
import p064d2.C5163h;
import p070e2.C5208d;
import p101k2.C5596n;
import p183z2.C6445b;

/* renamed from: k2.v */
/* compiled from: UnitModelLoader */
public class C5618v<Model> implements C5596n<Model, Model> {

    /* renamed from: a */
    private static final C5618v<?> f24160a = new C5618v<>();

    /* renamed from: k2.v$a */
    /* compiled from: UnitModelLoader */
    public static class C5619a<Model> implements C5598o<Model, Model> {

        /* renamed from: a */
        private static final C5619a<?> f24161a = new C5619a<>();

        /* renamed from: b */
        public static <T> C5619a<T> m24907b() {
            return f24161a;
        }

        /* renamed from: a */
        public C5596n<Model, Model> mo22118a(C5604r rVar) {
            return C5618v.m24904c();
        }
    }

    /* renamed from: k2.v$b */
    /* compiled from: UnitModelLoader */
    private static class C5620b<Model> implements C5208d<Model> {

        /* renamed from: b */
        private final Model f24162b;

        C5620b(Model model) {
            this.f24162b = model;
        }

        /* renamed from: a */
        public Class<Model> mo21422a() {
            return this.f24162b.getClass();
        }

        /* renamed from: b */
        public void mo21427b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C5154a mo21430d() {
            return C5154a.LOCAL;
        }

        /* renamed from: e */
        public void mo21431e(C3325f fVar, C5208d.C5209a<? super Model> aVar) {
            aVar.mo21439f(this.f24162b);
        }
    }

    /* renamed from: c */
    public static <T> C5618v<T> m24904c() {
        return f24160a;
    }

    /* renamed from: a */
    public C5596n.C5597a<Model> mo22113a(Model model, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(model), new C5620b(model));
    }

    /* renamed from: b */
    public boolean mo22114b(Model model) {
        return true;
    }
}
