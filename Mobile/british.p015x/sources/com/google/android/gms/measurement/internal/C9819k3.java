package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.measurement.internal.k3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9819k3 extends BroadcastReceiver {

    /* renamed from: d */
    static final String f46399d = C9819k3.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9958x8 f46400a;

    /* renamed from: b */
    private boolean f46401b;

    /* renamed from: c */
    private boolean f46402c;

    C9819k3(C9958x8 x8Var) {
        C4604n.m20098k(x8Var);
        this.f46400a = x8Var;
    }

    /* renamed from: b */
    public final void mo39037b() {
        this.f46400a.mo39286b();
        this.f46400a.mo19273e().mo19272b();
        if (!this.f46401b) {
            this.f46400a.mo19277r().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f46402c = this.f46400a.mo39282X().mo39017l();
            this.f46400a.mo19276j().mo19286v().mo38857b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f46402c));
            this.f46401b = true;
        }
    }

    /* renamed from: c */
    public final void mo39038c() {
        this.f46400a.mo39286b();
        this.f46400a.mo19273e().mo19272b();
        this.f46400a.mo19273e().mo19272b();
        if (this.f46401b) {
            this.f46400a.mo19276j().mo19286v().mo38856a("Unregistering connectivity change receiver");
            this.f46401b = false;
            this.f46402c = false;
            try {
                this.f46400a.mo19277r().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f46400a.mo19276j().mo19282q().mo38857b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f46400a.mo39286b();
        String action = intent.getAction();
        this.f46400a.mo19276j().mo19286v().mo38857b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean l = this.f46400a.mo39282X().mo39017l();
            if (this.f46402c != l) {
                this.f46402c = l;
                this.f46400a.mo19273e().mo38909z(new C9808j3(this, l));
                return;
            }
            return;
        }
        this.f46400a.mo19276j().mo19287w().mo38857b("NetworkBroadcastReceiver received unknown action", action);
    }
}
