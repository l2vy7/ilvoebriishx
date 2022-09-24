package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.f */
/* compiled from: Sta */
public class C11894f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdDisplayListener f52923a;

    /* renamed from: b */
    public final /* synthetic */ C5041Ad f52924b;

    public C11894f(AdDisplayListener adDisplayListener, C5041Ad ad, Context context) {
        this.f52923a = adDisplayListener;
        this.f52924b = ad;
    }

    public void run() {
        try {
            this.f52923a.adDisplayed(this.f52924b);
        } catch (Throwable th) {
            C5015nb.m22918a((Object) this.f52923a, th);
        }
    }
}
