package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C12320b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Sta */
public class SchedulerService extends JobService {

    /* renamed from: a */
    public ExecutorService f54724a;

    /* renamed from: b */
    public final C12319a f54725b = new C12317a();

    /* renamed from: com.startapp.sdk.jobs.SchedulerService$a */
    /* compiled from: Sta */
    public class C12317a extends C12319a {
        public C12317a() {
        }

        /* renamed from: a */
        public void mo46480a(C12320b bVar) {
            ExecutorService executorService = SchedulerService.this.f54724a;
            if (executorService != null) {
                executorService.execute(bVar);
            }
        }
    }

    /* renamed from: com.startapp.sdk.jobs.SchedulerService$b */
    /* compiled from: Sta */
    public class C12318b implements C12320b.C12321a {

        /* renamed from: a */
        public final /* synthetic */ JobParameters f54727a;

        public C12318b(PersistableBundle persistableBundle, JobParameters jobParameters) {
            this.f54727a = jobParameters;
        }

        /* renamed from: a */
        public void mo46481a(C12320b bVar, boolean z) {
            SchedulerService.this.jobFinished(this.f54727a, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f54724a = Executors.newSingleThreadExecutor(new ComponentLocator.C5092i0("scheduler"));
    }

    public void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f54724a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f54724a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f54725b.mo46482a(this, extras.getStringArray("extraKeyTags"), new C12318b(extras, jobParameters), bundle);
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
