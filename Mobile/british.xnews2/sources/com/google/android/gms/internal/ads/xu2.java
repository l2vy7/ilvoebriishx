package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xu2 implements x32 {

    /* renamed from: a */
    private Message f41335a;

    /* renamed from: b */
    private yv2 f41336b;

    private xu2() {
    }

    /* synthetic */ xu2(wt2 wt2) {
    }

    /* renamed from: c */
    private final void m39601c() {
        this.f41335a = null;
        this.f41336b = null;
        yv2.m40030b(this);
    }

    /* renamed from: a */
    public final xu2 mo35799a(Message message, yv2 yv2) {
        this.f41335a = message;
        this.f41336b = yv2;
        return this;
    }

    /* renamed from: b */
    public final boolean mo35800b(Handler handler) {
        Message message = this.f41335a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m39601c();
        return sendMessageAtFrontOfQueue;
    }

    public final void zza() {
        Message message = this.f41335a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        m39601c();
    }
}
