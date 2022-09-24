package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.SlidingPercentile;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.util.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7014e implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C7014e f27676b = new C7014e();

    private /* synthetic */ C7014e() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((SlidingPercentile.Sample) obj).value, ((SlidingPercentile.Sample) obj2).value);
    }
}
