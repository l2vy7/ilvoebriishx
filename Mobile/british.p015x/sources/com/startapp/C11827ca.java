package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.StartAppSDKInternal;

/* renamed from: com.startapp.ca */
/* compiled from: Sta */
public class C11827ca implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f52681a;

    public C11827ca(Context context) {
        this.f52681a = context;
    }

    public void run() {
        synchronized (StartAppSDKInternal.f22265C) {
            StartAppSDKInternal.m23098a(this.f52681a);
        }
    }
}
