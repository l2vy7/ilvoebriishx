package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p256u5.C11034i;
import p256u5.C11035j;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C11034i {

    /* renamed from: d */
    private C11035j f46130d;

    /* renamed from: a */
    public void mo38805a(Context context, Intent intent) {
        WakefulBroadcastReceiver.m4214c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f46130d == null) {
            this.f46130d = new C11035j(this);
        }
        this.f46130d.mo43341a(context, intent);
    }
}
