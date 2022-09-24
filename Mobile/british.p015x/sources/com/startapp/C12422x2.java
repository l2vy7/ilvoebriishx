package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.startapp.networkTest.startapp.CoverageMapperManager;
import com.startapp.networkTest.startapp.NetworkTester;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.x2 */
/* compiled from: Sta */
public class C12422x2 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: h */
    private static final String f55098h = C12422x2.class.getSimpleName();

    /* renamed from: i */
    private static final boolean f55099i = false;

    /* renamed from: a */
    private Application f55100a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ScheduledFuture<?> f55101b;

    /* renamed from: c */
    private int f55102c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f55103d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f55104e = false;

    /* renamed from: f */
    private CoverageMapperManager f55105f;

    /* renamed from: g */
    private final Runnable f55106g = new C12423a();

    /* renamed from: com.startapp.x2$a */
    /* compiled from: Sta */
    public class C12423a implements Runnable {
        public C12423a() {
        }

        public void run() {
            C12422x2.this.m53731c();
            if (C12422x2.this.f55103d == 0 && !C12422x2.this.f55104e) {
                C12422x2.this.f55101b.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.x2$b */
    /* compiled from: Sta */
    public class C12424b implements NetworkTester.C12096b {
        public C12424b() {
        }

        /* renamed from: a */
        public void mo45381a(boolean z) {
        }
    }

    public C12422x2(Context context, CoverageMapperManager coverageMapperManager) {
        this.f55100a = (Application) context.getApplicationContext();
        this.f55105f = coverageMapperManager;
    }

    /* renamed from: f */
    private void m53734f() {
        this.f55105f.mo45611c();
    }

    /* renamed from: g */
    private void m53735g() {
        m53737j();
        long FOREGROUND_TEST_CT_SCHEDULE_INTERVAL = C12385v4.m53561b().FOREGROUND_TEST_CT_SCHEDULE_INTERVAL();
        if (FOREGROUND_TEST_CT_SCHEDULE_INTERVAL > 0) {
            this.f55101b = ThreadManager.m52679b().mo45626d().scheduleWithFixedDelay(this.f55106g, FOREGROUND_TEST_CT_SCHEDULE_INTERVAL, FOREGROUND_TEST_CT_SCHEDULE_INTERVAL, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: i */
    private void m53736i() {
        this.f55105f.mo45613f();
    }

    /* renamed from: j */
    private void m53737j() {
        ScheduledFuture<?> scheduledFuture = this.f55101b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f55101b = null;
        }
    }

    /* renamed from: e */
    public void mo46794e() {
        this.f55102c = 0;
        this.f55100a.registerActivityLifecycleCallbacks(this);
        this.f55100a.registerComponentCallbacks(this);
    }

    /* renamed from: h */
    public void mo46795h() {
        this.f55100a.unregisterActivityLifecycleCallbacks(this);
        this.f55100a.unregisterComponentCallbacks(this);
        this.f55102c = -1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity.isTaskRoot() && this.f55103d < 0) {
            this.f55103d = 0;
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        int i = this.f55103d + 1;
        this.f55103d = i;
        if (i == 1 && !this.f55104e) {
            m53727a();
        }
    }

    public void onActivityStopped(Activity activity) {
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f55104e = isChangingConfigurations;
        int i = this.f55103d - 1;
        this.f55103d = i;
        if (i == 0 && !isChangingConfigurations) {
            m53730b();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
    }

    /* renamed from: a */
    private void m53727a() {
        this.f55102c = 1;
        if (C12385v4.m53561b().FOREGROUND_TEST_CT_ENABLED()) {
            m53731c();
            m53735g();
        }
        if (C12385v4.m53561b().FOREGROUND_TEST_NIR_ENABLED()) {
            m53734f();
        }
    }

    /* renamed from: b */
    private void m53730b() {
        this.f55102c = 0;
        m53736i();
        m53737j();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m53731c() {
        NetworkTester.runTests(this.f55100a, new C12424b());
    }

    /* renamed from: d */
    public int mo46793d() {
        return this.f55102c;
    }
}
