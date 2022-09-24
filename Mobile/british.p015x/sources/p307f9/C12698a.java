package p307f9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p308g8.C12716c;
import p308g8.C12727k;
import p308g8.C12730n;
import p308g8.C12740x;
import p308g8.C12741y;
import p309g9.C12745c;
import p309g9.C12748f;
import p311h9.C12771j;
import p311h9.C12781t;
import p313i9.C12790d;
import p317k9.C12821b;

/* renamed from: f9.a */
/* compiled from: AbstractMessageParser */
public abstract class C12698a implements C12745c {

    /* renamed from: a */
    private final C12748f f55345a;

    /* renamed from: b */
    private final int f55346b;

    /* renamed from: c */
    private final int f55347c;

    /* renamed from: d */
    private final List f55348d;

    /* renamed from: e */
    protected final C12781t f55349e;

    /* renamed from: f */
    private int f55350f;

    /* renamed from: g */
    private C12730n f55351g;

    public C12698a(C12748f fVar, C12781t tVar, C12790d dVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (dVar != null) {
            this.f55345a = fVar;
            this.f55346b = dVar.mo47928b("http.connection.max-header-count", -1);
            this.f55347c = dVar.mo47928b("http.connection.max-line-length", -1);
            this.f55349e = tVar == null ? C12771j.f55449b : tVar;
            this.f55348d = new ArrayList();
            this.f55350f = 0;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* renamed from: c */
    public static C12716c[] m54016c(C12748f fVar, int i, int i2, C12781t tVar) throws C12727k, IOException {
        if (tVar == null) {
            tVar = C12771j.f55449b;
        }
        return m54017d(fVar, i, i2, tVar, new ArrayList());
    }

    /* renamed from: d */
    public static C12716c[] m54017d(C12748f fVar, int i, int i2, C12781t tVar, List list) throws C12727k, IOException {
        int i3;
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (tVar == null) {
            throw new IllegalArgumentException("Line parser may not be null");
        } else if (list != null) {
            C12821b bVar = null;
            C12821b bVar2 = null;
            while (true) {
                if (bVar == null) {
                    bVar = new C12821b(64);
                } else {
                    bVar.mo47973j();
                }
                i3 = 0;
                if (fVar.mo43655a(bVar) == -1 || bVar.mo47978p() < 1) {
                    C12716c[] cVarArr = new C12716c[list.size()];
                } else {
                    if ((bVar.mo47972i(0) == ' ' || bVar.mo47972i(0) == 9) && bVar2 != null) {
                        while (i3 < bVar.mo47978p() && ((r3 = bVar.mo47972i(i3)) == ' ' || r3 == 9)) {
                            i3++;
                        }
                        if (i2 <= 0 || ((bVar2.mo47978p() + 1) + bVar.mo47978p()) - i3 <= i2) {
                            bVar2.mo47964a(' ');
                            bVar2.mo47968e(bVar, i3, bVar.mo47978p() - i3);
                        } else {
                            throw new IOException("Maximum line length limit exceeded");
                        }
                    } else {
                        list.add(bVar);
                        bVar2 = bVar;
                        bVar = null;
                    }
                    if (i > 0 && list.size() >= i) {
                        throw new IOException("Maximum header count exceeded");
                    }
                }
            }
            C12716c[] cVarArr2 = new C12716c[list.size()];
            while (i3 < list.size()) {
                try {
                    cVarArr2[i3] = tVar.mo47876a((C12821b) list.get(i3));
                    i3++;
                } catch (C12740x e) {
                    throw new C12741y(e.getMessage());
                }
            }
            return cVarArr2;
        } else {
            throw new IllegalArgumentException("Header line list may not be null");
        }
    }

    /* renamed from: a */
    public C12730n mo47707a() throws IOException, C12727k {
        int i = this.f55350f;
        if (i == 0) {
            try {
                this.f55351g = mo43654b(this.f55345a);
                this.f55350f = 1;
            } catch (C12740x e) {
                throw new C12741y(e.getMessage(), e);
            }
        } else if (i != 1) {
            throw new IllegalStateException("Inconsistent parser state");
        }
        this.f55351g.mo47796i(m54017d(this.f55345a, this.f55346b, this.f55347c, this.f55349e, this.f55348d));
        C12730n nVar = this.f55351g;
        this.f55351g = null;
        this.f55348d.clear();
        this.f55350f = 0;
        return nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C12730n mo43654b(C12748f fVar) throws IOException, C12727k, C12740x;
}
