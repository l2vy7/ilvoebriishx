package p170x;

import p165w.C6243d;
import p165w.C6246e;

/* renamed from: x.m */
/* compiled from: WidgetRun */
public abstract class C6333m implements C6321d {

    /* renamed from: a */
    public int f26137a;

    /* renamed from: b */
    C6246e f26138b;

    /* renamed from: c */
    C6330k f26139c;

    /* renamed from: d */
    protected C6246e.C6248b f26140d;

    /* renamed from: e */
    C6325g f26141e = new C6325g(this);

    /* renamed from: f */
    public int f26142f = 0;

    /* renamed from: g */
    boolean f26143g = false;

    /* renamed from: h */
    public C6323f f26144h = new C6323f(this);

    /* renamed from: i */
    public C6323f f26145i = new C6323f(this);

    /* renamed from: j */
    protected C6335b f26146j = C6335b.NONE;

    /* renamed from: x.m$a */
    /* compiled from: WidgetRun */
    static /* synthetic */ class C6334a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26147a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                w.d$b[] r0 = p165w.C6243d.C6245b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26147a = r0
                w.d$b r1 = p165w.C6243d.C6245b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26147a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.d$b r1 = p165w.C6243d.C6245b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26147a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.d$b r1 = p165w.C6243d.C6245b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26147a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w.d$b r1 = p165w.C6243d.C6245b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26147a     // Catch:{ NoSuchFieldError -> 0x003e }
                w.d$b r1 = p165w.C6243d.C6245b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p170x.C6333m.C6334a.<clinit>():void");
        }
    }

    /* renamed from: x.m$b */
    /* compiled from: WidgetRun */
    enum C6335b {
        NONE,
        START,
        END,
        CENTER
    }

    public C6333m(C6246e eVar) {
        this.f26138b = eVar;
    }

    /* renamed from: l */
    private void m27891l(int i, int i2) {
        int i3;
        int i4 = this.f26137a;
        if (i4 == 0) {
            this.f26141e.mo24099d(mo24109g(i2, i));
        } else if (i4 == 1) {
            this.f26141e.mo24099d(Math.min(mo24109g(this.f26141e.f26123m, i), i2));
        } else if (i4 == 2) {
            C6246e H = this.f26138b.mo23795H();
            if (H != null) {
                C6325g gVar = (i == 0 ? H.f25767e : H.f25769f).f26141e;
                if (gVar.f26111j) {
                    C6246e eVar = this.f26138b;
                    this.f26141e.mo24099d(mo24109g((int) ((((float) gVar.f26108g) * (i == 0 ? eVar.f25791q : eVar.f25797t)) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            C6246e eVar2 = this.f26138b;
            C6333m mVar = eVar2.f25767e;
            C6246e.C6248b bVar = mVar.f26140d;
            C6246e.C6248b bVar2 = C6246e.C6248b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && mVar.f26137a == 3) {
                C6331l lVar = eVar2.f25769f;
                if (lVar.f26140d == bVar2 && lVar.f26137a == 3) {
                    return;
                }
            }
            if (i == 0) {
                mVar = eVar2.f25769f;
            }
            if (mVar.f26141e.f26111j) {
                float u = eVar2.mo23849u();
                if (i == 1) {
                    i3 = (int) ((((float) mVar.f26141e.f26108g) / u) + 0.5f);
                } else {
                    i3 = (int) ((u * ((float) mVar.f26141e.f26108g)) + 0.5f);
                }
                this.f26141e.mo24099d(i3);
            }
        }
    }

    /* renamed from: a */
    public void mo24081a(C6321d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24107b(C6323f fVar, C6323f fVar2, int i) {
        fVar.f26113l.add(fVar2);
        fVar.f26107f = i;
        fVar2.f26112k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo24108c(C6323f fVar, C6323f fVar2, int i, C6325g gVar) {
        fVar.f26113l.add(fVar2);
        fVar.f26113l.add(this.f26141e);
        fVar.f26109h = i;
        fVar.f26110i = gVar;
        fVar2.f26112k.add(fVar);
        gVar.f26112k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo24082d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo24083e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo24084f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo24109g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C6246e eVar = this.f26138b;
            int i4 = eVar.f25789p;
            i3 = Math.max(eVar.f25787o, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C6246e eVar2 = this.f26138b;
            int i5 = eVar2.f25795s;
            int max = Math.max(eVar2.f25793r, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C6323f mo24110h(C6243d dVar) {
        C6243d dVar2 = dVar.f25712d;
        if (dVar2 == null) {
            return null;
        }
        C6246e eVar = dVar2.f25710b;
        int i = C6334a.f26147a[dVar2.f25711c.ordinal()];
        if (i == 1) {
            return eVar.f25767e.f26144h;
        }
        if (i == 2) {
            return eVar.f25767e.f26145i;
        }
        if (i == 3) {
            return eVar.f25769f.f26144h;
        }
        if (i == 4) {
            return eVar.f25769f.f26134k;
        }
        if (i != 5) {
            return null;
        }
        return eVar.f25769f.f26145i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C6323f mo24111i(C6243d dVar, int i) {
        C6243d dVar2 = dVar.f25712d;
        if (dVar2 == null) {
            return null;
        }
        C6246e eVar = dVar2.f25710b;
        C6333m mVar = i == 0 ? eVar.f25767e : eVar.f25769f;
        int i2 = C6334a.f26147a[dVar2.f25711c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f26145i;
        }
        return mVar.f26144h;
    }

    /* renamed from: j */
    public long mo24085j() {
        C6325g gVar = this.f26141e;
        if (gVar.f26111j) {
            return (long) gVar.f26108g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo24112k() {
        return this.f26143g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo24086m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24113n(C6321d dVar, C6243d dVar2, C6243d dVar3, int i) {
        float f;
        C6323f h = mo24110h(dVar2);
        C6323f h2 = mo24110h(dVar3);
        if (h.f26111j && h2.f26111j) {
            int c = h.f26108g + dVar2.mo23768c();
            int c2 = h2.f26108g - dVar3.mo23768c();
            int i2 = c2 - c;
            if (!this.f26141e.f26111j && this.f26140d == C6246e.C6248b.MATCH_CONSTRAINT) {
                m27891l(i, i2);
            }
            C6325g gVar = this.f26141e;
            if (gVar.f26111j) {
                if (gVar.f26108g == i2) {
                    this.f26144h.mo24099d(c);
                    this.f26145i.mo24099d(c2);
                    return;
                }
                C6246e eVar = this.f26138b;
                if (i == 0) {
                    f = eVar.mo23855x();
                } else {
                    f = eVar.mo23803L();
                }
                if (h == h2) {
                    c = h.f26108g;
                    c2 = h2.f26108g;
                    f = 0.5f;
                }
                this.f26144h.mo24099d((int) (((float) c) + 0.5f + (((float) ((c2 - c) - this.f26141e.f26108g)) * f)));
                this.f26145i.mo24099d(this.f26144h.f26108g + this.f26141e.f26108g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo24114o(C6321d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo24115p(C6321d dVar) {
    }
}
