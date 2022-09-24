package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.zzcl;
import p255u5.C11048w;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9977z7 {

    /* renamed from: a */
    private final Context f46924a;

    public C9977z7(Context context) {
        C4604n.m20098k(context);
        this.f46924a = context;
    }

    /* renamed from: k */
    private final C4667d3 m45524k() {
        return C4670h4.m21577H(this.f46924a, (zzcl) null, (Long) null).mo19276j();
    }

    /* renamed from: a */
    public final int mo39330a(Intent intent, int i, int i2) {
        C4670h4 H = C4670h4.m21577H(this.f46924a, (zzcl) null, (Long) null);
        C4667d3 j = H.mo19276j();
        if (intent == null) {
            j.mo19287w().mo38856a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo19275g();
        j.mo19286v().mo38858c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo39337h(new C9947w7(this, i2, j, intent));
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder mo39331b(Intent intent) {
        if (intent == null) {
            m45524k().mo19282q().mo38856a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C9716a5(C9958x8.m45456e0(this.f46924a), (String) null);
        }
        m45524k().mo19287w().mo38857b("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo39332c(int i, C4667d3 d3Var, Intent intent) {
        if (((C11048w) this.f46924a).mo38796M(i)) {
            d3Var.mo19286v().mo38857b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m45524k().mo19286v().mo38856a("Completed wakeful intent.");
            ((C11048w) this.f46924a).mo38797a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo39333d(C4667d3 d3Var, JobParameters jobParameters) {
        d3Var.mo19286v().mo38856a("AppMeasurementJobService processed last upload request.");
        ((C11048w) this.f46924a).mo38798b(jobParameters, false);
    }

    /* renamed from: e */
    public final void mo39334e() {
        C4670h4 H = C4670h4.m21577H(this.f46924a, (zzcl) null, (Long) null);
        C4667d3 j = H.mo19276j();
        H.mo19275g();
        j.mo19286v().mo38856a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void mo39335f() {
        C4670h4 H = C4670h4.m21577H(this.f46924a, (zzcl) null, (Long) null);
        C4667d3 j = H.mo19276j();
        H.mo19275g();
        j.mo19286v().mo38856a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void mo39336g(Intent intent) {
        if (intent == null) {
            m45524k().mo19282q().mo38856a("onRebind called with null intent");
            return;
        }
        m45524k().mo19286v().mo38857b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo39337h(Runnable runnable) {
        C9958x8 e0 = C9958x8.m45456e0(this.f46924a);
        e0.mo19273e().mo38909z(new C9967y7(this, e0, runnable));
    }

    @TargetApi(24)
    /* renamed from: i */
    public final boolean mo39338i(JobParameters jobParameters) {
        C4670h4 H = C4670h4.m21577H(this.f46924a, (zzcl) null, (Long) null);
        C4667d3 j = H.mo19276j();
        String string = jobParameters.getExtras().getString("action");
        H.mo19275g();
        j.mo19286v().mo38857b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo39337h(new C9957x7(this, j, jobParameters));
        return true;
    }

    /* renamed from: j */
    public final boolean mo39339j(Intent intent) {
        if (intent == null) {
            m45524k().mo19282q().mo38856a("onUnbind called with null intent");
            return true;
        }
        m45524k().mo19286v().mo38857b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
