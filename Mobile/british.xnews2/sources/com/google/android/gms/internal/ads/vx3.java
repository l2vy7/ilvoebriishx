package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vx3 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ xx3 f40580a;

    /* synthetic */ vx3(xx3 xx3, ux3 ux3) {
        this.f40580a = xx3;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f40580a.f41365b.post(new tx3(this.f40580a));
    }
}
