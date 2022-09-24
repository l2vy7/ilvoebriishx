package p001a0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: a0.d */
/* compiled from: ActivityRecreator */
final class C0016d {

    /* renamed from: a */
    protected static final Class<?> f9a;

    /* renamed from: b */
    protected static final Field f10b = m41b();

    /* renamed from: c */
    protected static final Field f11c = m45f();

    /* renamed from: d */
    protected static final Method f12d;

    /* renamed from: e */
    protected static final Method f13e;

    /* renamed from: f */
    protected static final Method f14f;

    /* renamed from: g */
    private static final Handler f15g = new Handler(Looper.getMainLooper());

    /* renamed from: a0.d$a */
    /* compiled from: ActivityRecreator */
    class C0017a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C0020d f16b;

        /* renamed from: c */
        final /* synthetic */ Object f17c;

        C0017a(C0020d dVar, Object obj) {
            this.f16b = dVar;
            this.f17c = obj;
        }

        public void run() {
            this.f16b.f22b = this.f17c;
        }
    }

    /* renamed from: a0.d$b */
    /* compiled from: ActivityRecreator */
    class C0018b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Application f18b;

        /* renamed from: c */
        final /* synthetic */ C0020d f19c;

        C0018b(Application application, C0020d dVar) {
            this.f18b = application;
            this.f19c = dVar;
        }

        public void run() {
            this.f18b.unregisterActivityLifecycleCallbacks(this.f19c);
        }
    }

    /* renamed from: a0.d$c */
    /* compiled from: ActivityRecreator */
    class C0019c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f20b;

        /* renamed from: c */
        final /* synthetic */ Object f21c;

        C0019c(Object obj, Object obj2) {
            this.f20b = obj;
            this.f21c = obj2;
        }

        public void run() {
            try {
                Method method = C0016d.f12d;
                if (method != null) {
                    method.invoke(this.f20b, new Object[]{this.f21c, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C0016d.f13e.invoke(this.f20b, new Object[]{this.f21c, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: a0.d$d */
    /* compiled from: ActivityRecreator */
    private static final class C0020d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        Object f22b;

        /* renamed from: c */
        private Activity f23c;

        /* renamed from: d */
        private final int f24d;

        /* renamed from: e */
        private boolean f25e = false;

        /* renamed from: f */
        private boolean f26f = false;

        /* renamed from: g */
        private boolean f27g = false;

        C0020d(Activity activity) {
            this.f23c = activity;
            this.f24d = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f23c == activity) {
                this.f23c = null;
                this.f26f = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f26f && !this.f27g && !this.f25e && C0016d.m47h(this.f22b, this.f24d, activity)) {
                this.f27g = true;
                this.f22b = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f23c == activity) {
                this.f25e = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m40a();
        f9a = a;
        f12d = m43d(a);
        f13e = m42c(a);
        f14f = m44e(a);
    }

    /* renamed from: a */
    private static Class<?> m40a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m41b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m42c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m43d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m44e(Class<?> cls) {
        if (m46g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m45f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m46g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m47h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f11c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f15g.postAtFrontOfQueue(new C0019c(f10b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m48i(Activity activity) {
        Object obj;
        Application application;
        C0020d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m46g() && f14f == null) {
            return false;
        } else {
            if (f13e == null && f12d == null) {
                return false;
            }
            try {
                Object obj2 = f11c.get(activity);
                if (obj2 == null || (obj = f10b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0020d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f15g;
                handler.post(new C0017a(dVar, obj2));
                if (m46g()) {
                    Method method = f14f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C0018b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
