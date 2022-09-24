package p081g2;

import java.io.File;
import java.util.List;
import p064d2.C5154a;
import p064d2.C5159f;
import p070e2.C5208d;
import p081g2.C5278f;
import p101k2.C5596n;

/* renamed from: g2.c */
/* compiled from: DataCacheGenerator */
class C5275c implements C5278f, C5208d.C5209a<Object> {

    /* renamed from: b */
    private final List<C5159f> f23301b;

    /* renamed from: c */
    private final C5280g<?> f23302c;

    /* renamed from: d */
    private final C5278f.C5279a f23303d;

    /* renamed from: e */
    private int f23304e;

    /* renamed from: f */
    private C5159f f23305f;

    /* renamed from: g */
    private List<C5596n<File, ?>> f23306g;

    /* renamed from: h */
    private int f23307h;

    /* renamed from: i */
    private volatile C5596n.C5597a<?> f23308i;

    /* renamed from: j */
    private File f23309j;

    C5275c(C5280g<?> gVar, C5278f.C5279a aVar) {
        this(gVar.mo21504c(), gVar, aVar);
    }

    /* renamed from: b */
    private boolean m23805b() {
        return this.f23307h < this.f23306g.size();
    }

    /* renamed from: a */
    public boolean mo21495a() {
        while (true) {
            boolean z = false;
            if (this.f23306g == null || !m23805b()) {
                int i = this.f23304e + 1;
                this.f23304e = i;
                if (i >= this.f23301b.size()) {
                    return false;
                }
                C5159f fVar = this.f23301b.get(this.f23304e);
                File a = this.f23302c.mo21505d().mo21909a(new C5276d(fVar, this.f23302c.mo21516o()));
                this.f23309j = a;
                if (a != null) {
                    this.f23305f = fVar;
                    this.f23306g = this.f23302c.mo21511j(a);
                    this.f23307h = 0;
                }
            } else {
                this.f23308i = null;
                while (!z && m23805b()) {
                    List<C5596n<File, ?>> list = this.f23306g;
                    int i2 = this.f23307h;
                    this.f23307h = i2 + 1;
                    this.f23308i = list.get(i2).mo22113a(this.f23309j, this.f23302c.mo21520s(), this.f23302c.mo21507f(), this.f23302c.mo21512k());
                    if (this.f23308i != null && this.f23302c.mo21521t(this.f23308i.f24129c.mo21422a())) {
                        this.f23308i.f24129c.mo21431e(this.f23302c.mo21513l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: c */
    public void mo21438c(Exception exc) {
        this.f23303d.mo21501j(this.f23305f, exc, this.f23308i.f24129c, C5154a.DATA_DISK_CACHE);
    }

    public void cancel() {
        C5596n.C5597a<?> aVar = this.f23308i;
        if (aVar != null) {
            aVar.f24129c.cancel();
        }
    }

    /* renamed from: f */
    public void mo21439f(Object obj) {
        this.f23303d.mo21500i(this.f23305f, obj, this.f23308i.f24129c, C5154a.DATA_DISK_CACHE, this.f23305f);
    }

    C5275c(List<C5159f> list, C5280g<?> gVar, C5278f.C5279a aVar) {
        this.f23304e = -1;
        this.f23301b = list;
        this.f23302c = gVar;
        this.f23303d = aVar;
    }
}
