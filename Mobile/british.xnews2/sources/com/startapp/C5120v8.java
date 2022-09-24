package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.v8 */
/* compiled from: Sta */
public class C5120v8 {

    /* renamed from: k */
    public static final String[] f22519k = {"getSupportFragmentManager", "getFragmentManager"};

    /* renamed from: a */
    public final Context f22520a;

    /* renamed from: b */
    public final Executor f22521b;

    /* renamed from: c */
    public final Executor f22522c;

    /* renamed from: d */
    public final C12462z2<RcdMetadata> f22523d;

    /* renamed from: e */
    public final Application.ActivityLifecycleCallbacks f22524e;

    /* renamed from: f */
    public final Map<String, Integer> f22525f = new HashMap();

    /* renamed from: g */
    public final Map<String, List<WeakReference<Activity>>> f22526g = new HashMap();

    /* renamed from: h */
    public Boolean f22527h;

    /* renamed from: i */
    public String f22528i;

    /* renamed from: j */
    public final Runnable f22529j = new C5121a();

    /* renamed from: com.startapp.v8$a */
    /* compiled from: Sta */
    public class C5121a implements Runnable {
        public C5121a() {
        }

        public void run() {
            try {
                C5120v8.this.mo21259d();
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }

    /* renamed from: com.startapp.v8$b */
    /* compiled from: Sta */
    public class C5122b extends C11954i2 {
        public C5122b() {
        }

        public void onActivityPostResumed(Activity activity) {
            try {
                C5120v8.this.mo21249a(activity);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }

    /* renamed from: com.startapp.v8$c */
    /* compiled from: Sta */
    public class C5123c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f22532a;

        public C5123c(Activity activity) {
            this.f22532a = activity;
        }

        public void run() {
            try {
                C5120v8.this.mo21256b(this.f22532a);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }

    /* renamed from: com.startapp.v8$d */
    /* compiled from: Sta */
    public class C5124d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f22534a;

        /* renamed from: b */
        public final /* synthetic */ View f22535b;

        public C5124d(Activity activity, View view) {
            this.f22534a = activity;
            this.f22535b = view;
        }

        public void run() {
            try {
                C5120v8 v8Var = C5120v8.this;
                Activity activity = this.f22534a;
                View view = this.f22535b;
                RcdTargets a = v8Var.mo21247a();
                if (a != null) {
                    if (v8Var.mo21255a(a, activity)) {
                        return;
                    }
                    try {
                        v8Var.mo21250a(a, view);
                    } catch (Throwable th) {
                        C5004d4.m22887a(th);
                    }
                    v8Var.f22522c.execute(v8Var.f22529j);
                }
            } catch (Throwable th2) {
                C5004d4.m22887a(th2);
            }
        }
    }

    /* renamed from: com.startapp.v8$e */
    /* compiled from: Sta */
    public class C5125e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ StackTraceElement[] f22537a;

        /* renamed from: b */
        public final /* synthetic */ int f22538b;

        public C5125e(StackTraceElement[] stackTraceElementArr, int i) {
            this.f22537a = stackTraceElementArr;
            this.f22538b = i;
        }

        public void run() {
            try {
                C5120v8 v8Var = C5120v8.this;
                StackTraceElement[] stackTraceElementArr = this.f22537a;
                int i = this.f22538b;
                RcdTargets a = v8Var.mo21247a();
                if (a != null) {
                    for (StackTraceElement className : stackTraceElementArr) {
                        v8Var.mo21252a(a, className.getClassName(), i);
                    }
                    v8Var.f22522c.execute(v8Var.f22529j);
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }

    public C5120v8(Context context, Executor executor, C12462z2<RcdMetadata> z2Var) {
        this.f22520a = context;
        this.f22521b = executor;
        this.f22522c = new C12013k9(executor);
        this.f22523d = z2Var;
        if (Build.VERSION.SDK_INT >= 14) {
            this.f22524e = new C5122b();
        } else {
            this.f22524e = null;
        }
    }

    /* renamed from: a */
    public final RcdTargets mo21247a() {
        RcdMetadata call = this.f22523d.call();
        if (call == null || !call.mo46379c()) {
            call = null;
        }
        if (call != null) {
            return call.mo46378b();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo21257b() {
        Boolean bool = this.f22527h;
        if (bool == null) {
            RcdMetadata call = this.f22523d.call();
            if (call == null || !call.mo46379c()) {
                call = null;
            }
            bool = Boolean.valueOf(call == null || Math.random() >= call.mo46377a());
            this.f22527h = bool;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public void mo21258c() {
        RcdTargets a = mo21247a();
        if (a != null) {
            for (String next : a.mo46383a(1)) {
                try {
                    Class.forName(next, false, C5120v8.class.getClassLoader());
                    mo21254a(next, 1);
                } catch (ClassNotFoundException unused) {
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
            try {
                String packageName = this.f22520a.getPackageName();
                PackageInfo packageInfo = this.f22520a.getPackageManager().getPackageInfo(packageName, 15);
                if (packageInfo != null) {
                    mo21253a(a, packageName, (T[]) packageInfo.activities);
                    mo21253a(a, packageName, (T[]) packageInfo.receivers);
                    mo21253a(a, packageName, (T[]) packageInfo.services);
                    mo21253a(a, packageName, (T[]) packageInfo.providers);
                }
            } catch (Throwable th2) {
                C5004d4.m22887a(th2);
            }
            this.f22522c.execute(this.f22529j);
        }
    }

    /* renamed from: d */
    public void mo21259d() {
        HashMap hashMap;
        RcdTargets a = mo21247a();
        if (a != null) {
            synchronized (this.f22525f) {
                hashMap = new HashMap(this.f22525f);
            }
            String a2 = a.mo46382a((Map<String, Integer>) hashMap);
            if (!a2.equals(this.f22528i)) {
                this.f22528i = a2;
                C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
                d4Var.f22126d = "RCD.results";
                d4Var.f22127e = a2;
                d4Var.mo20661a();
            }
        }
    }

    /* renamed from: a */
    public void mo21249a(Activity activity) {
        Window window;
        View decorView;
        if (!mo21257b()) {
            String name = activity.getClass().getName();
            Map<Activity, Integer> map = C5015nb.f22145a;
            if (!name.startsWith("com.startapp.")) {
                List list = this.f22526g.get(name);
                if (list == null) {
                    list = new ArrayList(2);
                    this.f22526g.put(name, list);
                    this.f22521b.execute(new C5123c(activity));
                }
                boolean z = false;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference.get() == null) {
                        it.remove();
                    } else if (weakReference.get() == activity) {
                        z = true;
                    }
                }
                if (!z && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    list.add(new WeakReference(activity));
                    this.f22521b.execute(new C5124d(activity, decorView));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo21256b(Activity activity) {
        RcdTargets a = mo21247a();
        if (a != null) {
            try {
                if (mo21255a(a, activity)) {
                    return;
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
            try {
                mo21251a(a, activity, 16, 32);
            } catch (Throwable th2) {
                C5004d4.m22887a(th2);
            }
            for (String method : f22519k) {
                try {
                    Object invoke = activity.getClass().getMethod(method, new Class[0]).invoke(activity, new Object[0]);
                    if (invoke != null) {
                        Object invoke2 = invoke.getClass().getMethod("getFragments", new Class[0]).invoke(invoke, new Object[0]);
                        if (invoke2 instanceof Collection) {
                            for (Object next : (Collection) invoke2) {
                                if (next != null) {
                                    mo21251a(a, next, 64, 128);
                                }
                            }
                        }
                    }
                } catch (NoSuchMethodException unused) {
                } catch (Throwable th3) {
                    C5004d4.m22887a(th3);
                }
            }
            this.f22522c.execute(this.f22529j);
        }
    }

    /* renamed from: a */
    public final <T extends ComponentInfo> void mo21253a(RcdTargets rcdTargets, String str, T[] tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                if (t != null) {
                    String str2 = t.name;
                    if (str2.startsWith(".")) {
                        mo21252a(rcdTargets, str + str2, 2);
                    } else {
                        mo21252a(rcdTargets, str2, 2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo21248a(int i) {
        try {
            if (!mo21257b()) {
                this.f22521b.execute(new C5125e(Thread.currentThread().getStackTrace(), i));
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: a */
    public final void mo21250a(RcdTargets rcdTargets, View view) {
        if (view != null) {
            mo21252a(rcdTargets, view.getClass().getName(), 4);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo21250a(rcdTargets, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo21255a(RcdTargets rcdTargets, Activity activity) {
        Collection<String> a = rcdTargets.mo46383a(8);
        String name = activity.getClass().getName();
        if (!a.contains(name)) {
            return false;
        }
        mo21254a(name, 8);
        return true;
    }

    /* renamed from: a */
    public final void mo21251a(RcdTargets rcdTargets, Object obj, int i, int i2) {
        Class cls = obj.getClass();
        while (cls != null && !m23372a(cls.getName())) {
            for (Field field : cls.getDeclaredFields()) {
                if (i != 0) {
                    mo21252a(rcdTargets, field.getType().getName(), i);
                }
                try {
                    field.setAccessible(true);
                    if (!(field.get(obj) == null || i2 == 0)) {
                        mo21252a(rcdTargets, field.getType().getName(), i2);
                    }
                } catch (Throwable unused) {
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21252a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            boolean r0 = m23372a((java.lang.String) r6)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.startapp.C5015nb.f22145a
            java.lang.String r0 = "com.startapp."
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0012
            return
        L_0x0012:
            java.util.Collection r5 = r5.mo46383a((int) r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x001a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            r2 = 1
            if (r1 <= 0) goto L_0x0062
            boolean r1 = r6.startsWith(r0)
            if (r1 == 0) goto L_0x0062
            int r1 = r0.length()
            int r1 = r1 - r2
            char r1 = r0.charAt(r1)
            r3 = 46
            if (r1 != r3) goto L_0x0044
            r4.mo21254a((java.lang.String) r0, (int) r7)
            goto L_0x0062
        L_0x0044:
            int r1 = r6.length()
            int r3 = r0.length()
            if (r1 <= r3) goto L_0x005e
            int r1 = r0.length()
            char r1 = r6.charAt(r1)
            r2 = 36
            if (r1 != r2) goto L_0x0062
            r4.mo21254a((java.lang.String) r0, (int) r7)
            goto L_0x0062
        L_0x005e:
            r4.mo21254a((java.lang.String) r0, (int) r7)
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x001a
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C5120v8.mo21252a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets, java.lang.String, int):void");
    }

    /* renamed from: a */
    public final void mo21254a(String str, int i) {
        synchronized (this.f22525f) {
            Integer num = this.f22525f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f22525f.put(str, Integer.valueOf(i | num.intValue()));
        }
    }

    /* renamed from: a */
    public static boolean m23372a(String str) {
        return str.startsWith(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID) || str.startsWith("java.");
    }
}
