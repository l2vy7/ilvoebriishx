package com.google.ads.interactivemedia.p038v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.im */
/* compiled from: IMASDK */
final class C4074im extends BroadcastReceiver implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4076io f17432a;

    /* renamed from: b */
    private final C4075in f17433b;

    /* renamed from: c */
    private final Handler f17434c;

    public C4074im(C4076io ioVar, Handler handler, C4075in inVar) {
        this.f17432a = ioVar;
        this.f17434c = handler;
        this.f17433b = inVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f17434c.post(this);
        }
    }

    public final void run() {
    }
}
