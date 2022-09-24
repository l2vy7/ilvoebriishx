package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9356t2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    final /* synthetic */ C9372u2 f45457b;

    C9356t2(C9372u2 u2Var) {
        this.f45457b = u2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f45457b.m43681l(new C9232l2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f45457b.m43681l(new C9340s2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f45457b.m43681l(new C9278o2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f45457b.m43681l(new C9263n2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C9078b1 b1Var = new C9078b1();
        this.f45457b.m43681l(new C9324r2(this, activity, b1Var));
        Bundle b2 = b1Var.mo37382b2(50);
        if (b2 != null) {
            bundle.putAll(b2);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f45457b.m43681l(new C9247m2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f45457b.m43681l(new C9309q2(this, activity));
    }
}
