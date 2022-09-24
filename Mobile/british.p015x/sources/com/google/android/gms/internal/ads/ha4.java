package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.exoplayer2.C6540C;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ha4 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: g */
    private static final ha4 f32692g = new ha4();

    /* renamed from: b */
    public volatile long f32693b = C6540C.TIME_UNSET;

    /* renamed from: c */
    private final Handler f32694c;

    /* renamed from: d */
    private final HandlerThread f32695d;

    /* renamed from: e */
    private Choreographer f32696e;

    /* renamed from: f */
    private int f32697f;

    private ha4() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f32695d = handlerThread;
        handlerThread.start();
        Handler e0 = d13.m20305e0(handlerThread.getLooper(), this);
        this.f32694c = e0;
        e0.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static ha4 m32845a() {
        return f32692g;
    }

    /* renamed from: b */
    public final void mo32376b() {
        this.f32694c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo32377c() {
        this.f32694c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f32693b = j;
        Choreographer choreographer = this.f32696e;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f32696e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f32697f + 1;
            this.f32697f = i2;
            if (i2 == 1) {
                Choreographer choreographer = this.f32696e;
                Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f32697f - 1;
            this.f32697f = i3;
            if (i3 == 0) {
                Choreographer choreographer2 = this.f32696e;
                Objects.requireNonNull(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f32693b = C6540C.TIME_UNSET;
            }
            return true;
        }
    }
}
