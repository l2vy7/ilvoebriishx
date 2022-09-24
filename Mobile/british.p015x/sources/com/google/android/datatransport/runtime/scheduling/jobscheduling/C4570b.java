package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* compiled from: JobInfoSchedulerService */
final /* synthetic */ class C4570b implements Runnable {

    /* renamed from: b */
    private final JobInfoSchedulerService f19840b;

    /* renamed from: c */
    private final JobParameters f19841c;

    private C4570b(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f19840b = jobInfoSchedulerService;
        this.f19841c = jobParameters;
    }

    /* renamed from: a */
    public static Runnable m19700a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new C4570b(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.f19840b.jobFinished(this.f19841c, false);
    }
}
