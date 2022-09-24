package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.rm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8127rm implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: g */
    private static final C8127rm f38717g = new C8127rm();

    /* renamed from: b */
    public volatile long f38718b;

    /* renamed from: c */
    private final Handler f38719c;

    /* renamed from: d */
    private final HandlerThread f38720d;

    /* renamed from: e */
    private Choreographer f38721e;

    /* renamed from: f */
    private int f38722f;

    private C8127rm() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f38720d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f38719c = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static C8127rm m37121a() {
        return f38717g;
    }

    /* renamed from: b */
    public final void mo34554b() {
        this.f38719c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo34555c() {
        this.f38719c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f38718b = j;
        this.f38721e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f38721e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f38722f + 1;
            this.f38722f = i2;
            if (i2 == 1) {
                this.f38721e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f38722f - 1;
            this.f38722f = i3;
            if (i3 == 0) {
                this.f38721e.removeFrameCallback(this);
                this.f38718b = 0;
            }
            return true;
        }
    }
}
