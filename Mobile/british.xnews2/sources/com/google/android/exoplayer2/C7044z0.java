package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Timeline;

/* renamed from: com.google.android.exoplayer2.z0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7044z0 implements Bundleable.Creator {

    /* renamed from: a */
    public static final /* synthetic */ C7044z0 f27721a = new C7044z0();

    private /* synthetic */ C7044z0() {
    }

    public final Bundleable fromBundle(Bundle bundle) {
        return Timeline.Period.fromBundle(bundle);
    }
}
