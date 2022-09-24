package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p038v3.api.UiElement;
import com.google.ads.interactivemedia.p038v3.internal.ark;
import com.google.ads.interactivemedia.p038v3.internal.atz;
import com.google.ads.interactivemedia.p038v3.internal.aul;

@ark(mo14242a = C3813m.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.f */
/* compiled from: IMASDK */
public abstract class C3806f {
    public static C3805e builder(AdsRenderingSettings adsRenderingSettings) {
        C3807g gVar = (C3807g) adsRenderingSettings;
        C3812l lVar = new C3812l();
        lVar.setBitrate(gVar.getBitrateKbps());
        lVar.setDisableUi(gVar.getDisableUi());
        lVar.setEnablePreloading(gVar.getEnablePreloading());
        lVar.setEnableFocusSkipButton(gVar.getFocusSkipButtonWhenAvailable());
        lVar.setLoadVideoTimeout(gVar.getLoadVideoTimeout());
        lVar.setMimeTypes(gVar.getMimeTypes());
        lVar.setPlayAdsAfterTime(gVar.getPlayAdsAfterTime());
        lVar.setUiElements(gVar.getUiElements());
        return lVar;
    }

    public abstract int bitrate();

    public abstract boolean disableUi();

    public abstract boolean enableFocusSkipButton();

    public abstract boolean enablePreloading();

    public abstract int loadVideoTimeout();

    public abstract atz<String> mimeTypes();

    public abstract double playAdsAfterTime();

    /* access modifiers changed from: package-private */
    public abstract C3805e toBuilder();

    public abstract aul<UiElement> uiElements();
}
