package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import p078f7.C10539a;
import p078f7.C10553p;
import p078f7.C5263b;
import p190b5.C6509b;
import p201d7.C10505b;
import p201d7.C10507d;
import p241o7.C10859a;
import p262w6.C11085a;
import p262w6.C11086c;

public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f48827i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C10436j f48828j;
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: k */
    private static ScheduledThreadPoolExecutor f48829k;

    /* renamed from: a */
    private final Executor f48830a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11086c f48831b;

    /* renamed from: c */
    private final C10553p f48832c;

    /* renamed from: d */
    private C5263b f48833d;

    /* renamed from: e */
    private final C10424d f48834e;

    /* renamed from: f */
    private final C10441n f48835f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f48836g;

    /* renamed from: h */
    private final C10416a f48837h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C10416a {

        /* renamed from: a */
        private final boolean f48838a;

        /* renamed from: b */
        private final C10507d f48839b;
        @GuardedBy("this")

        /* renamed from: c */
        private C10505b<C11085a> f48840c;
        @GuardedBy("this")

        /* renamed from: d */
        private Boolean f48841d;

        C10416a(C10507d dVar) {
            this.f48839b = dVar;
            boolean c = m48021c();
            this.f48838a = c;
            Boolean b = m48020b();
            this.f48841d = b;
            if (b == null && c) {
                C10421b0 b0Var = new C10421b0(this);
                this.f48840c = b0Var;
                dVar.mo42645b(C11085a.class, b0Var);
            }
        }

        /* renamed from: b */
        private final Boolean m48020b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context h = FirebaseInstanceId.this.f48831b.mo43355h();
            SharedPreferences sharedPreferences = h.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = h.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(h.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        private final boolean m48021c() {
            try {
                int i = C10859a.f49643b;
                return true;
            } catch (ClassNotFoundException unused) {
                Context h = FirebaseInstanceId.this.f48831b.mo43355h();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(h.getPackageName());
                ResolveInfo resolveService = h.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized boolean mo41871a() {
            Boolean bool = this.f48841d;
            if (bool == null) {
                return this.f48838a && FirebaseInstanceId.this.f48831b.mo43360q();
            }
            return bool.booleanValue();
        }
    }

    FirebaseInstanceId(C11086c cVar, C10507d dVar) {
        this(cVar, new C10553p(cVar.mo43355h()), C10448u.m48121d(), C10448u.m48121d(), dVar);
    }

    /* renamed from: a */
    public static FirebaseInstanceId m47991a() {
        return getInstance(C11086c.m49562i());
    }

    /* renamed from: d */
    private final synchronized void m47992d() {
        if (!this.f48836g) {
            mo41860i(0);
        }
    }

    /* renamed from: e */
    private final Task<C10539a> m47993e(String str, String str2) {
        String r = m47999r(str2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f48830a.execute(new C10452y(this, str, str2, taskCompletionSource, r));
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    private final <T> T m47994g(Task<T> task) throws IOException {
        try {
            return Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo41869y();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Keep
    public static FirebaseInstanceId getInstance(C11086c cVar) {
        return (FirebaseInstanceId) cVar.mo43354g(FirebaseInstanceId.class);
    }

    /* renamed from: j */
    static void m47996j(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f48829k == null) {
                f48829k = new ScheduledThreadPoolExecutor(1, new C6509b("FirebaseInstanceId"));
            }
            f48829k.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: n */
    private static C10438k m47997n(String str, String str2) {
        return f48828j.mo41891f("", str, str2);
    }

    /* renamed from: r */
    private static String m47999r(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m48000s() {
        C10438k v = mo41867v();
        if (!mo41854A() || v == null || v.mo41897d(this.f48832c.mo42679d()) || this.f48835f.mo41904b()) {
            m47992d();
        }
    }

    /* renamed from: u */
    private static String m48001u() {
        return C10553p.m48301a(f48828j.mo41893i("").mo41898a());
    }

    /* renamed from: x */
    static boolean m48002x() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo41854A() {
        return this.f48833d.mo21480c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo41855B() throws IOException {
        m47994g(this.f48833d.mo21482e(m48001u(), C10438k.m48093a(mo41867v())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo41856C() {
        f48828j.mo41894j("");
        m47992d();
    }

    @Deprecated
    /* renamed from: b */
    public String mo41857b() {
        C10438k v = mo41867v();
        if (v == null || v.mo41897d(this.f48832c.mo42679d())) {
            m47992d();
        }
        if (v != null) {
            return v.f48888a;
        }
        return null;
    }

    /* renamed from: c */
    public String mo41858c(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C10539a) m47994g(m47993e(str, str2))).mo41887a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Task mo41859f(String str, String str2, String str3, String str4) {
        return this.f48833d.mo21481d(str, str2, str3, str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final synchronized void mo41860i(long j) {
        m47996j(new C10440l(this, this.f48832c, this.f48835f, Math.min(Math.max(30, j << 1), f48827i)), j);
        this.f48836g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo41861k(String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        String u = m48001u();
        C10438k n = m47997n(str, str2);
        if (n == null || n.mo41897d(this.f48832c.mo42679d())) {
            this.f48834e.mo41878b(str, str3, new C10453z(this, u, C10438k.m48093a(n), str, str3)).addOnCompleteListener(this.f48830a, new C10419a0(this, str, str3, taskCompletionSource, u));
            return;
        }
        taskCompletionSource.setResult(new C10435i0(u, n.f48888a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo41862l(String str, String str2, TaskCompletionSource taskCompletionSource, String str3, Task task) {
        if (task.isSuccessful()) {
            String str4 = (String) task.getResult();
            f48828j.mo41888c("", str, str2, str4, this.f48832c.mo42679d());
            taskCompletionSource.setResult(new C10435i0(str3, str4));
            return;
        }
        taskCompletionSource.setException(task.getException());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final synchronized void mo41863m(boolean z) {
        this.f48836g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo41864p(String str) throws IOException {
        C10438k v = mo41867v();
        if (v == null || v.mo41897d(this.f48832c.mo42679d())) {
            throw new IOException("token not available");
        }
        m47994g(this.f48833d.mo21479b(m48001u(), v.f48888a, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo41865q(String str) throws IOException {
        C10438k v = mo41867v();
        if (v == null || v.mo41897d(this.f48832c.mo42679d())) {
            throw new IOException("token not available");
        }
        m47994g(this.f48833d.mo21478a(m48001u(), v.f48888a, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C11086c mo41866t() {
        return this.f48831b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C10438k mo41867v() {
        return m47997n(C10553p.m48302b(this.f48831b), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo41868w() throws IOException {
        return mo41858c(C10553p.m48302b(this.f48831b), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final synchronized void mo41869y() {
        f48828j.mo41890e();
        if (this.f48837h.mo41871a()) {
            m47992d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo41870z() {
        return this.f48833d.mo21483f();
    }

    private FirebaseInstanceId(C11086c cVar, C10553p pVar, Executor executor, Executor executor2, C10507d dVar) {
        this.f48836g = false;
        if (C10553p.m48302b(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f48828j == null) {
                    f48828j = new C10436j(cVar.mo43355h());
                }
            }
            this.f48831b = cVar;
            this.f48832c = pVar;
            if (this.f48833d == null) {
                C5263b bVar = (C5263b) cVar.mo43354g(C5263b.class);
                if (bVar == null || !bVar.mo21483f()) {
                    this.f48833d = new C10423c0(cVar, pVar, executor);
                } else {
                    this.f48833d = bVar;
                }
            }
            this.f48833d = this.f48833d;
            this.f48830a = executor2;
            this.f48835f = new C10441n(f48828j);
            C10416a aVar = new C10416a(dVar);
            this.f48837h = aVar;
            this.f48834e = new C10424d(executor);
            if (aVar.mo41871a()) {
                m48000s();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
}
