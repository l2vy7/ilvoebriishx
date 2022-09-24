package androidx.lifecycle;

import androidx.lifecycle.C0769d;
import java.util.Map;
import p109m.C5676a;
import p115n.C5762b;

public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f3800k = new Object();

    /* renamed from: a */
    final Object f3801a = new Object();

    /* renamed from: b */
    private C5762b<C0782m<? super T>, LiveData<T>.c> f3802b = new C5762b<>();

    /* renamed from: c */
    int f3803c = 0;

    /* renamed from: d */
    private boolean f3804d;

    /* renamed from: e */
    private volatile Object f3805e;

    /* renamed from: f */
    volatile Object f3806f;

    /* renamed from: g */
    private int f3807g;

    /* renamed from: h */
    private boolean f3808h;

    /* renamed from: i */
    private boolean f3809i;

    /* renamed from: j */
    private final Runnable f3810j;

    class LifecycleBoundObserver extends LiveData<T>.c implements C0773e {

        /* renamed from: e */
        final C0775g f3811e;

        LifecycleBoundObserver(C0775g gVar, C0782m<? super T> mVar) {
            super(mVar);
            this.f3811e = gVar;
        }

        /* renamed from: c */
        public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
            C0769d.C0772c b = this.f3811e.mo639a().mo3985b();
            if (b == C0769d.C0772c.DESTROYED) {
                LiveData.this.mo3961m(this.f3815a);
                return;
            }
            C0769d.C0772c cVar = null;
            while (cVar != b) {
                mo3967h(mo3965k());
                cVar = b;
                b = this.f3811e.mo639a().mo3985b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3963i() {
            this.f3811e.mo639a().mo3986c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3964j(C0775g gVar) {
            return this.f3811e == gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3965k() {
            return this.f3811e.mo639a().mo3985b().mo3988a(C0769d.C0772c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0759a implements Runnable {
        C0759a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3801a) {
                obj = LiveData.this.f3806f;
                LiveData.this.f3806f = LiveData.f3800k;
            }
            LiveData.this.mo3962n(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0760b extends LiveData<T>.c {
        C0760b(C0782m<? super T> mVar) {
            super(mVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3965k() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C0761c {

        /* renamed from: a */
        final C0782m<? super T> f3815a;

        /* renamed from: b */
        boolean f3816b;

        /* renamed from: c */
        int f3817c = -1;

        C0761c(C0782m<? super T> mVar) {
            this.f3815a = mVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3967h(boolean z) {
            if (z != this.f3816b) {
                this.f3816b = z;
                LiveData.this.mo3952c(z ? 1 : -1);
                if (this.f3816b) {
                    LiveData.this.mo3953e(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3963i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3964j(C0775g gVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public abstract boolean mo3965k();
    }

    public LiveData() {
        Object obj = f3800k;
        this.f3806f = obj;
        this.f3810j = new C0759a();
        this.f3805e = obj;
        this.f3807g = -1;
    }

    /* renamed from: b */
    static void m4220b(String str) {
        if (!C5676a.m25078e().mo22374b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: d */
    private void m4221d(LiveData<T>.c cVar) {
        if (cVar.f3816b) {
            if (!cVar.mo3965k()) {
                cVar.mo3967h(false);
                return;
            }
            int i = cVar.f3817c;
            int i2 = this.f3807g;
            if (i < i2) {
                cVar.f3817c = i2;
                cVar.f3815a.mo3735a(this.f3805e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3952c(int i) {
        int i2 = this.f3803c;
        this.f3803c = i + i2;
        if (!this.f3804d) {
            this.f3804d = true;
            while (true) {
                try {
                    int i3 = this.f3803c;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo3958j();
                        } else if (z2) {
                            mo3959k();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f3804d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3953e(LiveData<T>.c cVar) {
        if (this.f3808h) {
            this.f3809i = true;
            return;
        }
        this.f3808h = true;
        do {
            this.f3809i = false;
            if (cVar == null) {
                C5762b<K, V>.d f = this.f3802b.mo22572f();
                while (f.hasNext()) {
                    m4221d((C0761c) ((Map.Entry) f.next()).getValue());
                    if (this.f3809i) {
                        break;
                    }
                }
            } else {
                m4221d(cVar);
                cVar = null;
            }
        } while (this.f3809i);
        this.f3808h = false;
    }

    /* renamed from: f */
    public T mo3954f() {
        T t = this.f3805e;
        if (t != f3800k) {
            return t;
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo3955g() {
        return this.f3803c > 0;
    }

    /* renamed from: h */
    public void mo3956h(C0775g gVar, C0782m<? super T> mVar) {
        m4220b("observe");
        if (gVar.mo639a().mo3985b() != C0769d.C0772c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
            C0761c i = this.f3802b.mo22566i(mVar, lifecycleBoundObserver);
            if (i != null && !i.mo3964j(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (i == null) {
                gVar.mo639a().mo3984a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: i */
    public void mo3957i(C0782m<? super T> mVar) {
        m4220b("observeForever");
        C0760b bVar = new C0760b(mVar);
        C0761c i = this.f3802b.mo22566i(mVar, bVar);
        if (i instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (i == null) {
            bVar.mo3967h(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo3958j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3959k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo3960l(T t) {
        boolean z;
        synchronized (this.f3801a) {
            z = this.f3806f == f3800k;
            this.f3806f = t;
        }
        if (z) {
            C5676a.m25078e().mo22375c(this.f3810j);
        }
    }

    /* renamed from: m */
    public void mo3961m(C0782m<? super T> mVar) {
        m4220b("removeObserver");
        C0761c j = this.f3802b.mo22567j(mVar);
        if (j != null) {
            j.mo3963i();
            j.mo3967h(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo3962n(T t) {
        m4220b("setValue");
        this.f3807g++;
        this.f3805e = t;
        mo3953e((LiveData<T>.c) null);
    }
}
