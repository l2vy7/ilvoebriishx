package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p229l5.C10723k;

/* renamed from: com.google.android.gms.common.api.internal.d1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7233d1 extends C10723k {

    /* renamed from: a */
    final /* synthetic */ C4594e1 f28996a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7233d1(C4594e1 e1Var, Looper looper) {
        super(looper);
        this.f28996a = e1Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C7228c1) message.obj).mo29839b(this.f28996a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
