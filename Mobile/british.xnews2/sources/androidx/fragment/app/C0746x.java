package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p089i0.C5421b;
import p150t0.C6093b;

/* renamed from: androidx.fragment.app.x */
/* compiled from: SpecialEffectsController */
abstract class C0746x {

    /* renamed from: a */
    private final ViewGroup f3763a;

    /* renamed from: b */
    final ArrayList<C0751e> f3764b = new ArrayList<>();

    /* renamed from: c */
    final HashMap<Fragment, C0751e> f3765c = new HashMap<>();

    /* renamed from: d */
    boolean f3766d = false;

    /* renamed from: e */
    boolean f3767e = false;

    /* renamed from: androidx.fragment.app.x$a */
    /* compiled from: SpecialEffectsController */
    class C0747a implements C5421b.C5422a {

        /* renamed from: a */
        final /* synthetic */ C0750d f3768a;

        /* renamed from: b */
        final /* synthetic */ C5421b f3769b;

        C0747a(C0750d dVar, C5421b bVar) {
            this.f3768a = dVar;
            this.f3769b = bVar;
        }

        public void onCancel() {
            synchronized (C0746x.this.f3764b) {
                C0746x.this.f3764b.remove(this.f3768a);
                C0746x.this.f3765c.remove(this.f3768a.mo3941e());
                this.f3769b.mo21871a();
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$b */
    /* compiled from: SpecialEffectsController */
    class C0748b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0750d f3771b;

        C0748b(C0750d dVar) {
            this.f3771b = dVar;
        }

        public void run() {
            if (!this.f3771b.mo3939c().mo21873c()) {
                C0746x.this.f3765c.remove(this.f3771b.mo3941e());
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$c */
    /* compiled from: SpecialEffectsController */
    static /* synthetic */ class C0749c {

        /* renamed from: a */
        static final /* synthetic */ int[] f3773a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3774b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.x$e$c[] r0 = androidx.fragment.app.C0746x.C0751e.C0754c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3774b = r0
                r1 = 1
                androidx.fragment.app.x$e$c r2 = androidx.fragment.app.C0746x.C0751e.C0754c.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3774b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.x$e$c r3 = androidx.fragment.app.C0746x.C0751e.C0754c.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3774b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.x$e$c r4 = androidx.fragment.app.C0746x.C0751e.C0754c.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.x$e$d[] r3 = androidx.fragment.app.C0746x.C0751e.C0755d.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3773a = r3
                androidx.fragment.app.x$e$d r4 = androidx.fragment.app.C0746x.C0751e.C0755d.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3773a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.x$e$d r3 = androidx.fragment.app.C0746x.C0751e.C0755d.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3773a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.x$e$d r1 = androidx.fragment.app.C0746x.C0751e.C0755d.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f3773a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.x$e$d r1 = androidx.fragment.app.C0746x.C0751e.C0755d.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0746x.C0749c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.x$d */
    /* compiled from: SpecialEffectsController */
    private static class C0750d extends C0751e {

        /* renamed from: f */
        private final C0716o f3775f;

        C0750d(C0751e.C0755d dVar, C0751e.C0754c cVar, C0716o oVar, C5421b bVar) {
            super(dVar, cVar, oVar.mo3814j(), bVar);
            this.f3775f = oVar;
        }

        /* renamed from: b */
        public void mo3937b() {
            super.mo3937b();
            this.f3775f.mo3815k();
        }
    }

    /* renamed from: androidx.fragment.app.x$e */
    /* compiled from: SpecialEffectsController */
    static class C0751e {

        /* renamed from: a */
        private C0755d f3776a;

        /* renamed from: b */
        private C0754c f3777b;

        /* renamed from: c */
        private final Fragment f3778c;

        /* renamed from: d */
        final C5421b f3779d = new C5421b();

        /* renamed from: e */
        private final List<Runnable> f3780e = new ArrayList();

        /* renamed from: androidx.fragment.app.x$e$a */
        /* compiled from: SpecialEffectsController */
        class C0752a implements C5421b.C5422a {
            C0752a() {
            }

            public void onCancel() {
                C0751e.this.f3779d.mo21871a();
            }
        }

        /* renamed from: androidx.fragment.app.x$e$b */
        /* compiled from: SpecialEffectsController */
        class C0753b implements C5421b.C5422a {
            C0753b() {
            }

            public void onCancel() {
                C0751e.this.f3779d.mo21871a();
            }
        }

        /* renamed from: androidx.fragment.app.x$e$c */
        /* compiled from: SpecialEffectsController */
        enum C0754c {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.x$e$d */
        /* compiled from: SpecialEffectsController */
        enum C0755d {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            static C0755d m4209b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: c */
            static C0755d m4210c(View view) {
                return m4209b(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo3944a(View view) {
                int i = C0749c.f3773a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    view.setVisibility(0);
                } else if (i == 3) {
                    view.setVisibility(8);
                } else if (i == 4) {
                    view.setVisibility(4);
                }
            }
        }

        C0751e(C0755d dVar, C0754c cVar, Fragment fragment, C5421b bVar) {
            this.f3776a = dVar;
            this.f3777b = cVar;
            this.f3778c = fragment;
            bVar.mo21874d(new C0752a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3938a(Runnable runnable) {
            this.f3780e.add(runnable);
        }

        /* renamed from: b */
        public void mo3937b() {
            for (Runnable run : this.f3780e) {
                run.run();
            }
        }

        /* renamed from: c */
        public final C5421b mo3939c() {
            return this.f3779d;
        }

        /* renamed from: d */
        public C0755d mo3940d() {
            return this.f3776a;
        }

        /* renamed from: e */
        public final Fragment mo3941e() {
            return this.f3778c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0754c mo3942f() {
            return this.f3777b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final void mo3943g(C0755d dVar, C0754c cVar, C5421b bVar) {
            int i = C0749c.f3774b[cVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f3776a = C0755d.REMOVED;
                    this.f3777b = C0754c.REMOVING;
                } else if (i == 3 && this.f3776a != C0755d.REMOVED) {
                    this.f3776a = dVar;
                }
            } else if (this.f3776a == C0755d.REMOVED) {
                this.f3776a = C0755d.VISIBLE;
                this.f3777b = C0754c.ADDING;
            }
            bVar.mo21874d(new C0753b());
        }
    }

    C0746x(ViewGroup viewGroup) {
        this.f3763a = viewGroup;
    }

    /* renamed from: a */
    private void m4186a(C0751e.C0755d dVar, C0751e.C0754c cVar, C0716o oVar, C5421b bVar) {
        if (!bVar.mo21873c()) {
            synchronized (this.f3764b) {
                C5421b bVar2 = new C5421b();
                C0751e eVar = this.f3765c.get(oVar.mo3814j());
                if (eVar != null) {
                    eVar.mo3943g(dVar, cVar, bVar);
                    return;
                }
                C0750d dVar2 = new C0750d(dVar, cVar, oVar, bVar2);
                this.f3764b.add(dVar2);
                this.f3765c.put(dVar2.mo3941e(), dVar2);
                bVar.mo21874d(new C0747a(dVar2, bVar2));
                dVar2.mo3938a(new C0748b(dVar2));
            }
        }
    }

    /* renamed from: l */
    static C0746x m4187l(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m4188m(viewGroup, fragmentManager.mo3616z0());
    }

    /* renamed from: m */
    static C0746x m4188m(ViewGroup viewGroup, C0756y yVar) {
        int i = C6093b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C0746x) {
            return (C0746x) tag;
        }
        C0746x a = yVar.mo3628a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3925b(C0751e.C0755d dVar, C0716o oVar, C5421b bVar) {
        m4186a(dVar, C0751e.C0754c.ADDING, oVar, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3926c(C0716o oVar, C5421b bVar) {
        m4186a(C0751e.C0755d.GONE, C0751e.C0754c.NONE, oVar, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3927d(C0716o oVar, C5421b bVar) {
        m4186a(C0751e.C0755d.REMOVED, C0751e.C0754c.REMOVING, oVar, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3928e(C0716o oVar, C5421b bVar) {
        m4186a(C0751e.C0755d.VISIBLE, C0751e.C0754c.NONE, oVar, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo3689f(List<C0751e> list, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3929g() {
        if (!this.f3767e) {
            synchronized (this.f3764b) {
                if (!this.f3764b.isEmpty()) {
                    mo3689f(new ArrayList(this.f3764b), this.f3766d);
                    this.f3764b.clear();
                    this.f3766d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3930h() {
        synchronized (this.f3764b) {
            for (C0751e next : this.f3765c.values()) {
                next.mo3939c().mo21871a();
                next.mo3940d().mo3944a(next.mo3941e().f3345I);
                next.mo3937b();
            }
            this.f3765c.clear();
            this.f3764b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3931i() {
        if (this.f3767e) {
            this.f3767e = false;
            mo3929g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0751e.C0754c mo3932j(C0716o oVar) {
        C0751e eVar = this.f3765c.get(oVar.mo3814j());
        if (eVar == null || eVar.mo3939c().mo21873c()) {
            return null;
        }
        return eVar.mo3942f();
    }

    /* renamed from: k */
    public ViewGroup mo3933k() {
        return this.f3763a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3934n() {
        synchronized (this.f3764b) {
            this.f3767e = false;
            int size = this.f3764b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0751e eVar = this.f3764b.get(size);
                C0751e.C0755d c = C0751e.C0755d.m4210c(eVar.mo3941e().f3345I);
                C0751e.C0755d d = eVar.mo3940d();
                C0751e.C0755d dVar = C0751e.C0755d.VISIBLE;
                if (d == dVar && c != dVar) {
                    this.f3767e = eVar.mo3941e().mo3419h0();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3935o(boolean z) {
        this.f3766d = z;
    }
}
