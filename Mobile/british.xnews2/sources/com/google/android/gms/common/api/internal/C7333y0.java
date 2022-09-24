package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p228l5.C10723k;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7333y0 extends C10723k {

    /* renamed from: a */
    final /* synthetic */ C7217a1 f29196a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7333y0(C7217a1 a1Var, Looper looper) {
        super(looper);
        this.f29196a = a1Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C7217a1.m29579z(this.f29196a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            C7217a1.m29578y(this.f29196a);
        }
    }
}
