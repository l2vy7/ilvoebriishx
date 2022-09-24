package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v24 extends Handler {

    /* renamed from: a */
    final /* synthetic */ x24 f40274a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v24(x24 x24, Looper looper) {
        super(looper);
        this.f40274a = x24;
    }

    public final void handleMessage(Message message) {
        x24.m39340a(this.f40274a, message);
    }
}
