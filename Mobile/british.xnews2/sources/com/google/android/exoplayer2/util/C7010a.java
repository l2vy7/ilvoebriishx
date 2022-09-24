package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.exoplayer2.util.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7010a implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ ListenerSet f27669b;

    public /* synthetic */ C7010a(ListenerSet listenerSet) {
        this.f27669b = listenerSet;
    }

    public final boolean handleMessage(Message message) {
        return this.f27669b.handleMessage(message);
    }
}
