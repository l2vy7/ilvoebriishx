package com.google.android.exoplayer2.source.rtsp;

import android.os.HandlerThread;

/* renamed from: com.google.android.exoplayer2.source.rtsp.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6894h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ HandlerThread f27589b;

    public /* synthetic */ C6894h(HandlerThread handlerThread) {
        this.f27589b = handlerThread;
    }

    public final void run() {
        this.f27589b.quit();
    }
}
