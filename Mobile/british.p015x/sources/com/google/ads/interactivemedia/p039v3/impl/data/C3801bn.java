package com.google.ads.interactivemedia.p039v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bn */
/* compiled from: IMASDK */
public abstract class C3801bn {
    public abstract C3802bo build();

    public abstract C3801bn volume(float f);

    public C3801bn volumePercentage(int i) {
        return volume(((float) i) / 100.0f);
    }
}
