package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ry2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ sy2 f38816a;

    ry2(sy2 sy2) {
        this.f38816a = sy2;
    }

    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                sy2.m37612b(this.f38816a, true);
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                sy2.m37612b(this.f38816a, false);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                sy2.m37612b(this.f38816a, false);
            }
        }
    }
}
