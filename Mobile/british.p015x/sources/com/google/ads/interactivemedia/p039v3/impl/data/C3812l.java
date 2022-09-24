package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.api.UiElement;
import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.aul;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.l */
/* compiled from: IMASDK */
final class C3812l extends C3805e {
    private Integer bitrate;
    private Boolean disableUi;
    private Boolean enableFocusSkipButton;
    private Boolean enablePreloading;
    private Integer loadVideoTimeout;
    private atz<String> mimeTypes;
    private Double playAdsAfterTime;
    private aul<UiElement> uiElements;

    C3812l() {
    }

    private C3812l(C3806f fVar) {
        this.bitrate = Integer.valueOf(fVar.bitrate());
        this.mimeTypes = fVar.mimeTypes();
        this.uiElements = fVar.uiElements();
        this.enablePreloading = Boolean.valueOf(fVar.enablePreloading());
        this.enableFocusSkipButton = Boolean.valueOf(fVar.enableFocusSkipButton());
        this.playAdsAfterTime = Double.valueOf(fVar.playAdsAfterTime());
        this.disableUi = Boolean.valueOf(fVar.disableUi());
        this.loadVideoTimeout = Integer.valueOf(fVar.loadVideoTimeout());
    }

    public C3806f build() {
        String str;
        String str2 = "";
        if (this.bitrate == null) {
            str2 = str2.concat(" bitrate");
        }
        if (this.enablePreloading == null) {
            str2 = String.valueOf(str2).concat(" enablePreloading");
        }
        if (this.enableFocusSkipButton == null) {
            str2 = String.valueOf(str2).concat(" enableFocusSkipButton");
        }
        if (this.playAdsAfterTime == null) {
            str2 = String.valueOf(str2).concat(" playAdsAfterTime");
        }
        if (this.disableUi == null) {
            str2 = String.valueOf(str2).concat(" disableUi");
        }
        if (this.loadVideoTimeout == null) {
            str2 = String.valueOf(str2).concat(" loadVideoTimeout");
        }
        if (str2.isEmpty()) {
            return new C3813m(this.bitrate.intValue(), this.mimeTypes, this.uiElements, this.enablePreloading.booleanValue(), this.enableFocusSkipButton.booleanValue(), this.playAdsAfterTime.doubleValue(), this.disableUi.booleanValue(), this.loadVideoTimeout.intValue());
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: package-private */
    public C3805e setBitrate(int i) {
        this.bitrate = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C3805e setDisableUi(boolean z) {
        this.disableUi = Boolean.valueOf(z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C3805e setEnableFocusSkipButton(boolean z) {
        this.enableFocusSkipButton = Boolean.valueOf(z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C3805e setEnablePreloading(boolean z) {
        this.enablePreloading = Boolean.valueOf(z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C3805e setLoadVideoTimeout(int i) {
        this.loadVideoTimeout = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C3805e setMimeTypes(List<String> list) {
        this.mimeTypes = list == null ? null : atz.m14811m(list);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C3805e setPlayAdsAfterTime(double d) {
        this.playAdsAfterTime = Double.valueOf(d);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C3805e setUiElements(Set<UiElement> set) {
        this.uiElements = set == null ? null : aul.m14862j(set);
        return this;
    }
}
