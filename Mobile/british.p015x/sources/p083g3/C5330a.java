package p083g3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C3642m;
import com.facebook.C3752u;
import com.facebook.appevents.C3406g;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3511k;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import com.facebook.internal.C3561x;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p020c3.C2651a;
import p066d3.C5172b;
import p098j3.C5515d;

/* renamed from: g3.a */
/* compiled from: ActivityLifecycleTracker */
public class C5330a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f23520a = "g3.a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f23521b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture f23522c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f23523d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static AtomicInteger f23524e = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C5351i f23525f;

    /* renamed from: g */
    private static AtomicBoolean f23526g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f23527h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static long f23528i;

    /* renamed from: j */
    private static int f23529j = 0;

    /* renamed from: k */
    private static WeakReference<Activity> f23530k;

    /* renamed from: g3.a$a */
    /* compiled from: ActivityLifecycleTracker */
    static class C5331a implements C3511k.C3514c {
        C5331a() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C5172b.m23503i();
            } else {
                C5172b.m23502h();
            }
        }
    }

    /* renamed from: g3.a$b */
    /* compiled from: ActivityLifecycleTracker */
    static class C5332b implements Application.ActivityLifecycleCallbacks {
        C5332b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C3561x.m11893g(C3752u.APP_EVENTS, C5330a.f23520a, "onActivityCreated");
            C5337b.m24042a();
            C5330a.m24036t(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            C3561x.m11893g(C3752u.APP_EVENTS, C5330a.f23520a, "onActivityDestroyed");
            C5330a.m24037u(activity);
        }

        public void onActivityPaused(Activity activity) {
            C3561x.m11893g(C3752u.APP_EVENTS, C5330a.f23520a, "onActivityPaused");
            C5337b.m24042a();
            C5330a.m24038v(activity);
        }

        public void onActivityResumed(Activity activity) {
            C3561x.m11893g(C3752u.APP_EVENTS, C5330a.f23520a, "onActivityResumed");
            C5337b.m24042a();
            C5330a.m24039w(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C3561x.m11893g(C3752u.APP_EVENTS, C5330a.f23520a, "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            C5330a.m24019c();
            C3561x.m11893g(C3752u.APP_EVENTS, C5330a.f23520a, "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            C3561x.m11893g(C3752u.APP_EVENTS, C5330a.f23520a, "onActivityStopped");
            C3406g.m11399i();
            C5330a.m24020d();
        }
    }

    /* renamed from: g3.a$c */
    /* compiled from: ActivityLifecycleTracker */
    static class C5333c implements Runnable {
        C5333c() {
        }

        public void run() {
            if (C5330a.f23525f == null) {
                C5351i unused = C5330a.f23525f = C5351i.m24084h();
            }
        }
    }

    /* renamed from: g3.a$d */
    /* compiled from: ActivityLifecycleTracker */
    static class C5334d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f23531b;

        /* renamed from: c */
        final /* synthetic */ String f23532c;

        /* renamed from: d */
        final /* synthetic */ Context f23533d;

        C5334d(long j, String str, Context context) {
            this.f23531b = j;
            this.f23532c = str;
            this.f23533d = context;
        }

        public void run() {
            if (C5330a.f23525f == null) {
                C5351i unused = C5330a.f23525f = new C5351i(Long.valueOf(this.f23531b), (Long) null);
                C5352j.m24096c(this.f23532c, (C5353k) null, C5330a.f23527h, this.f23533d);
            } else if (C5330a.f23525f.mo21653e() != null) {
                long longValue = this.f23531b - C5330a.f23525f.mo21653e().longValue();
                if (longValue > ((long) (C5330a.m24034r() * 1000))) {
                    C5352j.m24098e(this.f23532c, C5330a.f23525f, C5330a.f23527h);
                    C5352j.m24096c(this.f23532c, (C5353k) null, C5330a.f23527h, this.f23533d);
                    C5351i unused2 = C5330a.f23525f = new C5351i(Long.valueOf(this.f23531b), (Long) null);
                } else if (longValue > 1000) {
                    C5330a.f23525f.mo21656i();
                }
            }
            C5330a.f23525f.mo21657j(Long.valueOf(this.f23531b));
            C5330a.f23525f.mo21658k();
        }
    }

    /* renamed from: g3.a$e */
    /* compiled from: ActivityLifecycleTracker */
    static class C5335e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f23534b;

        /* renamed from: c */
        final /* synthetic */ String f23535c;

        /* renamed from: g3.a$e$a */
        /* compiled from: ActivityLifecycleTracker */
        class C5336a implements Runnable {
            C5336a() {
            }

            public void run() {
                if (C5330a.f23524e.get() <= 0) {
                    C5352j.m24098e(C5335e.this.f23535c, C5330a.f23525f, C5330a.f23527h);
                    C5351i.m24083a();
                    C5351i unused = C5330a.f23525f = null;
                }
                synchronized (C5330a.f23523d) {
                    ScheduledFuture unused2 = C5330a.f23522c = null;
                }
            }
        }

        C5335e(long j, String str) {
            this.f23534b = j;
            this.f23535c = str;
        }

        public void run() {
            if (C5330a.f23525f == null) {
                C5351i unused = C5330a.f23525f = new C5351i(Long.valueOf(this.f23534b), (Long) null);
            }
            C5330a.f23525f.mo21657j(Long.valueOf(this.f23534b));
            if (C5330a.f23524e.get() <= 0) {
                C5336a aVar = new C5336a();
                synchronized (C5330a.f23523d) {
                    ScheduledFuture unused2 = C5330a.f23522c = C5330a.f23521b.schedule(aVar, (long) C5330a.m24034r(), TimeUnit.SECONDS);
                }
            }
            long e = C5330a.f23528i;
            long j = 0;
            if (e > 0) {
                j = (this.f23534b - e) / 1000;
            }
            C5341d.m24053e(this.f23535c, j);
            C5330a.f23525f.mo21658k();
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m24019c() {
        int i = f23529j;
        f23529j = i + 1;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ int m24020d() {
        int i = f23529j;
        f23529j = i - 1;
        return i;
    }

    /* renamed from: o */
    private static void m24031o() {
        synchronized (f23523d) {
            if (f23522c != null) {
                f23522c.cancel(false);
            }
            f23522c = null;
        }
    }

    /* renamed from: p */
    public static Activity m24032p() {
        WeakReference<Activity> weakReference = f23530k;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: q */
    public static UUID m24033q() {
        if (f23525f != null) {
            return f23525f.mo21652d();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static int m24034r() {
        C3520m j = C3522n.m11804j(C3642m.m12280f());
        if (j == null) {
            return C5343e.m24055a();
        }
        return j.mo12006k();
    }

    /* renamed from: s */
    public static boolean m24035s() {
        return f23529j == 0;
    }

    /* renamed from: t */
    public static void m24036t(Activity activity) {
        f23521b.execute(new C5333c());
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static void m24037u(Activity activity) {
        C5172b.m23506l(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static void m24038v(Activity activity) {
        if (f23524e.decrementAndGet() < 0) {
            f23524e.set(0);
            Log.w(f23520a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m24031o();
        long currentTimeMillis = System.currentTimeMillis();
        String q = C3481f0.m11648q(activity);
        C5172b.m23507m(activity);
        f23521b.execute(new C5335e(currentTimeMillis, q));
    }

    /* renamed from: w */
    public static void m24039w(Activity activity) {
        f23530k = new WeakReference<>(activity);
        f23524e.incrementAndGet();
        m24031o();
        long currentTimeMillis = System.currentTimeMillis();
        f23528i = currentTimeMillis;
        String q = C3481f0.m11648q(activity);
        C5172b.m23508n(activity);
        C2651a.m9288d(activity);
        C5515d.m24593e(activity);
        f23521b.execute(new C5334d(currentTimeMillis, q, activity.getApplicationContext()));
    }

    /* renamed from: x */
    public static void m24040x(Application application, String str) {
        if (f23526g.compareAndSet(false, true)) {
            C3511k.m11755a(C3511k.C3515d.CodelessEvents, new C5331a());
            f23527h = str;
            application.registerActivityLifecycleCallbacks(new C5332b());
        }
    }
}
