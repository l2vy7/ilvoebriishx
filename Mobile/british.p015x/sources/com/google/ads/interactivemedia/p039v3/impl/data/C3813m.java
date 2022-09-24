package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.api.UiElement;
import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.aul;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.m */
/* compiled from: IMASDK */
final class C3813m extends C3806f {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final atz<String> mimeTypes;
    private final double playAdsAfterTime;
    private final aul<UiElement> uiElements;

    private C3813m(int i, atz<String> atz, aul<UiElement> aul, boolean z, boolean z2, double d, boolean z3, int i2) {
        this.bitrate = i;
        this.mimeTypes = atz;
        this.uiElements = aul;
        this.enablePreloading = z;
        this.enableFocusSkipButton = z2;
        this.playAdsAfterTime = d;
        this.disableUi = z3;
        this.loadVideoTimeout = i2;
    }

    public int bitrate() {
        return this.bitrate;
    }

    public boolean disableUi() {
        return this.disableUi;
    }

    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r7.uiElements;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.mimeTypes;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.ads.interactivemedia.p039v3.impl.data.C3806f
            r2 = 0
            if (r1 == 0) goto L_0x0071
            com.google.ads.interactivemedia.v3.impl.data.f r8 = (com.google.ads.interactivemedia.p039v3.impl.data.C3806f) r8
            int r1 = r7.bitrate
            int r3 = r8.bitrate()
            if (r1 != r3) goto L_0x0071
            com.google.ads.interactivemedia.v3.internal.atz<java.lang.String> r1 = r7.mimeTypes
            if (r1 != 0) goto L_0x001e
            com.google.ads.interactivemedia.v3.internal.atz r1 = r8.mimeTypes()
            if (r1 != 0) goto L_0x0071
            goto L_0x0028
        L_0x001e:
            com.google.ads.interactivemedia.v3.internal.atz r3 = r8.mimeTypes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0071
        L_0x0028:
            com.google.ads.interactivemedia.v3.internal.aul<com.google.ads.interactivemedia.v3.api.UiElement> r1 = r7.uiElements
            if (r1 != 0) goto L_0x0033
            com.google.ads.interactivemedia.v3.internal.aul r1 = r8.uiElements()
            if (r1 != 0) goto L_0x0071
            goto L_0x003e
        L_0x0033:
            com.google.ads.interactivemedia.v3.internal.aul r3 = r8.uiElements()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x003e
            goto L_0x0071
        L_0x003e:
            boolean r1 = r7.enablePreloading
            boolean r3 = r8.enablePreloading()
            if (r1 != r3) goto L_0x0071
            boolean r1 = r7.enableFocusSkipButton
            boolean r3 = r8.enableFocusSkipButton()
            if (r1 != r3) goto L_0x0071
            double r3 = r7.playAdsAfterTime
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.playAdsAfterTime()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0071
            boolean r1 = r7.disableUi
            boolean r3 = r8.disableUi()
            if (r1 != r3) goto L_0x0071
            int r1 = r7.loadVideoTimeout
            int r8 = r8.loadVideoTimeout()
            if (r1 != r8) goto L_0x0071
            return r0
        L_0x0071:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.impl.data.C3813m.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.bitrate ^ 1000003) * 1000003;
        atz<String> atz = this.mimeTypes;
        int i2 = 0;
        int hashCode = (i ^ (atz == null ? 0 : atz.hashCode())) * 1000003;
        aul<UiElement> aul = this.uiElements;
        if (aul != null) {
            i2 = aul.hashCode();
        }
        int i3 = (hashCode ^ i2) * 1000003;
        int i4 = 1237;
        int doubleToLongBits = (((((i3 ^ (true != this.enablePreloading ? 1237 : 1231)) * 1000003) ^ (true != this.enableFocusSkipButton ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003;
        if (true == this.disableUi) {
            i4 = 1231;
        }
        return ((doubleToLongBits ^ i4) * 1000003) ^ this.loadVideoTimeout;
    }

    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    public atz<String> mimeTypes() {
        return this.mimeTypes;
    }

    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    /* access modifiers changed from: package-private */
    public C3805e toBuilder() {
        return new C3812l(this);
    }

    public String toString() {
        int i = this.bitrate;
        String valueOf = String.valueOf(this.mimeTypes);
        String valueOf2 = String.valueOf(this.uiElements);
        boolean z = this.enablePreloading;
        boolean z2 = this.enableFocusSkipButton;
        double d = this.playAdsAfterTime;
        boolean z3 = this.disableUi;
        int i2 = this.loadVideoTimeout;
        StringBuilder sb = new StringBuilder(valueOf.length() + 213 + valueOf2.length());
        sb.append("AdsRenderingSettingsData{bitrate=");
        sb.append(i);
        sb.append(", mimeTypes=");
        sb.append(valueOf);
        sb.append(", uiElements=");
        sb.append(valueOf2);
        sb.append(", enablePreloading=");
        sb.append(z);
        sb.append(", enableFocusSkipButton=");
        sb.append(z2);
        sb.append(", playAdsAfterTime=");
        sb.append(d);
        sb.append(", disableUi=");
        sb.append(z3);
        sb.append(", loadVideoTimeout=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public aul<UiElement> uiElements() {
        return this.uiElements;
    }
}
