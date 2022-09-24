package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.common.api.internal.k3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7270k3 implements C7206f.C7208b, C7206f.C7209c {

    /* renamed from: b */
    public final C7191a<?> f29041b;

    /* renamed from: c */
    private final boolean f29042c;

    /* renamed from: d */
    private C7275l3 f29043d;

    public C7270k3(C7191a<?> aVar, boolean z) {
        this.f29041b = aVar;
        this.f29042c = z;
    }

    /* renamed from: b */
    private final C7275l3 m29690b() {
        C4604n.m20099l(this.f29043d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f29043d;
    }

    /* renamed from: a */
    public final void mo29888a(C7275l3 l3Var) {
        this.f29043d = l3Var;
    }

    public final void onConnected(Bundle bundle) {
        m29690b().onConnected(bundle);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        m29690b().mo17924x(connectionResult, this.f29041b, this.f29042c);
    }

    public final void onConnectionSuspended(int i) {
        m29690b().onConnectionSuspended(i);
    }
}
