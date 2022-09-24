package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadService;

/* renamed from: com.google.android.exoplayer2.offline.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6805o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DownloadService.ForegroundNotificationUpdater f27500b;

    public /* synthetic */ C6805o(DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater) {
        this.f27500b = foregroundNotificationUpdater;
    }

    public final void run() {
        this.f27500b.update();
    }
}
