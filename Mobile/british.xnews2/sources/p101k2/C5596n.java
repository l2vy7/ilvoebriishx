package p101k2;

import java.util.Collections;
import java.util.List;
import p004a3.C0065j;
import p064d2.C5159f;
import p064d2.C5163h;
import p070e2.C5208d;

/* renamed from: k2.n */
/* compiled from: ModelLoader */
public interface C5596n<Model, Data> {

    /* renamed from: k2.n$a */
    /* compiled from: ModelLoader */
    public static class C5597a<Data> {

        /* renamed from: a */
        public final C5159f f24127a;

        /* renamed from: b */
        public final List<C5159f> f24128b;

        /* renamed from: c */
        public final C5208d<Data> f24129c;

        public C5597a(C5159f fVar, C5208d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public C5597a(C5159f fVar, List<C5159f> list, C5208d<Data> dVar) {
            this.f24127a = (C5159f) C0065j.m247d(fVar);
            this.f24128b = (List) C0065j.m247d(list);
            this.f24129c = (C5208d) C0065j.m247d(dVar);
        }
    }

    /* renamed from: a */
    C5597a<Data> mo22113a(Model model, int i, int i2, C5163h hVar);

    /* renamed from: b */
    boolean mo22114b(Model model);
}
