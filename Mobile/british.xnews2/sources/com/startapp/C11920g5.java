package com.startapp;

import com.startapp.sdk.jobs.JobRequest;

/* renamed from: com.startapp.g5 */
/* compiled from: Sta */
public class C11920g5 {

    /* renamed from: a */
    public final C11887e9 f52981a;

    /* renamed from: b */
    public final C11887e9 f52982b;

    public C11920g5(C11887e9 e9Var, C11887e9 e9Var2) {
        this.f52981a = e9Var;
        this.f52982b = e9Var2;
    }

    /* renamed from: a */
    public boolean mo45380a(JobRequest... jobRequestArr) {
        boolean z = true;
        for (JobRequest jobRequest : jobRequestArr) {
            if (jobRequest.f54717d) {
                if (jobRequest.mo46475a(this.f52982b)) {
                }
            } else if (jobRequest.mo46475a(this.f52981a)) {
            }
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo45379a(int i) {
        if (!this.f52982b.mo45329a(i)) {
            return this.f52981a.mo45329a(i);
        }
        return true;
    }
}
