package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.ta */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8184ta implements C8291wa {

    /* renamed from: p */
    private static C8184ta f39345p;

    /* renamed from: b */
    private final Context f39346b;

    /* renamed from: c */
    private final x13 f39347c;

    /* renamed from: d */
    private final d23 f39348d;

    /* renamed from: e */
    private final f23 f39349e;

    /* renamed from: f */
    private final C8185tb f39350f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final k03 f39351g;

    /* renamed from: h */
    private final Executor f39352h;

    /* renamed from: i */
    private final c23 f39353i;

    /* renamed from: j */
    private final CountDownLatch f39354j;

    /* renamed from: k */
    volatile long f39355k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f39356l = new Object();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile boolean f39357m;

    /* renamed from: n */
    private volatile boolean f39358n = false;

    /* renamed from: o */
    private final int f39359o;

    C8184ta(Context context, k03 k03, x13 x13, d23 d23, f23 f23, C8185tb tbVar, Executor executor, f03 f03, int i) {
        this.f39346b = context;
        this.f39351g = k03;
        this.f39347c = x13;
        this.f39348d = d23;
        this.f39349e = f23;
        this.f39350f = tbVar;
        this.f39352h = executor;
        this.f39359o = i;
        this.f39354j = new CountDownLatch(1);
        this.f39353i = new C8115ra(this, f03);
    }

    /* renamed from: a */
    public static synchronized C8184ta m37736a(String str, Context context, boolean z, boolean z2) {
        C8184ta b;
        synchronized (C8184ta.class) {
            b = m37737b(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return b;
    }

    @Deprecated
    /* renamed from: b */
    public static synchronized C8184ta m37737b(String str, Context context, Executor executor, boolean z, boolean z2) {
        C8184ta taVar;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (C8184ta.class) {
            if (f39345p == null) {
                l03 a = m03.m34636a();
                String str2 = str;
                a.mo33220a(str);
                a.mo33222c(z);
                m03 d = a.mo33223d();
                k03 a2 = k03.m33808a(context2, executor2, z2);
                C7603db c = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37060c2)).booleanValue() ? C7603db.m31340c(context) : null;
                e13 e = e13.m31666e(context2, executor2, a2, d);
                zzaml zzaml = new zzaml(context2);
                C8185tb tbVar = new C8185tb(d, e, new C7715gc(context2, zzaml), zzaml, c);
                int b = n13.m35018b(context2, a2);
                f03 f03 = new f03();
                C8184ta taVar2 = new C8184ta(context, a2, new x13(context2, b), new d23(context2, b, new C8079qa(a2), ((Boolean) C8311wv.m39277c().mo18570b(p00.f36841B1)).booleanValue()), new f23(context2, tbVar, a2, f03), tbVar, executor, f03, b);
                f39345p = taVar2;
                taVar2.mo34877g();
                f39345p.mo34878h();
            }
            taVar = f39345p;
        }
        return taVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.mo33868H().mo34528N().equals(r5.mo34528N()) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.f39351g.mo33006d(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r12 = r12.f39354j;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010a */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m37741f(com.google.android.gms.internal.ads.C8184ta r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.w13 r3 = r12.m37743k(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.rd r4 = r3.mo35538a()
            java.lang.String r4 = r4.mo34529O()
            com.google.android.gms.internal.ads.rd r3 = r3.mo35538a()
            java.lang.String r3 = r3.mo34528N()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.f39346b     // Catch:{ wp3 -> 0x012a }
            r6 = 1
            int r7 = r12.f39359o     // Catch:{ wp3 -> 0x012a }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.k03 r11 = r12.f39351g     // Catch:{ wp3 -> 0x012a }
            com.google.android.gms.internal.ads.zzfoa r3 = com.google.android.gms.internal.ads.u03.m38088a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ wp3 -> 0x012a }
            byte[] r4 = r3.f43056c     // Catch:{ wp3 -> 0x012a }
            if (r4 == 0) goto L_0x0119
            int r5 = r4.length     // Catch:{ wp3 -> 0x012a }
            if (r5 != 0) goto L_0x0037
            goto L_0x0119
        L_0x0037:
            com.google.android.gms.internal.ads.eo3 r4 = com.google.android.gms.internal.ads.eo3.m31873L(r4)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.wo3 r5 = com.google.android.gms.internal.ads.wo3.m39219a()     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.od r4 = com.google.android.gms.internal.ads.C8011od.m35624F(r4, r5)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.rd r5 = r4.mo33868H()     // Catch:{ wp3 -> 0x012a }
            java.lang.String r5 = r5.mo34529O()     // Catch:{ wp3 -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ wp3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.rd r5 = r4.mo33868H()     // Catch:{ wp3 -> 0x012a }
            java.lang.String r5 = r5.mo34528N()     // Catch:{ wp3 -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ wp3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.eo3 r5 = r4.mo33869I()     // Catch:{ wp3 -> 0x012a }
            byte[] r5 = r5.mo31616f()     // Catch:{ wp3 -> 0x012a }
            int r5 = r5.length     // Catch:{ wp3 -> 0x012a }
            if (r5 != 0) goto L_0x006c
            goto L_0x00fb
        L_0x006c:
            com.google.android.gms.internal.ads.w13 r5 = r12.m37743k(r2)     // Catch:{ wp3 -> 0x012a }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.rd r5 = r5.mo35538a()     // Catch:{ wp3 -> 0x012a }
            com.google.android.gms.internal.ads.rd r6 = r4.mo33868H()     // Catch:{ wp3 -> 0x012a }
            java.lang.String r6 = r6.mo34529O()     // Catch:{ wp3 -> 0x012a }
            java.lang.String r7 = r5.mo34529O()     // Catch:{ wp3 -> 0x012a }
            boolean r6 = r6.equals(r7)     // Catch:{ wp3 -> 0x012a }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.rd r6 = r4.mo33868H()     // Catch:{ wp3 -> 0x012a }
            java.lang.String r6 = r6.mo34528N()     // Catch:{ wp3 -> 0x012a }
            java.lang.String r5 = r5.mo34528N()     // Catch:{ wp3 -> 0x012a }
            boolean r5 = r6.equals(r5)     // Catch:{ wp3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
        L_0x009b:
            com.google.android.gms.internal.ads.c23 r5 = r12.f39353i     // Catch:{ wp3 -> 0x012a }
            int r3 = r3.f43057d     // Catch:{ wp3 -> 0x012a }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.p00.f37259z1     // Catch:{ wp3 -> 0x012a }
            com.google.android.gms.internal.ads.n00 r7 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ wp3 -> 0x012a }
            java.lang.Object r6 = r7.mo18570b(r6)     // Catch:{ wp3 -> 0x012a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ wp3 -> 0x012a }
            boolean r6 = r6.booleanValue()     // Catch:{ wp3 -> 0x012a }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.d23 r3 = r12.f39348d     // Catch:{ wp3 -> 0x012a }
            boolean r3 = r3.mo31088a(r4)     // Catch:{ wp3 -> 0x012a }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.d23 r3 = r12.f39348d     // Catch:{ wp3 -> 0x012a }
            boolean r3 = r3.mo31089b(r4, r5)     // Catch:{ wp3 -> 0x012a }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.x13 r3 = r12.f39347c     // Catch:{ wp3 -> 0x012a }
            boolean r3 = r3.mo35704b(r4, r5)     // Catch:{ wp3 -> 0x012a }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.k03 r2 = r12.f39351g     // Catch:{ wp3 -> 0x012a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ wp3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo33006d(r3, r4)     // Catch:{ wp3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f39354j
        L_0x00db:
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.w13 r3 = r12.m37743k(r2)     // Catch:{ wp3 -> 0x012a }
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.f23 r4 = r12.f39349e     // Catch:{ wp3 -> 0x012a }
            boolean r3 = r4.mo31713c(r3)     // Catch:{ wp3 -> 0x012a }
            if (r3 == 0) goto L_0x00ef
            r12.f39358n = r2     // Catch:{ wp3 -> 0x012a }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ wp3 -> 0x012a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.f39355k = r2     // Catch:{ wp3 -> 0x012a }
        L_0x00f8:
            java.util.concurrent.CountDownLatch r12 = r12.f39354j
            goto L_0x00db
        L_0x00fb:
            com.google.android.gms.internal.ads.k03 r2 = r12.f39351g     // Catch:{ wp3 -> 0x012a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ wp3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo33006d(r3, r4)     // Catch:{ wp3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f39354j
            goto L_0x00db
        L_0x010a:
            com.google.android.gms.internal.ads.k03 r2 = r12.f39351g     // Catch:{ wp3 -> 0x012a }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ wp3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo33006d(r3, r4)     // Catch:{ wp3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f39354j
            goto L_0x00db
        L_0x0119:
            com.google.android.gms.internal.ads.k03 r2 = r12.f39351g     // Catch:{ wp3 -> 0x012a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ wp3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo33006d(r3, r4)     // Catch:{ wp3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f39354j
            goto L_0x00db
        L_0x0128:
            r0 = move-exception
            goto L_0x013a
        L_0x012a:
            r2 = move-exception
            com.google.android.gms.internal.ads.k03 r3 = r12.f39351g     // Catch:{ all -> 0x0128 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0128 }
            long r5 = r5 - r0
            r3.mo33005c(r4, r5, r2)     // Catch:{ all -> 0x0128 }
            java.util.concurrent.CountDownLatch r12 = r12.f39354j
            goto L_0x00db
        L_0x013a:
            java.util.concurrent.CountDownLatch r12 = r12.f39354j
            r12.countDown()
            goto L_0x0141
        L_0x0140:
            throw r0
        L_0x0141:
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8184ta.m37741f(com.google.android.gms.internal.ads.ta):void");
    }

    /* renamed from: k */
    private final w13 m37743k(int i) {
        if (!n13.m35017a(this.f39359o)) {
            return null;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37259z1)).booleanValue()) {
            return this.f39348d.mo31090c(1);
        }
        return this.f39347c.mo35706d(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo34877g() {
        long currentTimeMillis = System.currentTimeMillis();
        w13 k = m37743k(1);
        if (k == null) {
            this.f39351g.mo33006d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f39349e.mo31713c(k)) {
            this.f39358n = true;
            this.f39354j.countDown();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34878h() {
        /*
            r6 = this;
            boolean r0 = r6.f39357m
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.f39356l
            monitor-enter(r0)
            boolean r1 = r6.f39357m     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.f39355k     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.f23 r1 = r6.f39349e     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.w13 r1 = r1.mo31712b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.mo35541d(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.f39359o     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.n13.m35017a(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.f39352h     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.sa r2 = new com.google.android.gms.internal.ads.sa     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8184ta.mo34878h():void");
    }

    /* renamed from: j */
    public final synchronized boolean mo34879j() {
        return this.f39358n;
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        mo34878h();
        n03 a = this.f39349e.mo31711a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c = a.mo33622c(context, (String) null, str, view, activity);
        this.f39351g.mo33008f(5000, System.currentTimeMillis() - currentTimeMillis, c, (Map<String, String>) null);
        return c;
    }

    public final String zzg(Context context) {
        mo34878h();
        n03 a = this.f39349e.mo31711a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a.mo33620a(context, (String) null);
        this.f39351g.mo33008f(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - currentTimeMillis, a2, (Map<String, String>) null);
        return a2;
    }

    public final String zzh(Context context, View view, Activity activity) {
        mo34878h();
        n03 a = this.f39349e.mo31711a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d = a.mo33623d(context, (String) null, view, (Activity) null);
        this.f39351g.mo33008f(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - currentTimeMillis, d, (Map<String, String>) null);
        return d;
    }

    public final void zzk(MotionEvent motionEvent) {
        n03 a = this.f39349e.mo31711a();
        if (a != null) {
            try {
                a.mo33621b((String) null, motionEvent);
            } catch (e23 e) {
                this.f39351g.mo33005c(e.mo31456a(), -1, e);
            }
        }
    }

    public final void zzl(int i, int i2, int i3) {
    }

    public final void zzn(View view) {
        this.f39350f.mo34901a(view);
    }
}
