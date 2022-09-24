package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C9181hc;
import com.google.android.gms.internal.measurement.C9354t0;
import p185z4.C6469a;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9894r3 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9354t0 f46634b;

    /* renamed from: c */
    final /* synthetic */ ServiceConnection f46635c;

    /* renamed from: d */
    final /* synthetic */ C9904s3 f46636d;

    C9894r3(C9904s3 s3Var, C9354t0 t0Var, ServiceConnection serviceConnection) {
        this.f46636d = s3Var;
        this.f46634b = t0Var;
        this.f46635c = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        String str;
        C9904s3 s3Var = this.f46636d;
        C9914t3 t3Var = s3Var.f46729c;
        String a = s3Var.f46728b;
        C9354t0 t0Var = this.f46634b;
        ServiceConnection serviceConnection = this.f46635c;
        t3Var.f46742a.mo19273e().mo19272b();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", a);
        try {
            bundle = t0Var.mo37968e(bundle2);
            if (bundle == null) {
                t3Var.f46742a.mo19276j().mo19282q().mo38856a("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e) {
            t3Var.f46742a.mo19276j().mo19282q().mo38857b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        t3Var.f46742a.mo19273e().mo19272b();
        C4670h4.m21579t();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                t3Var.f46742a.mo19276j().mo19287w().mo38856a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    t3Var.f46742a.mo19276j().mo19282q().mo38856a("No referrer defined in Install Referrer response");
                } else {
                    t3Var.f46742a.mo19276j().mo19286v().mo38857b("InstallReferrer API result", string);
                    C4668d9 N = t3Var.f46742a.mo19372N();
                    if (string.length() != 0) {
                        str = "?".concat(string);
                    } else {
                        str = new String("?");
                    }
                    Uri parse = Uri.parse(str);
                    C9181hc.m43000b();
                    Bundle t0 = N.mo19328t0(parse, t3Var.f46742a.mo19392z().mo19337B((String) null, C9903s2.f46721w0));
                    if (t0 == null) {
                        t3Var.f46742a.mo19276j().mo19282q().mo38856a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                t3Var.f46742a.mo19276j().mo19282q().mo38856a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == t3Var.f46742a.mo19365F().f21330f.mo39075a()) {
                            t3Var.f46742a.mo19276j().mo19286v().mo38856a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (t3Var.f46742a.mo19385n()) {
                            t3Var.f46742a.mo19365F().f21330f.mo39076b(j);
                            t3Var.f46742a.mo19276j().mo19286v().mo38857b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t0.putString("_cis", "referrer API v2");
                            t3Var.f46742a.mo19367I().mo38955t(TtmlNode.TEXT_EMPHASIS_AUTO, "_cmp", t0, a);
                        }
                    }
                }
            }
        }
        C6469a.m28199b().mo24299c(t3Var.f46742a.mo19277r(), serviceConnection);
    }
}
