package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.e */
/* compiled from: Sta */
public class C11876e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdDisplayListener f52877a;

    /* renamed from: b */
    public final /* synthetic */ C5041Ad f52878b;

    public C11876e(AdDisplayListener adDisplayListener, C5041Ad ad, Context context) {
        this.f52877a = adDisplayListener;
        this.f52878b = ad;
    }

    public void run() {
        try {
            this.f52877a.adHidden(this.f52878b);
        } catch (Throwable th) {
            C5015nb.m22918a((Object) this.f52877a, th);
        }
    }
}
