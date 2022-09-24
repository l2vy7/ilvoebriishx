package p081g2;

import java.io.File;
import java.util.List;
import p064d2.C5154a;
import p064d2.C5159f;
import p070e2.C5208d;
import p081g2.C5278f;
import p101k2.C5596n;

/* renamed from: g2.w */
/* compiled from: ResourceCacheGenerator */
class C5324w implements C5278f, C5208d.C5209a<Object> {

    /* renamed from: b */
    private final C5278f.C5279a f23490b;

    /* renamed from: c */
    private final C5280g<?> f23491c;

    /* renamed from: d */
    private int f23492d;

    /* renamed from: e */
    private int f23493e = -1;

    /* renamed from: f */
    private C5159f f23494f;

    /* renamed from: g */
    private List<C5596n<File, ?>> f23495g;

    /* renamed from: h */
    private int f23496h;

    /* renamed from: i */
    private volatile C5596n.C5597a<?> f23497i;

    /* renamed from: j */
    private File f23498j;

    /* renamed from: k */
    private C5325x f23499k;

    C5324w(C5280g<?> gVar, C5278f.C5279a aVar) {
        this.f23491c = gVar;
        this.f23490b = aVar;
    }

    /* renamed from: b */
    private boolean m23998b() {
        return this.f23496h < this.f23495g.size();
    }

    /* renamed from: a */
    public boolean mo21495a() {
        List<C5159f> c = this.f23491c.mo21504c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f23491c.mo21514m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f23495g == null || !m23998b()) {
                    int i = this.f23493e + 1;
                    this.f23493e = i;
                    if (i >= m.size()) {
                        int i2 = this.f23492d + 1;
                        this.f23492d = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f23493e = 0;
                    }
                    C5159f fVar = c.get(this.f23492d);
                    Class cls = m.get(this.f23493e);
                    C5159f fVar2 = fVar;
                    this.f23499k = new C5325x(this.f23491c.mo21503b(), fVar2, this.f23491c.mo21516o(), this.f23491c.mo21520s(), this.f23491c.mo21507f(), this.f23491c.mo21519r(cls), cls, this.f23491c.mo21512k());
                    File a = this.f23491c.mo21505d().mo21909a(this.f23499k);
                    this.f23498j = a;
                    if (a != null) {
                        this.f23494f = fVar;
                        this.f23495g = this.f23491c.mo21511j(a);
                        this.f23496h = 0;
                    }
                } else {
                    this.f23497i = null;
                    while (!z && m23998b()) {
                        List<C5596n<File, ?>> list = this.f23495g;
                        int i3 = this.f23496h;
                        this.f23496h = i3 + 1;
                        this.f23497i = list.get(i3).mo22113a(this.f23498j, this.f23491c.mo21520s(), this.f23491c.mo21507f(), this.f23491c.mo21512k());
                        if (this.f23497i != null && this.f23491c.mo21521t(this.f23497i.f24129c.mo21422a())) {
                            this.f23497i.f24129c.mo21431e(this.f23491c.mo21513l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f23491c.mo21518q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f23491c.mo21510i() + " to " + this.f23491c.mo21518q());
        }
    }

    /* renamed from: c */
    public void mo21438c(Exception exc) {
        this.f23490b.mo21501j(this.f23499k, exc, this.f23497i.f24129c, C5154a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C5596n.C5597a<?> aVar = this.f23497i;
        if (aVar != null) {
            aVar.f24129c.cancel();
        }
    }

    /* renamed from: f */
    public void mo21439f(Object obj) {
        this.f23490b.mo21500i(this.f23494f, obj, this.f23497i.f24129c, C5154a.RESOURCE_DISK_CACHE, this.f23499k);
    }
}
