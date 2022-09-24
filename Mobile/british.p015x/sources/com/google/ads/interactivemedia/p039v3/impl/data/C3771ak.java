package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.aue;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ak */
/* compiled from: IMASDK */
final class C3771ak implements TestingConfiguration.Builder {
    private Boolean disableExperiments;
    private Boolean disableOnScreenDetection;
    private Boolean disableSkipFadeTransition;
    private Boolean enableMonitorAppLifecycle;
    private aue<String, Object> extraParams;
    private atz<Integer> forceExperimentIds;
    private Boolean forceTvMode;
    private Boolean ignoreStrictModeFalsePositives;
    private Boolean useTestStreamManager;
    private Boolean useVideoElementMock;
    private Float videoElementMockDuration;

    C3771ak() {
    }

    public TestingConfiguration build() {
        String str;
        String str2 = "";
        if (this.disableExperiments == null) {
            str2 = str2.concat(" disableExperiments");
        }
        if (this.disableOnScreenDetection == null) {
            str2 = String.valueOf(str2).concat(" disableOnScreenDetection");
        }
        if (this.disableSkipFadeTransition == null) {
            str2 = String.valueOf(str2).concat(" disableSkipFadeTransition");
        }
        if (this.useVideoElementMock == null) {
            str2 = String.valueOf(str2).concat(" useVideoElementMock");
        }
        if (this.videoElementMockDuration == null) {
            str2 = String.valueOf(str2).concat(" videoElementMockDuration");
        }
        if (this.useTestStreamManager == null) {
            str2 = String.valueOf(str2).concat(" useTestStreamManager");
        }
        if (this.enableMonitorAppLifecycle == null) {
            str2 = String.valueOf(str2).concat(" enableMonitorAppLifecycle");
        }
        if (this.forceTvMode == null) {
            str2 = String.valueOf(str2).concat(" forceTvMode");
        }
        if (this.ignoreStrictModeFalsePositives == null) {
            str2 = String.valueOf(str2).concat(" ignoreStrictModeFalsePositives");
        }
        if (str2.isEmpty()) {
            return new C3772al(this.disableExperiments.booleanValue(), this.disableOnScreenDetection.booleanValue(), this.disableSkipFadeTransition.booleanValue(), this.forceExperimentIds, this.useVideoElementMock.booleanValue(), this.videoElementMockDuration.floatValue(), this.useTestStreamManager.booleanValue(), this.enableMonitorAppLifecycle.booleanValue(), this.forceTvMode.booleanValue(), this.ignoreStrictModeFalsePositives.booleanValue(), this.extraParams);
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    public TestingConfiguration.Builder disableExperiments(boolean z) {
        this.disableExperiments = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder disableOnScreenDetection(boolean z) {
        this.disableOnScreenDetection = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder disableSkipFadeTransition(boolean z) {
        this.disableSkipFadeTransition = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder enableMonitorAppLifecycle(boolean z) {
        this.enableMonitorAppLifecycle = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder extraParams(aue<String, Object> aue) {
        this.extraParams = aue;
        return this;
    }

    public TestingConfiguration.Builder forceExperimentIds(atz<Integer> atz) {
        this.forceExperimentIds = atz;
        return this;
    }

    public TestingConfiguration.Builder forceTvMode(boolean z) {
        this.forceTvMode = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder ignoreStrictModeFalsePositives(boolean z) {
        this.ignoreStrictModeFalsePositives = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder useTestStreamManager(boolean z) {
        this.useTestStreamManager = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder useVideoElementMock(boolean z) {
        this.useVideoElementMock = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder videoElementMockDuration(float f) {
        this.videoElementMockDuration = Float.valueOf(f);
        return this;
    }
}
