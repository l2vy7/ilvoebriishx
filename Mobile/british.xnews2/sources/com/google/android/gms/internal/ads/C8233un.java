package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.un */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8233un implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private final Application f39897b;

    /* renamed from: c */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f39898c;

    /* renamed from: d */
    private boolean f39899d = false;

    public C8233un(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f39898c = new WeakReference<>(activityLifecycleCallbacks);
        this.f39897b = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35206a(C8197tn tnVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f39898c.get();
            if (activityLifecycleCallbacks != null) {
                tnVar.mo33569a(activityLifecycleCallbacks);
            } else if (!this.f39899d) {
                this.f39897b.unregisterActivityLifecycleCallbacks(this);
                this.f39899d = true;
            }
        } catch (Exception e) {
            co0.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo35206a(new C7947mn(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo35206a(new C8162sn(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo35206a(new C8056pn(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo35206a(new C8021on(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo35206a(new C8128rn(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo35206a(new C7985nn(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo35206a(new C8092qn(this, activity));
    }
}
