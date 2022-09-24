package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.yy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4632yy {
    @GuardedBy("InternalMobileAds.class")

    /* renamed from: i */
    private static C4632yy f21021i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ArrayList<OnInitializationCompleteListener> f21022a = new ArrayList<>();

    /* renamed from: b */
    private final Object f21023b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    private C7846jx f21024c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21025d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f21026e = false;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public OnAdInspectorClosedListener f21027f = null;

    /* renamed from: g */
    private RequestConfiguration f21028g = new RequestConfiguration.Builder().build();

    /* renamed from: h */
    private InitializationStatus f21029h;

    private C4632yy() {
    }

    /* renamed from: f */
    public static C4632yy m21230f() {
        C4632yy yyVar;
        synchronized (C4632yy.class) {
            if (f21021i == null) {
                f21021i = new C4632yy();
            }
            yyVar = f21021i;
        }
        return yyVar;
    }

    @GuardedBy("lock")
    /* renamed from: v */
    private final void m21234v(Context context) {
        if (this.f21024c == null) {
            this.f21024c = (C7846jx) new C7956mv(C8241uv.m38462a(), context).mo35040d(context, false);
        }
    }

    @GuardedBy("lock")
    /* renamed from: w */
    private final void m21235w(RequestConfiguration requestConfiguration) {
        try {
            this.f21024c.mo31981t0(new zzbkk(requestConfiguration));
        } catch (RemoteException e) {
            co0.zzh("Unable to set request configuration parcel.", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final InitializationStatus m21236x(List<zzbtn> list) {
        HashMap hashMap = new HashMap();
        for (zzbtn next : list) {
            hashMap.put(next.f43012b, new f90(next.f43013c ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, next.f43015e, next.f43014d));
        }
        return new g90(hashMap);
    }

    /* renamed from: a */
    public final float mo19012a() {
        float f;
        synchronized (this.f21023b) {
            C7846jx jxVar = this.f21024c;
            f = 1.0f;
            if (jxVar == null) {
                return 1.0f;
            }
            try {
                f = jxVar.zze();
            } catch (RemoteException e) {
                co0.zzh("Unable to get app volume.", e);
            }
        }
        return f;
    }

    /* renamed from: c */
    public final RequestConfiguration mo19013c() {
        return this.f21028g;
    }

    /* renamed from: e */
    public final InitializationStatus mo19014e() {
        synchronized (this.f21023b) {
            C4604n.m20102o(this.f21024c != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                InitializationStatus initializationStatus = this.f21029h;
                if (initializationStatus != null) {
                    return initializationStatus;
                }
                InitializationStatus x = m21236x(this.f21024c.zzg());
                return x;
            } catch (RemoteException unused) {
                co0.zzg("Unable to get Initialization status.");
                return new C8138ry(this);
            }
        }
    }

    /* renamed from: g */
    public final String mo19015g() {
        String c;
        synchronized (this.f21023b) {
            C4604n.m20102o(this.f21024c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                c = m43.m20696c(this.f21024c.zzf());
            } catch (RemoteException e) {
                co0.zzh("Unable to get version string.", e);
                return "";
            }
        }
        return c;
    }

    /* renamed from: k */
    public final void mo19016k(Context context) {
        synchronized (this.f21023b) {
            m21234v(context);
            try {
                this.f21024c.zzi();
            } catch (RemoteException unused) {
                co0.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19017l(android.content.Context r4, @javax.annotation.Nullable java.lang.String r5, @javax.annotation.Nullable com.google.android.gms.ads.initialization.OnInitializationCompleteListener r6) {
        /*
            r3 = this;
            java.lang.Object r5 = r3.f21023b
            monitor-enter(r5)
            boolean r0 = r3.f21025d     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0014
            if (r6 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.yy r4 = m21230f()     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList<com.google.android.gms.ads.initialization.OnInitializationCompleteListener> r4 = r4.f21022a     // Catch:{ all -> 0x00c2 }
            r4.add(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0012:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0014:
            boolean r0 = r3.f21026e     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0023
            if (r6 == 0) goto L_0x0021
            com.google.android.gms.ads.initialization.InitializationStatus r4 = r3.mo19014e()     // Catch:{ all -> 0x00c2 }
            r6.onInitializationComplete(r4)     // Catch:{ all -> 0x00c2 }
        L_0x0021:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0023:
            r0 = 1
            r3.f21025d = r0     // Catch:{ all -> 0x00c2 }
            if (r6 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.yy r0 = m21230f()     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList<com.google.android.gms.ads.initialization.OnInitializationCompleteListener> r0 = r0.f21022a     // Catch:{ all -> 0x00c2 }
            r0.add(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0031:
            if (r4 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.mc0 r0 = com.google.android.gms.internal.ads.mc0.m34753a()     // Catch:{ RemoteException -> 0x00b2 }
            r1 = 0
            r0.mo33525b(r4, r1)     // Catch:{ RemoteException -> 0x00b2 }
            r3.m21234v(r4)     // Catch:{ RemoteException -> 0x00b2 }
            if (r6 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.jx r0 = r3.f21024c     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.xy r2 = new com.google.android.gms.internal.ads.xy     // Catch:{ RemoteException -> 0x00b2 }
            r2.<init>(r3, r1)     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo31977c2(r2)     // Catch:{ RemoteException -> 0x00b2 }
        L_0x004a:
            com.google.android.gms.internal.ads.jx r0 = r3.f21024c     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.qc0 r2 = new com.google.android.gms.internal.ads.qc0     // Catch:{ RemoteException -> 0x00b2 }
            r2.<init>()     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo31979j5(r2)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.jx r0 = r3.f21024c     // Catch:{ RemoteException -> 0x00b2 }
            r0.zzj()     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.jx r0 = r3.f21024c     // Catch:{ RemoteException -> 0x00b2 }
            d5.a r2 = p198d5.C10489b.m48195m6(r1)     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo31973M3(r1, r2)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.ads.RequestConfiguration r0 = r3.f21028g     // Catch:{ RemoteException -> 0x00b2 }
            int r0 = r0.getTagForChildDirectedTreatment()     // Catch:{ RemoteException -> 0x00b2 }
            r1 = -1
            if (r0 != r1) goto L_0x0073
            com.google.android.gms.ads.RequestConfiguration r0 = r3.f21028g     // Catch:{ RemoteException -> 0x00b2 }
            int r0 = r0.getTagForUnderAgeOfConsent()     // Catch:{ RemoteException -> 0x00b2 }
            if (r0 == r1) goto L_0x0078
        L_0x0073:
            com.google.android.gms.ads.RequestConfiguration r0 = r3.f21028g     // Catch:{ RemoteException -> 0x00b2 }
            r3.m21235w(r0)     // Catch:{ RemoteException -> 0x00b2 }
        L_0x0078:
            com.google.android.gms.internal.ads.p00.m35913c(r4)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.p00.f36955P3     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.Object r4 = r0.mo18570b(r4)     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ RemoteException -> 0x00b2 }
            boolean r4 = r4.booleanValue()     // Catch:{ RemoteException -> 0x00b2 }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = r3.mo19015g()     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.String r0 = "0"
            boolean r4 = r4.endsWith(r0)     // Catch:{ RemoteException -> 0x00b2 }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time."
            com.google.android.gms.internal.ads.co0.zzg(r4)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.ry r4 = new com.google.android.gms.internal.ads.ry     // Catch:{ RemoteException -> 0x00b2 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x00b2 }
            r3.f21029h = r4     // Catch:{ RemoteException -> 0x00b2 }
            if (r6 == 0) goto L_0x00b8
            android.os.Handler r4 = com.google.android.gms.internal.ads.vn0.f40472b     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.sy r0 = new com.google.android.gms.internal.ads.sy     // Catch:{ RemoteException -> 0x00b2 }
            r0.<init>(r3, r6)     // Catch:{ RemoteException -> 0x00b2 }
            r4.post(r0)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x00b8
        L_0x00b2:
            r4 = move-exception
            java.lang.String r6 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.co0.zzk(r6, r4)     // Catch:{ all -> 0x00c2 }
        L_0x00b8:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x00ba:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "Context cannot be null."
            r4.<init>(r6)     // Catch:{ all -> 0x00c2 }
            throw r4     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4632yy.mo19017l(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo19018m(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.f21029h);
    }

    /* renamed from: n */
    public final void mo19019n(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f21023b) {
            m21234v(context);
            m21230f().f21027f = onAdInspectorClosedListener;
            try {
                this.f21024c.mo31978g5(new C4628vy((C8244uy) null));
            } catch (RemoteException unused) {
                co0.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo19020o(Context context, String str) {
        synchronized (this.f21023b) {
            C4604n.m20102o(this.f21024c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f21024c.mo31974R1(C10489b.m48195m6(context), str);
            } catch (RemoteException e) {
                co0.zzh("Unable to open debug menu.", e);
            }
        }
    }

    /* renamed from: p */
    public final void mo19021p(Class<? extends RtbAdapter> cls) {
        synchronized (this.f21023b) {
            try {
                this.f21024c.mo31982w(cls.getCanonicalName());
            } catch (RemoteException e) {
                co0.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    /* renamed from: q */
    public final void mo19022q(WebView webView) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        synchronized (this.f21023b) {
            if (webView == null) {
                co0.zzg("The webview to be registered cannot be null.");
                return;
            }
            wm0 a = qh0.m36474a(webView.getContext());
            if (a == null) {
                co0.zzj("Internal error, query info generator is null.");
                return;
            }
            try {
                a.zzg(C10489b.m48195m6(webView));
            } catch (RemoteException e) {
                co0.zzh("", e);
            }
        }
    }

    /* renamed from: r */
    public final void mo19023r(boolean z) {
        synchronized (this.f21023b) {
            C4604n.m20102o(this.f21024c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f21024c.mo31975a0(z);
            } catch (RemoteException e) {
                co0.zzh("Unable to set app mute state.", e);
            }
        }
    }

    /* renamed from: s */
    public final void mo19024s(float f) {
        boolean z = true;
        C4604n.m20089b(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f21023b) {
            if (this.f21024c == null) {
                z = false;
            }
            C4604n.m20102o(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f21024c.mo31983w5(f);
            } catch (RemoteException e) {
                co0.zzh("Unable to set app volume.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19025t(com.google.android.gms.ads.RequestConfiguration r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.C4604n.m20089b(r0, r1)
            java.lang.Object r0 = r4.f21023b
            monitor-enter(r0)
            com.google.android.gms.ads.RequestConfiguration r1 = r4.f21028g     // Catch:{ all -> 0x0030 }
            r4.f21028g = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.jx r2 = r4.f21024c     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            int r3 = r5.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            int r2 = r5.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.m21235w(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4632yy.mo19025t(com.google.android.gms.ads.RequestConfiguration):void");
    }

    /* renamed from: u */
    public final boolean mo19026u() {
        boolean z;
        synchronized (this.f21023b) {
            C7846jx jxVar = this.f21024c;
            z = false;
            if (jxVar == null) {
                return false;
            }
            try {
                z = jxVar.zzt();
            } catch (RemoteException e) {
                co0.zzh("Unable to get app mute state.", e);
            }
        }
        return z;
    }
}
