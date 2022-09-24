package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C9977z7;
import p256u5.C11048w;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class AppMeasurementJobService extends JobService implements C11048w {

    /* renamed from: b */
    private C9977z7 f46129b;

    /* renamed from: c */
    private final C9977z7 m44951c() {
        if (this.f46129b == null) {
            this.f46129b = new C9977z7(this);
        }
        return this.f46129b;
    }

    /* renamed from: M */
    public final boolean mo38796M(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo38797a(Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: b */
    public final void mo38798b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public void onCreate() {
        super.onCreate();
        m44951c().mo39334e();
    }

    public void onDestroy() {
        m44951c().mo39335f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m44951c().mo39336g(intent);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m44951c().mo39338i(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        m44951c().mo39339j(intent);
        return true;
    }
}
