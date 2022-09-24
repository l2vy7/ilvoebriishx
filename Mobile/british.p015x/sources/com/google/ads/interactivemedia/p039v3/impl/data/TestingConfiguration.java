package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.internal.ark;
import com.google.ads.interactivemedia.p039v3.internal.atz;
import com.google.ads.interactivemedia.p039v3.internal.aue;

@ark(mo14242a = C3772al.class, mo14243b = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration */
/* compiled from: IMASDK */
public abstract class TestingConfiguration {
    public static final String PARAMETER_KEY = "tcnfp";

    /* renamed from: com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration$Builder */
    /* compiled from: IMASDK */
    public interface Builder {
        TestingConfiguration build();

        Builder disableExperiments(boolean z);

        Builder disableOnScreenDetection(boolean z);

        Builder disableSkipFadeTransition(boolean z);

        Builder enableMonitorAppLifecycle(boolean z);

        Builder extraParams(aue<String, Object> aue);

        Builder forceExperimentIds(atz<Integer> atz);

        Builder forceTvMode(boolean z);

        Builder ignoreStrictModeFalsePositives(boolean z);

        Builder useTestStreamManager(boolean z);

        Builder useVideoElementMock(boolean z);

        Builder videoElementMockDuration(float f);
    }

    TestingConfiguration() {
    }

    public static Builder builder() {
        C3771ak akVar = new C3771ak();
        akVar.disableExperiments(true);
        akVar.disableOnScreenDetection(false);
        akVar.disableSkipFadeTransition(true);
        akVar.useVideoElementMock(false);
        akVar.videoElementMockDuration(30.0f);
        akVar.useTestStreamManager(false);
        akVar.ignoreStrictModeFalsePositives(false);
        akVar.forceTvMode(false);
        akVar.forceExperimentIds((atz<Integer>) null);
        akVar.enableMonitorAppLifecycle(true);
        return akVar;
    }

    public Builder copy() {
        C3771ak akVar = new C3771ak();
        akVar.disableExperiments(disableExperiments());
        akVar.disableOnScreenDetection(disableOnScreenDetection());
        akVar.disableSkipFadeTransition(disableSkipFadeTransition());
        akVar.useVideoElementMock(useVideoElementMock());
        akVar.videoElementMockDuration(videoElementMockDuration());
        akVar.useTestStreamManager(useTestStreamManager());
        akVar.forceExperimentIds(forceExperimentIds());
        akVar.enableMonitorAppLifecycle(enableMonitorAppLifecycle());
        akVar.forceTvMode(forceTvMode());
        akVar.ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives());
        akVar.extraParams(extraParams());
        return akVar;
    }

    public abstract boolean disableExperiments();

    public abstract boolean disableOnScreenDetection();

    public abstract boolean disableSkipFadeTransition();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract aue<String, Object> extraParams();

    public abstract atz<Integer> forceExperimentIds();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();

    public abstract boolean useTestStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();
}
