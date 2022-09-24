package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.p */
final class C10443p {

    /* renamed from: a */
    final Intent f48904a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f48905b;

    /* renamed from: c */
    private boolean f48906c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f48907d;

    C10443p(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f48904a = intent;
        this.f48905b = pendingResult;
        this.f48907d = scheduledExecutorService.schedule(new C10444q(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo41907a() {
        if (!this.f48906c) {
            this.f48905b.finish();
            this.f48907d.cancel(false);
            this.f48906c = true;
        }
    }
}
