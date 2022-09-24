package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.zn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8412zn implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private Activity f42520b;

    /* renamed from: c */
    private Context f42521c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f42522d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f42523e = true;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f42524f = false;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: g */
    public final List<C7510ao> f42525g = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: h */
    private final List<C8057po> f42526h = new ArrayList();

    /* renamed from: i */
    private Runnable f42527i;

    /* renamed from: j */
    private boolean f42528j = false;

    /* renamed from: k */
    private long f42529k;

    C8412zn() {
    }

    /* renamed from: k */
    private final void m40402k(Activity activity) {
        synchronized (this.f42522d) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.f42520b = activity;
            }
        }
    }

    /* renamed from: a */
    public final Activity mo36084a() {
        return this.f42520b;
    }

    /* renamed from: b */
    public final Context mo36085b() {
        return this.f42521c;
    }

    /* renamed from: f */
    public final void mo36086f(C7510ao aoVar) {
        synchronized (this.f42522d) {
            this.f42525g.add(aoVar);
        }
    }

    /* renamed from: g */
    public final void mo36087g(Application application, Context context) {
        if (!this.f42528j) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m40402k((Activity) context);
            }
            this.f42521c = application;
            this.f42529k = ((Long) C8311wv.m39277c().mo18570b(p00.f36880G0)).longValue();
            this.f42528j = true;
        }
    }

    /* renamed from: h */
    public final void mo36088h(C7510ao aoVar) {
        synchronized (this.f42522d) {
            this.f42525g.remove(aoVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f42522d) {
            Activity activity2 = this.f42520b;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f42520b = null;
                }
                Iterator<C8057po> it = this.f42526h.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzt.zzo().mo18592s(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        co0.zzh("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m40402k(activity);
        synchronized (this.f42522d) {
            for (C8057po zzb : this.f42526h) {
                try {
                    zzb.zzb();
                } catch (Exception e) {
                    zzt.zzo().mo18592s(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    co0.zzh("", e);
                }
            }
        }
        this.f42524f = true;
        Runnable runnable = this.f42527i;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(runnable);
        }
        d33 d33 = com.google.android.gms.ads.internal.util.zzt.zza;
        C8376yn ynVar = new C8376yn(this);
        this.f42527i = ynVar;
        d33.postDelayed(ynVar, this.f42529k);
    }

    public final void onActivityResumed(Activity activity) {
        m40402k(activity);
        this.f42524f = false;
        boolean z = !this.f42523e;
        this.f42523e = true;
        Runnable runnable = this.f42527i;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(runnable);
        }
        synchronized (this.f42522d) {
            for (C8057po zzc : this.f42526h) {
                try {
                    zzc.zzc();
                } catch (Exception e) {
                    zzt.zzo().mo18592s(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    co0.zzh("", e);
                }
            }
            if (z) {
                for (C7510ao zza : this.f42525g) {
                    try {
                        zza.zza(true);
                    } catch (Exception e2) {
                        co0.zzh("", e2);
                    }
                }
            } else {
                co0.zze("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m40402k(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
