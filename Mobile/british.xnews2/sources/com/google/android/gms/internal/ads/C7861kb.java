package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.kb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7861kb implements C8044pb {

    /* renamed from: a */
    final /* synthetic */ Activity f34225a;

    C7861kb(C8080qb qbVar, Activity activity) {
        this.f34225a = activity;
    }

    /* renamed from: a */
    public final void mo32594a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f34225a);
    }
}
