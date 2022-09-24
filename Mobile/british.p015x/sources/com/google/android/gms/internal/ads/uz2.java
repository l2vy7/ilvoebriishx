package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uz2 implements yy2 {

    /* renamed from: g */
    private static final uz2 f40214g = new uz2();

    /* renamed from: h */
    private static final Handler f40215h = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Handler f40216i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f40217j = new qz2();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f40218k = new rz2();

    /* renamed from: a */
    private final List<tz2> f40219a = new ArrayList();

    /* renamed from: b */
    private int f40220b;

    /* renamed from: c */
    private final az2 f40221c = new az2();

    /* renamed from: d */
    private final nz2 f40222d = new nz2();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final oz2 f40223e = new oz2(new xz2());

    /* renamed from: f */
    private long f40224f;

    uz2() {
    }

    /* renamed from: d */
    public static uz2 m38622d() {
        return f40214g;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m38625g(uz2 uz2) {
        uz2.f40220b = 0;
        uz2.f40224f = System.nanoTime();
        uz2.f40222d.mo33822i();
        long nanoTime = System.nanoTime();
        zy2 a = uz2.f40221c.mo30585a();
        if (uz2.f40222d.mo33818e().size() > 0) {
            Iterator<String> it = uz2.f40222d.mo33818e().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = iz2.m33494a(0, 0, 0, 0);
                View a3 = uz2.f40222d.mo33814a(next);
                zy2 b = uz2.f40221c.mo30586b();
                String c = uz2.f40222d.mo33816c(next);
                if (c != null) {
                    JSONObject zza = b.zza(a3);
                    iz2.m33495b(zza, next);
                    iz2.m33498e(zza, c);
                    iz2.m33496c(a2, zza);
                }
                iz2.m33501h(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                uz2.f40223e.mo34029c(a2, hashSet, nanoTime);
            }
        }
        if (uz2.f40222d.mo33819f().size() > 0) {
            JSONObject a4 = iz2.m33494a(0, 0, 0, 0);
            uz2.m38626k((View) null, a, a4, 1);
            iz2.m33501h(a4);
            uz2.f40223e.mo34030d(a4, uz2.f40222d.mo33819f(), nanoTime);
        } else {
            uz2.f40223e.mo34028b();
        }
        uz2.f40222d.mo33820g();
        long nanoTime2 = System.nanoTime() - uz2.f40224f;
        if (uz2.f40219a.size() > 0) {
            for (tz2 next2 : uz2.f40219a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                next2.zzb();
                if (next2 instanceof sz2) {
                    ((sz2) next2).zza();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m38626k(View view, zy2 zy2, JSONObject jSONObject, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        zy2.mo31057a(view, jSONObject, this, z);
    }

    /* renamed from: l */
    private static final void m38627l() {
        Handler handler = f40216i;
        if (handler != null) {
            handler.removeCallbacks(f40218k);
            f40216i = null;
        }
    }

    /* renamed from: a */
    public final void mo35338a(View view, zy2 zy2, JSONObject jSONObject) {
        int j;
        if (lz2.m34627b(view) == null && (j = this.f40222d.mo33823j(view)) != 3) {
            JSONObject zza = zy2.zza(view);
            iz2.m33496c(jSONObject, zza);
            String d = this.f40222d.mo33817d(view);
            if (d != null) {
                iz2.m33495b(zza, d);
                this.f40222d.mo33821h();
            } else {
                mz2 b = this.f40222d.mo33815b(view);
                if (b != null) {
                    iz2.m33497d(zza, b);
                }
                m38626k(view, zy2, zza, j);
            }
            this.f40220b++;
        }
    }

    /* renamed from: h */
    public final void mo35339h() {
        m38627l();
    }

    /* renamed from: i */
    public final void mo35340i() {
        if (f40216i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f40216i = handler;
            handler.post(f40217j);
            f40216i.postDelayed(f40218k, 200);
        }
    }

    /* renamed from: j */
    public final void mo35341j() {
        m38627l();
        this.f40219a.clear();
        f40215h.post(new pz2(this));
    }
}
