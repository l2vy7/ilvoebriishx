package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.drm.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6678w implements ExoMediaDrm.Provider {

    /* renamed from: a */
    public static final /* synthetic */ C6678w f27403a = new C6678w();

    private /* synthetic */ C6678w() {
    }

    public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        return FrameworkMediaDrm.lambda$static$0(uuid);
    }
}
