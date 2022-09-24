package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* renamed from: com.startapp.g */
/* compiled from: Sta */
public class C11911g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdDisplayListener f52960a;

    /* renamed from: b */
    public final /* synthetic */ C5041Ad f52961b;

    public C11911g(AdDisplayListener adDisplayListener, C5041Ad ad, Context context) {
        this.f52960a = adDisplayListener;
        this.f52961b = ad;
    }

    public void run() {
        try {
            this.f52960a.adClicked(this.f52961b);
        } catch (Throwable th) {
            C5015nb.m22918a((Object) this.f52960a, th);
        }
    }
}
