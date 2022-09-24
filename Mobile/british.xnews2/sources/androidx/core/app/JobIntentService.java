package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: i */
    static final Object f3122i = new Object();

    /* renamed from: j */
    static final HashMap<ComponentName, C0595h> f3123j = new HashMap<>();

    /* renamed from: b */
    C0588b f3124b;

    /* renamed from: c */
    C0595h f3125c;

    /* renamed from: d */
    C0587a f3126d;

    /* renamed from: e */
    boolean f3127e = false;

    /* renamed from: f */
    boolean f3128f = false;

    /* renamed from: g */
    boolean f3129g = false;

    /* renamed from: h */
    final ArrayList<C0590d> f3130h;

    /* renamed from: androidx.core.app.JobIntentService$a */
    final class C0587a extends AsyncTask<Void, Void, Void> {
        C0587a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0591e a = JobIntentService.this.mo3065a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.mo3068e(a.getIntent());
                a.mo3086a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.mo3070g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo3070g();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    interface C0588b {
        /* renamed from: a */
        IBinder mo3081a();

        /* renamed from: b */
        C0591e mo3082b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    static final class C0589c extends C0595h {

        /* renamed from: d */
        private final Context f3132d;

        /* renamed from: e */
        private final PowerManager.WakeLock f3133e;

        /* renamed from: f */
        private final PowerManager.WakeLock f3134f;

        /* renamed from: g */
        boolean f3135g;

        /* renamed from: h */
        boolean f3136h;

        C0589c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3132d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3133e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3134f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: b */
        public void mo3083b() {
            synchronized (this) {
                if (this.f3136h) {
                    if (this.f3135g) {
                        this.f3133e.acquire(60000);
                    }
                    this.f3136h = false;
                    this.f3134f.release();
                }
            }
        }

        /* renamed from: c */
        public void mo3084c() {
            synchronized (this) {
                if (!this.f3136h) {
                    this.f3136h = true;
                    this.f3134f.acquire(600000);
                    this.f3133e.release();
                }
            }
        }

        /* renamed from: d */
        public void mo3085d() {
            synchronized (this) {
                this.f3135g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    final class C0590d implements C0591e {

        /* renamed from: a */
        final Intent f3137a;

        /* renamed from: b */
        final int f3138b;

        C0590d(Intent intent, int i) {
            this.f3137a = intent;
            this.f3138b = i;
        }

        /* renamed from: a */
        public void mo3086a() {
            JobIntentService.this.stopSelf(this.f3138b);
        }

        public Intent getIntent() {
            return this.f3137a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    interface C0591e {
        /* renamed from: a */
        void mo3086a();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    static final class C0592f extends JobServiceEngine implements C0588b {

        /* renamed from: a */
        final JobIntentService f3140a;

        /* renamed from: b */
        final Object f3141b = new Object();

        /* renamed from: c */
        JobParameters f3142c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        final class C0593a implements C0591e {

            /* renamed from: a */
            final JobWorkItem f3143a;

            C0593a(JobWorkItem jobWorkItem) {
                this.f3143a = jobWorkItem;
            }

            /* renamed from: a */
            public void mo3086a() {
                synchronized (C0592f.this.f3141b) {
                    JobParameters jobParameters = C0592f.this.f3142c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3143a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f3143a.getIntent();
            }
        }

        C0592f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3140a = jobIntentService;
        }

        /* renamed from: a */
        public IBinder mo3081a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f3140a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.C0592f.C0593a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.C0591e mo3082b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f3141b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f3142c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f3140a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.C0592f.mo3082b():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f3142c = jobParameters;
            this.f3140a.mo3067c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f3140a.mo3066b();
            synchronized (this.f3141b) {
                this.f3142c = null;
            }
            return b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    static final class C0594g extends C0595h {

        /* renamed from: d */
        private final JobInfo f3145d;

        /* renamed from: e */
        private final JobScheduler f3146e;

        C0594g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo3090a(i);
            this.f3145d = new JobInfo.Builder(i, this.f3147a).setOverrideDeadline(0).build();
            this.f3146e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    static abstract class C0595h {

        /* renamed from: a */
        final ComponentName f3147a;

        /* renamed from: b */
        boolean f3148b;

        /* renamed from: c */
        int f3149c;

        C0595h(ComponentName componentName) {
            this.f3147a = componentName;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3090a(int i) {
            if (!this.f3148b) {
                this.f3148b = true;
                this.f3149c = i;
            } else if (this.f3149c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f3149c);
            }
        }

        /* renamed from: b */
        public void mo3083b() {
        }

        /* renamed from: c */
        public void mo3084c() {
        }

        /* renamed from: d */
        public void mo3085d() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3130h = null;
        } else {
            this.f3130h = new ArrayList<>();
        }
    }

    /* renamed from: d */
    static C0595h m3245d(Context context, ComponentName componentName, boolean z, int i) {
        C0595h hVar;
        HashMap<ComponentName, C0595h> hashMap = f3123j;
        C0595h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C0589c(context, componentName);
        } else if (z) {
            hVar = new C0594g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0595h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0591e mo3065a() {
        C0588b bVar = this.f3124b;
        if (bVar != null) {
            return bVar.mo3082b();
        }
        synchronized (this.f3130h) {
            if (this.f3130h.size() <= 0) {
                return null;
            }
            C0591e remove = this.f3130h.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3066b() {
        C0587a aVar = this.f3126d;
        if (aVar != null) {
            aVar.cancel(this.f3127e);
        }
        this.f3128f = true;
        return mo3069f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3067c(boolean z) {
        if (this.f3126d == null) {
            this.f3126d = new C0587a();
            C0595h hVar = this.f3125c;
            if (hVar != null && z) {
                hVar.mo3084c();
            }
            this.f3126d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo3068e(Intent intent);

    /* renamed from: f */
    public boolean mo3069f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3070g() {
        ArrayList<C0590d> arrayList = this.f3130h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3126d = null;
                ArrayList<C0590d> arrayList2 = this.f3130h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo3067c(false);
                } else if (!this.f3129g) {
                    this.f3125c.mo3083b();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C0588b bVar = this.f3124b;
        if (bVar != null) {
            return bVar.mo3081a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3124b = new C0592f(this);
            this.f3125c = null;
            return;
        }
        this.f3124b = null;
        this.f3125c = m3245d(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0590d> arrayList = this.f3130h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3129g = true;
                this.f3125c.mo3083b();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f3130h == null) {
            return 2;
        }
        this.f3125c.mo3085d();
        synchronized (this.f3130h) {
            ArrayList<C0590d> arrayList = this.f3130h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0590d(intent, i2));
            mo3067c(true);
        }
        return 3;
    }
}
