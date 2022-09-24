package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* renamed from: com.startapp.o0 */
/* compiled from: Sta */
public class C12102o0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BannerListener f53945a;

    /* renamed from: b */
    public final /* synthetic */ View f53946b;

    public C12102o0(BannerListener bannerListener, View view, Context context) {
        this.f53945a = bannerListener;
        this.f53946b = view;
    }

    public void run() {
        try {
            this.f53945a.onImpression(this.f53946b);
        } catch (Throwable th) {
            C5015nb.m22918a((Object) this.f53945a, th);
        }
    }
}
