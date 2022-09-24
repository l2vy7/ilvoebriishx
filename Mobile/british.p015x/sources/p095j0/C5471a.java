package p095j0;

import android.graphics.Typeface;
import android.os.Handler;
import p095j0.C5478e;
import p095j0.C5484f;

/* renamed from: j0.a */
/* compiled from: CallbackWithHandler */
class C5471a {

    /* renamed from: a */
    private final C5484f.C5487c f23843a;

    /* renamed from: b */
    private final Handler f23844b;

    /* renamed from: j0.a$a */
    /* compiled from: CallbackWithHandler */
    class C5472a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C5484f.C5487c f23845b;

        /* renamed from: c */
        final /* synthetic */ Typeface f23846c;

        C5472a(C5484f.C5487c cVar, Typeface typeface) {
            this.f23845b = cVar;
            this.f23846c = typeface;
        }

        public void run() {
            this.f23845b.mo9263b(this.f23846c);
        }
    }

    /* renamed from: j0.a$b */
    /* compiled from: CallbackWithHandler */
    class C5473b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C5484f.C5487c f23848b;

        /* renamed from: c */
        final /* synthetic */ int f23849c;

        C5473b(C5484f.C5487c cVar, int i) {
            this.f23848b = cVar;
            this.f23849c = i;
        }

        public void run() {
            this.f23848b.mo9262a(this.f23849c);
        }
    }

    C5471a(C5484f.C5487c cVar, Handler handler) {
        this.f23843a = cVar;
        this.f23844b = handler;
    }

    /* renamed from: a */
    private void m24482a(int i) {
        this.f23844b.post(new C5473b(this.f23843a, i));
    }

    /* renamed from: c */
    private void m24483c(Typeface typeface) {
        this.f23844b.post(new C5472a(this.f23843a, typeface));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21934b(C5478e.C5483e eVar) {
        if (eVar.mo21953a()) {
            m24483c(eVar.f23872a);
        } else {
            m24482a(eVar.f23873b);
        }
    }
}
