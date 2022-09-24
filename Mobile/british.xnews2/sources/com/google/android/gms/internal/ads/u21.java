package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u21 implements C7763hn, ib1, zzo, hb1 {

    /* renamed from: b */
    private final p21 f39731b;

    /* renamed from: c */
    private final q21 f39732c;

    /* renamed from: d */
    private final Set<xt0> f39733d = new HashSet();

    /* renamed from: e */
    private final ec0<JSONObject, JSONObject> f39734e;

    /* renamed from: f */
    private final Executor f39735f;

    /* renamed from: g */
    private final C6483e f39736g;

    /* renamed from: h */
    private final AtomicBoolean f39737h = new AtomicBoolean(false);
    @GuardedBy("this")

    /* renamed from: i */
    private final t21 f39738i = new t21();

    /* renamed from: j */
    private boolean f39739j = false;

    /* renamed from: k */
    private WeakReference<?> f39740k = new WeakReference<>(this);

    public u21(bc0 bc0, q21 q21, Executor executor, p21 p21, C6483e eVar) {
        this.f39731b = p21;
        mb0<JSONObject> mb0 = pb0.f37568b;
        this.f39734e = bc0.mo30653a("google.afma.activeView.handleUpdate", mb0, mb0);
        this.f39732c = q21;
        this.f39735f = executor;
        this.f39736g = eVar;
    }

    /* renamed from: l */
    private final void m38100l() {
        for (xt0 f : this.f39733d) {
            this.f39731b.mo34042f(f);
        }
        this.f39731b.mo34041e();
    }

    /* renamed from: C */
    public final synchronized void mo18537C(Context context) {
        this.f39738i.f39256e = "u";
        mo35093a();
        m38100l();
        this.f39739j = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35093a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference<?> r0 = r5.f39740k     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5.f39739j     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f39737h     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.t21 r0 = r5.f39738i     // Catch:{ Exception -> 0x0051 }
            a5.e r1 = r5.f39736g     // Catch:{ Exception -> 0x0051 }
            long r1 = r1.elapsedRealtime()     // Catch:{ Exception -> 0x0051 }
            r0.f39255d = r1     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.q21 r0 = r5.f39732c     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.t21 r1 = r5.f39738i     // Catch:{ Exception -> 0x0051 }
            org.json.JSONObject r0 = r0.zzb(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.google.android.gms.internal.ads.xt0> r1 = r5.f39733d     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.xt0 r2 = (com.google.android.gms.internal.ads.xt0) r2     // Catch:{ Exception -> 0x0051 }
            java.util.concurrent.Executor r3 = r5.f39735f     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.s21 r4 = new com.google.android.gms.internal.ads.s21     // Catch:{ Exception -> 0x0051 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x0051 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0051 }
            goto L_0x002d
        L_0x0044:
            com.google.android.gms.internal.ads.ec0<org.json.JSONObject, org.json.JSONObject> r1 = r5.f39734e     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.mb3 r0 = r1.zzb(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.so0.m37459b(r0, r1)     // Catch:{ Exception -> 0x0051 }
            monitor-exit(r5)
            return
        L_0x0051:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)
            return
        L_0x005b:
            r5.mo35096g()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x0064
        L_0x0063:
            throw r0
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u21.mo35093a():void");
    }

    /* renamed from: c */
    public final synchronized void mo18538c(Context context) {
        this.f39738i.f39253b = true;
        mo35093a();
    }

    /* renamed from: d */
    public final synchronized void mo35094d(xt0 xt0) {
        this.f39733d.add(xt0);
        this.f39731b.mo34040d(xt0);
    }

    /* renamed from: f */
    public final void mo35095f(Object obj) {
        this.f39740k = new WeakReference<>(obj);
    }

    /* renamed from: g */
    public final synchronized void mo35096g() {
        m38100l();
        this.f39739j = true;
    }

    /* renamed from: n0 */
    public final synchronized void mo18767n0(C7689fn fnVar) {
        t21 t21 = this.f39738i;
        t21.f39252a = fnVar.f31824j;
        t21.f39257f = fnVar;
        mo35093a();
    }

    /* renamed from: x */
    public final synchronized void mo18542x(Context context) {
        this.f39738i.f39253b = false;
        mo35093a();
    }

    public final void zzb() {
    }

    public final void zzbK() {
    }

    public final synchronized void zzbS() {
        this.f39738i.f39253b = false;
        mo35093a();
    }

    public final synchronized void zzbz() {
        this.f39738i.f39253b = true;
        mo35093a();
    }

    public final void zze() {
    }

    public final void zzf(int i) {
    }

    public final synchronized void zzl() {
        if (this.f39737h.compareAndSet(false, true)) {
            this.f39731b.mo34039c(this);
            mo35093a();
        }
    }
}
