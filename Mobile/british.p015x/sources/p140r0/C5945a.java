package p140r0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p150t.C6090g;

/* renamed from: r0.a */
/* compiled from: AnimationHandler */
class C5945a {

    /* renamed from: g */
    public static final ThreadLocal<C5945a> f24864g = new ThreadLocal<>();

    /* renamed from: a */
    private final C6090g<C5947b, Long> f24865a = new C6090g<>();

    /* renamed from: b */
    final ArrayList<C5947b> f24866b = new ArrayList<>();

    /* renamed from: c */
    private final C5946a f24867c = new C5946a();

    /* renamed from: d */
    private C5948c f24868d;

    /* renamed from: e */
    long f24869e = 0;

    /* renamed from: f */
    private boolean f24870f = false;

    /* renamed from: r0.a$a */
    /* compiled from: AnimationHandler */
    class C5946a {
        C5946a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22981a() {
            C5945a.this.f24869e = SystemClock.uptimeMillis();
            C5945a aVar = C5945a.this;
            aVar.mo22978c(aVar.f24869e);
            if (C5945a.this.f24866b.size() > 0) {
                C5945a.this.mo22979e().mo22983a();
            }
        }
    }

    /* renamed from: r0.a$b */
    /* compiled from: AnimationHandler */
    interface C5947b {
        /* renamed from: a */
        boolean mo22982a(long j);
    }

    /* renamed from: r0.a$c */
    /* compiled from: AnimationHandler */
    static abstract class C5948c {

        /* renamed from: a */
        final C5946a f24872a;

        C5948c(C5946a aVar) {
            this.f24872a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo22983a();
    }

    /* renamed from: r0.a$d */
    /* compiled from: AnimationHandler */
    private static class C5949d extends C5948c {

        /* renamed from: b */
        private final Runnable f24873b = new C5950a();

        /* renamed from: c */
        private final Handler f24874c = new Handler(Looper.myLooper());

        /* renamed from: d */
        long f24875d = -1;

        /* renamed from: r0.a$d$a */
        /* compiled from: AnimationHandler */
        class C5950a implements Runnable {
            C5950a() {
            }

            public void run() {
                C5949d.this.f24875d = SystemClock.uptimeMillis();
                C5949d.this.f24872a.mo22981a();
            }
        }

        C5949d(C5946a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22983a() {
            this.f24874c.postDelayed(this.f24873b, Math.max(10 - (SystemClock.uptimeMillis() - this.f24875d), 0));
        }
    }

    /* renamed from: r0.a$e */
    /* compiled from: AnimationHandler */
    private static class C5951e extends C5948c {

        /* renamed from: b */
        private final Choreographer f24877b = Choreographer.getInstance();

        /* renamed from: c */
        private final Choreographer.FrameCallback f24878c = new C5952a();

        /* renamed from: r0.a$e$a */
        /* compiled from: AnimationHandler */
        class C5952a implements Choreographer.FrameCallback {
            C5952a() {
            }

            public void doFrame(long j) {
                C5951e.this.f24872a.mo22981a();
            }
        }

        C5951e(C5946a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22983a() {
            this.f24877b.postFrameCallback(this.f24878c);
        }
    }

    C5945a() {
    }

    /* renamed from: b */
    private void m26240b() {
        if (this.f24870f) {
            for (int size = this.f24866b.size() - 1; size >= 0; size--) {
                if (this.f24866b.get(size) == null) {
                    this.f24866b.remove(size);
                }
            }
            this.f24870f = false;
        }
    }

    /* renamed from: d */
    public static C5945a m26241d() {
        ThreadLocal<C5945a> threadLocal = f24864g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C5945a());
        }
        return threadLocal.get();
    }

    /* renamed from: f */
    private boolean m26242f(C5947b bVar, long j) {
        Long l = this.f24865a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f24865a.remove(bVar);
        return true;
    }

    /* renamed from: a */
    public void mo22977a(C5947b bVar, long j) {
        if (this.f24866b.size() == 0) {
            mo22979e().mo22983a();
        }
        if (!this.f24866b.contains(bVar)) {
            this.f24866b.add(bVar);
        }
        if (j > 0) {
            this.f24865a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo22978c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f24866b.size(); i++) {
            C5947b bVar = this.f24866b.get(i);
            if (bVar != null && m26242f(bVar, uptimeMillis)) {
                bVar.mo22982a(j);
            }
        }
        m26240b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5948c mo22979e() {
        if (this.f24868d == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f24868d = new C5951e(this.f24867c);
            } else {
                this.f24868d = new C5949d(this.f24867c);
            }
        }
        return this.f24868d;
    }

    /* renamed from: g */
    public void mo22980g(C5947b bVar) {
        this.f24865a.remove(bVar);
        int indexOf = this.f24866b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f24866b.set(indexOf, (Object) null);
            this.f24870f = true;
        }
    }
}
