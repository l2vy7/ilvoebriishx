package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashSet;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.in */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7801in implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: q */
    private static final long f33327q = ((Long) C8311wv.m39277c().mo18570b(p00.f37016X0)).longValue();

    /* renamed from: b */
    private final Context f33328b;

    /* renamed from: c */
    private Application f33329c;

    /* renamed from: d */
    private final WindowManager f33330d;

    /* renamed from: e */
    private final PowerManager f33331e;

    /* renamed from: f */
    private final KeyguardManager f33332f;

    /* renamed from: g */
    BroadcastReceiver f33333g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f33334h;

    /* renamed from: i */
    final WeakReference<View> f33335i;

    /* renamed from: j */
    private C8233un f33336j;

    /* renamed from: k */
    private final zzcd f33337k = new zzcd(f33327q);

    /* renamed from: l */
    private boolean f33338l = false;

    /* renamed from: m */
    private int f33339m = -1;

    /* renamed from: n */
    private final HashSet<C7763hn> f33340n = new HashSet<>();

    /* renamed from: o */
    private final DisplayMetrics f33341o;

    /* renamed from: p */
    private final Rect f33342p;

    public C7801in(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f33328b = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f33330d = windowManager;
        this.f33331e = (PowerManager) applicationContext.getSystemService("power");
        this.f33332f = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f33329c = application;
            this.f33336j = new C8233un(application, this);
        }
        this.f33341o = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f33342p = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f33335i;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m33317m(view2);
        }
        this.f33335i = new WeakReference<>(view);
        if (view != null) {
            if (zzt.zzq().zzi(view)) {
                m33316l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: h */
    private final int m33312h(int i) {
        return (int) (((float) i) / this.f33341o.density);
    }

    /* renamed from: i */
    private final void m33313i(Activity activity, int i) {
        Window window;
        if (this.f33335i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f33335i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f33339m = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012b, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m33314j(int r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.util.HashSet<com.google.android.gms.internal.ads.hn> r0 = r1.f33340n
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f33335i
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r0 = new int[r0]
            r9 = 0
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0069
            boolean r12 = r3.getGlobalVisibleRect(r5)
            boolean r13 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch:{ Exception -> 0x0049 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r0 = move-exception
            java.lang.String r14 = "Failure getting view location."
            com.google.android.gms.internal.ads.co0.zzh(r14, r0)
        L_0x004f:
            r0 = r8[r11]
            r4.left = r0
            r8 = r8[r10]
            r4.top = r8
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L_0x006c
        L_0x0069:
            r8 = r9
            r12 = 0
            r13 = 0
        L_0x006c:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37041a1
            com.google.android.gms.internal.ads.n00 r14 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r14.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00bd
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ae }
            r0.<init>()     // Catch:{ Exception -> 0x00ae }
            android.view.ViewParent r14 = r8.getParent()     // Catch:{ Exception -> 0x00ae }
        L_0x0089:
            boolean r15 = r14 instanceof android.view.View     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00c1
            r15 = r14
            android.view.View r15 = (android.view.View) r15     // Catch:{ Exception -> 0x00ae }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ae }
            r11.<init>()     // Catch:{ Exception -> 0x00ae }
            boolean r17 = r15.isScrollContainer()     // Catch:{ Exception -> 0x00ae }
            if (r17 == 0) goto L_0x00a8
            boolean r15 = r15.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00a8
            android.graphics.Rect r11 = r1.mo32702a(r11)     // Catch:{ Exception -> 0x00ae }
            r0.add(r11)     // Catch:{ Exception -> 0x00ae }
        L_0x00a8:
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00ae }
            r11 = 0
            goto L_0x0089
        L_0x00ae:
            r0 = move-exception
            com.google.android.gms.internal.ads.nn0 r11 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r14 = "PositionWatcher.getParentScrollViewRects"
            r11.mo18592s(r0, r14)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00c1
        L_0x00bd:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00c1:
            r31 = r0
            r0 = 8
            if (r8 == 0) goto L_0x00cc
            int r11 = r8.getWindowVisibility()
            goto L_0x00ce
        L_0x00cc:
            r11 = 8
        L_0x00ce:
            int r14 = r1.f33339m
            r15 = -1
            if (r14 == r15) goto L_0x00d4
            r11 = r14
        L_0x00d4:
            com.google.android.gms.ads.internal.zzt.zzp()
            long r26 = com.google.android.gms.ads.internal.util.zzt.zzA(r8)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.p00.f37056b7
            com.google.android.gms.internal.ads.n00 r15 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r14 = r15.mo18570b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0118
            if (r3 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.zzt.zzp()
            android.os.PowerManager r3 = r1.f33331e
            android.app.KeyguardManager r14 = r1.f33332f
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzX(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r3 = com.google.android.gms.internal.ads.p00.f37083e7
            com.google.android.gms.internal.ads.n00 r14 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r14.mo18570b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r14 = (long) r3
            int r3 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
            goto L_0x012d
        L_0x0118:
            if (r3 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.zzt.zzp()
            android.os.PowerManager r3 = r1.f33331e
            android.app.KeyguardManager r14 = r1.f33332f
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzX(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
        L_0x012d:
            r3 = 1
            r11 = 0
            goto L_0x0131
        L_0x0130:
            r3 = 0
        L_0x0131:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.p00.f37101g7
            com.google.android.gms.internal.ads.n00 r15 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r14 = r15.mo18570b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x018a
            com.google.android.gms.ads.internal.zzt.zzp()
            android.os.PowerManager r14 = r1.f33331e
            android.app.KeyguardManager r15 = r1.f33332f
            boolean r14 = com.google.android.gms.ads.internal.util.zzt.zzX(r8, r14, r15)
            if (r10 == r14) goto L_0x0152
            r14 = 0
            goto L_0x0154
        L_0x0152:
            r14 = 64
        L_0x0154:
            if (r10 == r12) goto L_0x0158
            r15 = 0
            goto L_0x015a
        L_0x0158:
            r15 = 8
        L_0x015a:
            r14 = r14 | r15
            if (r10 == r13) goto L_0x015f
            r15 = 0
            goto L_0x0161
        L_0x015f:
            r15 = 16
        L_0x0161:
            r14 = r14 | r15
            if (r11 != 0) goto L_0x0167
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0168
        L_0x0167:
            r11 = 0
        L_0x0168:
            r11 = r11 | r14
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r14 = com.google.android.gms.internal.ads.p00.f37083e7
            com.google.android.gms.internal.ads.n00 r15 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r14 = r15.mo18570b(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            long r14 = (long) r14
            int r17 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r17 < 0) goto L_0x0181
            r14 = 32
            goto L_0x0182
        L_0x0181:
            r14 = 0
        L_0x0182:
            com.google.android.gms.ads.internal.zzt.zzp()
            r11 = r11 | r14
            r11 = r11 | r3
            com.google.android.gms.ads.internal.util.zzt.zzN(r8, r11, r9)
        L_0x018a:
            if (r2 != r10) goto L_0x019a
            com.google.android.gms.ads.internal.util.zzcd r9 = r1.f33337k
            boolean r9 = r9.zzb()
            if (r9 != 0) goto L_0x019a
            boolean r9 = r1.f33338l
            if (r3 == r9) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            return
        L_0x019a:
            if (r3 != 0) goto L_0x01a4
            boolean r9 = r1.f33338l
            if (r9 != 0) goto L_0x01a4
            if (r2 == r10) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            return
        L_0x01a4:
            com.google.android.gms.internal.ads.fn r2 = new com.google.android.gms.internal.ads.fn
            a5.e r9 = com.google.android.gms.ads.internal.zzt.zzA()
            long r17 = r9.elapsedRealtime()
            android.os.PowerManager r9 = r1.f33331e
            boolean r9 = r9.isScreenOn()
            if (r8 == 0) goto L_0x01c1
            com.google.android.gms.ads.internal.util.zzae r11 = com.google.android.gms.ads.internal.zzt.zzq()
            boolean r11 = r11.zzi(r8)
            if (r11 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            r10 = 0
        L_0x01c2:
            if (r8 == 0) goto L_0x01cb
            int r0 = r8.getWindowVisibility()
            r19 = r0
            goto L_0x01cd
        L_0x01cb:
            r19 = 8
        L_0x01cd:
            android.graphics.Rect r0 = r1.f33342p
            android.graphics.Rect r20 = r1.mo32702a(r0)
            android.graphics.Rect r21 = r1.mo32702a(r4)
            android.graphics.Rect r22 = r1.mo32702a(r5)
            android.graphics.Rect r24 = r1.mo32702a(r6)
            android.graphics.Rect r28 = r1.mo32702a(r7)
            android.util.DisplayMetrics r0 = r1.f33341o
            float r0 = r0.density
            r29 = r0
            r14 = r2
            r15 = r17
            r17 = r9
            r18 = r10
            r23 = r12
            r25 = r13
            r30 = r3
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            java.util.HashSet<com.google.android.gms.internal.ads.hn> r0 = r1.f33340n
            java.util.Iterator r0 = r0.iterator()
        L_0x01ff:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x020f
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.ads.hn r4 = (com.google.android.gms.internal.ads.C7763hn) r4
            r4.mo18767n0(r2)
            goto L_0x01ff
        L_0x020f:
            r1.f33338l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7801in.m33314j(int):void");
    }

    /* renamed from: k */
    private final void m33315k() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new C7615dn(this));
    }

    /* renamed from: l */
    private final void m33316l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f33334h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f33333g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f33333g = new C7652en(this);
            zzt.zzv().zzc(this.f33328b, this.f33333g, intentFilter);
        }
        Application application = this.f33329c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f33336j);
            } catch (Exception e) {
                co0.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: m */
    private final void m33317m(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f33334h;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f33334h = null;
            }
        } catch (Exception e) {
            co0.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            co0.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f33333g != null) {
            try {
                zzt.zzv().zzd(this.f33328b, this.f33333g);
            } catch (IllegalStateException e3) {
                co0.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzt.zzo().mo18592s(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f33333g = null;
        }
        Application application = this.f33329c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f33336j);
            } catch (Exception e5) {
                co0.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Rect mo32702a(Rect rect) {
        return new Rect(m33312h(rect.left), m33312h(rect.top), m33312h(rect.right), m33312h(rect.bottom));
    }

    /* renamed from: c */
    public final void mo32703c(C7763hn hnVar) {
        this.f33340n.add(hnVar);
        m33314j(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo32704d() {
        m33314j(3);
    }

    /* renamed from: e */
    public final void mo32705e(C7763hn hnVar) {
        this.f33340n.remove(hnVar);
    }

    /* renamed from: f */
    public final void mo32706f() {
        this.f33337k.zza(f33327q);
    }

    /* renamed from: g */
    public final void mo32707g(long j) {
        this.f33337k.zza(j);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m33313i(activity, 0);
        m33314j(3);
        m33315k();
    }

    public final void onActivityDestroyed(Activity activity) {
        m33314j(3);
        m33315k();
    }

    public final void onActivityPaused(Activity activity) {
        m33313i(activity, 4);
        m33314j(3);
        m33315k();
    }

    public final void onActivityResumed(Activity activity) {
        m33313i(activity, 0);
        m33314j(3);
        m33315k();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m33314j(3);
        m33315k();
    }

    public final void onActivityStarted(Activity activity) {
        m33313i(activity, 0);
        m33314j(3);
        m33315k();
    }

    public final void onActivityStopped(Activity activity) {
        m33314j(3);
        m33315k();
    }

    public final void onGlobalLayout() {
        m33314j(2);
        m33315k();
    }

    public final void onScrollChanged() {
        m33314j(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f33339m = -1;
        m33316l(view);
        m33314j(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f33339m = -1;
        m33314j(3);
        m33315k();
        m33317m(view);
    }
}
