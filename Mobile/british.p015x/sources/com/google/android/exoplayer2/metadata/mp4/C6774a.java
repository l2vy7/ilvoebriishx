package com.google.android.exoplayer2.metadata.mp4;

import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.common.collect.C4742n;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.metadata.mp4.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6774a implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C6774a f27477b = new C6774a();

    private /* synthetic */ C6774a() {
    }

    public final int compare(Object obj, Object obj2) {
        return C4742n.m21868j().mo19772e(((SlowMotionData.Segment) obj).startTimeMs, ((SlowMotionData.Segment) obj2).startTimeMs).mo19772e(((SlowMotionData.Segment) obj).endTimeMs, ((SlowMotionData.Segment) obj2).endTimeMs).mo19771d(((SlowMotionData.Segment) obj).speedDivisor, ((SlowMotionData.Segment) obj2).speedDivisor).mo19776i();
    }
}
