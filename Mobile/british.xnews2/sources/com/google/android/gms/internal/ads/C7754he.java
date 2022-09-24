package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.he */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7754he extends Handler {

    /* renamed from: a */
    final /* synthetic */ C7792ie f32713a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7754he(C7792ie ieVar, Looper looper) {
        super(looper);
        this.f32713a = ieVar;
    }

    public final void handleMessage(Message message) {
        this.f32713a.mo32621c(message);
    }
}
