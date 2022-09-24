package p098k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p110m0.C5684a0;
import p110m0.C5740y;
import p110m0.C5744z;

/* renamed from: k.h */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class C5532h {

    /* renamed from: a */
    final ArrayList<C5740y> f24022a = new ArrayList<>();

    /* renamed from: b */
    private long f24023b = -1;

    /* renamed from: c */
    private Interpolator f24024c;

    /* renamed from: d */
    C5744z f24025d;

    /* renamed from: e */
    private boolean f24026e;

    /* renamed from: f */
    private final C5684a0 f24027f = new C5533a();

    /* renamed from: k.h$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class C5533a extends C5684a0 {

        /* renamed from: a */
        private boolean f24028a = false;

        /* renamed from: b */
        private int f24029b = 0;

        C5533a() {
        }

        /* renamed from: b */
        public void mo875b(View view) {
            int i = this.f24029b + 1;
            this.f24029b = i;
            if (i == C5532h.this.f24022a.size()) {
                C5744z zVar = C5532h.this.f24025d;
                if (zVar != null) {
                    zVar.mo875b((View) null);
                }
                mo22059d();
            }
        }

        /* renamed from: c */
        public void mo876c(View view) {
            if (!this.f24028a) {
                this.f24028a = true;
                C5744z zVar = C5532h.this.f24025d;
                if (zVar != null) {
                    zVar.mo876c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo22059d() {
            this.f24029b = 0;
            this.f24028a = false;
            C5532h.this.mo22052b();
        }
    }

    /* renamed from: a */
    public void mo22051a() {
        if (this.f24026e) {
            Iterator<C5740y> it = this.f24022a.iterator();
            while (it.hasNext()) {
                it.next().mo22505b();
            }
            this.f24026e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo22052b() {
        this.f24026e = false;
    }

    /* renamed from: c */
    public C5532h mo22053c(C5740y yVar) {
        if (!this.f24026e) {
            this.f24022a.add(yVar);
        }
        return this;
    }

    /* renamed from: d */
    public C5532h mo22054d(C5740y yVar, C5740y yVar2) {
        this.f24022a.add(yVar);
        yVar2.mo22510h(yVar.mo22506c());
        this.f24022a.add(yVar2);
        return this;
    }

    /* renamed from: e */
    public C5532h mo22055e(long j) {
        if (!this.f24026e) {
            this.f24023b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C5532h mo22056f(Interpolator interpolator) {
        if (!this.f24026e) {
            this.f24024c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C5532h mo22057g(C5744z zVar) {
        if (!this.f24026e) {
            this.f24025d = zVar;
        }
        return this;
    }

    /* renamed from: h */
    public void mo22058h() {
        if (!this.f24026e) {
            Iterator<C5740y> it = this.f24022a.iterator();
            while (it.hasNext()) {
                C5740y next = it.next();
                long j = this.f24023b;
                if (j >= 0) {
                    next.mo22507d(j);
                }
                Interpolator interpolator = this.f24024c;
                if (interpolator != null) {
                    next.mo22508e(interpolator);
                }
                if (this.f24025d != null) {
                    next.mo22509f(this.f24027f);
                }
                next.mo22512j();
            }
            this.f24026e = true;
        }
    }
}
