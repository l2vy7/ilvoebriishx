package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.startapp.sdk.jobs.b */
/* compiled from: Sta */
public abstract class C12320b implements Runnable {
    public final C12321a callback;
    public final Context context;
    public final Bundle extras;

    /* renamed from: com.startapp.sdk.jobs.b$a */
    /* compiled from: Sta */
    public interface C12321a {
        /* renamed from: a */
        void mo46481a(C12320b bVar, boolean z);
    }

    public C12320b(Context context2, C12321a aVar, Bundle bundle) {
        this.context = context2;
        this.callback = aVar;
        this.extras = bundle;
    }

    public void run() {
        this.callback.mo46481a(this, runSync());
    }

    public boolean runSync() {
        return false;
    }
}
