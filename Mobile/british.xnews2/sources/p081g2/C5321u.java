package p081g2;

import p004a3.C0065j;
import p013b3.C1554a;
import p013b3.C1563c;
import p104l0.C5645e;

/* renamed from: g2.u */
/* compiled from: LockedResource */
final class C5321u<Z> implements C5323v<Z>, C1554a.C1560f {

    /* renamed from: f */
    private static final C5645e<C5321u<?>> f23485f = C1554a.m7980d(20, new C5322a());

    /* renamed from: b */
    private final C1563c f23486b = C1563c.m7996a();

    /* renamed from: c */
    private C5323v<Z> f23487c;

    /* renamed from: d */
    private boolean f23488d;

    /* renamed from: e */
    private boolean f23489e;

    /* renamed from: g2.u$a */
    /* compiled from: LockedResource */
    class C5322a implements C1554a.C1558d<C5321u<?>> {
        C5322a() {
        }

        /* renamed from: b */
        public C5321u<?> mo7107a() {
            return new C5321u<>();
        }
    }

    C5321u() {
    }

    /* renamed from: d */
    private void m23985d(C5323v<Z> vVar) {
        this.f23489e = false;
        this.f23488d = true;
        this.f23487c = vVar;
    }

    /* renamed from: e */
    static <Z> C5321u<Z> m23986e(C5323v<Z> vVar) {
        C5321u<Z> uVar = (C5321u) C0065j.m247d(f23485f.acquire());
        uVar.m23985d(vVar);
        return uVar;
    }

    /* renamed from: f */
    private void m23987f() {
        this.f23487c = null;
        f23485f.mo7110a(this);
    }

    /* renamed from: a */
    public synchronized void mo21591a() {
        this.f23486b.mo7114c();
        this.f23489e = true;
        if (!this.f23488d) {
            this.f23487c.mo21591a();
            m23987f();
        }
    }

    /* renamed from: b */
    public int mo21592b() {
        return this.f23487c.mo21592b();
    }

    /* renamed from: c */
    public Class<Z> mo21593c() {
        return this.f23487c.mo21593c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo21620g() {
        this.f23486b.mo7114c();
        if (this.f23488d) {
            this.f23488d = false;
            if (this.f23489e) {
                mo21591a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.f23487c.get();
    }

    /* renamed from: k */
    public C1563c mo7112k() {
        return this.f23486b;
    }
}
