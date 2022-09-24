package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p066d4.C5190a;
import p153t3.C6150m;
import p153t3.C6156r;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C6156r.m27012f(getApplicationContext());
        C6150m.C6151a d = C6150m.m26992a().mo23509b(string).mo23511d(C5190a.m23551b(i));
        if (string2 != null) {
            d.mo23510c(Base64.decode(string2, 0));
        }
        C6156r.m27010c().mo23539e().mo24293g(d.mo23508a(), i2, C4570b.m19700a(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
