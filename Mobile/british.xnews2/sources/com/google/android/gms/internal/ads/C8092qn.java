package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.qn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8092qn implements C8197tn {

    /* renamed from: a */
    final /* synthetic */ Activity f38200a;

    C8092qn(C8233un unVar, Activity activity) {
        this.f38200a = activity;
    }

    /* renamed from: a */
    public final void mo33569a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f38200a);
    }
}
