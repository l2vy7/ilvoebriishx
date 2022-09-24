package com.google.ads.interactivemedia.p039v3.impl.data;

import android.view.View;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.aq */
/* compiled from: IMASDK */
public abstract class C3777aq {
    public abstract C3778ar build();

    public abstract C3777aq height(int i);

    public abstract C3777aq left(int i);

    public C3777aq locationOnScreenOfView(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return left(iArr[0]).top(iArr[1]).height(view.getHeight()).width(view.getWidth());
    }

    public abstract C3777aq top(int i);

    public abstract C3777aq width(int i);
}
