package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.exoplayer2.source.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6835b implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ ConcatenatingMediaSource f27527b;

    public /* synthetic */ C6835b(ConcatenatingMediaSource concatenatingMediaSource) {
        this.f27527b = concatenatingMediaSource;
    }

    public final boolean handleMessage(Message message) {
        return this.f27527b.handleMessage(message);
    }
}
