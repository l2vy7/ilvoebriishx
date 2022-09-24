package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C9977z7;
import p255u5.C11048w;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class AppMeasurementService extends Service implements C11048w {

    /* renamed from: b */
    private C9977z7 f46131b;

    /* renamed from: c */
    private final C9977z7 m44956c() {
        if (this.f46131b == null) {
            this.f46131b = new C9977z7(this);
        }
        return this.f46131b;
    }

    /* renamed from: M */
    public final boolean mo38796M(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo38797a(Intent intent) {
        WakefulBroadcastReceiver.m4213b(intent);
    }

    /* renamed from: b */
    public final void mo38798b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public IBinder onBind(Intent intent) {
        return m44956c().mo39331b(intent);
    }

    public void onCreate() {
        super.onCreate();
        m44956c().mo39334e();
    }

    public void onDestroy() {
        m44956c().mo39335f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m44956c().mo39336g(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m44956c().mo39330a(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        m44956c().mo39339j(intent);
        return true;
    }
}
