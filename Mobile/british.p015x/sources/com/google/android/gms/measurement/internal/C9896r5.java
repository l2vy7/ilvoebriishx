package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import com.unity3d.ads.metadata.MediationMetaData;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9896r5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Bundle f46639b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46640c;

    C9896r5(C9779g6 g6Var, Bundle bundle) {
        this.f46640c = g6Var;
        this.f46639b = bundle;
    }

    public final void run() {
        C9779g6 g6Var = this.f46640c;
        Bundle bundle = this.f46639b;
        g6Var.mo19272b();
        g6Var.mo39230d();
        C4604n.m20098k(bundle);
        String g = C4604n.m20094g(bundle.getString(MediationMetaData.KEY_NAME));
        if (!g6Var.f21269a.mo19385n()) {
            g6Var.f21269a.mo19276j().mo19286v().mo38856a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzks zzks = new zzks(g, 0, (Object) null, "");
        try {
            zzab zzab = r4;
            zzab zzab2 = new zzab(bundle.getString("app_id"), "", zzks, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzau) null, bundle.getLong("trigger_timeout"), (zzau) null, bundle.getLong("time_to_live"), g6Var.f21269a.mo19372N().mo19333w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            g6Var.f21269a.mo19370L().mo39221s(zzab);
        } catch (IllegalArgumentException unused) {
        }
    }
}
