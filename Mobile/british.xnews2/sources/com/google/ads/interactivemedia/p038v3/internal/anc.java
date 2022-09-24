package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anc */
/* compiled from: IMASDK */
final class anc implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: b */
    private static final anc f15402b = new anc();

    /* renamed from: a */
    public volatile long f15403a = C6540C.TIME_UNSET;

    /* renamed from: c */
    private final Handler f15404c;

    /* renamed from: d */
    private final HandlerThread f15405d;

    /* renamed from: e */
    private Choreographer f15406e;

    /* renamed from: f */
    private int f15407f;

    private anc() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f15405d = handlerThread;
        handlerThread.start();
        Handler n = amm.m14244n(handlerThread.getLooper(), this);
        this.f15404c = n;
        n.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static anc m14343a() {
        return f15402b;
    }

    /* renamed from: b */
    public final void mo14072b() {
        this.f15404c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo14073c() {
        this.f15404c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f15403a = j;
        Choreographer choreographer = this.f15406e;
        aup.m14890u(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f15406e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f15407f + 1;
            this.f15407f = i2;
            if (i2 == 1) {
                Choreographer choreographer = this.f15406e;
                aup.m14890u(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f15407f - 1;
            this.f15407f = i3;
            if (i3 == 0) {
                Choreographer choreographer2 = this.f15406e;
                aup.m14890u(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f15403a = C6540C.TIME_UNSET;
            }
            return true;
        }
    }
}
