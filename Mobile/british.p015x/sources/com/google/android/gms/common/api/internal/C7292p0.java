package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import p264x5.C11100f;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7292p0 implements C7206f.C7208b, C7206f.C7209c {

    /* renamed from: b */
    final /* synthetic */ C7306s0 f29089b;

    /* synthetic */ C7292p0(C7306s0 s0Var, C7287o0 o0Var) {
        this.f29089b = s0Var;
    }

    public final void onConnected(Bundle bundle) {
        C4601e eVar = (C4601e) C4604n.m20098k(this.f29089b.f29123r);
        ((C11100f) C4604n.m20098k(this.f29089b.f29116k)).mo39381a(new C7281n0(this.f29089b));
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f29089b.f29107b.lock();
        try {
            if (this.f29089b.m29766p(connectionResult)) {
                this.f29089b.m29758h();
                this.f29089b.m29763m();
            } else {
                this.f29089b.m29761k(connectionResult);
            }
        } finally {
            this.f29089b.f29107b.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
