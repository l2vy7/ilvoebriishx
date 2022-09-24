package com.google.android.exoplayer2.p040ui;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.exoplayer2.ui.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6960f implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ PlayerNotificationManager f27629b;

    public /* synthetic */ C6960f(PlayerNotificationManager playerNotificationManager) {
        this.f27629b = playerNotificationManager;
    }

    public final boolean handleMessage(Message message) {
        return this.f27629b.handleMessage(message);
    }
}
