package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.lb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7898lb implements C8044pb {

    /* renamed from: a */
    final /* synthetic */ Activity f34968a;

    C7898lb(C8080qb qbVar, Activity activity) {
        this.f34968a = activity;
    }

    /* renamed from: a */
    public final void mo32594a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f34968a);
    }
}
