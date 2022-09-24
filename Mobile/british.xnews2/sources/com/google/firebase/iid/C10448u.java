package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.u */
final class C10448u {

    /* renamed from: a */
    private static final Executor f48919a = C10450w.f48921b;

    /* renamed from: a */
    static final /* synthetic */ Thread m48118a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    /* renamed from: c */
    static Executor m48120c() {
        return f48919a;
    }

    /* renamed from: d */
    static Executor m48121d() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C10449v.f48920a);
    }
}
