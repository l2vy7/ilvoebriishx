package p107l2;

import java.io.InputStream;
import p065d2.C5160g;
import p065d2.C5163h;
import p071e2.C5218j;
import p102k2.C5582g;
import p102k2.C5593m;
import p102k2.C5596n;
import p102k2.C5598o;
import p102k2.C5604r;

/* renamed from: l2.a */
/* compiled from: HttpGlideUrlLoader */
public class C5652a implements C5596n<C5582g, InputStream> {

    /* renamed from: b */
    public static final C5160g<Integer> f24219b = C5160g.m23475f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C5593m<C5582g, C5582g> f24220a;

    /* renamed from: l2.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C5653a implements C5598o<C5582g, InputStream> {

        /* renamed from: a */
        private final C5593m<C5582g, C5582g> f24221a = new C5593m<>(500);

        /* renamed from: a */
        public C5596n<C5582g, InputStream> mo22118a(C5604r rVar) {
            return new C5652a(this.f24221a);
        }
    }

    public C5652a(C5593m<C5582g, C5582g> mVar) {
        this.f24220a = mVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<InputStream> mo22113a(C5582g gVar, int i, int i2, C5163h hVar) {
        C5593m<C5582g, C5582g> mVar = this.f24220a;
        if (mVar != null) {
            C5582g a = mVar.mo22158a(gVar, 0, 0);
            if (a == null) {
                this.f24220a.mo22159b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new C5596n.C5597a<>(gVar, new C5218j(gVar, ((Integer) hVar.mo21340c(f24219b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo22114b(C5582g gVar) {
        return true;
    }
}
