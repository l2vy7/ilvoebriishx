package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzs extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ zzt f27937a;

    /* synthetic */ zzs(zzt zzt, zzr zzr) {
        this.f27937a = zzt;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f27937a.f27941c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f27937a.f27941c = false;
        }
    }
}
