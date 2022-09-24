package com.startapp;

import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5057c;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* renamed from: com.startapp.z4 */
/* compiled from: Sta */
public class C12464z4 implements AdEventListener {

    /* renamed from: a */
    public final /* synthetic */ C5057c f55193a;

    public C12464z4(C5057c cVar) {
        this.f55193a = cVar;
    }

    public void onFailedToReceiveAd(C5041Ad ad) {
    }

    public void onReceiveAd(C5041Ad ad) {
        if (this.f55193a.f22343e.showAd()) {
            C5057c cVar = this.f55193a;
            cVar.getClass();
            cVar.f22341c = System.currentTimeMillis();
            cVar.f22342d = 0;
        }
    }
}
