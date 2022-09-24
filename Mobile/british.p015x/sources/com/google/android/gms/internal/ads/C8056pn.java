package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.pn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8056pn implements C8197tn {

    /* renamed from: a */
    final /* synthetic */ Activity f37718a;

    C8056pn(C8233un unVar, Activity activity) {
        this.f37718a = activity;
    }

    /* renamed from: a */
    public final void mo33569a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f37718a);
    }
}
