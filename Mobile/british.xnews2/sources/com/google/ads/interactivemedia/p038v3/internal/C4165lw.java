package com.google.ads.interactivemedia.p038v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lw */
/* compiled from: IMASDK */
final class C4165lw extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C4166lx f17903a;

    /* synthetic */ C4165lw(C4166lx lxVar) {
        this.f17903a = lxVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f17903a.f17905b.post(new C4164lv(this.f17903a));
    }
}
