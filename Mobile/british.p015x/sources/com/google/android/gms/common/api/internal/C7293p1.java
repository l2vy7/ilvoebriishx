package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7395i;

/* renamed from: com.google.android.gms.common.api.internal.p1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7293p1 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ ConnectionResult f29090b;

    /* renamed from: c */
    final /* synthetic */ C7298q1 f29091c;

    C7293p1(C7298q1 q1Var, ConnectionResult connectionResult) {
        this.f29091c = q1Var;
        this.f29090b = connectionResult;
    }

    public final void run() {
        C7298q1 q1Var = this.f29091c;
        C4596m1 m1Var = (C4596m1) q1Var.f29099f.f20005m.get(q1Var.f29095b);
        if (m1Var != null) {
            if (this.f29090b.mo29686G0()) {
                this.f29091c.f29098e = true;
                if (this.f29091c.f29094a.requiresSignIn()) {
                    this.f29091c.m29735h();
                    return;
                }
                try {
                    C7298q1 q1Var2 = this.f29091c;
                    q1Var2.f29094a.getRemoteService((C7395i) null, q1Var2.f29094a.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f29091c.f29094a.disconnect("Failed to get service from broker.");
                    m1Var.mo17945F(new ConnectionResult(10), (Exception) null);
                }
            } else {
                m1Var.mo17945F(this.f29090b, (Exception) null);
            }
        }
    }
}
