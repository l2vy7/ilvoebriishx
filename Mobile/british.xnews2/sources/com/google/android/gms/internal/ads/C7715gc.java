package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.gc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7715gc implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: n */
    private static final Handler f32228n = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f32229b;

    /* renamed from: c */
    private Application f32230c;

    /* renamed from: d */
    private final PowerManager f32231d;

    /* renamed from: e */
    private final KeyguardManager f32232e;

    /* renamed from: f */
    private BroadcastReceiver f32233f;

    /* renamed from: g */
    private final zzaml f32234g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f32235h;

    /* renamed from: i */
    private WeakReference<View> f32236i;

    /* renamed from: j */
    private C8080qb f32237j;

    /* renamed from: k */
    private byte f32238k = -1;

    /* renamed from: l */
    private int f32239l = -1;

    /* renamed from: m */
    private long f32240m = -3;

    public C7715gc(Context context, zzaml zzaml) {
        Context applicationContext = context.getApplicationContext();
        this.f32229b = applicationContext;
        this.f32234g = zzaml;
        this.f32231d = (PowerManager) applicationContext.getSystemService("power");
        this.f32232e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f32230c = application;
            this.f32237j = new C8080qb(application, this);
        }
        mo32053d((View) null);
    }

    /* renamed from: e */
    private final void m32409e(Activity activity, int i) {
        Window window;
        if (this.f32236i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b = mo32052b();
            if (b != null && peekDecorView != null && b.getRootView() == peekDecorView.getRootView()) {
                this.f32239l = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        if ((r5.flags & 524288) != 0) goto L_0x0060;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m32410f() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f32236i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r7.mo32052b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0013
            r7.f32240m = r2
            r7.f32238k = r1
            return
        L_0x0013:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L_0x0024
            r4 = r4 | 2
        L_0x0024:
            android.os.PowerManager r5 = r7.f32231d
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L_0x0030
            r4 = r4 | 4
        L_0x0030:
            com.google.android.gms.internal.ads.zzaml r5 = r7.f32234g
            boolean r5 = r5.mo36182a()
            if (r5 != 0) goto L_0x0060
            android.app.KeyguardManager r5 = r7.f32232e
            if (r5 == 0) goto L_0x005e
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x005e
            android.app.Activity r5 = com.google.android.gms.internal.ads.C7569cc.m30944b(r0)
            if (r5 != 0) goto L_0x0049
            goto L_0x005e
        L_0x0049:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L_0x0051
            r5 = 0
            goto L_0x0055
        L_0x0051:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L_0x0055:
            if (r5 == 0) goto L_0x005e
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L_0x0060
        L_0x005e:
            r4 = r4 | 8
        L_0x0060:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x006d
            r4 = r4 | 16
        L_0x006d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x007a
            r4 = r4 | 32
        L_0x007a:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.f32239l
            if (r5 == r1) goto L_0x0083
            r0 = r5
        L_0x0083:
            if (r0 == 0) goto L_0x0087
            r4 = r4 | 64
        L_0x0087:
            byte r0 = r7.f32238k
            if (r0 == r4) goto L_0x009a
            byte r0 = (byte) r4
            r7.f32238k = r0
            if (r4 != 0) goto L_0x0095
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0098
        L_0x0095:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x0098:
            r7.f32240m = r0
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7715gc.m32410f():void");
    }

    /* renamed from: g */
    private final void m32411g() {
        f32228n.post(new C7641ec(this));
    }

    /* renamed from: h */
    private final void m32412h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f32235h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f32233f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C7678fc fcVar = new C7678fc(this);
            this.f32233f = fcVar;
            this.f32229b.registerReceiver(fcVar, intentFilter);
        }
        Application application = this.f32230c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f32237j);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ Exception -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32413i(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f32235h     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001b }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001b }
            if (r2 == 0) goto L_0x0019
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001b }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001b }
        L_0x0019:
            r3.f32235h = r0     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002c }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002c }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f32233f
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.f32229b     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.f32233f = r0
        L_0x0038:
            android.app.Application r4 = r3.f32230c
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.qb r0 = r3.f32237j     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7715gc.m32413i(android.view.View):void");
    }

    /* renamed from: a */
    public final long mo32051a() {
        if (this.f32240m <= -2 && mo32052b() == null) {
            this.f32240m = -3;
        }
        return this.f32240m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final View mo32052b() {
        WeakReference<View> weakReference = this.f32236i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo32053d(View view) {
        long j;
        View b = mo32052b();
        if (b != null) {
            b.removeOnAttachStateChangeListener(this);
            m32413i(b);
        }
        this.f32236i = new WeakReference<>(view);
        if (view != null) {
            if (!(view.getWindowToken() == null && view.getWindowVisibility() == 8)) {
                m32412h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f32240m = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m32409e(activity, 0);
        m32410f();
    }

    public final void onActivityDestroyed(Activity activity) {
        m32410f();
    }

    public final void onActivityPaused(Activity activity) {
        m32409e(activity, 4);
        m32410f();
    }

    public final void onActivityResumed(Activity activity) {
        m32409e(activity, 0);
        m32410f();
        m32411g();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m32410f();
    }

    public final void onActivityStarted(Activity activity) {
        m32409e(activity, 0);
        m32410f();
    }

    public final void onActivityStopped(Activity activity) {
        m32410f();
    }

    public final void onGlobalLayout() {
        m32410f();
    }

    public final void onScrollChanged() {
        m32410f();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f32239l = -1;
        m32412h(view);
        m32410f();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f32239l = -1;
        m32410f();
        m32411g();
        m32413i(view);
    }
}
