package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;

/* renamed from: com.google.android.exoplayer2.drm.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6662g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DefaultDrmSessionManager.PreacquiredSessionReference f27379b;

    /* renamed from: c */
    public final /* synthetic */ Format f27380c;

    public /* synthetic */ C6662g(DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference, Format format) {
        this.f27379b = preacquiredSessionReference;
        this.f27380c = format;
    }

    public final void run() {
        this.f27379b.lambda$acquire$0(this.f27380c);
    }
}
