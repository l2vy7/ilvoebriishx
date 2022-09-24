package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.UiElement;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.e */
/* compiled from: IMASDK */
public abstract class C3805e {
    public abstract C3806f build();

    /* access modifiers changed from: package-private */
    public abstract C3805e setBitrate(int i);

    /* access modifiers changed from: package-private */
    public abstract C3805e setDisableUi(boolean z);

    /* access modifiers changed from: package-private */
    public abstract C3805e setEnableFocusSkipButton(boolean z);

    /* access modifiers changed from: package-private */
    public abstract C3805e setEnablePreloading(boolean z);

    /* access modifiers changed from: package-private */
    public abstract C3805e setLoadVideoTimeout(int i);

    /* access modifiers changed from: package-private */
    public abstract C3805e setMimeTypes(List<String> list);

    /* access modifiers changed from: package-private */
    public abstract C3805e setPlayAdsAfterTime(double d);

    /* access modifiers changed from: package-private */
    public abstract C3805e setUiElements(Set<UiElement> set);
}
