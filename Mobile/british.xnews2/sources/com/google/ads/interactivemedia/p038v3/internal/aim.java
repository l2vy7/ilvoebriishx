package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aim */
/* compiled from: IMASDK */
public class aim {

    /* renamed from: a */
    atz<String> f14993a = atz.m14807i();

    /* renamed from: b */
    atz<String> f14994b = atz.m14807i();

    /* renamed from: c */
    int f14995c = 0;

    /* renamed from: b */
    public void mo13761b(Context context) {
        CaptioningManager captioningManager;
        int i = amm.f15298a;
        if (i < 19) {
            return;
        }
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f14995c = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f14994b = atz.m14808j(amm.m14251u(locale));
            }
        }
    }
}
