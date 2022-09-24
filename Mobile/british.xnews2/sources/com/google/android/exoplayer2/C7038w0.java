package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.w0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7038w0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ StreamVolumeManager f27714b;

    public /* synthetic */ C7038w0(StreamVolumeManager streamVolumeManager) {
        this.f27714b = streamVolumeManager;
    }

    public final void run() {
        this.f27714b.updateVolumeAndNotifyIfChanged();
    }
}
