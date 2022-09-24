package com.google.ads.interactivemedia.p039v3.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ax */
/* compiled from: IMASDK */
final class C3869ax extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C3870ay f15863a;

    C3869ax(C3870ay ayVar) {
        this.f15863a = ayVar;
    }

    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                C3870ay.m15174f(this.f15863a, true);
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                C3870ay.m15174f(this.f15863a, false);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                C3870ay.m15174f(this.f15863a, false);
            }
        }
    }
}
