package com.google.android.gms.ads.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzo extends ConnectivityManager.NetworkCallback {
    zzo(zzt zzt) {
    }

    public final void onAvailable(Network network) {
        synchronized (zzt.class) {
            zzt.f27938i = true;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzt.class) {
            zzt.f27938i = false;
        }
    }
}
