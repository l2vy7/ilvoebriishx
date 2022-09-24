package p307f9;

import java.io.IOException;
import p308g8.C12716c;
import p308g8.C12722f;
import p308g8.C12727k;
import p308g8.C12730n;
import p309g9.C12746d;
import p309g9.C12749g;
import p311h9.C12770i;
import p311h9.C12780s;
import p313i9.C12790d;
import p317k9.C12821b;

/* renamed from: f9.b */
/* compiled from: AbstractMessageWriter */
public abstract class C12699b implements C12746d {

    /* renamed from: a */
    protected final C12749g f55352a;

    /* renamed from: b */
    protected final C12821b f55353b;

    /* renamed from: c */
    protected final C12780s f55354c;

    public C12699b(C12749g gVar, C12780s sVar, C12790d dVar) {
        if (gVar != null) {
            this.f55352a = gVar;
            this.f55353b = new C12821b(128);
            this.f55354c = sVar == null ? C12770i.f55448a : sVar;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    /* renamed from: a */
    public void mo47708a(C12730n nVar) throws IOException, C12727k {
        if (nVar != null) {
            mo47709b(nVar);
            C12722f n = nVar.mo47799n();
            while (n.hasNext()) {
                this.f55352a.mo43662b(this.f55354c.mo47868b(this.f55353b, (C12716c) n.next()));
            }
            this.f55353b.mo47973j();
            this.f55352a.mo43662b(this.f55353b);
            return;
        }
        throw new IllegalArgumentException("HTTP message may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo47709b(C12730n nVar) throws IOException;
}
