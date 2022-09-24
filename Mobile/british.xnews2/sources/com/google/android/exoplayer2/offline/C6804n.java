package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadService;

/* renamed from: com.google.android.exoplayer2.offline.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6804n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DownloadService.DownloadManagerHelper f27498b;

    /* renamed from: c */
    public final /* synthetic */ DownloadService f27499c;

    public /* synthetic */ C6804n(DownloadService.DownloadManagerHelper downloadManagerHelper, DownloadService downloadService) {
        this.f27498b = downloadManagerHelper;
        this.f27499c = downloadService;
    }

    public final void run() {
        this.f27498b.lambda$attachService$0(this.f27499c);
    }
}
