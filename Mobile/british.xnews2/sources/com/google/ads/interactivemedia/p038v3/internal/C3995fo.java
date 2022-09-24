package com.google.ads.interactivemedia.p038v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fo */
/* compiled from: IMASDK */
public final class C3995fo implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f17074a;

    /* renamed from: b */
    private final List<C3994fn> f17075b = new ArrayList();

    public C3995fo(Application application) {
        this.f17074a = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public final void mo15846a(C3994fn fnVar) {
        this.f17075b.add(fnVar);
    }

    /* renamed from: b */
    public final void mo15847b() {
        this.f17074a.unregisterActivityLifecycleCallbacks(this);
        this.f17075b.clear();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        for (C3994fn k : this.f17075b) {
            k.mo15674k();
        }
    }

    public final void onActivityResumed(Activity activity) {
        for (C3994fn l : this.f17075b) {
            l.mo15675l();
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
