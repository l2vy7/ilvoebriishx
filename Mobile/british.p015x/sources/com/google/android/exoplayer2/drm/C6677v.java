package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.drm.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6677v implements MediaDrm.OnKeyStatusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FrameworkMediaDrm f27401a;

    /* renamed from: b */
    public final /* synthetic */ ExoMediaDrm.OnKeyStatusChangeListener f27402b;

    public /* synthetic */ C6677v(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        this.f27401a = frameworkMediaDrm;
        this.f27402b = onKeyStatusChangeListener;
    }

    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        this.f27401a.lambda$setOnKeyStatusChangeListener$2(this.f27402b, mediaDrm, bArr, list, z);
    }
}
