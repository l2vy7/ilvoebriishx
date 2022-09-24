package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amh */
/* compiled from: IMASDK */
final class amh implements ala {

    /* renamed from: a */
    private Message f15286a;

    private amh() {
    }

    /* synthetic */ amh(byte[] bArr) {
    }

    /* renamed from: d */
    private final void m14152d() {
        this.f15286a = null;
        ami.m14156l(this);
    }

    /* renamed from: a */
    public final void mo13879a() {
        Message message = this.f15286a;
        aup.m14890u(message);
        message.sendToTarget();
        m14152d();
    }

    /* renamed from: b */
    public final boolean mo13986b(Handler handler) {
        Message message = this.f15286a;
        aup.m14890u(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m14152d();
        return sendMessageAtFrontOfQueue;
    }

    /* renamed from: c */
    public final void mo13987c(Message message) {
        this.f15286a = message;
    }
}
