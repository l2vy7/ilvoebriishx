package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C9370u0;
import com.google.android.gms.internal.measurement.C9385v0;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9846m8 extends C9868o8 {

    /* renamed from: d */
    private final AlarmManager f46479d = ((AlarmManager) this.f21269a.mo19277r().getSystemService("alarm"));

    /* renamed from: e */
    private C9826l f46480e;

    /* renamed from: f */
    private Integer f46481f;

    protected C9846m8(C9958x8 x8Var) {
        super(x8Var);
    }

    /* renamed from: n */
    private final int m45224n() {
        String str;
        if (this.f46481f == null) {
            String valueOf = String.valueOf(this.f21269a.mo19277r().getPackageName());
            if (valueOf.length() != 0) {
                str = "measurement".concat(valueOf);
            } else {
                str = new String("measurement");
            }
            this.f46481f = Integer.valueOf(str.hashCode());
        }
        return this.f46481f.intValue();
    }

    /* renamed from: o */
    private final PendingIntent m45225o() {
        Context r = this.f21269a.mo19277r();
        return C9370u0.m43671a(r, 0, new Intent().setClassName(r, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C9370u0.f45478a);
    }

    /* renamed from: p */
    private final C9826l m45226p() {
        if (this.f46480e == null) {
            this.f46480e = new C9835l8(this, this.f46518b.mo39287b0());
        }
        return this.f46480e;
    }

    @TargetApi(24)
    /* renamed from: q */
    private final void m45227q() {
        JobScheduler jobScheduler = (JobScheduler) this.f21269a.mo19277r().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m45224n());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo38861k() {
        AlarmManager alarmManager = this.f46479d;
        if (alarmManager != null) {
            alarmManager.cancel(m45225o());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m45227q();
        return false;
    }

    /* renamed from: l */
    public final void mo39067l() {
        mo39090d();
        this.f21269a.mo19276j().mo19286v().mo38856a("Unscheduling upload");
        AlarmManager alarmManager = this.f46479d;
        if (alarmManager != null) {
            alarmManager.cancel(m45225o());
        }
        m45226p().mo39048b();
        if (Build.VERSION.SDK_INT >= 24) {
            m45227q();
        }
    }

    /* renamed from: m */
    public final void mo39068m(long j) {
        mo39090d();
        this.f21269a.mo19275g();
        Context r = this.f21269a.mo19277r();
        if (!C4668d9.m21489X(r)) {
            this.f21269a.mo19276j().mo19281p().mo38856a("Receiver not registered/enabled");
        }
        if (!C4668d9.m21490Y(r, false)) {
            this.f21269a.mo19276j().mo19281p().mo38856a("Service not registered/enabled");
        }
        mo39067l();
        this.f21269a.mo19276j().mo19286v().mo38857b("Scheduling upload, millis", Long.valueOf(j));
        long elapsedRealtime = this.f21269a.mo19274f().elapsedRealtime() + j;
        this.f21269a.mo19392z();
        if (j < Math.max(0, ((Long) C9903s2.f46724y.mo39174a((Object) null)).longValue()) && !m45226p().mo39050e()) {
            m45226p().mo39049d(j);
        }
        this.f21269a.mo19275g();
        if (Build.VERSION.SDK_INT >= 24) {
            Context r2 = this.f21269a.mo19277r();
            ComponentName componentName = new ComponentName(r2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int n = m45224n();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            C9385v0.m43724a(r2, new JobInfo.Builder(n, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f46479d;
        if (alarmManager != null) {
            this.f21269a.mo19392z();
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) C9903s2.f46714t.mo39174a((Object) null)).longValue(), j), m45225o());
        }
    }
}
