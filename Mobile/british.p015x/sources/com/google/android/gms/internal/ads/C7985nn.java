package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.nn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7985nn implements C8197tn {

    /* renamed from: a */
    final /* synthetic */ Activity f36048a;

    C7985nn(C8233un unVar, Activity activity) {
        this.f36048a = activity;
    }

    /* renamed from: a */
    public final void mo33569a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f36048a);
    }
}
