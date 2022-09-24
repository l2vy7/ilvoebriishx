package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.google.android.gms.internal.ads.cb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7568cb extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ C7603db f30307a;

    C7568cb(C7603db dbVar) {
        this.f30307a = dbVar;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (C7603db.class) {
            this.f30307a.f30699a = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (C7603db.class) {
            this.f30307a.f30699a = null;
        }
    }
}
