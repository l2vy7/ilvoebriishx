package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ob */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8009ob implements C8044pb {

    /* renamed from: a */
    final /* synthetic */ Activity f36358a;

    C8009ob(C8080qb qbVar, Activity activity) {
        this.f36358a = activity;
    }

    /* renamed from: a */
    public final void mo32594a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f36358a);
    }
}
