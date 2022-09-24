package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.qb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8080qb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private final Application f37952b;

    /* renamed from: c */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f37953c;

    /* renamed from: d */
    private boolean f37954d = false;

    public C8080qb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f37953c = new WeakReference<>(activityLifecycleCallbacks);
        this.f37952b = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34293a(C8044pb pbVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f37953c.get();
            if (activityLifecycleCallbacks != null) {
                pbVar.mo32594a(activityLifecycleCallbacks);
            } else if (!this.f37954d) {
                this.f37952b.unregisterActivityLifecycleCallbacks(this);
                this.f37954d = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo34293a(new C7788ib(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo34293a(new C8009ob(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo34293a(new C7898lb(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo34293a(new C7861kb(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo34293a(new C7973nb(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo34293a(new C7825jb(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo34293a(new C7935mb(this, activity));
    }
}
