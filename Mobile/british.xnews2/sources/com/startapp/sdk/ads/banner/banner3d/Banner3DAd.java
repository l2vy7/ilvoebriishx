package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import com.startapp.C11845d3;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class Banner3DAd extends JsonAd {
    private static final long serialVersionUID = 1;
    private boolean fixedSize;
    private int offset;

    public Banner3DAd(Context context, int i) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = i;
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C11845d3(this.f22229a, this, this.offset, adPreferences, adEventListener).mo46157c();
        this.offset++;
    }

    /* renamed from: b */
    public void mo45835b(boolean z) {
        this.fixedSize = z;
    }

    /* renamed from: h */
    public int mo45836h() {
        return this.offset;
    }

    /* renamed from: i */
    public boolean mo45837i() {
        return this.fixedSize;
    }
}
