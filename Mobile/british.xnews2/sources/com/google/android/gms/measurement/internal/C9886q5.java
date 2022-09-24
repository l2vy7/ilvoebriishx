package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import com.unity3d.ads.metadata.MediationMetaData;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9886q5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Bundle f46617b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46618c;

    C9886q5(C9779g6 g6Var, Bundle bundle) {
        this.f46618c = g6Var;
        this.f46617b = bundle;
    }

    public final void run() {
        C9779g6 g6Var = this.f46618c;
        Bundle bundle = this.f46617b;
        g6Var.mo19272b();
        g6Var.mo39230d();
        C4604n.m20098k(bundle);
        String string = bundle.getString(MediationMetaData.KEY_NAME);
        String string2 = bundle.getString(TtmlNode.ATTR_TTS_ORIGIN);
        C4604n.m20094g(string);
        C4604n.m20094g(string2);
        C4604n.m20098k(bundle.get("value"));
        if (!g6Var.f21269a.mo19385n()) {
            g6Var.f21269a.mo19276j().mo19286v().mo38856a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzks zzks = new zzks(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzau w0 = g6Var.f21269a.mo19372N().mo19333w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            zzau w02 = g6Var.f21269a.mo19372N().mo19333w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            zzau w03 = g6Var.f21269a.mo19372N().mo19333w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            g6Var.f21269a.mo19370L().mo39221s(new zzab(bundle.getString("app_id"), string2, zzks, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w02, bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), w03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
