package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.jb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7825jb implements C8044pb {

    /* renamed from: a */
    final /* synthetic */ Activity f33831a;

    C7825jb(C8080qb qbVar, Activity activity) {
        this.f33831a = activity;
    }

    /* renamed from: a */
    public final void mo32594a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f33831a);
    }
}
