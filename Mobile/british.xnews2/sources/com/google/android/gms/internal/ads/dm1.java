package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p149t.C6077a;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dm1 extends o61 {

    /* renamed from: A */
    private final Context f30835A;

    /* renamed from: B */
    private final fm1 f30836B;

    /* renamed from: C */
    private final gc2 f30837C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Map<String, Boolean> f30838D = new HashMap();

    /* renamed from: E */
    private final List<C7801in> f30839E = new ArrayList();

    /* renamed from: F */
    private final C7837jn f30840F;

    /* renamed from: i */
    private final Executor f30841i;

    /* renamed from: j */
    private final im1 f30842j;

    /* renamed from: k */
    private final qm1 f30843k;

    /* renamed from: l */
    private final in1 f30844l;

    /* renamed from: m */
    private final nm1 f30845m;

    /* renamed from: n */
    private final tm1 f30846n;

    /* renamed from: o */
    private final ou3<mq1> f30847o;

    /* renamed from: p */
    private final ou3<kq1> f30848p;

    /* renamed from: q */
    private final ou3<rq1> f30849q;

    /* renamed from: r */
    private final ou3<hq1> f30850r;

    /* renamed from: s */
    private final ou3<pq1> f30851s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public do1 f30852t;

    /* renamed from: u */
    private boolean f30853u;

    /* renamed from: v */
    private boolean f30854v;

    /* renamed from: w */
    private boolean f30855w;

    /* renamed from: x */
    private final sl0 f30856x;

    /* renamed from: y */
    private final C7497ab f30857y;

    /* renamed from: z */
    private final zzcjf f30858z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm1(n61 n61, Executor executor, im1 im1, qm1 qm1, in1 in1, nm1 nm1, tm1 tm1, ou3<mq1> ou3, ou3<kq1> ou32, ou3<rq1> ou33, ou3<hq1> ou34, ou3<pq1> ou35, sl0 sl0, C7497ab abVar, zzcjf zzcjf, Context context, fm1 fm1, gc2 gc2, C7837jn jnVar) {
        super(n61);
        this.f30841i = executor;
        this.f30842j = im1;
        this.f30843k = qm1;
        this.f30844l = in1;
        this.f30845m = nm1;
        this.f30846n = tm1;
        this.f30847o = ou3;
        this.f30848p = ou32;
        this.f30849q = ou33;
        this.f30850r = ou34;
        this.f30851s = ou35;
        this.f30856x = sl0;
        this.f30857y = abVar;
        this.f30858z = zzcjf;
        this.f30835A = context;
        this.f30836B = fm1;
        this.f30837C = gc2;
        this.f30840F = jnVar;
    }

    /* renamed from: G */
    public static /* synthetic */ void m31476G(dm1 dm1) {
        try {
            int K = dm1.f30842j.mo32651K();
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 6) {
                            if (K != 7) {
                                co0.zzg("Wrong native template id!");
                            } else if (dm1.f30846n.mo34985g() != null) {
                                dm1.f30846n.mo34985g().mo34095B0(dm1.f30850r.zzb());
                            }
                        } else if (dm1.f30846n.mo34984f() != null) {
                            dm1.mo31300J("Google", true);
                            dm1.f30846n.mo34984f().mo30311Z3(dm1.f30849q.zzb());
                        }
                    } else if (dm1.f30846n.mo34982d(dm1.f30842j.mo32679g0()) != null) {
                        if (dm1.f30842j.mo32666Z() != null) {
                            dm1.mo31300J("Google", true);
                        }
                        dm1.f30846n.mo34982d(dm1.f30842j.mo32679g0()).mo31572c4(dm1.f30851s.zzb());
                    }
                } else if (dm1.f30846n.mo34979a() != null) {
                    dm1.mo31300J("Google", true);
                    dm1.f30846n.mo34979a().mo33626u4(dm1.f30848p.zzb());
                }
            } else if (dm1.f30846n.mo34980b() != null) {
                dm1.mo31300J("Google", true);
                dm1.f30846n.mo34980b().mo34234T2(dm1.f30847o.zzb());
            }
        } catch (RemoteException e) {
            co0.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* renamed from: w */
    public static boolean m31477w(View view) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37074d7)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        zzt.zzp();
        long zzA = com.google.android.gms.ads.internal.util.zzt.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (zzA >= ((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37083e7)).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final synchronized void mo31303M(do1 do1) {
        View view;
        C8291wa c;
        if (!this.f30853u) {
            this.f30852t = do1;
            this.f30844l.mo32732e(do1);
            this.f30843k.mo18365f(do1.zzf(), do1.zzm(), do1.zzn(), do1, do1);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36961Q1)).booleanValue() && (c = this.f30857y.mo30331c()) != null) {
                c.zzn(do1.zzf());
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37149m1)).booleanValue()) {
                ir2 ir2 = this.f36294b;
                if (ir2.f33481i0) {
                    Iterator<String> keys = ir2.f33479h0.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = this.f30852t.zzl().get(next);
                            this.f30838D.put(next, Boolean.FALSE);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                C7801in inVar = new C7801in(this.f30835A, view);
                                this.f30839E.add(inVar);
                                inVar.mo32703c(new cm1(this, next));
                            }
                        }
                    }
                }
            }
            if (do1.zzi() != null) {
                do1.zzi().mo32703c(this.f30856x);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void mo31304N(do1 do1) {
        this.f30843k.mo18372m(do1.zzf(), do1.zzl());
        if (do1.zzh() != null) {
            do1.zzh().setClickable(false);
            do1.zzh().removeAllViews();
        }
        if (do1.zzi() != null) {
            do1.zzi().mo32705e(this.f30856x);
        }
        this.f30852t = null;
    }

    /* renamed from: A */
    public final fm1 mo31294A() {
        return this.f30836B;
    }

    /* renamed from: C */
    public final String mo31295C() {
        return this.f30845m.mo33562a();
    }

    /* renamed from: E */
    public final synchronized JSONObject mo31296E(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f30843k.mo18360a(view, map, map2);
    }

    /* renamed from: F */
    public final synchronized JSONObject mo31297F(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f30843k.mo18375p(view, map, map2);
    }

    /* renamed from: H */
    public final void mo31298H(View view) {
        C10487a c0 = this.f30842j.mo32671c0();
        if (this.f30845m.mo33564c() && c0 != null && view != null) {
            zzt.zzh().mo34050g(c0, view);
        }
    }

    /* renamed from: I */
    public final synchronized void mo31299I() {
        this.f30843k.zzg();
    }

    /* renamed from: J */
    public final void mo31300J(String str, boolean z) {
        String str2;
        tg0 tg0;
        ug0 ug0;
        if (this.f30845m.mo33564c() && !TextUtils.isEmpty(str)) {
            xt0 Y = this.f30842j.mo32665Y();
            xt0 Z = this.f30842j.mo32666Z();
            if (Y != null || Z != null) {
                if (Y != null) {
                    str2 = null;
                } else {
                    str2 = "javascript";
                    Y = Z;
                }
                String str3 = str2;
                if (!zzt.zzh().mo34049f(this.f30835A)) {
                    co0.zzj("Failed to initialize omid in InternalNativeAd");
                    return;
                }
                zzcjf zzcjf = this.f30858z;
                int i = zzcjf.f43037c;
                int i2 = zzcjf.f43038d;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String sb2 = sb.toString();
                if (Z != null) {
                    tg0 = tg0.VIDEO;
                    ug0 = ug0.DEFINED_BY_JAVASCRIPT;
                } else {
                    tg0 = tg0.NATIVE_DISPLAY;
                    if (this.f30842j.mo32651K() == 3) {
                        ug0 = ug0.UNSPECIFIED;
                    } else {
                        ug0 = ug0.ONE_PIXEL;
                    }
                }
                C10487a e = zzt.zzh().mo34048e(sb2, Y.zzI(), "", "javascript", str3, str, ug0, tg0, this.f36294b.f33483j0);
                if (e == null) {
                    co0.zzj("Failed to create omid session in InternalNativeAd");
                    return;
                }
                this.f30842j.mo32649B(e);
                Y.mo18741b0(e);
                if (Z != null) {
                    zzt.zzh().mo34046c(e, Z.mo18790t());
                    this.f30855w = true;
                }
                if (z) {
                    zzt.zzh().zzh(e);
                    Y.mo18321Z("onSdkLoaded", new C6077a());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo31301K() {
        this.f30843k.zzh();
        this.f30842j.mo32678g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo31302L(boolean z) {
        this.f30843k.mo18374o(this.f30852t.zzf(), this.f30852t.zzl(), this.f30852t.zzm(), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        return;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31305O(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f30854v     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37149m1     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.ir2 r0 = r3.f36294b     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.f33481i0     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r3.f30838D     // Catch:{ all -> 0x00a6 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00a6 }
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r3.f30838D     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            r0 = 1
            if (r7 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.in1 r7 = r3.f30844l     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.do1 r1 = r3.f30852t     // Catch:{ all -> 0x00a6 }
            r7.mo32731d(r1)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.qm1 r7 = r3.f30843k     // Catch:{ all -> 0x00a6 }
            r7.mo18368i(r4, r5, r6)     // Catch:{ all -> 0x00a6 }
            r3.f30854v = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)
            return
        L_0x0058:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.p00.f37244x2     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r7 = r1.mo18570b(r7)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00a6 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r7 == 0) goto L_0x00a4
            if (r5 == 0) goto L_0x00a4
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0074:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00a6 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00a6 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00a6 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0074
            boolean r1 = m31477w(r1)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0074
            com.google.android.gms.internal.ads.in1 r7 = r3.f30844l     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.do1 r1 = r3.f30852t     // Catch:{ all -> 0x00a6 }
            r7.mo32731d(r1)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.qm1 r7 = r3.f30843k     // Catch:{ all -> 0x00a6 }
            r7.mo18368i(r4, r5, r6)     // Catch:{ all -> 0x00a6 }
            r3.f30854v = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)
            return
        L_0x00a4:
            monitor-exit(r3)
            return
        L_0x00a6:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x00aa
        L_0x00a9:
            throw r4
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dm1.mo31305O(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: P */
    public final synchronized void mo31306P(C8137rx rxVar) {
        this.f30843k.mo18370k(rxVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        return;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31307Q(android.view.View r9, android.view.View r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r12, boolean r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.in1 r0 = r8.f30844l     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.do1 r1 = r8.f30852t     // Catch:{ all -> 0x0033 }
            r0.mo32730c(r1)     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.qm1 r2 = r8.f30843k     // Catch:{ all -> 0x0033 }
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.mo18363d(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0033 }
            boolean r9 = r8.f30855w     // Catch:{ all -> 0x0033 }
            if (r9 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.im1 r9 = r8.f30842j     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.xt0 r9 = r9.mo32666Z()     // Catch:{ all -> 0x0033 }
            if (r9 != 0) goto L_0x001f
            goto L_0x0031
        L_0x001f:
            com.google.android.gms.internal.ads.im1 r9 = r8.f30842j     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.xt0 r9 = r9.mo32666Z()     // Catch:{ all -> 0x0033 }
            t.a r10 = new t.a     // Catch:{ all -> 0x0033 }
            r10.<init>()     // Catch:{ all -> 0x0033 }
            java.lang.String r11 = "onSdkAdUserInteractionClick"
            r9.mo18321Z(r11, r10)     // Catch:{ all -> 0x0033 }
            monitor-exit(r8)
            return
        L_0x0031:
            monitor-exit(r8)
            return
        L_0x0033:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dm1.mo31307Q(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: R */
    public final synchronized void mo31308R(String str) {
        this.f30843k.mo18362c(str);
    }

    /* renamed from: S */
    public final synchronized void mo31309S(Bundle bundle) {
        this.f30843k.mo18367h(bundle);
    }

    /* renamed from: a */
    public final synchronized void mo31310a() {
        this.f30853u = true;
        this.f30841i.execute(new wl1(this));
        super.mo31310a();
    }

    /* renamed from: b */
    public final void mo31311b() {
        this.f30841i.execute(new xl1(this));
        if (this.f30842j.mo32651K() != 7) {
            Executor executor = this.f30841i;
            qm1 qm1 = this.f30843k;
            qm1.getClass();
            executor.execute(new bm1(qm1));
        }
        super.mo31311b();
    }

    /* renamed from: h */
    public final synchronized void mo31312h() {
        do1 do1 = this.f30852t;
        if (do1 == null) {
            co0.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f30841i.execute(new am1(this, do1 instanceof bn1));
        }
    }

    /* renamed from: i */
    public final synchronized void mo31313i() {
        if (!this.f30854v) {
            this.f30843k.zzq();
        }
    }

    /* renamed from: j */
    public final void mo31314j(View view) {
        C10487a c0 = this.f30842j.mo32671c0();
        xt0 Y = this.f30842j.mo32665Y();
        if (this.f30845m.mo33564c() && c0 != null && Y != null && view != null) {
            zzt.zzh().mo34046c(c0, view);
        }
    }

    /* renamed from: k */
    public final synchronized void mo31315k(View view, MotionEvent motionEvent, View view2) {
        this.f30843k.mo18361b(view, motionEvent, view2);
    }

    /* renamed from: l */
    public final synchronized void mo31316l(Bundle bundle) {
        this.f30843k.mo18359T(bundle);
    }

    /* renamed from: m */
    public final synchronized void mo31317m(View view) {
        this.f30843k.mo18364e(view);
    }

    /* renamed from: n */
    public final synchronized void mo31318n() {
        this.f30843k.mo18373n();
    }

    /* renamed from: o */
    public final synchronized void mo31319o(C7994nx nxVar) {
        this.f30843k.mo18369j(nxVar);
    }

    /* renamed from: p */
    public final synchronized void mo31320p(C7555by byVar) {
        this.f30837C.mo18349a(byVar);
    }

    /* renamed from: q */
    public final synchronized void mo31321q(m50 m50) {
        this.f30843k.mo18371l(m50);
    }

    /* renamed from: r */
    public final synchronized void mo31322r(do1 do1) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37131k1)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new yl1(this, do1));
        } else {
            mo31303M(do1);
        }
    }

    /* renamed from: s */
    public final synchronized void mo31323s(do1 do1) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37131k1)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zl1(this, do1));
        } else {
            mo31304N(do1);
        }
    }

    /* renamed from: t */
    public final boolean mo31324t() {
        return this.f30845m.mo33565d();
    }

    /* renamed from: u */
    public final synchronized boolean mo31325u() {
        return this.f30843k.zzz();
    }

    /* renamed from: v */
    public final boolean mo31326v() {
        return this.f30845m.mo33564c();
    }

    /* renamed from: x */
    public final synchronized boolean mo31327x(Bundle bundle) {
        if (this.f30854v) {
            return true;
        }
        boolean g = this.f30843k.mo18366g(bundle);
        this.f30854v = g;
        return g;
    }
}
