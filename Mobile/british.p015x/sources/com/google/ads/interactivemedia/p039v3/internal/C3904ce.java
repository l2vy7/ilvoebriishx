package com.google.ads.interactivemedia.p039v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ce */
/* compiled from: IMASDK */
final class C3904ce implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C3907ch f16810a;

    C3904ce(C3907ch chVar) {
        this.f16810a = chVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f16810a.f16816f == activity) {
            this.f16810a.f16816f = null;
            Application c = C4130ko.m17747c(this.f16810a.f16813c.getContext());
            if (c != null) {
                c.unregisterActivityLifecycleCallbacks(this.f16810a.f16815e);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f16810a.f16816f == null || this.f16810a.f16816f == activity) {
            this.f16810a.f16816f = activity;
            this.f16810a.f16811a.mo15717o(new C3949dw(C3947du.activityMonitor, C3948dv.appStateChanged, this.f16810a.f16812b, this.f16810a.mo15623f("", "", "inactive")));
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.f16810a.f16816f == activity) {
            this.f16810a.f16811a.mo15717o(new C3949dw(C3947du.activityMonitor, C3948dv.appStateChanged, this.f16810a.f16812b, this.f16810a.mo15623f("", "", "active")));
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
