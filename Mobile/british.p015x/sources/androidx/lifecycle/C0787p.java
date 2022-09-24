package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0769d;

/* renamed from: androidx.lifecycle.p */
/* compiled from: ServiceLifecycleDispatcher */
public class C0787p {

    /* renamed from: a */
    private final C0776h f3855a;

    /* renamed from: b */
    private final Handler f3856b = new Handler();

    /* renamed from: c */
    private C0788a f3857c;

    /* renamed from: androidx.lifecycle.p$a */
    /* compiled from: ServiceLifecycleDispatcher */
    static class C0788a implements Runnable {

        /* renamed from: b */
        private final C0776h f3858b;

        /* renamed from: c */
        final C0769d.C0771b f3859c;

        /* renamed from: d */
        private boolean f3860d = false;

        C0788a(C0776h hVar, C0769d.C0771b bVar) {
            this.f3858b = hVar;
            this.f3859c = bVar;
        }

        public void run() {
            if (!this.f3860d) {
                this.f3858b.mo3989h(this.f3859c);
                this.f3860d = true;
            }
        }
    }

    public C0787p(C0775g gVar) {
        this.f3855a = new C0776h(gVar);
    }

    /* renamed from: f */
    private void m4309f(C0769d.C0771b bVar) {
        C0788a aVar = this.f3857c;
        if (aVar != null) {
            aVar.run();
        }
        C0788a aVar2 = new C0788a(this.f3855a, bVar);
        this.f3857c = aVar2;
        this.f3856b.postAtFrontOfQueue(aVar2);
    }

    /* renamed from: a */
    public C0769d mo4016a() {
        return this.f3855a;
    }

    /* renamed from: b */
    public void mo4017b() {
        m4309f(C0769d.C0771b.ON_START);
    }

    /* renamed from: c */
    public void mo4018c() {
        m4309f(C0769d.C0771b.ON_CREATE);
    }

    /* renamed from: d */
    public void mo4019d() {
        m4309f(C0769d.C0771b.ON_STOP);
        m4309f(C0769d.C0771b.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo4020e() {
        m4309f(C0769d.C0771b.ON_START);
    }
}
