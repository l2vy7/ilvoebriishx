package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.v */
final /* synthetic */ class C10449v implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f48920a = new C10449v();

    private C10449v() {
    }

    public final Thread newThread(Runnable runnable) {
        return C10448u.m48118a(runnable);
    }
}
