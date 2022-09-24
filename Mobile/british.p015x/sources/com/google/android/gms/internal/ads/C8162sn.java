package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.sn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8162sn implements C8197tn {

    /* renamed from: a */
    final /* synthetic */ Activity f39008a;

    C8162sn(C8233un unVar, Activity activity) {
        this.f39008a = activity;
    }

    /* renamed from: a */
    public final void mo33569a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f39008a);
    }
}
