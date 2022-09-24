package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.C12173s0;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.sdk.ads.nativead.a */
/* compiled from: Sta */
public class C12206a extends C12173s0 {

    /* renamed from: i */
    public NativeAdPreferences f54272i;

    public C12206a(Context context, C5041Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, NativeAdPreferences nativeAdPreferences) {
        super(context, ad, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE);
        this.f54272i = nativeAdPreferences;
    }

    /* renamed from: a */
    public void mo45236a(C5041Ad ad) {
    }

    /* renamed from: d */
    public GetAdRequest mo45237d() {
        GetAdRequest d = super.mo45237d();
        if (d == null) {
            return null;
        }
        d.f54619p0 = this.f54272i.getAdsNumber();
        if (this.f54272i.getImageSize() != null) {
            d.f54974L = this.f54272i.getImageSize().getWidth();
            d.f54975M = this.f54272i.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.f54272i.getPrimaryImageSize();
            int i = 2;
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            d.f54602J0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.f54272i.getSecondaryImageSize();
            if (secondaryImageSize != -1) {
                i = secondaryImageSize;
            }
            d.f54603K0 = Integer.toString(i);
        }
        if (this.f54272i.isContentAd()) {
            d.f54604L0 = this.f54272i.isContentAd();
        }
        return d;
    }
}
