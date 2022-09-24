package p170x;

import java.util.ArrayList;
import java.util.List;

/* renamed from: x.f */
/* compiled from: DependencyNode */
public class C6323f implements C6321d {

    /* renamed from: a */
    public C6321d f26102a = null;

    /* renamed from: b */
    public boolean f26103b = false;

    /* renamed from: c */
    public boolean f26104c = false;

    /* renamed from: d */
    C6333m f26105d;

    /* renamed from: e */
    C6324a f26106e = C6324a.UNKNOWN;

    /* renamed from: f */
    int f26107f;

    /* renamed from: g */
    public int f26108g;

    /* renamed from: h */
    int f26109h = 1;

    /* renamed from: i */
    C6325g f26110i = null;

    /* renamed from: j */
    public boolean f26111j = false;

    /* renamed from: k */
    List<C6321d> f26112k = new ArrayList();

    /* renamed from: l */
    List<C6323f> f26113l = new ArrayList();

    /* renamed from: x.f$a */
    /* compiled from: DependencyNode */
    enum C6324a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C6323f(C6333m mVar) {
        this.f26105d = mVar;
    }

    /* renamed from: a */
    public void mo24081a(C6321d dVar) {
        for (C6323f fVar : this.f26113l) {
            if (!fVar.f26111j) {
                return;
            }
        }
        this.f26104c = true;
        C6321d dVar2 = this.f26102a;
        if (dVar2 != null) {
            dVar2.mo24081a(this);
        }
        if (this.f26103b) {
            this.f26105d.mo24081a(this);
            return;
        }
        C6323f fVar2 = null;
        int i = 0;
        for (C6323f next : this.f26113l) {
            if (!(next instanceof C6325g)) {
                i++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f26111j) {
            C6325g gVar = this.f26110i;
            if (gVar != null) {
                if (gVar.f26111j) {
                    this.f26107f = this.f26109h * gVar.f26108g;
                } else {
                    return;
                }
            }
            mo24099d(fVar2.f26108g + this.f26107f);
        }
        C6321d dVar3 = this.f26102a;
        if (dVar3 != null) {
            dVar3.mo24081a(this);
        }
    }

    /* renamed from: b */
    public void mo24097b(C6321d dVar) {
        this.f26112k.add(dVar);
        if (this.f26111j) {
            dVar.mo24081a(dVar);
        }
    }

    /* renamed from: c */
    public void mo24098c() {
        this.f26113l.clear();
        this.f26112k.clear();
        this.f26111j = false;
        this.f26108g = 0;
        this.f26104c = false;
        this.f26103b = false;
    }

    /* renamed from: d */
    public void mo24099d(int i) {
        if (!this.f26111j) {
            this.f26111j = true;
            this.f26108g = i;
            for (C6321d next : this.f26112k) {
                next.mo24081a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26105d.f26138b.mo23845s());
        sb.append(":");
        sb.append(this.f26106e);
        sb.append("(");
        sb.append(this.f26111j ? Integer.valueOf(this.f26108g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f26113l.size());
        sb.append(":d=");
        sb.append(this.f26112k.size());
        sb.append(">");
        return sb.toString();
    }
}
