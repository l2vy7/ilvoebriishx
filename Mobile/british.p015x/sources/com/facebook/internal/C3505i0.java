package com.facebook.internal;

import com.facebook.C3642m;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.internal.i0 */
/* compiled from: WorkQueue */
public class C3505i0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f13119a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3508c f13120b;

    /* renamed from: c */
    private final int f13121c;

    /* renamed from: d */
    private final Executor f13122d;

    /* renamed from: e */
    private C3508c f13123e;

    /* renamed from: f */
    private int f13124f;

    /* renamed from: com.facebook.internal.i0$a */
    /* compiled from: WorkQueue */
    class C3506a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3508c f13125b;

        C3506a(C3508c cVar) {
            this.f13125b = cVar;
        }

        public void run() {
            try {
                this.f13125b.mo11986c().run();
            } finally {
                C3505i0.this.m11741h(this.f13125b);
            }
        }
    }

    /* renamed from: com.facebook.internal.i0$b */
    /* compiled from: WorkQueue */
    public interface C3507b {
        /* renamed from: a */
        void mo11983a();

        boolean cancel();
    }

    /* renamed from: com.facebook.internal.i0$c */
    /* compiled from: WorkQueue */
    private class C3508c implements C3507b {

        /* renamed from: a */
        private final Runnable f13127a;

        /* renamed from: b */
        private C3508c f13128b;

        /* renamed from: c */
        private C3508c f13129c;

        /* renamed from: d */
        private boolean f13130d;

        C3508c(Runnable runnable) {
            this.f13127a = runnable;
        }

        /* renamed from: a */
        public void mo11983a() {
            synchronized (C3505i0.this.f13119a) {
                if (!mo11987d()) {
                    C3505i0 i0Var = C3505i0.this;
                    C3508c unused = i0Var.f13120b = mo11988e(i0Var.f13120b);
                    C3505i0 i0Var2 = C3505i0.this;
                    C3508c unused2 = i0Var2.f13120b = mo11985b(i0Var2.f13120b, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3508c mo11985b(C3508c cVar, boolean z) {
            if (cVar == null) {
                this.f13129c = this;
                this.f13128b = this;
                cVar = this;
            } else {
                this.f13128b = cVar;
                C3508c cVar2 = cVar.f13129c;
                this.f13129c = cVar2;
                cVar2.f13128b = this;
                cVar.f13129c = this;
            }
            return z ? this : cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Runnable mo11986c() {
            return this.f13127a;
        }

        public boolean cancel() {
            synchronized (C3505i0.this.f13119a) {
                if (mo11987d()) {
                    return false;
                }
                C3505i0 i0Var = C3505i0.this;
                C3508c unused = i0Var.f13120b = mo11988e(i0Var.f13120b);
                return true;
            }
        }

        /* renamed from: d */
        public boolean mo11987d() {
            return this.f13130d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3508c mo11988e(C3508c cVar) {
            if (cVar == this && (cVar = this.f13128b) == this) {
                cVar = null;
            }
            C3508c cVar2 = this.f13128b;
            cVar2.f13129c = this.f13129c;
            this.f13129c.f13128b = cVar2;
            this.f13129c = null;
            this.f13128b = null;
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo11989f(boolean z) {
            this.f13130d = z;
        }
    }

    public C3505i0(int i) {
        this(i, C3642m.m12288n());
    }

    /* renamed from: g */
    private void m11740g(C3508c cVar) {
        this.f13122d.execute(new C3506a(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11741h(C3508c cVar) {
        C3508c cVar2;
        synchronized (this.f13119a) {
            if (cVar != null) {
                this.f13123e = cVar.mo11988e(this.f13123e);
                this.f13124f--;
            }
            if (this.f13124f < this.f13121c) {
                cVar2 = this.f13120b;
                if (cVar2 != null) {
                    this.f13120b = cVar2.mo11988e(cVar2);
                    this.f13123e = cVar2.mo11985b(this.f13123e, false);
                    this.f13124f++;
                    cVar2.mo11989f(true);
                }
            } else {
                cVar2 = null;
            }
        }
        if (cVar2 != null) {
            m11740g(cVar2);
        }
    }

    /* renamed from: i */
    private void m11742i() {
        m11741h((C3508c) null);
    }

    /* renamed from: e */
    public C3507b mo11980e(Runnable runnable) {
        return mo11981f(runnable, true);
    }

    /* renamed from: f */
    public C3507b mo11981f(Runnable runnable, boolean z) {
        C3508c cVar = new C3508c(runnable);
        synchronized (this.f13119a) {
            this.f13120b = cVar.mo11985b(this.f13120b, z);
        }
        m11742i();
        return cVar;
    }

    public C3505i0(int i, Executor executor) {
        this.f13119a = new Object();
        this.f13123e = null;
        this.f13124f = 0;
        this.f13121c = i;
        this.f13122d = executor;
    }
}
