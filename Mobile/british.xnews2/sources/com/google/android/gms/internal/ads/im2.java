package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.o61;
import com.google.android.gms.internal.ads.t91;
import com.google.android.gms.internal.ads.u31;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class im2<AppOpenAd extends o61, AppOpenRequestComponent extends u31<AppOpenAd>, AppOpenRequestComponentBuilder extends t91<AppOpenRequestComponent>> implements tc2<AppOpenAd> {

    /* renamed from: a */
    private final Context f20441a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f20442b;

    /* renamed from: c */
    protected final uv0 f20443c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zm2 f20444d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final vo2<AppOpenRequestComponent, AppOpenAd> f20445e;

    /* renamed from: f */
    private final ViewGroup f20446f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final gx2 f20447g;
    @GuardedBy("this")

    /* renamed from: h */
    private final zr2 f20448h;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable

    /* renamed from: i */
    public mb3<AppOpenAd> f20449i;

    protected im2(Context context, Executor executor, uv0 uv0, vo2<AppOpenRequestComponent, AppOpenAd> vo2, zm2 zm2, zr2 zr2) {
        this.f20441a = context;
        this.f20442b = executor;
        this.f20443c = uv0;
        this.f20445e = vo2;
        this.f20444d = zm2;
        this.f20448h = zr2;
        this.f20446f = new FrameLayout(context);
        this.f20447g = uv0.mo35283b();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized AppOpenRequestComponentBuilder m20583l(to2 to2) {
        hm2 hm2 = (hm2) to2;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37013W5)).booleanValue()) {
            j41 j41 = new j41(this.f20446f);
            w91 w91 = new w91();
            w91.mo35591c(this.f20441a);
            w91.mo35594f(hm2.f32759a);
            y91 g = w91.mo35595g();
            dg1 dg1 = new dg1();
            dg1.mo31243f(this.f20444d, this.f20442b);
            dg1.mo31252o(this.f20444d, this.f20442b);
            return mo18424b(j41, g, dg1.mo31254q());
        }
        zm2 a = zm2.m40383a(this.f20444d);
        dg1 dg12 = new dg1();
        dg12.mo31242e(a, this.f20442b);
        dg12.mo31247j(a, this.f20442b);
        dg12.mo31248k(a, this.f20442b);
        dg12.mo31249l(a, this.f20442b);
        dg12.mo31243f(a, this.f20442b);
        dg12.mo31252o(a, this.f20442b);
        dg12.mo31253p(a);
        j41 j412 = new j41(this.f20446f);
        w91 w912 = new w91();
        w912.mo35591c(this.f20441a);
        w912.mo35594f(hm2.f32759a);
        return mo18424b(j412, w912.mo35595g(), dg12.mo31254q());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo18423a(com.google.android.gms.internal.ads.zzbfd r5, java.lang.String r6, com.google.android.gms.internal.ads.rc2 r7, com.google.android.gms.internal.ads.sc2<? super AppOpenAd> r8) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r7 = r4.f20441a     // Catch:{ all -> 0x00a3 }
            r0 = 7
            com.google.android.gms.internal.ads.ex2 r7 = com.google.android.gms.internal.ads.ex2.m31961p(r7, r0, r0, r5)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C4604n.m20093f(r0)     // Catch:{ all -> 0x00a3 }
            r0 = 0
            if (r6 != 0) goto L_0x002f
            java.lang.String r5 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.internal.ads.co0.zzg(r5)     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.Executor r5 = r4.f20442b     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.dm2 r6 = new com.google.android.gms.internal.ads.dm2     // Catch:{ all -> 0x00a3 }
            r6.<init>(r4)     // Catch:{ all -> 0x00a3 }
            r5.execute(r6)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.gx2 r5 = r4.f20447g     // Catch:{ all -> 0x00a3 }
            r7.mo31676g(r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.fx2 r6 = r7.mo31678i()     // Catch:{ all -> 0x00a3 }
            r5.mo32302a(r6)     // Catch:{ all -> 0x00a3 }
        L_0x002d:
            monitor-exit(r4)
            return r0
        L_0x002f:
            com.google.android.gms.internal.ads.mb3<AppOpenAd> r1 = r4.f20449i     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0043
            if (r7 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.gx2 r5 = r4.f20447g     // Catch:{ all -> 0x00a3 }
            r7.mo31676g(r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.fx2 r6 = r7.mo31678i()     // Catch:{ all -> 0x00a3 }
            r5.mo32302a(r6)     // Catch:{ all -> 0x00a3 }
        L_0x0041:
            monitor-exit(r4)
            return r0
        L_0x0043:
            android.content.Context r0 = r4.f20441a     // Catch:{ all -> 0x00a3 }
            boolean r1 = r5.f42945g     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.qs2.m36699a(r0, r1)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36838A6     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a3 }
            r1 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r5.f42945g     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.uv0 r0 = r4.f20443c     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ly1 r0 = r0.mo35297s()     // Catch:{ all -> 0x00a3 }
            r0.mo33432l(r1)     // Catch:{ all -> 0x00a3 }
        L_0x006a:
            com.google.android.gms.internal.ads.zr2 r0 = r4.f20448h     // Catch:{ all -> 0x00a3 }
            r0.mo36103H(r6)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbfi r6 = com.google.android.gms.internal.ads.zzbfi.m40642D0()     // Catch:{ all -> 0x00a3 }
            r0.mo36102G(r6)     // Catch:{ all -> 0x00a3 }
            r0.mo36114d(r5)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.bs2 r5 = r0.mo36116f()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.hm2 r6 = new com.google.android.gms.internal.ads.hm2     // Catch:{ all -> 0x00a3 }
            r0 = 0
            r6.<init>(r0)     // Catch:{ all -> 0x00a3 }
            r6.f32759a = r5     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.vo2<AppOpenRequestComponent, AppOpenAd> r5 = r4.f20445e     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.wo2 r2 = new com.google.android.gms.internal.ads.wo2     // Catch:{ all -> 0x00a3 }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.cm2 r3 = new com.google.android.gms.internal.ads.cm2     // Catch:{ all -> 0x00a3 }
            r3.<init>(r4)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.mb3 r5 = r5.mo30442a(r2, r3, r0)     // Catch:{ all -> 0x00a3 }
            r4.f20449i = r5     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.fm2 r0 = new com.google.android.gms.internal.ads.fm2     // Catch:{ all -> 0x00a3 }
            r0.<init>(r4, r8, r7, r6)     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.Executor r6 = r4.f20442b     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.bb3.m30658r(r5, r0, r6)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r4)
            return r1
        L_0x00a3:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.im2.mo18423a(com.google.android.gms.internal.ads.zzbfd, java.lang.String, com.google.android.gms.internal.ads.rc2, com.google.android.gms.internal.ads.sc2):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AppOpenRequestComponentBuilder mo18424b(j41 j41, y91 y91, fg1 fg1);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo18425j() {
        this.f20444d.mo18436d(us2.m38446d(6, (String) null, (zzbew) null));
    }

    /* renamed from: k */
    public final void mo18426k(zzbfo zzbfo) {
        this.f20448h.mo36104I(zzbfo);
    }

    public final boolean zza() {
        mb3<AppOpenAd> mb3 = this.f20449i;
        return mb3 != null && !mb3.isDone();
    }
}
