package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ib */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7788ib implements C8044pb {

    /* renamed from: a */
    final /* synthetic */ Activity f33188a;

    /* renamed from: b */
    final /* synthetic */ Bundle f33189b;

    C7788ib(C8080qb qbVar, Activity activity, Bundle bundle) {
        this.f33188a = activity;
        this.f33189b = bundle;
    }

    /* renamed from: a */
    public final void mo32594a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f33188a, this.f33189b);
    }
}
