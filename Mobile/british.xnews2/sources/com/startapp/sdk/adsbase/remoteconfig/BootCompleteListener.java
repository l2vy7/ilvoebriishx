package com.startapp.sdk.adsbase.remoteconfig;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.C11827ca;
import com.startapp.C5009h0;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class BootCompleteListener extends BroadcastReceiver {
    @SuppressLint({"UnsafeProtectedBroadcastReceiver"})
    public void onReceive(Context context, Intent intent) {
        Object obj = StartAppSDKInternal.f22265C;
        Context a = C5009h0.m22892a(context);
        if (a != null) {
            context = a;
        }
        ComponentLocator.m23305a(context).mo21220g().execute(new C11827ca(context));
    }
}
