package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p228l5.C10723k;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7360f extends C10723k {

    /* renamed from: a */
    private final Context f29240a;

    /* renamed from: b */
    final /* synthetic */ C7190a f29241b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7360f(C7190a aVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f29241b = aVar;
        this.f29240a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = this.f29241b.mo29708i(this.f29240a);
        if (this.f29241b.mo29710m(i2)) {
            this.f29241b.mo29714s(this.f29240a, i2);
        }
    }
}
