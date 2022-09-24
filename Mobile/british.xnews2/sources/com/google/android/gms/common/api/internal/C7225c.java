package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6492o;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7225c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f */
    private static final C7225c f28978f = new C7225c();

    /* renamed from: b */
    private final AtomicBoolean f28979b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f28980c = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: d */
    private final ArrayList<C7226a> f28981d = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: e */
    private boolean f28982e = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C7226a {
        /* renamed from: a */
        void mo29837a(boolean z);
    }

    private C7225c() {
    }

    /* renamed from: b */
    public static C7225c m29616b() {
        return f28978f;
    }

    /* renamed from: c */
    public static void m29617c(Application application) {
        C7225c cVar = f28978f;
        synchronized (cVar) {
            if (!cVar.f28982e) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f28982e = true;
            }
        }
    }

    /* renamed from: f */
    private final void m29618f(boolean z) {
        synchronized (f28978f) {
            Iterator<C7226a> it = this.f28981d.iterator();
            while (it.hasNext()) {
                it.next().mo29837a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo29824a(C7226a aVar) {
        synchronized (f28978f) {
            this.f28981d.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo29825d() {
        return this.f28979b.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean mo29826e(boolean z) {
        if (!this.f28980c.get()) {
            if (!C6492o.m28280c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f28980c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f28979b.set(true);
            }
        }
        return mo29825d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f28979b.compareAndSet(true, false);
        this.f28980c.set(true);
        if (compareAndSet) {
            m29618f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f28979b.compareAndSet(true, false);
        this.f28980c.set(true);
        if (compareAndSet) {
            m29618f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f28979b.compareAndSet(false, true)) {
            this.f28980c.set(true);
            m29618f(true);
        }
    }
}
