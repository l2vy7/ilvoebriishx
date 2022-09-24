package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.scheduler.RequirementsWatcher;

/* renamed from: com.google.android.exoplayer2.offline.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6801k implements RequirementsWatcher.Listener {

    /* renamed from: a */
    public final /* synthetic */ DownloadManager f27496a;

    public /* synthetic */ C6801k(DownloadManager downloadManager) {
        this.f27496a = downloadManager;
    }

    public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        this.f27496a.onRequirementsStateChanged(requirementsWatcher, i);
    }
}
