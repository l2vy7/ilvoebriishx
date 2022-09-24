package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tg2 implements yi2<Bundle> {

    /* renamed from: a */
    public final hr2 f39424a;

    public tg2(hr2 hr2) {
        this.f39424a = hr2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        hr2 hr2 = this.f39424a;
        if (hr2 != null) {
            bundle.putBoolean("render_in_browser", hr2.mo32440d());
            bundle.putBoolean("disable_ml", this.f39424a.mo32439c());
        }
    }
}
