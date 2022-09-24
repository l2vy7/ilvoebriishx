package p336w8;

import java.io.IOException;
import p308g8.C12716c;
import p308g8.C12725i;
import p311h9.C12763b;

/* renamed from: w8.a */
/* compiled from: AbstractHttpEntity */
public abstract class C12942a implements C12725i {

    /* renamed from: b */
    protected C12716c f55648b;

    /* renamed from: c */
    protected C12716c f55649c;

    /* renamed from: d */
    protected boolean f55650d;

    protected C12942a() {
    }

    /* renamed from: c */
    public void mo48108c(boolean z) {
        this.f55650d = z;
    }

    /* renamed from: d */
    public void mo48109d(C12716c cVar) {
        this.f55649c = cVar;
    }

    /* renamed from: g */
    public void mo48110g(C12716c cVar) {
        this.f55648b = cVar;
    }

    public C12716c getContentType() {
        return this.f55648b;
    }

    /* renamed from: h */
    public void mo48111h(String str) {
        mo48110g(str != null ? new C12763b(RtspHeaders.CONTENT_TYPE, str) : null);
    }

    /* renamed from: l */
    public C12716c mo47779l() {
        return this.f55649c;
    }

    /* renamed from: o */
    public boolean mo47780o() {
        return this.f55650d;
    }

    /* renamed from: s */
    public void mo43578s() throws IOException {
    }
}
