package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.SlidingPercentile;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.util.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7013d implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C7013d f27675b = new C7013d();

    private /* synthetic */ C7013d() {
    }

    public final int compare(Object obj, Object obj2) {
        return SlidingPercentile.lambda$static$0((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
    }
}
