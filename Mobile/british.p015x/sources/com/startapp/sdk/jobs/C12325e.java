package com.startapp.sdk.jobs;

import com.startapp.C11887e9;
import com.startapp.sdk.jobs.JobRequest;

/* renamed from: com.startapp.sdk.jobs.e */
/* compiled from: Sta */
public final class C12325e extends JobRequest {

    /* renamed from: e */
    public final Long f54734e;

    /* renamed from: com.startapp.sdk.jobs.e$a */
    /* compiled from: Sta */
    public static final class C12326a extends JobRequest.C12316a<C12326a> {

        /* renamed from: d */
        public Long f54735d;

        public C12326a(Class<? extends C12320b> cls) {
            super(cls);
        }
    }

    public C12325e(C12326a aVar) {
        super(aVar);
        this.f54734e = aVar.f54735d;
    }

    /* renamed from: a */
    public boolean mo46475a(C11887e9 e9Var) {
        return e9Var.mo45330a(this, this.f54734e.longValue());
    }
}
