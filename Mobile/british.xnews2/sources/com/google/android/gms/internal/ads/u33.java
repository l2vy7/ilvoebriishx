package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class u33 extends BroadcastReceiver implements Runnable {

    /* renamed from: b */
    private final v43 f39752b;

    /* renamed from: c */
    private final Handler f39753c;

    /* renamed from: d */
    final /* synthetic */ w53 f39754d;

    public u33(w53 w53, Handler handler, v43 v43) {
        this.f39754d = w53;
        this.f39753c = handler;
        this.f39752b = v43;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f39753c.post(this);
        }
    }

    public final void run() {
    }
}
