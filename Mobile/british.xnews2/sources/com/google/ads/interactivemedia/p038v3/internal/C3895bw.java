package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bw */
/* compiled from: IMASDK */
public final class C3895bw implements C3877be {

    /* renamed from: a */
    private static final C3895bw f16785a = new C3895bw();

    /* renamed from: b */
    private static final Handler f16786b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f16787c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f16788j = new C3892bt((byte[]) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f16789k = new C3892bt();

    /* renamed from: d */
    private final List<C3894bv> f16790d = new ArrayList();

    /* renamed from: e */
    private int f16791e;

    /* renamed from: f */
    private final C3879bg f16792f = new C3879bg();

    /* renamed from: g */
    private final C3889bq f16793g = new C3889bq();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3890br f16794h = new C3890br(new C3898bz());

    /* renamed from: i */
    private long f16795i;

    C3895bw() {
    }

    /* renamed from: b */
    public static C3895bw m16881b() {
        return f16785a;
    }

    /* renamed from: g */
    static /* synthetic */ void m16883g(C3895bw bwVar) {
        bwVar.f16791e = 0;
        bwVar.f16795i = System.nanoTime();
        bwVar.f16793g.mo15583d();
        long nanoTime = System.nanoTime();
        C3878bf a = bwVar.f16792f.mo15037a();
        if (bwVar.f16793g.mo15581b().size() > 0) {
            Iterator<String> it = bwVar.f16793g.mo15581b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = a.mo14985a((View) null);
                View h = bwVar.f16793g.mo15587h(next);
                C3878bf b = bwVar.f16792f.mo15038b();
                String c = bwVar.f16793g.mo15582c(next);
                if (c != null) {
                    JSONObject a3 = b.mo14985a(h);
                    C3887bo.m16854e(a3, next);
                    C3887bo.m16855f(a3, c);
                    C3887bo.m16857h(a2, a3);
                }
                C3887bo.m16858i(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                bwVar.f16794h.mo15591b(a2, hashSet, nanoTime);
            }
        }
        if (bwVar.f16793g.mo15580a().size() > 0) {
            JSONObject a4 = a.mo14985a((View) null);
            bwVar.m16887k((View) null, a, a4, 1);
            C3887bo.m16858i(a4);
            bwVar.f16794h.mo15590a(a4, bwVar.f16793g.mo15580a(), nanoTime);
        } else {
            bwVar.f16794h.mo15592c();
        }
        bwVar.f16793g.mo15584e();
        long nanoTime2 = System.nanoTime() - bwVar.f16795i;
        if (bwVar.f16790d.size() > 0) {
            for (C3894bv next2 : bwVar.f16790d) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                next2.mo15598b();
                if (next2 instanceof C3893bu) {
                    ((C3893bu) next2).mo15597a();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m16887k(View view, C3878bf bfVar, JSONObject jSONObject, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        bfVar.mo14986b(view, jSONObject, this, z);
    }

    /* renamed from: l */
    private static final void m16888l() {
        Handler handler = f16787c;
        if (handler != null) {
            handler.removeCallbacks(f16789k);
            f16787c = null;
        }
    }

    /* renamed from: a */
    public final void mo14955a(View view, C3878bf bfVar, JSONObject jSONObject) {
        int j;
        if (C4130ko.m17749e(view) == null && (j = this.f16793g.mo15589j(view)) != 3) {
            JSONObject a = bfVar.mo14985a(view);
            C3887bo.m16857h(jSONObject, a);
            String g = this.f16793g.mo15586g(view);
            if (g != null) {
                C3887bo.m16854e(a, g);
                this.f16793g.mo15585f();
            } else {
                C3888bp i = this.f16793g.mo15588i(view);
                if (i != null) {
                    C3887bo.m16856g(a, i);
                }
                m16887k(view, bfVar, a, j);
            }
            this.f16791e++;
        }
    }

    /* renamed from: c */
    public final void mo15599c() {
        if (f16787c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16787c = handler;
            handler.post(f16788j);
            f16787c.postDelayed(f16789k, 200);
        }
    }

    /* renamed from: d */
    public final void mo15600d() {
        m16888l();
        this.f16790d.clear();
        f16786b.post(new C3891bs(this));
    }

    /* renamed from: e */
    public final void mo15601e() {
        m16888l();
    }
}
