package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p038v3.api.UiElement;
import com.google.ads.interactivemedia.p038v3.internal.bnh;
import com.google.ads.interactivemedia.p038v3.internal.bnj;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.g */
/* compiled from: IMASDK */
public final class C3807g implements AdsRenderingSettings {
    private int bitrate = -1;
    private boolean disableUi = false;
    private boolean enableFocusSkipButton = true;
    private boolean enablePreloading;
    private int loadVideoTimeout = -1;
    private List<String> mimeTypes = null;
    private double playAdsAfterTime = -1.0d;
    private Set<UiElement> uiElements;

    public boolean equals(Object obj) {
        return bnh.m16832c(this, obj, new String[0]);
    }

    public int getBitrateKbps() {
        return this.bitrate;
    }

    public boolean getDisableUi() {
        return this.disableUi;
    }

    public boolean getEnablePreloading() {
        return this.enablePreloading;
    }

    public boolean getFocusSkipButtonWhenAvailable() {
        return this.enableFocusSkipButton;
    }

    public int getLoadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    public List<String> getMimeTypes() {
        return this.mimeTypes;
    }

    public double getPlayAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    public Set<UiElement> getUiElements() {
        return this.uiElements;
    }

    public int hashCode() {
        return bnj.m16840b(this, new String[0]);
    }

    public void setBitrateKbps(int i) {
        this.bitrate = i;
    }

    public void setDisableUi(boolean z) {
        this.disableUi = z;
    }

    public void setEnablePreloading(boolean z) {
        this.enablePreloading = z;
    }

    public void setFocusSkipButtonWhenAvailable(boolean z) {
        this.enableFocusSkipButton = z;
    }

    public void setLoadVideoTimeout(int i) {
        this.loadVideoTimeout = i;
    }

    public void setMimeTypes(List<String> list) {
        this.mimeTypes = list;
    }

    public void setPlayAdsAfterTime(double d) {
        this.playAdsAfterTime = d;
    }

    public void setUiElements(Set<UiElement> set) {
        this.uiElements = set;
    }
}
