package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.mb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7935mb implements C8044pb {

    /* renamed from: a */
    final /* synthetic */ Activity f35469a;

    C7935mb(C8080qb qbVar, Activity activity) {
        this.f35469a = activity;
    }

    /* renamed from: a */
    public final void mo32594a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f35469a);
    }
}
