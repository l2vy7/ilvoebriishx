package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.on */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8021on implements C8197tn {

    /* renamed from: a */
    final /* synthetic */ Activity f36538a;

    C8021on(C8233un unVar, Activity activity) {
        this.f36538a = activity;
    }

    /* renamed from: a */
    public final void mo33569a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f36538a);
    }
}
