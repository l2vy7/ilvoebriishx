package com.appnext.core;

import android.content.Context;
import android.widget.ImageView;
import com.appnext.core.C3204j;

/* renamed from: com.appnext.core.i */
public final class C3202i {
    /* renamed from: a */
    public static void m10804a(Context context, final ImageView imageView) {
        C3204j.m10808ax().mo10810a(context, imageView, "https://cdn.appnext.com/tools/sdk/adchoices/adchoices_big.png", new C3204j.C3206a() {
            /* renamed from: aw */
            public final void mo10808aw() {
                imageView.setImageResource(C3158R.C3159drawable.apnxt_adchoices);
            }
        });
    }

    /* renamed from: a */
    public static boolean m10805a(AppnextAd appnextAd, SettingsManager settingsManager) {
        return appnextAd.isGdpr() && Boolean.parseBoolean(settingsManager.mo10732y("gdpr"));
    }
}
