package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.ironsource.lifecycle.C4988b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.lifecycle.d */
public final class C4991d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: l */
    private static C4991d f22061l = new C4991d();

    /* renamed from: m */
    static AtomicBoolean f22062m = new AtomicBoolean(false);

    /* renamed from: b */
    private String f22063b = "IronsourceLifecycleManager";

    /* renamed from: c */
    Handler f22064c;

    /* renamed from: d */
    int f22065d = 0;

    /* renamed from: e */
    int f22066e = 0;

    /* renamed from: f */
    boolean f22067f = true;

    /* renamed from: g */
    boolean f22068g = true;

    /* renamed from: h */
    int f22069h = C4994e.f22075a;

    /* renamed from: i */
    List<C4990c> f22070i = new CopyOnWriteArrayList();

    /* renamed from: j */
    Runnable f22071j = new C4992a();

    /* renamed from: k */
    private C4988b.C4989a f22072k = new C4993b();

    /* renamed from: com.ironsource.lifecycle.d$a */
    class C4992a implements Runnable {
        C4992a() {
        }

        public final void run() {
            C4991d.m22850b(C4991d.this);
            C4991d.this.m22852d();
        }
    }

    /* renamed from: com.ironsource.lifecycle.d$b */
    class C4993b implements C4988b.C4989a {
        C4993b() {
        }

        /* renamed from: a */
        public final void mo20608a(Activity activity) {
            C4991d dVar = C4991d.this;
            int i = dVar.f22065d + 1;
            dVar.f22065d = i;
            if (i == 1 && dVar.f22068g) {
                for (C4990c a : dVar.f22070i) {
                    a.mo20600a();
                }
                dVar.f22068g = false;
                dVar.f22069h = C4994e.f22076b;
            }
        }

        /* renamed from: b */
        public final void mo20609b(Activity activity) {
            C4991d dVar = C4991d.this;
            int i = dVar.f22066e + 1;
            dVar.f22066e = i;
            if (i != 1) {
                return;
            }
            if (dVar.f22067f) {
                Iterator<C4990c> it = dVar.f22070i.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                dVar.f22067f = false;
                dVar.f22069h = C4994e.f22077c;
                return;
            }
            dVar.f22064c.removeCallbacks(dVar.f22071j);
        }
    }

    /* renamed from: a */
    public static C4991d m22849a() {
        return f22061l;
    }

    /* renamed from: b */
    static /* synthetic */ void m22850b(C4991d dVar) {
        if (dVar.f22066e == 0) {
            dVar.f22067f = true;
            Iterator<C4990c> it = dVar.f22070i.iterator();
            while (it.hasNext()) {
                it.next();
            }
            dVar.f22069h = C4994e.f22078d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m22852d() {
        if (this.f22065d == 0 && this.f22067f) {
            for (C4990c b : this.f22070i) {
                b.mo20601b();
            }
            this.f22068g = true;
            this.f22069h = C4994e.f22079e;
        }
    }

    /* renamed from: a */
    public final void mo20610a(C4990c cVar) {
        if (IronsourceLifecycleProvider.m22840a() && !this.f22070i.contains(cVar)) {
            this.f22070i.add(cVar);
        }
    }

    /* renamed from: b */
    public final boolean mo20611b() {
        return this.f22069h == C4994e.f22079e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C4988b.m22844b(activity);
        C4988b a = C4988b.m22843a(activity);
        if (a != null) {
            a.f22060b = this.f22072k;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.f22066e - 1;
        this.f22066e = i;
        if (i == 0) {
            this.f22064c.postDelayed(this.f22071j, 700);
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        this.f22065d--;
        m22852d();
    }
}
