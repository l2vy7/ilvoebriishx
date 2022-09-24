package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.mn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7947mn implements C8197tn {

    /* renamed from: a */
    final /* synthetic */ Activity f35574a;

    /* renamed from: b */
    final /* synthetic */ Bundle f35575b;

    C7947mn(C8233un unVar, Activity activity, Bundle bundle) {
        this.f35574a = activity;
        this.f35575b = bundle;
    }

    /* renamed from: a */
    public final void mo33569a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f35574a, this.f35575b);
    }
}
