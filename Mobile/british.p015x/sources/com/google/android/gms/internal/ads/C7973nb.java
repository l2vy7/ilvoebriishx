package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.nb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7973nb implements C8044pb {

    /* renamed from: a */
    final /* synthetic */ Activity f35966a;

    /* renamed from: b */
    final /* synthetic */ Bundle f35967b;

    C7973nb(C8080qb qbVar, Activity activity, Bundle bundle) {
        this.f35966a = activity;
        this.f35967b = bundle;
    }

    /* renamed from: a */
    public final void mo32594a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f35966a, this.f35967b);
    }
}
