package p273b9;

import com.google.android.exoplayer2.C6540C;
import p308g8.C12736t;
import p313i9.C12789c;
import p313i9.C12790d;
import p313i9.C12791e;
import p313i9.C12792f;
import p315j9.C12808b;
import p315j9.C12815i;
import p315j9.C12816j;
import p315j9.C12817k;
import p315j9.C12818l;
import p317k9.C12826g;
import p320n8.C12835a;
import p320n8.C12836b;
import p320n8.C12837c;
import p320n8.C12838d;
import p320n8.C12839e;
import p320n8.C12840f;
import p320n8.C12841g;
import p320n8.C12842h;
import p322p8.C12850b;

/* renamed from: b9.h */
/* compiled from: DefaultHttpClient */
public class C11188h extends C11182b {
    public C11188h(C12790d dVar) {
        super((C12850b) null, dVar);
    }

    /* renamed from: N */
    public static void m49925N(C12790d dVar) {
        C12791e.m54283f(dVar, C12736t.f55407g);
        C12791e.m54281d(dVar, C6540C.ISO88591_NAME);
        C12789c.m54269k(dVar, true);
        C12789c.m54268j(dVar, 8192);
        C12826g c = C12826g.m54383c("org.apache.http.client", C11188h.class.getClassLoader());
        String b = c != null ? c.mo47982b() : "UNAVAILABLE";
        C12791e.m54282e(dVar, "Apache-HttpClient/" + b + " (java 1.5)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C12790d mo43529l() {
        C12792f fVar = new C12792f();
        m49925N(fVar);
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C12808b mo43530m() {
        C12808b bVar = new C12808b();
        bVar.mo47935c(new C12838d());
        bVar.mo47935c(new C12815i());
        bVar.mo47935c(new C12817k());
        bVar.mo47935c(new C12837c());
        bVar.mo47935c(new C12818l());
        bVar.mo47935c(new C12816j());
        bVar.mo47935c(new C12835a());
        bVar.mo47937d(new C12842h());
        bVar.mo47935c(new C12836b());
        bVar.mo47937d(new C12841g());
        bVar.mo47935c(new C12840f());
        bVar.mo47935c(new C12839e());
        return bVar;
    }

    public C11188h() {
        super((C12850b) null, (C12790d) null);
    }
}
