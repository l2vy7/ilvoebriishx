package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p190b5.C6509b;

public abstract class zzb extends Service {

    /* renamed from: b */
    final ExecutorService f48932b;

    /* renamed from: c */
    private Binder f48933c;

    /* renamed from: d */
    private final Object f48934d;

    /* renamed from: e */
    private int f48935e;

    /* renamed from: f */
    private int f48936f;

    public zzb() {
        String simpleName = getClass().getSimpleName();
        this.f48932b = Executors.newSingleThreadExecutor(new C6509b(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")));
        this.f48934d = new Object();
        this.f48936f = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m48122a(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.m4213b(intent);
        }
        synchronized (this.f48934d) {
            int i = this.f48936f - 1;
            this.f48936f = i;
            if (i == 0) {
                stopSelfResult(this.f48935e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Intent mo41873c(Intent intent) {
        return intent;
    }

    /* renamed from: d */
    public boolean mo41919d(Intent intent) {
        return false;
    }

    /* renamed from: e */
    public abstract void mo41874e(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f48933c == null) {
            this.f48933c = new C10445r(this);
        }
        return this.f48933c;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f48934d) {
            this.f48935e = i2;
            this.f48936f++;
        }
        Intent c = mo41873c(intent);
        if (c == null) {
            m48122a(intent);
            return 2;
        } else if (mo41919d(c)) {
            m48122a(intent);
            return 2;
        } else {
            this.f48932b.execute(new C10442o(this, c, intent));
            return 3;
        }
    }
}
