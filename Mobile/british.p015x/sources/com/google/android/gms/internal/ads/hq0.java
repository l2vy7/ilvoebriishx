package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hq0 implements Runnable {
    hq0(jq0 jq0) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
