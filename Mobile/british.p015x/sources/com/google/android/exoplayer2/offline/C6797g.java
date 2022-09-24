package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadHelper;

/* renamed from: com.google.android.exoplayer2.offline.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6797g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DownloadHelper f27490b;

    /* renamed from: c */
    public final /* synthetic */ DownloadHelper.Callback f27491c;

    public /* synthetic */ C6797g(DownloadHelper downloadHelper, DownloadHelper.Callback callback) {
        this.f27490b = downloadHelper;
        this.f27491c = callback;
    }

    public final void run() {
        this.f27490b.lambda$prepare$3(this.f27491c);
    }
}
