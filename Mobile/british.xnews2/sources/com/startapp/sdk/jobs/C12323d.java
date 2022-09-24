package com.startapp.sdk.jobs;

import com.startapp.C11887e9;
import com.startapp.sdk.jobs.JobRequest;

/* renamed from: com.startapp.sdk.jobs.d */
/* compiled from: Sta */
public final class C12323d extends JobRequest {

    /* renamed from: e */
    public final Long f54732e;

    /* renamed from: com.startapp.sdk.jobs.d$a */
    /* compiled from: Sta */
    public static final class C12324a extends JobRequest.C12316a<C12324a> {

        /* renamed from: d */
        public Long f54733d;

        public C12324a(Class<? extends C12320b> cls) {
            super(cls);
        }

        /* renamed from: a */
        public JobRequest.C12316a mo46487a() {
            return this;
        }
    }

    public C12323d(C12324a aVar) {
        super(aVar);
        this.f54732e = aVar.f54733d;
    }

    /* renamed from: a */
    public boolean mo46475a(C11887e9 e9Var) {
        return e9Var.mo45331a(this, this.f54732e, (Long) null);
    }
}
