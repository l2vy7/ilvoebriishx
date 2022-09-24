package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.rn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8128rn implements C8197tn {

    /* renamed from: a */
    final /* synthetic */ Activity f38731a;

    /* renamed from: b */
    final /* synthetic */ Bundle f38732b;

    C8128rn(C8233un unVar, Activity activity, Bundle bundle) {
        this.f38731a = activity;
        this.f38732b = bundle;
    }

    /* renamed from: a */
    public final void mo33569a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f38731a, this.f38732b);
    }
}
