package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final /* synthetic */ class C9957x7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C9977z7 f46857b;

    /* renamed from: c */
    public final /* synthetic */ C4667d3 f46858c;

    /* renamed from: d */
    public final /* synthetic */ JobParameters f46859d;

    public /* synthetic */ C9957x7(C9977z7 z7Var, C4667d3 d3Var, JobParameters jobParameters) {
        this.f46857b = z7Var;
        this.f46858c = d3Var;
        this.f46859d = jobParameters;
    }

    public final void run() {
        this.f46857b.mo39333d(this.f46858c, this.f46859d);
    }
}
