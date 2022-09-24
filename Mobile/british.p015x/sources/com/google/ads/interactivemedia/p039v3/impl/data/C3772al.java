package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.aue;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.al */
/* compiled from: IMASDK */
final class C3772al extends TestingConfiguration {
    private final boolean disableExperiments;
    private final boolean disableOnScreenDetection;
    private final boolean disableSkipFadeTransition;
    private final boolean enableMonitorAppLifecycle;
    private final aue<String, Object> extraParams;
    private final atz<Integer> forceExperimentIds;
    private final boolean forceTvMode;
    private final boolean ignoreStrictModeFalsePositives;
    private final boolean useTestStreamManager;
    private final boolean useVideoElementMock;
    private final float videoElementMockDuration;

    private C3772al(boolean z, boolean z2, boolean z3, atz<Integer> atz, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, aue<String, Object> aue) {
        this.disableExperiments = z;
        this.disableOnScreenDetection = z2;
        this.disableSkipFadeTransition = z3;
        this.forceExperimentIds = atz;
        this.useVideoElementMock = z4;
        this.videoElementMockDuration = f;
        this.useTestStreamManager = z5;
        this.enableMonitorAppLifecycle = z6;
        this.forceTvMode = z7;
        this.ignoreStrictModeFalsePositives = z8;
        this.extraParams = aue;
    }

    public boolean disableExperiments() {
        return this.disableExperiments;
    }

    public boolean disableOnScreenDetection() {
        return this.disableOnScreenDetection;
    }

    public boolean disableSkipFadeTransition() {
        return this.disableSkipFadeTransition;
    }

    public boolean enableMonitorAppLifecycle() {
        return this.enableMonitorAppLifecycle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r1 = r4.forceExperimentIds;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        r1 = r4.extraParams;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.ads.interactivemedia.p039v3.impl.data.TestingConfiguration
            r2 = 0
            if (r1 == 0) goto L_0x0087
            com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration r5 = (com.google.ads.interactivemedia.p039v3.impl.data.TestingConfiguration) r5
            boolean r1 = r4.disableExperiments
            boolean r3 = r5.disableExperiments()
            if (r1 != r3) goto L_0x0087
            boolean r1 = r4.disableOnScreenDetection
            boolean r3 = r5.disableOnScreenDetection()
            if (r1 != r3) goto L_0x0087
            boolean r1 = r4.disableSkipFadeTransition
            boolean r3 = r5.disableSkipFadeTransition()
            if (r1 != r3) goto L_0x0087
            com.google.ads.interactivemedia.v3.internal.atz<java.lang.Integer> r1 = r4.forceExperimentIds
            if (r1 != 0) goto L_0x002e
            com.google.ads.interactivemedia.v3.internal.atz r1 = r5.forceExperimentIds()
            if (r1 != 0) goto L_0x0087
            goto L_0x0038
        L_0x002e:
            com.google.ads.interactivemedia.v3.internal.atz r3 = r5.forceExperimentIds()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0087
        L_0x0038:
            boolean r1 = r4.useVideoElementMock
            boolean r3 = r5.useVideoElementMock()
            if (r1 != r3) goto L_0x0087
            float r1 = r4.videoElementMockDuration
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.videoElementMockDuration()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x0087
            boolean r1 = r4.useTestStreamManager
            boolean r3 = r5.useTestStreamManager()
            if (r1 != r3) goto L_0x0087
            boolean r1 = r4.enableMonitorAppLifecycle
            boolean r3 = r5.enableMonitorAppLifecycle()
            if (r1 != r3) goto L_0x0087
            boolean r1 = r4.forceTvMode
            boolean r3 = r5.forceTvMode()
            if (r1 != r3) goto L_0x0087
            boolean r1 = r4.ignoreStrictModeFalsePositives
            boolean r3 = r5.ignoreStrictModeFalsePositives()
            if (r1 != r3) goto L_0x0087
            com.google.ads.interactivemedia.v3.internal.aue<java.lang.String, java.lang.Object> r1 = r4.extraParams
            if (r1 != 0) goto L_0x007b
            com.google.ads.interactivemedia.v3.internal.aue r5 = r5.extraParams()
            if (r5 != 0) goto L_0x0087
            goto L_0x0086
        L_0x007b:
            com.google.ads.interactivemedia.v3.internal.aue r5 = r5.extraParams()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            return r0
        L_0x0087:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.impl.data.C3772al.equals(java.lang.Object):boolean");
    }

    public aue<String, Object> extraParams() {
        return this.extraParams;
    }

    public atz<Integer> forceExperimentIds() {
        return this.forceExperimentIds;
    }

    public boolean forceTvMode() {
        return this.forceTvMode;
    }

    public int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.disableExperiments ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.disableOnScreenDetection ? 1237 : 1231)) * 1000003) ^ (true != this.disableSkipFadeTransition ? 1237 : 1231)) * 1000003;
        atz<Integer> atz = this.forceExperimentIds;
        int i3 = 0;
        int hashCode = (((((((((((i2 ^ (atz == null ? 0 : atz.hashCode())) * 1000003) ^ (true != this.useVideoElementMock ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.videoElementMockDuration)) * 1000003) ^ (true != this.useTestStreamManager ? 1237 : 1231)) * 1000003) ^ (true != this.enableMonitorAppLifecycle ? 1237 : 1231)) * 1000003) ^ (true != this.forceTvMode ? 1237 : 1231)) * 1000003;
        if (true == this.ignoreStrictModeFalsePositives) {
            i = 1231;
        }
        int i4 = (hashCode ^ i) * 1000003;
        aue<String, Object> aue = this.extraParams;
        if (aue != null) {
            i3 = aue.hashCode();
        }
        return i4 ^ i3;
    }

    public boolean ignoreStrictModeFalsePositives() {
        return this.ignoreStrictModeFalsePositives;
    }

    public String toString() {
        boolean z = this.disableExperiments;
        boolean z2 = this.disableOnScreenDetection;
        boolean z3 = this.disableSkipFadeTransition;
        String valueOf = String.valueOf(this.forceExperimentIds);
        boolean z4 = this.useVideoElementMock;
        float f = this.videoElementMockDuration;
        boolean z5 = this.useTestStreamManager;
        boolean z6 = this.enableMonitorAppLifecycle;
        boolean z7 = this.forceTvMode;
        boolean z8 = this.ignoreStrictModeFalsePositives;
        String valueOf2 = String.valueOf(this.extraParams);
        StringBuilder sb = new StringBuilder(valueOf.length() + 333 + valueOf2.length());
        sb.append("TestingConfiguration{disableExperiments=");
        sb.append(z);
        sb.append(", disableOnScreenDetection=");
        sb.append(z2);
        sb.append(", disableSkipFadeTransition=");
        sb.append(z3);
        sb.append(", forceExperimentIds=");
        sb.append(valueOf);
        sb.append(", useVideoElementMock=");
        sb.append(z4);
        sb.append(", videoElementMockDuration=");
        sb.append(f);
        sb.append(", useTestStreamManager=");
        sb.append(z5);
        sb.append(", enableMonitorAppLifecycle=");
        sb.append(z6);
        sb.append(", forceTvMode=");
        sb.append(z7);
        sb.append(", ignoreStrictModeFalsePositives=");
        sb.append(z8);
        sb.append(", extraParams=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public boolean useTestStreamManager() {
        return this.useTestStreamManager;
    }

    public boolean useVideoElementMock() {
        return this.useVideoElementMock;
    }

    public float videoElementMockDuration() {
        return this.videoElementMockDuration;
    }
}
