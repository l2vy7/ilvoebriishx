package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cc2 implements kd1, cc1, pa1, hb1, C7659eu, ma1, ad1, C8366yd, db1, gi1 {

    /* renamed from: b */
    private final AtomicReference<C7624dw> f30326b = new AtomicReference<>();

    /* renamed from: c */
    private final AtomicReference<C8385yw> f30327c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<C7555by> f30328d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicReference<C7772hw> f30329e = new AtomicReference<>();

    /* renamed from: f */
    private final AtomicReference<C7699fx> f30330f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicBoolean f30331g = new AtomicBoolean(true);

    /* renamed from: h */
    private final AtomicBoolean f30332h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f30333i = new AtomicBoolean(false);

    /* renamed from: j */
    private final nw2 f30334j;

    /* renamed from: k */
    final BlockingQueue<Pair<String, String>> f30335k = new ArrayBlockingQueue(((Integer) C8311wv.m39277c().mo18570b(p00.f37248x6)).intValue());

    public cc2(nw2 nw2) {
        this.f30334j = nw2;
    }

    @TargetApi(5)
    /* renamed from: M */
    private final void m30952M() {
        if (this.f30332h.get() && this.f30333i.get()) {
            for (Pair kb2 : this.f30335k) {
                io2.m33342a(this.f30327c, new kb2(kb2));
            }
            this.f30335k.clear();
            this.f30331g.set(false);
        }
    }

    /* renamed from: C */
    public final void mo30877C(C8385yw ywVar) {
        this.f30327c.set(ywVar);
        this.f30332h.set(true);
        m30952M();
    }

    /* renamed from: G */
    public final void mo18433G(ur2 ur2) {
        this.f30331g.set(true);
        this.f30333i.set(false);
    }

    /* renamed from: I */
    public final void mo30878I(C7699fx fxVar) {
        this.f30330f.set(fxVar);
    }

    /* renamed from: N */
    public final void mo18122N(zzbew zzbew) {
        io2.m33342a(this.f30330f, new wb2(zzbew));
    }

    /* renamed from: a */
    public final void mo18123a(kj0 kj0, String str, String str2) {
    }

    /* renamed from: c */
    public final synchronized C7624dw mo30879c() {
        return this.f30326b.get();
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        io2.m33342a(this.f30326b, new tb2(zzbew));
        io2.m33342a(this.f30326b, new ub2(zzbew));
        io2.m33342a(this.f30329e, new vb2(zzbew));
        this.f30331g.set(false);
        this.f30335k.clear();
    }

    /* renamed from: g */
    public final void mo18104g(zzbfk zzbfk) {
        io2.m33342a(this.f30328d, new xb2(zzbfk));
    }

    /* renamed from: h0 */
    public final void mo18437h0(zzcdq zzcdq) {
    }

    /* renamed from: l */
    public final synchronized C8385yw mo30880l() {
        return this.f30327c.get();
    }

    /* renamed from: n */
    public final void mo30881n(C7624dw dwVar) {
        this.f30326b.set(dwVar);
    }

    public final void onAdClicked() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37155m7)).booleanValue()) {
            io2.m33342a(this.f30326b, zb2.f42414a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    @android.annotation.TargetApi(5)
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo18126r(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f30331g     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>> r0 = r3.f30335k     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.internal.ads.co0.zze(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.nw2 r0 = r3.f30334j     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.mw2 r1 = com.google.android.gms.internal.ads.mw2.m34936b(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.mo33603a(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.mo33603a(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.mo31048a(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.yw> r0 = r3.f30327c     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.yb2 r1 = new com.google.android.gms.internal.ads.yb2     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.io2.m33342a(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cc2.mo18126r(java.lang.String, java.lang.String):void");
    }

    /* renamed from: w */
    public final void mo18127w() {
    }

    /* renamed from: x */
    public final void mo30882x(C7772hw hwVar) {
        this.f30329e.set(hwVar);
    }

    /* renamed from: z */
    public final void mo30883z(C7555by byVar) {
        this.f30328d.set(byVar);
    }

    public final void zzj() {
        io2.m33342a(this.f30326b, ac2.f29601a);
        io2.m33342a(this.f30330f, qb2.f37956a);
    }

    public final void zzl() {
        io2.m33342a(this.f30326b, bc2.f29967a);
    }

    public final void zzm() {
        io2.m33342a(this.f30326b, lb2.f34970a);
    }

    public final synchronized void zzn() {
        io2.m33342a(this.f30326b, mb2.f35470a);
        io2.m33342a(this.f30329e, ob2.f36362a);
        this.f30333i.set(true);
        m30952M();
    }

    public final void zzo() {
        io2.m33342a(this.f30326b, nb2.f35970a);
        io2.m33342a(this.f30330f, sb2.f38942a);
        io2.m33342a(this.f30330f, rb2.f38617a);
    }

    public final void zzq() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37155m7)).booleanValue()) {
            io2.m33342a(this.f30326b, zb2.f42414a);
        }
        io2.m33342a(this.f30330f, pb2.f37571a);
    }

    public final void zzr() {
    }
}
