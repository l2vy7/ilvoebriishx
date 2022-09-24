package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
class CachedAd$3 extends C5041Ad {
    public final /* synthetic */ C5065h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedAd$3(C5065h hVar, Context context, AdPreferences.Placement placement) {
        super(context, placement);
        this.this$0 = hVar;
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    public String getAdId() {
        return null;
    }

    public String getBidToken() {
        return null;
    }

    public String getErrorMessage() {
        return "explicit call: nofill [204]";
    }
}
